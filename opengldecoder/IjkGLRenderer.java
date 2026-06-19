package com.bilibili.opengldecoder;

import C0.d;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.GLUtils;
import android.util.Log;
import com.bilibili.opengldecoder.GLDecoderRunnable;
import com.bilibili.opengldecoder.utils.ShaderHelper;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opengldecoder/IjkGLRenderer.class */
public class IjkGLRenderer implements GLSurfaceView.Renderer {
    private static final String TAG = "IjkGLRenderer";
    private ShortBuffer drawListBuffer;
    private int height;
    private Context mContext;
    private GLDecoderRunnable.DecoderRunnableListener mSurfaceListener;
    private SurfaceTexture mVideoTexture;
    private int positionHandle;
    private int shaderProgram;
    private FloatBuffer textureBuffer;
    private int textureCoordinateHandle;
    private int textureParamHandle;
    private int textureTranformHandle;
    private FloatBuffer vertexBuffer;
    private int width;
    private static short[] drawOrder = {0, 1, 2, 0, 2, 3};
    private static float squareSize = 1.0f;
    private static float[] squareCoords = {-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f};
    private float[] videoTextureTransform = new float[16];
    private float[] textureCoords = {0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    private int[] textures = new int[1];
    private volatile boolean frameAvailable = false;

    public IjkGLRenderer(Context context, GLDecoderRunnable.DecoderRunnableListener decoderRunnableListener) {
        this.mContext = context;
        this.mSurfaceListener = decoderRunnableListener;
    }

    private void checkGlError(String str) {
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                return;
            }
            StringBuilder sbA = d.a(str, ": glError ");
            sbA.append(GLUtils.getEGLErrorString(iGlGetError));
            Log.e(TAG, sbA.toString());
        }
    }

    private void drawTexture() {
        GLES20.glEnableVertexAttribArray(this.positionHandle);
        GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 0, (Buffer) this.vertexBuffer);
        GLES20.glBindTexture(36197, this.textures[0]);
        GLES20.glActiveTexture(33984);
        GLES20.glUniform1i(this.textureParamHandle, 0);
        GLES20.glEnableVertexAttribArray(this.textureCoordinateHandle);
        GLES20.glVertexAttribPointer(this.textureCoordinateHandle, 4, 5126, false, 0, (Buffer) this.textureBuffer);
        GLES20.glUniformMatrix4fv(this.textureTranformHandle, 1, false, this.videoTextureTransform, 0);
        GLES20.glDrawElements(5, drawOrder.length, 5123, this.drawListBuffer);
        GLES20.glDisableVertexAttribArray(this.positionHandle);
        GLES20.glDisableVertexAttribArray(this.textureCoordinateHandle);
    }

    private int setupGraphics() {
        int iCompileShader = ShaderHelper.compileShader(35633, ShaderHelper.VERTEX_SHADER);
        int iCompileShader2 = ShaderHelper.compileShader(35632, ShaderHelper.FRAGMENT_SHADER);
        if (iCompileShader <= 0 || iCompileShader2 <= 0) {
            Log.e(TAG, "compileShader fail");
            return -1;
        }
        int iCreateAndLinkProgram = ShaderHelper.createAndLinkProgram(iCompileShader, iCompileShader2, new String[]{"texture", "vPosition", "vTexCoordinate", "textureTransform"});
        this.shaderProgram = iCreateAndLinkProgram;
        GLES20.glUseProgram(iCreateAndLinkProgram);
        this.textureParamHandle = GLES20.glGetUniformLocation(this.shaderProgram, "texture");
        this.textureCoordinateHandle = GLES20.glGetAttribLocation(this.shaderProgram, "vTexCoordinate");
        this.positionHandle = GLES20.glGetAttribLocation(this.shaderProgram, "vPosition");
        this.textureTranformHandle = GLES20.glGetUniformLocation(this.shaderProgram, "textureTransform");
        return 0;
    }

    private void setupTexture() {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(this.textureCoords.length * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        this.textureBuffer = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(this.textureCoords);
        this.textureBuffer.position(0);
        GLES20.glActiveTexture(33984);
        GLES20.glGenTextures(1, this.textures, 0);
        checkGlError("Texture generate");
        GLES20.glBindTexture(36197, this.textures[0]);
        checkGlError("Texture bind");
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.textures[0]);
        this.mVideoTexture = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener(this) { // from class: com.bilibili.opengldecoder.IjkGLRenderer.1
            final IjkGLRenderer this$0;

            {
                this.this$0 = this;
            }

            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                synchronized (this.this$0) {
                    this.this$0.frameAvailable = true;
                }
            }
        });
    }

    private void setupVertexBuffer() {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(drawOrder.length * 2);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        ShortBuffer shortBufferAsShortBuffer = byteBufferAllocateDirect.asShortBuffer();
        this.drawListBuffer = shortBufferAsShortBuffer;
        shortBufferAsShortBuffer.put(drawOrder);
        this.drawListBuffer.position(0);
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(squareCoords.length * 4);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect2.asFloatBuffer();
        this.vertexBuffer = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(squareCoords);
        this.vertexBuffer.position(0);
    }

    public SurfaceTexture getVideoSurfaceTexture() {
        return this.mVideoTexture;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        if (this.textures[0] <= 0) {
            return;
        }
        synchronized (this) {
            if (this.frameAvailable) {
                this.mVideoTexture.updateTexImage();
                this.mVideoTexture.getTransformMatrix(this.videoTextureTransform);
                this.frameAvailable = false;
            }
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16384);
        GLES20.glViewport(0, 0, this.width, this.height);
        drawTexture();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i7, int i8) {
        this.width = i7;
        this.height = i8;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        if (setupGraphics() < 0) {
            Log.e(TAG, "setupGraphics fail");
            return;
        }
        setupVertexBuffer();
        setupTexture();
        this.mSurfaceListener.onSurfaceCreated();
    }
}
