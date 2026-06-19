package com.bilibili.mediastreaming.flashpoint;

import android.net.http.X509TrustManagerExtensions;
import androidx.annotation.Keep;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/flashpoint/AndroidCertificateVerifier.class */
@Keep
public final class AndroidCertificateVerifier {
    private static final Object LOCK = new Object();
    private static volatile CertificateFactory certificateFactory;
    private static volatile X509TrustManager trustManager;
    private static volatile X509TrustManagerExtensions trustManagerExtensions;

    private AndroidCertificateVerifier() {
    }

    private static CertificateFactory getCertificateFactory() throws GeneralSecurityException {
        CertificateFactory certificateFactory2;
        CertificateFactory certificateFactory3 = certificateFactory;
        if (certificateFactory3 != null) {
            return certificateFactory3;
        }
        synchronized (LOCK) {
            CertificateFactory certificateFactory4 = certificateFactory;
            certificateFactory2 = certificateFactory4;
            if (certificateFactory4 == null) {
                certificateFactory2 = CertificateFactory.getInstance("X.509");
                certificateFactory = certificateFactory2;
            }
        }
        return certificateFactory2;
    }

    private static X509TrustManager getTrustManager() throws GeneralSecurityException {
        X509TrustManager x509TrustManager;
        X509TrustManager x509TrustManager2 = trustManager;
        if (x509TrustManager2 != null) {
            return x509TrustManager2;
        }
        synchronized (LOCK) {
            X509TrustManager x509TrustManager3 = trustManager;
            x509TrustManager = x509TrustManager3;
            if (x509TrustManager3 == null) {
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init((KeyStore) null);
                TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                int length = trustManagers.length;
                int i7 = 0;
                while (true) {
                    x509TrustManager = x509TrustManager3;
                    if (i7 >= length) {
                        break;
                    }
                    TrustManager trustManager2 = trustManagers[i7];
                    if (trustManager2 instanceof X509TrustManager) {
                        x509TrustManager = (X509TrustManager) trustManager2;
                        trustManager = x509TrustManager;
                        break;
                    }
                    i7++;
                }
            }
        }
        if (x509TrustManager != null) {
            return x509TrustManager;
        }
        throw new CertificateException("default X509TrustManager not found");
    }

    private static X509TrustManagerExtensions getTrustManagerExtensions() throws GeneralSecurityException {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        X509TrustManagerExtensions x509TrustManagerExtensions2 = trustManagerExtensions;
        if (x509TrustManagerExtensions2 != null) {
            return x509TrustManagerExtensions2;
        }
        synchronized (LOCK) {
            X509TrustManagerExtensions x509TrustManagerExtensions3 = trustManagerExtensions;
            x509TrustManagerExtensions = x509TrustManagerExtensions3;
            if (x509TrustManagerExtensions3 == null) {
                x509TrustManagerExtensions = new X509TrustManagerExtensions(getTrustManager());
                trustManagerExtensions = x509TrustManagerExtensions;
            }
        }
        return x509TrustManagerExtensions;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    @androidx.annotation.Keep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void verifyServerCertificates(byte[][] r7, java.lang.String r8, java.lang.String r9) throws java.security.GeneralSecurityException {
        /*
            r0 = r7
            if (r0 == 0) goto L77
            r0 = r7
            int r0 = r0.length
            if (r0 == 0) goto L77
            r0 = r7
            int r0 = r0.length
            java.security.cert.X509Certificate[] r0 = new java.security.cert.X509Certificate[r0]
            r11 = r0
            java.security.cert.CertificateFactory r0 = getCertificateFactory()
            r13 = r0
            r0 = 0
            r10 = r0
        L17:
            r0 = r10
            r1 = r7
            int r1 = r1.length
            if (r0 >= r1) goto L52
            r0 = r7
            r1 = r10
            r0 = r0[r1]
            r12 = r0
            r0 = r12
            if (r0 == 0) goto L48
            r0 = r12
            int r0 = r0.length
            if (r0 == 0) goto L48
            r0 = r11
            r1 = r10
            r2 = r13
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream
            r4 = r3
            r5 = r12
            r4.<init>(r5)
            java.security.cert.Certificate r2 = r2.generateCertificate(r3)
            java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2
            r0[r1] = r2
            int r10 = r10 + 1
            goto L17
        L48:
            java.security.cert.CertificateException r0 = new java.security.cert.CertificateException
            r1 = r0
            java.lang.String r2 = "server certificate entry is empty"
            r1.<init>(r2)
            throw r0
        L52:
            r0 = r8
            if (r0 == 0) goto L5f
            r0 = r8
            r7 = r0
            r0 = r8
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L62
        L5f:
            java.lang.String r0 = "RSA"
            r7 = r0
        L62:
            r0 = r9
            r8 = r0
            r0 = r9
            if (r0 != 0) goto L6b
            java.lang.String r0 = ""
            r8 = r0
        L6b:
            android.net.http.X509TrustManagerExtensions r0 = getTrustManagerExtensions()
            r1 = r11
            r2 = r7
            r3 = r8
            java.util.List r0 = r0.checkServerTrusted(r1, r2, r3)
            return
        L77:
            java.security.cert.CertificateException r0 = new java.security.cert.CertificateException
            r1 = r0
            java.lang.String r2 = "server certificate chain is empty"
            r1.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.mediastreaming.flashpoint.AndroidCertificateVerifier.verifyServerCertificates(byte[][], java.lang.String, java.lang.String):void");
    }
}
