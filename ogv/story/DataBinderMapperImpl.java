package com.bilibili.ogv.story;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.ComposerKt;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.alipay.blueshield.IDeviceColorModule;
import com.alipay.blueshield.TrustedErrorCode;
import com.bilibili.live.streaming.source.TextSource;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.search2.api.SearchBangumiItem;
import com.bilibili.studio.videoeditor.CaptionFx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/story/DataBinderMapperImpl.class */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f72960a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/story/DataBinderMapperImpl$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseArray<String> f72961a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(260);
            f72961a = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "allTagDataList");
            sparseArray.put(2, "animSurpriseEvent");
            sparseArray.put(3, "animSurpriseState");
            sparseArray.put(4, "announcementContent");
            sparseArray.put(5, "announcementTitle");
            sparseArray.put(6, "audioEdition");
            sparseArray.put(7, "audioItemBackDrawable");
            sparseArray.put(8, "audioList");
            sparseArray.put(9, "backImageUrl");
            sparseArray.put(10, "background");
            sparseArray.put(11, "backgroundDrawable");
            sparseArray.put(12, "backgroundTranslucentEnable");
            sparseArray.put(13, "backgroundVo");
            sparseArray.put(14, "badgeInfo");
            sparseArray.put(15, "bgAlpha");
            sparseArray.put(16, "bgDrawable");
            sparseArray.put(17, "bgHeight");
            sparseArray.put(18, "bgWidth");
            sparseArray.put(19, "bottomDesc");
            sparseArray.put(20, "bottomDisplay1");
            sparseArray.put(21, "bottomDisplay2");
            sparseArray.put(22, "bottomDisplay3");
            sparseArray.put(23, "bottomDisplay4");
            sparseArray.put(24, "buttonWidths");
            sparseArray.put(25, "chatHint");
            sparseArray.put(26, "chatPlayerInputHint");
            sparseArray.put(27, "collapsedTextAlpha");
            sparseArray.put(28, "commentCountText");
            sparseArray.put(29, "config");
            sparseArray.put(30, "constellationAndAge");
            sparseArray.put(31, "containerHeight");
            sparseArray.put(32, "containerSelected");
            sparseArray.put(33, "containerVisible");
            sparseArray.put(34, TextSource.CFG_CONTENT);
            sparseArray.put(35, "contentAlpha");
            sparseArray.put(36, "contentColor");
            sparseArray.put(37, "coverUrl");
            sparseArray.put(38, "currentRoleAudioDesc");
            sparseArray.put(39, "danmakuCountText");
            sparseArray.put(40, "danmakuEnable");
            sparseArray.put(41, "danmakuNumIcon");
            sparseArray.put(42, "danmakuOpen");
            sparseArray.put(43, "danmukuTvText");
            sparseArray.put(44, "danmukuTvVisible");
            sparseArray.put(45, "dataList");
            sparseArray.put(46, "descName");
            sparseArray.put(47, "descVo");
            sparseArray.put(48, "dialogStyleType");
            sparseArray.put(49, "directionType");
            sparseArray.put(50, "disable");
            sparseArray.put(51, "disableTagTextColor");
            sparseArray.put(52, "downBadgeDrawable");
            sparseArray.put(53, "downBadgeVisible");
            sparseArray.put(54, "emotionBadgeVisible");
            sparseArray.put(55, "emptyType");
            sparseArray.put(56, "endContent");
            sparseArray.put(57, "epDescContent");
            sparseArray.put(58, "episodeDurationText");
            sparseArray.put(59, "episodeDurationTextVisible");
            sparseArray.put(60, "episodeTime");
            sparseArray.put(61, "episodeTimeVisible");
            sparseArray.put(62, "errorText");
            sparseArray.put(63, "errorTip");
            sparseArray.put(64, "errorViewVisible");
            sparseArray.put(65, "errorVisible");
            sparseArray.put(66, "eventHandle");
            sparseArray.put(67, "firstButton");
            sparseArray.put(68, "firstButtonBadgeVo");
            sparseArray.put(69, "firstButtonCharSequence");
            sparseArray.put(70, "firstButtonText");
            sparseArray.put(71, "firstButtonVo");
            sparseArray.put(72, "flContainerVisible");
            sparseArray.put(73, "followBgDrawable");
            sparseArray.put(74, "followButtonConfig");
            sparseArray.put(75, "followDesc");
            sparseArray.put(76, "followDescTextColor");
            sparseArray.put(77, "followIconDrawable");
            sparseArray.put(78, "followText");
            sparseArray.put(79, "followTextColor");
            sparseArray.put(80, "followed");
            sparseArray.put(81, "followedCountText");
            sparseArray.put(82, "handler");
            sparseArray.put(83, "hasAddView");
            sparseArray.put(84, "hasAnnouncement");
            sparseArray.put(85, "hasPendant");
            sparseArray.put(86, "hasPinMsg");
            sparseArray.put(87, "highPrivilegedUser");
            sparseArray.put(88, "icon");
            sparseArray.put(89, "iconVo");
            sparseArray.put(90, "imageAlpha");
            sparseArray.put(91, "imageDrawableId");
            sparseArray.put(92, "imageRequestBuilder");
            sparseArray.put(93, "imageTranslationY");
            sparseArray.put(94, "imageUrl");
            sparseArray.put(95, "indexTitle");
            sparseArray.put(96, "indexTitleColor");
            sparseArray.put(97, "inputAlpha");
            sparseArray.put(98, "inputBarEnable");
            sparseArray.put(99, "inputBgWidth");
            sparseArray.put(100, "inputHintText");
            sparseArray.put(101, "inputText");
            sparseArray.put(102, "isBackVisible");
            sparseArray.put(103, "isCloseVisible");
            sparseArray.put(104, "isGuideWindowVisible");
            sparseArray.put(105, "itemDecoration");
            sparseArray.put(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_HAND_DET_SCORE_THRESHOLD, "landscape");
            sparseArray.put(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_HAND_TRACK_SCORE_THRESHOLD, "leftBadgeBackDrawable");
            sparseArray.put(108, "leftBadgeText");
            sparseArray.put(109, "leftBadgeTextColor");
            sparseArray.put(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_HAND_SKELETON_THRESHOLD, "leftBadgeVisible");
            sparseArray.put(CaptionFx.BUBBLEPATH_FIELD_NUMBER, "leftBtnBackDrawable");
            sparseArray.put(112, "leftBtnVisible");
            sparseArray.put(113, "leftText");
            sparseArray.put(114, "leftTextColor");
            sparseArray.put(115, "levelDrawableId");
            sparseArray.put(116, "loadingViewVisible");
            sparseArray.put(117, "marginTop");
            sparseArray.put(118, "master");
            sparseArray.put(119, IDeviceColorModule.EDGE_MODE_KEY);
            sparseArray.put(120, "msgContent");
            sparseArray.put(121, "myCard");
            sparseArray.put(122, "nameSpannableText");
            sparseArray.put(SearchBangumiItem.TYPE_FULLNET_TV, "nameTextColor");
            sparseArray.put(SearchBangumiItem.TYPE_FULLNET_VARIETY, "needShowEndContainer");
            sparseArray.put(SearchBangumiItem.TYPE_FULLNET_DOCUMENTARY, "needShowTitle");
            sparseArray.put(SearchBangumiItem.TYPE_FULLNET_MOVIE, "negativeBtnText");
            sparseArray.put(SearchBangumiItem.TYPE_FULLNET_BANGUMI, "negativeBtnVisible");
            sparseArray.put(128, "newBadgeVisible");
            sparseArray.put(129, "newMsgText");
            sparseArray.put(130, "newPlayerMsgText");
            sparseArray.put(131, "nickTextColor");
            sparseArray.put(132, "nickTvColor");
            sparseArray.put(133, "nickname");
            sparseArray.put(134, "onNegativeClick");
            sparseArray.put(135, "onPositiveClick");
            sparseArray.put(136, "orderVisible");
            sparseArray.put(137, "overlayImageDrawable");
            sparseArray.put(138, "ownerState");
            sparseArray.put(139, "params");
            sparseArray.put(140, "personAvatar");
            sparseArray.put(141, "personName");
            sparseArray.put(142, "playCountText");
            sparseArray.put(143, "playTimeText");
            sparseArray.put(144, "playedNumIcon");
            sparseArray.put(145, "playedNumText");
            sparseArray.put(146, "playedNumVisible");
            sparseArray.put(147, "playerContainer");
            sparseArray.put(148, "playerNickTextColor");
            sparseArray.put(149, "playingLottieAssetFileName");
            sparseArray.put(150, "playingLottieFileName");
            sparseArray.put(151, "playingLottieVisible");
            sparseArray.put(152, "positiveBtnText");
            sparseArray.put(153, "positiveBtnVisible");
            sparseArray.put(154, "positiveOrder");
            sparseArray.put(155, "quickMsgsVisible");
            sparseArray.put(156, "reportVo");
            sparseArray.put(157, "rightBadgeBackDrawable");
            sparseArray.put(158, "rightBadgeText");
            sparseArray.put(159, "rightBadgeTextColor");
            sparseArray.put(160, "rightBadgeVisible");
            sparseArray.put(161, "rightBtnBackDrawable");
            sparseArray.put(162, "rightBtnVisible");
            sparseArray.put(163, "rightText");
            sparseArray.put(164, "rightTextColor");
            sparseArray.put(165, "roleAvatar");
            sparseArray.put(166, "roleList");
            sparseArray.put(167, "roleListHeight");
            sparseArray.put(168, "roleName");
            sparseArray.put(169, "roleTitle");
            sparseArray.put(170, "roleType");
            sparseArray.put(171, "roomMode");
            sparseArray.put(172, "rootAlpha");
            sparseArray.put(173, "rootViewHeight");
            sparseArray.put(174, "rootVisibility");
            sparseArray.put(175, "scoreText");
            sparseArray.put(176, "scoreTextColor");
            sparseArray.put(177, "scoreVisible");
            sparseArray.put(178, "scrollListener");
            sparseArray.put(179, "scrollPosWithOffset");
            sparseArray.put(180, "seasonCoverUrl");
            sparseArray.put(181, "seasonName");
            sparseArray.put(182, "seasonTitle");
            sparseArray.put(183, "secondButton");
            sparseArray.put(184, "secondButtonBadgeVo");
            sparseArray.put(185, "secondButtonCharSequence");
            sparseArray.put(186, "secondButtonText");
            sparseArray.put(187, "secondButtonVo");
            sparseArray.put(188, "sectionClosed");
            sparseArray.put(189, "select");
            sparseArray.put(190, "selectDataList");
            sparseArray.put(191, "selectListHint");
            sparseArray.put(192, "selectListIconUrl");
            sparseArray.put(193, "selectTagBackground");
            sparseArray.put(194, "selectTagTextColor");
            sparseArray.put(195, "selectTitle");
            sparseArray.put(196, "selected");
            sparseArray.put(197, "sexDrawableId");
            sparseArray.put(198, "shieldState");
            sparseArray.put(TrustedErrorCode.MANAGER_ERROR_UNKONWN_CODE, "showType");
            sparseArray.put(200, "singleImageUrl");
            sparseArray.put(201, "spannableTitle");
            sparseArray.put(202, "splitText");
            sparseArray.put(203, "subContent");
            sparseArray.put(ComposerKt.providerMapsKey, "subContentColor");
            sparseArray.put(205, "subTitle");
            sparseArray.put(ComposerKt.referenceKey, "subTitleColor");
            sparseArray.put(ComposerKt.reuseKey, "subTitleLeftIconUrl");
            sparseArray.put(208, "subTitleText");
            sparseArray.put(209, "subTitleVo");
            sparseArray.put(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_BODY_STATURE, "subtitle");
            sparseArray.put(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_CAM_FOVX, "subtitleVisible");
            sparseArray.put(212, "switchBtnBgColor");
            sparseArray.put(213, "tagLineData");
            sparseArray.put(214, "tagText");
            sparseArray.put(215, "tagTitle");
            sparseArray.put(216, "tagTitleColor");
            sparseArray.put(217, "time");
            sparseArray.put(218, "timeVisible");
            sparseArray.put(219, "title");
            sparseArray.put(220, "titleColor");
            sparseArray.put(221, "titleLineCount");
            sparseArray.put(222, "titleText");
            sparseArray.put(223, "titleVo");
            sparseArray.put(224, "topContainerShow");
            sparseArray.put(225, "unselectedTagBackground");
            sparseArray.put(226, "unselectedTagTextColor");
            sparseArray.put(227, "upInfoTvText");
            sparseArray.put(228, "upInfoTvVisible");
            sparseArray.put(229, "updateAttention");
            sparseArray.put(230, "updateDescription");
            sparseArray.put(231, "updateGuestAttention");
            sparseArray.put(232, "value");
            sparseArray.put(233, "viewModel");
            sparseArray.put(234, "viewModelInner");
            sparseArray.put(235, "vipBarAnimIconStartMargin");
            sparseArray.put(236, "vipBarAnimIconTopMargin");
            sparseArray.put(237, "vipBarAnimIconVisible");
            sparseArray.put(238, "vipBarBg");
            sparseArray.put(239, "vipBarBgHeight");
            sparseArray.put(240, "vipBarBgWidth");
            sparseArray.put(241, "vipBarCollapsedAlpha");
            sparseArray.put(242, "vipBarCollapsedIconAlpha");
            sparseArray.put(243, "vipBarCollapsedVisible");
            sparseArray.put(244, "vipBarExpandedAlpha");
            sparseArray.put(245, "vipBarExpandedButtonText");
            sparseArray.put(246, "vipBarExpandedDesc");
            sparseArray.put(247, "vipBarExpandedIconVisible");
            sparseArray.put(248, "vipBarExpandedTitle");
            sparseArray.put(249, "vipBarExpandedVisible");
            sparseArray.put(250, "vipBarIconText");
            sparseArray.put(251, "vipBarIconUrl");
            sparseArray.put(252, "vipBarTitle");
            sparseArray.put(253, "vipBarVisible");
            sparseArray.put(254, "vipBarVm");
            sparseArray.put(255, "vipBarVo");
            sparseArray.put(256, "vm");
            sparseArray.put(257, "vvmAdapter");
            sparseArray.put(258, "vvmAdapterInner");
            sparseArray.put(259, "width");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/story/DataBinderMapperImpl$b.class */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap<String, Integer> f72962a;

        static {
            HashMap<String, Integer> map = new HashMap<>(9);
            f72962a = map;
            p2.b.a(2131493261, map, "layout/bangumi_story_bottom_gap_item_0", 2131493262, "layout/bangumi_story_bottom_vip_bar_0");
            p2.b.a(2131493263, map, "layout/bangumi_story_bottom_widget_0", 2131493266, "layout/bangumi_story_ep_list_title_0");
            p2.b.a(2131493267, map, "layout/bangumi_story_episode_item_0", 2131493268, "layout/bangumi_story_episode_list_dialog_0");
            p2.b.a(2131493269, map, "layout/bangumi_story_episode_list_vip_bar_style1_0", 2131493270, "layout/bangumi_story_episode_list_vip_bar_style2_0");
            map.put("layout/bangumi_story_episode_list_vip_bar_style3_0", 2131493271);
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(9);
        f72960a = sparseIntArray;
        sparseIntArray.put(2131493261, 1);
        sparseIntArray.put(2131493262, 2);
        sparseIntArray.put(2131493263, 3);
        sparseIntArray.put(2131493266, 4);
        sparseIntArray.put(2131493267, 5);
        sparseIntArray.put(2131493268, 6);
        sparseIntArray.put(2131493269, 7);
        sparseIntArray.put(2131493270, 8);
        sparseIntArray.put(2131493271, 9);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(9);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.bilibili.app.gemini.base.DataBinderMapperImpl());
        arrayList.add(new com.bilibili.app.gemini.ui.DataBinderMapperImpl());
        arrayList.add(new com.bilibili.app.screen.adjust.DataBinderMapperImpl());
        arrayList.add(new com.bilibili.bangumi.DataBinderMapperImpl());
        arrayList.add(new com.bilibili.lib.bilipay.DataBinderMapperImpl());
        arrayList.add(new com.bilibili.ogv.glue.DataBinderMapperImpl());
        arrayList.add(new com.bilibili.ogvcommon.DataBinderMapperImpl());
        arrayList.add(new com.bilibili.video.story.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final String convertBrIdToString(int i7) {
        return a.f72961a.get(i7);
    }

    /* JADX WARN: Type inference failed for: r0v27, types: [Gl0.g, Gl0.h, androidx.databinding.ViewDataBinding] */
    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i7) {
        int i8 = f72960a.get(i7);
        if (i8 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        switch (i8) {
            case 1:
                if ("layout/bangumi_story_bottom_gap_item_0".equals(tag)) {
                    return new Gl0.b(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(Fp.c.b(tag, "The tag for bangumi_story_bottom_gap_item is invalid. Received: "));
            case 2:
                if ("layout/bangumi_story_bottom_vip_bar_0".equals(tag)) {
                    return new Gl0.d(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(Fp.c.b(tag, "The tag for bangumi_story_bottom_vip_bar is invalid. Received: "));
            case 3:
                if ("layout/bangumi_story_bottom_widget_0".equals(tag)) {
                    return new Gl0.f(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(Fp.c.b(tag, "The tag for bangumi_story_bottom_widget is invalid. Received: "));
            case 4:
                if (!"layout/bangumi_story_ep_list_title_0".equals(tag)) {
                    throw new IllegalArgumentException(Fp.c.b(tag, "The tag for bangumi_story_ep_list_title is invalid. Received: "));
                }
                Object[] objArrMapBindings = ViewDataBinding.mapBindings(dataBindingComponent, view, 3, (ViewDataBinding.i) null, (SparseIntArray) null);
                ?? gVar = new Gl0.g(dataBindingComponent, view, (TextView) objArrMapBindings[2], (TextView) objArrMapBindings[1]);
                gVar.f7161z = -1L;
                ((LinearLayout) objArrMapBindings[0]).setTag(null);
                gVar.f7158w.setTag(null);
                gVar.f7159x.setTag(null);
                gVar.setRootTag(view);
                gVar.invalidateAll();
                return gVar;
            case 5:
                if ("layout/bangumi_story_episode_item_0".equals(tag)) {
                    return new Gl0.j(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(Fp.c.b(tag, "The tag for bangumi_story_episode_item is invalid. Received: "));
            case 6:
                if ("layout/bangumi_story_episode_list_dialog_0".equals(tag)) {
                    return new Gl0.l(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(Fp.c.b(tag, "The tag for bangumi_story_episode_list_dialog is invalid. Received: "));
            case 7:
                if ("layout/bangumi_story_episode_list_vip_bar_style1_0".equals(tag)) {
                    return new Gl0.n(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(Fp.c.b(tag, "The tag for bangumi_story_episode_list_vip_bar_style1 is invalid. Received: "));
            case 8:
                if ("layout/bangumi_story_episode_list_vip_bar_style2_0".equals(tag)) {
                    return new Gl0.p(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(Fp.c.b(tag, "The tag for bangumi_story_episode_list_vip_bar_style2 is invalid. Received: "));
            case 9:
                if ("layout/bangumi_story_episode_list_vip_bar_style3_0".equals(tag)) {
                    return new Gl0.r(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(Fp.c.b(tag, "The tag for bangumi_story_episode_list_vip_bar_style3 is invalid. Received: "));
            default:
                return null;
        }
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i7) {
        if (viewArr == null || viewArr.length == 0 || f72960a.get(i7) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.DataBinderMapper
    public final int getLayoutId(String str) {
        int iIntValue = 0;
        if (str == null) {
            return 0;
        }
        Integer num = b.f72962a.get(str);
        if (num != null) {
            iIntValue = num.intValue();
        }
        return iIntValue;
    }
}
