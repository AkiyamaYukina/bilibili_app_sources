package com.bilibili.ogv.kmm.operation.inlinevideo;

import androidx.compose.animation.core.I;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ogv.kmm.operation.inlinevideo.p;
import com.bilibili.ogv.kmm.operation.inlinevideo.q;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/inlinevideo/d.class */
@StabilityInferred(parameters = 0)
@Serializable
public final class d {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f68483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f68484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f68485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f68486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f68487e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final JsonObject f68488f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final p f68489g;

    @Nullable
    public final q h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final String f68490i;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/inlinevideo/d$a.class */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    @StabilityInferred(parameters = 0)
    public static final /* synthetic */ class a implements GeneratedSerializer<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f68491a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final PluginGeneratedSerialDescriptor f68492b;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.kmm.operation.inlinevideo.d$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
        static {
            ?? obj = new Object();
            f68491a = obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bilibili.ogv.kmm.operation.inlinevideo.InlineInfo", (GeneratedSerializer) obj, 9);
            pluginGeneratedSerialDescriptor.addElement("aid", true);
            pluginGeneratedSerialDescriptor.addElement("cid", true);
            pluginGeneratedSerialDescriptor.addElement("ep_id", true);
            pluginGeneratedSerialDescriptor.addElement("season_id", true);
            pluginGeneratedSerialDescriptor.addElement("season_type", true);
            pluginGeneratedSerialDescriptor.addElement("player_info", false);
            pluginGeneratedSerialDescriptor.addElement("dimension", false);
            pluginGeneratedSerialDescriptor.addElement("video", false);
            pluginGeneratedSerialDescriptor.addElement("feedback_content", true);
            f68492b = pluginGeneratedSerialDescriptor;
        }

        @NotNull
        public final KSerializer<?>[] childSerializers() {
            KSerializer<?> nullable = BuiltinSerializersKt.getNullable(JsonObjectSerializer.INSTANCE);
            KSerializer<?> nullable2 = BuiltinSerializersKt.getNullable(p.a.f68518a);
            KSerializer<?> nullable3 = BuiltinSerializersKt.getNullable(q.a.f68525a);
            KSerializer<?> kSerializer = LongSerializer.INSTANCE;
            return new KSerializer[]{kSerializer, kSerializer, kSerializer, kSerializer, IntSerializer.INSTANCE, nullable, nullable2, nullable3, StringSerializer.INSTANCE};
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
        public final Object deserialize(Decoder decoder) throws UnknownFieldException {
            long jDecodeLongElement;
            JsonObject jsonObject;
            q qVar;
            String strDecodeStringElement;
            p pVar;
            long jDecodeLongElement2;
            int iDecodeIntElement;
            long jDecodeLongElement3;
            long jDecodeLongElement4;
            int i7;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68492b;
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 0);
                jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 1);
                long jDecodeLongElement5 = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 2);
                jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 3);
                iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 4);
                jsonObject = (JsonObject) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 5, JsonObjectSerializer.INSTANCE, (Object) null);
                pVar = (p) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 6, p.a.f68518a, (Object) null);
                qVar = (q) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 7, q.a.f68525a, (Object) null);
                strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 8);
                i7 = 511;
                jDecodeLongElement = jDecodeLongElement5;
            } else {
                jDecodeLongElement = 0;
                boolean z6 = true;
                int iDecodeIntElement2 = 0;
                jsonObject = null;
                qVar = null;
                strDecodeStringElement = null;
                long jDecodeLongElement6 = 0;
                long jDecodeLongElement7 = 0;
                long jDecodeLongElement8 = 0;
                pVar = null;
                int i8 = 0;
                while (z6) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    switch (iDecodeElementIndex) {
                        case -1:
                            z6 = false;
                            break;
                        case 0:
                            jDecodeLongElement7 = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 0);
                            i8 |= 1;
                            break;
                        case 1:
                            jDecodeLongElement8 = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 1);
                            i8 |= 2;
                            break;
                        case 2:
                            jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 2);
                            i8 |= 4;
                            break;
                        case 3:
                            jDecodeLongElement6 = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 3);
                            i8 |= 8;
                            break;
                        case 4:
                            iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 4);
                            i8 |= 16;
                            break;
                        case 5:
                            jsonObject = (JsonObject) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 5, JsonObjectSerializer.INSTANCE, jsonObject);
                            i8 |= 32;
                            break;
                        case 6:
                            pVar = (p) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 6, p.a.f68518a, pVar);
                            i8 |= 64;
                            break;
                        case 7:
                            qVar = (q) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 7, q.a.f68525a, qVar);
                            i8 |= 128;
                            break;
                        case 8:
                            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 8);
                            i8 |= 256;
                            break;
                        default:
                            throw new UnknownFieldException(iDecodeElementIndex);
                    }
                }
                int i9 = i8;
                long j7 = jDecodeLongElement6;
                jDecodeLongElement2 = jDecodeLongElement8;
                iDecodeIntElement = iDecodeIntElement2;
                jDecodeLongElement3 = j7;
                jDecodeLongElement4 = jDecodeLongElement7;
                i7 = i9;
            }
            compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new d(i7, jDecodeLongElement4, jDecodeLongElement2, jDecodeLongElement, jDecodeLongElement3, iDecodeIntElement, jsonObject, pVar, qVar, strDecodeStringElement);
        }

        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f68492b;
        }

        public final void serialize(Encoder encoder, Object obj) {
            d dVar = (d) obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68492b;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            b bVar = d.Companion;
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 0) || dVar.f68483a != 0) {
                compositeEncoderBeginStructure.encodeLongElement(pluginGeneratedSerialDescriptor, 0, dVar.f68483a);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1) || dVar.f68484b != 0) {
                compositeEncoderBeginStructure.encodeLongElement(pluginGeneratedSerialDescriptor, 1, dVar.f68484b);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 2) || dVar.f68485c != 0) {
                compositeEncoderBeginStructure.encodeLongElement(pluginGeneratedSerialDescriptor, 2, dVar.f68485c);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 3) || dVar.f68486d != 0) {
                compositeEncoderBeginStructure.encodeLongElement(pluginGeneratedSerialDescriptor, 3, dVar.f68486d);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 4) || dVar.f68487e != 0) {
                compositeEncoderBeginStructure.encodeIntElement(pluginGeneratedSerialDescriptor, 4, dVar.f68487e);
            }
            compositeEncoderBeginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 5, JsonObjectSerializer.INSTANCE, dVar.f68488f);
            compositeEncoderBeginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 6, p.a.f68518a, dVar.f68489g);
            compositeEncoderBeginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 7, q.a.f68525a, dVar.h);
            boolean zShouldEncodeElementDefault = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 8);
            String str = dVar.f68490i;
            if (zShouldEncodeElementDefault || !Intrinsics.areEqual(str, "")) {
                compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 8, str);
            }
            compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @NotNull
        public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/inlinevideo/d$b.class */
    public static final class b {
        @NotNull
        public final KSerializer<d> serializer() {
            return a.f68491a;
        }
    }

    public d(int i7, long j7, long j8, long j9, long j10, int i8, JsonObject jsonObject, p pVar, q qVar, String str) {
        if (224 != (i7 & 224)) {
            PluginExceptionsKt.throwMissingFieldException(i7, 224, a.f68492b);
        }
        if ((i7 & 1) == 0) {
            this.f68483a = 0L;
        } else {
            this.f68483a = j7;
        }
        if ((i7 & 2) == 0) {
            this.f68484b = 0L;
        } else {
            this.f68484b = j8;
        }
        if ((i7 & 4) == 0) {
            this.f68485c = 0L;
        } else {
            this.f68485c = j9;
        }
        if ((i7 & 8) == 0) {
            this.f68486d = 0L;
        } else {
            this.f68486d = j10;
        }
        this.f68487e = (i7 & 16) == 0 ? 0 : i8;
        this.f68488f = jsonObject;
        this.f68489g = pVar;
        this.h = qVar;
        this.f68490i = (i7 & 256) == 0 ? "" : str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f68483a == dVar.f68483a && this.f68484b == dVar.f68484b && this.f68485c == dVar.f68485c && this.f68486d == dVar.f68486d && this.f68487e == dVar.f68487e && Intrinsics.areEqual(this.f68488f, dVar.f68488f) && Intrinsics.areEqual(this.f68489g, dVar.f68489g) && Intrinsics.areEqual(this.h, dVar.h) && Intrinsics.areEqual(this.f68490i, dVar.f68490i);
    }

    public final int hashCode() {
        int iA = I.a(this.f68487e, C3554n0.a(C3554n0.a(C3554n0.a(Long.hashCode(this.f68483a) * 31, 31, this.f68484b), 31, this.f68485c), 31, this.f68486d), 31);
        int iHashCode = 0;
        JsonObject jsonObject = this.f68488f;
        int iHashCode2 = jsonObject == null ? 0 : jsonObject.hashCode();
        p pVar = this.f68489g;
        int iHashCode3 = pVar == null ? 0 : pVar.hashCode();
        q qVar = this.h;
        if (qVar != null) {
            iHashCode = qVar.hashCode();
        }
        return this.f68490i.hashCode() + ((((((iA + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("InlineInfo(aid=");
        sb.append(this.f68483a);
        sb.append(", cid=");
        sb.append(this.f68484b);
        sb.append(", epId=");
        sb.append(this.f68485c);
        sb.append(", seasonId=");
        sb.append(this.f68486d);
        sb.append(", seasonType=");
        sb.append(this.f68487e);
        sb.append(", playerInfo=");
        sb.append(this.f68488f);
        sb.append(", dimension=");
        sb.append(this.f68489g);
        sb.append(", video=");
        sb.append(this.h);
        sb.append(", feedbackContent=");
        return C8770a.a(sb, this.f68490i, ")");
    }
}
