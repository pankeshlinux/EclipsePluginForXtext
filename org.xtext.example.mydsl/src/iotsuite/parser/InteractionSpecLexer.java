// $ANTLR 3.5.1 C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g 2015-11-17 22:36:39

  package iotsuite.parser; 
  


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InteractionSpecLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__8=8;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int CAPITALIZED_ID=4;
	public static final int ID=5;
	public static final int INT=6;
	public static final int WS=7;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public InteractionSpecLexer() {} 
	public InteractionSpecLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public InteractionSpecLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g"; }

	// $ANTLR start "T__8"
	public final void mT__8() throws RecognitionException {
		try {
			int _type = T__8;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:12:6: ( '(' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:12:8: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__8"

	// $ANTLR start "T__9"
	public final void mT__9() throws RecognitionException {
		try {
			int _type = T__9;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:13:6: ( ')' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:13:8: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__9"

	// $ANTLR start "T__10"
	public final void mT__10() throws RecognitionException {
		try {
			int _type = T__10;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:14:7: ( ',' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:14:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__10"

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:15:7: ( ':' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:15:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__11"

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:16:7: ( ';' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:16:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:17:7: ( 'Boolean' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:17:9: 'Boolean'
			{
			match("Boolean"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:18:7: ( 'Integer' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:18:9: 'Integer'
			{
			match("Integer"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:19:7: ( 'String' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:19:9: 'String'
			{
			match("String"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:20:7: ( 'action' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:20:9: 'action'
			{
			match("action"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:21:7: ( 'boolean' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:21:9: 'boolean'
			{
			match("boolean"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:22:7: ( 'command' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:22:9: 'command'
			{
			match("command"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:23:7: ( 'double' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:23:9: 'double'
			{
			match("double"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:24:7: ( 'from' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:24:9: 'from'
			{
			match("from"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:25:7: ( 'long' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:25:9: 'long'
			{
			match("long"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:26:7: ( 'notify' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:26:9: 'notify'
			{
			match("notify"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:27:7: ( 'request' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:27:9: 'request'
			{
			match("request"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:28:7: ( 'resources' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:28:9: 'resources'
			{
			match("resources"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:29:7: ( 'structs' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:29:9: 'structs'
			{
			match("structs"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:30:7: ( 'to' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:30:9: 'to'
			{
			match("to"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:31:7: ( 'userInteractions' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:31:9: 'userInteractions'
			{
			match("userInteractions"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:32:7: ( 'with' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:32:9: 'with'
			{
			match("with"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__28"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:59:5: ( 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:59:7: 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			{
			matchRange('a','z'); 
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:59:17: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:62:5: ( '0' .. '9' ( '0' .. '9' )* )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:62:7: '0' .. '9' ( '0' .. '9' )*
			{
			matchRange('0','9'); 
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:62:15: ( '0' .. '9' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop2;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "CAPITALIZED_ID"
	public final void mCAPITALIZED_ID() throws RecognitionException {
		try {
			int _type = CAPITALIZED_ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:64:15: ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' )* )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:64:17: 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' )*
			{
			matchRange('A','Z'); 
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:64:26: ( 'a' .. 'z' | 'A' .. 'Z' )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= 'A' && LA3_0 <= 'Z')||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:
					{
					if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop3;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CAPITALIZED_ID"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:66:3: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:66:5: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
			{
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:66:5: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '\t' && LA4_0 <= '\n')||(LA4_0 >= '\f' && LA4_0 <= '\r')||LA4_0==' ') ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			_channel = HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:1:8: ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | ID | INT | CAPITALIZED_ID | WS )
		int alt5=25;
		alt5 = dfa5.predict(input);
		switch (alt5) {
			case 1 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:1:10: T__8
				{
				mT__8(); 

				}
				break;
			case 2 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:1:15: T__9
				{
				mT__9(); 

				}
				break;
			case 3 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:1:20: T__10
				{
				mT__10(); 

				}
				break;
			case 4 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:1:26: T__11
				{
				mT__11(); 

				}
				break;
			case 5 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:1:32: T__12
				{
				mT__12(); 

				}
				break;
			case 6 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:1:38: T__13
				{
				mT__13(); 

				}
				break;
			case 7 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:1:44: T__14
				{
				mT__14(); 

				}
				break;
			case 8 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:1:50: T__15
				{
				mT__15(); 

				}
				break;
			case 9 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:1:56: T__16
				{
				mT__16(); 

				}
				break;
			case 10 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:1:62: T__17
				{
				mT__17(); 

				}
				break;
			case 11 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:1:68: T__18
				{
				mT__18(); 

				}
				break;
			case 12 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:1:74: T__19
				{
				mT__19(); 

				}
				break;
			case 13 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:1:80: T__20
				{
				mT__20(); 

				}
				break;
			case 14 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:1:86: T__21
				{
				mT__21(); 

				}
				break;
			case 15 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:1:92: T__22
				{
				mT__22(); 

				}
				break;
			case 16 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:1:98: T__23
				{
				mT__23(); 

				}
				break;
			case 17 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:1:104: T__24
				{
				mT__24(); 

				}
				break;
			case 18 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:1:110: T__25
				{
				mT__25(); 

				}
				break;
			case 19 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:1:116: T__26
				{
				mT__26(); 

				}
				break;
			case 20 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:1:122: T__27
				{
				mT__27(); 

				}
				break;
			case 21 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:1:128: T__28
				{
				mT__28(); 

				}
				break;
			case 22 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:1:134: ID
				{
				mID(); 

				}
				break;
			case 23 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:1:137: INT
				{
				mINT(); 

				}
				break;
			case 24 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:1:141: CAPITALIZED_ID
				{
				mCAPITALIZED_ID(); 

				}
				break;
			case 25 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:1:156: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA5 dfa5 = new DFA5(this);
	static final String DFA5_eotS =
		"\6\uffff\3\27\14\25\4\uffff\3\27\11\25\1\65\2\25\3\27\12\25\1\uffff\2"+
		"\25\3\27\4\25\1\116\1\117\5\25\1\125\3\27\4\25\2\uffff\5\25\1\uffff\2"+
		"\27\1\144\1\145\2\25\1\150\1\151\4\25\1\156\1\157\2\uffff\1\160\1\161"+
		"\2\uffff\1\162\1\25\1\164\1\25\5\uffff\1\25\1\uffff\1\25\1\170\1\25\1"+
		"\uffff\6\25\1\u0080\1\uffff";
	static final String DFA5_eofS =
		"\u0081\uffff";
	static final String DFA5_minS =
		"\1\11\5\uffff\1\157\1\156\1\164\1\143\3\157\1\162\2\157\1\145\1\164\1"+
		"\157\1\163\1\151\4\uffff\1\157\1\164\1\162\1\164\1\157\1\155\1\165\1\157"+
		"\1\156\1\164\1\161\1\162\1\60\1\145\1\164\1\154\1\145\2\151\1\154\1\155"+
		"\1\142\1\155\1\147\1\151\1\165\1\157\1\165\1\uffff\1\162\1\150\1\145\1"+
		"\147\1\156\1\157\1\145\1\141\1\154\2\60\1\146\1\145\1\165\1\143\1\111"+
		"\1\60\1\141\1\145\1\147\1\156\1\141\1\156\1\145\2\uffff\1\171\1\163\1"+
		"\162\1\164\1\156\1\uffff\1\156\1\162\1\101\1\60\1\156\1\144\2\60\1\164"+
		"\1\143\1\163\1\164\2\101\2\uffff\2\60\2\uffff\1\60\1\145\1\60\1\145\5"+
		"\uffff\1\163\1\uffff\1\162\1\60\1\141\1\uffff\1\143\1\164\1\151\1\157"+
		"\1\156\1\163\1\60\1\uffff";
	static final String DFA5_maxS =
		"\1\172\5\uffff\1\157\1\156\1\164\1\143\3\157\1\162\2\157\1\145\1\164\1"+
		"\157\1\163\1\151\4\uffff\1\157\1\164\1\162\1\164\1\157\1\155\1\165\1\157"+
		"\1\156\1\164\1\163\1\162\1\172\1\145\1\164\1\154\1\145\2\151\1\154\1\155"+
		"\1\142\1\155\1\147\1\151\1\165\1\157\1\165\1\uffff\1\162\1\150\1\145\1"+
		"\147\1\156\1\157\1\145\1\141\1\154\2\172\1\146\1\145\1\165\1\143\1\111"+
		"\1\172\1\141\1\145\1\147\1\156\1\141\1\156\1\145\2\uffff\1\171\1\163\1"+
		"\162\1\164\1\156\1\uffff\1\156\1\162\2\172\1\156\1\144\2\172\1\164\1\143"+
		"\1\163\1\164\2\172\2\uffff\2\172\2\uffff\1\172\1\145\1\172\1\145\5\uffff"+
		"\1\163\1\uffff\1\162\1\172\1\141\1\uffff\1\143\1\164\1\151\1\157\1\156"+
		"\1\163\1\172\1\uffff";
	static final String DFA5_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\17\uffff\1\26\1\27\1\30\1\31\34\uffff\1\23"+
		"\30\uffff\1\15\1\16\5\uffff\1\25\16\uffff\1\10\1\11\2\uffff\1\14\1\17"+
		"\4\uffff\1\6\1\7\1\12\1\13\1\20\1\uffff\1\22\3\uffff\1\21\7\uffff\1\24";
	static final String DFA5_specialS =
		"\u0081\uffff}>";
	static final String[] DFA5_transitionS = {
			"\2\30\1\uffff\2\30\22\uffff\1\30\7\uffff\1\1\1\2\2\uffff\1\3\3\uffff"+
			"\12\26\1\4\1\5\5\uffff\1\27\1\6\6\27\1\7\11\27\1\10\7\27\6\uffff\1\11"+
			"\1\12\1\13\1\14\1\25\1\15\5\25\1\16\1\25\1\17\3\25\1\20\1\21\1\22\1\23"+
			"\1\25\1\24\3\25",
			"",
			"",
			"",
			"",
			"",
			"\1\31",
			"\1\32",
			"\1\33",
			"\1\34",
			"\1\35",
			"\1\36",
			"\1\37",
			"\1\40",
			"\1\41",
			"\1\42",
			"\1\43",
			"\1\44",
			"\1\45",
			"\1\46",
			"\1\47",
			"",
			"",
			"",
			"",
			"\1\50",
			"\1\51",
			"\1\52",
			"\1\53",
			"\1\54",
			"\1\55",
			"\1\56",
			"\1\57",
			"\1\60",
			"\1\61",
			"\1\62\1\uffff\1\63",
			"\1\64",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\1\66",
			"\1\67",
			"\1\70",
			"\1\71",
			"\1\72",
			"\1\73",
			"\1\74",
			"\1\75",
			"\1\76",
			"\1\77",
			"\1\100",
			"\1\101",
			"\1\102",
			"\1\103",
			"\1\104",
			"",
			"\1\105",
			"\1\106",
			"\1\107",
			"\1\110",
			"\1\111",
			"\1\112",
			"\1\113",
			"\1\114",
			"\1\115",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\1\120",
			"\1\121",
			"\1\122",
			"\1\123",
			"\1\124",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\1\126",
			"\1\127",
			"\1\130",
			"\1\131",
			"\1\132",
			"\1\133",
			"\1\134",
			"",
			"",
			"\1\135",
			"\1\136",
			"\1\137",
			"\1\140",
			"\1\141",
			"",
			"\1\142",
			"\1\143",
			"\32\27\6\uffff\32\27",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\1\146",
			"\1\147",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\1\152",
			"\1\153",
			"\1\154",
			"\1\155",
			"\32\27\6\uffff\32\27",
			"\32\27\6\uffff\32\27",
			"",
			"",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"",
			"",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\1\163",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\1\165",
			"",
			"",
			"",
			"",
			"",
			"\1\166",
			"",
			"\1\167",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\1\171",
			"",
			"\1\172",
			"\1\173",
			"\1\174",
			"\1\175",
			"\1\176",
			"\1\177",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			""
	};

	static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
	static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
	static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
	static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
	static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
	static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
	static final short[][] DFA5_transition;

	static {
		int numStates = DFA5_transitionS.length;
		DFA5_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
		}
	}

	protected class DFA5 extends DFA {

		public DFA5(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 5;
			this.eot = DFA5_eot;
			this.eof = DFA5_eof;
			this.min = DFA5_min;
			this.max = DFA5_max;
			this.accept = DFA5_accept;
			this.special = DFA5_special;
			this.transition = DFA5_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | ID | INT | CAPITALIZED_ID | WS );";
		}
	}

}
