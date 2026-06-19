package com.bilibili.opd.app.bizcommon.imageselector.page;

import Jm0.C2423A;
import Jm0.C2424a;
import Jm0.q;
import Mm0.DialogC2679a;
import android.animation.ObjectAnimator;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Path;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bolts.Continuation;
import bolts.Task;
import com.alibaba.fastjson.JSON;
import com.bilibili.base.MainThread;
import com.bilibili.base.SharedPreferencesHelper;
import com.bilibili.boxing.model.entity.BaseMedia;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.ui.PermissionsChecker;
import com.bilibili.lib.ui.util.StatusBarCompat;
import com.bilibili.magicasakura.widgets.TintRelativeLayout;
import com.bilibili.mobile.BLMobileHumanActionNative;
import com.bilibili.opd.app.bizcommon.biliapm.MallTaskRunner;
import com.bilibili.opd.app.bizcommon.context.StatusBarMode;
import com.bilibili.opd.app.bizcommon.imageselector.media.MallImageMedia;
import com.bilibili.opd.app.bizcommon.imageselector.page.MallMediaFragment;
import com.bilibili.opd.app.bizcommon.imageselector.page.MallMediaParams;
import com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.MediaStrategyItem;
import com.google.android.material.tabs.TabLayout;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListMap;
import kotlin.Function;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.webrtc.RenderSynchronizer;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/page/MallMediaFragment.class */
@StabilityInferred(parameters = 0)
public class MallMediaFragment extends MallMediaBaseFragment implements q.a {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @Nullable
    public static ArrayList<BaseMedia> f73777C;

    @NotNull
    public static final a Companion = new Object();
    public static final int IMAGE_PREVIEW_REQUEST_CODE = 8849;
    public static final int MEDIA_ENTRY_REQUEST_CODE = 8848;
    public static final int SCENE_TYPE_DEFAULT = -1;

    @NotNull
    public static final String TAG = "MallMediaFragment";
    public static final int TAKE_PHOTO_REQUEST_CODE = 8850;
    public static final int VIDEO_TIME_LIMIT = 5000;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f73778A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @NotNull
    public MallMediaParams f73779B = MallMediaParams.DEFAULT;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public TabLayout f73780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public LinearLayout f73781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public TintRelativeLayout f73782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public RelativeLayout f73783e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public ComposeView f73784f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public BiliImageView f73785g;

    @Nullable
    public ImageView h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public ConstraintLayout f73786i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public TextView f73787j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public ImageView f73788k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public View f73789l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public RecyclerView f73790m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public RecyclerView f73791n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public TextView f73792o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public LinearLayout f73793p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public ImageView f73794q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public TextView f73795r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public Jm0.h f73796s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public Jm0.f f73797t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public DialogC2679a f73798u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public ObjectAnimator f73799v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public ObjectAnimator f73800w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public ObjectAnimator f73801x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public ObjectAnimator f73802y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public C2423A f73803z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/page/MallMediaFragment$a.class */
    public static final class a {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/page/MallMediaFragment$b.class */
    public interface b {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/page/MallMediaFragment$c.class */
    public static final /* synthetic */ class c implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C5554g f73804a;

        public c(C5554g c5554g) {
            this.f73804a = c5554g;
        }

        public final boolean equals(@Nullable Object obj) {
            boolean zAreEqual = false;
            if (obj instanceof Observer) {
                zAreEqual = false;
                if (obj instanceof FunctionAdapter) {
                    zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
            }
            return zAreEqual;
        }

        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f73804a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f73804a.invoke(obj);
        }
    }

    public static final /* synthetic */ b access$getMSubmitSelectedListener$p(MallMediaFragment mallMediaFragment) {
        mallMediaFragment.getClass();
        return null;
    }

    public static final void access$toggleAlbumStatus(MallMediaFragment mallMediaFragment) {
        if (mallMediaFragment.f73778A) {
            ObjectAnimator objectAnimator = mallMediaFragment.f73800w;
            if (objectAnimator != null) {
                objectAnimator.start();
            }
            ObjectAnimator objectAnimator2 = mallMediaFragment.f73802y;
            if (objectAnimator2 != null) {
                objectAnimator2.start();
            }
        } else {
            View view = mallMediaFragment.f73789l;
            if (view != null) {
                view.setVisibility(0);
            }
            ObjectAnimator objectAnimator3 = mallMediaFragment.f73801x;
            if (objectAnimator3 != null) {
                objectAnimator3.start();
            }
            ObjectAnimator objectAnimator4 = mallMediaFragment.f73799v;
            if (objectAnimator4 != null) {
                objectAnimator4.start();
            }
        }
        mallMediaFragment.f73778A = !mallMediaFragment.f73778A;
    }

    @Override // com.bilibili.opd.app.bizcommon.context.KFCFragment, com.bilibili.opd.app.bizcommon.context.b
    public boolean dispatchKeyEvent(@Nullable KeyEvent keyEvent) {
        return false;
    }

    public void entryPreviewPage(@Nullable BaseMedia baseMedia, @Nullable ArrayList<BaseMedia> arrayList) {
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 != null) {
            int i7 = MallMediaPreviewActivity.f73831B;
            MallMediaParams mallMediaParams = this.f73779B;
            Intent intent = new Intent(fragmentActivityP3, (Class<?>) MallMediaPreviewActivity.class);
            if (baseMedia != null || arrayList != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable(MallMediaPreviewFragment.IKEY_CLICK_MEDIA, baseMedia);
                bundle.putParcelableArrayList(MallMediaPreviewFragment.IKEY_SELECTED_MEDIAS, arrayList);
                intent.putExtra("bundle_key_extra_default", bundle);
            }
            intent.putExtra(MallMediaParams.BKEY_MALL_MEDIA_PARAMS, JSON.toJSONString(mallMediaParams));
            startActivityForResult(intent, IMAGE_PREVIEW_REQUEST_CODE);
        }
    }

    public void entryTakePhotoPage() {
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 != null) {
            int i7 = MallTakePhotoActivity.f73867C;
            MallMediaParams mallMediaParams = this.f73779B;
            Intent intent = new Intent(fragmentActivityP3, (Class<?>) MallTakePhotoActivity.class);
            intent.putExtra(MallMediaParams.BKEY_MALL_MEDIA_PARAMS, JSON.toJSONString(mallMediaParams));
            fragmentActivityP3.startActivityForResult(intent, 0);
        }
    }

    @Nullable
    public final ComposeView getMText2Img() {
        return this.f73784f;
    }

    @NotNull
    public final MallMediaParams getMmParams() {
        return this.f73779B;
    }

    @Override // com.bilibili.opd.app.bizcommon.imageselector.page.MallMediaBaseFragment
    @NotNull
    public String getTitle() {
        return getString(2131829904);
    }

    @Override // com.bilibili.opd.app.bizcommon.imageselector.page.MallMediaBaseFragment
    public void initToolbar(@Nullable View view) {
        setStatusBarMode(StatusBarMode.IMMERSIVE_FULL_TRANSPARENT);
    }

    public final void mf(FragmentActivity fragmentActivity) {
        DialogC2679a dialogC2679a;
        DialogC2679a dialogC2679a2;
        if (fragmentActivity == null) {
            return;
        }
        if (this.f73798u == null) {
            this.f73798u = new DialogC2679a(fragmentActivity);
        }
        if (activityDie() || !isAdded() || (dialogC2679a = this.f73798u) == null || dialogC2679a.isShowing() || (dialogC2679a2 = this.f73798u) == null) {
            return;
        }
        dialogC2679a2.show();
    }

    @Override // com.bilibili.opd.app.bizcommon.context.KFCFragment, androidx.fragment.app.Fragment
    public void onActivityResult(int i7, int i8, @Nullable Intent intent) {
        Bundle extras;
        boolean zBooleanValue;
        Bundle extras2;
        Bundle bundle;
        Jm0.f fVar;
        super.onActivityResult(i7, i8, intent);
        if (i8 == -1) {
            ArrayList parcelableArrayList = null;
            if (i7 != 8849) {
                if (i7 != 8850) {
                    return;
                }
                String stringExtra = null;
                if (intent != null) {
                    stringExtra = intent.getStringExtra("clip_photo");
                }
                if (stringExtra == null || (fVar = this.f73797t) == null) {
                    return;
                }
                MallImageMedia mallImageMedia = new MallImageMedia(new File(stringExtra));
                if (fVar.f11537d.size() >= fVar.f11539f) {
                    fVar.O();
                    return;
                } else {
                    MallTaskRunner.getInstance().submit(new Jm0.c(mallImageMedia, fVar));
                    return;
                }
            }
            if (intent != null && (extras2 = intent.getExtras()) != null && (bundle = extras2.getBundle("bundle_key_extra_default")) != null) {
                parcelableArrayList = bundle.getParcelableArrayList(MallMediaPreviewFragment.RESULT_SELECTED_MEDIAS);
            }
            if (parcelableArrayList != null) {
                ArrayList arrayList = new ArrayList(parcelableArrayList);
                Jm0.f fVar2 = this.f73797t;
                if (fVar2 != null) {
                    fVar2.f11537d.clear();
                    fVar2.f11537d.addAll(arrayList);
                    fVar2.notifyDataSetChanged();
                    C5564q c5564q = fVar2.f11541i;
                    if (c5564q != null) {
                        ArrayList<BaseMedia> arrayList2 = fVar2.f11537d;
                        boolean zIsEmpty = arrayList2.isEmpty();
                        MallMediaFragment mallMediaFragment = c5564q.f73921a;
                        if (zIsEmpty || arrayList2.size() < mallMediaFragment.getMmParams().getMinImageCount()) {
                            TextView textView = mallMediaFragment.f73792o;
                            if (textView != null) {
                                textView.setEnabled(false);
                            }
                            TextView textView2 = mallMediaFragment.f73792o;
                            if (textView2 != null) {
                                textView2.setSelected(false);
                            }
                            TextView textView3 = mallMediaFragment.f73795r;
                            if (textView3 != null) {
                                textView3.setEnabled(false);
                            }
                            TextView textView4 = mallMediaFragment.f73795r;
                            if (textView4 != null) {
                                textView4.setSelected(false);
                            }
                            TextView textView5 = mallMediaFragment.f73795r;
                            if (textView5 != null) {
                                textView5.setText("确定");
                            }
                            if (mallMediaFragment.getMmParams().isNeedText()) {
                                LinearLayout linearLayout = mallMediaFragment.f73781c;
                                if (linearLayout != null) {
                                    linearLayout.setVisibility(0);
                                }
                                TintRelativeLayout tintRelativeLayout = mallMediaFragment.f73782d;
                                if (tintRelativeLayout != null) {
                                    tintRelativeLayout.setVisibility(8);
                                }
                            }
                        } else {
                            TextView textView6 = mallMediaFragment.f73792o;
                            if (textView6 != null) {
                                textView6.setEnabled(true);
                            }
                            TextView textView7 = mallMediaFragment.f73792o;
                            if (textView7 != null) {
                                textView7.setSelected(true);
                            }
                            TextView textView8 = mallMediaFragment.f73795r;
                            if (textView8 != null) {
                                textView8.setEnabled(true);
                            }
                            TextView textView9 = mallMediaFragment.f73795r;
                            if (textView9 != null) {
                                textView9.setSelected(true);
                            }
                            TextView textView10 = mallMediaFragment.f73795r;
                            if (textView10 != null) {
                                textView10.setText(androidx.compose.runtime.collection.d.a(arrayList2.size(), mallMediaFragment.getMmParams().getMaxImageCount(), "确定(", "/", ")"));
                            }
                            if (mallMediaFragment.getMmParams().isNeedText()) {
                                LinearLayout linearLayout2 = mallMediaFragment.f73781c;
                                if (linearLayout2 != null) {
                                    linearLayout2.setVisibility(8);
                                }
                                TintRelativeLayout tintRelativeLayout2 = mallMediaFragment.f73782d;
                                if (tintRelativeLayout2 != null) {
                                    tintRelativeLayout2.setVisibility(0);
                                }
                            }
                        }
                    }
                }
            }
            MallMediaParams mallMediaParams = this.f73779B;
            if (intent == null || (extras = intent.getExtras()) == null) {
                zBooleanValue = true;
            } else {
                Object obj = extras.get(MallMediaPreviewFragment.RESULT_ORIGINAL_MEDIA);
                if (obj instanceof Boolean) {
                    zBooleanValue = ((Boolean) obj).booleanValue();
                } else {
                    zBooleanValue = true;
                    if (obj instanceof String) {
                        try {
                            zBooleanValue = Boolean.parseBoolean((String) obj);
                        } catch (NumberFormatException e7) {
                            zBooleanValue = true;
                        }
                    }
                }
            }
            mallMediaParams.setOriginalMedia(zBooleanValue);
            ImageView imageView = this.f73794q;
            if (imageView != null) {
                imageView.setSelected(this.f73779B.isOriginalMedia());
            }
        }
    }

    @Override // com.bilibili.opd.app.bizcommon.context.KFCFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Window window;
        Intent intent;
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
            if (((fragmentActivityP33 == null || (intent = fragmentActivityP33.getIntent()) == null) ? null : intent.getExtras()) != null) {
                FragmentActivity fragmentActivityP34 = p3();
                Bundle extras = null;
                if (fragmentActivityP34 != null) {
                    Intent intent2 = fragmentActivityP34.getIntent();
                    extras = null;
                    if (intent2 != null) {
                        extras = intent2.getExtras();
                    }
                }
                setArguments(extras);
            }
        }
        MallMediaParams.a aVar = MallMediaParams.Companion;
        Bundle arguments = getArguments();
        aVar.getClass();
        this.f73779B = MallMediaParams.a.a(arguments);
    }

    @Override // com.bilibili.opd.app.bizcommon.imageselector.page.MallMediaBaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        initToolbar(viewGroup);
        return layoutInflater.inflate(2131499012, viewGroup, false);
    }

    @Override // com.bilibili.opd.app.bizcommon.imageselector.page.MallMediaBaseFragment, com.bilibili.opd.app.bizcommon.context.KFCFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        DialogC2679a dialogC2679a = this.f73798u;
        if (dialogC2679a != null) {
            dialogC2679a.dismiss();
        }
        this.f73798u = null;
        Jm0.q.f11566a = null;
        Companion.getClass();
        ArrayList arrayList = f73777C;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    @Override // Jm0.q.a
    public void onFinish(@Nullable Bundle bundle) {
        boolean zBooleanValue;
        if (activityDie()) {
            return;
        }
        DialogC2679a dialogC2679a = this.f73798u;
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
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 != null) {
            fragmentActivityP3.setResult(-1, new Intent().putExtras(bundle));
        }
        finishAttachedActivity();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v101, types: [Yg1.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v152, types: [Mm0.c, androidx.recyclerview.widget.RecyclerView$ItemDecoration] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        ViewGroup.LayoutParams layoutParams;
        super.onViewCreated(view, bundle);
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(2131306543);
        if (constraintLayout != null && (layoutParams = constraintLayout.getLayoutParams()) != null) {
            ViewGroup.LayoutParams layoutParams2 = constraintLayout.getLayoutParams();
            layoutParams.height = layoutParams2 != null ? StatusBarCompat.getStatusBarHeight(p3()) + layoutParams2.height : StatusBarCompat.getStatusBarHeight(p3());
        }
        int i7 = 8;
        if (getContext() != null) {
            this.f73782d = (TintRelativeLayout) view.findViewById(2131319577);
            this.f73781c = (LinearLayout) view.findViewById(2131319579);
            this.f73780b = view.findViewById(2131319578);
            this.f73783e = (RelativeLayout) view.findViewById(2131319581);
            this.f73784f = (ComposeView) view.findViewById(2131319580);
            this.f73785g = view.findViewById(2131319582);
            if (this.f73779B.isNeedText()) {
                LinearLayout linearLayout = this.f73781c;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                TintRelativeLayout tintRelativeLayout = this.f73782d;
                if (tintRelativeLayout != null) {
                    tintRelativeLayout.setVisibility(8);
                }
                TabLayout tabLayout = this.f73780b;
                TabLayout.Tab tabNewTab = tabLayout != null ? tabLayout.newTab() : null;
                if (tabNewTab != null) {
                    tabNewTab.setText(MediaStrategyItem.SOURCE_FROM_ALBUM);
                }
                TabLayout tabLayout2 = this.f73780b;
                TabLayout.Tab tabNewTab2 = tabLayout2 != null ? tabLayout2.newTab() : null;
                if (tabNewTab2 != null) {
                    tabNewTab2.setText("文字");
                }
                if (tabNewTab != null && tabNewTab2 != null) {
                    TabLayout tabLayout3 = this.f73780b;
                    if (tabLayout3 != null) {
                        tabLayout3.addTab(tabNewTab);
                    }
                    TabLayout tabLayout4 = this.f73780b;
                    if (tabLayout4 != null) {
                        tabLayout4.addTab(tabNewTab2);
                    }
                }
                TabLayout tabLayout5 = this.f73780b;
                if (tabLayout5 != null) {
                    tabLayout5.setOnTabSelectedListener(new C5557j(this));
                }
                if (this.f73779B.getTabIndex() == 0 && tabNewTab != null) {
                    tabNewTab.select();
                }
                if (this.f73779B.getTabIndex() == 1 && tabNewTab2 != null) {
                    tabNewTab2.select();
                }
                if (new SharedPreferencesHelper(getContext(), "bilibili.mall.share.preference").optBoolean("show_text2img_guide", true)) {
                    BiliImageLoader.INSTANCE.with(this).url("https://i0.hdslb.com/bfs/kfptfe/floor/c02a2bc2680ee759c3410f6b588d4e0798219ee6.png").into(this.f73785g);
                    BiliImageView biliImageView = this.f73785g;
                    if (biliImageView != null) {
                        biliImageView.setVisibility(0);
                    }
                    BiliImageView biliImageView2 = this.f73785g;
                    if (biliImageView2 != null) {
                        biliImageView2.setOnClickListener(new ViewOnClickListenerC5556i(new Ref.LongRef(), biliImageView2, this));
                    }
                    final int i8 = 0;
                    MainThread.postOnMainThreadDelayed(new Runnable(this, i8) { // from class: com.bilibili.opd.app.bizcommon.imageselector.page.d

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final int f73894a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final Object f73895b;

                        {
                            this.f73894a = i8;
                            this.f73895b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (this.f73894a) {
                                case 0:
                                    MallMediaFragment mallMediaFragment = (MallMediaFragment) this.f73895b;
                                    BiliImageView biliImageView3 = mallMediaFragment.f73785g;
                                    if (biliImageView3 != null) {
                                        biliImageView3.setVisibility(8);
                                    }
                                    if (mallMediaFragment.getContext() != null) {
                                        new SharedPreferencesHelper(mallMediaFragment.getContext(), "bilibili.mall.share.preference").setBoolean("show_text2img_guide", false);
                                    }
                                    break;
                                case 1:
                                    ((ly.a) this.f73895b).a.setAlpha(1.0f);
                                    break;
                                default:
                                    RenderSynchronizer.b((RenderSynchronizer) this.f73895b);
                                    break;
                            }
                        }
                    }, 5000L);
                } else {
                    BiliImageView biliImageView3 = this.f73785g;
                    if (biliImageView3 != null) {
                        biliImageView3.setVisibility(8);
                    }
                }
            } else {
                LinearLayout linearLayout2 = this.f73781c;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(8);
                }
                TintRelativeLayout tintRelativeLayout2 = this.f73782d;
                if (tintRelativeLayout2 != null) {
                    tintRelativeLayout2.setVisibility(0);
                }
                BiliImageView biliImageView4 = this.f73785g;
                if (biliImageView4 != null) {
                    biliImageView4.setVisibility(8);
                }
            }
        }
        this.h = (ImageView) view.findViewById(2131306542);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) view.findViewById(2131305672);
        this.f73786i = constraintLayout2;
        this.f73788k = constraintLayout2 != null ? (ImageView) constraintLayout2.findViewById(2131304045) : null;
        ConstraintLayout constraintLayout3 = this.f73786i;
        TextView textView = null;
        if (constraintLayout3 != null) {
            textView = (TextView) constraintLayout3.findViewById(2131308867);
        }
        this.f73787j = textView;
        this.f73789l = view.findViewById(2131306816);
        ImageView imageView = this.f73788k;
        if (imageView != null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, "rotation", 0.0f, 180.0f);
            objectAnimatorOfFloat.setDuration(500L);
            this.f73799v = objectAnimatorOfFloat;
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(imageView, "rotation", 180.0f, 360.0f);
            objectAnimatorOfFloat2.setDuration(500L);
            this.f73800w = objectAnimatorOfFloat2;
        }
        this.f73791n = (RecyclerView) view.findViewById(2131306820);
        this.f73790m = (RecyclerView) view.findViewById(2131306817);
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 != null) {
            GridLayoutManager gridLayoutManager = new GridLayoutManager(fragmentActivityP3, 4);
            gridLayoutManager.setSmoothScrollbarEnabled(true);
            RecyclerView recyclerView = this.f73791n;
            if (recyclerView != null) {
                recyclerView.setLayoutManager(gridLayoutManager);
            }
            RecyclerView recyclerView2 = this.f73791n;
            if (recyclerView2 != null) {
                recyclerView2.addItemDecoration(new Jm0.o((int) ((1.0f * fragmentActivityP3.getResources().getDisplayMetrics().density) + 0.5f)));
            }
            Jm0.f fVar = new Jm0.f(fragmentActivityP3, this.f73779B.getVersion() <= 0 ? this.f73779B.getCameraEnable() : this.f73779B.getImageCameraEnable() || this.f73779B.getVideoCameraEnable());
            this.f73797t = fVar;
            fVar.f11539f = this.f73779B.getMaxImageCount();
            RecyclerView recyclerView3 = this.f73791n;
            if (recyclerView3 != null) {
                recyclerView3.setAdapter(this.f73797t);
            }
            final RecyclerView recyclerView4 = this.f73790m;
            if (recyclerView4 != 0) {
                this.f73796s = new Jm0.h(fragmentActivityP3);
                recyclerView4.setLayoutManager(new LinearLayoutManager(fragmentActivityP3, 1, false));
                final ?? itemDecoration = new RecyclerView.ItemDecoration();
                itemDecoration.f16229a = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
                itemDecoration.f16230b = new Path();
                recyclerView4.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener(itemDecoration, recyclerView4) { // from class: Mm0.b

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final C2681c f16227a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final RecyclerView f16228b;

                    {
                        this.f16227a = itemDecoration;
                        this.f16228b = recyclerView4;
                    }

                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public final void onGlobalLayout() {
                        C2681c c2681c = this.f16227a;
                        RecyclerView recyclerView5 = this.f16228b;
                        if (c2681c.f16231c == recyclerView5.getMeasuredWidth() && c2681c.f16232d == recyclerView5.getMeasuredHeight()) {
                            return;
                        }
                        c2681c.f16231c = recyclerView5.getMeasuredWidth();
                        int measuredHeight = recyclerView5.getMeasuredHeight();
                        c2681c.f16232d = measuredHeight;
                        c2681c.f16229a.set(0.0f, 0.0f, c2681c.f16231c, measuredHeight);
                        Path path = new Path();
                        c2681c.f16230b = path;
                        path.reset();
                        Path path2 = c2681c.f16230b;
                        RectF rectF = c2681c.f16229a;
                        float f7 = 0;
                        float f8 = c2681c.f16233e;
                        float f9 = c2681c.f16234f;
                        path2.addRoundRect(rectF, new float[]{f7, f7, f7, f7, f8, f8, f9, f9}, Path.Direction.CCW);
                    }
                });
                int i9 = (int) ((fragmentActivityP3.getResources().getDisplayMetrics().density * 8.0f) + 0.5f);
                int i10 = (int) ((8.0f * fragmentActivityP3.getResources().getDisplayMetrics().density) + 0.5f);
                itemDecoration.f16233e = i9;
                itemDecoration.f16234f = i10;
                recyclerView4.addItemDecoration(itemDecoration);
                recyclerView4.setAdapter(this.f73796s);
                ((WindowManager) recyclerView4.getContext().getSystemService("window")).getDefaultDisplay().getRealMetrics(new DisplayMetrics());
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(recyclerView4, "translationY", -r0.heightPixels, 0.0f);
                objectAnimatorOfFloat3.setDuration(500L);
                this.f73801x = objectAnimatorOfFloat3;
                ((WindowManager) recyclerView4.getContext().getSystemService("window")).getDefaultDisplay().getRealMetrics(new DisplayMetrics());
                ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(recyclerView4, "translationY", 0.0f, -r0.heightPixels);
                objectAnimatorOfFloat4.setDuration(500L);
                objectAnimatorOfFloat4.addListener(new r(this));
                this.f73802y = objectAnimatorOfFloat4;
            }
        }
        this.f73792o = (TextView) view.findViewById(2131306544);
        this.f73793p = (LinearLayout) view.findViewById(2131305661);
        ImageView imageView2 = (ImageView) view.findViewById(2131308513);
        this.f73794q = imageView2;
        if (imageView2 != null) {
            imageView2.setSelected(this.f73779B.isOriginalMedia());
        }
        LinearLayout linearLayout3 = this.f73793p;
        if (linearLayout3 != null) {
            if (this.f73779B.getOriginalMediaButtonEnable()) {
                i7 = 0;
            }
            linearLayout3.setVisibility(i7);
        }
        this.f73795r = (TextView) view.findViewById(2131306545);
        if (this.f73779B.getShowSkip()) {
            View viewFindViewById = view.findViewById(2131306819);
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(0);
            }
            if (viewFindViewById != null) {
                viewFindViewById.setOnClickListener(new ViewOnClickListenerC5565s(new Ref.LongRef(), viewFindViewById, this));
            }
        }
        FragmentActivity fragmentActivityP32 = p3();
        if (fragmentActivityP32 != null) {
            Jm0.q.f11566a = new WeakReference<>(fragmentActivityP32);
        }
        Neurons.reportExposure$default(false, "mall.circle-publish.album.0.show", MapsKt.mapOf(new Pair[]{TuplesKt.to("is_need_text", String.valueOf(this.f73779B.isNeedText())), TuplesKt.to("tab_Index", String.valueOf(this.f73779B.getTabIndex()))}), (List) null, 8, (Object) null);
        ImageView imageView3 = this.h;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new ViewOnClickListenerC5558k(new Ref.LongRef(), imageView3, this));
        }
        ConstraintLayout constraintLayout4 = this.f73786i;
        if (constraintLayout4 != null) {
            constraintLayout4.setOnClickListener(new ViewOnClickListenerC5559l(new Ref.LongRef(), constraintLayout4, this));
        }
        Jm0.f fVar2 = this.f73797t;
        if (fVar2 != null) {
            fVar2.h = new C5563p(this);
        }
        if (fVar2 != null) {
            fVar2.f11541i = new C5564q(this);
        }
        View view2 = this.f73789l;
        if (view2 != null) {
            view2.setOnClickListener(new ViewOnClickListenerC5560m(new Ref.LongRef(), view2, this));
        }
        Jm0.h hVar = this.f73796s;
        if (hVar != null) {
            ?? obj = new Object();
            ((Yg1.b) obj).a = this;
            hVar.f11549d = obj;
        }
        TextView textView2 = this.f73792o;
        if (textView2 != null) {
            textView2.setOnClickListener(new ViewOnClickListenerC5561n(new Ref.LongRef(), textView2, this));
        }
        LinearLayout linearLayout4 = this.f73793p;
        if (linearLayout4 != null) {
            linearLayout4.setOnClickListener(new EP.b(this, 1));
        }
        TextView textView3 = this.f73795r;
        if (textView3 != null) {
            textView3.setOnClickListener(new ViewOnClickListenerC5562o(new Ref.LongRef(), textView3, this));
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        FragmentActivity fragmentActivityP33 = p3();
        if (fragmentActivityP33 != null) {
            Lifecycle lifecycle = fragmentActivityP33.getLifecycle();
            String hintMsg = this.f73779B.getHintMsg();
            PermissionsChecker.grantExternalPermission(fragmentActivityP33, false, lifecycle, (hintMsg == null || hintMsg.length() == 0) ? getString(2131829673) : this.f73779B.getHintMsg()).continueWith(new Continuation(jCurrentTimeMillis, this) { // from class: com.bilibili.opd.app.bizcommon.imageselector.page.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final long f73892a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final MallMediaFragment f73893b;

                {
                    this.f73892a = jCurrentTimeMillis;
                    this.f73893b = this;
                }

                @Override // bolts.Continuation
                public final Object then(Task task) {
                    Unit unit;
                    MutableLiveData<ConcurrentSkipListMap<String, C2424a>> mutableLiveData;
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    long j7 = this.f73892a;
                    boolean zIsCancelled = task.isCancelled();
                    final MallMediaFragment mallMediaFragment = this.f73893b;
                    if (!zIsCancelled && !task.isFaulted()) {
                        mallMediaFragment.mf(mallMediaFragment.p3());
                        C2423A c2423a = (C2423A) new ViewModelProvider(mallMediaFragment).get(C2423A.class);
                        mallMediaFragment.f73803z = c2423a;
                        if (c2423a != null) {
                            MallMediaParams mallMediaParams = mallMediaFragment.f73779B;
                            c2423a.f11517s = SystemClock.elapsedRealtime();
                            BLog.i("MallMediaViewModel", "loadMedia");
                            MallTaskRunner.getInstance().submit(new Runnable(c2423a, mallMediaParams) { // from class: Jm0.y

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final C2423A f11587a;

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final MallMediaParams f11588b;

                                {
                                    this.f11587a = c2423a;
                                    this.f11588b = mallMediaParams;
                                }

                                /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
                                    java.lang.NullPointerException
                                    */
                                @Override // java.lang.Runnable
                                public final void run() {
                                    /*
                                        Method dump skipped, instruction units count: 1601
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: Jm0.y.run():void");
                                }
                            });
                        }
                        C2423A c2423a2 = mallMediaFragment.f73803z;
                        if (c2423a2 != null && (mutableLiveData = c2423a2.f11511m) != null) {
                            mutableLiveData.observe(mallMediaFragment.getViewLifecycleOwner(), new MallMediaFragment.c(new C5554g(mallMediaFragment, 0)));
                        }
                        ComposeView composeView = mallMediaFragment.f73784f;
                        if (composeView != null) {
                            composeView.setContent(ComposableLambdaKt.composableLambdaInstance(1832838300, true, new com.bilibili.biligame.ui.pointmall.lottery.e(mallMediaFragment, 1)));
                        }
                    } else {
                        if (jCurrentTimeMillis2 - j7 > 1500) {
                            mallMediaFragment.finishAttachedActivity();
                            unit = Unit.INSTANCE;
                            return unit;
                        }
                        mallMediaFragment.getClass();
                        new AlertDialog.Builder(mallMediaFragment.getContext()).setTitle(2131839793).setMessage(2131839794).setPositiveButton(2131839795, new DialogInterface.OnClickListener(mallMediaFragment) { // from class: com.bilibili.opd.app.bizcommon.imageselector.page.e

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final MallMediaFragment f73896a;

                            {
                                this.f73896a = mallMediaFragment;
                            }

                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i11) {
                                MallMediaFragment mallMediaFragment2 = this.f73896a;
                                if (mallMediaFragment2.getContext() == null) {
                                    return;
                                }
                                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                                intent.setData(Uri.parse("package:" + mallMediaFragment2.requireContext().getPackageName()));
                                intent.addFlags(BLMobileHumanActionNative.BL_MOBILE_ENABLE_DYNAMIC_GESTURE);
                                mallMediaFragment2.startActivity(intent);
                                dialogInterface.dismiss();
                            }
                        }).setNegativeButton(2131839796, new DialogInterface.OnClickListener(mallMediaFragment) { // from class: com.bilibili.opd.app.bizcommon.imageselector.page.f

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final MallMediaFragment f73897a;

                            {
                                this.f73897a = mallMediaFragment;
                            }

                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i11) {
                                MallMediaFragment mallMediaFragment2 = this.f73897a;
                                dialogInterface.dismiss();
                                mallMediaFragment2.finishAttachedActivity();
                            }
                        }).show();
                    }
                    unit = Unit.INSTANCE;
                    return unit;
                }
            }, Task.UI_THREAD_EXECUTOR);
        }
    }

    public final void setMText2Img(@Nullable ComposeView composeView) {
        this.f73784f = composeView;
    }

    public final void setMmParams(@NotNull MallMediaParams mallMediaParams) {
        this.f73779B = mallMediaParams;
    }

    public final void setSubmitSelectImgsListener(@NotNull b bVar) {
    }

    @Override // com.bilibili.opd.app.bizcommon.imageselector.page.MallMediaBaseFragment
    public boolean supportToolbar() {
        return false;
    }
}
