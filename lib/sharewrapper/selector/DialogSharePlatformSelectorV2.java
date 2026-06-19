package com.bilibili.lib.sharewrapper.selector;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.sharewrapper.SocializeMedia;
import com.bilibili.lib.sharewrapper.a;
import com.bilibili.lib.sharewrapper.selector.ISharePlatformSelector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/selector/DialogSharePlatformSelectorV2.class */
public final class DialogSharePlatformSelectorV2 implements ISharePlatformSelector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Activity f64446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public a.C0355a f64447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public DialogInterface.OnDismissListener f64448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public ShareDialog f64449d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/selector/DialogSharePlatformSelectorV2$ShareDialog.class */
    public static class ShareDialog extends AlertDialog {

        @Nullable
        private a mBiliAdapter;

        @Nullable
        private List<SharePlatform> mBiliPlatforms;

        @Nullable
        private RecyclerView mBiliSelector;

        @Nullable
        private TextView mBiliTitle;

        @Nullable
        private View mDivider;

        @Nullable
        private ISharePlatformSelector.OnItemClickListener mShareItemClick;
        private ISharePlatformSelector.Style mStyle;
        private String mTitle;

        @Nullable
        private a mUnBiliAdapter;

        @Nullable
        private List<SharePlatform> mUnBiliPlatforms;

        @Nullable
        private RecyclerView mUnBiliSelector;

        @Nullable
        private TextView mUnBiliTitle;

        private ShareDialog(@NonNull Context context) {
            super(context);
            this.mTitle = "";
            this.mStyle = ISharePlatformSelector.Style.BOTTOM_V2;
        }

        public /* synthetic */ ShareDialog(Context context, int i7) {
            this(context);
        }

        @Override // androidx.appcompat.app.AlertDialog, androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
        public void onCreate(Bundle bundle) {
            if (this.mShareItemClick == null) {
                dismiss();
                return;
            }
            setContentView(2131496567);
            this.mBiliTitle = (TextView) findViewById(2131297533);
            RecyclerView recyclerView = (RecyclerView) findViewById(2131297529);
            this.mBiliSelector = recyclerView;
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
            a aVar = new a();
            this.mBiliAdapter = aVar;
            this.mBiliSelector.setAdapter(aVar);
            this.mBiliAdapter.f64455a = this.mShareItemClick;
            this.mUnBiliTitle = (TextView) findViewById(2131315499);
            RecyclerView recyclerView2 = (RecyclerView) findViewById(2131315498);
            this.mUnBiliSelector = recyclerView2;
            recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
            a aVar2 = new a();
            this.mUnBiliAdapter = aVar2;
            this.mUnBiliSelector.setAdapter(aVar2);
            this.mUnBiliAdapter.f64455a = this.mShareItemClick;
            this.mDivider = findViewById(2131299397);
            List<SharePlatform> list = this.mBiliPlatforms;
            boolean z6 = list == null || list.isEmpty();
            if (this.mUnBiliPlatforms == null) {
                this.mUnBiliPlatforms = SharePlatform.defaultPlatforms();
            }
            this.mBiliTitle.setVisibility(z6 ? 8 : 0);
            this.mBiliSelector.setVisibility(z6 ? 8 : 0);
            View view = this.mDivider;
            int i7 = 0;
            if (z6) {
                i7 = 8;
            }
            view.setVisibility(i7);
            if (!z6) {
                a aVar3 = this.mBiliAdapter;
                List<SharePlatform> list2 = this.mBiliPlatforms;
                ((ArrayList) aVar3.f64456b).clear();
                if (list2 != null) {
                    ((ArrayList) aVar3.f64456b).addAll(list2);
                }
            }
            a aVar4 = this.mUnBiliAdapter;
            List<SharePlatform> list3 = this.mUnBiliPlatforms;
            ((ArrayList) aVar4.f64456b).clear();
            if (list3 != null) {
                ((ArrayList) aVar4.f64456b).addAll(list3);
            }
        }

        @Override // androidx.activity.ComponentDialog, android.app.Dialog
        public void onStart() {
            Window window;
            super.onStart();
            if (this.mStyle != ISharePlatformSelector.Style.BOTTOM_V2 || (window = getWindow()) == null) {
                return;
            }
            window.setWindowAnimations(2131888862);
            window.setGravity(80);
            window.setLayout(-1, -2);
        }

        public void setOnItemClickListener(@Nullable ISharePlatformSelector.OnItemClickListener onItemClickListener) {
            this.mShareItemClick = onItemClickListener;
        }

        public void setPlatforms(List<SharePlatform> list, List<SharePlatform> list2) {
            this.mBiliPlatforms = list;
            this.mUnBiliPlatforms = list2;
        }

        public void show(String str, ISharePlatformSelector.Style style) {
            this.mTitle = str;
            this.mStyle = style;
            show();
        }
    }

    @Override // com.bilibili.lib.sharewrapper.selector.ISharePlatformSelector
    public final void dismiss() {
        ShareDialog shareDialog = this.f64449d;
        if (shareDialog != null) {
            shareDialog.dismiss();
        }
    }

    @Override // com.bilibili.lib.sharewrapper.selector.ISharePlatformSelector
    public final void release() {
        dismiss();
        this.f64449d = null;
        this.f64446a = null;
        this.f64447b = null;
    }

    @Override // com.bilibili.lib.sharewrapper.selector.ISharePlatformSelector
    public final void show(String str, ISharePlatformSelector.Style style, List<SharePlatform> list) {
        Activity activity = this.f64446a;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        this.f64449d = new ShareDialog(this.f64446a, 0);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (SharePlatform sharePlatform : list) {
            if (SocializeMedia.isThirdParty(sharePlatform.media)) {
                arrayList2.add(sharePlatform);
            } else {
                arrayList.add(sharePlatform);
            }
        }
        this.f64449d.setPlatforms(arrayList, arrayList2);
        this.f64449d.setOnItemClickListener(this.f64447b);
        this.f64449d.setOnDismissListener(this.f64448c);
        this.f64449d.show(str, style);
    }
}
