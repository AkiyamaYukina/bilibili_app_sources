package com.bilibili.opengldecoder;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.util.Log;
import android.view.Surface;
import com.bilibili.opengldecoder.GLDecoderRunnable;
import com.bilibili.opengldecoder.utils.ShaderHelper;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import javax.microedition.khronos.egl.EGLContext;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opengldecoder/GLDrawerRunnable.class */
public class GLDrawerRunnable extends GLDecoderRunnable {
    private static final String TAG = "GLDrawerRunnable";
    private ShortBuffer drawListBuffer;
    private Context mContext;
    private int positionHandle;
    private int shaderProgram;
    private FloatBuffer textureBuffer;
    private int textureCoordinateHandle;
    private float[] textureCoords;
    private int textureParamHandle;
    private int textureTranformHandle;
    private int[] textures;
    private FloatBuffer vertexBuffer;
    private float[] videoTextureTransform;
    private static short[] drawOrder = {0, 1, 2, 0, 2, 3};
    private static float squareSize = 1.0f;
    private static float[] squareCoords = {-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f};

    public GLDrawerRunnable(Context context, SurfaceTexture surfaceTexture, int i7, int i8, GLDecoderRunnable.DecoderRunnableListener decoderRunnableListener) {
        super(surfaceTexture, i7, i8, decoderRunnableListener);
        this.videoTextureTransform = new float[16];
        this.textureCoords = new float[]{0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};
        this.textures = new int[1];
        this.mContext = context;
    }

    public GLDrawerRunnable(Context context, Surface surface, int i7, int i8, GLDecoderRunnable.DecoderRunnableListener decoderRunnableListener) {
        super(surface, i7, i8, decoderRunnableListener);
        this.videoTextureTransform = new float[16];
        this.textureCoords = new float[]{0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};
        this.textures = new int[1];
        this.mContext = context;
    }

    public GLDrawerRunnable(Context context, EGLContext eGLContext, int i7, int i8, GLDecoderRunnable.DecoderRunnableListener decoderRunnableListener) {
        super(eGLContext, i7, i8, decoderRunnableListener);
        this.videoTextureTransform = new float[16];
        this.textureCoords = new float[]{0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};
        this.textures = new int[1];
        this.mContext = context;
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
            Log.e(TAG, "setupGraphics fail");
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
        this.mSurfaceFrameListener = new SurfaceTexture.OnFrameAvailableListener(this) { // from class: com.bilibili.opengldecoder.GLDrawerRunnable.1
            final GLDrawerRunnable this$0;

            {
                this.this$0 = this;
            }

            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public void onFrameAvailable(SurfaceTexture surfaceTexture) {
                synchronized (this.this$0) {
                    this.this$0.frameAvailable = true;
                    GLDecoderRunnable.DecoderRunnableListener decoderRunnableListener = this.this$0.mSurfaceListener;
                    if (decoderRunnableListener != null) {
                        decoderRunnableListener.onFrameAvailable(surfaceTexture);
                    }
                }
            }
        };
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.textures[0]);
        this.mVideoTexture = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this.mSurfaceFrameListener);
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

    @Override // com.bilibili.opengldecoder.GLDecoderRunnable
    public void deinitGLComponents() {
        GLES20.glDeleteTextures(1, this.textures, 0);
        GLES20.glDeleteProgram(this.shaderProgram);
        this.mVideoTexture.release();
        this.mVideoTexture.setOnFrameAvailableListener(null);
    }

    @Override // com.bilibili.opengldecoder.GLDecoderRunnable
    public boolean draw() {
        synchronized (this) {
            if (!this.frameAvailable) {
                return false;
            }
            this.mVideoTexture.updateTexImage();
            this.mVideoTexture.getTransformMatrix(this.videoTextureTransform);
            this.frameAvailable = false;
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
            GLES20.glViewport(0, 0, this.width, this.height);
            drawTexture();
            return true;
        }
    }

    @Override // com.bilibili.opengldecoder.GLDecoderRunnable
    public void initGLComponents() {
        setupVertexBuffer();
        setupTexture();
        if (setupGraphics() < 0) {
            this.running = false;
        }
    }
}
