package kr.mju.tonic.webhelper;

import java.io.File;
import java.util.StringTokenizer;

public class Puzzle {
	private String songTitle;
	private String audioFileURL;
	private String code;
	private int beginNote;
	private int endNote;
	private int noteCount;
	private int prototypeId;
	
	public Puzzle(File e) {
		StringTokenizer tok = new StringTokenizer(e.getName(), "_");
		
		songTitle = tok.nextToken();
		audioFileURL = Defines.WEB_AUDIO_PATH + e.getName();
		code = tok.nextToken();
		beginNote = Integer.parseInt(tok.nextToken());
		endNote = Integer.parseInt(tok.nextToken());
		setNoteCount(Integer.parseInt(tok.nextToken()));
		
		String pIdToken = tok.nextToken();
		prototypeId = Integer.parseInt(pIdToken.substring(0, pIdToken.lastIndexOf(".")));
	}

	public String getAudioFileURL() {
		return audioFileURL;
	}

	public void setAudioFileURL(String audioFileURL) {
		this.audioFileURL = audioFileURL;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getBeginNote() {
		return beginNote;
	}

	public void setBeginNote(int beginNote) {
		this.beginNote = beginNote;
	}

	public int getEndNote() {
		return endNote;
	}

	public void setEndNote(int endNote) {
		this.endNote = endNote;
	}

	public int getPrototypeId() {
		return prototypeId;
	}

	public void setPrototypeId(int prototypeId) {
		this.prototypeId = prototypeId;
	}

	public String getSongTitle() {
		return songTitle;
	}

	public void setSongTitle(String songTitle) {
		this.songTitle = songTitle;
	}

	public int getNoteCount() {
		return noteCount;
	}

	public void setNoteCount(int noteCount) {
		this.noteCount = noteCount;
	}
}
