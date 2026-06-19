package com.bilibili.search2.result.vertical.live.report;

import G0.b;
import Mt0.a;
import android.net.Uri;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.D;
import androidx.room.B;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.biligame.bean.GameCenterBottomTabConfig;
import com.bilibili.lib.sharewrapper.basic.ThirdPartyExtraBuilder;
import com.bilibili.search2.result.vertical.live.c;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.tencent.map.geolocation.TencentLocation;
import kotlin.Deprecated;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sg.s;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/vertical/live/report/LiveReportClickEvent.class */
@Deprecated(message = "")
@StabilityInferred(parameters = 0)
public final class LiveReportClickEvent extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public String f88587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public String f88588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f88589c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/vertical/live/report/LiveReportClickEvent$GuardLotteryMsg.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class GuardLotteryMsg extends LiveRoomBaseMsg {
        public static final int $stable = 8;

        @JSONField(name = "click_from")
        private int clickFrom;

        @JSONField(name = "item_id")
        @Nullable
        private String itemId;

        @JSONField(name = "left_cnt")
        @Nullable
        private String leftCnt;

        @JSONField(name = "reward_type")
        private int rewardType;

        @NotNull
        public final GuardLotteryMsg clickFrom(int i7) {
            this.clickFrom = i7;
            return this;
        }

        public final int getClickFrom() {
            return this.clickFrom;
        }

        @Nullable
        public final String getItemId() {
            return this.itemId;
        }

        @Nullable
        public final String getLeftCnt() {
            return this.leftCnt;
        }

        public final int getRewardType() {
            return this.rewardType;
        }

        @NotNull
        public final GuardLotteryMsg itemId(@Nullable String str) {
            this.itemId = str;
            return this;
        }

        @NotNull
        public final GuardLotteryMsg leftCnt(@Nullable String str) {
            this.leftCnt = str;
            return this;
        }

        @NotNull
        public final GuardLotteryMsg rewardType(int i7) {
            this.rewardType = i7;
            return this;
        }

        public final void setClickFrom(int i7) {
            this.clickFrom = i7;
        }

        public final void setItemId(@Nullable String str) {
            this.itemId = str;
        }

        public final void setLeftCnt(@Nullable String str) {
            this.leftCnt = str;
        }

        public final void setRewardType(int i7) {
            this.rewardType = i7;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/vertical/live/report/LiveReportClickEvent$GuardMsg.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class GuardMsg extends LiveRoomBaseMsg {
        public static final int $stable = 8;

        @JSONField(name = "show_trigger")
        private int showTrigger;

        public final int getShowTrigger() {
            return this.showTrigger;
        }

        public final void setShowTrigger(int i7) {
            this.showTrigger = i7;
        }

        @NotNull
        public final GuardMsg showTrigger(int i7) {
            this.showTrigger = i7;
            return this;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/vertical/live/report/LiveReportClickEvent$LiveRoomBaseMsg.class */
    @Deprecated(message = "请使用LiveRoomBaseViewModel的扩展属性liveRoomReportBaseMsg")
    @StabilityInferred(parameters = 0)
    @Keep
    public static class LiveRoomBaseMsg {
        public static final int $stable = 8;

        @JSONField(name = "area_id")
        private int areaId;

        @JSONField(name = "room_id")
        private int roomId;

        @JSONField(name = "screen_status")
        private int screenStatus;

        @JSONField(name = NotificationCompat.CATEGORY_STATUS)
        private int status;

        @JSONField(name = "subarea_id")
        private int subareaId;

        @NotNull
        public final LiveRoomBaseMsg areaId(int i7) {
            this.areaId = i7;
            return this;
        }

        public final int getAreaId() {
            return this.areaId;
        }

        public final int getRoomId() {
            return this.roomId;
        }

        public final int getScreenStatus() {
            return this.screenStatus;
        }

        public final int getStatus() {
            return this.status;
        }

        public final int getSubareaId() {
            return this.subareaId;
        }

        @NotNull
        public final LiveRoomBaseMsg roomId(int i7) {
            this.roomId = i7;
            return this;
        }

        @NotNull
        public final LiveRoomBaseMsg screenStatus(int i7) {
            this.screenStatus = i7;
            return this;
        }

        public final void setAreaId(int i7) {
            this.areaId = i7;
        }

        public final void setRoomId(int i7) {
            this.roomId = i7;
        }

        public final void setScreenStatus(int i7) {
            this.screenStatus = i7;
        }

        public final void setStatus(int i7) {
            this.status = i7;
        }

        public final void setSubareaId(int i7) {
            this.subareaId = i7;
        }

        @NotNull
        public final LiveRoomBaseMsg status(int i7) {
            this.status = i7;
            return this;
        }

        @NotNull
        public final LiveRoomBaseMsg subareaId(int i7) {
            this.subareaId = i7;
            return this;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/vertical/live/report/LiveReportClickEvent$LotteryMsg.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class LotteryMsg {
        public static final int $stable = 8;

        @JSONField(name = "box_type")
        @Nullable
        private String mBoxType;

        @JSONField(name = "elp_count")
        @Nullable
        private Integer mElpCount;

        @JSONField(name = "payflow_id")
        @Nullable
        private Long mPayFlowId;

        @JSONField(name = "pk_id")
        @Nullable
        private Integer mPkId;

        @JSONField(name = "screen_status")
        @Nullable
        private Integer mScreenStatus;

        @NotNull
        public final LotteryMsg boxType(@Nullable String str) {
            this.mBoxType = str;
            return this;
        }

        @NotNull
        public final LotteryMsg elpCount(int i7) {
            this.mElpCount = Integer.valueOf(i7);
            return this;
        }

        @Nullable
        public final String getMBoxType() {
            return this.mBoxType;
        }

        @Nullable
        public final Integer getMElpCount() {
            return this.mElpCount;
        }

        @Nullable
        public final Long getMPayFlowId() {
            return this.mPayFlowId;
        }

        @Nullable
        public final Integer getMPkId() {
            return this.mPkId;
        }

        @Nullable
        public final Integer getMScreenStatus() {
            return this.mScreenStatus;
        }

        @NotNull
        public final LotteryMsg payFlowId(@Nullable Long l7) {
            this.mPayFlowId = l7;
            return this;
        }

        @NotNull
        public final LotteryMsg pkId(int i7) {
            this.mPkId = Integer.valueOf(i7);
            return this;
        }

        public final void setMBoxType(@Nullable String str) {
            this.mBoxType = str;
        }

        public final void setMElpCount(@Nullable Integer num) {
            this.mElpCount = num;
        }

        public final void setMPayFlowId(@Nullable Long l7) {
            this.mPayFlowId = l7;
        }

        public final void setMPkId(@Nullable Integer num) {
            this.mPkId = num;
        }

        public final void setMScreenStatus(@Nullable Integer num) {
            this.mScreenStatus = num;
        }

        @NotNull
        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder(ReporterMap.LEFT_BRACES);
            Integer num = this.mScreenStatus;
            sb.append(num == null ? "" : s.a(num, "screen_status:", ReporterMap.SEMICOLON));
            Integer num2 = this.mElpCount;
            sb.append(num2 == null ? "" : s.a(num2, "elp_count:", ReporterMap.SEMICOLON));
            Long l7 = this.mPayFlowId;
            if (l7 == null) {
                str = "";
            } else {
                str = "payflow_id:" + l7 + ReporterMap.SEMICOLON;
            }
            sb.append(str);
            String str2 = this.mBoxType;
            sb.append(str2 == null ? "" : android.support.v4.media.a.a("box_type:", str2, ReporterMap.SEMICOLON));
            Integer num3 = this.mPkId;
            return C8770a.a(sb, num3 == null ? "" : s.a(num3, "pk_id:", ReporterMap.SEMICOLON), ReporterMap.RIGHT_BRACES);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/vertical/live/report/LiveReportClickEvent$Msg1.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class Msg1 {
        public static final int $stable = 8;

        @JSONField(name = GameCenterBottomTabConfig.TAB_TYPE_ACT)
        @Nullable
        private String activity;

        @JSONField(name = "boxtype")
        @Nullable
        private String boxtype;

        @JSONField(name = TencentLocation.EXTRA_DIRECTION)
        @Nullable
        private Integer direction;

        /* JADX INFO: renamed from: go, reason: collision with root package name */
        @JSONField(name = "go")
        @Nullable
        private String f88590go;

        @JSONField(name = "jumpfrom")
        @Nullable
        private Integer jumpFrom;

        @JSONField(name = EditCustomizeSticker.TAG_MID)
        @Nullable
        private Long mid;

        @JSONField(name = "pk_id")
        @Nullable
        private Integer pk_id;

        @JSONField(name = ThirdPartyExtraBuilder.KEY_RESULT)
        @Nullable
        private String result;

        @JSONField(name = "roomid")
        @Nullable
        private Integer roomid;

        @JSONField(name = "screen_status")
        @Nullable
        private Integer screen_status;

        @JSONField(name = "state")
        @Nullable
        private String state;

        @JSONField(name = "subarea")
        @Nullable
        private Integer subarea;

        @JSONField(name = "switch")
        @Nullable
        private String switchSet;

        @JSONField(name = "up_id")
        @Nullable
        private Long up_id;

        @NotNull
        public final Msg1 activity(@Nullable String str) {
            this.activity = str;
            return this;
        }

        @NotNull
        public final Msg1 boxType(@Nullable String str) {
            this.boxtype = str;
            return this;
        }

        @NotNull
        public final Msg1 direction(int i7) {
            this.direction = Integer.valueOf(i7);
            return this;
        }

        @Nullable
        public final String getActivity() {
            return this.activity;
        }

        @Nullable
        public final String getBoxtype() {
            return this.boxtype;
        }

        @Nullable
        public final Integer getDirection() {
            return this.direction;
        }

        @Nullable
        public final String getGo() {
            return this.f88590go;
        }

        @Nullable
        public final Integer getJumpFrom() {
            return this.jumpFrom;
        }

        @Nullable
        public final Long getMid() {
            return this.mid;
        }

        @Nullable
        public final Integer getPk_id() {
            return this.pk_id;
        }

        @Nullable
        public final String getResult() {
            return this.result;
        }

        @Nullable
        public final Integer getRoomid() {
            return this.roomid;
        }

        @Nullable
        public final Integer getScreen_status() {
            return this.screen_status;
        }

        @Nullable
        public final String getState() {
            return this.state;
        }

        @Nullable
        public final Integer getSubarea() {
            return this.subarea;
        }

        @Nullable
        public final String getSwitchSet() {
            return this.switchSet;
        }

        @Nullable
        public final Long getUp_id() {
            return this.up_id;
        }

        @NotNull
        public final Msg1 jumpFrom(int i7) {
            this.jumpFrom = Integer.valueOf(i7);
            return this;
        }

        @NotNull
        public final Msg1 mid(long j7) {
            this.mid = Long.valueOf(j7);
            return this;
        }

        @NotNull
        public final Msg1 pkId(int i7) {
            this.pk_id = Integer.valueOf(i7);
            return this;
        }

        @NotNull
        public final Msg1 result(@Nullable String str) {
            this.result = str;
            return this;
        }

        @NotNull
        public final Msg1 roomId(int i7) {
            this.roomid = Integer.valueOf(i7);
            return this;
        }

        public final void setActivity(@Nullable String str) {
            this.activity = str;
        }

        public final void setBoxtype(@Nullable String str) {
            this.boxtype = str;
        }

        public final void setDirection(@Nullable Integer num) {
            this.direction = num;
        }

        public final void setGo(@Nullable String str) {
            this.f88590go = str;
        }

        public final void setJumpFrom(@Nullable Integer num) {
            this.jumpFrom = num;
        }

        public final void setMid(@Nullable Long l7) {
            this.mid = l7;
        }

        public final void setPk_id(@Nullable Integer num) {
            this.pk_id = num;
        }

        public final void setResult(@Nullable String str) {
            this.result = str;
        }

        public final void setRoomid(@Nullable Integer num) {
            this.roomid = num;
        }

        public final void setScreen_status(@Nullable Integer num) {
            this.screen_status = num;
        }

        public final void setState(@Nullable String str) {
            this.state = str;
        }

        public final void setSubarea(@Nullable Integer num) {
            this.subarea = num;
        }

        public final void setSwitchSet(@Nullable String str) {
            this.switchSet = str;
        }

        public final void setUp_id(@Nullable Long l7) {
            this.up_id = l7;
        }

        @NotNull
        public final Msg1 sharePlatform(@Nullable String str) {
            this.f88590go = str;
            return this;
        }

        @NotNull
        public final Msg1 state(@Nullable String str) {
            this.state = str;
            return this;
        }

        @NotNull
        public final Msg1 subarea(int i7) {
            this.subarea = Integer.valueOf(i7);
            return this;
        }

        @NotNull
        public final Msg1 switchSet(@Nullable String str) {
            this.switchSet = str;
            return this;
        }

        @NotNull
        public String toString() {
            String str;
            String str2;
            StringBuilder sb = new StringBuilder(ReporterMap.LEFT_BRACES);
            Integer num = this.screen_status;
            sb.append(num == null ? "" : s.a(num, "screen_status:", ReporterMap.SEMICOLON));
            Integer num2 = this.pk_id;
            sb.append(num2 == null ? "" : s.a(num2, "pk_id:", ReporterMap.SEMICOLON));
            String str3 = this.result;
            sb.append(str3 == null ? "" : android.support.v4.media.a.a("result:", str3, ReporterMap.SEMICOLON));
            Integer num3 = this.jumpFrom;
            sb.append(num3 == null ? "" : s.a(num3, "jumpFrom:", ReporterMap.SEMICOLON));
            String str4 = this.state;
            sb.append(str4 == null ? "" : android.support.v4.media.a.a("state:", str4, ReporterMap.SEMICOLON));
            String str5 = this.boxtype;
            sb.append(str5 == null ? "" : android.support.v4.media.a.a("boxtype:", str5, ReporterMap.SEMICOLON));
            String str6 = this.activity;
            sb.append(str6 == null ? "" : android.support.v4.media.a.a("activity:", str6, ReporterMap.SEMICOLON));
            Integer num4 = this.roomid;
            sb.append(num4 == null ? "" : s.a(num4, "roomid:", ReporterMap.SEMICOLON));
            Long l7 = this.up_id;
            if (l7 == null) {
                str = "";
            } else {
                str = "up_id:" + l7 + ReporterMap.SEMICOLON;
            }
            sb.append(str);
            Long l8 = this.mid;
            if (l8 == null) {
                str2 = "";
            } else {
                str2 = "mid:" + l8 + ReporterMap.SEMICOLON;
            }
            sb.append(str2);
            String str7 = this.f88590go;
            sb.append(str7 == null ? "" : android.support.v4.media.a.a("go:", str7, ReporterMap.SEMICOLON));
            String str8 = this.switchSet;
            sb.append(str8 == null ? "" : android.support.v4.media.a.a("switch:", str8, ReporterMap.SEMICOLON));
            Integer num5 = this.direction;
            sb.append(num5 == null ? "" : s.a(num5, "direction:", ReporterMap.SEMICOLON));
            Integer num6 = this.subarea;
            return C8770a.a(sb, num6 == null ? "" : s.a(num6, "subarea:", ReporterMap.SEMICOLON), ReporterMap.RIGHT_BRACES);
        }

        @NotNull
        public final Msg1 upId(long j7) {
            this.up_id = Long.valueOf(j7);
            return this;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/vertical/live/report/LiveReportClickEvent$Msg2.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class Msg2 {
        public static final int $stable = 8;

        @Nullable
        private Integer combo_status;

        @Nullable
        private Integer combos;

        @Nullable
        private String config_id;

        @Nullable
        private String config_ids;

        @Nullable
        private Integer item_id;

        @Nullable
        private String item_ids;

        @Nullable
        private String item_name;

        @Nullable
        private Integer item_position;

        @Nullable
        private String item_price;

        @Nullable
        private Integer item_real_price;

        @Nullable
        private Integer jumpfrom;

        @Nullable
        private Integer pk_id;

        @Nullable
        private Integer room_id;

        @Nullable
        private Integer screen_status;

        @JSONField(name = "send_content")
        @Nullable
        private String sendContent;

        @Nullable
        private Integer success;

        @Nullable
        private String tab;

        @Nullable
        private Integer tab_position;

        @NotNull
        public final Msg2 comboStatus(int i7) {
            this.combo_status = Integer.valueOf(i7);
            return this;
        }

        @NotNull
        public final Msg2 combosNum(int i7) {
            this.combos = Integer.valueOf(i7);
            return this;
        }

        @NotNull
        public final Msg2 configId(@Nullable String str) {
            this.config_id = str;
            return this;
        }

        @NotNull
        public final Msg2 configIds(@Nullable int[] iArr) {
            String string;
            if (iArr == null || iArr.length == 0) {
                string = "0";
            } else {
                int i7 = iArr[0];
                StringBuilder sb = new StringBuilder();
                sb.append(i7);
                string = sb.toString();
            }
            this.config_ids = string;
            return this;
        }

        @Nullable
        public final Integer getCombo_status() {
            return this.combo_status;
        }

        @Nullable
        public final Integer getCombos() {
            return this.combos;
        }

        @Nullable
        public final String getConfig_id() {
            return this.config_id;
        }

        @Nullable
        public final String getConfig_ids() {
            return this.config_ids;
        }

        @Nullable
        public final Integer getItem_id() {
            return this.item_id;
        }

        @Nullable
        public final String getItem_ids() {
            return this.item_ids;
        }

        @Nullable
        public final String getItem_name() {
            return this.item_name;
        }

        @Nullable
        public final Integer getItem_position() {
            return this.item_position;
        }

        @Nullable
        public final String getItem_price() {
            return this.item_price;
        }

        @Nullable
        public final Integer getItem_real_price() {
            return this.item_real_price;
        }

        @Nullable
        public final Integer getJumpfrom() {
            return this.jumpfrom;
        }

        @Nullable
        public final Integer getPk_id() {
            return this.pk_id;
        }

        @Nullable
        public final Integer getRoom_id() {
            return this.room_id;
        }

        @Nullable
        public final Integer getScreen_status() {
            return this.screen_status;
        }

        @Nullable
        public final String getSendContent() {
            return this.sendContent;
        }

        @Nullable
        public final Integer getSuccess() {
            return this.success;
        }

        @Nullable
        public final String getTab() {
            return this.tab;
        }

        @Nullable
        public final Integer getTab_position() {
            return this.tab_position;
        }

        @NotNull
        public final Msg2 itemId(int i7) {
            this.item_id = Integer.valueOf(i7);
            return this;
        }

        @NotNull
        public final Msg2 itemIds(@Nullable int[] iArr) {
            String string;
            if (iArr == null || iArr.length == 0) {
                string = "()";
            } else {
                StringBuilder sb = new StringBuilder("(");
                for (int i7 : iArr) {
                    sb.append(i7);
                    sb.append(",");
                }
                sb.deleteCharAt(sb.length() - 1);
                sb.append(")");
                string = sb.toString();
            }
            this.item_ids = string;
            return this;
        }

        @NotNull
        public final Msg2 itemName(@Nullable String str) {
            this.item_name = Uri.encode(str);
            return this;
        }

        @NotNull
        public final Msg2 itemPosition(int i7) {
            this.item_position = Integer.valueOf(i7);
            return this;
        }

        @NotNull
        public final Msg2 itemPrice(@Nullable String str) {
            this.item_price = str;
            return this;
        }

        @NotNull
        public final Msg2 itemRealPrice(int i7) {
            this.item_real_price = Integer.valueOf(i7);
            return this;
        }

        @NotNull
        public final Msg2 jumpFrom(int i7) {
            this.jumpfrom = Integer.valueOf(i7);
            return this;
        }

        @NotNull
        public final Msg2 pkId(int i7) {
            this.pk_id = Integer.valueOf(i7);
            return this;
        }

        @NotNull
        public final Msg2 roomId(int i7) {
            this.room_id = Integer.valueOf(i7);
            return this;
        }

        @NotNull
        public final Msg2 sendContent(@Nullable String str) {
            this.sendContent = str;
            return this;
        }

        public final void setCombo_status(@Nullable Integer num) {
            this.combo_status = num;
        }

        public final void setCombos(@Nullable Integer num) {
            this.combos = num;
        }

        public final void setConfig_id(@Nullable String str) {
            this.config_id = str;
        }

        public final void setConfig_ids(@Nullable String str) {
            this.config_ids = str;
        }

        public final void setItem_id(@Nullable Integer num) {
            this.item_id = num;
        }

        public final void setItem_ids(@Nullable String str) {
            this.item_ids = str;
        }

        public final void setItem_name(@Nullable String str) {
            this.item_name = str;
        }

        public final void setItem_position(@Nullable Integer num) {
            this.item_position = num;
        }

        public final void setItem_price(@Nullable String str) {
            this.item_price = str;
        }

        public final void setItem_real_price(@Nullable Integer num) {
            this.item_real_price = num;
        }

        public final void setJumpfrom(@Nullable Integer num) {
            this.jumpfrom = num;
        }

        public final void setPk_id(@Nullable Integer num) {
            this.pk_id = num;
        }

        public final void setRoom_id(@Nullable Integer num) {
            this.room_id = num;
        }

        public final void setScreen_status(@Nullable Integer num) {
            this.screen_status = num;
        }

        public final void setSendContent(@Nullable String str) {
            this.sendContent = str;
        }

        public final void setSuccess(@Nullable Integer num) {
            this.success = num;
        }

        public final void setTab(@Nullable String str) {
            this.tab = str;
        }

        public final void setTab_position(@Nullable Integer num) {
            this.tab_position = num;
        }

        @NotNull
        public final Msg2 success(int i7) {
            this.success = Integer.valueOf(i7);
            return this;
        }

        @NotNull
        public final Msg2 tab(@Nullable String str) {
            this.tab = str;
            return this;
        }

        @NotNull
        public final Msg2 tabPosition(int i7) {
            this.tab_position = Integer.valueOf(i7);
            return this;
        }

        @NotNull
        public String toString() {
            Integer num = this.screen_status;
            String strA = num == null ? "" : s.a(num, "screen_status:", ReporterMap.SEMICOLON);
            Integer num2 = this.pk_id;
            String strA2 = num2 == null ? "" : s.a(num2, "pk_id:", ReporterMap.SEMICOLON);
            Integer num3 = this.room_id;
            String strA3 = num3 == null ? "" : s.a(num3, "room_id:", ReporterMap.SEMICOLON);
            String str = this.tab;
            String strA4 = str == null ? "" : android.support.v4.media.a.a("tab:", str, ReporterMap.SEMICOLON);
            Integer num4 = this.tab_position;
            String strA5 = num4 == null ? "" : s.a(num4, "tab_position:", ReporterMap.SEMICOLON);
            Integer num5 = this.item_id;
            String strA6 = num5 == null ? "" : s.a(num5, "item_id:", ReporterMap.SEMICOLON);
            String str2 = this.item_ids;
            String strA7 = str2 == null ? "" : android.support.v4.media.a.a("item_id:", str2, ReporterMap.SEMICOLON);
            String str3 = this.item_name;
            String strA8 = str3 == null ? "" : android.support.v4.media.a.a("item_name:", str3, ReporterMap.SEMICOLON);
            Integer num6 = this.item_position;
            String strA9 = num6 == null ? "" : s.a(num6, "item_position:", ReporterMap.SEMICOLON);
            String str4 = this.item_price;
            String strA10 = str4 == null ? "" : android.support.v4.media.a.a("item_price:", str4, ReporterMap.SEMICOLON);
            Integer num7 = this.item_real_price;
            String strA11 = num7 == null ? "" : s.a(num7, "item_real_price:", ReporterMap.SEMICOLON);
            String str5 = this.config_id;
            String strA12 = str5 == null ? "" : android.support.v4.media.a.a("config_id:", str5, ReporterMap.SEMICOLON);
            String str6 = this.config_ids;
            String strA13 = str6 == null ? "" : android.support.v4.media.a.a("config_id:", str6, ReporterMap.SEMICOLON);
            Integer num8 = this.jumpfrom;
            String strA14 = num8 == null ? "" : s.a(num8, "jumpfrom:", ReporterMap.SEMICOLON);
            Integer num9 = this.combo_status;
            String strA15 = num9 == null ? "" : s.a(num9, "combo_status:", ReporterMap.SEMICOLON);
            Integer num10 = this.combos;
            String strA16 = num10 == null ? "" : s.a(num10, "combos:", ReporterMap.SEMICOLON);
            Integer num11 = this.success;
            String strA17 = num11 == null ? "" : s.a(num11, "success:", ReporterMap.SEMICOLON);
            String str7 = this.sendContent;
            String strA18 = str7 == null ? "" : android.support.v4.media.a.a("send_content:", str7, ReporterMap.SEMICOLON);
            StringBuilder sbA = b.a(ReporterMap.LEFT_BRACES, strA, strA2, strA3, strA4);
            B.a(strA5, strA6, strA7, strA8, sbA);
            B.a(strA9, strA10, strA11, strA12, sbA);
            B.a(strA13, strA14, strA15, strA16, sbA);
            return D.a(strA17, strA18, ReporterMap.RIGHT_BRACES, sbA);
        }
    }

    @Override // Mt0.a
    @NotNull
    public final String[] a() {
        String str = this.f88587a;
        String str2 = this.f88588b;
        synchronized (c.class) {
            try {
                if (c.f88585b == null) {
                    c.f88585b = new c();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        c cVar = c.f88585b;
        return new String[]{str, "live", str2, cVar != null ? cVar.a() : null, null, null, null};
    }

    @Override // Mt0.a
    @Nullable
    public final String b() {
        return "000277";
    }
}
