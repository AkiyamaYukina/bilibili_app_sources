package com.bilibili.ogv.operation3.filmlisthub.api;

import J3.C2384u1;
import K7.M;
import androidx.compose.runtime.internal.StabilityInferred;
import bl0.InterfaceC5118d;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/filmlisthub/api/b.class */
@StabilityInferred(parameters = 0)
@Serializable
public final class b {

    @NotNull
    public static final C0441b Companion = new C0441b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final Lazy<KSerializer<Object>>[] f71077c = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new C2384u1(10)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<InterfaceC5118d> f71078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f71079b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/filmlisthub/api/b$a.class */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    @StabilityInferred(parameters = 0)
    public static final /* synthetic */ class a implements GeneratedSerializer<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f71080a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final PluginGeneratedSerialDescriptor f71081b;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.operation3.filmlisthub.api.b$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
        static {
            ?? obj = new Object();
            f71080a = obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bilibili.ogv.operation3.filmlisthub.api.PageData", (GeneratedSerializer) obj, 2);
            pluginGeneratedSerialDescriptor.addElement("modules", true);
            pluginGeneratedSerialDescriptor.addElement("selected_module_id", true);
            f71081b = pluginGeneratedSerialDescriptor;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[]{b.f71077c[0].getValue(), LongSerializer.INSTANCE};
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
        public final Object deserialize(Decoder decoder) throws UnknownFieldException {
            long jDecodeLongElement;
            int i7;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f71081b;
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = b.f71077c;
            List list = null;
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                list = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), (Object) null);
                jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 1);
                i7 = 3;
            } else {
                jDecodeLongElement = 0;
                boolean z6 = true;
                i7 = 0;
                while (z6) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    if (iDecodeElementIndex == -1) {
                        z6 = false;
                    } else if (iDecodeElementIndex == 0) {
                        list = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), list);
                        i7 |= 1;
                    } else {
                        if (iDecodeElementIndex != 1) {
                            throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 1);
                        i7 |= 2;
                    }
                }
            }
            compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new b(i7, jDecodeLongElement, list);
        }

        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f71081b;
        }

        public final void serialize(Encoder encoder, Object obj) {
            b bVar = (b) obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f71081b;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            C0441b c0441b = b.Companion;
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 0) || !Intrinsics.areEqual(bVar.f71078a, CollectionsKt.emptyList())) {
                compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 0, (SerializationStrategy) b.f71077c[0].getValue(), bVar.f71078a);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1) || bVar.f71079b != 0) {
                compositeEncoderBeginStructure.encodeLongElement(pluginGeneratedSerialDescriptor, 1, bVar.f71079b);
            }
            compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @NotNull
        public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ogv.operation3.filmlisthub.api.b$b, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/filmlisthub/api/b$b.class */
    public static final class C0441b {
        @NotNull
        public final KSerializer<b> serializer() {
            return a.f71080a;
        }
    }

    public b() {
        this.f71078a = CollectionsKt.emptyList();
        this.f71079b = 0L;
    }

    public b(int i7, long j7, List list) {
        this.f71078a = (i7 & 1) == 0 ? CollectionsKt.emptyList() : list;
        if ((i7 & 2) == 0) {
            this.f71079b = 0L;
        } else {
            this.f71079b = j7;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f71078a, bVar.f71078a) && this.f71079b == bVar.f71079b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f71079b) + (this.f71078a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return android.support.v4.media.session.a.a(M.a("PageData(modules=", ", selectedModuleId=", this.f71078a), this.f71079b, ")");
    }
}
