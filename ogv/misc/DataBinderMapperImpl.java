package com.bilibili.ogv.misc;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/DataBinderMapperImpl.class */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f68981a = new SparseIntArray(0);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/DataBinderMapperImpl$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseArray<String> f68982a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_CAM_FOVX);
            f68982a = sparseArray;
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
            sparseArray.put(28, "config");
            sparseArray.put(29, "constellationAndAge");
            sparseArray.put(30, "containerHeight");
            sparseArray.put(31, "containerSelected");
            sparseArray.put(32, "containerVisible");
            sparseArray.put(33, TextSource.CFG_CONTENT);
            sparseArray.put(34, "contentAlpha");
            sparseArray.put(35, "contentColor");
            sparseArray.put(36, "coverUrl");
            sparseArray.put(37, "currentRoleAudioDesc");
            sparseArray.put(38, "danmakuCountText");
            sparseArray.put(39, "danmakuEnable");
            sparseArray.put(40, "danmakuOpen");
            sparseArray.put(41, "danmukuTvText");
            sparseArray.put(42, "danmukuTvVisible");
            sparseArray.put(43, "dataList");
            sparseArray.put(44, "descName");
            sparseArray.put(45, "descVo");
            sparseArray.put(46, "dialogStyleType");
            sparseArray.put(47, "directionType");
            sparseArray.put(48, "disable");
            sparseArray.put(49, "disableTagTextColor");
            sparseArray.put(50, "downBadgeDrawable");
            sparseArray.put(51, "downBadgeVisible");
            sparseArray.put(52, "emotionBadgeVisible");
            sparseArray.put(53, "emptyType");
            sparseArray.put(54, "endContent");
            sparseArray.put(55, "episodeDurationText");
            sparseArray.put(56, "episodeDurationTextVisible");
            sparseArray.put(57, "episodeTime");
            sparseArray.put(58, "episodeTimeVisible");
            sparseArray.put(59, "errorText");
            sparseArray.put(60, "errorTip");
            sparseArray.put(61, "errorVisible");
            sparseArray.put(62, "eventHandle");
            sparseArray.put(63, "firstButton");
            sparseArray.put(64, "firstButtonBadgeVo");
            sparseArray.put(65, "firstButtonCharSequence");
            sparseArray.put(66, "firstButtonText");
            sparseArray.put(67, "firstButtonVo");
            sparseArray.put(68, "flContainerVisible");
            sparseArray.put(69, "followButtonConfig");
            sparseArray.put(70, "handler");
            sparseArray.put(71, "hasAddView");
            sparseArray.put(72, "hasAnnouncement");
            sparseArray.put(73, "hasPendant");
            sparseArray.put(74, "hasPinMsg");
            sparseArray.put(75, "highPrivilegedUser");
            sparseArray.put(76, "icon");
            sparseArray.put(77, "iconVo");
            sparseArray.put(78, "imageAlpha");
            sparseArray.put(79, "imageDrawableId");
            sparseArray.put(80, "imageTranslationY");
            sparseArray.put(81, "imageUrl");
            sparseArray.put(82, "indexTitle");
            sparseArray.put(83, "indexTitleColor");
            sparseArray.put(84, "inputAlpha");
            sparseArray.put(85, "inputBarEnable");
            sparseArray.put(86, "inputBgWidth");
            sparseArray.put(87, "inputHintText");
            sparseArray.put(88, "inputText");
            sparseArray.put(89, "isBackVisible");
            sparseArray.put(90, "isCloseVisible");
            sparseArray.put(91, "isGuideWindowVisible");
            sparseArray.put(92, "itemDecoration");
            sparseArray.put(93, "landscape");
            sparseArray.put(94, "leftBadgeBackDrawable");
            sparseArray.put(95, "leftBadgeText");
            sparseArray.put(96, "leftBadgeTextColor");
            sparseArray.put(97, "leftBadgeVisible");
            sparseArray.put(98, "leftBtnBackDrawable");
            sparseArray.put(99, "leftBtnVisible");
            sparseArray.put(100, "leftText");
            sparseArray.put(101, "leftTextColor");
            sparseArray.put(102, "levelDrawableId");
            sparseArray.put(103, "marginTop");
            sparseArray.put(104, "master");
            sparseArray.put(105, IDeviceColorModule.EDGE_MODE_KEY);
            sparseArray.put(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_HAND_DET_SCORE_THRESHOLD, "msgContent");
            sparseArray.put(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_HAND_TRACK_SCORE_THRESHOLD, "myCard");
            sparseArray.put(108, "nameSpannableText");
            sparseArray.put(109, "nameTextColor");
            sparseArray.put(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_HAND_SKELETON_THRESHOLD, "needShowEndContainer");
            sparseArray.put(CaptionFx.BUBBLEPATH_FIELD_NUMBER, "needShowTitle");
            sparseArray.put(112, "negativeBtnText");
            sparseArray.put(113, "negativeBtnVisible");
            sparseArray.put(114, "newBadgeVisible");
            sparseArray.put(115, "newMsgText");
            sparseArray.put(116, "newPlayerMsgText");
            sparseArray.put(117, "nickTextColor");
            sparseArray.put(118, "nickTvColor");
            sparseArray.put(119, "nickname");
            sparseArray.put(120, "onNegativeClick");
            sparseArray.put(121, "onPositiveClick");
            sparseArray.put(122, "orderVisible");
            sparseArray.put(SearchBangumiItem.TYPE_FULLNET_TV, "overlayImageDrawable");
            sparseArray.put(SearchBangumiItem.TYPE_FULLNET_VARIETY, "ownerState");
            sparseArray.put(SearchBangumiItem.TYPE_FULLNET_DOCUMENTARY, "params");
            sparseArray.put(SearchBangumiItem.TYPE_FULLNET_MOVIE, "personAvatar");
            sparseArray.put(SearchBangumiItem.TYPE_FULLNET_BANGUMI, "personName");
            sparseArray.put(128, "playedNumIcon");
            sparseArray.put(129, "playedNumText");
            sparseArray.put(130, "playedNumVisible");
            sparseArray.put(131, "playerContainer");
            sparseArray.put(132, "playerNickTextColor");
            sparseArray.put(133, "playingLottieFileName");
            sparseArray.put(134, "playingLottieVisible");
            sparseArray.put(135, "positiveBtnText");
            sparseArray.put(136, "positiveBtnVisible");
            sparseArray.put(137, "positiveOrder");
            sparseArray.put(138, "quickMsgsVisible");
            sparseArray.put(139, "reportVo");
            sparseArray.put(140, "rightBadgeBackDrawable");
            sparseArray.put(141, "rightBadgeText");
            sparseArray.put(142, "rightBadgeTextColor");
            sparseArray.put(143, "rightBadgeVisible");
            sparseArray.put(144, "rightBtnBackDrawable");
            sparseArray.put(145, "rightBtnVisible");
            sparseArray.put(146, "rightText");
            sparseArray.put(147, "rightTextColor");
            sparseArray.put(148, "roleAvatar");
            sparseArray.put(149, "roleList");
            sparseArray.put(150, "roleListHeight");
            sparseArray.put(151, "roleName");
            sparseArray.put(152, "roleTitle");
            sparseArray.put(153, "roleType");
            sparseArray.put(154, "roomMode");
            sparseArray.put(155, "rootAlpha");
            sparseArray.put(156, "rootVisibility");
            sparseArray.put(157, "scrollListener");
            sparseArray.put(158, "scrollPosWithOffset");
            sparseArray.put(159, "secondButton");
            sparseArray.put(160, "secondButtonBadgeVo");
            sparseArray.put(161, "secondButtonCharSequence");
            sparseArray.put(162, "secondButtonText");
            sparseArray.put(163, "secondButtonVo");
            sparseArray.put(164, "sectionClosed");
            sparseArray.put(165, "select");
            sparseArray.put(166, "selectDataList");
            sparseArray.put(167, "selectTagBackground");
            sparseArray.put(168, "selectTagTextColor");
            sparseArray.put(169, "selectTitle");
            sparseArray.put(170, "selected");
            sparseArray.put(171, "sexDrawableId");
            sparseArray.put(172, "shieldState");
            sparseArray.put(173, "showType");
            sparseArray.put(174, "spannableTitle");
            sparseArray.put(175, "splitText");
            sparseArray.put(176, "subContent");
            sparseArray.put(177, "subContentColor");
            sparseArray.put(178, "subTitle");
            sparseArray.put(179, "subTitleColor");
            sparseArray.put(180, "subTitleLeftIconUrl");
            sparseArray.put(181, "subTitleText");
            sparseArray.put(182, "subTitleVo");
            sparseArray.put(183, "switchBtnBgColor");
            sparseArray.put(184, "tagLineData");
            sparseArray.put(185, "tagText");
            sparseArray.put(186, "tagTitle");
            sparseArray.put(187, "tagTitleColor");
            sparseArray.put(188, "time");
            sparseArray.put(189, "timeVisible");
            sparseArray.put(190, "title");
            sparseArray.put(191, "titleColor");
            sparseArray.put(192, "titleLineCount");
            sparseArray.put(193, "titleText");
            sparseArray.put(194, "titleVo");
            sparseArray.put(195, "topContainerShow");
            sparseArray.put(196, "unselectedTagBackground");
            sparseArray.put(197, "unselectedTagTextColor");
            sparseArray.put(198, "upInfoTvText");
            sparseArray.put(TrustedErrorCode.MANAGER_ERROR_UNKONWN_CODE, "upInfoTvVisible");
            sparseArray.put(200, "updateAttention");
            sparseArray.put(201, "updateDescription");
            sparseArray.put(202, "updateGuestAttention");
            sparseArray.put(203, "value");
            sparseArray.put(ComposerKt.providerMapsKey, "viewModel");
            sparseArray.put(205, "viewModelInner");
            sparseArray.put(ComposerKt.referenceKey, "vipBarVo");
            sparseArray.put(ComposerKt.reuseKey, "vm");
            sparseArray.put(208, "vvmAdapter");
            sparseArray.put(209, "vvmAdapterInner");
            sparseArray.put(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_BODY_STATURE, "width");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/DataBinderMapperImpl$b.class */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap<String, Integer> f68983a = new HashMap<>(0);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.bilibili.app.gemini.base.DataBinderMapperImpl());
        arrayList.add(new com.bilibili.bangumi.DataBinderMapperImpl());
        arrayList.add(new com.bilibili.ogv.glue.DataBinderMapperImpl());
        arrayList.add(new com.bilibili.ogvcommon.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final String convertBrIdToString(int i7) {
        return a.f68982a.get(i7);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i7) {
        if (f68981a.get(i7) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i7) {
        if (viewArr == null || viewArr.length == 0 || f68981a.get(i7) <= 0 || viewArr[0].getTag() != null) {
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
        Integer num = b.f68983a.get(str);
        if (num != null) {
            iIntValue = num.intValue();
        }
        return iIntValue;
    }
}
