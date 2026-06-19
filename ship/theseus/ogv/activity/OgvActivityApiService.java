package com.bilibili.ship.theseus.ogv.activity;

import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.okretro.response.BiliApiResponse;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvActivityApiService.class */
@BaseUrl("https://api.bilibili.com")
public interface OgvActivityApiService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f91342a = a.f91343a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvActivityApiService$Action.class */
    public static final class Action {
        private static final EnumEntries $ENTRIES;
        private static final Action[] $VALUES;
        private final int type;
        public static final Action EXPOSURE = new Action("EXPOSURE", 0, 1);
        public static final Action RECEIVE = new Action("RECEIVE", 1, 2);
        public static final Action CLOSE = new Action("CLOSE", 2, 3);
        public static final Action BOTTOM_DIALOG_EXPOSURE = new Action("BOTTOM_DIALOG_EXPOSURE", 3, 4);

        private static final /* synthetic */ Action[] $values() {
            return new Action[]{EXPOSURE, RECEIVE, CLOSE, BOTTOM_DIALOG_EXPOSURE};
        }

        static {
            Action[] actionArr$values = $values();
            $VALUES = actionArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(actionArr$values);
        }

        private Action(String str, int i7, int i8) {
            this.type = i8;
        }

        @NotNull
        public static EnumEntries<Action> getEntries() {
            return $ENTRIES;
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) $VALUES.clone();
        }

        public final int getActionType() {
            return this.type;
        }

        public final int getType() {
            return this.type;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvActivityApiService$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f91343a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final OgvActivityApiService f91344b = (OgvActivityApiService) ServiceGenerator.createService(OgvActivityApiService.class);
    }

    @POST("/pgc/activity/deliver/task/complete")
    @Nullable
    Object completeTask(@Query("position") @Nullable String str, @Query("task_id") @Nullable String str2, @Query("token") @Nullable String str3, @Query("timestamp") @Nullable String str4, @Query("task_sign") @Nullable String str5, @NotNull Continuation<? super BiliApiResponse<Unit>> continuation);

    @POST("/pgc/activity/deliver/material/receive-activity")
    @Nullable
    Object getActivityMaterial(@Query("season_id") long j7, @Query("ep_id") long j8, @QueryMap @NotNull Map<String, String> map, @NotNull Continuation<? super BiliApiResponse<OgvActivityVo>> continuation);

    @POST("/pgc/activity/deliver/material/receive")
    @Nullable
    Object loadActivityInfo(@Query("season_id") long j7, @Query("season_type") int i7, @Query("ep_id") long j8, @Query("activity_code") @Nullable String str, @Query("spmid") @NotNull String str2, @Query("from_spmid") @NotNull String str3, @Query("ads_info") @Nullable String str4, @Query("from_scene") @NotNull String str5, @NotNull Continuation<? super BiliApiResponse<OgvActivityVo>> continuation);

    @POST("/pgc/activity/receiveAward")
    @Nullable
    Object receiveAward(@Query("activity_id") @NotNull String str, @Query("season_id") long j7, @Query("ep_id") long j8, @QueryMap @NotNull Map<String, String> map, @NotNull Continuation<? super BiliApiResponse<OgvActivityReceiveResultVo>> continuation);

    @POST("/pgc/activity/action-report")
    @Nullable
    Object reportAction(@Query("activity_id") int i7, @Query("action_type") int i8, @Query("component_id") @Nullable String str, @Query("season_id") @Nullable Long l7, @Query("ep_id") @Nullable Long l8, @NotNull Continuation<? super BiliApiResponse<Unit>> continuation);

    @POST("/pgc/activity/report-in-one")
    @Nullable
    Object reportAction(@Query("win_id") @NotNull String str, @Query("code") @Nullable String str2, @Query("action") @NotNull String str3, @NotNull Continuation<? super BiliApiResponse<OgvActivityDeliveryResult>> continuation);
}
