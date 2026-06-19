package com.bilibili.studio.editor.moudle.sticker.ui;

import Df.u;
import HG0.C2071b0;
import Nz0.a;
import Nz0.c;
import Nz0.f;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.dd.DeviceDecision;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseAppCompatActivity;
import com.bilibili.studio.editor.moudle.sticker.ui.BiliEditorCustomStickerManagerActivity;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.bilibili.studio.videoeditor.util.V;
import com.bilibili.studio.videoeditor.util.Y;
import com.bilibili.upper.module.contribute.up.ui.ManuscriptEditFragment;
import com.bilibili.upper.module.contribute.up.ui.ManuscriptEditV8Fragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import rH0.d;
import tv.danmaku.android.log.BLog;
import zG0.a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/sticker/ui/BiliEditorCustomStickerManagerActivity.class */
public class BiliEditorCustomStickerManagerActivity extends BaseAppCompatActivity {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final int f108066D = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public f f108067B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f108068C = 0;

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [Nz0.f, androidx.recyclerview.widget.RecyclerView$Adapter] */
    /* JADX WARN: Type inference failed for: r0v28, types: [Oz0.a, androidx.recyclerview.widget.ItemTouchHelper$Callback] */
    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.getDecorView().setSystemUiVisibility(4098);
            window.setBackgroundDrawable(new ColorDrawable(ViewCompat.MEASURED_STATE_MASK));
        }
        setContentView(2131498298);
        findViewById(2131314196).setOnClickListener(new a(this, 0));
        final int i7 = 0;
        findViewById(2131314114).setOnClickListener(new View.OnClickListener(this, i7) { // from class: Nz0.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f17558a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f17559b;

            {
                this.f17558a = i7;
                this.f17559b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i8;
                Cursor cursorQuery;
                EditCustomizeSticker editCustomizeSticker;
                String str;
                switch (this.f17558a) {
                    case 0:
                        BiliEditorCustomStickerManagerActivity biliEditorCustomStickerManagerActivity = (BiliEditorCustomStickerManagerActivity) this.f17559b;
                        if (biliEditorCustomStickerManagerActivity.f108068C > 0) {
                            f fVar = biliEditorCustomStickerManagerActivity.f108067B;
                            fVar.getClass();
                            Mz0.f fVarB = Mz0.f.b();
                            List<EditCustomizeSticker> list = fVar.f17568c;
                            fVarB.getClass();
                            if (!V.e(list)) {
                                for (EditCustomizeSticker editCustomizeSticker2 : (ArrayList) list) {
                                    if (editCustomizeSticker2 != null) {
                                        String str2 = editCustomizeSticker2.filePath;
                                        String str3 = str2;
                                        if (str2 == null) {
                                            str3 = "";
                                        }
                                        BLog.e("BiliEditorCustomStickerProvider", "deleteSticker path: ".concat(str3));
                                        Mz0.a aVar = fVarB.f16563c;
                                        long j7 = editCustomizeSticker2.sticker_id;
                                        aVar.getClass();
                                        if (Mz0.a.f16554a != null) {
                                            if (Mz0.a.f16554a == null) {
                                                editCustomizeSticker = null;
                                            } else {
                                                try {
                                                    cursorQuery = Mz0.a.f16554a.query("sticker", null, "sticker_id = ?", new String[]{String.valueOf(j7)}, null, null, null, "1");
                                                } catch (SQLiteException e7) {
                                                    e7.printStackTrace();
                                                    cursorQuery = null;
                                                }
                                                if (cursorQuery == null) {
                                                    editCustomizeSticker = null;
                                                } else if (cursorQuery.moveToFirst()) {
                                                    EditCustomizeSticker editCustomizeStickerB = Mz0.a.b(cursorQuery);
                                                    cursorQuery.close();
                                                    editCustomizeSticker = editCustomizeStickerB;
                                                } else {
                                                    cursorQuery.close();
                                                    editCustomizeSticker = null;
                                                }
                                            }
                                            if (editCustomizeSticker != null) {
                                                Mz0.a.f16554a.delete("sticker", "sticker_id = ?", new String[]{String.valueOf(j7)});
                                            }
                                        }
                                        ((ArrayList) fVarB.f16562b).clear();
                                        for (EditCustomizeSticker editCustomizeSticker3 : (ArrayList) fVarB.f16561a) {
                                            if (editCustomizeSticker3 != null && editCustomizeSticker2.sticker_id == editCustomizeSticker3.sticker_id) {
                                                ((ArrayList) fVarB.f16562b).add(editCustomizeSticker3);
                                            }
                                        }
                                        Iterator it = ((ArrayList) fVarB.f16562b).iterator();
                                        while (it.hasNext()) {
                                            ((ArrayList) fVarB.f16561a).remove((EditCustomizeSticker) it.next());
                                        }
                                        break;
                                    }
                                }
                            }
                            Mz0.f fVarB2 = Mz0.f.b();
                            List<EditCustomizeSticker> list2 = biliEditorCustomStickerManagerActivity.f108067B.f17567b;
                            if (!V.e(fVarB2.f16561a)) {
                                for (int i9 = 0; i9 < ((ArrayList) fVarB2.f16561a).size(); i9++) {
                                    EditCustomizeSticker editCustomizeSticker4 = (EditCustomizeSticker) ((ArrayList) fVarB2.f16561a).get(i9);
                                    ArrayList arrayList = (ArrayList) list2;
                                    int size = arrayList.size();
                                    int i10 = 0;
                                    while (true) {
                                        if (i10 >= arrayList.size()) {
                                            i8 = -1;
                                        } else if (((EditCustomizeSticker) arrayList.get(i10)).sticker_id == editCustomizeSticker4.sticker_id) {
                                            i8 = (size - 1) - i10;
                                        } else {
                                            i10++;
                                        }
                                    }
                                    editCustomizeSticker4.rank = i8;
                                }
                                Collections.sort(fVarB2.f16561a);
                                Mz0.a aVar2 = fVarB2.f16563c;
                                List<EditCustomizeSticker> list3 = fVarB2.f16561a;
                                aVar2.getClass();
                                if (Mz0.a.f16554a != null && !V.e(list3)) {
                                    Iterator it2 = ((ArrayList) list3).iterator();
                                    while (it2.hasNext()) {
                                        Mz0.a.c((EditCustomizeSticker) it2.next());
                                    }
                                }
                            }
                        }
                        biliEditorCustomStickerManagerActivity.finish();
                        break;
                    default:
                        ManuscriptEditV8Fragment manuscriptEditV8Fragment = (ManuscriptEditV8Fragment) this.f17559b;
                        if (!V.c()) {
                            if (d.a.c()) {
                                View.OnClickListener onClickListener = manuscriptEditV8Fragment.s;
                                if (onClickListener != null) {
                                    onClickListener.onClick(view);
                                }
                            } else {
                                manuscriptEditV8Fragment.pf();
                                ManuscriptEditFragment.ViewData viewData = ((ManuscriptEditFragment) manuscriptEditV8Fragment).c;
                                if (viewData != null && (!viewData.creationStatementGray ? !(viewData.showStatementDialog && !viewData.noStatement && viewData.copyrightChoosed == 3 && ((str = viewData.neutralMark) == null || str.length() == 0)) : viewData.creationStatementId != 0)) {
                                    manuscriptEditV8Fragment.pf();
                                    ManuscriptEditFragment.ViewData viewData2 = ((ManuscriptEditFragment) manuscriptEditV8Fragment).c;
                                    if (viewData2 != null) {
                                        Lazy lazy = zw0.b.f130950a;
                                        if (DeviceDecision.INSTANCE.getBoolean("uper.enable_creation_statement_direct_panel", true) && viewData2.creationStatementGray) {
                                            manuscriptEditV8Fragment.gg(true);
                                        }
                                    }
                                    zG0.a.a.getClass();
                                    a.a aVar3 = a.a.a;
                                    zG0.g.o();
                                    manuscriptEditV8Fragment.pf();
                                    C2071b0.d(manuscriptEditV8Fragment, ((ManuscriptEditFragment) manuscriptEditV8Fragment).c, new com.bilibili.ogv.operation2.b(manuscriptEditV8Fragment, 2), new u(manuscriptEditV8Fragment, 4), new HF0.i(manuscriptEditV8Fragment, 4));
                                } else {
                                    View.OnClickListener onClickListener2 = manuscriptEditV8Fragment.s;
                                    if (onClickListener2 != null) {
                                        onClickListener2.onClick(view);
                                    }
                                }
                            }
                            break;
                        }
                        break;
                }
            }
        });
        LinearLayout linearLayout = (LinearLayout) findViewById(2131305555);
        RecyclerView recyclerView = (RecyclerView) findViewById(2131310691);
        recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 4));
        c cVar = new c(this, linearLayout);
        ?? adapter = new RecyclerView.Adapter();
        adapter.f17570e = false;
        adapter.f17569d = cVar;
        adapter.f17567b = Mz0.f.b().c();
        adapter.f17568c = new ArrayList();
        this.f108067B = adapter;
        recyclerView.setAdapter(adapter);
        recyclerView.addOnScrollListener(new Nz0.d(this));
        Y.a(recyclerView);
        f fVar = this.f108067B;
        ?? callback = new ItemTouchHelper.Callback();
        callback.f18130d = -1;
        callback.f18131e = -1;
        callback.f18132f = fVar;
        new ItemTouchHelper(callback).attachToRecyclerView(recyclerView);
        Xz0.d dVar = Xz0.d.f28458a;
        int size = ((ArrayList) Mz0.f.b().c()).size();
        dVar.getClass();
        HashMap map = new HashMap();
        map.put("diy_sticker_count", String.valueOf(size));
        Neurons.reportExposure$default(false, "creation.video-editor.sticker-panel.diy-manage.show", map, (List) null, 8, (Object) null);
    }
}
