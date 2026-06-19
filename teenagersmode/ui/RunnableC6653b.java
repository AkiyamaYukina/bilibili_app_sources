package com.bilibili.teenagersmode.ui;

import com.bilibili.biligame.utils.CatchUtils;
import com.bilibili.studio.editor.moudle.caption.setting.widget.a;
import com.bilibili.upper.module.cover.ui.UpperCoverEditorActivity;
import kntr.base.utils.foundation.InputMethodManagerHelper;

/* JADX INFO: renamed from: com.bilibili.teenagersmode.ui.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/ui/b.class */
public final /* synthetic */ class RunnableC6653b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f110660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f110661b;

    public /* synthetic */ RunnableC6653b(UpperCoverEditorActivity upperCoverEditorActivity) {
        this.f110660a = 1;
        this.f110661b = upperCoverEditorActivity;
    }

    public /* synthetic */ RunnableC6653b(Object obj, int i7) {
        this.f110660a = i7;
        this.f110661b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f110660a) {
            case 0:
                PasswordView passwordView = (PasswordView) this.f110661b;
                passwordView.f110596b.setFocusableInTouchMode(true);
                passwordView.f110596b.setFocusable(true);
                passwordView.f110596b.requestFocus();
                InputMethodManagerHelper.showSoftInput(passwordView.f110595a, passwordView.f110596b, 0);
                break;
            case 1:
                final UpperCoverEditorActivity upperCoverEditorActivity = (UpperCoverEditorActivity) this.f110661b;
                if (upperCoverEditorActivity.f112711W == null) {
                    upperCoverEditorActivity.f112711W = new com.bilibili.studio.editor.moudle.caption.setting.widget.a(upperCoverEditorActivity);
                }
                com.bilibili.studio.editor.moudle.caption.setting.widget.a aVar = upperCoverEditorActivity.f112711W;
                if (aVar != null) {
                    aVar.c();
                }
                com.bilibili.studio.editor.moudle.caption.setting.widget.a aVar2 = upperCoverEditorActivity.f112711W;
                if (aVar2 != null) {
                    aVar2.f106004b = new a.b(upperCoverEditorActivity) { // from class: com.bilibili.upper.module.cover.ui.h

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final UpperCoverEditorActivity f112765a;

                        {
                            this.f112765a = upperCoverEditorActivity;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
                        /* JADX WARN: Removed duplicated region for block: B:23:0x006c A[Catch: Exception -> 0x00aa, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x00aa, blocks: (B:4:0x0010, B:6:0x001c, B:13:0x0035, B:19:0x005c, B:23:0x006c, B:26:0x0082, B:28:0x008a, B:30:0x009e, B:34:0x00af, B:35:0x00bc, B:37:0x00c8, B:39:0x00d4, B:10:0x002d), top: B:42:0x000d }] */
                        /* JADX WARN: Removed duplicated region for block: B:35:0x00bc A[Catch: Exception -> 0x00aa, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x00aa, blocks: (B:4:0x0010, B:6:0x001c, B:13:0x0035, B:19:0x005c, B:23:0x006c, B:26:0x0082, B:28:0x008a, B:30:0x009e, B:34:0x00af, B:35:0x00bc, B:37:0x00c8, B:39:0x00d4, B:10:0x002d), top: B:42:0x000d }] */
                        @Override // com.bilibili.studio.editor.moudle.caption.setting.widget.a.b
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final void p2(int r4, int r5) {
                            /*
                                Method dump skipped, instruction units count: 231
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.cover.ui.h.p2(int, int):void");
                        }
                    };
                }
                break;
            default:
                try {
                    ((uo.d) this.f110661b).a();
                } catch (Throwable th) {
                    CatchUtils.e("ForumGuideManager", "hide guide error!", th);
                }
                break;
        }
    }
}
