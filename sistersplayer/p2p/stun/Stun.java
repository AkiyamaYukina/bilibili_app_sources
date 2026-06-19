package com.bilibili.sistersplayer.p2p.stun;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.zip.CRC32;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/stun/Stun.class */
public class Stun {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/stun/Stun$Attr.class */
    public static class Attr {
        static final boolean $assertionsDisabled = false;
        public static final int FINGERPRINT_XOR = 1398035790;
        public static final short T_FINGERPRINT = -32728;
        public static final short T_ICECONTROLLED = -32727;
        public static final short T_ICECONTROLLING = -32726;
        public static final short T_MESSAGEINTEGRITY = 8;
        public static final short T_PRIORITY = 36;
        public static final short T_USECANDIDATE = 37;
        public static final short T_USERNAME = 6;
        public static final short T_XORMAPPEDADDRESS = 32;
        public byte[] body;
        public short type;

        public static byte[] Utf8StringToBytes(String str) {
            ByteBuffer byteBufferEncode = StandardCharsets.UTF_8.encode(str);
            byteBufferEncode.rewind();
            byte[] bArr = new byte[byteBufferEncode.limit()];
            byteBufferEncode.get(bArr);
            return bArr;
        }

        public InetSocketAddress getXorMappedAddress(int i7, int[] iArr) {
            if (this.type != 32) {
                return null;
            }
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(this.body);
            ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
            byteBufferWrap.order(byteOrder);
            short s7 = byteBufferWrap.getShort();
            int i8 = (byteBufferWrap.getShort() ^ (i7 >> 16)) & 65535;
            if (s7 == 1) {
                if (byteBufferWrap.remaining() < 4) {
                    return null;
                }
                int i9 = byteBufferWrap.getInt();
                byte[] bArr = new byte[4];
                ByteBuffer.wrap(bArr).order(byteOrder).putInt(i7 ^ i9);
                try {
                    return new InetSocketAddress(Inet4Address.getByAddress(bArr), i8);
                } catch (Exception e7) {
                    return null;
                }
            }
            if (s7 != 2 || byteBufferWrap.remaining() < 16) {
                return null;
            }
            int i10 = byteBufferWrap.getInt();
            int i11 = byteBufferWrap.getInt();
            int i12 = iArr[0];
            int i13 = byteBufferWrap.getInt();
            int i14 = iArr[1];
            int i15 = byteBufferWrap.getInt();
            byte[] bArr2 = new byte[16];
            ByteBuffer.wrap(bArr2).order(byteOrder).putInt(i7 ^ i10).putInt(i11 ^ i12).putInt(i14 ^ i13).putInt(iArr[2] ^ i15);
            try {
                return new InetSocketAddress(Inet6Address.getByAddress(bArr2), i8);
            } catch (Exception e8) {
                return null;
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/stun/Stun$Msg.class */
    public static class Msg {
        static final boolean $assertionsDisabled = false;
        public static final int C_FAILURERESPONSE = 2;
        public static final int C_INDICATION = 3;
        public static final int C_REQUEST = 0;
        public static final int C_SUCCESSRESPONSE = 1;
        public static final int HEADER_SIZE = 20;
        public static final int M_BINDING = 1;
        public int stunClass = 0;
        public int stunMethod = 0;
        public int magicCookie = 554869826;
        public int[] transId = new int[3];
        ArrayList<Attr> attrs = new ArrayList<>();

        public static Msg Load(byte[] bArr) {
            if (bArr.length < 20) {
                return null;
            }
            Msg msg = new Msg();
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            byteBufferWrap.order(ByteOrder.BIG_ENDIAN);
            byteBufferWrap.rewind();
            short s7 = byteBufferWrap.getShort();
            short s8 = byteBufferWrap.getShort();
            int i7 = (65535 & s8) + 20;
            byteBufferWrap.limit(i7);
            if ((s8 & 3) > 0) {
                return null;
            }
            msg.stunClass = ((s7 & 16) >> 4) | ((s7 & 256) >> 7);
            msg.stunMethod = ((s7 & 15872) >> 2) | (s7 & 15) | ((s7 & 224) >> 1);
            msg.magicCookie = byteBufferWrap.getInt();
            for (int i8 = 0; i8 < 3; i8++) {
                msg.transId[i8] = byteBufferWrap.getInt();
            }
            byteBufferWrap.limit(i7);
            while (byteBufferWrap.remaining() >= 4) {
                short s9 = byteBufferWrap.getShort();
                int i9 = byteBufferWrap.getShort();
                if (byteBufferWrap.remaining() < i9) {
                    return null;
                }
                Attr attr = new Attr();
                attr.type = s9;
                byte[] bArr2 = new byte[i9];
                attr.body = bArr2;
                byteBufferWrap.get(bArr2);
                msg.attrs.add(attr);
                while (byteBufferWrap.position() % 4 != 0) {
                    byteBufferWrap.get();
                }
            }
            return msg;
        }

        private static void SaveAttr(ByteBuffer byteBuffer, Attr attr) {
            short s7 = attr.type;
            byte[] bArr = attr.body;
            byteBuffer.putShort(s7);
            byteBuffer.putShort((short) bArr.length);
            byteBuffer.put(bArr);
            int length = bArr.length;
            for (int i7 = 0; i7 < (4 - (length % 4)) % 4; i7++) {
                byteBuffer.put((byte) 0);
            }
        }

        private static void SaveHeader(ByteBuffer byteBuffer, Msg msg, int i7) {
            int i8 = msg.stunMethod;
            int i9 = msg.stunClass;
            byteBuffer.putShort((short) (((i8 & 3968) << 2) | (i8 & 15) | ((i9 & 1) << 5) | ((i8 & 112) << 1) | ((i9 & 2) << 7)));
            byteBuffer.putShort((short) i7);
            byteBuffer.putInt(msg.magicCookie);
            for (int i10 : msg.transId) {
                byteBuffer.putInt(i10);
            }
        }

        public void AddFingerprint() {
            Attr attr = new Attr();
            attr.type = (short) -32728;
            attr.body = new byte[4];
            this.attrs.add(attr);
            byte[] bArrSave = Save();
            CRC32 crc32 = new CRC32();
            crc32.update(bArrSave, 0, bArrSave.length - 8);
            ByteBuffer.wrap(attr.body).order(ByteOrder.BIG_ENDIAN).putInt((int) (crc32.getValue() ^ 1398035790));
        }

        public void AddMessageIntegrity(byte[] bArr) {
            Attr attr = new Attr();
            attr.type = (short) 8;
            attr.body = new byte[20];
            this.attrs.add(attr);
            byte[] bArrSave = Save();
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "HmacSHA1");
                Mac mac = Mac.getInstance("HmacSHA1");
                mac.init(secretKeySpec);
                mac.update(bArrSave, 0, bArrSave.length - 24);
                attr.body = mac.doFinal();
            } catch (Exception e7) {
            }
        }

        public boolean IsTransIdEquals(Msg msg) {
            boolean z6 = false;
            if (this.magicCookie == msg.magicCookie) {
                int[] iArr = this.transId;
                int i7 = iArr[0];
                int[] iArr2 = msg.transId;
                z6 = false;
                if (i7 == iArr2[0]) {
                    z6 = false;
                    if (iArr[1] == iArr2[1]) {
                        z6 = false;
                        if (iArr[2] == iArr2[2]) {
                            z6 = true;
                        }
                    }
                }
            }
            return z6;
        }

        public byte[] Save() {
            byte[] bArr = new byte[4096];
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            byteBufferWrap.order(ByteOrder.BIG_ENDIAN);
            byteBufferWrap.position(20);
            Iterator<Attr> it = this.attrs.iterator();
            while (it.hasNext()) {
                SaveAttr(byteBufferWrap, it.next());
                while (byteBufferWrap.position() % 4 != 0) {
                    byteBufferWrap.put((byte) 0);
                }
            }
            int iPosition = byteBufferWrap.position();
            byteBufferWrap.flip();
            SaveHeader(byteBufferWrap, this, iPosition - 20);
            byte[] bArr2 = new byte[iPosition];
            System.arraycopy(bArr, 0, bArr2, 0, iPosition);
            return bArr2;
        }
    }
}
