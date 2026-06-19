package com.bilibili.opd.app.bizcommon.imageselector.page;

import Jm0.q;
import Mm0.DialogC2679a;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.collection.ArrayMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.C4496a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bilibili.boxing.model.entity.BaseMedia;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.bean.ResizeOption;
import com.bilibili.lib.image2.view.InnerInsulateImageView;
import com.bilibili.lib.ui.util.StatusBarCompat;
import com.bilibili.magicasakura.widgets.TintImageView;
import com.bilibili.magicasakura.widgets.TintLinearLayout;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.mediautils.FileUtils;
import com.bilibili.mobile.BLMobileHumanActionNative;
import com.bilibili.opd.app.bizcommon.context.StatusBarMode;
import com.bilibili.opd.app.bizcommon.imageselector.media.MallVideoMedia;
import com.bilibili.opd.app.bizcommon.imageselector.page.MallMediaParams;
import com.bilibili.opd.app.bizcommon.imageselector.page.MallMediaPreviewFragment;
import com.bilibili.opd.app.bizcommon.imageselector.widget.MallMediaImageView;
import com.bilibili.opd.app.bizcommon.imageselector.widget.PhotoView;
import com.bilibili.opd.app.bizcommon.imageselector.widget.video.MallMediaVideoView;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/page/MallMediaPreviewFragment.class */
@StabilityInferred(parameters = 0)
public class MallMediaPreviewFragment extends MallMediaBaseFragment implements q.a {
    public static final int $stable = 8;

    @NotNull
    public static final a Companion = new Object();

    @NotNull
    public static final String IKEY_CLICK_MEDIA = "clickMedia";

    @NotNull
    public static final String IKEY_IS_INDEX_TITLE = "isIndextitle";

    @NotNull
    public static final String IKEY_SELECTED_MEDIAS = "selectedImages";

    @NotNull
    public static final String IKEY_TITLE = "title";
    public static final int MAX_COMPRESS_IMG_SIZE = 10485760;

    @NotNull
    public static final String RESULT_ORIGINAL_MEDIA = "result_originalMedia";

    @NotNull
    public static final String RESULT_SELECTED_MEDIAS = "result_selectedMedias";

    @NotNull
    public static final String TAG = "MallMediaPreviewFragment";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public View f73832b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public Jm0.v f73841l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public DialogC2679a f73842m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f73845p;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy f73833c = LazyKt.lazy(new BS0.C(this, 4));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Lazy f73834d = LazyKt.lazy(new Ob1.s(this, 2));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Lazy f73835e = LazyKt.lazy(new BT0.a(this, 4));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Lazy f73836f = LazyKt.lazy(new Ob1.u(this, 4));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Lazy f73837g = LazyKt.lazy(new Kp0.a(this, 3));

    @NotNull
    public final Lazy h = LazyKt.lazy(new Ob1.v(this, 1));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Lazy f73838i = LazyKt.lazy(new com.bilibili.app.comm.restrict.lessonsmode.ui.e(this, 1));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Lazy f73839j = LazyKt.lazy(new Ob1.q(this, 5));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Lazy f73840k = LazyKt.lazy(new BS0.v(this, 6));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final ArrayList<BaseMedia> f73843n = new ArrayList<>();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final ArrayList<BaseMedia> f73844o = new ArrayList<>();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public MallMediaParams f73846q = MallMediaParams.DEFAULT;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public MallMediaPreviewModel f73847r = MallMediaPreviewModel.IMAGE;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/page/MallMediaPreviewFragment$a.class */
    public static final class a {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/page/MallMediaPreviewFragment$b.class */
    public final class b extends PagerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final FragmentActivity f73848a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final List<BaseMedia> f73849b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public ArrayMap<Integer, com.bilibili.opd.app.bizcommon.imageselector.widget.video.b> f73850c;

        public b(@NotNull FragmentActivity fragmentActivity, @NotNull List list) {
            this.f73848a = fragmentActivity;
            this.f73849b = list;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final void destroyItem(@NotNull ViewGroup viewGroup, int i7, @NotNull Object obj) {
            ArrayMap<Integer, com.bilibili.opd.app.bizcommon.imageselector.widget.video.b> arrayMap = this.f73850c;
            if (arrayMap != null) {
                if (arrayMap.size() <= 0) {
                    arrayMap = null;
                }
                if (arrayMap != null) {
                    com.bilibili.opd.app.bizcommon.imageselector.widget.video.b bVar = arrayMap.get(Integer.valueOf(i7));
                    if (bVar != null) {
                        MallMediaVideoView mallMediaVideoView = bVar.f73980a;
                        if (mallMediaVideoView != null) {
                            mallMediaVideoView.setVisibility(8);
                        }
                        bVar.f73982c = false;
                        if (mallMediaVideoView != null) {
                            mallMediaVideoView.a();
                        }
                    }
                    arrayMap.remove(Integer.valueOf(i7));
                }
            }
            viewGroup.removeView((View) obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getCount() {
            return this.f73849b.size();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @NotNull
        public final Object instantiateItem(@NotNull ViewGroup viewGroup, final int i7) {
            int i8;
            FragmentActivity fragmentActivity = this.f73848a;
            View viewInflate = View.inflate(fragmentActivity, 2131499023, null);
            PhotoView photoView = (PhotoView) viewInflate.findViewById(2131301895);
            BaseMedia baseMedia = (BaseMedia) ((ArrayList) this.f73849b).get(i7);
            if (baseMedia != null) {
                File file = new File(baseMedia.getPath());
                String strA = C4496a.a(FileUtils.SCHEME_FILE, baseMedia.getPath());
                ImageRequestBuilder imageRequestBuilderNewBuilderWithSource = ImageRequestBuilder.newBuilderWithSource(Uri.parse(strA));
                long length = file.length();
                DisplayMetrics displayMetrics = fragmentActivity.getResources().getDisplayMetrics();
                if (length <= 10485760 || (i8 = displayMetrics.widthPixels) > 1080) {
                    imageRequestBuilderNewBuilderWithSource.setResizeOptions(new ResizeOptions(displayMetrics.widthPixels >> 1, displayMetrics.heightPixels >> 1, 0.0f, 0.0f, 12, (DefaultConstructorMarker) null));
                } else if (i8 > 720) {
                    imageRequestBuilderNewBuilderWithSource.setResizeOptions(new ResizeOptions(displayMetrics.widthPixels >> 2, displayMetrics.heightPixels >> 2, 0.0f, 0.0f, 12, (DefaultConstructorMarker) null));
                } else {
                    imageRequestBuilderNewBuilderWithSource.setResizeOptions(new ResizeOptions(100, 100, 0.0f, 0.0f, 12, (DefaultConstructorMarker) null));
                }
                photoView.setEnableClosingDrag(false);
                ImageRequest imageRequestBuild = imageRequestBuilderNewBuilderWithSource.build();
                com.bilibili.lib.image2.ImageRequestBuilder imageRequestBuilderUrl = BiliImageLoader.INSTANCE.with(fragmentActivity).url(strA);
                ResizeOptions resizeOptions = imageRequestBuild.getResizeOptions();
                int i9 = 100;
                int i10 = resizeOptions != null ? resizeOptions.width : 100;
                ResizeOptions resizeOptions2 = imageRequestBuild.getResizeOptions();
                if (resizeOptions2 != null) {
                    i9 = resizeOptions2.height;
                }
                imageRequestBuilderUrl.resizeOption(new ResizeOption(i10, i9)).into(photoView);
                if (baseMedia instanceof MallVideoMedia) {
                    MallMediaVideoView mallMediaVideoView = (MallMediaVideoView) viewInflate.findViewById(2131315950);
                    InnerInsulateImageView innerInsulateImageView = (MallMediaImageView) viewInflate.findViewById(2131316195);
                    if (innerInsulateImageView != null) {
                        innerInsulateImageView.setVisibility(0);
                    }
                    com.bilibili.opd.app.bizcommon.imageselector.widget.video.b bVar = new com.bilibili.opd.app.bizcommon.imageselector.widget.video.b(mallMediaVideoView);
                    bVar.f73981b = new w(photoView, innerInsulateImageView, bVar, strA);
                    com.bilibili.opd.app.bizcommon.imageselector.widget.video.b.a(bVar, strA);
                    if (this.f73850c == null) {
                        this.f73850c = new ArrayMap<>();
                    }
                    ArrayMap<Integer, com.bilibili.opd.app.bizcommon.imageselector.widget.video.b> arrayMap = this.f73850c;
                    if (arrayMap != null) {
                        arrayMap.put(Integer.valueOf(i7), bVar);
                    }
                    if (innerInsulateImageView != null) {
                        innerInsulateImageView.setOnClickListener(new View.OnClickListener(this, i7) { // from class: com.bilibili.opd.app.bizcommon.imageselector.page.v

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final MallMediaPreviewFragment.b f73933a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final int f73934b;

                            {
                                this.f73933a = this;
                                this.f73934b = i7;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                com.bilibili.opd.app.bizcommon.imageselector.widget.video.b bVar2;
                                MallMediaPreviewFragment.b bVar3 = this.f73933a;
                                int i11 = this.f73934b;
                                ArrayMap<Integer, com.bilibili.opd.app.bizcommon.imageselector.widget.video.b> arrayMap2 = bVar3.f73850c;
                                if (arrayMap2 == null || (bVar2 = arrayMap2.get(Integer.valueOf(i11))) == null) {
                                    return;
                                }
                                MallMediaVideoView mallMediaVideoView2 = bVar2.f73980a;
                                if (mallMediaVideoView2 != null) {
                                    mallMediaVideoView2.setVisibility(0);
                                }
                                if (mallMediaVideoView2 != null) {
                                    mallMediaVideoView2.c();
                                }
                            }
                        });
                    }
                }
            }
            viewGroup.addView(viewInflate);
            return viewInflate;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final boolean isViewFromObject(@NotNull View view, @NotNull Object obj) {
            return obj == view;
        }
    }

    @Override // com.bilibili.opd.app.bizcommon.imageselector.page.MallMediaBaseFragment
    public void initToolbar(@Nullable View view) {
        setStatusBarMode(StatusBarMode.IMMERSIVE_FULL_TRANSPARENT);
    }

    public final RecyclerView mf() {
        return (RecyclerView) this.h.getValue();
    }

    public final ViewPager nf() {
        return (ViewPager) this.f73837g.getValue();
    }

    public final int of(BaseMedia baseMedia) {
        if (baseMedia == null) {
            return -1;
        }
        int size = this.f73843n.size();
        for (int i7 = 0; i7 < size; i7++) {
            String path = baseMedia.getPath();
            BaseMedia baseMedia2 = this.f73843n.get(i7);
            if (Intrinsics.areEqual(path, baseMedia2 != null ? baseMedia2.getPath() : null)) {
                return i7;
            }
        }
        return -1;
    }

    @Override // com.bilibili.opd.app.bizcommon.context.KFCFragment
    public void onBackPressed() {
        rf();
        super.onBackPressed();
    }

    @Override // com.bilibili.opd.app.bizcommon.context.KFCFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Window window;
        boolean zBooleanValue;
        Intent intent;
        Intent intent2;
        FragmentActivity fragmentActivityP3;
        Window window2;
        super.onCreate(bundle);
        FragmentActivity fragmentActivityP32 = p3();
        if (fragmentActivityP32 == null || (window = fragmentActivityP32.getWindow()) == null) {
            return;
        }
        window.addFlags(BLMobileHumanActionNative.BL_MOBILE_ENABLE_GAZE_DETECT);
        Context context = getContext();
        if (context != null && (fragmentActivityP3 = p3()) != null && (window2 = fragmentActivityP3.getWindow()) != null) {
            window2.setNavigationBarColor(ContextCompat.getColor(context, 2131102934));
        }
        setAutoGenerateToolbar(false);
        if (getArguments() == null) {
            FragmentActivity fragmentActivityP33 = p3();
            if (((fragmentActivityP33 == null || (intent2 = fragmentActivityP33.getIntent()) == null) ? null : intent2.getExtras()) != null) {
                FragmentActivity fragmentActivityP34 = p3();
                setArguments((fragmentActivityP34 == null || (intent = fragmentActivityP34.getIntent()) == null) ? null : intent.getExtras());
            }
        }
        if (getArguments() == null) {
            BLog.e(TAG, "arguments is null");
            finishAttachedActivity();
            return;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            Bundle bundle2 = arguments.getBundle("bundle_key_extra_default");
            ArrayList parcelableArrayList = bundle2 == null ? null : bundle2.getParcelableArrayList(IKEY_SELECTED_MEDIAS);
            if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
                this.f73844o.addAll(parcelableArrayList);
            }
            Bundle bundle3 = arguments.getBundle("bundle_key_extra_default");
            BaseMedia parcelable = bundle3 == null ? null : bundle3.getParcelable(IKEY_CLICK_MEDIA);
            if (parcelable == null) {
                this.f73843n.addAll(this.f73844o);
            } else if (parcelable instanceof MallVideoMedia) {
                this.f73843n.add(parcelable);
            } else {
                MallMediaFragment.Companion.getClass();
                ArrayList arrayList = MallMediaFragment.f73777C;
                if (arrayList != null) {
                    this.f73843n.addAll(arrayList);
                }
            }
            Object obj = arguments.get(IKEY_IS_INDEX_TITLE);
            if (obj instanceof Boolean) {
                zBooleanValue = ((Boolean) obj).booleanValue();
            } else {
                zBooleanValue = false;
                if (obj instanceof String) {
                    try {
                        zBooleanValue = Boolean.parseBoolean((String) obj);
                    } catch (NumberFormatException e7) {
                        zBooleanValue = false;
                    }
                }
            }
            this.f73845p = zBooleanValue;
            MallMediaParams.Companion.getClass();
            this.f73846q = MallMediaParams.a.a(arguments);
        }
    }

    @Override // com.bilibili.opd.app.bizcommon.imageselector.page.MallMediaBaseFragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        initToolbar(viewGroup);
        View viewInflate = layoutInflater.inflate(2131499022, viewGroup, false);
        this.f73832b = viewInflate;
        return viewInflate;
    }

    @Override // com.bilibili.opd.app.bizcommon.imageselector.page.MallMediaBaseFragment, com.bilibili.opd.app.bizcommon.context.KFCFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        DialogC2679a dialogC2679a = this.f73842m;
        if (dialogC2679a != null) {
            dialogC2679a.dismiss();
        }
    }

    @Override // Jm0.q.a
    public void onFinish(@Nullable Bundle bundle) {
        boolean zBooleanValue;
        FragmentActivity fragmentActivity;
        if (activityDie()) {
            return;
        }
        DialogC2679a dialogC2679a = this.f73842m;
        if (dialogC2679a != null) {
            dialogC2679a.dismiss();
        }
        if (bundle == null) {
            finishAttachedActivity();
            return;
        }
        Object obj = bundle.get("bundle_key_only_close_loading");
        if (obj instanceof Boolean) {
            zBooleanValue = ((Boolean) obj).booleanValue();
        } else if (obj instanceof String) {
            try {
                zBooleanValue = Boolean.parseBoolean((String) obj);
            } catch (NumberFormatException e7) {
                zBooleanValue = false;
            }
        } else {
            zBooleanValue = false;
        }
        if (zBooleanValue) {
            return;
        }
        WeakReference<FragmentActivity> weakReference = Jm0.q.f11566a;
        if (weakReference != null && (fragmentActivity = weakReference.get()) != null) {
            fragmentActivity.setResult(-1, new Intent().putExtras(bundle));
            fragmentActivity.finish();
        }
        finishAttachedActivity();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        ViewGroup.LayoutParams layoutParams;
        super.onViewCreated(view, bundle);
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) this.f73833c.getValue();
            if (constraintLayout != null && (layoutParams = constraintLayout.getLayoutParams()) != null) {
                layoutParams.height = StatusBarCompat.getStatusBarHeight(p3()) + layoutParams.height;
                constraintLayout.setLayoutParams(layoutParams);
            }
            Bundle arguments = getArguments();
            if (arguments != null) {
                TintTextView tintTextView = (TintTextView) this.f73835e.getValue();
                if (tintTextView != null) {
                    tintTextView.setText(arguments.getString("title"));
                }
                Bundle bundle2 = arguments.getBundle("bundle_key_extra_default");
                BaseMedia baseMedia = (BaseMedia) (bundle2 == null ? null : bundle2.getParcelable(IKEY_CLICK_MEDIA));
                int iOf = of(baseMedia);
                if (iOf < 0) {
                    iOf = 0;
                }
                b bVar = new b(fragmentActivityP3, this.f73843n);
                ViewPager viewPagerNf = nf();
                if (viewPagerNf != null) {
                    viewPagerNf.setAdapter(bVar);
                }
                ViewPager viewPagerNf2 = nf();
                if (viewPagerNf2 != null) {
                    viewPagerNf2.setCurrentItem(iOf, false);
                }
                this.f73841l = new Jm0.v(fragmentActivityP3);
                RecyclerView recyclerViewMf = mf();
                if (recyclerViewMf != null) {
                    recyclerViewMf.setLayoutManager(new LinearLayoutManager(fragmentActivityP3, 0, false));
                }
                RecyclerView recyclerViewMf2 = mf();
                if (recyclerViewMf2 != null) {
                    recyclerViewMf2.addItemDecoration(new A(fragmentActivityP3));
                }
                RecyclerView recyclerViewMf3 = mf();
                if (recyclerViewMf3 != null) {
                    recyclerViewMf3.setAdapter(this.f73841l);
                }
                qf(iOf);
                TintImageView tintImageView = (TintImageView) this.f73840k.getValue();
                if (tintImageView != null) {
                    tintImageView.setSelected(this.f73846q.isOriginalMedia());
                }
                TintLinearLayout tintLinearLayout = (TintLinearLayout) this.f73839j.getValue();
                if (tintLinearLayout != null) {
                    tintLinearLayout.setVisibility(this.f73846q.getOriginalMediaButtonEnable() ? 0 : 8);
                }
                if (baseMedia instanceof MallVideoMedia) {
                    this.f73847r = MallMediaPreviewModel.VIDEO;
                    this.f73846q.setMaxImageCount(1);
                    this.f73846q.setOriginalMediaButtonEnable(false);
                    TintImageView tintImageView2 = (TintImageView) this.f73836f.getValue();
                    if (tintImageView2 != null) {
                        tintImageView2.setVisibility(8);
                    }
                    RecyclerView recyclerViewMf4 = mf();
                    if (recyclerViewMf4 != null) {
                        recyclerViewMf4.setVisibility(8);
                    }
                    TintLinearLayout tintLinearLayout2 = (TintLinearLayout) this.f73839j.getValue();
                    if (tintLinearLayout2 != null) {
                        tintLinearLayout2.setVisibility(8);
                    }
                    TextView textView = (TextView) this.f73838i.getValue();
                    if (textView != null) {
                        textView.setText(androidx.compose.runtime.collection.d.a(this.f73844o.size(), this.f73846q.getMaxImageCount(), "确定(", "/", ")"));
                    }
                    TextView textView2 = (TextView) this.f73838i.getValue();
                    if (textView2 != null) {
                        textView2.setSelected(true);
                    }
                }
            }
        }
        TintImageView tintImageView3 = (TintImageView) this.f73834d.getValue();
        if (tintImageView3 != null) {
            tintImageView3.setOnClickListener(new Hg1.b(this, 4));
        }
        TintImageView tintImageView4 = (TintImageView) this.f73836f.getValue();
        if (tintImageView4 != null) {
            tintImageView4.setOnClickListener(new Jb.c(this, 1));
        }
        ViewPager viewPagerNf3 = nf();
        if (viewPagerNf3 != null) {
            viewPagerNf3.addOnPageChangeListener(new y(this));
        }
        Jm0.v vVar = this.f73841l;
        if (vVar != null) {
            vVar.f11583e = new z(this);
        }
        TintLinearLayout tintLinearLayout3 = (TintLinearLayout) this.f73839j.getValue();
        if (tintLinearLayout3 != null) {
            tintLinearLayout3.setOnClickListener(new Jb.d(this, 2));
        }
        TextView textView3 = (TextView) this.f73838i.getValue();
        if (textView3 != null) {
            textView3.setOnClickListener(new x(new Ref.LongRef(), textView3, this));
        }
    }

    public final int pf(BaseMedia baseMedia) {
        if (baseMedia == null) {
            return -1;
        }
        int size = this.f73844o.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (StringsKt.x(baseMedia.getPath(), this.f73844o.get(i7).getPath())) {
                return i7;
            }
        }
        return -1;
    }

    public final void qf(int i7) {
        TintTextView tintTextView;
        if (this.f73843n.size() <= i7) {
            return;
        }
        if (this.f73845p && (tintTextView = (TintTextView) this.f73835e.getValue()) != null) {
            tintTextView.setText((i7 + 1) + "/" + this.f73843n.size());
        }
        int iPf = pf(this.f73843n.get(i7));
        TintImageView tintImageView = (TintImageView) this.f73836f.getValue();
        if (tintImageView != null) {
            tintImageView.setSelected(iPf >= 0);
        }
        ArrayList<BaseMedia> arrayList = this.f73844o;
        if (arrayList == null || arrayList.isEmpty()) {
            RecyclerView recyclerViewMf = mf();
            if (recyclerViewMf != null) {
                recyclerViewMf.setVisibility(8);
            }
        } else {
            Jm0.v vVar = this.f73841l;
            if (vVar != null) {
                if (iPf >= 0) {
                    vVar.N(this.f73844o.get(iPf));
                    RecyclerView recyclerViewMf2 = mf();
                    if (recyclerViewMf2 != null) {
                        recyclerViewMf2.smoothScrollToPosition(iPf);
                    }
                } else {
                    vVar.N(null);
                }
                ArrayList<BaseMedia> arrayList2 = this.f73844o;
                vVar.f11581c.clear();
                vVar.f11581c.addAll(arrayList2);
                vVar.notifyDataSetChanged();
            }
            RecyclerView recyclerViewMf3 = mf();
            if (recyclerViewMf3 != null) {
                recyclerViewMf3.setVisibility(0);
            }
        }
        ArrayList<BaseMedia> arrayList3 = this.f73844o;
        boolean z6 = (arrayList3 == null || arrayList3.isEmpty() || this.f73844o.size() < this.f73846q.getMinImageCount()) ? false : true;
        TextView textView = (TextView) this.f73838i.getValue();
        if (textView != null) {
            textView.setText(z6 ? androidx.compose.runtime.collection.d.a(this.f73844o.size(), this.f73846q.getMaxImageCount(), "确定(", "/", ")") : "确定");
            textView.setSelected(z6);
        }
    }

    public final void rf() {
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 != null) {
            Jm0.v vVar = this.f73841l;
            if (vVar != null) {
                vVar.N(null);
            }
            if (MallMediaPreviewModel.VIDEO == this.f73847r) {
                return;
            }
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList(RESULT_SELECTED_MEDIAS, this.f73844o);
            intent.putExtra("bundle_key_extra_default", bundle);
            intent.putExtra(RESULT_ORIGINAL_MEDIA, this.f73846q.isOriginalMedia());
            fragmentActivityP3.setResult(-1, intent);
        }
    }

    @Override // com.bilibili.opd.app.bizcommon.imageselector.page.MallMediaBaseFragment
    public boolean supportToolbar() {
        return false;
    }
}
