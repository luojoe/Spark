package org.jivesoftware.spark.ui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import org.jivesoftware.resource.Res;
import org.jivesoftware.smackx.chatstates.ChatState;

public class ChatStatePanel extends JPanel{

	public ChatStatePanel(ChatState state, CharSequence nickname) {
		setLayout(new FlowLayout(FlowLayout.LEFT, 1, 1));
		JLabel label = new JLabel( Res.getString( state.name(), nickname.toString() ) );
		label.setFont(new Font("Courier New", Font.PLAIN, 9));
		label.setForeground(Color.gray);
		label.setHorizontalTextPosition(JLabel.LEFT);
		label.setVerticalTextPosition(JLabel.BOTTOM);
		add( label );
	}
}
