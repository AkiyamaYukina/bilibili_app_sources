package com.bilibili.ogv.operation;

import Ek0.B;
import Ek0.C1663b;
import Ek0.C1665d;
import Ek0.C1667f;
import Ek0.C1669h;
import Ek0.C1671j;
import Ek0.C1673l;
import Ek0.C1675n;
import Ek0.C1677p;
import Ek0.D;
import Ek0.F;
import Ek0.H;
import Ek0.J;
import Ek0.L;
import Ek0.N;
import Ek0.P;
import Ek0.S;
import Ek0.r;
import Ek0.t;
import Ek0.v;
import Ek0.x;
import Ek0.z;
import Fp.c;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.compose.runtime.ComposerKt;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.alipay.alipaysecuritysdk.common.config.Constant;
import com.alipay.alipaysecuritysdk.common.exception.ErrorCode;
import com.alipay.blueshield.IDeviceColorModule;
import com.alipay.blueshield.TrustedErrorCode;
import com.bilibili.live.streaming.source.TextSource;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.search2.api.SearchBangumiItem;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.bilibili.studio.videoeditor.CaptionFx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/DataBinderMapperImpl.class */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f69963a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/DataBinderMapperImpl$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseArray<String> f69964a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(381);
            f69964a = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "actionListener");
            sparseArray.put(2, "actorInfo");
            sparseArray.put(3, "adInfo");
            sparseArray.put(4, "adReportInfo");
            sparseArray.put(5, "allTagDataList");
            sparseArray.put(6, "animSurpriseEvent");
            sparseArray.put(7, "animSurpriseState");
            sparseArray.put(8, "animationLengthX");
            sparseArray.put(9, "announcementContent");
            sparseArray.put(10, "announcementTitle");
            sparseArray.put(11, "audioEdition");
            sparseArray.put(12, "audioItemBackDrawable");
            sparseArray.put(13, "audioList");
            sparseArray.put(14, "avatarList");
            sparseArray.put(15, "backImageUrl");
            sparseArray.put(16, "background");
            sparseArray.put(17, "backgroundDrawable");
            sparseArray.put(18, "backgroundTranslucentEnable");
            sparseArray.put(19, "backgroundVo");
            sparseArray.put(20, "badgeInfo");
            sparseArray.put(21, "badgeText");
            sparseArray.put(22, "badgeUri");
            sparseArray.put(23, "banner");
            sparseArray.put(24, "bannerControl");
            sparseArray.put(25, "bannerItemDataList");
            sparseArray.put(26, "bannerItems");
            sparseArray.put(27, "bgAlpha");
            sparseArray.put(28, "bgColor");
            sparseArray.put(29, "bgCover");
            sparseArray.put(30, "bgDrawable");
            sparseArray.put(31, "bgHeight");
            sparseArray.put(32, "bgImg");
            sparseArray.put(33, "bgWidth");
            sparseArray.put(34, "bottomDesc");
            sparseArray.put(35, "bottomDisplay1");
            sparseArray.put(36, "bottomDisplay2");
            sparseArray.put(37, "bottomDisplay3");
            sparseArray.put(38, "bottomDisplay4");
            sparseArray.put(39, "bottomText");
            sparseArray.put(40, "buttonWidths");
            sparseArray.put(41, "canFavor");
            sparseArray.put(42, "canWatch");
            sparseArray.put(43, "card");
            sparseArray.put(44, "cardBgDrawable");
            sparseArray.put(45, "cardDescType");
            sparseArray.put(46, "cardHeight");
            sparseArray.put(47, "cardStyle");
            sparseArray.put(48, "cardTag");
            sparseArray.put(49, "cardWidth");
            sparseArray.put(50, "chatHint");
            sparseArray.put(51, "chatPlayerInputHint");
            sparseArray.put(52, "collapsedTextAlpha");
            sparseArray.put(53, "config");
            sparseArray.put(54, "constellationAndAge");
            sparseArray.put(55, "containerHeight");
            sparseArray.put(56, "containerSelected");
            sparseArray.put(57, "containerVisible");
            sparseArray.put(58, TextSource.CFG_CONTENT);
            sparseArray.put(59, "contentAlpha");
            sparseArray.put(60, "contentColor");
            sparseArray.put(61, "contentMarginTop");
            sparseArray.put(62, "contents");
            sparseArray.put(63, "control");
            sparseArray.put(64, "cover");
            sparseArray.put(65, "coverHorizontal");
            sparseArray.put(66, "coverThumbHeight");
            sparseArray.put(67, "coverThumbWidth");
            sparseArray.put(68, "coverTip");
            sparseArray.put(69, "coverUrl");
            sparseArray.put(70, "currentBannerItemPos");
            sparseArray.put(71, "currentDarkTheme");
            sparseArray.put(72, "currentItem");
            sparseArray.put(73, "currentRoleAudioDesc");
            sparseArray.put(74, "danmakuCountText");
            sparseArray.put(75, "danmakuEnable");
            sparseArray.put(76, "danmakuOpen");
            sparseArray.put(77, "danmukuTvText");
            sparseArray.put(78, "danmukuTvVisible");
            sparseArray.put(79, "dataList");
            sparseArray.put(80, "descName");
            sparseArray.put(81, "descVo");
            sparseArray.put(82, "dialogStyleType");
            sparseArray.put(83, "directionType");
            sparseArray.put(84, "disable");
            sparseArray.put(85, "disableTagTextColor");
            sparseArray.put(86, "displayingBanner");
            sparseArray.put(87, "divideCount");
            sparseArray.put(88, "downBadgeDrawable");
            sparseArray.put(89, "downBadgeVisible");
            sparseArray.put(90, "dynamicDamakuNum");
            sparseArray.put(91, "dynamicDurationSt");
            sparseArray.put(92, "dynamicPlayNum");
            sparseArray.put(93, "dynamicPlayedNumIcon");
            sparseArray.put(94, "dynamicPlayedNumText");
            sparseArray.put(95, "emotionBadgeVisible");
            sparseArray.put(96, "emptyType");
            sparseArray.put(97, "endContent");
            sparseArray.put(98, "episodeDurationText");
            sparseArray.put(99, "episodeDurationTextVisible");
            sparseArray.put(100, "episodeTime");
            sparseArray.put(101, "episodeTimeVisible");
            sparseArray.put(102, "errorText");
            sparseArray.put(103, "errorTip");
            sparseArray.put(104, "errorVisible");
            sparseArray.put(105, "eventHandle");
            sparseArray.put(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_HAND_DET_SCORE_THRESHOLD, "exposureEntry");
            sparseArray.put(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_HAND_TRACK_SCORE_THRESHOLD, "extraChecker");
            sparseArray.put(108, "fallRegion");
            sparseArray.put(109, "favored");
            sparseArray.put(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_HAND_SKELETON_THRESHOLD, "favorite");
            sparseArray.put(CaptionFx.BUBBLEPATH_FIELD_NUMBER, "firstButton");
            sparseArray.put(112, "firstButtonBadgeVo");
            sparseArray.put(113, "firstButtonCharSequence");
            sparseArray.put(114, "firstButtonText");
            sparseArray.put(115, "firstButtonVo");
            sparseArray.put(116, "flContainerVisible");
            sparseArray.put(117, "follow");
            sparseArray.put(118, "followButtonConfig");
            sparseArray.put(119, "followNum");
            sparseArray.put(120, "followed");
            sparseArray.put(121, "fromSpmid");
            sparseArray.put(122, "gifThumbHeight");
            sparseArray.put(SearchBangumiItem.TYPE_FULLNET_TV, "gifThumbWidth");
            sparseArray.put(SearchBangumiItem.TYPE_FULLNET_VARIETY, "gifUrl");
            sparseArray.put(SearchBangumiItem.TYPE_FULLNET_DOCUMENTARY, "handler");
            sparseArray.put(SearchBangumiItem.TYPE_FULLNET_MOVIE, "hasAddView");
            sparseArray.put(SearchBangumiItem.TYPE_FULLNET_BANGUMI, "hasAnnouncement");
            sparseArray.put(128, "hasBadge");
            sparseArray.put(129, "hasCoverShadow");
            sparseArray.put(130, "hasImgBadge");
            sparseArray.put(131, "hasIncomingAnimation");
            sparseArray.put(132, "hasPendant");
            sparseArray.put(133, "hasPinMsg");
            sparseArray.put(134, "hasPlayedVideo");
            sparseArray.put(135, "hasSubtitle");
            sparseArray.put(136, "hasSubtitleBadge");
            sparseArray.put(137, "hasTitle");
            sparseArray.put(138, "headBgColor");
            sparseArray.put(139, "headerCover");
            sparseArray.put(140, "highPrivilegedUser");
            sparseArray.put(141, "icon");
            sparseArray.put(142, "iconVo");
            sparseArray.put(143, "imageAlpha");
            sparseArray.put(144, "imageDrawableId");
            sparseArray.put(145, "imageTranslationY");
            sparseArray.put(146, "imageUrl");
            sparseArray.put(147, "imgBadge");
            sparseArray.put(148, "immediateFlip");
            sparseArray.put(149, "indexTitle");
            sparseArray.put(150, "indexTitleColor");
            sparseArray.put(151, "info");
            sparseArray.put(152, "inlineBg");
            sparseArray.put(153, "inlineButton");
            sparseArray.put(154, "inlineEventListener");
            sparseArray.put(155, "inlineOperationListener");
            sparseArray.put(156, "inputAlpha");
            sparseArray.put(157, "inputBarEnable");
            sparseArray.put(158, "inputBgWidth");
            sparseArray.put(159, "inputHintText");
            sparseArray.put(160, "inputText");
            sparseArray.put(161, "isBackVisible");
            sparseArray.put(162, "isCloseVisible");
            sparseArray.put(163, "isGuideWindowVisible");
            sparseArray.put(164, "item");
            sparseArray.put(165, "itemDecoration");
            sparseArray.put(166, "itemShowType");
            sparseArray.put(167, "job");
            sparseArray.put(168, "landscape");
            sparseArray.put(169, "lastItemWidth");
            sparseArray.put(170, "lbBadgeColor");
            sparseArray.put(171, "lbBadgeInfo");
            sparseArray.put(172, "lbBadgeSize");
            sparseArray.put(173, "lbBadgeText");
            sparseArray.put(174, "leftBadgeBackDrawable");
            sparseArray.put(175, "leftBadgeText");
            sparseArray.put(176, "leftBadgeTextColor");
            sparseArray.put(177, "leftBadgeVisible");
            sparseArray.put(178, "leftBtnBackDrawable");
            sparseArray.put(179, "leftBtnVisible");
            sparseArray.put(180, "leftText");
            sparseArray.put(181, "leftTextColor");
            sparseArray.put(182, "levelDrawableId");
            sparseArray.put(183, "link");
            sparseArray.put(184, "list");
            sparseArray.put(185, "ltBadgeText");
            sparseArray.put(186, "ltBadgeUri");
            sparseArray.put(187, "marginTop");
            sparseArray.put(188, "master");
            sparseArray.put(189, IDeviceColorModule.EDGE_MODE_KEY);
            sparseArray.put(190, "moduleStyleThemeColor");
            sparseArray.put(191, "msgContent");
            sparseArray.put(192, "myCard");
            sparseArray.put(193, "nameSpannableText");
            sparseArray.put(194, "nameTextColor");
            sparseArray.put(195, "needReplay");
            sparseArray.put(196, "needShowEndContainer");
            sparseArray.put(197, "needShowTitle");
            sparseArray.put(198, "negativeBtnText");
            sparseArray.put(TrustedErrorCode.MANAGER_ERROR_UNKONWN_CODE, "negativeBtnVisible");
            sparseArray.put(200, "newBadgeVisible");
            sparseArray.put(201, "newMsgText");
            sparseArray.put(202, "newPageName");
            sparseArray.put(203, "newPlayerMsgText");
            sparseArray.put(ComposerKt.providerMapsKey, "nickTextColor");
            sparseArray.put(205, "nickTvColor");
            sparseArray.put(ComposerKt.referenceKey, "nickname");
            sparseArray.put(ComposerKt.reuseKey, "onButtonClick");
            sparseArray.put(208, "onClick");
            sparseArray.put(209, "onNegativeClick");
            sparseArray.put(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_BODY_STATURE, "onPositiveClick");
            sparseArray.put(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_CAM_FOVX, "onScreen");
            sparseArray.put(212, "operations");
            sparseArray.put(213, "order");
            sparseArray.put(214, "orderText");
            sparseArray.put(215, "orderVisible");
            sparseArray.put(216, "overlayImageDrawable");
            sparseArray.put(217, "ownerState");
            sparseArray.put(218, "paddingStartAndEnd");
            sparseArray.put(219, "pageActive");
            sparseArray.put(220, "pageColor");
            sparseArray.put(221, "pageId");
            sparseArray.put(222, "pageInfo");
            sparseArray.put(223, "pagerScrollState");
            sparseArray.put(224, "params");
            sparseArray.put(225, "personAvatar");
            sparseArray.put(226, "personName");
            sparseArray.put(227, "playRecord");
            sparseArray.put(228, "playedNumIcon");
            sparseArray.put(229, "playedNumText");
            sparseArray.put(230, "playedNumVisible");
            sparseArray.put(231, "playerContainer");
            sparseArray.put(232, "playerNickTextColor");
            sparseArray.put(233, "playingLottieFileName");
            sparseArray.put(234, "playingLottieVisible");
            sparseArray.put(235, "playingVideo");
            sparseArray.put(236, "positiveBtnText");
            sparseArray.put(237, "positiveBtnVisible");
            sparseArray.put(238, "positiveOrder");
            sparseArray.put(239, "progressPercent");
            sparseArray.put(240, "quickMsgsVisible");
            sparseArray.put(241, EditCustomizeSticker.TAG_RANK);
            sparseArray.put(242, Constant.IN_KEY_REASON);
            sparseArray.put(243, "report");
            sparseArray.put(244, "reportVo");
            sparseArray.put(245, "reporter");
            sparseArray.put(246, "rightBadgeBackDrawable");
            sparseArray.put(247, "rightBadgeText");
            sparseArray.put(248, "rightBadgeTextColor");
            sparseArray.put(249, "rightBadgeVisible");
            sparseArray.put(250, "rightBottomBold");
            sparseArray.put(251, "rightBottomText");
            sparseArray.put(252, "rightBottomTextColor");
            sparseArray.put(253, "rightBtnBackDrawable");
            sparseArray.put(254, "rightBtnVisible");
            sparseArray.put(255, "rightContent");
            sparseArray.put(256, "rightText");
            sparseArray.put(257, "rightTextColor");
            sparseArray.put(258, "rightTopImg");
            sparseArray.put(259, "roleAvatar");
            sparseArray.put(260, "roleList");
            sparseArray.put(261, "roleListHeight");
            sparseArray.put(262, "roleName");
            sparseArray.put(263, "roleTitle");
            sparseArray.put(264, "roleType");
            sparseArray.put(265, "roomMode");
            sparseArray.put(266, "rootAlpha");
            sparseArray.put(267, "rootVisibility");
            sparseArray.put(268, "score");
            sparseArray.put(269, "scrollListener");
            sparseArray.put(270, "scrollPosWithOffset");
            sparseArray.put(271, "seasonType");
            sparseArray.put(272, "secondButton");
            sparseArray.put(273, "secondButtonBadgeVo");
            sparseArray.put(274, "secondButtonCharSequence");
            sparseArray.put(275, "secondButtonText");
            sparseArray.put(276, "secondButtonVo");
            sparseArray.put(277, "sectionClosed");
            sparseArray.put(278, "select");
            sparseArray.put(279, "selectDataList");
            sparseArray.put(280, "selectTagBackground");
            sparseArray.put(281, "selectTagTextColor");
            sparseArray.put(282, "selectTitle");
            sparseArray.put(283, "selected");
            sparseArray.put(284, "sexDrawableId");
            sparseArray.put(285, "shieldState");
            sparseArray.put(286, "showBadge");
            sparseArray.put(287, "showComment");
            sparseArray.put(288, "showCover");
            sparseArray.put(289, "showCoverTip");
            sparseArray.put(290, "showFeatureFilm");
            sparseArray.put(291, "showFollow");
            sparseArray.put(292, "showGif");
            sparseArray.put(293, "showImgBadge");
            sparseArray.put(294, "showInlineBg");
            sparseArray.put(295, "showMore");
            sparseArray.put(296, "showNewContent");
            sparseArray.put(297, "showRank");
            sparseArray.put(298, "showRightBottomText");
            sparseArray.put(299, "showShadow");
            sparseArray.put(300, "showShortUpInfo");
            sparseArray.put(301, "showTopic");
            sparseArray.put(302, "showType");
            sparseArray.put(303, "showUGCUpInfo");
            sparseArray.put(304, "showingIncomingAnimation");
            sparseArray.put(305, "smoothScroll");
            sparseArray.put(306, "spannableTitle");
            sparseArray.put(ErrorCode.E_OPERATIONTYPE_EMPTY, "splitText");
            sparseArray.put(ErrorCode.E_SIGN_ERROR, "spmid");
            sparseArray.put(ErrorCode.E_T0_HANDLE_INVALID, "subContent");
            sparseArray.put(ErrorCode.E_VOS_UPDATE_TRUSTTIME, "subContentColor");
            sparseArray.put(ErrorCode.E_BUSY, "subTitle");
            sparseArray.put(ErrorCode.E_CRASHED_BEFORE, "subTitleColor");
            sparseArray.put(ErrorCode.E_TA_DEGRADE, "subTitleLeftIconUrl");
            sparseArray.put(314, "subTitleText");
            sparseArray.put(315, "subTitleVo");
            sparseArray.put(316, "subscribeStatus");
            sparseArray.put(317, "subtitle");
            sparseArray.put(318, "subtitleBackgroundRes");
            sparseArray.put(319, "subtitleBadgeInfo");
            sparseArray.put(320, "subtitleBadgeText");
            sparseArray.put(321, "subtitleColor");
            sparseArray.put(322, "subtitleMaxLines");
            sparseArray.put(323, "subtitlePadding");
            sparseArray.put(324, "subtitleScoreBadgeColor");
            sparseArray.put(325, "subtitleScoreBadgeSize");
            sparseArray.put(326, "subtitleScoreBadgeText");
            sparseArray.put(327, "subtitleSize");
            sparseArray.put(328, "switchBtnBgColor");
            sparseArray.put(329, "tabTitleList");
            sparseArray.put(330, "tagLineData");
            sparseArray.put(331, "tagText");
            sparseArray.put(332, "tagTitle");
            sparseArray.put(333, "tagTitleColor");
            sparseArray.put(334, "time");
            sparseArray.put(335, "timeVisible");
            sparseArray.put(336, "tintNewColor");
            sparseArray.put(337, "tintTitle");
            sparseArray.put(338, "title");
            sparseArray.put(339, "title1");
            sparseArray.put(340, "title2");
            sparseArray.put(341, "titleActionAlpha");
            sparseArray.put(342, "titleColor");
            sparseArray.put(343, "titleContainerAlpha");
            sparseArray.put(344, "titleCover");
            sparseArray.put(345, "titleImg");
            sparseArray.put(346, "titleLineCount");
            sparseArray.put(347, "titleMarginStartAndEnd");
            sparseArray.put(348, "titleMaxLine");
            sparseArray.put(349, "titleMaxLines");
            sparseArray.put(350, "titleText");
            sparseArray.put(351, "titleTextSize");
            sparseArray.put(352, "titleVo");
            sparseArray.put(353, "topContainerShow");
            sparseArray.put(354, "topicContent");
            sparseArray.put(355, "tryingToPlayVideo");
            sparseArray.put(356, "typeface");
            sparseArray.put(357, "unselectedTagBackground");
            sparseArray.put(358, "unselectedTagTextColor");
            sparseArray.put(359, "upInfoTvText");
            sparseArray.put(360, "upInfoTvVisible");
            sparseArray.put(361, "upName");
            sparseArray.put(362, "updateAttention");
            sparseArray.put(363, "updateDescription");
            sparseArray.put(364, "updateGuestAttention");
            sparseArray.put(365, "upperAvatar");
            sparseArray.put(366, "upperName");
            sparseArray.put(367, "upperRecommended");
            sparseArray.put(368, "useTintColor");
            sparseArray.put(369, "value");
            sparseArray.put(370, "videoPlaying");
            sparseArray.put(371, "viewModel");
            sparseArray.put(372, "viewModelInner");
            sparseArray.put(373, "viewPagerAdapter");
            sparseArray.put(374, "vipBarVo");
            sparseArray.put(375, "vm");
            sparseArray.put(376, "vvmAdapter");
            sparseArray.put(377, "vvmAdapterInner");
            sparseArray.put(378, "watchProgress");
            sparseArray.put(379, "width");
            sparseArray.put(380, "xPosition");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/DataBinderMapperImpl$b.class */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap<String, Integer> f69965a;

        static {
            HashMap<String, Integer> map = new HashMap<>(22);
            f69965a = map;
            p2.b.a(2131499596, map, "layout/oprt_common_card_rank_0", 2131499597, "layout/oprt_common_horizontal_cards_v2_0");
            p2.b.a(2131499598, map, "layout/oprt_common_rank_card_item_0", 2131499599, "layout/oprt_double_column_card_0");
            p2.b.a(2131499600, map, "layout/oprt_expandable_banner_item_0", 2131499602, "layout/oprt_favor_list_child_0");
            p2.b.a(2131499603, map, "layout/oprt_favor_list_item_0", 2131499604, "layout/oprt_film_list_0");
            p2.b.a(2131499605, map, "layout/oprt_film_list_item_layout_0", 2131499613, "layout/oprt_home_banner_new_user_cards_layout_0");
            p2.b.a(2131499614, map, "layout/oprt_home_card_0", 2131499615, "layout/oprt_home_flow_banner_0");
            p2.b.a(2131499616, map, "layout/oprt_home_flow_banner_item_0", 2131499617, "layout/oprt_home_flow_item_banner_v2_0");
            p2.b.a(2131499631, map, "layout/oprt_item_home_index_0", 2131499638, "layout/oprt_item_home_roll_0");
            p2.b.a(2131499641, map, "layout/oprt_item_loading_v3_0", 2131499644, "layout/oprt_item_rank_0");
            p2.b.a(2131499647, map, "layout/oprt_item_together_watch_0", 2131499654, "layout/oprt_rank_list_0");
            p2.b.a(2131499655, map, "layout/oprt_rank_list_item_0", 2131499656, "layout/oprt_rank_list_item_page_0");
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(22);
        f69963a = sparseIntArray;
        sparseIntArray.put(2131499596, 1);
        sparseIntArray.put(2131499597, 2);
        sparseIntArray.put(2131499598, 3);
        sparseIntArray.put(2131499599, 4);
        sparseIntArray.put(2131499600, 5);
        sparseIntArray.put(2131499602, 6);
        sparseIntArray.put(2131499603, 7);
        sparseIntArray.put(2131499604, 8);
        sparseIntArray.put(2131499605, 9);
        sparseIntArray.put(2131499613, 10);
        sparseIntArray.put(2131499614, 11);
        sparseIntArray.put(2131499615, 12);
        sparseIntArray.put(2131499616, 13);
        sparseIntArray.put(2131499617, 14);
        sparseIntArray.put(2131499631, 15);
        sparseIntArray.put(2131499638, 16);
        sparseIntArray.put(2131499641, 17);
        sparseIntArray.put(2131499644, 18);
        sparseIntArray.put(2131499647, 19);
        sparseIntArray.put(2131499654, 20);
        sparseIntArray.put(2131499655, 21);
        sparseIntArray.put(2131499656, 22);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(6);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.bilibili.app.gemini.base.DataBinderMapperImpl());
        arrayList.add(new com.bilibili.app.screen.adjust.DataBinderMapperImpl());
        arrayList.add(new com.bilibili.bangumi.DataBinderMapperImpl());
        arrayList.add(new com.bilibili.ogv.glue.DataBinderMapperImpl());
        arrayList.add(new com.bilibili.ogvcommon.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final String convertBrIdToString(int i7) {
        return a.f69964a.get(i7);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i7) {
        int i8 = f69963a.get(i7);
        if (i8 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        switch (i8) {
            case 1:
                if ("layout/oprt_common_card_rank_0".equals(tag)) {
                    return new C1663b(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for oprt_common_card_rank is invalid. Received: "));
            case 2:
                if ("layout/oprt_common_horizontal_cards_v2_0".equals(tag)) {
                    return new C1665d(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for oprt_common_horizontal_cards_v2 is invalid. Received: "));
            case 3:
                if ("layout/oprt_common_rank_card_item_0".equals(tag)) {
                    return new C1667f(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for oprt_common_rank_card_item is invalid. Received: "));
            case 4:
                if ("layout/oprt_double_column_card_0".equals(tag)) {
                    return new C1669h(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for oprt_double_column_card is invalid. Received: "));
            case 5:
                if ("layout/oprt_expandable_banner_item_0".equals(tag)) {
                    return new C1671j(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for oprt_expandable_banner_item is invalid. Received: "));
            case 6:
                if ("layout/oprt_favor_list_child_0".equals(tag)) {
                    return new C1673l(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for oprt_favor_list_child is invalid. Received: "));
            case 7:
                if ("layout/oprt_favor_list_item_0".equals(tag)) {
                    return new C1675n(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for oprt_favor_list_item is invalid. Received: "));
            case 8:
                if ("layout/oprt_film_list_0".equals(tag)) {
                    return new C1677p(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for oprt_film_list is invalid. Received: "));
            case 9:
                if ("layout/oprt_film_list_item_layout_0".equals(tag)) {
                    return new r(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for oprt_film_list_item_layout is invalid. Received: "));
            case 10:
                if ("layout/oprt_home_banner_new_user_cards_layout_0".equals(tag)) {
                    return new t(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for oprt_home_banner_new_user_cards_layout is invalid. Received: "));
            case 11:
                if ("layout/oprt_home_card_0".equals(tag)) {
                    return new v(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for oprt_home_card is invalid. Received: "));
            case 12:
                if ("layout/oprt_home_flow_banner_0".equals(tag)) {
                    return new x(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for oprt_home_flow_banner is invalid. Received: "));
            case 13:
                if ("layout/oprt_home_flow_banner_item_0".equals(tag)) {
                    return new z(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for oprt_home_flow_banner_item is invalid. Received: "));
            case 14:
                if ("layout/oprt_home_flow_item_banner_v2_0".equals(tag)) {
                    return new B(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for oprt_home_flow_item_banner_v2 is invalid. Received: "));
            case 15:
                if ("layout/oprt_item_home_index_0".equals(tag)) {
                    return new D(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for oprt_item_home_index is invalid. Received: "));
            case 16:
                if ("layout/oprt_item_home_roll_0".equals(tag)) {
                    return new F(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for oprt_item_home_roll is invalid. Received: "));
            case 17:
                if ("layout/oprt_item_loading_v3_0".equals(tag)) {
                    return new H(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for oprt_item_loading_v3 is invalid. Received: "));
            case 18:
                if ("layout/oprt_item_rank_0".equals(tag)) {
                    return new J(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for oprt_item_rank is invalid. Received: "));
            case 19:
                if ("layout/oprt_item_together_watch_0".equals(tag)) {
                    return new L(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for oprt_item_together_watch is invalid. Received: "));
            case 20:
                if ("layout/oprt_rank_list_0".equals(tag)) {
                    return new N(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for oprt_rank_list is invalid. Received: "));
            case 21:
                if ("layout/oprt_rank_list_item_0".equals(tag)) {
                    return new P(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for oprt_rank_list_item is invalid. Received: "));
            case 22:
                if ("layout/oprt_rank_list_item_page_0".equals(tag)) {
                    return new S(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for oprt_rank_list_item_page is invalid. Received: "));
            default:
                return null;
        }
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i7) {
        if (viewArr == null || viewArr.length == 0 || f69963a.get(i7) <= 0 || viewArr[0].getTag() != null) {
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
        Integer num = b.f69965a.get(str);
        if (num != null) {
            iIntValue = num.intValue();
        }
        return iIntValue;
    }
}
