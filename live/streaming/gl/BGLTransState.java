package com.bilibili.live.streaming.gl;

import com.bilibili.live.streaming.log.LivePusherLog;
import java.util.LinkedList;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/gl/BGLTransState.class */
public class BGLTransState {
    private static final String TAG = "BGLTransState";
    private LinkedList<Float> mAlphaStack;
    private LinkedList<float[]> mScissorStack;
    private LinkedList<BGLMatrix> mUVPreMatrixStack;
    private LinkedList<BGLMatrix> mVPreMatrixStack;

    public BGLTransState() {
        LinkedList<Float> linkedList = new LinkedList<>();
        this.mAlphaStack = linkedList;
        linkedList.addFirst(Float.valueOf(1.0f));
        LinkedList<BGLMatrix> linkedList2 = new LinkedList<>();
        this.mVPreMatrixStack = linkedList2;
        linkedList2.addFirst(BGLMatrix.create());
        LinkedList<BGLMatrix> linkedList3 = new LinkedList<>();
        this.mUVPreMatrixStack = linkedList3;
        linkedList3.addFirst(BGLMatrix.create());
        this.mScissorStack = new LinkedList<>();
    }

    public float[] getScissor() {
        if (this.mScissorStack.isEmpty()) {
            return null;
        }
        return this.mScissorStack.getFirst();
    }

    public BGLMatrix getUVTrans() {
        return this.mUVPreMatrixStack.getFirst().clone();
    }

    public BGLMatrix getVTrans() {
        return this.mVPreMatrixStack.getFirst().clone();
    }

    public void popAlphaRatio() {
        this.mAlphaStack.removeFirst();
    }

    public void popScissor() {
        this.mScissorStack.removeFirst();
    }

    public void popUVPreTrans() {
        try {
            this.mUVPreMatrixStack.removeFirst();
        } catch (NoSuchElementException e7) {
            LivePusherLog.w(TAG, "popUVPreTrans exception: " + e7.getMessage(), e7);
        }
    }

    public void popVPreTrans() {
        this.mVPreMatrixStack.removeFirst();
    }

    public void pushAlphaRatio(float f7) {
        this.mAlphaStack.addFirst(Float.valueOf(this.mAlphaStack.getFirst().floatValue() * f7));
    }

    public void pushScissor(float[] fArr) {
        BGLMatrix bGLMatrixCreate = BGLMatrix.create();
        bGLMatrixCreate.set(0, 0, fArr[0]);
        bGLMatrixCreate.set(0, 1, fArr[2]);
        bGLMatrixCreate.set(0, 2, 0.0f);
        bGLMatrixCreate.set(0, 3, 1.0f);
        bGLMatrixCreate.set(1, 0, fArr[1]);
        bGLMatrixCreate.set(1, 1, fArr[3]);
        bGLMatrixCreate.set(1, 2, 0.0f);
        bGLMatrixCreate.set(1, 3, 1.0f);
        BGLMatrix vTrans = getVTrans();
        BGLMatrix bGLMatrixMultiply = bGLMatrixCreate.multiply(vTrans);
        vTrans.release();
        float fMin = Math.min(bGLMatrixMultiply.get(0, 0), bGLMatrixMultiply.get(1, 0));
        float fMax = Math.max(bGLMatrixMultiply.get(0, 0), bGLMatrixMultiply.get(1, 0));
        float fMin2 = Math.min(bGLMatrixMultiply.get(0, 1), bGLMatrixMultiply.get(1, 1));
        float fMax2 = Math.max(bGLMatrixMultiply.get(0, 1), bGLMatrixMultiply.get(1, 1));
        if (this.mScissorStack.isEmpty()) {
            this.mScissorStack.addFirst(new float[]{fMin, fMax, fMin2, fMax2});
        } else {
            float[] first = this.mScissorStack.getFirst();
            this.mScissorStack.addFirst(new float[]{Math.max(fMin, first[0]), Math.min(fMax, first[1]), Math.max(fMin2, first[2]), Math.min(fMax2, first[3])});
        }
        bGLMatrixMultiply.release();
    }

    public void pushUVPreTrans(BGLMatrix bGLMatrix) {
        this.mUVPreMatrixStack.addFirst(bGLMatrix.clone().multiply(this.mUVPreMatrixStack.getFirst()));
    }

    public void pushVPreTrans(BGLMatrix bGLMatrix) {
        this.mVPreMatrixStack.addFirst(bGLMatrix.clone().multiply(this.mVPreMatrixStack.getFirst()));
    }

    public float translateAlpha(float f7) {
        return this.mAlphaStack.getFirst().floatValue() * f7;
    }
}
