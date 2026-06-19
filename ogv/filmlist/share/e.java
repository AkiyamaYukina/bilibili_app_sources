package com.bilibili.ogv.filmlist.share;

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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/filmlist/share/e.class */
@StabilityInferred(parameters = 1)
@Serializable
public final class e {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f67809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f67810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f67811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f67812d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f67813e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/filmlist/share/e$a.class */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    @StabilityInferred(parameters = 0)
    public static final /* synthetic */ class a implements GeneratedSerializer<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f67814a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final PluginGeneratedSerialDescriptor f67815b;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.filmlist.share.e$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
        static {
            ?? obj = new Object();
            f67814a = obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bilibili.ogv.filmlist.share.FilmListShareSketch", (GeneratedSerializer) obj, 5);
            pluginGeneratedSerialDescriptor.addElement("cover_url", false);
            pluginGeneratedSerialDescriptor.addElement("target_url", false);
            pluginGeneratedSerialDescriptor.addElement("title", false);
            pluginGeneratedSerialDescriptor.addElement("desc_text", false);
            pluginGeneratedSerialDescriptor.addElement("biz_type", true);
            f67815b = pluginGeneratedSerialDescriptor;
        }

        @NotNull
        public final KSerializer<?>[] childSerializers() {
            KSerializer<?> kSerializer = StringSerializer.INSTANCE;
            return new KSerializer[]{kSerializer, kSerializer, kSerializer, kSerializer, kSerializer};
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
        public final Object deserialize(Decoder decoder) throws UnknownFieldException {
            String strDecodeStringElement;
            int i7;
            String str;
            String strDecodeStringElement2;
            String str2;
            String strDecodeStringElement3;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f67815b;
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
                strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 4);
                i7 = 31;
                str2 = strDecodeStringElement4;
                str = strDecodeStringElement5;
            } else {
                strDecodeStringElement = null;
                String strDecodeStringElement6 = null;
                String strDecodeStringElement7 = null;
                String strDecodeStringElement8 = null;
                String strDecodeStringElement9 = null;
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
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                        i7 |= 2;
                    } else if (iDecodeElementIndex == 2) {
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                        i7 |= 4;
                    } else if (iDecodeElementIndex == 3) {
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
                        i7 |= 8;
                    } else {
                        if (iDecodeElementIndex != 4) {
                            throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 4);
                        i7 |= 16;
                    }
                }
                String str3 = strDecodeStringElement8;
                str = strDecodeStringElement9;
                strDecodeStringElement2 = strDecodeStringElement6;
                str2 = strDecodeStringElement7;
                strDecodeStringElement3 = str3;
            }
            compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new e(i7, strDecodeStringElement, strDecodeStringElement3, str2, str, strDecodeStringElement2);
        }

        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f67815b;
        }

        public final void serialize(Encoder encoder, Object obj) {
            e eVar = (e) obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f67815b;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, eVar.f67809a);
            compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, eVar.f67810b);
            compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 2, eVar.f67811c);
            compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 3, eVar.f67812d);
            boolean zShouldEncodeElementDefault = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 4);
            String str = eVar.f67813e;
            if (zShouldEncodeElementDefault || !Intrinsics.areEqual(str, "3")) {
                compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 4, str);
            }
            compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @NotNull
        public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/filmlist/share/e$b.class */
    public static final class b {
        @NotNull
        public final KSerializer<e> serializer() {
            return a.f67814a;
        }
    }

    public e(int i7, String str, String str2, String str3, String str4, String str5) {
        if (15 != (i7 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i7, 15, a.f67815b);
        }
        this.f67809a = str;
        this.f67810b = str2;
        this.f67811c = str3;
        this.f67812d = str4;
        if ((i7 & 16) == 0) {
            this.f67813e = "3";
        } else {
            this.f67813e = str5;
        }
    }

    public e(String str, String str2, String str3, String str4) {
        this.f67809a = str;
        this.f67810b = str2;
        this.f67811c = str3;
        this.f67812d = str4;
        this.f67813e = "3";
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.areEqual(this.f67809a, eVar.f67809a) && Intrinsics.areEqual(this.f67810b, eVar.f67810b) && Intrinsics.areEqual(this.f67811c, eVar.f67811c) && Intrinsics.areEqual(this.f67812d, eVar.f67812d) && Intrinsics.areEqual(this.f67813e, eVar.f67813e);
    }

    public final int hashCode() {
        return this.f67813e.hashCode() + E.a(E.a(E.a(this.f67809a.hashCode() * 31, 31, this.f67810b), 31, this.f67811c), 31, this.f67812d);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("FilmListShareSketch(cover_url=");
        sb.append(this.f67809a);
        sb.append(", target_url=");
        sb.append(this.f67810b);
        sb.append(", title=");
        sb.append(this.f67811c);
        sb.append(", desc_text=");
        sb.append(this.f67812d);
        sb.append(", biz_type=");
        return C8770a.a(sb, this.f67813e, ")");
    }
}
