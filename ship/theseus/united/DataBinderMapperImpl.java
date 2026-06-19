package com.bilibili.ship.theseus.united;

import Fp.c;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.alipay.blueshield.IDeviceColorModule;
import com.bilibili.live.streaming.source.TextSource;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.search2.api.SearchBangumiItem;
import com.bilibili.studio.videoeditor.CaptionFx;
import dv0.AbstractC6873k;
import dv0.AbstractC6886x;
import dv0.B0;
import dv0.C6849A;
import dv0.C6851C;
import dv0.C6867h;
import dv0.C6871j;
import dv0.C6877n;
import dv0.C6879p;
import dv0.C6881s;
import dv0.C6883u;
import dv0.C6887y;
import dv0.E;
import dv0.P;
import dv0.t0;
import dv0.v0;
import dv0.x0;
import dv0.z0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/DataBinderMapperImpl.class */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f98724a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/DataBinderMapperImpl$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseArray<String> f98725a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(170);
            f98725a = sparseArray;
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
            sparseArray.put(34, "containerHeight");
            sparseArray.put(35, "containerVisible");
            sparseArray.put(36, TextSource.CFG_CONTENT);
            sparseArray.put(37, "cornerBackDrawable");
            sparseArray.put(38, "cornerText");
            sparseArray.put(39, "cornerVisible");
            sparseArray.put(40, "coverHeight");
            sparseArray.put(41, "coverUrl");
            sparseArray.put(42, "coverWidth");
            sparseArray.put(43, "dataList");
            sparseArray.put(44, "descName");
            sparseArray.put(45, "disable");
            sparseArray.put(46, "disableTagTextColor");
            sparseArray.put(47, "downloadable");
            sparseArray.put(48, "emotionBadgeVisible");
            sparseArray.put(49, "emptyType");
            sparseArray.put(50, "endContent");
            sparseArray.put(51, "endIcon");
            sparseArray.put(52, "endIconVisible");
            sparseArray.put(53, "errorImageAlpha");
            sparseArray.put(54, "errorTip");
            sparseArray.put(55, "exposureLayoutInfoReceiver");
            sparseArray.put(56, "followButtonConfig");
            sparseArray.put(57, "guideBarHeight");
            sparseArray.put(58, "guideBarPaddingBottom");
            sparseArray.put(59, "guideBarPaddingTop");
            sparseArray.put(60, "hasAddView");
            sparseArray.put(61, "hasAnnouncement");
            sparseArray.put(62, "hasPendant");
            sparseArray.put(63, "hasPinMsg");
            sparseArray.put(64, "hasTitle");
            sparseArray.put(65, "highPrivilegedUser");
            sparseArray.put(66, "horizontalPadding");
            sparseArray.put(67, "iconTintColor");
            sparseArray.put(68, "iconUrl");
            sparseArray.put(69, "iconVisible");
            sparseArray.put(70, "image");
            sparseArray.put(71, "imageDrawableId");
            sparseArray.put(72, "imageUrl");
            sparseArray.put(73, "immersiveCloseBtnTintColor");
            sparseArray.put(74, "inputBarEnable");
            sparseArray.put(75, "inputText");
            sparseArray.put(76, "isBackVisible");
            sparseArray.put(77, "isCloseVisible");
            sparseArray.put(78, "isFullscreen");
            sparseArray.put(79, "label");
            sparseArray.put(80, "labelVisible");
            sparseArray.put(81, "leftBadgeBackDrawable");
            sparseArray.put(82, "leftBadgeText");
            sparseArray.put(83, "leftBadgeTextColor");
            sparseArray.put(84, "leftBadgeVisible");
            sparseArray.put(85, "leftBtnBackDrawable");
            sparseArray.put(86, "leftBtnIconUrl");
            sparseArray.put(87, "leftBtnVisible");
            sparseArray.put(88, "leftText");
            sparseArray.put(89, "leftTextColor");
            sparseArray.put(90, "levelDrawableId");
            sparseArray.put(91, "marginTop");
            sparseArray.put(92, "master");
            sparseArray.put(93, IDeviceColorModule.EDGE_MODE_KEY);
            sparseArray.put(94, "msgContent");
            sparseArray.put(95, "myCard");
            sparseArray.put(96, "needShowEndContainer");
            sparseArray.put(97, "newMsgText");
            sparseArray.put(98, "newPlayerMsgText");
            sparseArray.put(99, "nickTextColor");
            sparseArray.put(100, "nickTvColor");
            sparseArray.put(101, "nickname");
            sparseArray.put(102, "notice");
            sparseArray.put(103, "noticeTextColor");
            sparseArray.put(104, "onPositiveClick");
            sparseArray.put(105, "ownerState");
            sparseArray.put(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_HAND_DET_SCORE_THRESHOLD, "params");
            sparseArray.put(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_HAND_TRACK_SCORE_THRESHOLD, "playerContainer");
            sparseArray.put(108, "playerNickTextColor");
            sparseArray.put(109, "positiveBtnText");
            sparseArray.put(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_HAND_SKELETON_THRESHOLD, "quickMsgsVisible");
            sparseArray.put(CaptionFx.BUBBLEPATH_FIELD_NUMBER, "retryBtnBgColor");
            sparseArray.put(112, "retryBtnJumpLink");
            sparseArray.put(113, "retryBtnText");
            sparseArray.put(114, "retryBtnTextColor");
            sparseArray.put(115, "retryBtnVisible");
            sparseArray.put(116, "retryText");
            sparseArray.put(117, "rightBadgeBackDrawable");
            sparseArray.put(118, "rightBadgeText");
            sparseArray.put(119, "rightBadgeTextColor");
            sparseArray.put(120, "rightBadgeVisible");
            sparseArray.put(121, "rightBtnBackDrawable");
            sparseArray.put(122, "rightBtnIconUrl");
            sparseArray.put(SearchBangumiItem.TYPE_FULLNET_TV, "rightBtnVisible");
            sparseArray.put(SearchBangumiItem.TYPE_FULLNET_VARIETY, "rightText");
            sparseArray.put(SearchBangumiItem.TYPE_FULLNET_DOCUMENTARY, "rightTextColor");
            sparseArray.put(SearchBangumiItem.TYPE_FULLNET_MOVIE, "roleTitle");
            sparseArray.put(SearchBangumiItem.TYPE_FULLNET_BANGUMI, "roleType");
            sparseArray.put(128, "roomMode");
            sparseArray.put(129, "select");
            sparseArray.put(130, "selectDataList");
            sparseArray.put(131, "selectTagBackground");
            sparseArray.put(132, "selectTagTextColor");
            sparseArray.put(133, "selectTitle");
            sparseArray.put(134, "selected");
            sparseArray.put(135, "sexDrawableId");
            sparseArray.put(136, "shieldState");
            sparseArray.put(137, "subtitle");
            sparseArray.put(138, "subtitleColor");
            sparseArray.put(139, "subtitleLeftIconUrl");
            sparseArray.put(140, "subtitleText");
            sparseArray.put(141, "subtitleVisible");
            sparseArray.put(142, "subtitleVo");
            sparseArray.put(143, "tagLineData");
            sparseArray.put(144, "tagText");
            sparseArray.put(145, "tagTitle");
            sparseArray.put(146, "tagTitleColor");
            sparseArray.put(147, "textColor");
            sparseArray.put(148, "time");
            sparseArray.put(149, "timeVisible");
            sparseArray.put(150, "title");
            sparseArray.put(151, "titleCenter");
            sparseArray.put(152, "titleColor");
            sparseArray.put(153, "titleText");
            sparseArray.put(154, "titleVo");
            sparseArray.put(155, "topContainerShow");
            sparseArray.put(156, "unselectedTagBackground");
            sparseArray.put(157, "unselectedTagTextColor");
            sparseArray.put(158, "updateAttention");
            sparseArray.put(159, "updateGuestAttention");
            sparseArray.put(160, "useImmersiveCloseBtn");
            sparseArray.put(161, "value");
            sparseArray.put(162, "videoHeight");
            sparseArray.put(163, "viewModel");
            sparseArray.put(164, "viewModelInner");
            sparseArray.put(165, "vipBadgeVisible");
            sparseArray.put(166, "vipBarVo");
            sparseArray.put(167, "vm");
            sparseArray.put(168, "vvmAdapter");
            sparseArray.put(169, "vvmAdapterInner");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/DataBinderMapperImpl$b.class */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap<String, Integer> f98726a;

        static {
            HashMap<String, Integer> map = new HashMap<>(17);
            f98726a = map;
            p2.b.a(2131500284, map, "layout/theseus_detail_common_float_layer_0", 2131500285, "layout/theseus_detail_guide_strip_0");
            p2.b.a(2131500286, map, "layout/theseus_detail_intro_tab_item_0", 2131500289, "layout/theseus_detail_page_error_0");
            p2.b.a(2131500290, map, "layout/theseus_detail_page_vip_bar_0", 2131500292, "layout/theseus_detail_player_error_layout_0");
            p2.b.a(2131500295, map, "layout/theseus_detail_related_resource_card_0", 2131500344, "layout/theseus_inserted_banner_0");
            p2.b.a(2131500345, map, "layout/theseus_inserted_banner_column_0", 2131500346, "layout/theseus_inserted_banner_row_0");
            p2.b.a(2131500347, map, "layout/theseus_inserted_banner_single_0", 2131500372, "layout/theseus_module_king_position_cache_0");
            p2.b.a(2131501249, map, "layout/theseus_restriction_horizontal_image_0", 2131501250, "layout/theseus_restriction_simple_text_0");
            p2.b.a(2131501251, map, "layout/theseus_restriction_universal_intercept_0", 2131501252, "layout/theseus_restriction_vertical_text_horizontal_0");
            map.put("layout/theseus_restriction_vertical_text_vertical_0", 2131501253);
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(17);
        f98724a = sparseIntArray;
        sparseIntArray.put(2131500284, 1);
        sparseIntArray.put(2131500285, 2);
        sparseIntArray.put(2131500286, 3);
        sparseIntArray.put(2131500289, 4);
        sparseIntArray.put(2131500290, 5);
        sparseIntArray.put(2131500292, 6);
        sparseIntArray.put(2131500295, 7);
        sparseIntArray.put(2131500344, 8);
        sparseIntArray.put(2131500345, 9);
        sparseIntArray.put(2131500346, 10);
        sparseIntArray.put(2131500347, 11);
        sparseIntArray.put(2131500372, 12);
        sparseIntArray.put(2131501249, 13);
        sparseIntArray.put(2131501250, 14);
        sparseIntArray.put(2131501251, 15);
        sparseIntArray.put(2131501252, 16);
        sparseIntArray.put(2131501253, 17);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(8);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.bilibili.app.comment2.DataBinderMapperImpl());
        arrayList.add(new com.bilibili.app.gemini.DataBinderMapperImpl());
        arrayList.add(new com.bilibili.app.gemini.base.DataBinderMapperImpl());
        arrayList.add(new com.bilibili.app.gemini.ui.DataBinderMapperImpl());
        arrayList.add(new com.bilibili.app.screen.adjust.DataBinderMapperImpl());
        arrayList.add(new com.bilibili.lib.bilipay.DataBinderMapperImpl());
        arrayList.add(new com.bilibili.ogv.glue.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final String convertBrIdToString(int i7) {
        return a.f98725a.get(i7);
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [androidx.databinding.ViewDataBinding, dv0.k, dv0.l] */
    /* JADX WARN: Type inference failed for: r0v54, types: [androidx.databinding.ViewDataBinding, dv0.x, dv0.y] */
    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i7) {
        int i8 = f98724a.get(i7);
        if (i8 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        switch (i8) {
            case 1:
                if ("layout/theseus_detail_common_float_layer_0".equals(tag)) {
                    return new C6867h(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for theseus_detail_common_float_layer is invalid. Received: "));
            case 2:
                if ("layout/theseus_detail_guide_strip_0".equals(tag)) {
                    return new C6871j(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for theseus_detail_guide_strip is invalid. Received: "));
            case 3:
                if (!"layout/theseus_detail_intro_tab_item_0".equals(tag)) {
                    throw new IllegalArgumentException(c.b(tag, "The tag for theseus_detail_intro_tab_item is invalid. Received: "));
                }
                Object[] objArrMapBindings = ViewDataBinding.mapBindings(dataBindingComponent, view, 2, (ViewDataBinding.i) null, (SparseIntArray) null);
                ?? abstractC6873k = new AbstractC6873k(dataBindingComponent, view, (TextView) objArrMapBindings[1]);
                abstractC6873k.f117039y = -1L;
                ((ConstraintLayout) objArrMapBindings[0]).setTag(null);
                abstractC6873k.f117033w.setTag(null);
                abstractC6873k.setRootTag(view);
                abstractC6873k.invalidateAll();
                return abstractC6873k;
            case 4:
                if ("layout/theseus_detail_page_error_0".equals(tag)) {
                    return new C6877n(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for theseus_detail_page_error is invalid. Received: "));
            case 5:
                if ("layout/theseus_detail_page_vip_bar_0".equals(tag)) {
                    return new C6879p(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for theseus_detail_page_vip_bar is invalid. Received: "));
            case 6:
                if ("layout/theseus_detail_player_error_layout_0".equals(tag)) {
                    return new C6881s(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for theseus_detail_player_error_layout is invalid. Received: "));
            case 7:
                if ("layout/theseus_detail_related_resource_card_0".equals(tag)) {
                    return new C6883u(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for theseus_detail_related_resource_card is invalid. Received: "));
            case 8:
                if (!"layout/theseus_inserted_banner_0".equals(tag)) {
                    throw new IllegalArgumentException(c.b(tag, "The tag for theseus_inserted_banner is invalid. Received: "));
                }
                Object[] objArrMapBindings2 = ViewDataBinding.mapBindings(dataBindingComponent, view, 3, (ViewDataBinding.i) null, C6887y.f117177B);
                ?? abstractC6886x = new AbstractC6886x(dataBindingComponent, view, (ConstraintLayout) objArrMapBindings2[0], (RecyclerView) objArrMapBindings2[2], (TextView) objArrMapBindings2[1]);
                abstractC6886x.f117178A = -1L;
                abstractC6886x.f117170w.setTag(null);
                abstractC6886x.f117172y.setTag(null);
                abstractC6886x.setRootTag(view);
                abstractC6886x.invalidateAll();
                return abstractC6886x;
            case 9:
                if ("layout/theseus_inserted_banner_column_0".equals(tag)) {
                    return new C6849A(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for theseus_inserted_banner_column is invalid. Received: "));
            case 10:
                if ("layout/theseus_inserted_banner_row_0".equals(tag)) {
                    return new C6851C(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for theseus_inserted_banner_row is invalid. Received: "));
            case 11:
                if ("layout/theseus_inserted_banner_single_0".equals(tag)) {
                    return new E(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for theseus_inserted_banner_single is invalid. Received: "));
            case 12:
                if ("layout/theseus_module_king_position_cache_0".equals(tag)) {
                    return new P(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for theseus_module_king_position_cache is invalid. Received: "));
            case 13:
                if ("layout/theseus_restriction_horizontal_image_0".equals(tag)) {
                    return new t0(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for theseus_restriction_horizontal_image is invalid. Received: "));
            case 14:
                if ("layout/theseus_restriction_simple_text_0".equals(tag)) {
                    return new v0(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for theseus_restriction_simple_text is invalid. Received: "));
            case 15:
                if ("layout/theseus_restriction_universal_intercept_0".equals(tag)) {
                    return new x0(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for theseus_restriction_universal_intercept is invalid. Received: "));
            case 16:
                if ("layout/theseus_restriction_vertical_text_horizontal_0".equals(tag)) {
                    return new z0(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for theseus_restriction_vertical_text_horizontal is invalid. Received: "));
            case 17:
                if ("layout/theseus_restriction_vertical_text_vertical_0".equals(tag)) {
                    return new B0(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for theseus_restriction_vertical_text_vertical is invalid. Received: "));
            default:
                return null;
        }
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i7) {
        if (viewArr == null || viewArr.length == 0 || f98724a.get(i7) <= 0 || viewArr[0].getTag() != null) {
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
        Integer num = b.f98726a.get(str);
        if (num != null) {
            iIntValue = num.intValue();
        }
        return iIntValue;
    }
}
