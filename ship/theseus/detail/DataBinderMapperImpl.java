package com.bilibili.ship.theseus.detail;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.compose.runtime.ComposerKt;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.alipay.alipaysecuritysdk.common.exception.ErrorCode;
import com.alipay.blueshield.IDeviceColorModule;
import com.alipay.blueshield.TrustedErrorCode;
import com.bilibili.live.streaming.source.TextSource;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.search2.api.SearchBangumiItem;
import com.bilibili.studio.videoeditor.CaptionFx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/DataBinderMapperImpl.class */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f90849a = new SparseIntArray(0);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/DataBinderMapperImpl$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseArray<String> f90850a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(389);
            f90850a = sparseArray;
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
            sparseArray.put(45, "blurCoverUrl");
            sparseArray.put(46, "bottomDisplay1");
            sparseArray.put(47, "bottomDisplay2");
            sparseArray.put(48, "bottomDisplay3");
            sparseArray.put(49, "bottomDisplay4");
            sparseArray.put(50, "btnBgColor");
            sparseArray.put(51, "btnTextColor");
            sparseArray.put(52, "btnTryAgainText");
            sparseArray.put(53, "button");
            sparseArray.put(54, "buttonBackground");
            sparseArray.put(55, "buttonText");
            sparseArray.put(56, "buttonTextColor");
            sparseArray.put(57, "buttonVisible");
            sparseArray.put(58, "calenderVisible");
            sparseArray.put(59, "chatHint");
            sparseArray.put(60, "chatPlayerInputHint");
            sparseArray.put(61, "clickListener");
            sparseArray.put(62, "clickable");
            sparseArray.put(63, "collapsedTextAlpha");
            sparseArray.put(64, "constellationAndAge");
            sparseArray.put(65, "constraintSetModifier");
            sparseArray.put(66, "containerExposureEntry");
            sparseArray.put(67, "containerHeight");
            sparseArray.put(68, "containerVisible");
            sparseArray.put(69, TextSource.CFG_CONTENT);
            sparseArray.put(70, "contentAlpha");
            sparseArray.put(71, "contentColor");
            sparseArray.put(72, "cornerBackDrawable");
            sparseArray.put(73, "cornerText");
            sparseArray.put(74, "cornerVisible");
            sparseArray.put(75, "countdownRemaining");
            sparseArray.put(76, "countdownTip");
            sparseArray.put(77, "countdownTotal");
            sparseArray.put(78, "countdownTrackEnabled");
            sparseArray.put(79, "cover");
            sparseArray.put(80, "coverHeight");
            sparseArray.put(81, "coverUrl");
            sparseArray.put(82, "coverWidth");
            sparseArray.put(83, "currentEpisodeListIsReversed");
            sparseArray.put(84, "currentItem");
            sparseArray.put(85, "currentRoleAudioDesc");
            sparseArray.put(86, "currentTabItemType");
            sparseArray.put(87, "danmakuNumIcon");
            sparseArray.put(88, "danmakuTvText");
            sparseArray.put(89, "dataList");
            sparseArray.put(90, "deliveryBtnImage");
            sparseArray.put(91, "deliveryBtnTitle");
            sparseArray.put(92, "deliveryBtnVisible");
            sparseArray.put(93, "desc");
            sparseArray.put(94, "descName");
            sparseArray.put(95, "descTipText");
            sparseArray.put(96, "disable");
            sparseArray.put(97, "disableTagTextColor");
            sparseArray.put(98, "downloadable");
            sparseArray.put(99, "drawerOpen");
            sparseArray.put(100, "emotionBadgeVisible");
            sparseArray.put(101, "emptyType");
            sparseArray.put(102, "endContent");
            sparseArray.put(103, "endIcon");
            sparseArray.put(104, "endIconVisible");
            sparseArray.put(105, "episodeDurationText");
            sparseArray.put(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_HAND_DET_SCORE_THRESHOLD, "episodeDurationTextVisible");
            sparseArray.put(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_HAND_TRACK_SCORE_THRESHOLD, "episodeListVm");
            sparseArray.put(108, "episodesScrollerContentDescription");
            sparseArray.put(109, "errorImageAlpha");
            sparseArray.put(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_HAND_SKELETON_THRESHOLD, "errorText");
            sparseArray.put(CaptionFx.BUBBLEPATH_FIELD_NUMBER, "errorTip");
            sparseArray.put(112, "errorVisible");
            sparseArray.put(113, "expandableIsExpand");
            sparseArray.put(114, "expandableText");
            sparseArray.put(115, "exposureLayoutInfoReceiver");
            sparseArray.put(116, "firstButton");
            sparseArray.put(117, "firstButtonText");
            sparseArray.put(118, "followBackDrawable");
            sparseArray.put(119, "followButtonConfig");
            sparseArray.put(120, "followClickable");
            sparseArray.put(121, "followDesc");
            sparseArray.put(122, "followDescColor");
            sparseArray.put(SearchBangumiItem.TYPE_FULLNET_TV, "followIconDrawable");
            sparseArray.put(SearchBangumiItem.TYPE_FULLNET_VARIETY, "followIconVisible");
            sparseArray.put(SearchBangumiItem.TYPE_FULLNET_DOCUMENTARY, "followLottieAnimationVisible");
            sparseArray.put(SearchBangumiItem.TYPE_FULLNET_MOVIE, "followLottieAssetFileName");
            sparseArray.put(SearchBangumiItem.TYPE_FULLNET_BANGUMI, "followVisible");
            sparseArray.put(128, "followed");
            sparseArray.put(129, "foregroundDescriptionText");
            sparseArray.put(130, "foregroundDescriptionTextColor");
            sparseArray.put(131, "foregroundHeaderImageUrl");
            sparseArray.put(132, "foregroundTitleText");
            sparseArray.put(133, "foregroundTitleTextColor");
            sparseArray.put(134, "foregroundViewAlpha");
            sparseArray.put(135, "foregroundViewVisible");
            sparseArray.put(136, "guideBarHeight");
            sparseArray.put(137, "guideBarPaddingBottom");
            sparseArray.put(138, "guideBarPaddingTop");
            sparseArray.put(139, "guideHint");
            sparseArray.put(140, "half");
            sparseArray.put(141, "hallCover");
            sparseArray.put(142, "hallEnterHotText");
            sparseArray.put(143, "hallSubtitle");
            sparseArray.put(144, "hallTitle");
            sparseArray.put(145, "handler");
            sparseArray.put(146, "hasAddView");
            sparseArray.put(147, "hasAnnouncement");
            sparseArray.put(148, "hasNext");
            sparseArray.put(149, "hasPendant");
            sparseArray.put(150, "hasPinMsg");
            sparseArray.put(151, "hasRating");
            sparseArray.put(152, "hasTitle");
            sparseArray.put(153, "height");
            sparseArray.put(154, "highPrivilegedUser");
            sparseArray.put(155, "horizontalMargin");
            sparseArray.put(156, "horizontalPadding");
            sparseArray.put(157, "icon");
            sparseArray.put(158, "iconTintColor");
            sparseArray.put(159, "iconUrl");
            sparseArray.put(160, "iconVisible");
            sparseArray.put(161, "image");
            sparseArray.put(162, "imageAlpha");
            sparseArray.put(163, "imageBadge");
            sparseArray.put(164, "imageBadgeVisible");
            sparseArray.put(165, "imageDrawableId");
            sparseArray.put(166, "imageHeight");
            sparseArray.put(167, "imageTranslationY");
            sparseArray.put(168, "imageUrl");
            sparseArray.put(169, "imageWidth");
            sparseArray.put(170, "immersiveCloseBtnTintColor");
            sparseArray.put(171, "info");
            sparseArray.put(172, "infoArea");
            sparseArray.put(173, "infoType");
            sparseArray.put(174, "inputBarEnable");
            sparseArray.put(175, "inputText");
            sparseArray.put(176, "isBackVisible");
            sparseArray.put(177, "isCloseVisible");
            sparseArray.put(178, "isFullscreen");
            sparseArray.put(179, "itemDecoration");
            sparseArray.put(180, "ivRightVisible");
            sparseArray.put(181, "label");
            sparseArray.put(182, "labelVisible");
            sparseArray.put(183, "landscape");
            sparseArray.put(184, "leftBadgeBackDrawable");
            sparseArray.put(185, "leftBadgeText");
            sparseArray.put(186, "leftBadgeTextColor");
            sparseArray.put(187, "leftBadgeVisible");
            sparseArray.put(188, "leftBtnBackDrawable");
            sparseArray.put(189, "leftBtnIconUrl");
            sparseArray.put(190, "leftBtnVisible");
            sparseArray.put(191, "leftMargin");
            sparseArray.put(192, "leftText");
            sparseArray.put(193, "leftTextColor");
            sparseArray.put(194, "levelDrawableId");
            sparseArray.put(195, "limitText");
            sparseArray.put(196, "limitTextColor");
            sparseArray.put(197, "lineTextColor");
            sparseArray.put(198, "liveReserveBarHeight");
            sparseArray.put(TrustedErrorCode.MANAGER_ERROR_UNKONWN_CODE, "liveReserveBarVisible");
            sparseArray.put(200, "loadState");
            sparseArray.put(201, "loadingState");
            sparseArray.put(202, "marginTop");
            sparseArray.put(203, "master");
            sparseArray.put(ComposerKt.providerMapsKey, "miniPlayerDoubleTapHintVisible");
            sparseArray.put(205, IDeviceColorModule.EDGE_MODE_KEY);
            sparseArray.put(ComposerKt.referenceKey, "moreEpisodesContentDescription");
            sparseArray.put(ComposerKt.reuseKey, "moreText");
            sparseArray.put(208, "moreTextVisible");
            sparseArray.put(209, "msgContent");
            sparseArray.put(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_BODY_STATURE, "myCard");
            sparseArray.put(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_CAM_FOVX, "name");
            sparseArray.put(212, "needShowEndContainer");
            sparseArray.put(213, "negativeBtnText");
            sparseArray.put(214, "negativeBtnVisible");
            sparseArray.put(215, "newBadgeVisible");
            sparseArray.put(216, "newMsgText");
            sparseArray.put(217, "newPlayerMsgText");
            sparseArray.put(218, "nextSheetVisible");
            sparseArray.put(219, "nickTextColor");
            sparseArray.put(220, "nickTvColor");
            sparseArray.put(221, "nickname");
            sparseArray.put(222, "notice");
            sparseArray.put(223, "noticeTextColor");
            sparseArray.put(224, "officialBadgeDrawable");
            sparseArray.put(225, "officialImageDrawable");
            sparseArray.put(226, "onClick");
            sparseArray.put(227, "onDismissRequest");
            sparseArray.put(228, "onErrorCoverClickListener");
            sparseArray.put(229, "onLimitCoverClickListener");
            sparseArray.put(230, "onNegativeClick");
            sparseArray.put(231, "onPositiveClick");
            sparseArray.put(232, "orderText");
            sparseArray.put(233, "orderVisible");
            sparseArray.put(234, "ownerState");
            sparseArray.put(235, "paddingEnd");
            sparseArray.put(236, "paddingStart");
            sparseArray.put(237, "params");
            sparseArray.put(238, "payTipVo");
            sparseArray.put(239, "pendentShowUrl");
            sparseArray.put(240, "pendentVisible");
            sparseArray.put(241, "personAvatar");
            sparseArray.put(242, "personName");
            sparseArray.put(243, "playedNumIcon");
            sparseArray.put(244, "playedNumText");
            sparseArray.put(245, "playerContainer");
            sparseArray.put(246, "playerNickTextColor");
            sparseArray.put(247, "playingLottieFileName");
            sparseArray.put(248, "positiveBtnText");
            sparseArray.put(249, "positiveBtnVisible");
            sparseArray.put(250, "preSaleCountdownClickable");
            sparseArray.put(251, "preSaleCountdownDrawable");
            sparseArray.put(252, "preSaleCountdownVisible");
            sparseArray.put(253, "quickMsgsVisible");
            sparseArray.put(254, "rankNoneLayoutVisible");
            sparseArray.put(255, "ratingIsValid");
            sparseArray.put(256, "ratingPeopleText");
            sparseArray.put(257, "ratingText");
            sparseArray.put(258, "releaseDateShow");
            sparseArray.put(259, "reorderVisible");
            sparseArray.put(260, "reportVo");
            sparseArray.put(261, "retryBtnBgColor");
            sparseArray.put(262, "retryBtnJumpLink");
            sparseArray.put(263, "retryBtnText");
            sparseArray.put(264, "retryBtnTextColor");
            sparseArray.put(265, "retryBtnVisible");
            sparseArray.put(266, "retryText");
            sparseArray.put(267, "reversed");
            sparseArray.put(268, "reviewRatingNum");
            sparseArray.put(269, "rightBadgeBackDrawable");
            sparseArray.put(270, "rightBadgeText");
            sparseArray.put(271, "rightBadgeTextColor");
            sparseArray.put(272, "rightBadgeVisible");
            sparseArray.put(273, "rightBottomBadgeMaskDrawable");
            sparseArray.put(274, "rightBottomBadgeUrl");
            sparseArray.put(275, "rightBtnBackDrawable");
            sparseArray.put(276, "rightBtnIconUrl");
            sparseArray.put(277, "rightBtnVisible");
            sparseArray.put(278, "rightText");
            sparseArray.put(279, "rightTextColor");
            sparseArray.put(280, "roleAvatar");
            sparseArray.put(281, "roleList");
            sparseArray.put(282, "roleListHeight");
            sparseArray.put(283, "roleName");
            sparseArray.put(284, "roleTitle");
            sparseArray.put(285, "roleType");
            sparseArray.put(286, "roomMode");
            sparseArray.put(287, "rootAlpha");
            sparseArray.put(288, "rootPaddingEnd");
            sparseArray.put(289, "rootPaddingStart");
            sparseArray.put(290, "ruleTip");
            sparseArray.put(291, "scrollListener");
            sparseArray.put(292, "scrollPosWithOffset");
            sparseArray.put(293, "scrollPositions");
            sparseArray.put(294, "seasonListVisible");
            sparseArray.put(295, "secondButton");
            sparseArray.put(296, "secondButtonText");
            sparseArray.put(297, "select");
            sparseArray.put(298, "selectButton");
            sparseArray.put(299, "selectDataList");
            sparseArray.put(300, "selectTagBackground");
            sparseArray.put(301, "selectTagTextColor");
            sparseArray.put(302, "selectTitle");
            sparseArray.put(303, "selected");
            sparseArray.put(304, "selectedImage");
            sparseArray.put(305, "sexDrawableId");
            sparseArray.put(306, "shieldState");
            sparseArray.put(ErrorCode.E_OPERATIONTYPE_EMPTY, "showSelected");
            sparseArray.put(ErrorCode.E_SIGN_ERROR, "showingControl");
            sparseArray.put(ErrorCode.E_T0_HANDLE_INVALID, "showingErrorCover");
            sparseArray.put(ErrorCode.E_VOS_UPDATE_TRUSTTIME, "showingLimitCover");
            sparseArray.put(ErrorCode.E_BUSY, "singleEntrance");
            sparseArray.put(ErrorCode.E_CRASHED_BEFORE, "singleImageUrl");
            sparseArray.put(ErrorCode.E_TA_DEGRADE, "singleImageVisible");
            sparseArray.put(314, "singleImgHeight");
            sparseArray.put(315, "singleVipDesc");
            sparseArray.put(316, "singleVipDescVisible");
            sparseArray.put(317, "softKeyBoardOpen");
            sparseArray.put(318, "spannableTitle");
            sparseArray.put(319, "sponsorDefaultVisible");
            sparseArray.put(320, "sponsorHeadDiverVisible");
            sparseArray.put(321, "sponsorHeadVisible");
            sparseArray.put(322, "sponsorNumText");
            sparseArray.put(323, "sponsorRankText");
            sparseArray.put(324, "sponsorTipText");
            sparseArray.put(325, "sponsorTipVisible");
            sparseArray.put(326, "styleDataList");
            sparseArray.put(327, "subContent");
            sparseArray.put(328, "subContentColor");
            sparseArray.put(329, "subText");
            sparseArray.put(330, "subtitle");
            sparseArray.put(331, "subtitleColor");
            sparseArray.put(332, "subtitleLeftIconUrl");
            sparseArray.put(333, "subtitleText");
            sparseArray.put(334, "subtitleVisible");
            sparseArray.put(335, "subtitleVo");
            sparseArray.put(336, "tagBackgroundDrawable");
            sparseArray.put(337, "tagLineData");
            sparseArray.put(338, "tagText");
            sparseArray.put(339, "tagTitle");
            sparseArray.put(340, "tagTitleColor");
            sparseArray.put(341, "textColor");
            sparseArray.put(342, "textRating");
            sparseArray.put(343, "time");
            sparseArray.put(344, "timeLengthShow");
            sparseArray.put(345, "timeVisible");
            sparseArray.put(346, "title");
            sparseArray.put(347, "titleBold");
            sparseArray.put(348, "titleCenter");
            sparseArray.put(349, "titleColor");
            sparseArray.put(350, "titleMarginRight");
            sparseArray.put(351, "titleText");
            sparseArray.put(352, "titleTextSize");
            sparseArray.put(353, "titleVisible");
            sparseArray.put(354, "titleVo");
            sparseArray.put(355, "titlesVm");
            sparseArray.put(356, "topContainerShow");
            sparseArray.put(357, "topMargin");
            sparseArray.put(358, "tvLeftTextColor");
            sparseArray.put(359, "tvRightColorFilter");
            sparseArray.put(360, "tvRightText");
            sparseArray.put(361, "tvRightTextColor");
            sparseArray.put(362, "unselectedImage");
            sparseArray.put(363, "unselectedTagBackground");
            sparseArray.put(364, "unselectedTagTextColor");
            sparseArray.put(365, "updateAttention");
            sparseArray.put(366, "updateGuestAttention");
            sparseArray.put(367, "upperAvatar");
            sparseArray.put(368, "upperName");
            sparseArray.put(369, "upperNameTextColor");
            sparseArray.put(370, "upperVisible");
            sparseArray.put(371, "useImmersiveCloseBtn");
            sparseArray.put(372, "userList");
            sparseArray.put(373, "value");
            sparseArray.put(374, "videoHeight");
            sparseArray.put(375, "viewModel");
            sparseArray.put(376, "viewModelInner");
            sparseArray.put(377, "vipBadgeVisible");
            sparseArray.put(378, "vipBarVisible");
            sparseArray.put(379, "vipBarVo");
            sparseArray.put(380, "vipDesc");
            sparseArray.put(381, "vipDescVisible");
            sparseArray.put(382, "vipIconUrl");
            sparseArray.put(383, "vipIconVisible");
            sparseArray.put(384, "visible");
            sparseArray.put(385, "vm");
            sparseArray.put(386, "vvmAdapter");
            sparseArray.put(387, "vvmAdapterInner");
            sparseArray.put(388, "width");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/DataBinderMapperImpl$b.class */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap<String, Integer> f90851a = new HashMap<>(0);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(10);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.bilibili.app.comment2.DataBinderMapperImpl());
        arrayList.add(new com.bilibili.app.gemini.DataBinderMapperImpl());
        arrayList.add(new com.bilibili.app.gemini.base.DataBinderMapperImpl());
        arrayList.add(new com.bilibili.app.gemini.ui.DataBinderMapperImpl());
        arrayList.add(new com.bilibili.app.screen.adjust.DataBinderMapperImpl());
        arrayList.add(new com.bilibili.ship.theseus.cheese.DataBinderMapperImpl());
        arrayList.add(new com.bilibili.ship.theseus.ogv.DataBinderMapperImpl());
        arrayList.add(new com.bilibili.ship.theseus.ugc.DataBinderMapperImpl());
        arrayList.add(new com.bilibili.ship.theseus.united.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final String convertBrIdToString(int i7) {
        return a.f90850a.get(i7);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i7) {
        if (f90849a.get(i7) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i7) {
        if (viewArr == null || viewArr.length == 0 || f90849a.get(i7) <= 0 || viewArr[0].getTag() != null) {
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
        Integer num = b.f90851a.get(str);
        if (num != null) {
            iIntValue = num.intValue();
        }
        return iIntValue;
    }
}
