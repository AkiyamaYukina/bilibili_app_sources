package com.bilibili.ogv.rank.api;

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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/api/b.class */
@StabilityInferred(parameters = 1)
@Serializable
public final class b {

    @NotNull
    public static final C0453b Companion = new C0453b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f71938a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/api/b$a.class */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    @StabilityInferred(parameters = 0)
    public static final /* synthetic */ class a implements GeneratedSerializer<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f71939a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final PluginGeneratedSerialDescriptor f71940b;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.rank.api.b$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
        static {
            ?? obj = new Object();
            f71939a = obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bilibili.ogv.rank.api.PlayInfo", (GeneratedSerializer) obj, 1);
            pluginGeneratedSerialDescriptor.addElement("text", true);
            f71940b = pluginGeneratedSerialDescriptor;
        }

        @NotNull
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[]{StringSerializer.INSTANCE};
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
        public final Object deserialize(Decoder decoder) throws UnknownFieldException {
            String strDecodeStringElement;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f71940b;
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
            return f71940b;
        }

        public final void serialize(Encoder encoder, Object obj) {
            b bVar = (b) obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f71940b;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            C0453b c0453b = b.Companion;
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 0) || !Intrinsics.areEqual(bVar.f71938a, "")) {
                compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, bVar.f71938a);
            }
            compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @NotNull
        public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ogv.rank.api.b$b, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/api/b$b.class */
    public static final class C0453b {
        @NotNull
        public final KSerializer<b> serializer() {
            return a.f71939a;
        }
    }

    public b() {
        this.f71938a = "";
    }

    public b(int i7, String str) {
        if ((i7 & 1) == 0) {
            this.f71938a = "";
        } else {
            this.f71938a = str;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.areEqual(this.f71938a, ((b) obj).f71938a);
    }

    public final int hashCode() {
        return this.f71938a.hashCode();
    }

    @NotNull
    public final String toString() {
        return C8770a.a(new StringBuilder("PlayInfo(text="), this.f71938a, ")");
    }
}
