/**
 * This class file was automatically generated by jASN1 v1.9.1-SNAPSHOT (http://www.openmuc.org)
 */

package org.openmuc.openiec61850.internal.mms.asn1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import org.openmuc.jasn1.ber.*;
import org.openmuc.jasn1.ber.types.*;

public class RejectPDU implements Serializable {

    private static final long serialVersionUID = 1L;

    public static class RejectReason implements Serializable {

        private static final long serialVersionUID = 1L;

        public byte[] code = null;
        private BerInteger confirmedRequestPDU = null;
        private BerInteger confirmedResponsePDU = null;
        private BerInteger confirmedErrorPDU = null;
        private BerInteger unconfirmedPDU = null;
        private BerInteger pduError = null;
        private BerInteger cancelRequestPDU = null;
        private BerInteger cancelResponsePDU = null;
        private BerInteger cancelErrorPDU = null;
        private BerInteger concludeRequestPDU = null;
        private BerInteger concludeResponsePDU = null;
        private BerInteger concludeErrorPDU = null;

        public RejectReason() {
        }

        public RejectReason(byte[] code) {
            this.code = code;
        }

        public void setConfirmedRequestPDU(BerInteger confirmedRequestPDU) {
            this.confirmedRequestPDU = confirmedRequestPDU;
        }

        public BerInteger getConfirmedRequestPDU() {
            return confirmedRequestPDU;
        }

        public void setConfirmedResponsePDU(BerInteger confirmedResponsePDU) {
            this.confirmedResponsePDU = confirmedResponsePDU;
        }

        public BerInteger getConfirmedResponsePDU() {
            return confirmedResponsePDU;
        }

        public void setConfirmedErrorPDU(BerInteger confirmedErrorPDU) {
            this.confirmedErrorPDU = confirmedErrorPDU;
        }

        public BerInteger getConfirmedErrorPDU() {
            return confirmedErrorPDU;
        }

        public void setUnconfirmedPDU(BerInteger unconfirmedPDU) {
            this.unconfirmedPDU = unconfirmedPDU;
        }

        public BerInteger getUnconfirmedPDU() {
            return unconfirmedPDU;
        }

        public void setPduError(BerInteger pduError) {
            this.pduError = pduError;
        }

        public BerInteger getPduError() {
            return pduError;
        }

        public void setCancelRequestPDU(BerInteger cancelRequestPDU) {
            this.cancelRequestPDU = cancelRequestPDU;
        }

        public BerInteger getCancelRequestPDU() {
            return cancelRequestPDU;
        }

        public void setCancelResponsePDU(BerInteger cancelResponsePDU) {
            this.cancelResponsePDU = cancelResponsePDU;
        }

        public BerInteger getCancelResponsePDU() {
            return cancelResponsePDU;
        }

        public void setCancelErrorPDU(BerInteger cancelErrorPDU) {
            this.cancelErrorPDU = cancelErrorPDU;
        }

        public BerInteger getCancelErrorPDU() {
            return cancelErrorPDU;
        }

        public void setConcludeRequestPDU(BerInteger concludeRequestPDU) {
            this.concludeRequestPDU = concludeRequestPDU;
        }

        public BerInteger getConcludeRequestPDU() {
            return concludeRequestPDU;
        }

        public void setConcludeResponsePDU(BerInteger concludeResponsePDU) {
            this.concludeResponsePDU = concludeResponsePDU;
        }

        public BerInteger getConcludeResponsePDU() {
            return concludeResponsePDU;
        }

        public void setConcludeErrorPDU(BerInteger concludeErrorPDU) {
            this.concludeErrorPDU = concludeErrorPDU;
        }

        public BerInteger getConcludeErrorPDU() {
            return concludeErrorPDU;
        }

        public int encode(OutputStream os) throws IOException {

            if (code != null) {
                for (int i = code.length - 1; i >= 0; i--) {
                    os.write(code[i]);
                }
                return code.length;
            }

            int codeLength = 0;
            if (concludeErrorPDU != null) {
                codeLength += concludeErrorPDU.encode(os, false);
                // write tag: CONTEXT_CLASS, PRIMITIVE, 11
                os.write(0x8B);
                codeLength += 1;
                return codeLength;
            }

            if (concludeResponsePDU != null) {
                codeLength += concludeResponsePDU.encode(os, false);
                // write tag: CONTEXT_CLASS, PRIMITIVE, 10
                os.write(0x8A);
                codeLength += 1;
                return codeLength;
            }

            if (concludeRequestPDU != null) {
                codeLength += concludeRequestPDU.encode(os, false);
                // write tag: CONTEXT_CLASS, PRIMITIVE, 9
                os.write(0x89);
                codeLength += 1;
                return codeLength;
            }

            if (cancelErrorPDU != null) {
                codeLength += cancelErrorPDU.encode(os, false);
                // write tag: CONTEXT_CLASS, PRIMITIVE, 8
                os.write(0x88);
                codeLength += 1;
                return codeLength;
            }

            if (cancelResponsePDU != null) {
                codeLength += cancelResponsePDU.encode(os, false);
                // write tag: CONTEXT_CLASS, PRIMITIVE, 7
                os.write(0x87);
                codeLength += 1;
                return codeLength;
            }

            if (cancelRequestPDU != null) {
                codeLength += cancelRequestPDU.encode(os, false);
                // write tag: CONTEXT_CLASS, PRIMITIVE, 6
                os.write(0x86);
                codeLength += 1;
                return codeLength;
            }

            if (pduError != null) {
                codeLength += pduError.encode(os, false);
                // write tag: CONTEXT_CLASS, PRIMITIVE, 5
                os.write(0x85);
                codeLength += 1;
                return codeLength;
            }

            if (unconfirmedPDU != null) {
                codeLength += unconfirmedPDU.encode(os, false);
                // write tag: CONTEXT_CLASS, PRIMITIVE, 4
                os.write(0x84);
                codeLength += 1;
                return codeLength;
            }

            if (confirmedErrorPDU != null) {
                codeLength += confirmedErrorPDU.encode(os, false);
                // write tag: CONTEXT_CLASS, PRIMITIVE, 3
                os.write(0x83);
                codeLength += 1;
                return codeLength;
            }

            if (confirmedResponsePDU != null) {
                codeLength += confirmedResponsePDU.encode(os, false);
                // write tag: CONTEXT_CLASS, PRIMITIVE, 2
                os.write(0x82);
                codeLength += 1;
                return codeLength;
            }

            if (confirmedRequestPDU != null) {
                codeLength += confirmedRequestPDU.encode(os, false);
                // write tag: CONTEXT_CLASS, PRIMITIVE, 1
                os.write(0x81);
                codeLength += 1;
                return codeLength;
            }

            throw new IOException("Error encoding CHOICE: No element of CHOICE was selected.");
        }

        public int decode(InputStream is) throws IOException {
            return decode(is, null);
        }

        public int decode(InputStream is, BerTag berTag) throws IOException {

            int codeLength = 0;
            BerTag passedTag = berTag;

            if (berTag == null) {
                berTag = new BerTag();
                codeLength += berTag.decode(is);
            }

            if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 1)) {
                confirmedRequestPDU = new BerInteger();
                codeLength += confirmedRequestPDU.decode(is, false);
                return codeLength;
            }

            if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 2)) {
                confirmedResponsePDU = new BerInteger();
                codeLength += confirmedResponsePDU.decode(is, false);
                return codeLength;
            }

            if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 3)) {
                confirmedErrorPDU = new BerInteger();
                codeLength += confirmedErrorPDU.decode(is, false);
                return codeLength;
            }

            if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 4)) {
                unconfirmedPDU = new BerInteger();
                codeLength += unconfirmedPDU.decode(is, false);
                return codeLength;
            }

            if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 5)) {
                pduError = new BerInteger();
                codeLength += pduError.decode(is, false);
                return codeLength;
            }

            if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 6)) {
                cancelRequestPDU = new BerInteger();
                codeLength += cancelRequestPDU.decode(is, false);
                return codeLength;
            }

            if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 7)) {
                cancelResponsePDU = new BerInteger();
                codeLength += cancelResponsePDU.decode(is, false);
                return codeLength;
            }

            if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 8)) {
                cancelErrorPDU = new BerInteger();
                codeLength += cancelErrorPDU.decode(is, false);
                return codeLength;
            }

            if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 9)) {
                concludeRequestPDU = new BerInteger();
                codeLength += concludeRequestPDU.decode(is, false);
                return codeLength;
            }

            if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 10)) {
                concludeResponsePDU = new BerInteger();
                codeLength += concludeResponsePDU.decode(is, false);
                return codeLength;
            }

            if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 11)) {
                concludeErrorPDU = new BerInteger();
                codeLength += concludeErrorPDU.decode(is, false);
                return codeLength;
            }

            if (passedTag != null) {
                return 0;
            }

            throw new IOException("Error decoding CHOICE: Tag " + berTag + " matched to no item.");
        }

        public void encodeAndSave(int encodingSizeGuess) throws IOException {
            ReverseByteArrayOutputStream os = new ReverseByteArrayOutputStream(encodingSizeGuess);
            encode(os);
            code = os.getArray();
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            appendAsString(sb, 0);
            return sb.toString();
        }

        public void appendAsString(StringBuilder sb, int indentLevel) {

            if (confirmedRequestPDU != null) {
                sb.append("confirmedRequestPDU: ").append(confirmedRequestPDU);
                return;
            }

            if (confirmedResponsePDU != null) {
                sb.append("confirmedResponsePDU: ").append(confirmedResponsePDU);
                return;
            }

            if (confirmedErrorPDU != null) {
                sb.append("confirmedErrorPDU: ").append(confirmedErrorPDU);
                return;
            }

            if (unconfirmedPDU != null) {
                sb.append("unconfirmedPDU: ").append(unconfirmedPDU);
                return;
            }

            if (pduError != null) {
                sb.append("pduError: ").append(pduError);
                return;
            }

            if (cancelRequestPDU != null) {
                sb.append("cancelRequestPDU: ").append(cancelRequestPDU);
                return;
            }

            if (cancelResponsePDU != null) {
                sb.append("cancelResponsePDU: ").append(cancelResponsePDU);
                return;
            }

            if (cancelErrorPDU != null) {
                sb.append("cancelErrorPDU: ").append(cancelErrorPDU);
                return;
            }

            if (concludeRequestPDU != null) {
                sb.append("concludeRequestPDU: ").append(concludeRequestPDU);
                return;
            }

            if (concludeResponsePDU != null) {
                sb.append("concludeResponsePDU: ").append(concludeResponsePDU);
                return;
            }

            if (concludeErrorPDU != null) {
                sb.append("concludeErrorPDU: ").append(concludeErrorPDU);
                return;
            }

            sb.append("<none>");
        }

    }

    public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);

    public byte[] code = null;
    private Unsigned32 originalInvokeID = null;
    private RejectReason rejectReason = null;

    public RejectPDU() {
    }

    public RejectPDU(byte[] code) {
        this.code = code;
    }

    public void setOriginalInvokeID(Unsigned32 originalInvokeID) {
        this.originalInvokeID = originalInvokeID;
    }

    public Unsigned32 getOriginalInvokeID() {
        return originalInvokeID;
    }

    public void setRejectReason(RejectReason rejectReason) {
        this.rejectReason = rejectReason;
    }

    public RejectReason getRejectReason() {
        return rejectReason;
    }

    public int encode(OutputStream os) throws IOException {
        return encode(os, true);
    }

    public int encode(OutputStream os, boolean withTag) throws IOException {

        if (code != null) {
            for (int i = code.length - 1; i >= 0; i--) {
                os.write(code[i]);
            }
            if (withTag) {
                return tag.encode(os) + code.length;
            }
            return code.length;
        }

        int codeLength = 0;
        codeLength += rejectReason.encode(os);

        if (originalInvokeID != null) {
            codeLength += originalInvokeID.encode(os, false);
            // write tag: CONTEXT_CLASS, PRIMITIVE, 0
            os.write(0x80);
            codeLength += 1;
        }

        codeLength += BerLength.encodeLength(os, codeLength);

        if (withTag) {
            codeLength += tag.encode(os);
        }

        return codeLength;

    }

    public int decode(InputStream is) throws IOException {
        return decode(is, true);
    }

    public int decode(InputStream is, boolean withTag) throws IOException {
        int codeLength = 0;
        int subCodeLength = 0;
        BerTag berTag = new BerTag();

        if (withTag) {
            codeLength += tag.decodeAndCheck(is);
        }

        BerLength length = new BerLength();
        codeLength += length.decode(is);

        int totalLength = length.val;
        codeLength += totalLength;

        subCodeLength += berTag.decode(is);
        if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 0)) {
            originalInvokeID = new Unsigned32();
            subCodeLength += originalInvokeID.decode(is, false);
            subCodeLength += berTag.decode(is);
        }

        rejectReason = new RejectReason();
        subCodeLength += rejectReason.decode(is, berTag);
        if (subCodeLength == totalLength) {
            return codeLength;
        }
        throw new IOException("Unexpected end of sequence, length tag: " + totalLength + ", actual sequence length: "
                + subCodeLength);

    }

    public void encodeAndSave(int encodingSizeGuess) throws IOException {
        ReverseByteArrayOutputStream os = new ReverseByteArrayOutputStream(encodingSizeGuess);
        encode(os, false);
        code = os.getArray();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        appendAsString(sb, 0);
        return sb.toString();
    }

    public void appendAsString(StringBuilder sb, int indentLevel) {

        sb.append("{");
        boolean firstSelectedElement = true;
        if (originalInvokeID != null) {
            sb.append("\n");
            for (int i = 0; i < indentLevel + 1; i++) {
                sb.append("\t");
            }
            sb.append("originalInvokeID: ").append(originalInvokeID);
            firstSelectedElement = false;
        }

        if (!firstSelectedElement) {
            sb.append(",\n");
        }
        for (int i = 0; i < indentLevel + 1; i++) {
            sb.append("\t");
        }
        if (rejectReason != null) {
            sb.append("rejectReason: ");
            rejectReason.appendAsString(sb, indentLevel + 1);
        }
        else {
            sb.append("rejectReason: <empty-required-field>");
        }

        sb.append("\n");
        for (int i = 0; i < indentLevel; i++) {
            sb.append("\t");
        }
        sb.append("}");
    }

}
