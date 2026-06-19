package com.bilibili.opengldecoder;

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
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opengldecoder/GL2DDecoderRunnable.class */
public class GL2DDecoderRunnable extends GLDecoderRunnable {
    private static final String TAG = "GL2DDecoderRunnable";
    private static short[] drawOrder = {0, 1, 2, 0, 2, 3};
    private static float[] squareCoords = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
    private ShortBuffer drawListBuffer;
    protected int[] mFrameBufferTextureIds;
    protected int[] mFrameBuffers;
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

    public GL2DDecoderRunnable(SurfaceTexture surfaceTexture, int i7, int i8, GLDecoderRunnable.DecoderRunnableListener decoderRunnableListener) {
        super(surfaceTexture, i7, i8, decoderRunnableListener);
        this.videoTextureTransform = new float[16];
        this.textureCoords = new float[]{0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f};
        this.textures = new int[1];
    }

    public GL2DDecoderRunnable(Surface surface, int i7, int i8, GLDecoderRunnable.DecoderRunnableListener decoderRunnableListener) {
        super(surface, i7, i8, decoderRunnableListener);
        this.videoTextureTransform = new float[16];
        this.textureCoords = new float[]{0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f};
        this.textures = new int[1];
    }

    public GL2DDecoderRunnable(EGLContext eGLContext, int i7, int i8, int i9, GLDecoderRunnable.DecoderRunnableListener decoderRunnableListener) {
        super(eGLContext, i7, i8, i9, decoderRunnableListener);
        this.videoTextureTransform = new float[16];
        this.textureCoords = new float[]{0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f};
        this.textures = new int[1];
    }

    public GL2DDecoderRunnable(EGLContext eGLContext, int i7, int i8, GLDecoderRunnable.DecoderRunnableListener decoderRunnableListener) {
        super(eGLContext, i7, i8, decoderRunnableListener);
        this.videoTextureTransform = new float[16];
        this.textureCoords = new float[]{0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f};
        this.textures = new int[1];
    }

    private void destroyFrameBuffers() {
        int[] iArr = this.mFrameBufferTextureIds;
        if (iArr != null) {
            GLES20.glDeleteTextures(iArr.length, iArr, 0);
            this.mFrameBufferTextureIds = null;
        }
        int[] iArr2 = this.mFrameBuffers;
        if (iArr2 != null) {
            GLES20.glDeleteFramebuffers(iArr2.length, iArr2, 0);
            this.mFrameBuffers = null;
        }
    }

    private void drawTexture() {
        GLES20.glBindFramebuffer(36160, this.mFrameBuffers[0]);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16384);
        GLES20.glViewport(0, 0, this.width, this.height);
        GLES20.glEnableVertexAttribArray(this.positionHandle);
        GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 0, (Buffer) this.vertexBuffer);
        GLES20.glEnableVertexAttribArray(this.textureCoordinateHandle);
        GLES20.glVertexAttribPointer(this.textureCoordinateHandle, 4, 5126, false, 0, (Buffer) this.textureBuffer);
        GLES20.glUniformMatrix4fv(this.textureTranformHandle, 1, false, this.videoTextureTransform, 0);
        GLES20.glBindTexture(36197, this.textures[0]);
        GLES20.glActiveTexture(33984);
        GLES20.glUniform1i(this.textureParamHandle, 0);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(this.positionHandle);
        GLES20.glDisableVertexAttribArray(this.textureCoordinateHandle);
        GLES20.glBindFramebuffer(36160, 0);
    }

    private void generateFrameBuffers(int i7, int i8) {
        int[] iArr = new int[1];
        this.mFrameBuffers = iArr;
        GLES20.glGenFramebuffers(iArr.length, iArr, 0);
        int[] iArr2 = new int[1];
        this.mFrameBufferTextureIds = iArr2;
        GLES20.glGenTextures(this.textures.length, iArr2, 0);
        GLES20.glBindTexture(3553, this.mFrameBufferTextureIds[0]);
        GLES20.glTexParameteri(3553, 10240, 9728);
        GLES20.glTexParameteri(3553, 10241, 9728);
        GLES20.glTexParameteri(3553, 10242, 10497);
        GLES20.glTexParameteri(3553, 10243, 10497);
        GLES20.glTexImage2D(3553, 0, 6408, i7, i8, 0, 6408, 5121, null);
        GLES20.glBindFramebuffer(36160, this.mFrameBuffers[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.mFrameBufferTextureIds[0], 0);
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glBindTexture(3553, 0);
    }

    private int setupGraphics() {
        int iCompileShader = ShaderHelper.compileShader(35633, "attribute vec4 vPosition;\nattribute vec4 vTexCoordinate;\nuniform mat4 textureTransform;\nvarying vec2 v_TexCoordinate;\n\nvoid main () {\n    v_TexCoordinate = (textureTransform * vTexCoordinate).xy;\n    gl_Position = vPosition;\n}");
        int iCompileShader2 = ShaderHelper.compileShader(35632, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES texture;\nvarying vec2 v_TexCoordinate;\n\nvoid main () {\n    vec4 color = texture2D(texture, v_TexCoordinate);\n    gl_FragColor = color;\n}");
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
        this.mSurfaceFrameListener = new SurfaceTexture.OnFrameAvailableListener(this) { // from class: com.bilibili.opengldecoder.GL2DDecoderRunnable.1
            final GL2DDecoderRunnable this$0;

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
        destroyFrameBuffers();
    }

    @Override // com.bilibili.opengldecoder.GLDecoderRunnable
    public boolean draw() {
        synchronized (this) {
            if (!this.frameAvailable || this.eglContext == EGL10.EGL_NO_CONTEXT) {
                return false;
            }
            this.mVideoTexture.updateTexImage();
            this.mVideoTexture.getTransformMatrix(this.videoTextureTransform);
            this.frameAvailable = false;
            drawTexture();
            return true;
        }
    }

    @Override // com.bilibili.opengldecoder.GLDecoderRunnable
    public int getTextureId() {
        int[] iArr = this.mFrameBufferTextureIds;
        if (iArr == null) {
            return 0;
        }
        return iArr[0];
    }

    @Override // com.bilibili.opengldecoder.GLDecoderRunnable
    public void initGLComponents() {
        setupVertexBuffer();
        setupTexture();
        if (setupGraphics() < 0) {
            this.running = false;
        } else {
            generateFrameBuffers(this.width, this.height);
        }
    }
}
