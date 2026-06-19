package com.bilibili.music.podcast.legacy.fragment;

import Ai0.C1410b;
import Ai0.C1411c;
import Bi0.C1431a;
import Bi0.C1432b;
import Bi0.C1433c;
import Bi0.C1436f;
import Bi0.g;
import Bi0.h;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.compose.runtime.snapshots.z;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager.widget.ViewPager;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.category.Z;
import com.bilibili.droid.BundleUtil;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.router.Router;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.lib.ui.ITabRefresh;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.music.podcast.legacy.upspace.AudioResponse;
import com.bilibili.music.podcast.view.LoadingErrorEmptyView;
import com.bilibili.music.podcast.view.MusicContributeContainer;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import tv.danmaku.biliplayerv2.utils.DpUtils;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/legacy/fragment/UPSpaceFragment.class */
public class UPSpaceFragment extends BaseFragment implements SwipeRefreshLayout.OnRefreshListener, View.OnClickListener, ITabRefresh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f66854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SwipeRefreshLayout f66855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f66856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f66857e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f66858f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f66859g;
    public C1410b h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f66860i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<AudioResponse.Audio> f66861j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public LoadingErrorEmptyView f66862k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public MusicContributeContainer f66863l;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/legacy/fragment/UPSpaceFragment$a.class */
    public final class a extends RecyclerView.Adapter<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UPSpaceFragment f66864a;

        public a(UPSpaceFragment uPSpaceFragment) {
            this.f66864a = uPSpaceFragment;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return ((ArrayList) this.f66864a.f66861j).size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
            b bVar = (b) viewHolder;
            AudioResponse.Audio audio = (AudioResponse.Audio) ((ArrayList) bVar.f66871g.f66861j).get(i7);
            if (audio.isContributor()) {
                g.b(bVar.f66865a, audio.title);
            } else {
                TextView textView = bVar.f66865a;
                String str = audio.title;
                if (audio.authType == 1) {
                    textView.setText(new SpannableStringBuilder().append(g.a(textView, textView.getContext().getString(2131831739), ThemeUtils.getColorById(textView.getContext(), 2131103284), ThemeUtils.getColor(textView.getContext(), ContextCompat.getColor(textView.getContext(), R$color.Ga5)), ThemeUtils.getColorById(textView.getContext(), 2131103284))).append((CharSequence) str));
                } else {
                    textView.setText(str);
                }
            }
            bVar.f66866b.setText(audio.ctimeFmt);
            bVar.f66867c.setText(h.a(audio.play));
            bVar.f66868d.setText(h.a(audio.reply));
            TextView textView2 = bVar.f66869e;
            long j7 = audio.duration;
            textView2.setText(j7 < 3600 ? Z.a(j7 * 1000, C1432b.f783b) : Z.a(j7 * 1000, C1432b.f782a));
            BiliImageLoader biliImageLoader = BiliImageLoader.INSTANCE;
            BiliImageView biliImageView = bVar.f66870f;
            biliImageLoader.with(biliImageView.getContext()).url(audio.cover).placeholderImageResId(2131238203).into(biliImageView);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
            UPSpaceFragment uPSpaceFragment = this.f66864a;
            b bVar = new b(uPSpaceFragment, LayoutInflater.from(uPSpaceFragment.getContext()).inflate(2131499539, viewGroup, false));
            bVar.itemView.setOnClickListener(new com.bilibili.music.podcast.legacy.fragment.a(this, bVar));
            return bVar;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/legacy/fragment/UPSpaceFragment$b.class */
    public final class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f66865a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f66866b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f66867c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextView f66868d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final TextView f66869e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final BiliImageView f66870f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final UPSpaceFragment f66871g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(UPSpaceFragment uPSpaceFragment, View view) {
            super(view);
            this.f66871g = uPSpaceFragment;
            this.f66865a = (TextView) view.findViewById(2131310619);
            this.f66866b = (TextView) view.findViewById(2131314384);
            this.f66867c = (TextView) view.findViewById(2131314762);
            this.f66868d = (TextView) view.findViewById(2131314317);
            this.f66869e = (TextView) view.findViewById(2131311242);
            this.f66870f = view.findViewById(2131302584);
        }
    }

    public final void jf(long j7) {
        if (getContext() != null) {
            if (j7 == -1) {
                C1436f.a("main.space-contribution.audio.all.click", getContext(), this.f66860i, -1L);
            } else {
                C1436f.a("main.space-contribution.audio.content.click", getContext(), this.f66860i, j7);
            }
        }
        Router.RouterProxy routerProxyWith = Router.global().with(getContext());
        StringBuilder sbA = z.a(j7, "bilibili://music/detail/", "?source=1&id=");
        sbA.append(this.f66860i);
        routerProxyWith.open(sbA.toString());
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.f66856d) {
            C1431a.b().getClass();
            String[] strArr = new String[10];
            Arrays.fill(strArr, "");
            strArr[0] = "space";
            strArr[1] = "space_click_all";
            C1431a.a("000154", strArr);
            jf(-1L);
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f66860i = BundleUtil.getLong(getArguments(), EditCustomizeSticker.TAG_MID, new long[]{0});
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131499553, viewGroup, false);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.h.f308a = 1;
        super.onDestroyView();
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public final void onRefresh() {
        C1410b c1410b = this.h;
        if (c1410b.f314g) {
            this.f66855c.setRefreshing(false);
        } else {
            c1410b.f311d = 1;
            c1410b.a(1, c1410b.f312e, true);
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putLong(EditCustomizeSticker.TAG_MID, this.f66860i);
    }

    @Override // com.bilibili.lib.ui.ITabRefresh
    public final void onTabRefresh() {
        if (this.h.f314g || this.f66854b == null) {
            return;
        }
        MusicContributeContainer musicContributeContainer = this.f66863l;
        View view = musicContributeContainer.f67055a;
        if (view != null) {
            view.setTranslationY(0.0f);
        }
        RecyclerView recyclerView = musicContributeContainer.f67057c;
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(musicContributeContainer.h);
        }
        musicContributeContainer.f67061g = 0;
        musicContributeContainer.f67060f = 0;
        musicContributeContainer.f67056b = null;
        musicContributeContainer.f67058d = null;
        this.f66855c.setRefreshing(true);
        RecyclerView.LayoutManager layoutManager = this.f66854b.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            this.f66854b.stopScroll();
            ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(0, 0);
        }
        onRefresh();
    }

    /* JADX WARN: Type inference failed for: r0v80, types: [Ai0.b, java.lang.Object] */
    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f66856d = view.findViewById(2131308293);
        this.f66863l = (MusicContributeContainer) view.findViewById(2131299426);
        this.f66857e = view.findViewById(2131304990);
        this.f66858f = (TextView) view.findViewById(2131313766);
        this.f66854b = (RecyclerView) view.findViewById(2131310064);
        this.f66862k = (LoadingErrorEmptyView) view.findViewById(2131304945);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(2131312769);
        this.f66855c = swipeRefreshLayout;
        swipeRefreshLayout.setOnRefreshListener(this);
        this.f66855c.setColorSchemeColors(ThemeUtils.getColorById(getContext(), 2131103284));
        this.f66854b.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f66856d.setOnClickListener(this);
        a aVar = new a(this);
        this.f66859g = aVar;
        this.f66854b.setAdapter(aVar);
        if (this.h == null) {
            if (C1411c.f315b == null) {
                synchronized (C1411c.class) {
                    try {
                        if (C1411c.f315b == null) {
                            C1411c.f315b = new C1411c();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            C1411c c1411c = C1411c.f315b;
            long j7 = this.f66860i;
            ?? obj = new Object();
            obj.f308a = 0;
            obj.f313f = true;
            obj.h = new AudioResponse();
            obj.f310c = this;
            obj.f309b = c1411c;
            obj.f312e = j7;
            this.h = obj;
        }
        C1410b c1410b = this.h;
        c1410b.f308a = 0;
        this.f66854b.addOnScrollListener(new C1433c(c1410b));
        if (((ArrayList) this.f66861j).size() == 0) {
            C1410b c1410b2 = this.h;
            c1410b2.f311d = 1;
            c1410b2.a(1, c1410b2.f312e, true);
        } else {
            this.f66862k.b();
            this.f66859g.notifyDataSetChanged();
        }
        if (getParentFragment() != null) {
            View view2 = getParentFragment().getView();
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                    if (viewGroup.getChildAt(i7) instanceof ViewPager) {
                        ((ViewGroup.MarginLayoutParams) this.f66856d.getLayoutParams()).topMargin = ((ViewPager) viewGroup.getChildAt(i7)).getAdapter().getCount() == 1 ? 0 : (int) DpUtils.dp2px(getContext(), 40.0f);
                        RecyclerView recyclerView = this.f66854b;
                        recyclerView.setPadding(recyclerView.getPaddingLeft(), ((ViewGroup.MarginLayoutParams) this.f66856d.getLayoutParams()).topMargin + ((int) DpUtils.dp2px(getContext(), 40.0f)), this.f66854b.getPaddingRight(), this.f66854b.getPaddingBottom());
                        this.f66854b.setClipToPadding(false);
                    }
                }
            }
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onViewStateRestored(@Nullable Bundle bundle) {
        super.onViewStateRestored(bundle);
        if (bundle != null) {
            this.f66860i = bundle.getLong(EditCustomizeSticker.TAG_MID);
        }
    }
}
