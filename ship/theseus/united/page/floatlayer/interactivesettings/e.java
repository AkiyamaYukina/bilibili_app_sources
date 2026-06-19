package com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings;

import EB.x;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings.InteractiveSettingsComponent$bindToView$2;
import dv0.K;
import dv0.L;
import dv0.N;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/interactivesettings/e.class */
@StabilityInferred(parameters = 0)
public final class e extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<InteractionSection> f99810a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public InteractiveSettingsComponent$bindToView$2.AnonymousClass4.AnonymousClass1.a f99811b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/interactivesettings/e$a.class */
    public final class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final N f99812a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final C0991a f99813b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e f99814c;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings.e$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/interactivesettings/e$a$a.class */
        public final class C0991a extends RecyclerView.Adapter<c> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final List<InteractionItem> f99815a = new ArrayList();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final a f99816b;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings.e$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/interactivesettings/e$a$a$a.class */
            public final class C0992a extends c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                @NotNull
                public final K f99817a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final C0991a f99818b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0992a(@NotNull C0991a c0991a, K k7) {
                    super(k7.f116804a);
                    this.f99818b = c0991a;
                    this.f99817a = k7;
                }

                @Override // com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings.e.a.C0991a.c
                public final void p0(int i7) {
                    if (i7 >= 0) {
                        C0991a c0991a = this.f99818b;
                        if (i7 < c0991a.getItemCount()) {
                            InteractionItem interactionItem = (InteractionItem) ((ArrayList) c0991a.f99815a).get(i7);
                            K k7 = this.f99817a;
                            boolean z6 = true;
                            k7.f116805b.setVisibility(i7 < c0991a.getItemCount() - 1 ? 0 : 8);
                            k7.f116807d.setText(interactionItem.e());
                            ImageView imageView = k7.f116806c;
                            if (interactionItem.f() != InteractionItemStatus.On.getStatus()) {
                                z6 = false;
                            }
                            imageView.setSelected(z6);
                            k7.f116806c.setOnClickListener(new com.bilibili.bililive.biz.uicommon.widget.a(1, c0991a.f99816b.f99814c, interactionItem));
                            return;
                        }
                    }
                    BLog.e("InteractiveSettingsSectionAdapter$InteractiveSettingsSectionHolder$InteractiveSettingsItemsAdapter$InteractiveSettingsCheckItemHolder-bind", "[theseus-united-InteractiveSettingsSectionAdapter$InteractiveSettingsSectionHolder$InteractiveSettingsItemsAdapter$InteractiveSettingsCheckItemHolder-bind] item position out of bounds", (Throwable) null);
                }
            }

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings.e$a$a$b */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/interactivesettings/e$a$a$b.class */
            public final class b extends c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                @NotNull
                public final L f99819a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final C0991a f99820b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(@NotNull C0991a c0991a, L l7) {
                    super(l7.f116822a);
                    this.f99820b = c0991a;
                    this.f99819a = l7;
                }

                @Override // com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings.e.a.C0991a.c
                public final void p0(int i7) {
                    if (i7 >= 0) {
                        C0991a c0991a = this.f99820b;
                        if (i7 < c0991a.getItemCount()) {
                            InteractionItem interactionItem = (InteractionItem) ((ArrayList) c0991a.f99815a).get(i7);
                            L l7 = this.f99819a;
                            l7.f116823b.setVisibility(i7 < c0991a.getItemCount() - 1 ? 0 : 4);
                            l7.f116825d.setText(interactionItem.e());
                            if (interactionItem.g().length() > 0) {
                                l7.f116824c.setText(interactionItem.g());
                                l7.f116824c.setVisibility(0);
                            } else {
                                l7.f116824c.setVisibility(8);
                            }
                            l7.f116822a.setOnClickListener(new x(2, c0991a.f99816b.f99814c, interactionItem));
                            return;
                        }
                    }
                    BLog.e("InteractiveSettingsSectionAdapter$InteractiveSettingsSectionHolder$InteractiveSettingsItemsAdapter$InteractiveSettingsClickItemHolder-bind", "[theseus-united-InteractiveSettingsSectionAdapter$InteractiveSettingsSectionHolder$InteractiveSettingsItemsAdapter$InteractiveSettingsClickItemHolder-bind] item position out of bounds", (Throwable) null);
                }
            }

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings.e$a$a$c */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/interactivesettings/e$a$a$c.class */
            public class c extends RecyclerView.ViewHolder {
                public c() {
                    throw null;
                }

                public void p0(int i7) {
                }
            }

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings.e$a$a$d */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/interactivesettings/e$a$a$d.class */
            public final class d extends c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                @NotNull
                public final View f99821a;

                public d(@NotNull View view) {
                    super(view);
                    this.f99821a = view;
                }
            }

            public C0991a(a aVar) {
                this.f99816b = aVar;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public final int getItemCount() {
                return ((ArrayList) this.f99815a).size();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public final int getItemViewType(int i7) {
                InteractionItem interactionItem = (InteractionItem) CollectionsKt.getOrNull(this.f99815a, i7);
                return interactionItem != null ? interactionItem.h() : InteractionItemType.Unknown.getType();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
                ((c) viewHolder).p0(i7);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
                return (i7 == InteractionItemType.UploaderProtected.getType() || i7 == InteractionItemType.DanmakuInterceptWords.getType() || i7 == InteractionItemType.CommentInterceptWords.getType()) ? new b(this, L.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false)) : (i7 == InteractionItemType.DanmakuSwitch.getType() || i7 == InteractionItemType.CommentSwitch.getType() || i7 == InteractionItemType.NiceCommentSwitch.getType() || i7 == InteractionItemType.ChargeCommentSwitch.getType()) ? new C0992a(this, K.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false)) : new d(new FrameLayout(viewGroup.getContext()));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull e eVar, N n7) {
            super(n7.f116829a);
            this.f99814c = eVar;
            this.f99812a = n7;
            this.f99813b = new C0991a(this);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return ((ArrayList) this.f99810a).size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        a aVar = (a) viewHolder;
        if (i7 >= 0) {
            e eVar = aVar.f99814c;
            if (i7 < eVar.getItemCount()) {
                InteractionSection interactionSection = (InteractionSection) ((ArrayList) eVar.f99810a).get(i7);
                N n7 = aVar.f99812a;
                n7.f116832d.setText(interactionSection.f());
                n7.f116831c.setText(interactionSection.e());
                RecyclerView recyclerView = n7.f116830b;
                a.C0991a c0991a = aVar.f99813b;
                recyclerView.setAdapter(c0991a);
                List<InteractionItem> listD = interactionSection.d();
                if (Intrinsics.areEqual(listD, c0991a.f99815a)) {
                    return;
                }
                ((ArrayList) c0991a.f99815a).clear();
                List<InteractionItem> list = c0991a.f99815a;
                ((ArrayList) list).addAll(listD);
                c0991a.notifyDataSetChanged();
                return;
            }
        } else {
            aVar.getClass();
        }
        BLog.e("InteractiveSettingsSectionAdapter$InteractiveSettingsSectionHolder-bind", "[theseus-united-InteractiveSettingsSectionAdapter$InteractiveSettingsSectionHolder-bind] section position out of bounds", (Throwable) null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        return new a(this, N.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
    }
}
