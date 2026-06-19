package com.bilibili.ship.theseus.cheese;

import Fp.c;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.alipay.blueshield.IDeviceColorModule;
import com.bilibili.live.streaming.source.TextSource;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.search2.api.SearchBangumiItem;
import com.bilibili.studio.videoeditor.CaptionFx;
import fu0.V;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/DataBinderMapperImpl.class */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f88977a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/DataBinderMapperImpl$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseArray<String> f88978a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(180);
            f88978a = sparseArray;
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
            sparseArray.put(19, "bottomDisplay1");
            sparseArray.put(20, "bottomDisplay2");
            sparseArray.put(21, "bottomDisplay3");
            sparseArray.put(22, "bottomDisplay4");
            sparseArray.put(23, "btnBgColor");
            sparseArray.put(24, "btnTextColor");
            sparseArray.put(25, "btnTryAgainText");
            sparseArray.put(26, "buttonBackground");
            sparseArray.put(27, "buttonText");
            sparseArray.put(28, "buttonTextColor");
            sparseArray.put(29, "chatHint");
            sparseArray.put(30, "chatPlayerInputHint");
            sparseArray.put(31, "clickListener");
            sparseArray.put(32, "clickable");
            sparseArray.put(33, "constellationAndAge");
            sparseArray.put(34, "constraintSetModifier");
            sparseArray.put(35, "containerHeight");
            sparseArray.put(36, "containerVisible");
            sparseArray.put(37, TextSource.CFG_CONTENT);
            sparseArray.put(38, "cornerBackDrawable");
            sparseArray.put(39, "cornerText");
            sparseArray.put(40, "cornerVisible");
            sparseArray.put(41, "coverHeight");
            sparseArray.put(42, "coverUrl");
            sparseArray.put(43, "coverWidth");
            sparseArray.put(44, "dataList");
            sparseArray.put(45, "descName");
            sparseArray.put(46, "disable");
            sparseArray.put(47, "disableTagTextColor");
            sparseArray.put(48, "downloadable");
            sparseArray.put(49, "emotionBadgeVisible");
            sparseArray.put(50, "emptyType");
            sparseArray.put(51, "endContent");
            sparseArray.put(52, "endIcon");
            sparseArray.put(53, "endIconVisible");
            sparseArray.put(54, "errorImageAlpha");
            sparseArray.put(55, "errorTip");
            sparseArray.put(56, "exposureLayoutInfoReceiver");
            sparseArray.put(57, "followButtonConfig");
            sparseArray.put(58, "guideBarHeight");
            sparseArray.put(59, "guideBarPaddingBottom");
            sparseArray.put(60, "guideBarPaddingTop");
            sparseArray.put(61, "hasAddView");
            sparseArray.put(62, "hasAnnouncement");
            sparseArray.put(63, "hasPendant");
            sparseArray.put(64, "hasPinMsg");
            sparseArray.put(65, "hasTitle");
            sparseArray.put(66, "highPrivilegedUser");
            sparseArray.put(67, "horizontalPadding");
            sparseArray.put(68, "iconTintColor");
            sparseArray.put(69, "iconUrl");
            sparseArray.put(70, "iconVisible");
            sparseArray.put(71, "image");
            sparseArray.put(72, "imageDrawableId");
            sparseArray.put(73, "imageUrl");
            sparseArray.put(74, "immersiveCloseBtnTintColor");
            sparseArray.put(75, "inputBarEnable");
            sparseArray.put(76, "inputText");
            sparseArray.put(77, "isBackVisible");
            sparseArray.put(78, "isCloseVisible");
            sparseArray.put(79, "isFullscreen");
            sparseArray.put(80, "label");
            sparseArray.put(81, "labelVisible");
            sparseArray.put(82, "leftBadgeBackDrawable");
            sparseArray.put(83, "leftBadgeText");
            sparseArray.put(84, "leftBadgeTextColor");
            sparseArray.put(85, "leftBadgeVisible");
            sparseArray.put(86, "leftBtnBackDrawable");
            sparseArray.put(87, "leftBtnIconUrl");
            sparseArray.put(88, "leftBtnVisible");
            sparseArray.put(89, "leftText");
            sparseArray.put(90, "leftTextColor");
            sparseArray.put(91, "levelDrawableId");
            sparseArray.put(92, "limitText");
            sparseArray.put(93, "limitTextColor");
            sparseArray.put(94, "marginTop");
            sparseArray.put(95, "master");
            sparseArray.put(96, "miniPlayerDoubleTapHintVisible");
            sparseArray.put(97, IDeviceColorModule.EDGE_MODE_KEY);
            sparseArray.put(98, "msgContent");
            sparseArray.put(99, "myCard");
            sparseArray.put(100, "needShowEndContainer");
            sparseArray.put(101, "newMsgText");
            sparseArray.put(102, "newPlayerMsgText");
            sparseArray.put(103, "nextSheetVisible");
            sparseArray.put(104, "nickTextColor");
            sparseArray.put(105, "nickTvColor");
            sparseArray.put(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_HAND_DET_SCORE_THRESHOLD, "nickname");
            sparseArray.put(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_HAND_TRACK_SCORE_THRESHOLD, "notice");
            sparseArray.put(108, "noticeTextColor");
            sparseArray.put(109, "onErrorCoverClickListener");
            sparseArray.put(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_HAND_SKELETON_THRESHOLD, "onLimitCoverClickListener");
            sparseArray.put(CaptionFx.BUBBLEPATH_FIELD_NUMBER, "onPositiveClick");
            sparseArray.put(112, "ownerState");
            sparseArray.put(113, "params");
            sparseArray.put(114, "playerContainer");
            sparseArray.put(115, "playerNickTextColor");
            sparseArray.put(116, "positiveBtnText");
            sparseArray.put(117, "quickMsgsVisible");
            sparseArray.put(118, "retryBtnBgColor");
            sparseArray.put(119, "retryBtnJumpLink");
            sparseArray.put(120, "retryBtnText");
            sparseArray.put(121, "retryBtnTextColor");
            sparseArray.put(122, "retryBtnVisible");
            sparseArray.put(SearchBangumiItem.TYPE_FULLNET_TV, "retryText");
            sparseArray.put(SearchBangumiItem.TYPE_FULLNET_VARIETY, "rightBadgeBackDrawable");
            sparseArray.put(SearchBangumiItem.TYPE_FULLNET_DOCUMENTARY, "rightBadgeText");
            sparseArray.put(SearchBangumiItem.TYPE_FULLNET_MOVIE, "rightBadgeTextColor");
            sparseArray.put(SearchBangumiItem.TYPE_FULLNET_BANGUMI, "rightBadgeVisible");
            sparseArray.put(128, "rightBtnBackDrawable");
            sparseArray.put(129, "rightBtnIconUrl");
            sparseArray.put(130, "rightBtnVisible");
            sparseArray.put(131, "rightText");
            sparseArray.put(132, "rightTextColor");
            sparseArray.put(133, "roleTitle");
            sparseArray.put(134, "roleType");
            sparseArray.put(135, "roomMode");
            sparseArray.put(136, "select");
            sparseArray.put(137, "selectDataList");
            sparseArray.put(138, "selectTagBackground");
            sparseArray.put(139, "selectTagTextColor");
            sparseArray.put(140, "selectTitle");
            sparseArray.put(141, "selected");
            sparseArray.put(142, "sexDrawableId");
            sparseArray.put(143, "shieldState");
            sparseArray.put(144, "showingControl");
            sparseArray.put(145, "showingErrorCover");
            sparseArray.put(146, "showingLimitCover");
            sparseArray.put(147, "subtitle");
            sparseArray.put(148, "subtitleColor");
            sparseArray.put(149, "subtitleLeftIconUrl");
            sparseArray.put(150, "subtitleText");
            sparseArray.put(151, "subtitleVisible");
            sparseArray.put(152, "subtitleVo");
            sparseArray.put(153, "tagLineData");
            sparseArray.put(154, "tagText");
            sparseArray.put(155, "tagTitle");
            sparseArray.put(156, "tagTitleColor");
            sparseArray.put(157, "textColor");
            sparseArray.put(158, "time");
            sparseArray.put(159, "timeVisible");
            sparseArray.put(160, "title");
            sparseArray.put(161, "titleCenter");
            sparseArray.put(162, "titleColor");
            sparseArray.put(163, "titleText");
            sparseArray.put(164, "titleVo");
            sparseArray.put(165, "topContainerShow");
            sparseArray.put(166, "unselectedTagBackground");
            sparseArray.put(167, "unselectedTagTextColor");
            sparseArray.put(168, "updateAttention");
            sparseArray.put(169, "updateGuestAttention");
            sparseArray.put(170, "useImmersiveCloseBtn");
            sparseArray.put(171, "value");
            sparseArray.put(172, "videoHeight");
            sparseArray.put(173, "viewModel");
            sparseArray.put(174, "viewModelInner");
            sparseArray.put(175, "vipBadgeVisible");
            sparseArray.put(176, "vipBarVo");
            sparseArray.put(177, "vm");
            sparseArray.put(178, "vvmAdapter");
            sparseArray.put(179, "vvmAdapterInner");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/DataBinderMapperImpl$b.class */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap<String, Integer> f88979a;

        static {
            HashMap<String, Integer> map = new HashMap<>(1);
            f88979a = map;
            map.put("layout/theseus_detail_universal_tab_item_0", 2131500296);
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(1);
        f88977a = sparseIntArray;
        sparseIntArray.put(2131500296, 1);
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
        arrayList.add(new com.bilibili.cheese.pay.DataBinderMapperImpl());
        arrayList.add(new com.bilibili.ogv.glue.DataBinderMapperImpl());
        arrayList.add(new com.bilibili.ship.theseus.miniplayer.DataBinderMapperImpl());
        arrayList.add(new com.bilibili.ship.theseus.united.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final String convertBrIdToString(int i7) {
        return a.f88978a.get(i7);
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [androidx.databinding.ViewDataBinding, fu0.V, fu0.W] */
    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i7) {
        int i8 = f88977a.get(i7);
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
        if (!"layout/theseus_detail_universal_tab_item_0".equals(tag)) {
            throw new IllegalArgumentException(c.b(tag, "The tag for theseus_detail_universal_tab_item is invalid. Received: "));
        }
        Object[] objArrMapBindings = ViewDataBinding.mapBindings(dataBindingComponent, view, 2, (ViewDataBinding.i) null, (SparseIntArray) null);
        ?? v7 = new V(dataBindingComponent, view, (TextView) objArrMapBindings[1]);
        v7.f119511y = -1L;
        ((ConstraintLayout) objArrMapBindings[0]).setTag(null);
        v7.f119509w.setTag(null);
        v7.setRootTag(view);
        v7.invalidateAll();
        return v7;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i7) {
        if (viewArr == null || viewArr.length == 0 || f88977a.get(i7) <= 0 || viewArr[0].getTag() != null) {
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
        Integer num = b.f88979a.get(str);
        if (num != null) {
            iIntValue = num.intValue();
        }
        return iIntValue;
    }
}
