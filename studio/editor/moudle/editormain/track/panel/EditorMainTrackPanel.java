package com.bilibili.studio.editor.moudle.editormain.track.panel;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bilibili.studio.editor.moudle.editormain.track.material.addview.BiliEditorMaterialAddView;
import com.bilibili.studio.editor.moudle.editormain.track.material.foldetrack.BiliEditorMaterialFoldTrackView;
import com.bilibili.studio.editor.moudle.editormain.track.timeaxis.EditorMainTimeAxisZoomView;
import cy0.InterfaceC6767a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/track/panel/EditorMainTrackPanel.class */
public final class EditorMainTrackPanel extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public View f106233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public View f106234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public InterfaceC6767a f106235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f106236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final GestureDetector f106237e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/track/panel/EditorMainTrackPanel$a.class */
    public final class a extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EditorMainTrackPanel f106238a;

        public a(EditorMainTrackPanel editorMainTrackPanel) {
            this.f106238a = editorMainTrackPanel;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final void onLongPress(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            if (this.f106238a.getDispatchView() != null) {
                View view = this.f106238a.f106233a;
                if (!(view instanceof ConstraintLayout)) {
                    return true;
                }
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                int childCount = constraintLayout.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = constraintLayout.getChildAt(i7);
                    if (((childAt instanceof BiliEditorMaterialAddView) || (childAt instanceof BiliEditorMaterialFoldTrackView)) && childAt.getVisibility() == 0) {
                        if (motionEvent.getY() >= childAt.getY()) {
                            return true;
                        }
                    }
                }
                return true;
            }
            InterfaceC6767a onTrackPanelTouchListener = this.f106238a.getOnTrackPanelTouchListener();
            if (onTrackPanelTouchListener == null) {
                return true;
            }
            onTrackPanelTouchListener.e();
            return true;
        }
    }

    public EditorMainTrackPanel(@NotNull Context context) {
        this(context, null);
    }

    public EditorMainTrackPanel(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, -1);
        this.f106237e = new GestureDetector(context, new a(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean j0(android.view.MotionEvent r4, android.view.View r5) {
        /*
            r0 = r5
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L5c
            r0 = r5
            float r0 = r0.getX()
            r7 = r0
            r0 = r5
            float r0 = r0.getX()
            r6 = r0
            r0 = r5
            int r0 = r0.getWidth()
            float r0 = (float) r0
            r9 = r0
            r0 = r4
            float r0 = r0.getX()
            r8 = r0
            r0 = r7
            r1 = r8
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L5c
            r0 = r8
            r1 = r6
            r2 = r9
            float r1 = r1 + r2
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L5c
            r0 = r5
            float r0 = r0.getY()
            r9 = r0
            r0 = r5
            float r0 = r0.getY()
            r8 = r0
            r0 = r5
            int r0 = r0.getHeight()
            float r0 = (float) r0
            r7 = r0
            r0 = r4
            float r0 = r0.getY()
            r6 = r0
            r0 = r9
            r1 = r6
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L5c
            r0 = r6
            r1 = r8
            r2 = r7
            float r1 = r1 + r2
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L5c
            r0 = 1
            r10 = r0
            goto L5f
        L5c:
            r0 = 0
            r10 = r0
        L5f:
            r0 = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.track.panel.EditorMainTrackPanel.j0(android.view.MotionEvent, android.view.View):boolean");
    }

    public final boolean getDisableTouch() {
        return this.f106236d;
    }

    @Nullable
    public final View getDispatchView() {
        return this.f106233a;
    }

    @Nullable
    public final InterfaceC6767a getOnTrackPanelTouchListener() {
        return this.f106235c;
    }

    @Nullable
    public final View getTimeView() {
        return this.f106234b;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(@NotNull MotionEvent motionEvent) {
        if (this.f106236d) {
            return true;
        }
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if ((childAt instanceof ViewGroup) && j0(motionEvent, childAt)) {
                ((ViewGroup) childAt).onInterceptTouchEvent(motionEvent);
            }
        }
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        InterfaceC6767a interfaceC6767a;
        if (this.f106236d) {
            return true;
        }
        this.f106237e.onTouchEvent(motionEvent);
        if (motionEvent.getAction() == 0 && (interfaceC6767a = this.f106235c) != null) {
            interfaceC6767a.h();
        }
        if (!Mx0.a.f16457j.f16464g) {
            if (this.f106234b == null) {
                int childCount = getChildCount();
                int i7 = 0;
                while (true) {
                    if (i7 >= childCount - 1) {
                        break;
                    }
                    View childAt = getChildAt(i7);
                    if (childAt instanceof EditorMainTimeAxisZoomView) {
                        this.f106234b = childAt;
                        break;
                    }
                    i7++;
                }
            }
            View view = this.f106234b;
            if (view != null) {
                view.onTouchEvent(motionEvent);
            }
        }
        if (motionEvent.getAction() == 0) {
            int childCount2 = getChildCount();
            int i8 = 0;
            while (true) {
                if (i8 >= childCount2) {
                    break;
                }
                View childAt2 = getChildAt(i8);
                if (!(childAt2 instanceof EditorMainTimeAxisZoomView) && j0(motionEvent, childAt2)) {
                    this.f106233a = childAt2;
                    break;
                }
                i8++;
            }
        }
        View view2 = this.f106233a;
        if (view2 != null) {
            motionEvent.offsetLocation(-view2.getX(), -this.f106233a.getY());
            View view3 = this.f106233a;
            if (view3 instanceof ViewGroup) {
                view3.dispatchTouchEvent(motionEvent);
            } else {
                view3.onTouchEvent(motionEvent);
            }
            motionEvent.offsetLocation(this.f106233a.getX(), this.f106233a.getY());
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return true;
        }
        InterfaceC6767a interfaceC6767a2 = this.f106235c;
        if (interfaceC6767a2 != null) {
            interfaceC6767a2.a();
        }
        this.f106233a = null;
        return true;
    }

    public final void setDisableTouch(boolean z6) {
        this.f106236d = z6;
    }

    public final void setDispatchView(@Nullable View view) {
        this.f106233a = view;
    }

    public final void setOnTrackPanelTouchListener(@Nullable InterfaceC6767a interfaceC6767a) {
        this.f106235c = interfaceC6767a;
    }

    public final void setTimeView(@Nullable View view) {
        this.f106234b = view;
    }
}
