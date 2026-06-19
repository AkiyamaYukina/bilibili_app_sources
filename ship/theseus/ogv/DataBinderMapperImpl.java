package com.bilibili.ship.theseus.ogv;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.alipay.alipaysecuritysdk.common.exception.ErrorCode;
import com.alipay.blueshield.IDeviceColorModule;
import com.alipay.blueshield.TrustedErrorCode;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.live.streaming.source.TextSource;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.ogv.infra.widget.TagFlowLayout;
import com.bilibili.search2.api.SearchBangumiItem;
import com.bilibili.ship.theseus.ogv.intro.coupon.MaxHeightRecyclerView;
import com.bilibili.studio.videoeditor.CaptionFx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tv.danmaku.bili.widget.LoadingImageView;
import zu0.A0;
import zu0.AbstractC9220b0;
import zu0.AbstractC9221c;
import zu0.AbstractC9225e;
import zu0.AbstractC9229g;
import zu0.AbstractC9235j;
import zu0.AbstractC9236j0;
import zu0.AbstractC9240l0;
import zu0.AbstractC9262x;
import zu0.AbstractC9267z0;
import zu0.C0;
import zu0.C9216A;
import zu0.C9218a0;
import zu0.C9219b;
import zu0.C9222c0;
import zu0.C9226e0;
import zu0.C9227f;
import zu0.C9230g0;
import zu0.C9234i0;
import zu0.C9238k0;
import zu0.C9241m;
import zu0.C9242m0;
import zu0.C9245o;
import zu0.C9246o0;
import zu0.C9249q;
import zu0.C9250q0;
import zu0.C9252s;
import zu0.C9253s0;
import zu0.C9256u;
import zu0.C9257u0;
import zu0.C9261w0;
import zu0.C9264y;
import zu0.C9265y0;
import zu0.E0;
import zu0.G0;
import zu0.I0;
import zu0.K0;
import zu0.M0;
import zu0.N;
import zu0.O;
import zu0.O0;
import zu0.P;
import zu0.Q;
import zu0.Q0;
import zu0.R0;
import zu0.S0;
import zu0.T0;
import zu0.U;
import zu0.V0;
import zu0.W;
import zu0.X;
import zu0.X0;
import zu0.Z0;
import zu0.b1;
import zu0.d1;
import zu0.f1;
import zu0.h1;
import zu0.j1;
import zu0.l1;
import zu0.n1;
import zu0.p1;
import zu0.r1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/DataBinderMapperImpl.class */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f91223a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/DataBinderMapperImpl$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseArray<String> f91224a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(387);
            f91224a = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "actorEngName");
            sparseArray.put(2, "actorName");
            sparseArray.put(3, "allTagDataList");
            sparseArray.put(4, "animSurpriseEvent");
            sparseArray.put(5, "animSurpriseState");
            sparseArray.put(6, "animatedValue");
            sparseArray.put(7, "announcementContent");
            sparseArray.put(8, "announcementTitle");
            sparseArray.put(9, "arrowVisible");
            sparseArray.put(10, "attention");
            sparseArray.put(11, "audioEdition");
            sparseArray.put(12, "audioItemBackDrawable");
            sparseArray.put(13, "audioList");
            sparseArray.put(14, "avatar");
            sparseArray.put(15, "avatarImageDrawable");
            sparseArray.put(16, "avatarLayoutVisible");
            sparseArray.put(17, "avatarPendantUrl");
            sparseArray.put(18, "avatarUrl");
            sparseArray.put(19, "backImageUrl");
            sparseArray.put(20, "backVisible");
            sparseArray.put(21, "background");
            sparseArray.put(22, "backgroundColor");
            sparseArray.put(23, "backgroundDescriptionText");
            sparseArray.put(24, "backgroundDrawable");
            sparseArray.put(25, "backgroundHeaderImageUrl");
            sparseArray.put(26, "backgroundTitleText");
            sparseArray.put(27, "backgroundTitleTextColor");
            sparseArray.put(28, "backgroundTranslucent");
            sparseArray.put(29, "backgroundUrl");
            sparseArray.put(30, "badgeInfo");
            sparseArray.put(31, "badgeText");
            sparseArray.put(32, "badgeVisibility");
            sparseArray.put(33, "bgAlpha");
            sparseArray.put(34, "bgBarDrawable");
            sparseArray.put(35, "bgBarVisible");
            sparseArray.put(36, "bgColor");
            sparseArray.put(37, "bgDrawable");
            sparseArray.put(38, "bgHeight");
            sparseArray.put(39, "bgImageDrawable");
            sparseArray.put(40, "bgImageUrl");
            sparseArray.put(41, "bgImageVisible");
            sparseArray.put(42, "bgSrcVisible");
            sparseArray.put(43, "bgWidth");
            sparseArray.put(44, "bitmapTransformation");
            sparseArray.put(45, "bottomDisplay1");
            sparseArray.put(46, "bottomDisplay2");
            sparseArray.put(47, "bottomDisplay3");
            sparseArray.put(48, "bottomDisplay4");
            sparseArray.put(49, "btnBgColor");
            sparseArray.put(50, "btnTextColor");
            sparseArray.put(51, "btnTryAgainText");
            sparseArray.put(52, "button");
            sparseArray.put(53, "buttonBackground");
            sparseArray.put(54, "buttonText");
            sparseArray.put(55, "buttonTextColor");
            sparseArray.put(56, "buttonVisible");
            sparseArray.put(57, "calenderVisible");
            sparseArray.put(58, "chatHint");
            sparseArray.put(59, "chatPlayerInputHint");
            sparseArray.put(60, "clickListener");
            sparseArray.put(61, "clickable");
            sparseArray.put(62, "collapsedTextAlpha");
            sparseArray.put(63, "constellationAndAge");
            sparseArray.put(64, "constraintSetModifier");
            sparseArray.put(65, "containerExposureEntry");
            sparseArray.put(66, "containerHeight");
            sparseArray.put(67, "containerVisible");
            sparseArray.put(68, TextSource.CFG_CONTENT);
            sparseArray.put(69, "contentAlpha");
            sparseArray.put(70, "contentColor");
            sparseArray.put(71, "cornerBackDrawable");
            sparseArray.put(72, "cornerText");
            sparseArray.put(73, "cornerVisible");
            sparseArray.put(74, "countdownRemaining");
            sparseArray.put(75, "countdownTip");
            sparseArray.put(76, "countdownTotal");
            sparseArray.put(77, "countdownTrackEnabled");
            sparseArray.put(78, "cover");
            sparseArray.put(79, "coverHeight");
            sparseArray.put(80, "coverUrl");
            sparseArray.put(81, "coverWidth");
            sparseArray.put(82, "currentEpisodeListIsReversed");
            sparseArray.put(83, "currentItem");
            sparseArray.put(84, "currentRoleAudioDesc");
            sparseArray.put(85, "currentTabItemType");
            sparseArray.put(86, "danmakuNumIcon");
            sparseArray.put(87, "danmakuTvText");
            sparseArray.put(88, "dataList");
            sparseArray.put(89, "deliveryBtnImage");
            sparseArray.put(90, "deliveryBtnTitle");
            sparseArray.put(91, "deliveryBtnVisible");
            sparseArray.put(92, "desc");
            sparseArray.put(93, "descName");
            sparseArray.put(94, "descTipText");
            sparseArray.put(95, "disable");
            sparseArray.put(96, "disableTagTextColor");
            sparseArray.put(97, "downloadable");
            sparseArray.put(98, "drawerOpen");
            sparseArray.put(99, "emotionBadgeVisible");
            sparseArray.put(100, "emptyType");
            sparseArray.put(101, "endContent");
            sparseArray.put(102, "endIcon");
            sparseArray.put(103, "endIconVisible");
            sparseArray.put(104, "episodeDurationText");
            sparseArray.put(105, "episodeDurationTextVisible");
            sparseArray.put(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_HAND_DET_SCORE_THRESHOLD, "episodeListVm");
            sparseArray.put(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_HAND_TRACK_SCORE_THRESHOLD, "episodesScrollerContentDescription");
            sparseArray.put(108, "errorImageAlpha");
            sparseArray.put(109, "errorText");
            sparseArray.put(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_HAND_SKELETON_THRESHOLD, "errorTip");
            sparseArray.put(CaptionFx.BUBBLEPATH_FIELD_NUMBER, "errorVisible");
            sparseArray.put(112, "expandableIsExpand");
            sparseArray.put(113, "expandableText");
            sparseArray.put(114, "exposureLayoutInfoReceiver");
            sparseArray.put(115, "firstButton");
            sparseArray.put(116, "firstButtonText");
            sparseArray.put(117, "followBackDrawable");
            sparseArray.put(118, "followButtonConfig");
            sparseArray.put(119, "followClickable");
            sparseArray.put(120, "followDesc");
            sparseArray.put(121, "followDescColor");
            sparseArray.put(122, "followIconDrawable");
            sparseArray.put(SearchBangumiItem.TYPE_FULLNET_TV, "followIconVisible");
            sparseArray.put(SearchBangumiItem.TYPE_FULLNET_VARIETY, "followLottieAnimationVisible");
            sparseArray.put(SearchBangumiItem.TYPE_FULLNET_DOCUMENTARY, "followLottieAssetFileName");
            sparseArray.put(SearchBangumiItem.TYPE_FULLNET_MOVIE, "followVisible");
            sparseArray.put(SearchBangumiItem.TYPE_FULLNET_BANGUMI, "followed");
            sparseArray.put(128, "foregroundDescriptionText");
            sparseArray.put(129, "foregroundDescriptionTextColor");
            sparseArray.put(130, "foregroundHeaderImageUrl");
            sparseArray.put(131, "foregroundTitleText");
            sparseArray.put(132, "foregroundTitleTextColor");
            sparseArray.put(133, "foregroundViewAlpha");
            sparseArray.put(134, "foregroundViewVisible");
            sparseArray.put(135, "guideBarHeight");
            sparseArray.put(136, "guideBarPaddingBottom");
            sparseArray.put(137, "guideBarPaddingTop");
            sparseArray.put(138, "guideHint");
            sparseArray.put(139, "half");
            sparseArray.put(140, "hallCover");
            sparseArray.put(141, "hallEnterHotText");
            sparseArray.put(142, "hallSubtitle");
            sparseArray.put(143, "hallTitle");
            sparseArray.put(144, "handler");
            sparseArray.put(145, "hasAddView");
            sparseArray.put(146, "hasAnnouncement");
            sparseArray.put(147, "hasPendant");
            sparseArray.put(148, "hasPinMsg");
            sparseArray.put(149, "hasRating");
            sparseArray.put(150, "hasTitle");
            sparseArray.put(151, "height");
            sparseArray.put(152, "highPrivilegedUser");
            sparseArray.put(153, "horizontalMargin");
            sparseArray.put(154, "horizontalPadding");
            sparseArray.put(155, "icon");
            sparseArray.put(156, "iconTintColor");
            sparseArray.put(157, "iconUrl");
            sparseArray.put(158, "iconVisible");
            sparseArray.put(159, "image");
            sparseArray.put(160, "imageAlpha");
            sparseArray.put(161, "imageBadge");
            sparseArray.put(162, "imageBadgeVisible");
            sparseArray.put(163, "imageDrawableId");
            sparseArray.put(164, "imageHeight");
            sparseArray.put(165, "imageTranslationY");
            sparseArray.put(166, "imageUrl");
            sparseArray.put(167, "imageWidth");
            sparseArray.put(168, "immersiveCloseBtnTintColor");
            sparseArray.put(169, "info");
            sparseArray.put(170, "infoArea");
            sparseArray.put(171, "infoType");
            sparseArray.put(172, "inputBarEnable");
            sparseArray.put(173, "inputText");
            sparseArray.put(174, "isBackVisible");
            sparseArray.put(175, "isCloseVisible");
            sparseArray.put(176, "isFullscreen");
            sparseArray.put(177, "itemDecoration");
            sparseArray.put(178, "ivRightVisible");
            sparseArray.put(179, "label");
            sparseArray.put(180, "labelVisible");
            sparseArray.put(181, "landscape");
            sparseArray.put(182, "leftBadgeBackDrawable");
            sparseArray.put(183, "leftBadgeText");
            sparseArray.put(184, "leftBadgeTextColor");
            sparseArray.put(185, "leftBadgeVisible");
            sparseArray.put(186, "leftBtnBackDrawable");
            sparseArray.put(187, "leftBtnIconUrl");
            sparseArray.put(188, "leftBtnVisible");
            sparseArray.put(189, "leftMargin");
            sparseArray.put(190, "leftText");
            sparseArray.put(191, "leftTextColor");
            sparseArray.put(192, "levelDrawableId");
            sparseArray.put(193, "limitText");
            sparseArray.put(194, "limitTextColor");
            sparseArray.put(195, "lineTextColor");
            sparseArray.put(196, "liveReserveBarHeight");
            sparseArray.put(197, "liveReserveBarVisible");
            sparseArray.put(198, "loadState");
            sparseArray.put(TrustedErrorCode.MANAGER_ERROR_UNKONWN_CODE, "loadingState");
            sparseArray.put(200, "marginTop");
            sparseArray.put(201, "master");
            sparseArray.put(202, "miniPlayerDoubleTapHintVisible");
            sparseArray.put(203, IDeviceColorModule.EDGE_MODE_KEY);
            sparseArray.put(ComposerKt.providerMapsKey, "moreEpisodesContentDescription");
            sparseArray.put(205, "moreText");
            sparseArray.put(ComposerKt.referenceKey, "moreTextVisible");
            sparseArray.put(ComposerKt.reuseKey, "msgContent");
            sparseArray.put(208, "myCard");
            sparseArray.put(209, "name");
            sparseArray.put(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_BODY_STATURE, "needShowEndContainer");
            sparseArray.put(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_CAM_FOVX, "negativeBtnText");
            sparseArray.put(212, "negativeBtnVisible");
            sparseArray.put(213, "newBadgeVisible");
            sparseArray.put(214, "newMsgText");
            sparseArray.put(215, "newPlayerMsgText");
            sparseArray.put(216, "nextSheetVisible");
            sparseArray.put(217, "nickTextColor");
            sparseArray.put(218, "nickTvColor");
            sparseArray.put(219, "nickname");
            sparseArray.put(220, "notice");
            sparseArray.put(221, "noticeTextColor");
            sparseArray.put(222, "officialBadgeDrawable");
            sparseArray.put(223, "officialImageDrawable");
            sparseArray.put(224, "onClick");
            sparseArray.put(225, "onDismissRequest");
            sparseArray.put(226, "onErrorCoverClickListener");
            sparseArray.put(227, "onLimitCoverClickListener");
            sparseArray.put(228, "onNegativeClick");
            sparseArray.put(229, "onPositiveClick");
            sparseArray.put(230, "orderText");
            sparseArray.put(231, "orderVisible");
            sparseArray.put(232, "ownerState");
            sparseArray.put(233, "paddingEnd");
            sparseArray.put(234, "paddingStart");
            sparseArray.put(235, "params");
            sparseArray.put(236, "payTipVo");
            sparseArray.put(237, "pendentShowUrl");
            sparseArray.put(238, "pendentVisible");
            sparseArray.put(239, "personAvatar");
            sparseArray.put(240, "personName");
            sparseArray.put(241, "playedNumIcon");
            sparseArray.put(242, "playedNumText");
            sparseArray.put(243, "playerContainer");
            sparseArray.put(244, "playerNickTextColor");
            sparseArray.put(245, "playingLottieFileName");
            sparseArray.put(246, "positiveBtnText");
            sparseArray.put(247, "positiveBtnVisible");
            sparseArray.put(248, "preSaleCountdownClickable");
            sparseArray.put(249, "preSaleCountdownDrawable");
            sparseArray.put(250, "preSaleCountdownVisible");
            sparseArray.put(251, "quickMsgsVisible");
            sparseArray.put(252, "rankNoneLayoutVisible");
            sparseArray.put(253, "ratingIsValid");
            sparseArray.put(254, "ratingPeopleText");
            sparseArray.put(255, "ratingText");
            sparseArray.put(256, "releaseDateShow");
            sparseArray.put(257, "reorderVisible");
            sparseArray.put(258, "reportVo");
            sparseArray.put(259, "retryBtnBgColor");
            sparseArray.put(260, "retryBtnJumpLink");
            sparseArray.put(261, "retryBtnText");
            sparseArray.put(262, "retryBtnTextColor");
            sparseArray.put(263, "retryBtnVisible");
            sparseArray.put(264, "retryText");
            sparseArray.put(265, "reversed");
            sparseArray.put(266, "reviewRatingNum");
            sparseArray.put(267, "rightBadgeBackDrawable");
            sparseArray.put(268, "rightBadgeText");
            sparseArray.put(269, "rightBadgeTextColor");
            sparseArray.put(270, "rightBadgeVisible");
            sparseArray.put(271, "rightBottomBadgeMaskDrawable");
            sparseArray.put(272, "rightBottomBadgeUrl");
            sparseArray.put(273, "rightBtnBackDrawable");
            sparseArray.put(274, "rightBtnIconUrl");
            sparseArray.put(275, "rightBtnVisible");
            sparseArray.put(276, "rightText");
            sparseArray.put(277, "rightTextColor");
            sparseArray.put(278, "roleAvatar");
            sparseArray.put(279, "roleList");
            sparseArray.put(280, "roleListHeight");
            sparseArray.put(281, "roleName");
            sparseArray.put(282, "roleTitle");
            sparseArray.put(283, "roleType");
            sparseArray.put(284, "roomMode");
            sparseArray.put(285, "rootAlpha");
            sparseArray.put(286, "rootPaddingEnd");
            sparseArray.put(287, "rootPaddingStart");
            sparseArray.put(288, "ruleTip");
            sparseArray.put(289, "scrollListener");
            sparseArray.put(290, "scrollPosWithOffset");
            sparseArray.put(291, "scrollPositions");
            sparseArray.put(292, "seasonListVisible");
            sparseArray.put(293, "secondButton");
            sparseArray.put(294, "secondButtonText");
            sparseArray.put(295, "select");
            sparseArray.put(296, "selectButton");
            sparseArray.put(297, "selectDataList");
            sparseArray.put(298, "selectTagBackground");
            sparseArray.put(299, "selectTagTextColor");
            sparseArray.put(300, "selectTitle");
            sparseArray.put(301, "selected");
            sparseArray.put(302, "selectedImage");
            sparseArray.put(303, "sexDrawableId");
            sparseArray.put(304, "shieldState");
            sparseArray.put(305, "showSelected");
            sparseArray.put(306, "showingControl");
            sparseArray.put(ErrorCode.E_OPERATIONTYPE_EMPTY, "showingErrorCover");
            sparseArray.put(ErrorCode.E_SIGN_ERROR, "showingLimitCover");
            sparseArray.put(ErrorCode.E_T0_HANDLE_INVALID, "singleEntrance");
            sparseArray.put(ErrorCode.E_VOS_UPDATE_TRUSTTIME, "singleImageUrl");
            sparseArray.put(ErrorCode.E_BUSY, "singleImageVisible");
            sparseArray.put(ErrorCode.E_CRASHED_BEFORE, "singleImgHeight");
            sparseArray.put(ErrorCode.E_TA_DEGRADE, "singleVipDesc");
            sparseArray.put(314, "singleVipDescVisible");
            sparseArray.put(315, "softKeyBoardOpen");
            sparseArray.put(316, "spannableTitle");
            sparseArray.put(317, "sponsorDefaultVisible");
            sparseArray.put(318, "sponsorHeadDiverVisible");
            sparseArray.put(319, "sponsorHeadVisible");
            sparseArray.put(320, "sponsorNumText");
            sparseArray.put(321, "sponsorRankText");
            sparseArray.put(322, "sponsorTipText");
            sparseArray.put(323, "sponsorTipVisible");
            sparseArray.put(324, "styleDataList");
            sparseArray.put(325, "subContent");
            sparseArray.put(326, "subContentColor");
            sparseArray.put(327, "subText");
            sparseArray.put(328, "subtitle");
            sparseArray.put(329, "subtitleColor");
            sparseArray.put(330, "subtitleLeftIconUrl");
            sparseArray.put(331, "subtitleText");
            sparseArray.put(332, "subtitleVisible");
            sparseArray.put(333, "subtitleVo");
            sparseArray.put(334, "tagBackgroundDrawable");
            sparseArray.put(335, "tagLineData");
            sparseArray.put(336, "tagText");
            sparseArray.put(337, "tagTitle");
            sparseArray.put(338, "tagTitleColor");
            sparseArray.put(339, "textColor");
            sparseArray.put(340, "textRating");
            sparseArray.put(341, "time");
            sparseArray.put(342, "timeLengthShow");
            sparseArray.put(343, "timeVisible");
            sparseArray.put(344, "title");
            sparseArray.put(345, "titleBold");
            sparseArray.put(346, "titleCenter");
            sparseArray.put(347, "titleColor");
            sparseArray.put(348, "titleMarginRight");
            sparseArray.put(349, "titleText");
            sparseArray.put(350, "titleTextSize");
            sparseArray.put(351, "titleVisible");
            sparseArray.put(352, "titleVo");
            sparseArray.put(353, "titlesVm");
            sparseArray.put(354, "topContainerShow");
            sparseArray.put(355, "topMargin");
            sparseArray.put(356, "tvLeftTextColor");
            sparseArray.put(357, "tvRightColorFilter");
            sparseArray.put(358, "tvRightText");
            sparseArray.put(359, "tvRightTextColor");
            sparseArray.put(360, "unselectedImage");
            sparseArray.put(361, "unselectedTagBackground");
            sparseArray.put(362, "unselectedTagTextColor");
            sparseArray.put(363, "updateAttention");
            sparseArray.put(364, "updateGuestAttention");
            sparseArray.put(365, "upperAvatar");
            sparseArray.put(366, "upperName");
            sparseArray.put(367, "upperNameTextColor");
            sparseArray.put(368, "upperVisible");
            sparseArray.put(369, "useImmersiveCloseBtn");
            sparseArray.put(370, "userList");
            sparseArray.put(371, "value");
            sparseArray.put(372, "videoHeight");
            sparseArray.put(373, "viewModel");
            sparseArray.put(374, "viewModelInner");
            sparseArray.put(375, "vipBadgeVisible");
            sparseArray.put(376, "vipBarVisible");
            sparseArray.put(377, "vipBarVo");
            sparseArray.put(378, "vipDesc");
            sparseArray.put(379, "vipDescVisible");
            sparseArray.put(380, "vipIconUrl");
            sparseArray.put(381, "vipIconVisible");
            sparseArray.put(382, "visible");
            sparseArray.put(383, "vm");
            sparseArray.put(384, "vvmAdapter");
            sparseArray.put(385, "vvmAdapterInner");
            sparseArray.put(386, "width");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/DataBinderMapperImpl$b.class */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap<String, Integer> f91225a;

        static {
            HashMap<String, Integer> map = new HashMap<>(58);
            f91225a = map;
            p2.b.a(2131500206, map, "layout/theseus_activity_entrance_item_0", 2131500207, "layout/theseus_activity_entrance_list_0");
            p2.b.a(2131500208, map, "layout/theseus_activity_invite_bottom_dialog_0", 2131500209, "layout/theseus_actor_info_0");
            p2.b.a(2131500217, map, "layout/theseus_character_avatar_holder_0", 2131500218, "layout/theseus_character_person_info_holder_0");
            p2.b.a(2131502414, map, "layout/theseus_character_works_title_0", 2131500222, "layout/theseus_chat_hall_fragment_0");
            p2.b.a(2131500305, map, "layout/theseus_dialog_ticket_pay_select_0", 2131500306, "layout/theseus_dialog_universe_pay_v2ui_0");
            p2.b.a(2131500315, map, "layout/theseus_feature_and_preview_merged_0", 2131500320, "layout/theseus_float_layer_ep_cover_0");
            p2.b.a(2131500321, map, "layout/theseus_float_layer_ep_long_title_0", 2131500322, "layout/theseus_float_layer_ep_short_and_long_title_0");
            p2.b.a(2131500323, map, "layout/theseus_float_layer_ep_short_title_0", 2131500348, "layout/theseus_intro_detail_float_layer_0");
            p2.b.a(2131500349, map, "layout/theseus_intro_detail_headline_0", 2131500357, "layout/theseus_item_info_actors_0");
            p2.b.a(2131500359, map, "layout/theseus_item_ticket_pay_select_0", 2131500361, "layout/theseus_load_more_0");
            p2.b.a(2131500423, map, "layout/theseus_ogv_actors_0", 2131500424, "layout/theseus_ogv_chathall_alert_dialog_0");
            p2.b.a(2131500428, map, "layout/theseus_ogv_episode_list_0", 2131500429, "layout/theseus_ogv_fragment_intro_info_0");
            p2.b.a(2131500432, map, "layout/theseus_ogv_info_style_0", 2131500433, "layout/theseus_ogv_intro_info_0");
            p2.b.a(2131500434, map, "layout/theseus_ogv_intro_info_headline_0", 2131500435, "layout/theseus_ogv_intro_info_name_0");
            p2.b.a(2131500436, map, "layout/theseus_ogv_invitation_bottom_dialog_background_0", 2131500437, "layout/theseus_ogv_invitation_bottom_dialog_foreground_0");
            p2.b.a(2131500438, map, "layout/theseus_ogv_item_info_style_tag_0", 2131500439, "layout/theseus_ogv_item_role_works_0");
            p2.b.a(2131500441, map, "layout/theseus_ogv_live_reserve_bar_0", 2131500442, "layout/theseus_ogv_page_tab_item_view_0");
            p2.b.a(2131500444, map, "layout/theseus_ogv_roles_info_0", 2131500445, "layout/theseus_ogv_season_item_0");
            p2.b.a(2131500446, map, "layout/theseus_ogv_season_list_0", 2131500447, "layout/theseus_ogv_section_title_0");
            p2.b.a(2131500448, map, "layout/theseus_ogv_single_ep_cover_0", 2131500449, "layout/theseus_ogv_sponsor_0");
            p2.b.a(2131500451, map, "layout/theseus_ogv_video_card_widget_0", 2131500454, "layout/theseus_payment_0");
            p2.b.a(2131500456, map, "layout/theseus_player_dubbing_role_audio_item_0", 2131500457, "layout/theseus_player_dubbing_role_item_0");
            p2.b.a(2131500459, map, "layout/theseus_player_switch_dubbing_0", 2131500460, "layout/theseus_player_switch_dubbing_dialog_0");
            p2.b.a(2131500475, map, "layout/theseus_preview_section_merged_float_layer_0", 2131500476, "layout/theseus_preview_section_merged_title_item_0");
            p2.b.a(2131500477, map, "layout/theseus_preview_section_merged_titles_0", 2131501158, "layout/theseus_section_calendar_float_layer_0");
            p2.b.a(2131500479, map, "layout/theseus_section_float_layer_0", 2131501159, "layout/theseus_section_title_item_0");
            p2.b.a(2131500480, map, "layout/theseus_single_ep_long_and_short_title_0", 2131500481, "layout/theseus_single_ep_long_title_0");
            p2.b.a(2131500482, map, "layout/theseus_single_ep_short_title_0", 2131500483, "layout/theseus_split_feature_and_preview_0");
            p2.b.a(2131500495, map, "layout/theseus_up_after_following_fan_0", 2131500504, "layout/theseus_view_player_toast_0");
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(58);
        f91223a = sparseIntArray;
        sparseIntArray.put(2131500206, 1);
        sparseIntArray.put(2131500207, 2);
        sparseIntArray.put(2131500208, 3);
        sparseIntArray.put(2131500209, 4);
        sparseIntArray.put(2131500217, 5);
        sparseIntArray.put(2131500218, 6);
        sparseIntArray.put(2131502414, 7);
        sparseIntArray.put(2131500222, 8);
        sparseIntArray.put(2131500305, 9);
        sparseIntArray.put(2131500306, 10);
        sparseIntArray.put(2131500315, 11);
        sparseIntArray.put(2131500320, 12);
        sparseIntArray.put(2131500321, 13);
        sparseIntArray.put(2131500322, 14);
        sparseIntArray.put(2131500323, 15);
        sparseIntArray.put(2131500348, 16);
        sparseIntArray.put(2131500349, 17);
        sparseIntArray.put(2131500357, 18);
        sparseIntArray.put(2131500359, 19);
        sparseIntArray.put(2131500361, 20);
        sparseIntArray.put(2131500423, 21);
        sparseIntArray.put(2131500424, 22);
        sparseIntArray.put(2131500428, 23);
        sparseIntArray.put(2131500429, 24);
        sparseIntArray.put(2131500432, 25);
        sparseIntArray.put(2131500433, 26);
        sparseIntArray.put(2131500434, 27);
        sparseIntArray.put(2131500435, 28);
        sparseIntArray.put(2131500436, 29);
        sparseIntArray.put(2131500437, 30);
        sparseIntArray.put(2131500438, 31);
        sparseIntArray.put(2131500439, 32);
        sparseIntArray.put(2131500441, 33);
        sparseIntArray.put(2131500442, 34);
        sparseIntArray.put(2131500444, 35);
        sparseIntArray.put(2131500445, 36);
        sparseIntArray.put(2131500446, 37);
        sparseIntArray.put(2131500447, 38);
        sparseIntArray.put(2131500448, 39);
        sparseIntArray.put(2131500449, 40);
        sparseIntArray.put(2131500451, 41);
        sparseIntArray.put(2131500454, 42);
        sparseIntArray.put(2131500456, 43);
        sparseIntArray.put(2131500457, 44);
        sparseIntArray.put(2131500459, 45);
        sparseIntArray.put(2131500460, 46);
        sparseIntArray.put(2131500475, 47);
        sparseIntArray.put(2131500476, 48);
        sparseIntArray.put(2131500477, 49);
        sparseIntArray.put(2131501158, 50);
        sparseIntArray.put(2131500479, 51);
        sparseIntArray.put(2131501159, 52);
        sparseIntArray.put(2131500480, 53);
        sparseIntArray.put(2131500481, 54);
        sparseIntArray.put(2131500482, 55);
        sparseIntArray.put(2131500483, 56);
        sparseIntArray.put(2131500495, 57);
        sparseIntArray.put(2131500504, 58);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(10);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.bilibili.app.gemini.DataBinderMapperImpl());
        arrayList.add(new com.bilibili.app.gemini.base.DataBinderMapperImpl());
        arrayList.add(new com.bilibili.app.gemini.ui.DataBinderMapperImpl());
        arrayList.add(new com.bilibili.app.screen.adjust.DataBinderMapperImpl());
        arrayList.add(new com.bilibili.chatroom.DataBinderMapperImpl());
        arrayList.add(new com.bilibili.chatroomsdk.DataBinderMapperImpl());
        arrayList.add(new com.bilibili.ogv.glue.DataBinderMapperImpl());
        arrayList.add(new com.bilibili.ship.theseus.miniplayer.DataBinderMapperImpl());
        arrayList.add(new com.bilibili.ship.theseus.united.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final String convertBrIdToString(int i7) {
        return a.f91224a.get(i7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v364, types: [androidx.databinding.ViewDataBinding] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11, types: [androidx.databinding.ViewDataBinding, zu0.x, zu0.y] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19, types: [androidx.databinding.ViewDataBinding, zu0.O, zu0.P] */
    /* JADX WARN: Type inference failed for: r14v2, types: [androidx.databinding.ViewDataBinding, zu0.c, zu0.d] */
    /* JADX WARN: Type inference failed for: r14v20, types: [androidx.databinding.ViewDataBinding, zu0.Q, zu0.S] */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23, types: [androidx.databinding.ViewDataBinding, zu0.X, zu0.Y] */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25, types: [androidx.databinding.ViewDataBinding, zu0.b0, zu0.c0] */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v27 */
    /* JADX WARN: Type inference failed for: r14v28 */
    /* JADX WARN: Type inference failed for: r14v29 */
    /* JADX WARN: Type inference failed for: r14v3, types: [androidx.databinding.ViewDataBinding, zu0.e, zu0.f] */
    /* JADX WARN: Type inference failed for: r14v30, types: [androidx.databinding.ViewDataBinding, zu0.l0, zu0.m0] */
    /* JADX WARN: Type inference failed for: r14v31 */
    /* JADX WARN: Type inference failed for: r14v32 */
    /* JADX WARN: Type inference failed for: r14v33 */
    /* JADX WARN: Type inference failed for: r14v34 */
    /* JADX WARN: Type inference failed for: r14v35 */
    /* JADX WARN: Type inference failed for: r14v36 */
    /* JADX WARN: Type inference failed for: r14v37, types: [androidx.databinding.ViewDataBinding, zu0.A0, zu0.z0] */
    /* JADX WARN: Type inference failed for: r14v38 */
    /* JADX WARN: Type inference failed for: r14v39 */
    /* JADX WARN: Type inference failed for: r14v4, types: [androidx.databinding.ViewDataBinding, zu0.g, zu0.h] */
    /* JADX WARN: Type inference failed for: r14v40 */
    /* JADX WARN: Type inference failed for: r14v41 */
    /* JADX WARN: Type inference failed for: r14v42 */
    /* JADX WARN: Type inference failed for: r14v43 */
    /* JADX WARN: Type inference failed for: r14v44 */
    /* JADX WARN: Type inference failed for: r14v45 */
    /* JADX WARN: Type inference failed for: r14v46, types: [androidx.databinding.ViewDataBinding, zu0.S0, zu0.T0] */
    /* JADX WARN: Type inference failed for: r14v47 */
    /* JADX WARN: Type inference failed for: r14v48 */
    /* JADX WARN: Type inference failed for: r14v49 */
    /* JADX WARN: Type inference failed for: r14v5, types: [androidx.databinding.ViewDataBinding, zu0.j, zu0.k] */
    /* JADX WARN: Type inference failed for: r14v50 */
    /* JADX WARN: Type inference failed for: r14v51 */
    /* JADX WARN: Type inference failed for: r14v52 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v63 */
    /* JADX WARN: Type inference failed for: r14v64 */
    /* JADX WARN: Type inference failed for: r14v65 */
    /* JADX WARN: Type inference failed for: r14v66 */
    /* JADX WARN: Type inference failed for: r14v67 */
    /* JADX WARN: Type inference failed for: r14v68 */
    /* JADX WARN: Type inference failed for: r14v69 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v70 */
    /* JADX WARN: Type inference failed for: r14v71 */
    /* JADX WARN: Type inference failed for: r14v72 */
    /* JADX WARN: Type inference failed for: r14v73 */
    /* JADX WARN: Type inference failed for: r14v74 */
    /* JADX WARN: Type inference failed for: r14v75 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [androidx.databinding.ViewDataBinding, zu0.r, zu0.s] */
    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i7) {
        ?? c9219b;
        ViewDataBinding d1Var;
        int i8 = f91223a.get(i7);
        if (i8 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        int i9 = (i8 - 1) / 50;
        if (i9 != 0) {
            if (i9 != 1) {
                return null;
            }
            switch (i8) {
                case 51:
                    if (!"layout/theseus_section_float_layer_0".equals(tag)) {
                        throw new IllegalArgumentException(Fp.c.b(tag, "The tag for theseus_section_float_layer is invalid. Received: "));
                    }
                    d1Var = new d1(view, dataBindingComponent);
                    break;
                    break;
                case 52:
                    if (!"layout/theseus_section_title_item_0".equals(tag)) {
                        throw new IllegalArgumentException(Fp.c.b(tag, "The tag for theseus_section_title_item is invalid. Received: "));
                    }
                    d1Var = new f1(view, dataBindingComponent);
                    break;
                    break;
                case 53:
                    if (!"layout/theseus_single_ep_long_and_short_title_0".equals(tag)) {
                        throw new IllegalArgumentException(Fp.c.b(tag, "The tag for theseus_single_ep_long_and_short_title is invalid. Received: "));
                    }
                    d1Var = new h1(view, dataBindingComponent);
                    break;
                    break;
                case 54:
                    if (!"layout/theseus_single_ep_long_title_0".equals(tag)) {
                        throw new IllegalArgumentException(Fp.c.b(tag, "The tag for theseus_single_ep_long_title is invalid. Received: "));
                    }
                    d1Var = new j1(view, dataBindingComponent);
                    break;
                    break;
                case 55:
                    if (!"layout/theseus_single_ep_short_title_0".equals(tag)) {
                        throw new IllegalArgumentException(Fp.c.b(tag, "The tag for theseus_single_ep_short_title is invalid. Received: "));
                    }
                    d1Var = new l1(view, dataBindingComponent);
                    break;
                    break;
                case 56:
                    if (!"layout/theseus_split_feature_and_preview_0".equals(tag)) {
                        throw new IllegalArgumentException(Fp.c.b(tag, "The tag for theseus_split_feature_and_preview is invalid. Received: "));
                    }
                    d1Var = new n1(view, dataBindingComponent);
                    break;
                    break;
                case 57:
                    if (!"layout/theseus_up_after_following_fan_0".equals(tag)) {
                        throw new IllegalArgumentException(Fp.c.b(tag, "The tag for theseus_up_after_following_fan is invalid. Received: "));
                    }
                    d1Var = new p1(view, dataBindingComponent);
                    break;
                    break;
                case 58:
                    if (!"layout/theseus_view_player_toast_0".equals(tag)) {
                        throw new IllegalArgumentException(Fp.c.b(tag, "The tag for theseus_view_player_toast is invalid. Received: "));
                    }
                    d1Var = new r1(view, dataBindingComponent);
                    break;
                    break;
                default:
                    d1Var = null;
                    break;
            }
            return d1Var;
        }
        switch (i8) {
            case 1:
                if (!"layout/theseus_activity_entrance_item_0".equals(tag)) {
                    throw new IllegalArgumentException(Fp.c.b(tag, "The tag for theseus_activity_entrance_item is invalid. Received: "));
                }
                c9219b = new C9219b(view, dataBindingComponent);
                break;
                break;
            case 2:
                if (!"layout/theseus_activity_entrance_list_0".equals(tag)) {
                    throw new IllegalArgumentException(Fp.c.b(tag, "The tag for theseus_activity_entrance_list is invalid. Received: "));
                }
                ?? abstractC9221c = new AbstractC9221c(dataBindingComponent, view, (RecyclerView) ViewDataBinding.mapBindings(dataBindingComponent, view, 1, (ViewDataBinding.i) null, (SparseIntArray) null)[0]);
                abstractC9221c.f130667y = -1L;
                abstractC9221c.f130648w.setTag(null);
                abstractC9221c.setRootTag(view);
                abstractC9221c.invalidateAll();
                c9219b = abstractC9221c;
                break;
                break;
            case 3:
                if (!"layout/theseus_activity_invite_bottom_dialog_0".equals(tag)) {
                    throw new IllegalArgumentException(Fp.c.b(tag, "The tag for theseus_activity_invite_bottom_dialog is invalid. Received: "));
                }
                Object[] objArrMapBindings = ViewDataBinding.mapBindings(dataBindingComponent, view, 3, C9227f.f130684B, (SparseIntArray) null);
                ?? abstractC9225e = new AbstractC9225e(dataBindingComponent, view, (AbstractC9236j0) objArrMapBindings[1], (AbstractC9240l0) objArrMapBindings[2], (ConstraintLayout) objArrMapBindings[0]);
                abstractC9225e.f130685A = -1L;
                abstractC9225e.setContainedBinding(abstractC9225e.f130674w);
                abstractC9225e.setContainedBinding(abstractC9225e.f130675x);
                abstractC9225e.f130676y.setTag(null);
                abstractC9225e.setRootTag(view);
                abstractC9225e.invalidateAll();
                c9219b = abstractC9225e;
                break;
                break;
            case 4:
                if (!"layout/theseus_actor_info_0".equals(tag)) {
                    throw new IllegalArgumentException(Fp.c.b(tag, "The tag for theseus_actor_info is invalid. Received: "));
                }
                Object[] objArrMapBindings2 = ViewDataBinding.mapBindings(dataBindingComponent, view, 3, (ViewDataBinding.i) null, (SparseIntArray) null);
                ?? abstractC9229g = new AbstractC9229g(dataBindingComponent, view, (LoadingImageView) objArrMapBindings2[2], (ConstraintLayout) objArrMapBindings2[0], (RecyclerView) objArrMapBindings2[1]);
                abstractC9229g.f130717A = -1L;
                abstractC9229g.f130704w.setTag(null);
                abstractC9229g.f130705x.setTag(null);
                abstractC9229g.f130706y.setTag(null);
                abstractC9229g.setRootTag(view);
                abstractC9229g.invalidateAll();
                c9219b = abstractC9229g;
                break;
                break;
            case 5:
                if (!"layout/theseus_character_avatar_holder_0".equals(tag)) {
                    throw new IllegalArgumentException(Fp.c.b(tag, "The tag for theseus_character_avatar_holder is invalid. Received: "));
                }
                Object[] objArrMapBindings3 = ViewDataBinding.mapBindings(dataBindingComponent, view, 4, (ViewDataBinding.i) null, (SparseIntArray) null);
                ?? abstractC9235j = new AbstractC9235j(dataBindingComponent, view, (BiliImageView) objArrMapBindings3[3], (TextView) objArrMapBindings3[1], (TextView) objArrMapBindings3[2]);
                abstractC9235j.f130759A = -1L;
                abstractC9235j.f130737w.setTag(null);
                ((ConstraintLayout) objArrMapBindings3[0]).setTag(null);
                abstractC9235j.f130738x.setTag(null);
                abstractC9235j.f130739y.setTag(null);
                abstractC9235j.setRootTag(view);
                abstractC9235j.invalidateAll();
                c9219b = abstractC9235j;
                break;
                break;
            case 6:
                if (!"layout/theseus_character_person_info_holder_0".equals(tag)) {
                    throw new IllegalArgumentException(Fp.c.b(tag, "The tag for theseus_character_person_info_holder is invalid. Received: "));
                }
                c9219b = new C9241m(view, dataBindingComponent);
                break;
                break;
            case 7:
                if (!"layout/theseus_character_works_title_0".equals(tag)) {
                    throw new IllegalArgumentException(Fp.c.b(tag, "The tag for theseus_character_works_title is invalid. Received: "));
                }
                c9219b = new C9245o(view, dataBindingComponent);
                break;
                break;
            case 8:
                if (!"layout/theseus_chat_hall_fragment_0".equals(tag)) {
                    throw new IllegalArgumentException(Fp.c.b(tag, "The tag for theseus_chat_hall_fragment is invalid. Received: "));
                }
                c9219b = new C9249q(view, dataBindingComponent);
                break;
                break;
            case 9:
                if (!"layout/theseus_dialog_ticket_pay_select_0".equals(tag)) {
                    throw new IllegalArgumentException(Fp.c.b(tag, "The tag for theseus_dialog_ticket_pay_select is invalid. Received: "));
                }
                Object[] objArrMapBindings4 = ViewDataBinding.mapBindings(dataBindingComponent, view, 7, (ViewDataBinding.i) null, C9252s.f130873F);
                ?? rVar = new zu0.r(dataBindingComponent, view, (LinearLayout) objArrMapBindings4[3], (TextView) objArrMapBindings4[2], (View) objArrMapBindings4[5], (TextView) objArrMapBindings4[4], (MaxHeightRecyclerView) objArrMapBindings4[6], (ConstraintLayout) objArrMapBindings4[0], (TextView) objArrMapBindings4[1]);
                rVar.f130874E = -1L;
                rVar.f130858w.setTag(null);
                rVar.f130859x.setTag(null);
                rVar.f130861z.setTag(null);
                rVar.f130855B.setTag(null);
                rVar.f130856C.setTag(null);
                rVar.setRootTag(view);
                rVar.invalidateAll();
                c9219b = rVar;
                break;
                break;
            case 10:
                if (!"layout/theseus_dialog_universe_pay_v2ui_0".equals(tag)) {
                    throw new IllegalArgumentException(Fp.c.b(tag, "The tag for theseus_dialog_universe_pay_v2ui is invalid. Received: "));
                }
                c9219b = new C9256u(view, dataBindingComponent);
                break;
                break;
            case 11:
                if (!"layout/theseus_feature_and_preview_merged_0".equals(tag)) {
                    throw new IllegalArgumentException(Fp.c.b(tag, "The tag for theseus_feature_and_preview_merged is invalid. Received: "));
                }
                ?? abstractC9262x = new AbstractC9262x(dataBindingComponent, view, (RecyclerView) ViewDataBinding.mapBindings(dataBindingComponent, view, 1, (ViewDataBinding.i) null, (SparseIntArray) null)[0]);
                abstractC9262x.f130913y = new C9264y.a(abstractC9262x);
                abstractC9262x.f130914z = -1L;
                abstractC9262x.f130909w.setTag(null);
                abstractC9262x.setRootTag(view);
                abstractC9262x.invalidateAll();
                c9219b = abstractC9262x;
                break;
                break;
            case 12:
                if (!"layout/theseus_float_layer_ep_cover_0".equals(tag)) {
                    throw new IllegalArgumentException(Fp.c.b(tag, "The tag for theseus_float_layer_ep_cover is invalid. Received: "));
                }
                c9219b = new C9216A(view, dataBindingComponent);
                break;
                break;
            case 13:
                if (!"layout/theseus_float_layer_ep_long_title_0".equals(tag)) {
                    throw new IllegalArgumentException(Fp.c.b(tag, "The tag for theseus_float_layer_ep_long_title is invalid. Received: "));
                }
                c9219b = new zu0.C(view, dataBindingComponent);
                break;
                break;
            case 14:
                if (!"layout/theseus_float_layer_ep_short_and_long_title_0".equals(tag)) {
                    throw new IllegalArgumentException(Fp.c.b(tag, "The tag for theseus_float_layer_ep_short_and_long_title is invalid. Received: "));
                }
                c9219b = new zu0.E(view, dataBindingComponent);
                break;
                break;
            case 15:
                if (!"layout/theseus_float_layer_ep_short_title_0".equals(tag)) {
                    throw new IllegalArgumentException(Fp.c.b(tag, "The tag for theseus_float_layer_ep_short_title is invalid. Received: "));
                }
                c9219b = new zu0.G(view, dataBindingComponent);
                break;
                break;
            case 16:
                if (!"layout/theseus_intro_detail_float_layer_0".equals(tag)) {
                    throw new IllegalArgumentException(Fp.c.b(tag, "The tag for theseus_intro_detail_float_layer is invalid. Received: "));
                }
                c9219b = new zu0.I(view, dataBindingComponent);
                break;
                break;
            case 17:
                if (!"layout/theseus_intro_detail_headline_0".equals(tag)) {
                    throw new IllegalArgumentException(Fp.c.b(tag, "The tag for theseus_intro_detail_headline is invalid. Received: "));
                }
                c9219b = new zu0.K(view, dataBindingComponent);
                break;
                break;
            case 18:
                if (!"layout/theseus_item_info_actors_0".equals(tag)) {
                    throw new IllegalArgumentException(Fp.c.b(tag, "The tag for theseus_item_info_actors is invalid. Received: "));
                }
                c9219b = new N(view, dataBindingComponent);
                break;
                break;
            case 19:
                if (!"layout/theseus_item_ticket_pay_select_0".equals(tag)) {
                    throw new IllegalArgumentException(Fp.c.b(tag, "The tag for theseus_item_ticket_pay_select is invalid. Received: "));
                }
                Object[] objArrMapBindings5 = ViewDataBinding.mapBindings(dataBindingComponent, view, 9, (ViewDataBinding.i) null, P.f130544D);
                ?? o7 = new O(dataBindingComponent, view, (ImageView) objArrMapBindings5[5], (TextView) objArrMapBindings5[4], (TextView) objArrMapBindings5[3], (TextView) objArrMapBindings5[2], (TextView) objArrMapBindings5[1]);
                o7.f130545C = -1L;
                o7.f130538w.setTag(null);
                ((ConstraintLayout) objArrMapBindings5[0]).setTag(null);
                o7.f130539x.setTag(null);
                o7.f130540y.setTag(null);
                o7.f130541z.setTag(null);
                o7.f130536A.setTag(null);
                o7.setRootTag(view);
                o7.invalidateAll();
                c9219b = o7;
                break;
                break;
            case 20:
                if (!"layout/theseus_load_more_0".equals(tag)) {
                    throw new IllegalArgumentException(Fp.c.b(tag, "The tag for theseus_load_more is invalid. Received: "));
                }
                Object[] objArrMapBindings6 = ViewDataBinding.mapBindings(dataBindingComponent, view, 3, (ViewDataBinding.i) null, (SparseIntArray) null);
                ?? q7 = new Q(dataBindingComponent, view, (ProgressBar) objArrMapBindings6[1], (RelativeLayout) objArrMapBindings6[0], (TextView) objArrMapBindings6[2]);
                q7.f130561A = -1L;
                q7.f130549w.setTag(null);
                q7.f130550x.setTag(null);
                q7.f130551y.setTag(null);
                q7.setRootTag(view);
                q7.invalidateAll();
                c9219b = q7;
                break;
                break;
            case 21:
                if (!"layout/theseus_ogv_actors_0".equals(tag)) {
                    throw new IllegalArgumentException(Fp.c.b(tag, "The tag for theseus_ogv_actors is invalid. Received: "));
                }
                c9219b = new U(view, dataBindingComponent);
                break;
                break;
            case 22:
                if (!"layout/theseus_ogv_chathall_alert_dialog_0".equals(tag)) {
                    throw new IllegalArgumentException(Fp.c.b(tag, "The tag for theseus_ogv_chathall_alert_dialog is invalid. Received: "));
                }
                c9219b = new W(view, dataBindingComponent);
                break;
                break;
            case 23:
                if (!"layout/theseus_ogv_episode_list_0".equals(tag)) {
                    throw new IllegalArgumentException(Fp.c.b(tag, "The tag for theseus_ogv_episode_list is invalid. Received: "));
                }
                ?? x6 = new X(dataBindingComponent, view, (RecyclerView) ViewDataBinding.mapBindings(dataBindingComponent, view, 1, (ViewDataBinding.i) null, (SparseIntArray) null)[0]);
                x6.f130607y = -1L;
                x6.f130602w.setTag(null);
                x6.setRootTag(view);
                x6.invalidateAll();
                c9219b = x6;
                break;
                break;
            case 24:
                if (!"layout/theseus_ogv_fragment_intro_info_0".equals(tag)) {
                    throw new IllegalArgumentException(Fp.c.b(tag, "The tag for theseus_ogv_fragment_intro_info is invalid. Received: "));
                }
                c9219b = new C9218a0(view, dataBindingComponent);
                break;
                break;
            case 25:
                if (!"layout/theseus_ogv_info_style_0".equals(tag)) {
                    throw new IllegalArgumentException(Fp.c.b(tag, "The tag for theseus_ogv_info_style is invalid. Received: "));
                }
                Object[] objArrMapBindings7 = ViewDataBinding.mapBindings(dataBindingComponent, view, 3, (ViewDataBinding.i) null, C9222c0.f130650A);
                RelativeLayout relativeLayout = (RelativeLayout) objArrMapBindings7[0];
                TagFlowLayout tagFlowLayout = (TagFlowLayout) objArrMapBindings7[1];
                ?? abstractC9220b0 = new AbstractC9220b0(dataBindingComponent, view, relativeLayout, tagFlowLayout);
                abstractC9220b0.f130651z = -1L;
                abstractC9220b0.f130642w.setTag(null);
                abstractC9220b0.f130643x.setTag(null);
                abstractC9220b0.setRootTag(view);
                abstractC9220b0.invalidateAll();
                c9219b = abstractC9220b0;
                break;
                break;
            case 26:
                if (!"layout/theseus_ogv_intro_info_0".equals(tag)) {
                    throw new IllegalArgumentException(Fp.c.b(tag, "The tag for theseus_ogv_intro_info is invalid. Received: "));
                }
                c9219b = new C9226e0(view, dataBindingComponent);
                break;
                break;
            case 27:
                if (!"layout/theseus_ogv_intro_info_headline_0".equals(tag)) {
                    throw new IllegalArgumentException(Fp.c.b(tag, "The tag for theseus_ogv_intro_info_headline is invalid. Received: "));
                }
                c9219b = new C9230g0(view, dataBindingComponent);
                break;
                break;
            case 28:
                if (!"layout/theseus_ogv_intro_info_name_0".equals(tag)) {
                    throw new IllegalArgumentException(Fp.c.b(tag, "The tag for theseus_ogv_intro_info_name is invalid. Received: "));
                }
                c9219b = new C9234i0(view, dataBindingComponent);
                break;
                break;
            case 29:
                if (!"layout/theseus_ogv_invitation_bottom_dialog_background_0".equals(tag)) {
                    throw new IllegalArgumentException(Fp.c.b(tag, "The tag for theseus_ogv_invitation_bottom_dialog_background is invalid. Received: "));
                }
                c9219b = new C9238k0(view, dataBindingComponent);
                break;
                break;
            case 30:
                if (!"layout/theseus_ogv_invitation_bottom_dialog_foreground_0".equals(tag)) {
                    throw new IllegalArgumentException(Fp.c.b(tag, "The tag for theseus_ogv_invitation_bottom_dialog_foreground is invalid. Received: "));
                }
                Object[] objArrMapBindings8 = ViewDataBinding.mapBindings(dataBindingComponent, view, 5, (ViewDataBinding.i) null, C9242m0.f130784C);
                ?? abstractC9240l0 = new AbstractC9240l0(dataBindingComponent, view, (ImageView) objArrMapBindings8[4], (BiliImageView) objArrMapBindings8[1], (TextView) objArrMapBindings8[3], (TextView) objArrMapBindings8[2]);
                abstractC9240l0.f130785B = -1L;
                abstractC9240l0.f130775x.setTag(null);
                ((ConstraintLayout) objArrMapBindings8[0]).setTag(null);
                abstractC9240l0.f130776y.setTag(null);
                abstractC9240l0.f130777z.setTag(null);
                abstractC9240l0.setRootTag(view);
                abstractC9240l0.invalidateAll();
                c9219b = abstractC9240l0;
                break;
                break;
            case 31:
                if (!"layout/theseus_ogv_item_info_style_tag_0".equals(tag)) {
                    throw new IllegalArgumentException(Fp.c.b(tag, "The tag for theseus_ogv_item_info_style_tag is invalid. Received: "));
                }
                c9219b = new C9246o0(view, dataBindingComponent);
                break;
                break;
            case 32:
                if (!"layout/theseus_ogv_item_role_works_0".equals(tag)) {
                    throw new IllegalArgumentException(Fp.c.b(tag, "The tag for theseus_ogv_item_role_works is invalid. Received: "));
                }
                c9219b = new C9250q0(view, dataBindingComponent);
                break;
                break;
            case 33:
                if (!"layout/theseus_ogv_live_reserve_bar_0".equals(tag)) {
                    throw new IllegalArgumentException(Fp.c.b(tag, "The tag for theseus_ogv_live_reserve_bar is invalid. Received: "));
                }
                c9219b = new C9253s0(view, dataBindingComponent);
                break;
                break;
            case 34:
                if (!"layout/theseus_ogv_page_tab_item_view_0".equals(tag)) {
                    throw new IllegalArgumentException(Fp.c.b(tag, "The tag for theseus_ogv_page_tab_item_view is invalid. Received: "));
                }
                c9219b = new C9257u0(view, dataBindingComponent);
                break;
                break;
            case 35:
                if (!"layout/theseus_ogv_roles_info_0".equals(tag)) {
                    throw new IllegalArgumentException(Fp.c.b(tag, "The tag for theseus_ogv_roles_info is invalid. Received: "));
                }
                c9219b = new C9261w0(view, dataBindingComponent);
                break;
                break;
            case 36:
                if (!"layout/theseus_ogv_season_item_0".equals(tag)) {
                    throw new IllegalArgumentException(Fp.c.b(tag, "The tag for theseus_ogv_season_item is invalid. Received: "));
                }
                c9219b = new C9265y0(view, dataBindingComponent);
                break;
                break;
            case 37:
                if (!"layout/theseus_ogv_season_list_0".equals(tag)) {
                    throw new IllegalArgumentException(Fp.c.b(tag, "The tag for theseus_ogv_season_list is invalid. Received: "));
                }
                ?? abstractC9267z0 = new AbstractC9267z0(dataBindingComponent, view, (RecyclerView) ViewDataBinding.mapBindings(dataBindingComponent, view, 1, (ViewDataBinding.i) null, (SparseIntArray) null)[0]);
                abstractC9267z0.f130377y = new A0.a(abstractC9267z0);
                abstractC9267z0.f130378z = -1L;
                abstractC9267z0.f130932w.setTag(null);
                abstractC9267z0.setRootTag(view);
                abstractC9267z0.invalidateAll();
                c9219b = abstractC9267z0;
                break;
                break;
            case 38:
                if (!"layout/theseus_ogv_section_title_0".equals(tag)) {
                    throw new IllegalArgumentException(Fp.c.b(tag, "The tag for theseus_ogv_section_title is invalid. Received: "));
                }
                c9219b = new C0(view, dataBindingComponent);
                break;
                break;
            case 39:
                if (!"layout/theseus_ogv_single_ep_cover_0".equals(tag)) {
                    throw new IllegalArgumentException(Fp.c.b(tag, "The tag for theseus_ogv_single_ep_cover is invalid. Received: "));
                }
                c9219b = new E0(view, dataBindingComponent);
                break;
                break;
            case 40:
                if (!"layout/theseus_ogv_sponsor_0".equals(tag)) {
                    throw new IllegalArgumentException(Fp.c.b(tag, "The tag for theseus_ogv_sponsor is invalid. Received: "));
                }
                c9219b = new G0(view, dataBindingComponent);
                break;
                break;
            case 41:
                if (!"layout/theseus_ogv_video_card_widget_0".equals(tag)) {
                    throw new IllegalArgumentException(Fp.c.b(tag, "The tag for theseus_ogv_video_card_widget is invalid. Received: "));
                }
                c9219b = new I0(view, dataBindingComponent);
                break;
                break;
            case 42:
                if (!"layout/theseus_payment_0".equals(tag)) {
                    throw new IllegalArgumentException(Fp.c.b(tag, "The tag for theseus_payment is invalid. Received: "));
                }
                c9219b = new K0(view, dataBindingComponent);
                break;
                break;
            case 43:
                if (!"layout/theseus_player_dubbing_role_audio_item_0".equals(tag)) {
                    throw new IllegalArgumentException(Fp.c.b(tag, "The tag for theseus_player_dubbing_role_audio_item is invalid. Received: "));
                }
                c9219b = new M0(view, dataBindingComponent);
                break;
                break;
            case 44:
                if (!"layout/theseus_player_dubbing_role_item_0".equals(tag)) {
                    throw new IllegalArgumentException(Fp.c.b(tag, "The tag for theseus_player_dubbing_role_item is invalid. Received: "));
                }
                c9219b = new O0(view, dataBindingComponent);
                break;
                break;
            case 45:
                if (!"layout/theseus_player_switch_dubbing_0".equals(tag)) {
                    throw new IllegalArgumentException(Fp.c.b(tag, "The tag for theseus_player_switch_dubbing is invalid. Received: "));
                }
                c9219b = new R0(view, dataBindingComponent);
                break;
                break;
            case 46:
                if (!"layout/theseus_player_switch_dubbing_dialog_0".equals(tag)) {
                    throw new IllegalArgumentException(Fp.c.b(tag, "The tag for theseus_player_switch_dubbing_dialog is invalid. Received: "));
                }
                Object[] objArrMapBindings9 = ViewDataBinding.mapBindings(dataBindingComponent, view, 4, T0.f130570C, T0.f130571D);
                ?? s02 = new S0(dataBindingComponent, view, (View) objArrMapBindings9[2], (Q0) objArrMapBindings9[1], (ConstraintLayout) objArrMapBindings9[0], (TextView) objArrMapBindings9[3]);
                s02.f130572B = -1L;
                s02.setContainedBinding(s02.f130564x);
                s02.f130565y.setTag(null);
                s02.setRootTag(view);
                s02.invalidateAll();
                c9219b = s02;
                break;
                break;
            case 47:
                if (!"layout/theseus_preview_section_merged_float_layer_0".equals(tag)) {
                    throw new IllegalArgumentException(Fp.c.b(tag, "The tag for theseus_preview_section_merged_float_layer is invalid. Received: "));
                }
                c9219b = new V0(view, dataBindingComponent);
                break;
                break;
            case 48:
                if (!"layout/theseus_preview_section_merged_title_item_0".equals(tag)) {
                    throw new IllegalArgumentException(Fp.c.b(tag, "The tag for theseus_preview_section_merged_title_item is invalid. Received: "));
                }
                c9219b = new X0(view, dataBindingComponent);
                break;
                break;
            case 49:
                if (!"layout/theseus_preview_section_merged_titles_0".equals(tag)) {
                    throw new IllegalArgumentException(Fp.c.b(tag, "The tag for theseus_preview_section_merged_titles is invalid. Received: "));
                }
                c9219b = new Z0(view, dataBindingComponent);
                break;
                break;
            case 50:
                if (!"layout/theseus_section_calendar_float_layer_0".equals(tag)) {
                    throw new IllegalArgumentException(Fp.c.b(tag, "The tag for theseus_section_calendar_float_layer is invalid. Received: "));
                }
                c9219b = new b1(view, dataBindingComponent);
                break;
                break;
            default:
                c9219b = 0;
                break;
        }
        return c9219b;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i7) {
        if (viewArr == null || viewArr.length == 0 || f91223a.get(i7) <= 0 || viewArr[0].getTag() != null) {
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
        Integer num = b.f91225a.get(str);
        if (num != null) {
            iIntValue = num.intValue();
        }
        return iIntValue;
    }
}
