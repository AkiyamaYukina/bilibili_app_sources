package com.bilibili.playerbizcommon.gesture;

import Aq0.A;
import Aq0.B;
import Aq0.C;
import Aq0.F;
import Aq0.I;
import android.graphics.Rect;
import android.view.MotionEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.panel.IPlayerLayer;
import tv.danmaku.biliplayerv2.service.IPlayerService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/gesture/IGestureService.class */
public interface IGestureService extends IPlayerService {
    static /* synthetic */ void addOnDoubleTapListener$default(IGestureService iGestureService, OnDoubleTapListener onDoubleTapListener, int i7, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addOnDoubleTapListener");
        }
        if ((i8 & 2) != 0) {
            i7 = 2;
        }
        iGestureService.addOnDoubleTapListener(onDoubleTapListener, i7);
    }

    static /* synthetic */ void addOnDownListener$default(IGestureService iGestureService, OnDownListener onDownListener, int i7, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addOnDownListener");
        }
        if ((i8 & 2) != 0) {
            i7 = 2;
        }
        iGestureService.addOnDownListener(onDownListener, i7);
    }

    static /* synthetic */ void addOnLongPressListener$default(IGestureService iGestureService, OnLongPressListener onLongPressListener, int i7, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addOnLongPressListener");
        }
        if ((i8 & 2) != 0) {
            i7 = 2;
        }
        iGestureService.addOnLongPressListener(onLongPressListener, i7);
    }

    static /* synthetic */ void addOnLongPressScrollListener$default(IGestureService iGestureService, A a7, int i7, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addOnLongPressScrollListener");
        }
        if ((i8 & 2) != 0) {
            i7 = 2;
        }
        iGestureService.addOnLongPressScrollListener(a7, i7);
    }

    static /* synthetic */ void addOnSingleTapListener$default(IGestureService iGestureService, OnSingleTapListener onSingleTapListener, int i7, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addOnSingleTapListener");
        }
        if ((i8 & 2) != 0) {
            i7 = 2;
        }
        iGestureService.addOnSingleTapListener(onSingleTapListener, i7);
    }

    static /* synthetic */ void addOnTwoFingerDoubleTapListener$default(IGestureService iGestureService, C c7, int i7, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addOnTwoFingerDoubleTapListener");
        }
        if ((i8 & 2) != 0) {
            i7 = 2;
        }
        iGestureService.addOnTwoFingerDoubleTapListener(c7, i7);
    }

    static /* synthetic */ void addOnUpListener$default(IGestureService iGestureService, OnUpListener onUpListener, int i7, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addOnUpListener");
        }
        if ((i8 & 2) != 0) {
            i7 = 2;
        }
        iGestureService.addOnUpListener(onUpListener, i7);
    }

    static /* synthetic */ void addOriginScrollListener$default(IGestureService iGestureService, OriginScrollListener originScrollListener, int i7, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addOriginScrollListener");
        }
        if ((i8 & 2) != 0) {
            i7 = 2;
        }
        iGestureService.addOriginScrollListener(originScrollListener, i7);
    }

    static /* synthetic */ void setResizableGestureListener$default(IGestureService iGestureService, d dVar, boolean z6, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setResizableGestureListener");
        }
        if ((i7 & 2) != 0) {
            z6 = false;
        }
        iGestureService.setResizableGestureListener(dVar, z6);
    }

    static /* synthetic */ void setVerticalScrollListener$default(IGestureService iGestureService, I i7, boolean z6, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setVerticalScrollListener");
        }
        if ((i8 & 2) != 0) {
            z6 = false;
        }
        iGestureService.setVerticalScrollListener(i7, z6);
    }

    void addOnDoubleTapListener(@NotNull OnDoubleTapListener onDoubleTapListener, int i7);

    void addOnDownListener(@NotNull OnDownListener onDownListener, int i7);

    void addOnLongPressListener(@NotNull OnLongPressListener onLongPressListener, int i7);

    void addOnLongPressScrollListener(@NotNull A a7, int i7);

    void addOnSingleTapListener(@NotNull OnSingleTapListener onSingleTapListener, int i7);

    void addOnTwoFingerDoubleTapListener(@NotNull C c7, int i7);

    void addOnUpListener(@NotNull OnUpListener onUpListener, int i7);

    void addOriginScrollListener(@NotNull OriginScrollListener originScrollListener, int i7);

    boolean dispatchTouchEvent(@NotNull MotionEvent motionEvent);

    void enablePlayerDoubleTap(boolean z6);

    void enableTwoFingerDoubleTap(boolean z6);

    void forbiddenInnerTouchEvent(boolean z6);

    void forbiddenResizeGesture(boolean z6);

    int getGestureHeight();

    @Nullable
    IPlayerLayer<F> getGestureLayer();

    int getGestureWidth();

    boolean isHorizontalScrollEnable();

    boolean isLongPressEnabled();

    boolean isResizeGestureForbidden();

    boolean isVerticalScrollEnable();

    void removeOnDoubleTapListener(@NotNull OnDoubleTapListener onDoubleTapListener);

    void removeOnDownListener(@NotNull OnDownListener onDownListener);

    void removeOnLongPressListener(@NotNull OnLongPressListener onLongPressListener);

    void removeOnLongPressScrollListener(@NotNull A a7);

    void removeOnSingleTapListener(@NotNull OnSingleTapListener onSingleTapListener);

    void removeOnTwoFingerDoubleTapListener(@NotNull C c7);

    void removeOnUpListener(@NotNull OnUpListener onUpListener);

    void removeOriginScrollListener(@NotNull OriginScrollListener originScrollListener);

    void setChronosGestureCallback(@NotNull ChronosGestureCallback chronosGestureCallback);

    void setChronosGestureEnable(boolean z6);

    void setGestureSize(int i7, int i8);

    void setHorizontalScrollEnable(boolean z6);

    void setHorizontalScrollListener(@Nullable HorizontalScrollListener horizontalScrollListener);

    void setLongPressEnabled(boolean z6);

    void setNormalGestureEnable(boolean z6);

    void setOnTouchListener(@Nullable B b7);

    void setResizableGestureListener(@Nullable d dVar, boolean z6);

    void setResizeGestureEnable(boolean z6);

    void setTwoFingerDoubleTapEnable(boolean z6);

    void setVerticalScrollEnable(boolean z6);

    void setVerticalScrollListener(@Nullable I i7, boolean z6);

    void updateViewPort(@NotNull Rect rect);
}
