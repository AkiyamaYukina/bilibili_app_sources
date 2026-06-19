package com.bilibili.ogv.kmm.operation.timefree;

import G3.N0;
import G3.O0;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonClassDiscriminator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/timefree/ActivityDesc.class */
@StabilityInferred(parameters = 1)
@Serializable
public final class ActivityDesc {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final Lazy<KSerializer<Object>>[] f68847b = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new N0(11))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Action f68848a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/timefree/ActivityDesc$Action.class */
    @JsonClassDiscriminator(discriminator = "type")
    @StabilityInferred(parameters = 1)
    @Serializable
    public static abstract class Action {

        @NotNull
        public static final a Companion = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final Lazy<KSerializer<Object>> f68849a = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new O0(8));

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/timefree/ActivityDesc$Action$Alert.class */
        @SerialName("alert")
        @StabilityInferred(parameters = 1)
        @Serializable
        public static final class Alert extends Action {

            @NotNull
            public static final a Companion = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final String f68850b;

            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/timefree/ActivityDesc$Action$Alert$a.class */
            public static final class a {
                @NotNull
                public final KSerializer<Alert> serializer() {
                    return ActivityDesc$Action$Alert$$serializer.f68851a;
                }
            }

            public Alert(int i7, String str) {
                if (1 != (i7 & 1)) {
                    PluginExceptionsKt.throwMissingFieldException(i7, 1, ActivityDesc$Action$Alert$$serializer.f68852b);
                }
                this.f68850b = str;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Alert) && Intrinsics.areEqual(this.f68850b, ((Alert) obj).f68850b);
            }

            public final int hashCode() {
                return this.f68850b.hashCode();
            }

            @NotNull
            public final String toString() {
                return C8770a.a(new StringBuilder("Alert(message="), this.f68850b, ")");
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/timefree/ActivityDesc$Action$a.class */
        public static final class a {
            @NotNull
            public final KSerializer<Action> serializer() {
                return (KSerializer) Action.f68849a.getValue();
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/timefree/ActivityDesc$Action$b.class */
        @SerialName("url")
        @StabilityInferred(parameters = 1)
        @Serializable
        public static final class b extends Action {

            @NotNull
            public static final C0419b Companion = new C0419b();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final String f68853b;

            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/timefree/ActivityDesc$Action$b$a.class */
            @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
            @StabilityInferred(parameters = 0)
            public static final /* synthetic */ class a implements GeneratedSerializer<b> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                @NotNull
                public static final a f68854a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                @NotNull
                public static final PluginGeneratedSerialDescriptor f68855b;

                /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.kmm.operation.timefree.ActivityDesc$Action$b$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
                static {
                    ?? obj = new Object();
                    f68854a = obj;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("url", (GeneratedSerializer) obj, 1);
                    pluginGeneratedSerialDescriptor.addElement("link", false);
                    pluginGeneratedSerialDescriptor.pushClassAnnotation(new ActivityDesc$Action$Alert$$serializer$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0("type"));
                    f68855b = pluginGeneratedSerialDescriptor;
                }

                @NotNull
                public final KSerializer<?>[] childSerializers() {
                    return new KSerializer[]{StringSerializer.INSTANCE};
                }

                /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
                public final Object deserialize(Decoder decoder) throws UnknownFieldException {
                    String strDecodeStringElement;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68855b;
                    CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
                    int i7 = 1;
                    if (compositeDecoderBeginStructure.decodeSequentially()) {
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                    } else {
                        strDecodeStringElement = null;
                        boolean z6 = true;
                        i7 = 0;
                        while (z6) {
                            int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                            if (iDecodeElementIndex == -1) {
                                z6 = false;
                            } else {
                                if (iDecodeElementIndex != 0) {
                                    throw new UnknownFieldException(iDecodeElementIndex);
                                }
                                strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                                i7 = 1;
                            }
                        }
                    }
                    compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
                    return new b(i7, strDecodeStringElement);
                }

                @NotNull
                public final SerialDescriptor getDescriptor() {
                    return f68855b;
                }

                public final void serialize(Encoder encoder, Object obj) {
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68855b;
                    CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, ((b) obj).f68853b);
                    compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
                }

                @NotNull
                public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
                    return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
                }
            }

            /* JADX INFO: renamed from: com.bilibili.ogv.kmm.operation.timefree.ActivityDesc$Action$b$b, reason: collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/timefree/ActivityDesc$Action$b$b.class */
            public static final class C0419b {
                @NotNull
                public final KSerializer<b> serializer() {
                    return a.f68854a;
                }
            }

            public b(int i7, String str) {
                if (1 != (i7 & 1)) {
                    PluginExceptionsKt.throwMissingFieldException(i7, 1, a.f68855b);
                }
                this.f68853b = str;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && Intrinsics.areEqual(this.f68853b, ((b) obj).f68853b);
            }

            public final int hashCode() {
                return this.f68853b.hashCode();
            }

            @NotNull
            public final String toString() {
                return C8770a.a(new StringBuilder("Navigate(link="), this.f68853b, ")");
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/timefree/ActivityDesc$a.class */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    @StabilityInferred(parameters = 0)
    public static final /* synthetic */ class a implements GeneratedSerializer<ActivityDesc> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f68856a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final PluginGeneratedSerialDescriptor f68857b;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.kmm.operation.timefree.ActivityDesc$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
        static {
            ?? obj = new Object();
            f68856a = obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bilibili.ogv.kmm.operation.timefree.ActivityDesc", (GeneratedSerializer) obj, 1);
            pluginGeneratedSerialDescriptor.addElement("action", true);
            f68857b = pluginGeneratedSerialDescriptor;
        }

        @NotNull
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[]{BuiltinSerializersKt.getNullable((KSerializer) ActivityDesc.f68847b[0].getValue())};
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
        public final Object deserialize(Decoder decoder) throws UnknownFieldException {
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68857b;
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = ActivityDesc.f68847b;
            int i7 = 1;
            Action action = null;
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                action = (Action) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), (Object) null);
            } else {
                boolean z6 = true;
                i7 = 0;
                while (z6) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    if (iDecodeElementIndex == -1) {
                        z6 = false;
                    } else {
                        if (iDecodeElementIndex != 0) {
                            throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        action = (Action) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), action);
                        i7 = 1;
                    }
                }
            }
            compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new ActivityDesc(i7, action);
        }

        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f68857b;
        }

        public final void serialize(Encoder encoder, Object obj) {
            ActivityDesc activityDesc = (ActivityDesc) obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68857b;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            b bVar = ActivityDesc.Companion;
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 0) || activityDesc.f68848a != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, (SerializationStrategy) ActivityDesc.f68847b[0].getValue(), activityDesc.f68848a);
            }
            compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @NotNull
        public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/timefree/ActivityDesc$b.class */
    public static final class b {
        @NotNull
        public final KSerializer<ActivityDesc> serializer() {
            return a.f68856a;
        }
    }

    public ActivityDesc() {
        this.f68848a = null;
    }

    public ActivityDesc(int i7, Action action) {
        if ((i7 & 1) == 0) {
            this.f68848a = null;
        } else {
            this.f68848a = action;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ActivityDesc) && Intrinsics.areEqual(this.f68848a, ((ActivityDesc) obj).f68848a);
    }

    public final int hashCode() {
        Action action = this.f68848a;
        return action == null ? 0 : action.hashCode();
    }

    @NotNull
    public final String toString() {
        return "ActivityDesc(action=" + this.f68848a + ")";
    }
}
