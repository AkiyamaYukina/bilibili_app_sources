package com.bilibili.ship.theseus.ugc;

import Vu0.C2973l;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.alipay.blueshield.IDeviceColorModule;
import com.bilibili.live.streaming.source.TextSource;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.search2.api.SearchBangumiItem;
import com.bilibili.studio.videoeditor.CaptionFx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/DataBinderMapperImpl.class */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f96214a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/DataBinderMapperImpl$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseArray<String> f96215a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(182);
            f96215a = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "allTagDataList");
            sparseArray.put(2, "animSurpriseEvent");
            sparseArray.put(3, "animSurpriseState");
            sparseArray.put(4, "announcementContent");
            sparseArray.put(5, "announcementTitle");
            sparseArray.put(6, "backImageUrl");
            sparseArray.put(7, "backVisible");
            sparseArray.put(8, "background");
            sparseArray.put(9, "backgroundColor");
            sparseArray.put(10, "backgroundDrawable");
            sparseArray.put(11, "backgroundTranslucent");
            sparseArray.put(12, "backgroundUrl");
            sparseArray.put(13, "badgeText");
            sparseArray.put(14, "badgeVisibility");
            sparseArray.put(15, "bgColor");
            sparseArray.put(16, "bgImageUrl");
            sparseArray.put(17, "bgImageVisible");
            sparseArray.put(18, "bitmapTransformation");
            sparseArray.put(19, "blurCoverUrl");
            sparseArray.put(20, "bottomDisplay1");
            sparseArray.put(21, "bottomDisplay2");
            sparseArray.put(22, "bottomDisplay3");
            sparseArray.put(23, "bottomDisplay4");
            sparseArray.put(24, "btnBgColor");
            sparseArray.put(25, "btnTextColor");
            sparseArray.put(26, "btnTryAgainText");
            sparseArray.put(27, "buttonBackground");
            sparseArray.put(28, "buttonText");
            sparseArray.put(29, "buttonTextColor");
            sparseArray.put(30, "chatHint");
            sparseArray.put(31, "chatPlayerInputHint");
            sparseArray.put(32, "clickListener");
            sparseArray.put(33, "clickable");
            sparseArray.put(34, "constellationAndAge");
            sparseArray.put(35, "constraintSetModifier");
            sparseArray.put(36, "containerHeight");
            sparseArray.put(37, "containerVisible");
            sparseArray.put(38, TextSource.CFG_CONTENT);
            sparseArray.put(39, "cornerBackDrawable");
            sparseArray.put(40, "cornerText");
            sparseArray.put(41, "cornerVisible");
            sparseArray.put(42, "coverHeight");
            sparseArray.put(43, "coverUrl");
            sparseArray.put(44, "coverWidth");
            sparseArray.put(45, "dataList");
            sparseArray.put(46, "descName");
            sparseArray.put(47, "disable");
            sparseArray.put(48, "disableTagTextColor");
            sparseArray.put(49, "downloadable");
            sparseArray.put(50, "emotionBadgeVisible");
            sparseArray.put(51, "emptyType");
            sparseArray.put(52, "endContent");
            sparseArray.put(53, "endIcon");
            sparseArray.put(54, "endIconVisible");
            sparseArray.put(55, "errorImageAlpha");
            sparseArray.put(56, "errorTip");
            sparseArray.put(57, "exposureLayoutInfoReceiver");
            sparseArray.put(58, "followButtonConfig");
            sparseArray.put(59, "guideBarHeight");
            sparseArray.put(60, "guideBarPaddingBottom");
            sparseArray.put(61, "guideBarPaddingTop");
            sparseArray.put(62, "hasAddView");
            sparseArray.put(63, "hasAnnouncement");
            sparseArray.put(64, "hasNext");
            sparseArray.put(65, "hasPendant");
            sparseArray.put(66, "hasPinMsg");
            sparseArray.put(67, "hasTitle");
            sparseArray.put(68, "highPrivilegedUser");
            sparseArray.put(69, "horizontalPadding");
            sparseArray.put(70, "iconTintColor");
            sparseArray.put(71, "iconUrl");
            sparseArray.put(72, "iconVisible");
            sparseArray.put(73, "image");
            sparseArray.put(74, "imageDrawableId");
            sparseArray.put(75, "imageUrl");
            sparseArray.put(76, "immersiveCloseBtnTintColor");
            sparseArray.put(77, "inputBarEnable");
            sparseArray.put(78, "inputText");
            sparseArray.put(79, "isBackVisible");
            sparseArray.put(80, "isCloseVisible");
            sparseArray.put(81, "isFullscreen");
            sparseArray.put(82, "label");
            sparseArray.put(83, "labelVisible");
            sparseArray.put(84, "leftBadgeBackDrawable");
            sparseArray.put(85, "leftBadgeText");
            sparseArray.put(86, "leftBadgeTextColor");
            sparseArray.put(87, "leftBadgeVisible");
            sparseArray.put(88, "leftBtnBackDrawable");
            sparseArray.put(89, "leftBtnIconUrl");
            sparseArray.put(90, "leftBtnVisible");
            sparseArray.put(91, "leftText");
            sparseArray.put(92, "leftTextColor");
            sparseArray.put(93, "levelDrawableId");
            sparseArray.put(94, "limitText");
            sparseArray.put(95, "limitTextColor");
            sparseArray.put(96, "marginTop");
            sparseArray.put(97, "master");
            sparseArray.put(98, "miniPlayerDoubleTapHintVisible");
            sparseArray.put(99, IDeviceColorModule.EDGE_MODE_KEY);
            sparseArray.put(100, "msgContent");
            sparseArray.put(101, "myCard");
            sparseArray.put(102, "needShowEndContainer");
            sparseArray.put(103, "newMsgText");
            sparseArray.put(104, "newPlayerMsgText");
            sparseArray.put(105, "nextSheetVisible");
            sparseArray.put(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_HAND_DET_SCORE_THRESHOLD, "nickTextColor");
            sparseArray.put(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_HAND_TRACK_SCORE_THRESHOLD, "nickTvColor");
            sparseArray.put(108, "nickname");
            sparseArray.put(109, "notice");
            sparseArray.put(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_HAND_SKELETON_THRESHOLD, "noticeTextColor");
            sparseArray.put(CaptionFx.BUBBLEPATH_FIELD_NUMBER, "onErrorCoverClickListener");
            sparseArray.put(112, "onLimitCoverClickListener");
            sparseArray.put(113, "onPositiveClick");
            sparseArray.put(114, "ownerState");
            sparseArray.put(115, "params");
            sparseArray.put(116, "playerContainer");
            sparseArray.put(117, "playerNickTextColor");
            sparseArray.put(118, "positiveBtnText");
            sparseArray.put(119, "quickMsgsVisible");
            sparseArray.put(120, "retryBtnBgColor");
            sparseArray.put(121, "retryBtnJumpLink");
            sparseArray.put(122, "retryBtnText");
            sparseArray.put(SearchBangumiItem.TYPE_FULLNET_TV, "retryBtnTextColor");
            sparseArray.put(SearchBangumiItem.TYPE_FULLNET_VARIETY, "retryBtnVisible");
            sparseArray.put(SearchBangumiItem.TYPE_FULLNET_DOCUMENTARY, "retryText");
            sparseArray.put(SearchBangumiItem.TYPE_FULLNET_MOVIE, "rightBadgeBackDrawable");
            sparseArray.put(SearchBangumiItem.TYPE_FULLNET_BANGUMI, "rightBadgeText");
            sparseArray.put(128, "rightBadgeTextColor");
            sparseArray.put(129, "rightBadgeVisible");
            sparseArray.put(130, "rightBtnBackDrawable");
            sparseArray.put(131, "rightBtnIconUrl");
            sparseArray.put(132, "rightBtnVisible");
            sparseArray.put(133, "rightText");
            sparseArray.put(134, "rightTextColor");
            sparseArray.put(135, "roleTitle");
            sparseArray.put(136, "roleType");
            sparseArray.put(137, "roomMode");
            sparseArray.put(138, "select");
            sparseArray.put(139, "selectDataList");
            sparseArray.put(140, "selectTagBackground");
            sparseArray.put(141, "selectTagTextColor");
            sparseArray.put(142, "selectTitle");
            sparseArray.put(143, "selected");
            sparseArray.put(144, "sexDrawableId");
            sparseArray.put(145, "shieldState");
            sparseArray.put(146, "showingControl");
            sparseArray.put(147, "showingErrorCover");
            sparseArray.put(148, "showingLimitCover");
            sparseArray.put(149, "subtitle");
            sparseArray.put(150, "subtitleColor");
            sparseArray.put(151, "subtitleLeftIconUrl");
            sparseArray.put(152, "subtitleText");
            sparseArray.put(153, "subtitleVisible");
            sparseArray.put(154, "subtitleVo");
            sparseArray.put(155, "tagLineData");
            sparseArray.put(156, "tagText");
            sparseArray.put(157, "tagTitle");
            sparseArray.put(158, "tagTitleColor");
            sparseArray.put(159, "textColor");
            sparseArray.put(160, "time");
            sparseArray.put(161, "timeVisible");
            sparseArray.put(162, "title");
            sparseArray.put(163, "titleCenter");
            sparseArray.put(164, "titleColor");
            sparseArray.put(165, "titleText");
            sparseArray.put(166, "titleVo");
            sparseArray.put(167, "topContainerShow");
            sparseArray.put(168, "unselectedTagBackground");
            sparseArray.put(169, "unselectedTagTextColor");
            sparseArray.put(170, "updateAttention");
            sparseArray.put(171, "updateGuestAttention");
            sparseArray.put(172, "useImmersiveCloseBtn");
            sparseArray.put(173, "value");
            sparseArray.put(174, "videoHeight");
            sparseArray.put(175, "viewModel");
            sparseArray.put(176, "viewModelInner");
            sparseArray.put(177, "vipBadgeVisible");
            sparseArray.put(178, "vipBarVo");
            sparseArray.put(179, "vm");
            sparseArray.put(180, "vvmAdapter");
            sparseArray.put(181, "vvmAdapterInner");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/DataBinderMapperImpl$b.class */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap<String, Integer> f96216a;

        static {
            HashMap<String, Integer> map = new HashMap<>(1);
            f96216a = map;
            map.put("layout/theseus_detail_player_report_half_screen_layout_0", 2131500294);
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(1);
        f96214a = sparseIntArray;
        sparseIntArray.put(2131500294, 1);
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
        arrayList.add(new com.bilibili.lib.bilipay.DataBinderMapperImpl());
        arrayList.add(new com.bilibili.ogv.glue.DataBinderMapperImpl());
        arrayList.add(new com.bilibili.ship.theseus.miniplayer.DataBinderMapperImpl());
        arrayList.add(new com.bilibili.ship.theseus.united.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final String convertBrIdToString(int i7) {
        return a.f96215a.get(i7);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i7) {
        int i8 = f96214a.get(i7);
        if (i8 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        if (i8 != 1) {
            return null;
        }
        if ("layout/theseus_detail_player_report_half_screen_layout_0".equals(tag)) {
            return new C2973l(view, dataBindingComponent);
        }
        throw new IllegalArgumentException(Fp.c.b(tag, "The tag for theseus_detail_player_report_half_screen_layout is invalid. Received: "));
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i7) {
        if (viewArr == null || viewArr.length == 0 || f96214a.get(i7) <= 0 || viewArr[0].getTag() != null) {
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
        Integer num = b.f96216a.get(str);
        if (num != null) {
            iIntValue = num.intValue();
        }
        return iIntValue;
    }
}
