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

import com.aspectgaming.net.ProtoUtil;

public final class SymbolPaysData implements Externalizable, Message<SymbolPaysData>, Schema<SymbolPaysData> {

    public static Schema<SymbolPaysData> getSchema() {
        return DEFAULT_INSTANCE;
    }

    public static SymbolPaysData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    static final SymbolPaysData DEFAULT_INSTANCE = new SymbolPaysData();

    public int Symbol;
    public int[] Pays;

    public SymbolPaysData() {}

    @Override
    public String toString() {
        return "SymbolPaysData{" + "symbol=" + Symbol + ", pays=" + Pays + '}';
    }

    // java serialization

    public void readExternal(ObjectInput in) throws IOException {
        GraphIOUtil.mergeDelimitedFrom(in, this, this);
    }

    public void writeExternal(ObjectOutput out) throws IOException {
        GraphIOUtil.writeDelimitedTo(out, this, this);
    }

    // message method

    public Schema<SymbolPaysData> cachedSchema() {
        return DEFAULT_INSTANCE;
    }

    // schema methods

    public SymbolPaysData newMessage() {
        return new SymbolPaysData();
    }

    public Class<SymbolPaysData> typeClass() {
        return SymbolPaysData.class;
    }

    public String messageName() {
        return SymbolPaysData.class.getSimpleName();
    }

    public String messageFullName() {
        return SymbolPaysData.class.getName();
    }

    public boolean isInitialized(SymbolPaysData message) {
        return true;
    }

    public void mergeFrom(Input input, SymbolPaysData message) throws IOException {
        List<Integer> Pays = null;
        try {
            for (int number = input.readFieldNumber(this);; number = input.readFieldNumber(this)) {
                switch (number) {
                case 0:
                    return;
                case 1:
                    message.Symbol = input.readInt32();
                    break;
                case 2:
                    if (Pays == null) Pays = new ArrayList<Integer>();
                    Pays.add(input.readInt32());
                    break;
                default:
                    input.handleUnknownField(number, this);
                }
            }
        } finally {
            message.Pays = ProtoUtil.toIntArray(Pays);
        }
    }

    public void writeTo(Output output, SymbolPaysData message) throws IOException {
        if (message.Symbol != 0) output.writeInt32(1, message.Symbol, false);

        if (message.Pays != null) {
            for (Integer pays : message.Pays) {
                if (pays != null) output.writeInt32(2, pays, true);
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
