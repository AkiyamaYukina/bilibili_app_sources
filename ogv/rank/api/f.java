package com.bilibili.ogv.rank.api;

import I.E;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/api/f.class */
@StabilityInferred(parameters = 1)
@Serializable
public final class f {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f71948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f71949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f71950c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/api/f$a.class */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    @StabilityInferred(parameters = 0)
    public static final /* synthetic */ class a implements GeneratedSerializer<f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f71951a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final PluginGeneratedSerialDescriptor f71952b;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.rank.api.f$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
        static {
            ?? obj = new Object();
            f71951a = obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bilibili.ogv.rank.api.TabData", (GeneratedSerializer) obj, 3);
            pluginGeneratedSerialDescriptor.addElement("oid", true);
            pluginGeneratedSerialDescriptor.addElement("rank_title", true);
            pluginGeneratedSerialDescriptor.addElement("rank_id", true);
            f71952b = pluginGeneratedSerialDescriptor;
        }

        @NotNull
        public final KSerializer<?>[] childSerializers() {
            KSerializer<?> kSerializer = StringSerializer.INSTANCE;
            return new KSerializer[]{kSerializer, kSerializer, kSerializer};
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
        public final Object deserialize(Decoder decoder) throws UnknownFieldException {
            String strDecodeStringElement;
            String strDecodeStringElement2;
            String strDecodeStringElement3;
            int i7;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f71952b;
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                i7 = 7;
            } else {
                strDecodeStringElement = null;
                strDecodeStringElement2 = null;
                strDecodeStringElement3 = null;
                boolean z6 = true;
                i7 = 0;
                while (z6) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    if (iDecodeElementIndex == -1) {
                        z6 = false;
                    } else if (iDecodeElementIndex == 0) {
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                        i7 |= 1;
                    } else if (iDecodeElementIndex == 1) {
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                        i7 |= 2;
                    } else {
                        if (iDecodeElementIndex != 2) {
                            throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                        i7 |= 4;
                    }
                }
            }
            compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new f(i7, strDecodeStringElement, strDecodeStringElement3, strDecodeStringElement2);
        }

        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f71952b;
        }

        public final void serialize(Encoder encoder, Object obj) {
            f fVar = (f) obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f71952b;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            b bVar = f.Companion;
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 0) || !Intrinsics.areEqual(fVar.f71948a, "")) {
                compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, fVar.f71948a);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1) || !Intrinsics.areEqual(fVar.f71949b, "")) {
                compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, fVar.f71949b);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 2) || !Intrinsics.areEqual(fVar.f71950c, "")) {
                compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 2, fVar.f71950c);
            }
            compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @NotNull
        public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/api/f$b.class */
    public static final class b {
        @NotNull
        public final KSerializer<f> serializer() {
            return a.f71951a;
        }
    }

    public f() {
        this.f71948a = "";
        this.f71949b = "";
        this.f71950c = "";
    }

    public f(int i7, String str, String str2, String str3) {
        if ((i7 & 1) == 0) {
            this.f71948a = "";
        } else {
            this.f71948a = str;
        }
        if ((i7 & 2) == 0) {
            this.f71949b = "";
        } else {
            this.f71949b = str2;
        }
        if ((i7 & 4) == 0) {
            this.f71950c = "";
        } else {
            this.f71950c = str3;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.areEqual(this.f71948a, fVar.f71948a) && Intrinsics.areEqual(this.f71949b, fVar.f71949b) && Intrinsics.areEqual(this.f71950c, fVar.f71950c);
    }

    public final int hashCode() {
        return this.f71950c.hashCode() + E.a(this.f71948a.hashCode() * 31, 31, this.f71949b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("TabData(oid=");
        sb.append(this.f71948a);
        sb.append(", rank_title=");
        sb.append(this.f71949b);
        sb.append(", rank_id=");
        return C8770a.a(sb, this.f71950c, ")");
    }
}
