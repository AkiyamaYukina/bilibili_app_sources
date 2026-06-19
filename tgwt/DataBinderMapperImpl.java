package com.bilibili.tgwt;

import DD0.AbstractC1547u;
import DD0.AbstractC1551y;
import DD0.B;
import DD0.C1529b;
import DD0.C1531d;
import DD0.C1533f;
import DD0.C1535h;
import DD0.C1537j;
import DD0.C1539l;
import DD0.C1541n;
import DD0.C1543p;
import DD0.C1546t;
import DD0.C1548v;
import DD0.C1550x;
import DD0.C1552z;
import DD0.D;
import DD0.F;
import DD0.G;
import DD0.H;
import DD0.J;
import DD0.L;
import DD0.N;
import DD0.P;
import DD0.Q;
import DD0.U;
import DD0.W;
import DD0.X;
import DD0.Y;
import DD0.a0;
import DD0.c0;
import DD0.e0;
import DD0.g0;
import DD0.i0;
import DD0.k0;
import DD0.m0;
import DD0.o0;
import DD0.p0;
import DD0.q0;
import DD0.r;
import DD0.s0;
import DD0.u0;
import Fp.c;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.alipay.alipaysecuritysdk.common.exception.ErrorCode;
import com.alipay.blueshield.IDeviceColorModule;
import com.alipay.blueshield.TrustedErrorCode;
import com.bilibili.live.streaming.source.TextSource;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.ogvcommon.widget.DisableSlideViewPager;
import com.bilibili.search2.api.SearchBangumiItem;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.bilibili.studio.videoeditor.CaptionFx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/DataBinderMapperImpl.class */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f110826a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/DataBinderMapperImpl$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseArray<String> f110827a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(ErrorCode.E_BUSY);
            f110827a = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "actors");
            sparseArray.put(2, "agreeBackground");
            sparseArray.put(3, "agreeContent");
            sparseArray.put(4, "allTagDataList");
            sparseArray.put(5, "animSurpriseEvent");
            sparseArray.put(6, "animSurpriseState");
            sparseArray.put(7, "announcementContent");
            sparseArray.put(8, "announcementTitle");
            sparseArray.put(9, "audioEdition");
            sparseArray.put(10, "audioItemBackDrawable");
            sparseArray.put(11, "audioList");
            sparseArray.put(12, "avatar");
            sparseArray.put(13, "avatarList");
            sparseArray.put(14, "avatarListVisible");
            sparseArray.put(15, "backImageUrl");
            sparseArray.put(16, "background");
            sparseArray.put(17, "backgroundDrawable");
            sparseArray.put(18, "backgroundImage");
            sparseArray.put(19, "backgroundTranslucentEnable");
            sparseArray.put(20, "backgroundVo");
            sparseArray.put(21, "badgeBgColor");
            sparseArray.put(22, "badgeBgColorNight");
            sparseArray.put(23, "badgeInfo");
            sparseArray.put(24, "badgeText");
            sparseArray.put(25, "bgAlpha");
            sparseArray.put(26, "bgDrawable");
            sparseArray.put(27, "bgHeight");
            sparseArray.put(28, "bgWidth");
            sparseArray.put(29, "bottomDesc");
            sparseArray.put(30, "bottomDisplay1");
            sparseArray.put(31, "bottomDisplay2");
            sparseArray.put(32, "bottomDisplay3");
            sparseArray.put(33, "bottomDisplay4");
            sparseArray.put(34, "buttonWidths");
            sparseArray.put(35, "changeEpBtnVisible");
            sparseArray.put(36, "chatHint");
            sparseArray.put(37, "chatPlayerInputHint");
            sparseArray.put(38, "chatRoomConfig");
            sparseArray.put(39, "check");
            sparseArray.put(40, "checkContent");
            sparseArray.put(41, "collapsedTextAlpha");
            sparseArray.put(42, "comingToEnd");
            sparseArray.put(43, "config");
            sparseArray.put(44, "constellationAndAge");
            sparseArray.put(45, "containerHeight");
            sparseArray.put(46, "containerSelected");
            sparseArray.put(47, "containerVisible");
            sparseArray.put(48, TextSource.CFG_CONTENT);
            sparseArray.put(49, "contentAlpha");
            sparseArray.put(50, "contentBackground");
            sparseArray.put(51, "contentColor");
            sparseArray.put(52, "cover");
            sparseArray.put(53, "coverUrl");
            sparseArray.put(54, "createClick");
            sparseArray.put(55, "createOrMatch");
            sparseArray.put(56, "currentRoleAudioDesc");
            sparseArray.put(57, "danmakuCountText");
            sparseArray.put(58, "danmakuEnable");
            sparseArray.put(59, "danmakuInputVm");
            sparseArray.put(60, "danmakuOpen");
            sparseArray.put(61, "danmukuTvText");
            sparseArray.put(62, "danmukuTvVisible");
            sparseArray.put(63, "dataList");
            sparseArray.put(64, "descName");
            sparseArray.put(65, "descVo");
            sparseArray.put(66, "description");
            sparseArray.put(67, "dialogBackground");
            sparseArray.put(68, "dialogStyleType");
            sparseArray.put(69, "directionType");
            sparseArray.put(70, "disable");
            sparseArray.put(71, "disableTagTextColor");
            sparseArray.put(72, "disagreeBackground");
            sparseArray.put(73, "disagreeContent");
            sparseArray.put(74, "dividerLineVisible");
            sparseArray.put(75, "downBadgeDrawable");
            sparseArray.put(76, "downBadgeVisible");
            sparseArray.put(77, "emoteImage");
            sparseArray.put(78, "emoteImageVisible");
            sparseArray.put(79, "emotionBadgeVisible");
            sparseArray.put(80, "emptyType");
            sparseArray.put(81, "endContent");
            sparseArray.put(82, "episodeDurationText");
            sparseArray.put(83, "episodeDurationTextVisible");
            sparseArray.put(84, "episodeTime");
            sparseArray.put(85, "episodeTimeVisible");
            sparseArray.put(86, "errorText");
            sparseArray.put(87, "errorTip");
            sparseArray.put(88, "errorVisible");
            sparseArray.put(89, "eventHandle");
            sparseArray.put(90, "fateMatch");
            sparseArray.put(91, "firstButton");
            sparseArray.put(92, "firstButtonBadgeVo");
            sparseArray.put(93, "firstButtonCharSequence");
            sparseArray.put(94, "firstButtonText");
            sparseArray.put(95, "firstButtonVo");
            sparseArray.put(96, "flContainerVisible");
            sparseArray.put(97, "followButtonConfig");
            sparseArray.put(98, "guest");
            sparseArray.put(99, "guestPureEnjoyMsgList");
            sparseArray.put(100, "guestPureEnjoymentMode");
            sparseArray.put(101, "handler");
            sparseArray.put(102, "hasAddView");
            sparseArray.put(103, "hasAnnouncement");
            sparseArray.put(104, "hasMatching");
            sparseArray.put(105, "hasPendant");
            sparseArray.put(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_HAND_DET_SCORE_THRESHOLD, "hasPinMsg");
            sparseArray.put(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_HAND_TRACK_SCORE_THRESHOLD, "hasStarted");
            sparseArray.put(108, "headerCover");
            sparseArray.put(109, "headerLink");
            sparseArray.put(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_HAND_SKELETON_THRESHOLD, "headerSubtitle");
            sparseArray.put(CaptionFx.BUBBLEPATH_FIELD_NUMBER, "headerTitle");
            sparseArray.put(112, "headerVisible");
            sparseArray.put(113, "highPrivilegedUser");
            sparseArray.put(114, "icon");
            sparseArray.put(115, "iconVo");
            sparseArray.put(116, "imageAlpha");
            sparseArray.put(117, "imageDrawableId");
            sparseArray.put(118, "imageTranslationY");
            sparseArray.put(119, "imageUrl");
            sparseArray.put(120, "inRoom");
            sparseArray.put(121, "indexTitle");
            sparseArray.put(122, "indexTitleColor");
            sparseArray.put(SearchBangumiItem.TYPE_FULLNET_TV, "inputAlpha");
            sparseArray.put(SearchBangumiItem.TYPE_FULLNET_VARIETY, "inputBarEnable");
            sparseArray.put(SearchBangumiItem.TYPE_FULLNET_DOCUMENTARY, "inputBgWidth");
            sparseArray.put(SearchBangumiItem.TYPE_FULLNET_MOVIE, "inputHintText");
            sparseArray.put(SearchBangumiItem.TYPE_FULLNET_BANGUMI, "inputText");
            sparseArray.put(128, "isBackVisible");
            sparseArray.put(129, "isCloseVisible");
            sparseArray.put(130, "isFullScreen");
            sparseArray.put(131, "isGuideWindowVisible");
            sparseArray.put(132, "isVoiceMsg");
            sparseArray.put(133, "itemDecoration");
            sparseArray.put(134, "landscape");
            sparseArray.put(135, "landscapeAndInChatRoom");
            sparseArray.put(136, "landscapeBackImageUrl");
            sparseArray.put(137, "landscapeMode");
            sparseArray.put(138, "leftBadgeBackDrawable");
            sparseArray.put(139, "leftBadgeText");
            sparseArray.put(140, "leftBadgeTextColor");
            sparseArray.put(141, "leftBadgeVisible");
            sparseArray.put(142, "leftBtnBackDrawable");
            sparseArray.put(143, "leftBtnVisible");
            sparseArray.put(144, "leftText");
            sparseArray.put(145, "leftTextColor");
            sparseArray.put(146, "levelDrawableId");
            sparseArray.put(147, "marginTop");
            sparseArray.put(148, "master");
            sparseArray.put(149, "matchBtnText");
            sparseArray.put(150, "matchSex");
            sparseArray.put(151, "microphoneVolume");
            sparseArray.put(152, EditCustomizeSticker.TAG_MID);
            sparseArray.put(153, IDeviceColorModule.EDGE_MODE_KEY);
            sparseArray.put(154, "msgContent");
            sparseArray.put(155, "myCard");
            sparseArray.put(156, "name");
            sparseArray.put(157, "nameSpannableText");
            sparseArray.put(158, "nameTextColor");
            sparseArray.put(159, "needShowEndContainer");
            sparseArray.put(160, "needShowTitle");
            sparseArray.put(161, "negativeBtnText");
            sparseArray.put(162, "negativeBtnVisible");
            sparseArray.put(163, "newBadgeVisible");
            sparseArray.put(164, "newMsgText");
            sparseArray.put(165, "newPlayerMsgText");
            sparseArray.put(166, "nickTextColor");
            sparseArray.put(167, "nickTvColor");
            sparseArray.put(168, "nickname");
            sparseArray.put(169, "normalContentText");
            sparseArray.put(170, "normalMatchBackground");
            sparseArray.put(171, "normalMatchVisible");
            sparseArray.put(172, "numberOfRater");
            sparseArray.put(173, "onClickRoot");
            sparseArray.put(174, "onNegativeClick");
            sparseArray.put(175, "onPositiveClick");
            sparseArray.put(176, "openVoice");
            sparseArray.put(177, "orderVisible");
            sparseArray.put(178, "outRingAlpha");
            sparseArray.put(179, "outerRingSize");
            sparseArray.put(180, "overlayImageDrawable");
            sparseArray.put(181, "owner");
            sparseArray.put(182, "ownerName");
            sparseArray.put(183, "ownerState");
            sparseArray.put(184, "params");
            sparseArray.put(185, "personAvatar");
            sparseArray.put(186, "personName");
            sparseArray.put(187, "playStateIcon");
            sparseArray.put(188, "playedNumIcon");
            sparseArray.put(189, "playedNumText");
            sparseArray.put(190, "playedNumVisible");
            sparseArray.put(191, "playerContainer");
            sparseArray.put(192, "playerNickTextColor");
            sparseArray.put(193, "playerVoiceMsgContainerWidth");
            sparseArray.put(194, "playingLottieFileName");
            sparseArray.put(195, "playingLottieVisible");
            sparseArray.put(196, "positiveBtnText");
            sparseArray.put(197, "positiveBtnVisible");
            sparseArray.put(198, "positiveOrder");
            sparseArray.put(TrustedErrorCode.MANAGER_ERROR_UNKONWN_CODE, "posterUrl");
            sparseArray.put(200, "privacyContent");
            sparseArray.put(201, NotificationCompat.CATEGORY_PROGRESS);
            sparseArray.put(202, "protocalBackground");
            sparseArray.put(203, "protocalTips");
            sparseArray.put(ComposerKt.providerMapsKey, "quickMsgList");
            sparseArray.put(205, "quickMsgVisible");
            sparseArray.put(ComposerKt.referenceKey, "quickMsgsVisible");
            sparseArray.put(ComposerKt.reuseKey, "rating");
            sparseArray.put(208, "ratingVisibility");
            sparseArray.put(209, "reportVo");
            sparseArray.put(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_BODY_STATURE, "rightBadgeBackDrawable");
            sparseArray.put(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_CAM_FOVX, "rightBadgeText");
            sparseArray.put(212, "rightBadgeTextColor");
            sparseArray.put(213, "rightBadgeVisible");
            sparseArray.put(214, "rightBtnBackDrawable");
            sparseArray.put(215, "rightBtnVisible");
            sparseArray.put(216, "rightText");
            sparseArray.put(217, "rightTextColor");
            sparseArray.put(218, "roleAvatar");
            sparseArray.put(219, "roleList");
            sparseArray.put(220, "roleListHeight");
            sparseArray.put(221, "roleName");
            sparseArray.put(222, "roleTitle");
            sparseArray.put(223, "roleType");
            sparseArray.put(224, "roomGuestMsgEnjoyChecked");
            sparseArray.put(225, "roomMode");
            sparseArray.put(226, "rootAlpha");
            sparseArray.put(227, "rootClick");
            sparseArray.put(228, "rootVisibility");
            sparseArray.put(229, "scrollListener");
            sparseArray.put(230, "scrollPosWithOffset");
            sparseArray.put(231, "scrollPositionWithOffset");
            sparseArray.put(232, "secondButton");
            sparseArray.put(233, "secondButtonBadgeVo");
            sparseArray.put(234, "secondButtonCharSequence");
            sparseArray.put(235, "secondButtonText");
            sparseArray.put(236, "secondButtonVo");
            sparseArray.put(237, "sectionClosed");
            sparseArray.put(238, "select");
            sparseArray.put(239, "selectDataList");
            sparseArray.put(240, "selectTagBackground");
            sparseArray.put(241, "selectTagTextColor");
            sparseArray.put(242, "selectTitle");
            sparseArray.put(243, "selected");
            sparseArray.put(244, "sexDrawableId");
            sparseArray.put(245, "sexIcon");
            sparseArray.put(246, "shareMenuListener");
            sparseArray.put(247, "shieldState");
            sparseArray.put(248, "showEpEnter");
            sparseArray.put(249, "showSexIcon");
            sparseArray.put(250, "showType");
            sparseArray.put(251, "spannableTitle");
            sparseArray.put(252, "splitText");
            sparseArray.put(253, "subContent");
            sparseArray.put(254, "subContentColor");
            sparseArray.put(255, "subTitle");
            sparseArray.put(256, "subTitleColor");
            sparseArray.put(257, "subTitleLeftIconUrl");
            sparseArray.put(258, "subTitleText");
            sparseArray.put(259, "subTitleVo");
            sparseArray.put(260, "subtitle");
            sparseArray.put(261, "switchBtnBgColor");
            sparseArray.put(262, "tagLineData");
            sparseArray.put(263, "tagText");
            sparseArray.put(264, "tagTitle");
            sparseArray.put(265, "tagTitleColor");
            sparseArray.put(266, "teenagers");
            sparseArray.put(267, "time");
            sparseArray.put(268, "timeLength");
            sparseArray.put(269, "timeVisible");
            sparseArray.put(270, "title");
            sparseArray.put(271, "titleColor");
            sparseArray.put(272, "titleLineCount");
            sparseArray.put(273, "titleText");
            sparseArray.put(274, "titleVo");
            sparseArray.put(275, "toolbar");
            sparseArray.put(276, "topContainerShow");
            sparseArray.put(277, "typeLayoutManager");
            sparseArray.put(278, "typeList");
            sparseArray.put(279, "unselectedTagBackground");
            sparseArray.put(280, "unselectedTagTextColor");
            sparseArray.put(281, "upInfoTvText");
            sparseArray.put(282, "upInfoTvVisible");
            sparseArray.put(283, "updateAttention");
            sparseArray.put(284, "updateDescription");
            sparseArray.put(285, "updateGuestAttention");
            sparseArray.put(286, "upperHeaderAvatar");
            sparseArray.put(287, "userCount");
            sparseArray.put(288, "userDesc");
            sparseArray.put(289, "userName");
            sparseArray.put(290, "value");
            sparseArray.put(291, "videoVolume");
            sparseArray.put(292, "viewModel");
            sparseArray.put(293, "viewModelInner");
            sparseArray.put(294, "vipBar");
            sparseArray.put(295, "vipBarVo");
            sparseArray.put(296, "vm");
            sparseArray.put(297, "voiceBtnVisible");
            sparseArray.put(298, "voiceMsgContainerWidth");
            sparseArray.put(299, "voiceMsgHasRead");
            sparseArray.put(300, "voiceMsgWidth");
            sparseArray.put(301, "voiceNoticeText");
            sparseArray.put(302, "voicePlaying");
            sparseArray.put(303, "voiceRecordState");
            sparseArray.put(304, "voiceRecordTime");
            sparseArray.put(305, "vvmAdapter");
            sparseArray.put(306, "vvmAdapterInner");
            sparseArray.put(ErrorCode.E_OPERATIONTYPE_EMPTY, "watchTime");
            sparseArray.put(ErrorCode.E_SIGN_ERROR, "watchTimeVisible");
            sparseArray.put(ErrorCode.E_T0_HANDLE_INVALID, "watchWithVisible");
            sparseArray.put(ErrorCode.E_VOS_UPDATE_TRUSTTIME, "width");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/DataBinderMapperImpl$b.class */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap<String, Integer> f110828a;

        static {
            HashMap<String, Integer> map = new HashMap<>(36);
            f110828a = map;
            p2.b.a(2131500166, map, "layout/tgwt_adjust_voice_dialog_0", 2131500167, "layout/tgwt_change_room_fragment_0");
            p2.b.a(2131500168, map, "layout/tgwt_chat_enter_special_0", 2131500169, "layout/tgwt_chat_fragment_0");
            p2.b.a(2131500170, map, "layout/tgwt_chat_quick_msg_0", 2131500171, "layout/tgwt_chat_voice_fragment_0");
            p2.b.a(2131500172, map, "layout/tgwt_cinema_settings_dialog_0", 2131500173, "layout/tgwt_detail_page_0");
            p2.b.a(2131500174, map, "layout/tgwt_dialog_cinema_notice_0", 2131500176, "layout/tgwt_dialog_together_watch_authorize_0");
            p2.b.a(2131500177, map, "layout/tgwt_fake_input_bar_0", 2131500179, "layout/tgwt_film_item_0");
            p2.b.a(2131500180, map, "layout/tgwt_fragment_all_type_0", 2131500181, "layout/tgwt_fragment_chat_0");
            p2.b.a(2131500182, map, "layout/tgwt_image_invite_item_0", 2131500183, "layout/tgwt_image_notice_item_0");
            p2.b.a(2131500185, map, "layout/tgwt_member_avatar_with_voice_effect_0", 2131500186, "layout/tgwt_my_msg_item_0");
            p2.b.a(2131500187, map, "layout/tgwt_other_msg_item_0", 2131500188, "layout/tgwt_player_chat_fragment_0");
            p2.b.a(2131500189, map, "layout/tgwt_player_chat_fragment_panel_0", 2131500193, "layout/tgwt_room_online_0");
            p2.b.a(2131500194, map, "layout/tgwt_room_title_0", 2131500195, "layout/tgwt_send_voice_msg_dialog_0");
            p2.b.a(2131500199, map, "layout/tgwt_square_page_wait_watch_0", 2131500200, "layout/tgwt_square_page_wait_watch_item_0");
            p2.b.a(2131500201, map, "layout/tgwt_text_notice_item_0", 2131500203, "layout/tgwt_voice_mode_microphone_0");
            p2.b.a(2131500507, map, "layout/together_watch_fragment_match_0", 2131500508, "layout/together_watch_fragment_movie_card_list_0");
            p2.b.a(2131500511, map, "layout/together_watch_item_chat_member_0", 2131500513, "layout/together_watch_item_type_tab_0");
            p2.b.a(2131500516, map, "layout/together_watch_no_more_0", 2131500519, "layout/together_watch_player_chat_voice_member_popup_container_0");
            p2.b.a(2131500535, map, "layout/together_watch_room_hot_0", 2131500536, "layout/together_watch_room_online_item_0");
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(36);
        f110826a = sparseIntArray;
        sparseIntArray.put(2131500166, 1);
        sparseIntArray.put(2131500167, 2);
        sparseIntArray.put(2131500168, 3);
        sparseIntArray.put(2131500169, 4);
        sparseIntArray.put(2131500170, 5);
        sparseIntArray.put(2131500171, 6);
        sparseIntArray.put(2131500172, 7);
        sparseIntArray.put(2131500173, 8);
        sparseIntArray.put(2131500174, 9);
        sparseIntArray.put(2131500176, 10);
        sparseIntArray.put(2131500177, 11);
        sparseIntArray.put(2131500179, 12);
        sparseIntArray.put(2131500180, 13);
        sparseIntArray.put(2131500181, 14);
        sparseIntArray.put(2131500182, 15);
        sparseIntArray.put(2131500183, 16);
        sparseIntArray.put(2131500185, 17);
        sparseIntArray.put(2131500186, 18);
        sparseIntArray.put(2131500187, 19);
        sparseIntArray.put(2131500188, 20);
        sparseIntArray.put(2131500189, 21);
        sparseIntArray.put(2131500193, 22);
        sparseIntArray.put(2131500194, 23);
        sparseIntArray.put(2131500195, 24);
        sparseIntArray.put(2131500199, 25);
        sparseIntArray.put(2131500200, 26);
        sparseIntArray.put(2131500201, 27);
        sparseIntArray.put(2131500203, 28);
        sparseIntArray.put(2131500507, 29);
        sparseIntArray.put(2131500508, 30);
        sparseIntArray.put(2131500511, 31);
        sparseIntArray.put(2131500513, 32);
        sparseIntArray.put(2131500516, 33);
        sparseIntArray.put(2131500519, 34);
        sparseIntArray.put(2131500535, 35);
        sparseIntArray.put(2131500536, 36);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(8);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.bilibili.app.gemini.base.DataBinderMapperImpl());
        arrayList.add(new com.bilibili.app.gemini.ui.DataBinderMapperImpl());
        arrayList.add(new com.bilibili.bangumi.DataBinderMapperImpl());
        arrayList.add(new com.bilibili.chatroom.DataBinderMapperImpl());
        arrayList.add(new com.bilibili.chatroomsdk.DataBinderMapperImpl());
        arrayList.add(new com.bilibili.ogv.glue.DataBinderMapperImpl());
        arrayList.add(new com.bilibili.ogvcommon.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final String convertBrIdToString(int i7) {
        return a.f110827a.get(i7);
    }

    /* JADX WARN: Type inference failed for: r0v133, types: [DD0.Q, DD0.S, androidx.databinding.ViewDataBinding] */
    /* JADX WARN: Type inference failed for: r0v161, types: [DD0.X, DD0.Y, androidx.databinding.ViewDataBinding] */
    /* JADX WARN: Type inference failed for: r0v212, types: [DD0.p0, DD0.q0, androidx.databinding.ViewDataBinding] */
    /* JADX WARN: Type inference failed for: r0v55, types: [DD0.u, DD0.v, androidx.databinding.ViewDataBinding] */
    /* JADX WARN: Type inference failed for: r0v86, types: [DD0.y, DD0.z, androidx.databinding.ViewDataBinding] */
    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i7) {
        int i8 = f110826a.get(i7);
        if (i8 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        switch (i8) {
            case 1:
                if ("layout/tgwt_adjust_voice_dialog_0".equals(tag)) {
                    return new C1529b(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for tgwt_adjust_voice_dialog is invalid. Received: "));
            case 2:
                if ("layout/tgwt_change_room_fragment_0".equals(tag)) {
                    return new C1531d(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for tgwt_change_room_fragment is invalid. Received: "));
            case 3:
                if ("layout/tgwt_chat_enter_special_0".equals(tag)) {
                    return new C1533f(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for tgwt_chat_enter_special is invalid. Received: "));
            case 4:
                if ("layout/tgwt_chat_fragment_0".equals(tag)) {
                    return new C1535h(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for tgwt_chat_fragment is invalid. Received: "));
            case 5:
                if ("layout/tgwt_chat_quick_msg_0".equals(tag)) {
                    return new C1537j(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for tgwt_chat_quick_msg is invalid. Received: "));
            case 6:
                if ("layout/tgwt_chat_voice_fragment_0".equals(tag)) {
                    return new C1539l(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for tgwt_chat_voice_fragment is invalid. Received: "));
            case 7:
                if ("layout/tgwt_cinema_settings_dialog_0".equals(tag)) {
                    return new C1541n(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for tgwt_cinema_settings_dialog is invalid. Received: "));
            case 8:
                if ("layout/tgwt_detail_page_0".equals(tag)) {
                    return new C1543p(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for tgwt_detail_page is invalid. Received: "));
            case 9:
                if ("layout/tgwt_dialog_cinema_notice_0".equals(tag)) {
                    return new r(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for tgwt_dialog_cinema_notice is invalid. Received: "));
            case 10:
                if ("layout/tgwt_dialog_together_watch_authorize_0".equals(tag)) {
                    return new C1546t(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for tgwt_dialog_together_watch_authorize is invalid. Received: "));
            case 11:
                if (!"layout/tgwt_fake_input_bar_0".equals(tag)) {
                    throw new IllegalArgumentException(c.b(tag, "The tag for tgwt_fake_input_bar is invalid. Received: "));
                }
                Object[] objArrMapBindings = ViewDataBinding.mapBindings(dataBindingComponent, view, 10, (ViewDataBinding.i) null, C1548v.f2663H);
                ?? abstractC1547u = new AbstractC1547u(dataBindingComponent, view, (ImageView) objArrMapBindings[7], (ImageView) objArrMapBindings[9], (TextView) objArrMapBindings[5], (View) objArrMapBindings[8], (FrameLayout) objArrMapBindings[6], (ImageView) objArrMapBindings[4], (View) objArrMapBindings[3], (RecyclerView) objArrMapBindings[2], (TextView) objArrMapBindings[1]);
                abstractC1547u.f2664G = -1L;
                abstractC1547u.f2650w.setTag(null);
                abstractC1547u.f2652y.setTag(null);
                abstractC1547u.f2644A.setTag(null);
                abstractC1547u.f2645B.setTag(null);
                ((ConstraintLayout) objArrMapBindings[0]).setTag(null);
                abstractC1547u.f2646C.setTag(null);
                abstractC1547u.f2647D.setTag(null);
                abstractC1547u.f2648E.setTag(null);
                abstractC1547u.setRootTag(view);
                abstractC1547u.invalidateAll();
                return abstractC1547u;
            case 12:
                if ("layout/tgwt_film_item_0".equals(tag)) {
                    return new C1550x(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for tgwt_film_item is invalid. Received: "));
            case 13:
                if (!"layout/tgwt_fragment_all_type_0".equals(tag)) {
                    throw new IllegalArgumentException(c.b(tag, "The tag for tgwt_fragment_all_type is invalid. Received: "));
                }
                Object[] objArrMapBindings2 = ViewDataBinding.mapBindings(dataBindingComponent, view, 5, (ViewDataBinding.i) null, C1552z.f2685D);
                ?? abstractC1551y = new AbstractC1551y(dataBindingComponent, view, (View) objArrMapBindings2[2], (View) objArrMapBindings2[3], (RecyclerView) objArrMapBindings2[1], (DisableSlideViewPager) objArrMapBindings2[4]);
                abstractC1551y.f2687C = -1L;
                ((ConstraintLayout) objArrMapBindings2[0]).setTag(null);
                abstractC1551y.f2683y.setTag(null);
                abstractC1551y.setRootTag(view);
                abstractC1551y.invalidateAll();
                return abstractC1551y;
            case 14:
                if ("layout/tgwt_fragment_chat_0".equals(tag)) {
                    return new B(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for tgwt_fragment_chat is invalid. Received: "));
            case 15:
                if ("layout/tgwt_image_invite_item_0".equals(tag)) {
                    return new D(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for tgwt_image_invite_item is invalid. Received: "));
            case 16:
                if ("layout/tgwt_image_notice_item_0".equals(tag)) {
                    return new F(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for tgwt_image_notice_item is invalid. Received: "));
            case 17:
                if ("layout/tgwt_member_avatar_with_voice_effect_0".equals(tag)) {
                    return new H(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for tgwt_member_avatar_with_voice_effect is invalid. Received: "));
            case 18:
                if ("layout/tgwt_my_msg_item_0".equals(tag)) {
                    return new J(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for tgwt_my_msg_item is invalid. Received: "));
            case 19:
                if ("layout/tgwt_other_msg_item_0".equals(tag)) {
                    return new L(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for tgwt_other_msg_item is invalid. Received: "));
            case 20:
                if ("layout/tgwt_player_chat_fragment_0".equals(tag)) {
                    return new N(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for tgwt_player_chat_fragment is invalid. Received: "));
            case 21:
                if ("layout/tgwt_player_chat_fragment_panel_0".equals(tag)) {
                    return new P(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for tgwt_player_chat_fragment_panel is invalid. Received: "));
            case 22:
                if (!"layout/tgwt_room_online_0".equals(tag)) {
                    throw new IllegalArgumentException(c.b(tag, "The tag for tgwt_room_online is invalid. Received: "));
                }
                Object[] objArrMapBindings3 = ViewDataBinding.mapBindings(dataBindingComponent, view, 5, (ViewDataBinding.i) null, (SparseIntArray) null);
                ?? q7 = new Q(dataBindingComponent, view, (RecyclerView) objArrMapBindings3[4], (LinearLayout) objArrMapBindings3[3], (TextView) objArrMapBindings3[2], (ConstraintLayout) objArrMapBindings3[0], (TextView) objArrMapBindings3[1]);
                q7.f2364D = -1L;
                q7.f2359w.setTag(null);
                q7.f2360x.setTag(null);
                q7.f2361y.setTag(null);
                q7.f2362z.setTag(null);
                q7.f2357A.setTag(null);
                q7.setRootTag(view);
                q7.invalidateAll();
                return q7;
            case 23:
                if ("layout/tgwt_room_title_0".equals(tag)) {
                    return new U(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for tgwt_room_title is invalid. Received: "));
            case 24:
                if ("layout/tgwt_send_voice_msg_dialog_0".equals(tag)) {
                    return new W(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for tgwt_send_voice_msg_dialog is invalid. Received: "));
            case 25:
                if (!"layout/tgwt_square_page_wait_watch_0".equals(tag)) {
                    throw new IllegalArgumentException(c.b(tag, "The tag for tgwt_square_page_wait_watch is invalid. Received: "));
                }
                Object[] objArrMapBindings4 = ViewDataBinding.mapBindings(dataBindingComponent, view, 4, (ViewDataBinding.i) null, (SparseIntArray) null);
                ?? x6 = new X(dataBindingComponent, view, (RecyclerView) objArrMapBindings4[3], (LinearLayout) objArrMapBindings4[2], (ConstraintLayout) objArrMapBindings4[0], (TextView) objArrMapBindings4[1]);
                x6.f2407B = new Y.a(x6);
                x6.f2408C = -1L;
                x6.f2403w.setTag(null);
                x6.f2404x.setTag(null);
                x6.f2405y.setTag(null);
                x6.f2406z.setTag(null);
                x6.setRootTag(view);
                x6.invalidateAll();
                return x6;
            case 26:
                if ("layout/tgwt_square_page_wait_watch_item_0".equals(tag)) {
                    return new a0(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for tgwt_square_page_wait_watch_item is invalid. Received: "));
            case 27:
                if ("layout/tgwt_text_notice_item_0".equals(tag)) {
                    return new c0(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for tgwt_text_notice_item is invalid. Received: "));
            case 28:
                if ("layout/tgwt_voice_mode_microphone_0".equals(tag)) {
                    return new e0(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for tgwt_voice_mode_microphone is invalid. Received: "));
            case 29:
                if ("layout/together_watch_fragment_match_0".equals(tag)) {
                    return new g0(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for together_watch_fragment_match is invalid. Received: "));
            case 30:
                if ("layout/together_watch_fragment_movie_card_list_0".equals(tag)) {
                    return new i0(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for together_watch_fragment_movie_card_list is invalid. Received: "));
            case 31:
                if ("layout/together_watch_item_chat_member_0".equals(tag)) {
                    return new k0(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for together_watch_item_chat_member is invalid. Received: "));
            case 32:
                if ("layout/together_watch_item_type_tab_0".equals(tag)) {
                    return new m0(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for together_watch_item_type_tab is invalid. Received: "));
            case 33:
                if ("layout/together_watch_no_more_0".equals(tag)) {
                    return new o0(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for together_watch_no_more is invalid. Received: "));
            case 34:
                if (!"layout/together_watch_player_chat_voice_member_popup_container_0".equals(tag)) {
                    throw new IllegalArgumentException(c.b(tag, "The tag for together_watch_player_chat_voice_member_popup_container is invalid. Received: "));
                }
                Object[] objArrMapBindings5 = ViewDataBinding.mapBindings(dataBindingComponent, view, 4, q0.f2604D, q0.f2605E);
                ?? p0Var = new p0(dataBindingComponent, view, (ConstraintLayout) objArrMapBindings5[0], (G) objArrMapBindings5[2], (G) objArrMapBindings5[1], (View) objArrMapBindings5[3]);
                p0Var.f2606C = -1L;
                p0Var.f2597w.setTag(null);
                p0Var.setContainedBinding(p0Var.f2598x);
                p0Var.setContainedBinding(p0Var.f2599y);
                p0Var.setRootTag(view);
                p0Var.invalidateAll();
                return p0Var;
            case 35:
                if ("layout/together_watch_room_hot_0".equals(tag)) {
                    return new s0(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for together_watch_room_hot is invalid. Received: "));
            case 36:
                if ("layout/together_watch_room_online_item_0".equals(tag)) {
                    return new u0(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for together_watch_room_online_item is invalid. Received: "));
            default:
                return null;
        }
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i7) {
        if (viewArr == null || viewArr.length == 0 || f110826a.get(i7) <= 0 || viewArr[0].getTag() != null) {
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
        Integer num = b.f110828a.get(str);
        if (num != null) {
            iIntValue = num.intValue();
        }
        return iIntValue;
    }
}
