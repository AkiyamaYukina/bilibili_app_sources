package com.bilibili.studio.editor.moudle.editormain.ui.widget;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bilibili.bililive.infra.trace.LiveReporter;
import com.bilibili.bililive.room.ui.roomv3.player.RoundStatus;
import com.bilibili.bililive.room.ui.roomv3.vertical.global.LiveRoomVerticalRecommendView;
import com.bilibili.bililive.videoliveplayer.net.beans.gift.BiliLivePackage;
import com.bilibili.bililive.videoliveplayer.net.beans.gift.LiveRoomBaseGift;
import com.bilibili.studio.editor.moudle.editormain.ui.widget.EditorFullScreenControlView;
import com.mall.data.page.ticket.TicketBean;
import com.mall.ui.page.ticket.fragment.MallTicketDetailFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function3;
import nn.f;
import nn.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/widget/EditorFullScreenControlView.class */
public final class EditorFullScreenControlView extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ImageView f107091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TextView f107092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final TextView f107093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final SeekBar f107094d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ViewGroup f107095e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public a f107096f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/widget/EditorFullScreenControlView$a.class */
    public interface a {
        void a();

        void b(long j7);

        void c();

        void d();

        void e();
    }

    @JvmOverloads
    public EditorFullScreenControlView(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    @JvmOverloads
    public EditorFullScreenControlView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public EditorFullScreenControlView(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        View.inflate(context, 2131501967, this);
        ImageView imageView = (ImageView) findViewById(2131319214);
        this.f107091a = imageView;
        this.f107092b = (TextView) findViewById(2131315000);
        this.f107093c = (TextView) findViewById(2131319013);
        ImageView imageView2 = (ImageView) findViewById(2131319211);
        SeekBar seekBar = (SeekBar) findViewById(2131319235);
        this.f107094d = seekBar;
        this.f107095e = (ViewGroup) findViewById(2131319204);
        imageView.setOnClickListener(new Cy0.a(this, 0));
        final int i9 = 0;
        imageView2.setOnClickListener(new View.OnClickListener(this, i9) { // from class: Cy0.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f1882a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f1883b;

            {
                this.f1882a = i9;
                this.f1883b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Intent intent;
                List list;
                int currentItem;
                TicketBean ticketBean;
                switch (this.f1882a) {
                    case 0:
                        EditorFullScreenControlView.a aVar = ((EditorFullScreenControlView) this.f1883b).f107096f;
                        if (aVar != null) {
                            aVar.e();
                        }
                        break;
                    case 1:
                        h hVar = (h) this.f1883b;
                        if (((BiliLivePackage) hVar.getItem()).isNotClickAbleStatus()) {
                            f.z0((LiveRoomBaseGift) hVar.getItem());
                            break;
                        } else if (!((BiliLivePackage) hVar.getItem()).isPreGiftFailure()) {
                            if (!((BiliLivePackage) hVar.getItem()).isSelected()) {
                                hVar.A0((ConstraintLayout) hVar.v.getValue(hVar, h.A[10]));
                            }
                            Function3 function3 = hVar.k.c;
                            if (function3 != null) {
                                function3.invoke(hVar.getItem(), view, Boolean.FALSE);
                            }
                            break;
                        }
                        break;
                    default:
                        MallTicketDetailFragment mallTicketDetailFragment = (MallTicketDetailFragment) this.f1883b;
                        if (mallTicketDetailFragment.p3() != null && (intent = mallTicketDetailFragment.p3().getIntent()) != null && intent.getData() != null && mallTicketDetailFragment.w != null && (list = mallTicketDetailFragment.r0) != null && !((ArrayList) list).isEmpty() && (currentItem = mallTicketDetailFragment.w.getCurrentItem()) < ((ArrayList) mallTicketDetailFragment.r0).size() && (ticketBean = (TicketBean) ((ArrayList) mallTicketDetailFragment.r0).get(currentItem)) != null) {
                            MallTicketDetailFragment.sf(ticketBean.status, ticketBean.id, true);
                            if (!TextUtils.isEmpty(ticketBean.getNewShowSouvenir())) {
                                mallTicketDetailFragment.startPageBySchemaForResult(ticketBean.getNewShowSouvenir(), -1);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        final int i10 = 0;
        setOnClickListener(new View.OnClickListener(this, i10) { // from class: Cy0.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f1884a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f1885b;

            {
                this.f1884a = i10;
                this.f1885b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TicketBean ticketBean;
                switch (this.f1884a) {
                    case 0:
                        EditorFullScreenControlView editorFullScreenControlView = (EditorFullScreenControlView) this.f1885b;
                        if (editorFullScreenControlView.f107095e.getVisibility() != 0) {
                            editorFullScreenControlView.f107095e.setVisibility(0);
                        } else {
                            editorFullScreenControlView.f107095e.setVisibility(8);
                        }
                        break;
                    case 1:
                        LiveRoomVerticalRecommendView liveRoomVerticalRecommendView = (LiveRoomVerticalRecommendView) this.f1885b;
                        YG.c cVar = new YG.c(((com.bilibili.bililive.room.ui.roomv3.base.view.c) liveRoomVerticalRecommendView).b.a.j.a);
                        cVar.a();
                        Unit unit = Unit.INSTANCE;
                        LiveReporter.reportClick("live.live-room-detail.player.entry-room.click", cVar.b, false);
                        liveRoomVerticalRecommendView.n.k1.setValue(Boolean.TRUE);
                        View view2 = liveRoomVerticalRecommendView.q;
                        if (view2 != null) {
                            view2.setVisibility(8);
                        }
                        liveRoomVerticalRecommendView.m.L();
                        if (liveRoomVerticalRecommendView.n.q3() == RoundStatus.WILL) {
                            liveRoomVerticalRecommendView.n.l1();
                            liveRoomVerticalRecommendView.n.Df(RoundStatus.ON);
                        }
                        break;
                    default:
                        MallTicketDetailFragment mallTicketDetailFragment = (MallTicketDetailFragment) this.f1885b;
                        int currentItem = mallTicketDetailFragment.w.getCurrentItem();
                        List list = mallTicketDetailFragment.r0;
                        if (list != null && currentItem < ((ArrayList) list).size() && (ticketBean = (TicketBean) ((ArrayList) mallTicketDetailFragment.r0).get(currentItem)) != null) {
                            MallTicketDetailFragment.tf(true, 2131857301, ticketBean);
                            String circlePublisherJumpUrl = ticketBean.getCirclePublisherJumpUrl();
                            if (!TextUtils.isEmpty(circlePublisherJumpUrl)) {
                                mallTicketDetailFragment.startPageBySchemaForResult(circlePublisherJumpUrl, -1);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        seekBar.setOnSeekBarChangeListener(new com.bilibili.studio.editor.moudle.editormain.ui.widget.a(this));
    }

    @Nullable
    public final a getMOnFullScreenControlListener() {
        return this.f107096f;
    }

    public final void setMOnFullScreenControlListener(@Nullable a aVar) {
        this.f107096f = aVar;
    }
}
