package com.impossibl.postgres.protocol;

import java.io.IOException;

import com.impossibl.postgres.Context;
import com.impossibl.postgres.utils.DataInputStream;

public class CommandCompleteMP implements MessageProcessor {

	@Override
	public void process(Protocol proto, DataInputStream in, Context context) throws IOException {

		String commandTag = in.readCString();
		
		context.commandComplete(commandTag);
		
	}

}