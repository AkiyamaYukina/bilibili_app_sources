package com.bilibili.ogv.feedback;

import HB.e;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.bilibili.boxing.Boxing;
import com.bilibili.boxing.model.entity.impl.ImageMedia;
import com.bilibili.boxing.utils.ImageCompressor;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.ui.BaseToolbarFragment;
import com.bilibili.magicasakura.widgets.TintButton;
import com.bilibili.magicasakura.widgets.TintEditText;
import com.bilibili.magicasakura.widgets.TintProgressDialog;
import com.bilibili.ogv.feedback.BangumiFeedbackImageFragment;
import com.bilibili.video.story.view.web.c;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/feedback/BaseBangumiFeedbackFragment.class */
public abstract class BaseBangumiFeedbackFragment extends BaseToolbarFragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f67581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TintEditText f67582d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TintButton f67583e;
    public TintProgressDialog h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImageCompressor f67586i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public BangumiFeedbackImageFragment f67587j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ConstraintRadioGroup f67590m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f67580b = new a(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicInteger f67584f = new AtomicInteger(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicInteger f67585g = new AtomicInteger(0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f67588k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Vd1.b f67589l = new Vd1.b(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/feedback/BaseBangumiFeedbackFragment$UploadFailedException.class */
    public static class UploadFailedException extends Exception {
        public UploadFailedException() {
        }

        public UploadFailedException(Throwable th) {
            super(th);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/feedback/BaseBangumiFeedbackFragment$a.class */
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BaseBangumiFeedbackFragment f67591a;

        public a(BaseBangumiFeedbackFragment baseBangumiFeedbackFragment) {
            this.f67591a = baseBangumiFeedbackFragment;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/feedback/BaseBangumiFeedbackFragment$b.class */
    public final class b implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BaseBangumiFeedbackFragment f67592a;

        public b(BaseBangumiFeedbackFragment baseBangumiFeedbackFragment) {
            this.f67592a = baseBangumiFeedbackFragment;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            this.f67592a.mf();
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        }
    }

    public final void mf() {
        int i7 = this.f67588k;
        boolean z6 = false;
        if (i7 <= -1) {
            TintButton tintButton = this.f67583e;
            boolean z7 = false;
            if (i7 != -1) {
                z7 = true;
            }
            tintButton.setEnabled(z7);
            return;
        }
        if (!sf(i7)) {
            this.f67583e.setEnabled(true);
            return;
        }
        TintButton tintButton2 = this.f67583e;
        if (!TextUtils.isEmpty(this.f67582d.getText().toString().trim()) || ((ArrayList) this.f67587j.jf()).size() > 0) {
            z6 = true;
        }
        tintButton2.setEnabled(z6);
    }

    public abstract void nf();

    public abstract int of();

    @Override // com.bilibili.lib.ui.BaseToolbarFragment, com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        setTitle(getString(2131856363));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i7, int i8, Intent intent) {
        ArrayList result;
        super.onActivityResult(i7, i8, intent);
        if (i7 != 7788 || i8 != -1 || (result = Boxing.getResult(intent)) == null || result.isEmpty()) {
            return;
        }
        this.h.setMessage(getString(2131856368));
        this.h.show();
        this.f67584f.set(0);
        this.f67585g.set(0);
        int size = result.size();
        for (int i9 = 0; i9 < size; i9++) {
            ImageMedia imageMedia = (ImageMedia) result.get(i9);
            this.f67584f.getAndIncrement();
            if (imageMedia.compress(this.f67586i)) {
                this.f67585g.getAndIncrement();
                BLog.dfmt("BaseBangumiFeedbackFragment", "compress %s : success", new Object[]{imageMedia.getCompressPath()});
                if (size == this.f67584f.get()) {
                    this.h.dismiss();
                    if (this.f67585g.get() < size) {
                        ToastHelper.showToastShort(getApplicationContext(), 2131856361);
                    } else {
                        BangumiFeedbackImageFragment.d dVar = this.f67587j.f67561b;
                        dVar.f67572c.clear();
                        dVar.f67572c.addAll(result);
                        dVar.notifyDataSetChanged();
                        mf();
                    }
                }
            } else {
                BLog.dfmt("BaseBangumiFeedbackFragment", "compress %s : failed", new Object[]{imageMedia.getCompressPath()});
                ToastHelper.showToastShort(getApplicationContext(), 2131856361);
            }
        }
    }

    @Override // com.bilibili.lib.ui.BaseToolbarFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        nf();
        TintProgressDialog tintProgressDialog = new TintProgressDialog(p3());
        this.h = tintProgressDialog;
        tintProgressDialog.setCancelable(false);
        this.f67586i = new ImageCompressor(getApplicationContext().getExternalCacheDir());
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View viewInflate = layoutInflater.inflate(2131493298, viewGroup, false);
        this.f67581c = viewInflate.findViewById(2131304803);
        FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(2131309806);
        this.f67582d = (TintEditText) viewInflate.findViewById(2131299956);
        this.f67583e = (TintButton) viewInflate.findViewById(2131309746);
        viewInflate.findViewById(2131303626);
        this.f67583e.setOnClickListener(new e(this, 2));
        ConstraintRadioGroup constraintRadioGroupPf = pf(layoutInflater, frameLayout);
        this.f67590m = constraintRadioGroupPf;
        frameLayout.addView(constraintRadioGroupPf);
        return viewInflate;
    }

    @Override // com.bilibili.lib.ui.BaseToolbarFragment, com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, @Nullable Bundle bundle) {
        View viewFindViewById;
        View viewFindViewById2;
        super.onViewCreated(view, bundle);
        FragmentManager childFragmentManager = getChildFragmentManager();
        BangumiFeedbackImageFragment bangumiFeedbackImageFragment = (BangumiFeedbackImageFragment) childFragmentManager.findFragmentByTag("BangumiFeedbackImageFragment");
        this.f67587j = bangumiFeedbackImageFragment;
        if (bangumiFeedbackImageFragment == null) {
            FragmentTransaction fragmentTransactionBeginTransaction = childFragmentManager.beginTransaction();
            BangumiFeedbackImageFragment bangumiFeedbackImageFragment2 = new BangumiFeedbackImageFragment();
            this.f67587j = bangumiFeedbackImageFragment2;
            Bundle bundle2 = new Bundle();
            bundle2.putInt("SPAN_COUNT", 5);
            bundle2.putInt("MAX_COUNT", 5);
            bangumiFeedbackImageFragment2.setArguments(bundle2);
            BangumiFeedbackImageFragment bangumiFeedbackImageFragment3 = this.f67587j;
            bangumiFeedbackImageFragment3.getClass();
            fragmentTransactionBeginTransaction.replace(2131301943, bangumiFeedbackImageFragment3, "BangumiFeedbackImageFragment").commit();
            this.f67587j.f67562c = this.f67580b;
        }
        this.f67590m.setOnCheckedChangeListener(this.f67589l);
        ConstraintRadioGroup constraintRadioGroup = this.f67590m;
        int iOf = of();
        if (iOf == -1 || iOf != constraintRadioGroup.f67594b) {
            int i7 = constraintRadioGroup.f67594b;
            if (i7 != -1 && (viewFindViewById2 = constraintRadioGroup.findViewById(i7)) != null && (viewFindViewById2 instanceof RadioButton)) {
                ((RadioButton) viewFindViewById2).setChecked(false);
            }
            if (iOf != -1 && (viewFindViewById = constraintRadioGroup.findViewById(iOf)) != null && (viewFindViewById instanceof RadioButton)) {
                ((RadioButton) viewFindViewById).setChecked(true);
            }
            constraintRadioGroup.f67594b = iOf;
            Vd1.b bVar = constraintRadioGroup.f67593a;
            if (bVar != null) {
                BaseBangumiFeedbackFragment baseBangumiFeedbackFragment = (BaseBangumiFeedbackFragment) bVar.a;
                baseBangumiFeedbackFragment.f67588k = iOf;
                baseBangumiFeedbackFragment.mf();
            }
        }
        this.f67582d.addTextChangedListener(new b(this));
        this.f67582d.setHorizontallyScrolling(false);
        this.f67582d.setImeOptions(6);
        this.f67582d.setMaxLines(10);
        ScrollView scrollView = (ScrollView) view.findViewById(2131306951);
        scrollView.post(new c(scrollView));
    }

    public abstract ConstraintRadioGroup pf(LayoutInflater layoutInflater, ViewGroup viewGroup);

    @NonNull
    public abstract String qf();

    public abstract int rf();

    public boolean sf(int i7) {
        return true;
    }

    public final void tf() {
        this.h.dismiss();
        ToastHelper.showToastShort(getContext(), 2131856367);
    }
}
