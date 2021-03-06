// Generated by http://code.google.com/p/protostuff/ ... DO NOT EDIT!
// Generated from GameProtocol.proto

package com.aspectgaming.net.game.data;

import io.protostuff.*;

import javax.annotation.Generated;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

@Generated("java_bean")
public final class ButtonPanelData implements Externalizable, Message<ButtonPanelData>, Schema<ButtonPanelData>
{

    public static Schema<ButtonPanelData> getSchema()
    {
        return DEFAULT_INSTANCE;
    }

    public static ButtonPanelData getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final ButtonPanelData DEFAULT_INSTANCE = new ButtonPanelData();

    
    private String panelName;
    private List<ButtonData> buttons;

    public ButtonPanelData()
    {

    }

    @Override
    public String toString() {
        return "ButtonPanelData{" +
                    "panelName=" + panelName +
                    ", buttons=" + buttons +
                '}';
    }
    // getters and setters

    // panelName

    public String getPanelName()
    {
        return panelName;
    }


    public void setPanelName(String panelName)
    {
        this.panelName = panelName;
    }

    // buttons

    public List<ButtonData> getButtonsList()
    {
        return buttons;
    }


    public void setButtonsList(List<ButtonData> buttons)
    {
        this.buttons = buttons;
    }

    // java serialization

    public void readExternal(ObjectInput in) throws IOException
    {
        GraphIOUtil.mergeDelimitedFrom(in, this, this);
    }

    public void writeExternal(ObjectOutput out) throws IOException
    {
        GraphIOUtil.writeDelimitedTo(out, this, this);
    }

    // message method

    public Schema<ButtonPanelData> cachedSchema()
    {
        return DEFAULT_INSTANCE;
    }

    // schema methods

    public ButtonPanelData newMessage()
    {
        return new ButtonPanelData();
    }

    public Class<ButtonPanelData> typeClass()
    {
        return ButtonPanelData.class;
    }

    public String messageName()
    {
        return ButtonPanelData.class.getSimpleName();
    }

    public String messageFullName()
    {
        return ButtonPanelData.class.getName();
    }

    public boolean isInitialized(ButtonPanelData message)
    {
        return true;
    }

    public void mergeFrom(Input input, ButtonPanelData message) throws IOException
    {
        try {
        for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
        {
            switch(number)
            {
                case 0:
                    return;
                case 1:
                    message.panelName = input.readString();
                    break;
                case 2:
                    if(message.buttons == null)
                        message.buttons = new ArrayList<ButtonData>();
                    message.buttons.add(input.mergeObject(null, ButtonData.getSchema()));
                    break;

                default:
                    input.handleUnknownField(number, this);
            }   
        }
        } finally {
        if (message.buttons != null)
            message.buttons = java.util.Collections.unmodifiableList(message.buttons);
        else
            message.buttons = java.util.Collections.emptyList();
        }
    }


    public void writeTo(Output output, ButtonPanelData message) throws IOException
    {
        if(message.panelName != null)
            output.writeString(1, message.panelName, false);

        if(message.buttons != null)
        {
            for(ButtonData buttons : message.buttons)
            {
                if(buttons != null)
                    output.writeObject(2, buttons, ButtonData.getSchema(), true);
            }
        }

    }

    public String getFieldName(int number)
    {
        return Integer.toString(number);
    }

    public int getFieldNumber(String name)
    {
        return Integer.parseInt(name);
    }
    
}
