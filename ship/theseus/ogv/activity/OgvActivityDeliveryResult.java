package com.bilibili.ship.theseus.ogv.activity;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvActivityDeliveryResult.class */
@StabilityInferred(parameters = 0)
@Bson
public final class OgvActivityDeliveryResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final OgvActivityDialogVo f91345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f91346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final PlayAreaToast f91347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("after_action")
    @Nullable
    private final Action f91348d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvActivityDeliveryResult$Action.class */
    @JsonAdapter(ActionTypeSerializer.class)
    public interface Action {

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvActivityDeliveryResult$Action$ActionTypeSerializer.class */
        @StabilityInferred(parameters = 0)
        public static final class ActionTypeSerializer implements com.google.gson.e<Action> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final Map<String, Class<Navigate>> f91349a = MapsKt.mapOf(TuplesKt.to("url", Navigate.class));

            /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.gson.JsonParseException */
            public final Object c(JsonElement jsonElement, Type type, com.google.gson.d dVar) throws JsonParseException {
                String asString;
                JsonElement jsonElement2 = jsonElement.getAsJsonObject().get("action");
                if (jsonElement2 == null || (asString = jsonElement2.getAsString()) == null) {
                    throw new JsonParseException("Missing action type field");
                }
                Class<Navigate> cls = this.f91349a.get(asString);
                if (cls != null) {
                    return (Action) dVar.a(jsonElement, cls);
                }
                throw new JsonParseException("Unknown action type: ".concat(asString));
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvActivityDeliveryResult$Action$Navigate.class */
        @StabilityInferred(parameters = 1)
        @Bson
        public static final class Navigate implements Action {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final String f91350a;

            public Navigate(@NotNull String str) {
                this.f91350a = str;
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvActivityDeliveryResult$Button.class */
    @StabilityInferred(parameters = 1)
    @Bson
    public static final class Button implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final OgvActivityTextVo f91351a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final ActivityDialogActionType f91352b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final String f91353c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final String f91354d;

        public Button(@Nullable ActivityDialogActionType activityDialogActionType, @NotNull OgvActivityTextVo ogvActivityTextVo, @Nullable String str, @Nullable String str2) {
            this.f91351a = ogvActivityTextVo;
            this.f91352b = activityDialogActionType;
            this.f91353c = str;
            this.f91354d = str2;
        }

        @Override // com.bilibili.ship.theseus.ogv.activity.d
        @Nullable
        public final ActivityDialogActionType getAction() {
            return this.f91352b;
        }

        @Override // com.bilibili.ship.theseus.ogv.activity.d
        @Nullable
        public final String getCode() {
            return this.f91354d;
        }

        @Override // com.bilibili.ship.theseus.ogv.activity.d
        @Nullable
        public final String getLink() {
            return this.f91353c;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvActivityDeliveryResult$PlayAreaToast.class */
    @StabilityInferred(parameters = 0)
    @Bson
    public static final class PlayAreaToast {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final OgvActivityTextVo f91355a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Button f91356b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final Map<String, String> f91357c;

        public PlayAreaToast(@NotNull OgvActivityTextVo ogvActivityTextVo, @NotNull Button button, @NotNull Map<String, String> map) {
            this.f91355a = ogvActivityTextVo;
            this.f91356b = button;
            this.f91357c = map;
        }
    }

    public OgvActivityDeliveryResult(@Nullable OgvActivityDialogVo ogvActivityDialogVo, @NotNull Map<String, String> map, @Nullable PlayAreaToast playAreaToast, @Nullable Action action) {
        this.f91345a = ogvActivityDialogVo;
        this.f91346b = map;
        this.f91347c = playAreaToast;
        this.f91348d = action;
    }

    @Nullable
    public final Action a() {
        return this.f91348d;
    }
}
