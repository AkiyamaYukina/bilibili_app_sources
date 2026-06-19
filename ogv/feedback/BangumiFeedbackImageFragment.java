package com.bilibili.ogv.feedback;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bolts.Continuation;
import bolts.Task;
import com.bilibili.boxing.Boxing;
import com.bilibili.boxing.model.config.PickerConfig;
import com.bilibili.boxing.model.entity.impl.ImageMedia;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.BiliImageLoaderHelper;
import com.bilibili.lib.image2.bean.IThumbnailSizeController;
import com.bilibili.lib.image2.bean.ResizeOption;
import com.bilibili.lib.image2.bean.ThumbUrlTransformStrategyUtils;
import com.bilibili.lib.image2.common.executors.UiThreadImmediateExecutorService;
import com.bilibili.lib.image2.view.legacy.ScalableImageView2;
import com.bilibili.lib.ui.BaseRecyclerViewFragment;
import com.bilibili.lib.ui.PermissionsChecker;
import com.bilibili.moduleservice.main.ImagePickService;
import com.bilibili.ogv.feedback.BangumiFeedbackImageFragment;
import com.bilibili.ogv.feedback.BaseBangumiFeedbackFragment;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import w8.d;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/feedback/BangumiFeedbackImageFragment.class */
public class BangumiFeedbackImageFragment extends BaseRecyclerViewFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f67561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BaseBangumiFeedbackFragment.a f67562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f67563d = 5;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f67564e = 5;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/feedback/BangumiFeedbackImageFragment$a.class */
    public final class a implements Continuation<Void, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f67565a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BangumiFeedbackImageFragment f67566b;

        public a(BangumiFeedbackImageFragment bangumiFeedbackImageFragment, ArrayList arrayList) {
            this.f67566b = bangumiFeedbackImageFragment;
            this.f67565a = arrayList;
        }

        @Override // bolts.Continuation
        public final Void then(Task<Void> task) throws Exception {
            boolean zIsCancelled = task.isCancelled();
            BangumiFeedbackImageFragment bangumiFeedbackImageFragment = this.f67566b;
            if (zIsCancelled || task.isFaulted()) {
                bangumiFeedbackImageFragment.p3().finish();
                return null;
            }
            ArrayList arrayList = this.f67565a;
            d dVar = bangumiFeedbackImageFragment.f67561b;
            dVar.f67572c.clear();
            dVar.f67572c.addAll(arrayList);
            dVar.notifyDataSetChanged();
            return null;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/feedback/BangumiFeedbackImageFragment$b.class */
    public final class b extends GridLayoutManager.SpanSizeLookup {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RecyclerView f67567a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BangumiFeedbackImageFragment f67568b;

        public b(BangumiFeedbackImageFragment bangumiFeedbackImageFragment, RecyclerView recyclerView) {
            this.f67568b = bangumiFeedbackImageFragment;
            this.f67567a = recyclerView;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public final int getSpanSize(int i7) {
            if (this.f67567a.getAdapter().getItemViewType(i7) == 3) {
                return this.f67568b.f67563d - 1;
            }
            return 1;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/feedback/BangumiFeedbackImageFragment$c.class */
    public final class c extends RecyclerView.ItemDecoration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f67569a;

        public c(int i7) {
            this.f67569a = i7;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            int i7 = this.f67569a;
            rect.set(i7 / 2, i7 / 2, i7, i7 / 2);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/feedback/BangumiFeedbackImageFragment$d.class */
    public static final class d extends RecyclerView.Adapter<h> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference<BangumiFeedbackImageFragment> f67570a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f67571b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList<ImageMedia> f67572c = new ArrayList<>();

        public d(BangumiFeedbackImageFragment bangumiFeedbackImageFragment, int i7) {
            this.f67570a = new WeakReference<>(bangumiFeedbackImageFragment);
            this.f67571b = i7;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            int size = this.f67572c.size();
            if (size == 0) {
                return 2;
            }
            int i7 = size;
            if (size < this.f67571b) {
                i7 = size + 1;
            }
            return i7;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemViewType(int i7) {
            if (this.f67572c.isEmpty() && i7 == 1) {
                return 3;
            }
            return (this.f67572c.size() >= this.f67571b || i7 != this.f67572c.size()) ? 1 : 2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
            h hVar = (h) viewHolder;
            if (!(hVar instanceof g)) {
                if (hVar instanceof e) {
                    e eVar = (e) hVar;
                    eVar.f67573b.setText(eVar.itemView.getResources().getString(2131856377, Integer.toString(this.f67571b)));
                    return;
                }
                return;
            }
            g gVar = (g) hVar;
            ImageMedia imageMedia = this.f67572c.get(i7);
            gVar.getClass();
            File file = new File(imageMedia.getThumbnailPath());
            if (file.exists()) {
                ScalableImageView2 scalableImageView2 = gVar.f67575b;
                BiliImageLoader.INSTANCE.with(scalableImageView2.getContext()).thumbnailUrlTransformStrategy(ThumbUrlTransformStrategyUtils.stylingStrategy$default("common-ogv", (IThumbnailSizeController) null, 2, (Object) null)).url(BiliImageLoaderHelper.fileToUri(file)).resizeOption(new ResizeOption(360, 360)).into(scalableImageView2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v6, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
        /* JADX WARN: Type inference failed for: r8v1 */
        /* JADX WARN: Type inference failed for: r8v2 */
        /* JADX WARN: Type inference failed for: r8v3 */
        /* JADX WARN: Type inference failed for: r8v4, types: [com.bilibili.ogv.feedback.BangumiFeedbackImageFragment$e] */
        /* JADX WARN: Type inference failed for: r8v5 */
        /* JADX WARN: Type inference failed for: r8v6 */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
            ?? gVar;
            if (i7 == 1) {
                gVar = new g(p.a(viewGroup, 2131493301, viewGroup, false), this.f67570a.get());
            } else if (i7 == 2) {
                gVar = new f(p.a(viewGroup, 2131493300, viewGroup, false), this.f67570a.get());
            } else if (i7 != 3) {
                gVar = 0;
            } else {
                BangumiFeedbackImageFragment bangumiFeedbackImageFragment = this.f67570a.get();
                View viewA = p.a(viewGroup, 2131493299, viewGroup, false);
                ?? hVar = new h(viewA, bangumiFeedbackImageFragment);
                hVar.f67573b = (TextView) viewA.findViewById(2131299190);
                gVar = hVar;
            }
            return gVar;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/feedback/BangumiFeedbackImageFragment$e.class */
    public static final class e extends h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f67573b;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/feedback/BangumiFeedbackImageFragment$f.class */
    public static final class f extends h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f67574b;

        public f(View view, BangumiFeedbackImageFragment bangumiFeedbackImageFragment) {
            super(view, bangumiFeedbackImageFragment);
            View viewFindViewById = view.findViewById(2131296642);
            this.f67574b = viewFindViewById;
            viewFindViewById.setOnClickListener(new View.OnClickListener(this) { // from class: vj0.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final BangumiFeedbackImageFragment.f f128268a;

                {
                    this.f128268a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    BangumiFeedbackImageFragment bangumiFeedbackImageFragment2;
                    BaseBangumiFeedbackFragment.a aVar;
                    BangumiFeedbackImageFragment.f fVar = this.f128268a;
                    if (fVar.f67579a.get() == null || (aVar = (bangumiFeedbackImageFragment2 = fVar.f67579a.get()).f67562c) == null) {
                        return;
                    }
                    List<ImageMedia> listJf = bangumiFeedbackImageFragment2.jf();
                    Boxing boxingOf = Boxing.of(new PickerConfig(PickerConfig.Mode.MULTI_IMG).needCamera().withMaxCount(5));
                    BaseBangumiFeedbackFragment baseBangumiFeedbackFragment = aVar.f67591a;
                    FragmentActivity fragmentActivityP3 = baseBangumiFeedbackFragment.p3();
                    ImagePickService imagePickService = (ImagePickService) d.a(BLRouter.INSTANCE, ImagePickService.class, "default");
                    ArrayList arrayList = null;
                    Class<?> imagePickActivityClass = imagePickService != null ? imagePickService.getImagePickActivityClass() : null;
                    if (listJf != null) {
                        arrayList = new ArrayList(listJf);
                    }
                    boxingOf.withIntent(fragmentActivityP3, imagePickActivityClass, arrayList).start(baseBangumiFeedbackFragment, 7788);
                    baseBangumiFeedbackFragment.mf();
                }
            });
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/feedback/BangumiFeedbackImageFragment$g.class */
    public static final class g extends h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ScalableImageView2 f67575b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final View f67576c;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/feedback/BangumiFeedbackImageFragment$g$a.class */
        public final class a implements View.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final g f67577a;

            public a(g gVar) {
                this.f67577a = gVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (this.f67577a.f67579a.get() != null) {
                    BangumiFeedbackImageFragment bangumiFeedbackImageFragment = this.f67577a.f67579a.get();
                    if (bangumiFeedbackImageFragment.f67561b != null) {
                        int adapterPosition = this.f67577a.getAdapterPosition();
                        d dVar = bangumiFeedbackImageFragment.f67561b;
                        if (dVar.f67572c.size() > adapterPosition && adapterPosition >= 0) {
                            dVar.f67572c.remove(adapterPosition);
                            dVar.notifyItemRemoved(adapterPosition);
                        }
                        BaseBangumiFeedbackFragment.a aVar = bangumiFeedbackImageFragment.f67562c;
                        bangumiFeedbackImageFragment.jf();
                        aVar.f67591a.mf();
                    }
                }
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/feedback/BangumiFeedbackImageFragment$g$b.class */
        public final class b implements View.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final g f67578a;

            public b(g gVar) {
                this.f67578a = gVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BangumiFeedbackImageFragment bangumiFeedbackImageFragment;
                BaseBangumiFeedbackFragment.a aVar;
                if (this.f67578a.f67579a.get() == null || (aVar = (bangumiFeedbackImageFragment = this.f67578a.f67579a.get()).f67562c) == null) {
                    return;
                }
                List<ImageMedia> listJf = bangumiFeedbackImageFragment.jf();
                int adapterPosition = this.f67578a.getAdapterPosition();
                Context contextRequireContext = aVar.f67591a.requireContext();
                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("all_images", listJf != null ? new ArrayList<>(listJf) : null);
                bundle.putInt("start", adapterPosition);
                RouteRequest.Builder builder = new RouteRequest.Builder("activity://main/local-viewer");
                builder.getExtras().put("default_extra_bundle", bundle);
                Qj0.g.c(contextRequireContext, builder.build());
            }
        }

        public g(View view, BangumiFeedbackImageFragment bangumiFeedbackImageFragment) {
            super(view, bangumiFeedbackImageFragment);
            ScalableImageView2 scalableImageView2FindViewById = view.findViewById(2131301895);
            this.f67575b = scalableImageView2FindViewById;
            View viewFindViewById = view.findViewById(2131299944);
            this.f67576c = viewFindViewById;
            viewFindViewById.setOnClickListener(new a(this));
            scalableImageView2FindViewById.setOnClickListener(new b(this));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/feedback/BangumiFeedbackImageFragment$h.class */
    public static abstract class h extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference<BangumiFeedbackImageFragment> f67579a;

        public h(View view, BangumiFeedbackImageFragment bangumiFeedbackImageFragment) {
            super(view);
            this.f67579a = new WeakReference<>(bangumiFeedbackImageFragment);
        }
    }

    public final List<ImageMedia> jf() {
        d dVar = this.f67561b;
        return dVar == null ? new ArrayList(0) : dVar.f67572c;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        ArrayList parcelableArrayList;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f67563d = arguments.getInt("SPAN_COUNT", this.f67563d);
            this.f67564e = arguments.getInt("MAX_COUNT", this.f67564e);
        }
        this.f67561b = new d(this, this.f67564e);
        if (bundle == null || (parcelableArrayList = bundle.getParcelableArrayList("SELECTED_IMAGES")) == null || parcelableArrayList.size() <= 0) {
            return;
        }
        PermissionsChecker.grantPermission(this, getLifecycle(), PermissionsChecker.STORAGE_PERMISSIONS, 16, 2131841602, getString(2131856378)).continueWith((Continuation<Void, TContinuationResult>) new a(this, parcelableArrayList), (Executor) UiThreadImmediateExecutorService.getInstance());
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelableArrayList("SELECTED_IMAGES", this.f67561b.f67572c);
    }

    @Override // com.bilibili.lib.ui.BaseRecyclerViewFragment
    public final void onViewCreated(RecyclerView recyclerView, @Nullable Bundle bundle) {
        super.onViewCreated(recyclerView, bundle);
        int i7 = this.f67563d;
        int iApplyDimension = (int) TypedValue.applyDimension(1, 8.0f, getResources().getDisplayMetrics());
        GridLayoutManager gridLayoutManager = new GridLayoutManager(recyclerView.getContext(), i7);
        gridLayoutManager.setSpanSizeLookup(new b(this, recyclerView));
        recyclerView.setLayoutManager(gridLayoutManager);
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i8 = (-iApplyDimension) / 2;
            marginLayoutParams.leftMargin = i8;
            marginLayoutParams.rightMargin = i8;
            marginLayoutParams.topMargin = i8;
            marginLayoutParams.bottomMargin = i8;
        }
        recyclerView.addItemDecoration(new c(iApplyDimension));
        recyclerView.setAdapter(this.f67561b);
    }
}
