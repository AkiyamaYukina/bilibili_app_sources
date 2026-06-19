package com.bilibili.ship.theseus.united.player.mediaplay;

import Pj0.e;
import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import com.bapis.bilibili.playershared.ComprehensiveToast;
import com.bapis.bilibili.playershared.Dialog;
import com.bapis.bilibili.playershared.QnGroup;
import com.bapis.bilibili.playershared.QnGroupType;
import com.bapis.bilibili.playershared.QnItem;
import com.bapis.bilibili.playershared.QnPanel;
import com.bapis.bilibili.playershared.Stream;
import com.bapis.bilibili.playershared.StreamInfo;
import com.bapis.bilibili.playershared.TextInfo;
import com.bapis.bilibili.playershared.ToastType;
import com.bapis.bilibili.playershared.ViewInfo;
import com.bapis.bilibili.playershared.VodInfo;
import com.bilibili.app.gemini.base.resolver.GeminiCommonResolver;
import com.bilibili.lib.media.resource.ExtraInfo;
import com.bilibili.okretro.call.json.JsonUtilKt;
import com.bilibili.player.tangram.basic.WithVideoProgress;
import com.bilibili.playerbizcommonv2.widget.quality.h0;
import com.bilibili.ship.theseus.united.page.playviewextra.CountdownItemVo;
import com.bilibili.ship.theseus.united.page.playviewextra.FoldDataVo;
import com.bilibili.ship.theseus.united.page.playviewextra.FoldStyle;
import com.bilibili.ship.theseus.united.page.playviewextra.FullPromptBarVo;
import com.bilibili.ship.theseus.united.page.playviewextra.PlayerToastVo;
import com.bilibili.ship.theseus.united.page.playviewextra.PromptBarVo;
import com.bilibili.ship.theseus.united.page.restrictionlayer.E;
import com.bilibili.ship.theseus.united.page.restrictionlayer.O;
import com.bilibili.ship.theseus.united.page.restrictionlayer.ReportVo;
import com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerVo;
import com.bilibili.ship.theseus.united.page.restrictionlayer.TextVo;
import com.bilibili.ship.theseus.united.page.videoquality.A;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.reflect.TypeToken;
import com.google.protobuf.GeneratedMessageLite;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.Deferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/p.class */
public interface p {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/p$a.class */
    public static final class a extends TypeToken<PlayerToastVo> {
    }

    @Nullable
    Object a(@Nullable ev0.i iVar, @NotNull Deferred<PlayViewUniteReply> deferred, @NotNull WithVideoProgress withVideoProgress, @NotNull Continuation<? super Unit> continuation);

    @NotNull
    default ExtraInfo b(@NotNull PlayViewUniteReply playViewUniteReply) {
        PromptBarVo promptBarVo;
        Object next;
        CountdownItemVo countdownItemVo;
        FoldDataVo foldDataVo;
        FullPromptBarVo fullPromptBarVo;
        TextVo textVo;
        String text;
        QnPanel qnPanelBuild;
        GeminiCommonResolver.Companion.getClass();
        ExtraInfo extraInfoH = GeminiCommonResolver.a.h(playViewUniteReply);
        ViewInfo viewInfo = playViewUniteReply.getViewInfo();
        GeneratedMessageLite promptBar = viewInfo.getPromptBar();
        if (promptBar.getDefaultInstanceForType() == promptBar) {
            promptBarVo = null;
        } else {
            e.a aVar = Pj0.e.f18940a;
            promptBarVo = (PromptBarVo) JsonUtilKt.parseJson(new Pj0.d(promptBar, true), new vv0.o().getType());
        }
        extraInfoH.setTag-pIAwiHE(vv0.d.f128456d.a, promptBarVo);
        Dialog dialog = (Dialog) viewInfo.getDialogMapMap().get("start_playing");
        extraInfoH.setTag-pIAwiHE(vv0.d.f128457e.a, dialog != null ? RestrictionLayerVo.a.a(dialog) : null);
        Dialog dialog2 = (Dialog) viewInfo.getDialogMapMap().get("ctcc_home_network_device_limit");
        extraInfoH.setTag-pIAwiHE(vv0.d.h.a, dialog2 != null ? RestrictionLayerVo.a.a(dialog2) : null);
        Iterator it = playViewUniteReply.getViewInfo().getToastsList().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ComprehensiveToast) next).getType() == ToastType.TELECOM_VIP_TOAST) {
                break;
            }
        }
        ComprehensiveToast comprehensiveToast = (ComprehensiveToast) next;
        extraInfoH.setTag-pIAwiHE(vv0.d.f128460i.a, comprehensiveToast != null ? (PlayerToastVo) JsonUtilKt.parseJson(Pj0.e.a(comprehensiveToast), new a().getType()) : null);
        extraInfoH.setTag-pIAwiHE(vv0.d.f128453a.a, Boolean.valueOf(playViewUniteReply.getPlayArc().getIsPreview()));
        GeneratedMessageLite fullPromptBar = viewInfo.getFullPromptBar();
        if (fullPromptBar.getDefaultInstanceForType() == fullPromptBar) {
            fullPromptBarVo = null;
        } else {
            String icon = fullPromptBar.getIcon();
            TextVo textVoA = TextVo.a.a(fullPromptBar.getTitle());
            TextVo textVoA2 = TextVo.a.a(fullPromptBar.getSubtitle());
            Duration.Companion companion = Duration.Companion;
            long duration = DurationKt.toDuration(fullPromptBar.getTimerCountdown(), DurationUnit.SECONDS);
            boolean countdownEnable = fullPromptBar.getCountdownEnable();
            List<GeneratedMessageLite> buttonList = fullPromptBar.getButtonList();
            ArrayList arrayList = new ArrayList();
            for (GeneratedMessageLite generatedMessageLite : buttonList) {
                if (generatedMessageLite.getDefaultInstanceForType() == generatedMessageLite || (text = generatedMessageLite.getText()) == null || text.length() == 0) {
                    textVo = null;
                } else {
                    e.a aVar2 = Pj0.e.f18940a;
                    textVo = (TextVo) JsonUtilKt.parseJson(new Pj0.d(generatedMessageLite, true), new O().getType());
                }
                if (textVo != null) {
                    arrayList.add(textVo);
                }
            }
            GeneratedMessageLite foldData = fullPromptBar.getFoldData();
            if (foldData.getDefaultInstanceForType() == foldData) {
                foldDataVo = null;
            } else {
                FoldStyle foldStyle = (FoldStyle) JsonUtilKt.parseJson((JsonElement) new JsonPrimitive(Integer.valueOf(foldData.getFoldStyle().getNumber())), new vv0.e().getType());
                FoldStyle foldStyle2 = foldStyle;
                if (foldStyle == null) {
                    foldStyle2 = FoldStyle.Countdown;
                }
                GeneratedMessageLite countDown = foldData.getCountDown();
                if (countDown.getDefaultInstanceForType() == countDown) {
                    countdownItemVo = null;
                } else {
                    Duration.Companion companion2 = Duration.Companion;
                    long duration2 = DurationKt.toDuration(countDown.getFoldCountdown(), DurationUnit.SECONDS);
                    TextInfo title = countDown.getTitle();
                    String text2 = title.getText();
                    TextVo textVo2 = (text2 == null || text2.length() == 0) ? null : (TextVo) JsonUtilKt.parseJson(Pj0.e.a(title), new TextVo.a.C1109a().getType());
                    TextInfo subtitle = countDown.getSubtitle();
                    String text3 = subtitle.getText();
                    countdownItemVo = new CountdownItemVo(duration2, textVo2, (text3 == null || text3.length() == 0) ? null : (TextVo) JsonUtilKt.parseJson(Pj0.e.a(subtitle), new TextVo.a.C1109a().getType()));
                }
                foldDataVo = new FoldDataVo(foldStyle2, countdownItemVo);
            }
            GeneratedMessageLite report = fullPromptBar.getReport();
            fullPromptBarVo = new FullPromptBarVo(icon, textVoA, textVoA2, duration, countdownEnable, arrayList, foldDataVo, report.getDefaultInstanceForType() == report ? null : (ReportVo) JsonUtilKt.parseJson(Pj0.e.a(report), new E().getType()), fullPromptBar.getBgImage(), fullPromptBar.getBarHeight());
        }
        extraInfoH.setTag-pIAwiHE(vv0.d.f128455c.a, fullPromptBarVo);
        VodInfo vodInfo = playViewUniteReply.getVodInfo();
        if (vodInfo.hasQnPanel()) {
            qnPanelBuild = vodInfo.getQnPanel();
        } else {
            QnPanel.b bVarNewBuilder = QnPanel.newBuilder();
            List streamListList = vodInfo.getStreamListList();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(streamListList, 10));
            Iterator it2 = streamListList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(QnItem.newBuilder().setStreamInfo(((Stream) it2.next()).getStreamInfo()).build());
            }
            qnPanelBuild = bVarNewBuilder.addAllQnItems(arrayList2).build();
        }
        List<Stream> streamListList2 = vodInfo.getStreamListList();
        HashSet hashSet = new HashSet();
        for (Stream stream : streamListList2) {
            GeminiCommonResolver.Companion.getClass();
            Integer numValueOf = GeminiCommonResolver.a.b(stream) ? null : Integer.valueOf(stream.getStreamInfo().getQuality());
            if (numValueOf != null) {
                hashSet.add(numValueOf);
            }
        }
        if (!hashSet.isEmpty()) {
            QnPanel.b bVarClearQnItems = qnPanelBuild.toBuilder().clearQnItems();
            for (QnItem qnItem : qnPanelBuild.getQnItemsList()) {
                if (qnItem.hasStreamInfo()) {
                    if (!hashSet.contains(Integer.valueOf(qnItem.getStreamInfo().getQuality()))) {
                        bVarClearQnItems.addQnItems(qnItem);
                    }
                } else if (qnItem.hasQnGroup()) {
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    QnGroup qnGroup = qnItem.getQnGroup();
                    objectRef.element = qnGroup;
                    QnGroup.b bVarClearStreamInfos = qnGroup.toBuilder().clearStreamInfos();
                    for (StreamInfo streamInfo : ((QnGroup) objectRef.element).getStreamInfosList()) {
                        if (!hashSet.contains(Integer.valueOf(streamInfo.getQuality()))) {
                            bVarClearStreamInfos.addStreamInfos(streamInfo);
                        }
                    }
                    QnGroup qnGroupBuild = bVarClearStreamInfos.build();
                    objectRef.element = qnGroupBuild;
                    if (!qnGroupBuild.getStreamInfosList().isEmpty()) {
                        bVarClearQnItems.addQnItems(qnItem.toBuilder().setQnGroup((QnGroup) objectRef.element));
                    }
                }
            }
            qnPanelBuild = (QnPanel) bVarClearQnItems.build();
        }
        extraInfoH.setTag-pIAwiHE(A.f103685a.a, qnPanelBuild);
        Map expAbMap = playViewUniteReply.getViewInfo().getExpSwitch().getExpAbMap();
        if (Intrinsics.areEqual(expAbMap.get("vipVision"), "1")) {
            Set setCreateSetBuilder = SetsKt.createSetBuilder();
            for (QnItem qnItem2 : playViewUniteReply.getVodInfo().getQnPanel().getQnItemsList()) {
                if (qnItem2.getQnGroup().getGroupType() == QnGroupType.VIP_VISION) {
                    Iterator it3 = qnItem2.getQnGroup().getStreamInfosList().iterator();
                    while (it3.hasNext()) {
                        setCreateSetBuilder.add(new com.bilibili.player.tangram.basic.a(h0.k((StreamInfo) it3.next())));
                    }
                }
            }
            extraInfoH.setTag-pIAwiHE(vv0.d.f128459g.a, SetsKt.build(setCreateSetBuilder));
        }
        extraInfoH.setTag-pIAwiHE(A.f103686b.a, Boolean.valueOf(Intrinsics.areEqual(expAbMap.get("vipVisionSingletonExpandable"), "1")));
        extraInfoH.setTag-pIAwiHE(A.f103687c.a, Boolean.valueOf(Intrinsics.areEqual(expAbMap.get("vipVisionRemembersExpansion"), "1")));
        return extraInfoH;
    }
}
