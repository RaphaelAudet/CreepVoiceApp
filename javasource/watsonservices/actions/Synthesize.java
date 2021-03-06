// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package watsonservices.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.webui.CustomJavaAction;
import watsonservices.utils.TextToSpeechService;

public class Synthesize extends CustomJavaAction<IMendixObject>
{
	private String username;
	private String password;
	private String text;
	private watsonservices.proxies.VoiceEnum voice;

	public Synthesize(IContext context, String username, String password, String text, String voice)
	{
		super(context);
		this.username = username;
		this.password = password;
		this.text = text;
		this.voice = voice == null ? null : watsonservices.proxies.VoiceEnum.valueOf(voice);
	}

	@Override
	public IMendixObject executeAction() throws Exception
	{
		// BEGIN USER CODE
		return TextToSpeechService.Synthesize(getContext(), text, voice, username, password);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "Synthesize";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
