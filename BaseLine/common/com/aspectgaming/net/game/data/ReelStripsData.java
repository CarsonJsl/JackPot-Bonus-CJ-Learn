// Generated by http://code.google.com/p/protostuff/ ... DO NOT EDIT!
// Generated from GameProtocol.proto

package com.aspectgaming.net.game.data;

import io.protostuff.GraphIOUtil;
import io.protostuff.Input;
import io.protostuff.Message;
import io.protostuff.Output;
import io.protostuff.Schema;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

public final class ReelStripsData implements Externalizable, Message<ReelStripsData>, Schema<ReelStripsData> {

    public static Schema<ReelStripsData> getSchema() {
        return DEFAULT_INSTANCE;
    }

    public static ReelStripsData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    static final ReelStripsData DEFAULT_INSTANCE = new ReelStripsData();

    public List<ReelStripData> ReelStrips;

    public ReelStripsData() {}

    @Override
    public String toString() {
        return "ReelStripsData{" + "reelStrips=" + ReelStrips + '}';
    }

    // java serialization

    public void readExternal(ObjectInput in) throws IOException {
        GraphIOUtil.mergeDelimitedFrom(in, this, this);
    }

    public void writeExternal(ObjectOutput out) throws IOException {
        GraphIOUtil.writeDelimitedTo(out, this, this);
    }

    // message method

    public Schema<ReelStripsData> cachedSchema() {
        return DEFAULT_INSTANCE;
    }

    // schema methods

    public ReelStripsData newMessage() {
        return new ReelStripsData();
    }

    public Class<ReelStripsData> typeClass() {
        return ReelStripsData.class;
    }

    public String messageName() {
        return ReelStripsData.class.getSimpleName();
    }

    public String messageFullName() {
        return ReelStripsData.class.getName();
    }

    public boolean isInitialized(ReelStripsData message) {
        return true;
    }

    public void mergeFrom(Input input, ReelStripsData message) throws IOException {
        for (int number = input.readFieldNumber(this);; number = input.readFieldNumber(this)) {
            switch (number) {
            case 0:
                return;
            case 1:
                if (message.ReelStrips == null) message.ReelStrips = new ArrayList<ReelStripData>();
                message.ReelStrips.add(input.mergeObject(null, ReelStripData.getSchema()));
                break;

            default:
                input.handleUnknownField(number, this);
            }
        }
    }

    public void writeTo(Output output, ReelStripsData message) throws IOException {
        if (message.ReelStrips != null) {
            for (ReelStripData reelStrips : message.ReelStrips) {
                if (reelStrips != null) output.writeObject(1, reelStrips, ReelStripData.getSchema(), true);
            }
        }
    }

    public String getFieldName(int number) {
        return Integer.toString(number);
    }

    public int getFieldNumber(String name) {
        return Integer.parseInt(name);
    }

}
