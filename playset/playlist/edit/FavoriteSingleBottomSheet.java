package com.bilibili.playset.playlist.edit;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.droid.ScreenUtil;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.magicasakura.widgets.TintProgressDialog;
import com.bilibili.playset.api.MultitypeMedia;
import com.bilibili.playset.api.PlaySet;
import com.bilibili.playset.playlist.edit.PlaylistEditFragment;
import com.bilibili.playset.playlist.helper.b;
import com.google.android.material.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.android.HandlerDispatcherKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.ui.watchlater.viewmodel.WatchLaterViewModel;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/edit/FavoriteSingleBottomSheet.class */
@StabilityInferred(parameters = 0)
public final class FavoriteSingleBottomSheet extends BottomSheetDialogFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public PlaylistEditFragment.f f85199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public WatchLaterViewModel.onAction.1.a f85200c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public a f85202e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public CompositeDisposable f85203f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public RecyclerView f85204g;

    @Nullable
    public TintProgressDialog h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f85207k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f85209m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f85211o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f85212p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f85213q;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final List<PlaySet> f85201d = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f85205i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public String f85206j = "";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f85208l = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f85210n = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f85214r = -1;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/edit/FavoriteSingleBottomSheet$a.class */
    public final class a extends RecyclerView.Adapter<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FavoriteSingleBottomSheet f85215a;

        public a(FavoriteSingleBottomSheet favoriteSingleBottomSheet) {
            this.f85215a = favoriteSingleBottomSheet;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return ((ArrayList) this.f85215a.f85201d).size();
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [androidx.fragment.app.Fragment, com.bilibili.playset.playlist.edit.FavoriteSingleBottomSheet] */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i7) {
            Application fapp;
            int i8;
            b bVar = (b) viewHolder;
            final ?? r02 = this.f85215a;
            PlaySet playSet = (PlaySet) CollectionsKt.getOrNull(r02.f85201d, i7);
            String str = null;
            if (playSet == null || playSet.id != r02.f85205i) {
                bVar.f85216a.setTextColor(ThemeUtils.getColorById(r02.p3(), 2131101212));
                bVar.f85217b.setTextColor(ThemeUtils.getColorById(r02.p3(), 2131101245));
                bVar.f85218c.setTextColor(ThemeUtils.getColorById(r02.p3(), 2131101245));
                bVar.itemView.setOnClickListener(new View.OnClickListener(r02, i7) { // from class: com.bilibili.playset.playlist.edit.c

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final FavoriteSingleBottomSheet f85302a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final int f85303b;

                    {
                        this.f85302a = r02;
                        this.f85303b = i7;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
                    /* JADX WARN: Removed duplicated region for block: B:78:0x0247  */
                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.fragment.app.Fragment, com.bilibili.playset.playlist.edit.FavoriteSingleBottomSheet] */
                    @Override // android.view.View.OnClickListener
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void onClick(android.view.View r14) {
                        /*
                            Method dump skipped, instruction units count: 995
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.playlist.edit.c.onClick(android.view.View):void");
                    }
                });
            } else {
                int colorById = ThemeUtils.getColorById(r02.p3(), R$color.Ga5);
                bVar.f85216a.setTextColor(colorById);
                bVar.f85217b.setTextColor(colorById);
                bVar.f85218c.setTextColor(colorById);
                bVar.itemView.setOnClickListener(null);
            }
            TextView textView = bVar.f85216a;
            if (playSet != null) {
                str = playSet.title;
            }
            textView.setText(str);
            if (playSet == null || !playSet.isKidPlaylist) {
                TextView textView2 = bVar.f85219d;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
            } else {
                TextView textView3 = bVar.f85219d;
                if (textView3 != null) {
                    textView3.setVisibility(0);
                }
                String config = ConfigManager.Companion.getConfig("space.kid_playlist_tag_name", "");
                String str2 = config;
                if (config.length() == 0) {
                    str2 = "宝贝片单";
                }
                TextView textView4 = bVar.f85219d;
                if (textView4 != null) {
                    textView4.setText(str2);
                }
            }
            TextView textView5 = bVar.f85217b;
            if (((playSet != null ? playSet.attr : 0) & 1) == 0) {
                fapp = FoundationAlias.getFapp();
                i8 = 2131833183;
            } else {
                fapp = FoundationAlias.getFapp();
                i8 = 2131833182;
            }
            textView5.setText(fapp.getString(i8));
            TextView textView6 = bVar.f85218c;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            textView6.setText(String.format(FoundationAlias.getFapp().getString(2131842579), Arrays.copyOf(new Object[]{Integer.valueOf(playSet != null ? playSet.count : 0)}, 1)));
            if (i7 == getItemCount() - 1) {
                bVar.f85220e.setVisibility(4);
            } else {
                bVar.f85220e.setVisibility(0);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
            return new b(LayoutInflater.from(this.f85215a.getContext()).inflate(2131499736, viewGroup, false));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/edit/FavoriteSingleBottomSheet$b.class */
    public static final class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final TextView f85216a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final TextView f85217b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final TextView f85218c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final TextView f85219d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final View f85220e;

        public b(@NotNull View view) {
            super(view);
            this.f85216a = (TextView) view.findViewById(2131308958);
            this.f85217b = (TextView) view.findViewById(2131301437);
            this.f85218c = (TextView) view.findViewById(2131301430);
            this.f85219d = (TextView) view.findViewById(2131321840);
            this.f85220e = view.findViewById(2131303070);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/edit/FavoriteSingleBottomSheet$c.class */
    public final class c extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FavoriteSingleBottomSheet f85221a;

        public c(FavoriteSingleBottomSheet favoriteSingleBottomSheet) {
            this.f85221a = favoriteSingleBottomSheet;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [androidx.fragment.app.Fragment, com.bilibili.playset.playlist.edit.FavoriteSingleBottomSheet] */
        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrolled(@NotNull RecyclerView recyclerView, int i7, int i8) {
            LifecycleOwner value;
            LifecycleCoroutineScope lifecycleScope;
            int childCount = recyclerView.getChildCount();
            if (childCount > 0) {
                ?? r02 = this.f85221a;
                if (((ArrayList) r02.f85201d).size() >= r02.f85211o || r02.f85212p) {
                    return;
                }
                View childAt = recyclerView.getChildAt(childCount - 1);
                RecyclerView.Adapter adapter = recyclerView.getAdapter();
                int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
                if (adapter == null || childAdapterPosition != adapter.getItemCount() - 1 || (value = r02.getViewLifecycleOwnerLiveData().getValue()) == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(value)) == null) {
                    return;
                }
                BuildersKt.launch$default(lifecycleScope, (CoroutineContext) null, (CoroutineStart) null, new FavoriteSingleBottomSheet$loadNextPage$1(r02, null), 3, (Object) null);
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.playset.playlist.edit.FavoriteSingleBottomSheet$onActivityResult$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/edit/FavoriteSingleBottomSheet$onActivityResult$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final FavoriteSingleBottomSheet this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(FavoriteSingleBottomSheet favoriteSingleBottomSheet, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = favoriteSingleBottomSheet;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                FavoriteSingleBottomSheet favoriteSingleBottomSheet = this.this$0;
                this.label = 1;
                if (FavoriteSingleBottomSheet.jf(favoriteSingleBottomSheet, true, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.playset.playlist.edit.FavoriteSingleBottomSheet$onViewCreated$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/edit/FavoriteSingleBottomSheet$onViewCreated$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final FavoriteSingleBottomSheet this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(FavoriteSingleBottomSheet favoriteSingleBottomSheet, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = favoriteSingleBottomSheet;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (HandlerDispatcherKt.awaitFrame(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            View viewLf = FavoriteSingleBottomSheet.lf(this.this$0.getView());
            if (viewLf == null) {
                return Unit.INSTANCE;
            }
            ViewGroup.LayoutParams layoutParams = viewLf.getLayoutParams();
            int screenHeight = (ScreenUtil.getScreenHeight(viewLf.getContext()) * 5) / 9;
            layoutParams.height = screenHeight;
            BottomSheetBehavior.from(viewLf).setPeekHeight(screenHeight);
            View view = this.this$0.getView();
            if (view != null) {
                view.requestLayout();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.playset.playlist.edit.FavoriteSingleBottomSheet$onViewCreated$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/edit/FavoriteSingleBottomSheet$onViewCreated$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final FavoriteSingleBottomSheet this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(FavoriteSingleBottomSheet favoriteSingleBottomSheet, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = favoriteSingleBottomSheet;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                FavoriteSingleBottomSheet favoriteSingleBottomSheet = this.this$0;
                this.label = 1;
                if (FavoriteSingleBottomSheet.jf(favoriteSingleBottomSheet, true, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final void hf(FavoriteSingleBottomSheet favoriteSingleBottomSheet) {
        TintProgressDialog tintProgressDialog = favoriteSingleBottomSheet.h;
        if (tintProgressDialog != null) {
            tintProgressDialog.dismiss();
        }
    }

    /* JADX INFO: renamed from: if, reason: not valid java name */
    public static final String m8560if(FavoriteSingleBottomSheet favoriteSingleBottomSheet, List list) {
        favoriteSingleBottomSheet.getClass();
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MultitypeMedia multitypeMedia = (MultitypeMedia) it.next();
            sb.append(multitypeMedia.id);
            sb.append(":");
            sb.append(multitypeMedia.type);
            sb.append(",");
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object jf(com.bilibili.playset.playlist.edit.FavoriteSingleBottomSheet r6, boolean r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.playlist.edit.FavoriteSingleBottomSheet.jf(com.bilibili.playset.playlist.edit.FavoriteSingleBottomSheet, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static View lf(View view) {
        if (view != null && view.getId() == R.id.container) {
            return null;
        }
        ViewParent parent = view != null ? view.getParent() : null;
        if ((parent instanceof CoordinatorLayout) && ((CoordinatorLayout) parent).getId() == R.id.coordinator) {
            return view;
        }
        ViewParent parent2 = view != null ? view.getParent() : null;
        View viewLf = null;
        if (parent2 instanceof View) {
            viewLf = lf((View) parent2);
        }
        return viewLf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean kf() {
        boolean zIsLogin = BiliAccounts.get(getContext()).isLogin();
        if (!zIsLogin) {
            BLRouter.routeTo(new RouteRequest.Builder("activity://main/login/").requestCode(-1).build(), this);
        }
        return zIsLogin;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void mf() {
        if (this.h == null) {
            TintProgressDialog tintProgressDialog = new TintProgressDialog(p3());
            tintProgressDialog.setIndeterminate(true);
            tintProgressDialog.setCancelable(false);
            tintProgressDialog.setMessage(getString(2131841551));
            this.h = tintProgressDialog;
        }
        TintProgressDialog tintProgressDialog2 = this.h;
        if (tintProgressDialog2 != null) {
            tintProgressDialog2.show();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onActivityResult(int i7, int i8, @Nullable Intent intent) {
        String str;
        LifecycleCoroutineScope lifecycleScope;
        super/*androidx.fragment.app.Fragment*/.onActivityResult(i7, i8, intent);
        if (i7 == 18) {
            if (i8 != -1 || intent == null) {
                str = "0";
            } else {
                this.f85214r = intent.getLongExtra("id", -1L);
                PlaylistEditFragment.f fVar = this.f85199b;
                if (fVar != null) {
                    fVar.f85299a.f85258p = true;
                }
                LifecycleOwner value = getViewLifecycleOwnerLiveData().getValue();
                if (value != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(value)) != null) {
                    BuildersKt.launch$default(lifecycleScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
                }
                str = "1";
            }
            String str2 = this.f85206j;
            long j7 = this.f85205i;
            b.a aVar = b.a.f85324a;
            aVar.a("playlist.manage-playlist.batch-favorite.new-folder.click");
            aVar.c("create_status", str);
            String str3 = str2;
            if (str2 == null) {
                str3 = "";
            }
            aVar.c("playlist_type", str3);
            aVar.c("playlist_id", String.valueOf(j7));
            b.a.b();
        }
    }

    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131499722, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDestroyView() {
        CompositeDisposable compositeDisposable;
        CompositeDisposable compositeDisposable2 = this.f85203f;
        if (compositeDisposable2 != null && !compositeDisposable2.isDisposed() && (compositeDisposable = this.f85203f) != null) {
            compositeDisposable.dispose();
        }
        this.f85199b = null;
        this.f85200c = null;
        super/*androidx.fragment.app.DialogFragment*/.onDestroyView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super/*androidx.fragment.app.Fragment*/.onViewCreated(view, bundle);
        this.f85203f = new CompositeDisposable();
        this.f85204g = (RecyclerView) view.findViewById(2131306595);
        TextView textView = (TextView) view.findViewById(2131296647);
        TextView textView2 = (TextView) view.findViewById(2131298762);
        textView.setText(getString(2131842473));
        textView2.setText(getString(2131842535));
        this.f85202e = new a(this);
        RecyclerView recyclerView = this.f85204g;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.addOnScrollListener(new c(this));
            recyclerView.setAdapter(this.f85202e);
        }
        textView.setOnClickListener(new com.bilibili.playset.playlist.edit.b(this, 0));
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f85205i = arguments.getLong("key_media_id", -1L);
            this.f85206j = arguments.getString("key_play_list_type");
            this.f85207k = arguments.getInt("key_select_num");
            this.f85208l = arguments.getInt("key_op_type");
            this.f85209m = arguments.getBoolean("key_from_other");
        }
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
    }
}
