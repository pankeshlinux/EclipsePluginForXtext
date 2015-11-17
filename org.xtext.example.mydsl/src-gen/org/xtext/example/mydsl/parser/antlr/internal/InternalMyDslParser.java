package org.xtext.example.mydsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


public class InternalMyDslParser extends AbstractInternalAntlrParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ANY_OTHER", "RULE_ID", "RULE_INT", 
		"RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_STRING", "RULE_WS", "'('", 
		"')'", "','", "':'", "';'", "'AVG_BY_SAMPLE'", "'Android'", "'COMPUTE'", 
		"'Custom'", "'InBuilt'", "'Integer'", "'JavaSE'", "'MongoDB'", "'MySQL'", 
		"'SQLAzure'", "'String'", "'accessed-by'", "'action'", "'actuators'", 
		"'boolean'", "'command'", "'computationalService'", "'consume'", "'database'", 
		"'description'", "'devices'", "'double'", "'eventDrivenSensors'", "'for'", 
		"'from'", "'generate'", "'location'", "'long'", "'mqtt'", "'notify'", 
		"'onCondition'", "'period'", "'periodicSensors'", "'platform'", "'protocol'", 
		"'request'", "'resources'", "'sample'", "'sensors'", "'softwareComponents'", 
		"'storages'", "'structs'", "'to'", "'userInteractions'"
	};
	public static final int EOF=-1;
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
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int T__52=52;
	public static final int T__53=53;
	public static final int T__54=54;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
	public static final int T__58=58;
	public static final int T__59=59;
	public static final int RULE_ANY_OTHER=4;
	public static final int RULE_ID=5;
	public static final int RULE_INT=6;
	public static final int RULE_ML_COMMENT=7;
	public static final int RULE_SL_COMMENT=8;
	public static final int RULE_STRING=9;
	public static final int RULE_WS=10;

	// delegates
	public AbstractInternalAntlrParser[] getDelegates() {
		return new AbstractInternalAntlrParser[] {};
	}

	// delegators


	public InternalMyDslParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
	@Override public String getGrammarFileName() { return "../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g"; }



	 	private MyDslGrammarAccess grammarAccess;
	 	
	    public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
	        this(input);
	        this.grammarAccess = grammarAccess;
	        registerRules(grammarAccess.getGrammar());
	    }
	    
	    @Override
	    protected String getFirstRuleName() {
	    	return "Spec";	
	   	}
	   	
	   	@Override
	   	protected MyDslGrammarAccess getGrammarAccess() {
	   		return grammarAccess;
	   	}



	// $ANTLR start "entryRuleSpec"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:67:1: entryRuleSpec returns [EObject current=null] :iv_ruleSpec= ruleSpec EOF ;
	public final EObject entryRuleSpec() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleSpec =null;

		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:68:2: (iv_ruleSpec= ruleSpec EOF )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:69:2: iv_ruleSpec= ruleSpec EOF
			{
			 newCompositeNode(grammarAccess.getSpecRule()); 
			pushFollow(FOLLOW_ruleSpec_in_entryRuleSpec75);
			iv_ruleSpec=ruleSpec();
			state._fsp--;

			 current =iv_ruleSpec; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleSpec85); 
			}

		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleSpec"



	// $ANTLR start "ruleSpec"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:76:1: ruleSpec returns [EObject current=null] : ( ( (lv_vocSpec_0_0= ruleVocSpec ) ) | ( (lv_interactionSpec_1_0= ruleInteractionSpec ) ) | ( (lv_archSpec_2_0= ruleArchSpec ) ) | ( (lv_networkSpec_3_0= ruleDeploymentSpec ) ) ) ;
	public final EObject ruleSpec() throws RecognitionException {
		EObject current = null;


		EObject lv_vocSpec_0_0 =null;
		EObject lv_interactionSpec_1_0 =null;
		EObject lv_archSpec_2_0 =null;
		EObject lv_networkSpec_3_0 =null;

		 enterRule(); 
		    
		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:79:28: ( ( ( (lv_vocSpec_0_0= ruleVocSpec ) ) | ( (lv_interactionSpec_1_0= ruleInteractionSpec ) ) | ( (lv_archSpec_2_0= ruleArchSpec ) ) | ( (lv_networkSpec_3_0= ruleDeploymentSpec ) ) ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:2: ( ( (lv_vocSpec_0_0= ruleVocSpec ) ) | ( (lv_interactionSpec_1_0= ruleInteractionSpec ) ) | ( (lv_archSpec_2_0= ruleArchSpec ) ) | ( (lv_networkSpec_3_0= ruleDeploymentSpec ) ) )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:2: ( ( (lv_vocSpec_0_0= ruleVocSpec ) ) | ( (lv_interactionSpec_1_0= ruleInteractionSpec ) ) | ( (lv_archSpec_2_0= ruleArchSpec ) ) | ( (lv_networkSpec_3_0= ruleDeploymentSpec ) ) )
			int alt1=4;
			alt1 = dfa1.predict(input);
			switch (alt1) {
				case 1 :
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:2: ( (lv_vocSpec_0_0= ruleVocSpec ) )
					{
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:2: ( (lv_vocSpec_0_0= ruleVocSpec ) )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:3: (lv_vocSpec_0_0= ruleVocSpec )
					{
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:3: (lv_vocSpec_0_0= ruleVocSpec )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:82:3: lv_vocSpec_0_0= ruleVocSpec
					{
					 
						        newCompositeNode(grammarAccess.getSpecAccess().getVocSpecVocSpecParserRuleCall_0_0()); 
						    
					pushFollow(FOLLOW_ruleVocSpec_in_ruleSpec131);
					lv_vocSpec_0_0=ruleVocSpec();
					state._fsp--;


						        if (current==null) {
						            current = createModelElementForParent(grammarAccess.getSpecRule());
						        }
					       		set(
					       			current, 
					       			"vocSpec",
					        		lv_vocSpec_0_0, 
					        		"VocSpec");
						        afterParserOrEnumRuleCall();
						    
					}

					}

					}
					break;
				case 2 :
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:99:6: ( (lv_interactionSpec_1_0= ruleInteractionSpec ) )
					{
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:99:6: ( (lv_interactionSpec_1_0= ruleInteractionSpec ) )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:100:3: (lv_interactionSpec_1_0= ruleInteractionSpec )
					{
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:100:3: (lv_interactionSpec_1_0= ruleInteractionSpec )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:101:3: lv_interactionSpec_1_0= ruleInteractionSpec
					{
					 
						        newCompositeNode(grammarAccess.getSpecAccess().getInteractionSpecInteractionSpecParserRuleCall_1_0()); 
						    
					pushFollow(FOLLOW_ruleInteractionSpec_in_ruleSpec158);
					lv_interactionSpec_1_0=ruleInteractionSpec();
					state._fsp--;


						        if (current==null) {
						            current = createModelElementForParent(grammarAccess.getSpecRule());
						        }
					       		set(
					       			current, 
					       			"interactionSpec",
					        		lv_interactionSpec_1_0, 
					        		"InteractionSpec");
						        afterParserOrEnumRuleCall();
						    
					}

					}

					}
					break;
				case 3 :
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:118:6: ( (lv_archSpec_2_0= ruleArchSpec ) )
					{
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:118:6: ( (lv_archSpec_2_0= ruleArchSpec ) )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:119:3: (lv_archSpec_2_0= ruleArchSpec )
					{
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:119:3: (lv_archSpec_2_0= ruleArchSpec )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:120:3: lv_archSpec_2_0= ruleArchSpec
					{
					 
						        newCompositeNode(grammarAccess.getSpecAccess().getArchSpecArchSpecParserRuleCall_2_0()); 
						    
					pushFollow(FOLLOW_ruleArchSpec_in_ruleSpec185);
					lv_archSpec_2_0=ruleArchSpec();
					state._fsp--;


						        if (current==null) {
						            current = createModelElementForParent(grammarAccess.getSpecRule());
						        }
					       		set(
					       			current, 
					       			"archSpec",
					        		lv_archSpec_2_0, 
					        		"ArchSpec");
						        afterParserOrEnumRuleCall();
						    
					}

					}

					}
					break;
				case 4 :
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:137:6: ( (lv_networkSpec_3_0= ruleDeploymentSpec ) )
					{
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:137:6: ( (lv_networkSpec_3_0= ruleDeploymentSpec ) )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:138:3: (lv_networkSpec_3_0= ruleDeploymentSpec )
					{
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:138:3: (lv_networkSpec_3_0= ruleDeploymentSpec )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:139:3: lv_networkSpec_3_0= ruleDeploymentSpec
					{
					 
						        newCompositeNode(grammarAccess.getSpecAccess().getNetworkSpecDeploymentSpecParserRuleCall_3_0()); 
						    
					pushFollow(FOLLOW_ruleDeploymentSpec_in_ruleSpec212);
					lv_networkSpec_3_0=ruleDeploymentSpec();
					state._fsp--;


						        if (current==null) {
						            current = createModelElementForParent(grammarAccess.getSpecRule());
						        }
					       		set(
					       			current, 
					       			"networkSpec",
					        		lv_networkSpec_3_0, 
					        		"DeploymentSpec");
						        afterParserOrEnumRuleCall();
						    
					}

					}

					}
					break;

			}

			}

			 leaveRule(); 
		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleSpec"



	// $ANTLR start "entryRuleDeploymentSpec"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:163:1: entryRuleDeploymentSpec returns [EObject current=null] :iv_ruleDeploymentSpec= ruleDeploymentSpec EOF ;
	public final EObject entryRuleDeploymentSpec() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleDeploymentSpec =null;

		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:164:2: (iv_ruleDeploymentSpec= ruleDeploymentSpec EOF )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:165:2: iv_ruleDeploymentSpec= ruleDeploymentSpec EOF
			{
			 newCompositeNode(grammarAccess.getDeploymentSpecRule()); 
			pushFollow(FOLLOW_ruleDeploymentSpec_in_entryRuleDeploymentSpec248);
			iv_ruleDeploymentSpec=ruleDeploymentSpec();
			state._fsp--;

			 current =iv_ruleDeploymentSpec; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleDeploymentSpec258); 
			}

		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleDeploymentSpec"



	// $ANTLR start "ruleDeploymentSpec"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:172:1: ruleDeploymentSpec returns [EObject current=null] : (otherlv_0= 'devices' otherlv_1= ':' ( (lv_devices_2_0= ruleDevice ) )+ ) ;
	public final EObject ruleDeploymentSpec() throws RecognitionException {
		EObject current = null;


		Token otherlv_0=null;
		Token otherlv_1=null;
		EObject lv_devices_2_0 =null;

		 enterRule(); 
		    
		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:175:28: ( (otherlv_0= 'devices' otherlv_1= ':' ( (lv_devices_2_0= ruleDevice ) )+ ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:176:3: (otherlv_0= 'devices' otherlv_1= ':' ( (lv_devices_2_0= ruleDevice ) )+ )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:176:3: (otherlv_0= 'devices' otherlv_1= ':' ( (lv_devices_2_0= ruleDevice ) )+ )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:176:3: otherlv_0= 'devices' otherlv_1= ':' ( (lv_devices_2_0= ruleDevice ) )+
			{
			otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleDeploymentSpec295); 

			    	newLeafNode(otherlv_0, grammarAccess.getDeploymentSpecAccess().getDevicesKeyword_0());
			    
			otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleDeploymentSpec307); 

			    	newLeafNode(otherlv_1, grammarAccess.getDeploymentSpecAccess().getColonKeyword_1());
			    
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:184:3: ( (lv_devices_2_0= ruleDevice ) )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==RULE_ID) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:185:3: (lv_devices_2_0= ruleDevice )
					{
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:185:3: (lv_devices_2_0= ruleDevice )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:186:3: lv_devices_2_0= ruleDevice
					{
					 
						        newCompositeNode(grammarAccess.getDeploymentSpecAccess().getDevicesDeviceParserRuleCall_2_0()); 
						    
					pushFollow(FOLLOW_ruleDevice_in_ruleDeploymentSpec328);
					lv_devices_2_0=ruleDevice();
					state._fsp--;


						        if (current==null) {
						            current = createModelElementForParent(grammarAccess.getDeploymentSpecRule());
						        }
					       		add(
					       			current, 
					       			"devices",
					        		lv_devices_2_0, 
					        		"Device");
						        afterParserOrEnumRuleCall();
						    
					}

					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			}

			 leaveRule(); 
		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleDeploymentSpec"



	// $ANTLR start "entryRuleDevice"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:210:1: entryRuleDevice returns [EObject current=null] :iv_ruleDevice= ruleDevice EOF ;
	public final EObject entryRuleDevice() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleDevice =null;

		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:211:2: (iv_ruleDevice= ruleDevice EOF )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:212:2: iv_ruleDevice= ruleDevice EOF
			{
			 newCompositeNode(grammarAccess.getDeviceRule()); 
			pushFollow(FOLLOW_ruleDevice_in_entryRuleDevice365);
			iv_ruleDevice=ruleDevice();
			state._fsp--;

			 current =iv_ruleDevice; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleDevice375); 
			}

		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleDevice"



	// $ANTLR start "ruleDevice"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:219:1: ruleDevice returns [EObject current=null] : ( ( (lv_deviceName_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'location' otherlv_3= ':' ( (lv_deviceLocation_4_0= ruleDeviceLocation ) ) otherlv_5= 'platform' otherlv_6= ':' ( (lv_platformType_7_0= rulePlatformType ) ) otherlv_8= ';' otherlv_9= 'resources' otherlv_10= ':' ( (lv_deviceAbilities_11_0= ruleDeviceAbilities ) )? otherlv_12= ';' otherlv_13= 'protocol' otherlv_14= ':' ( (lv_deviceProtocol_15_0= ruleDeviceProtocol ) ) (otherlv_16= 'database' otherlv_17= ':' ( (lv_databaseName_18_0= ruleDatabaseName ) ) otherlv_19= ';' )* otherlv_20= 'description' otherlv_21= ':' ( (lv_deviceDescription_22_0= ruleDeviceDescription ) ) otherlv_23= ';' ) ;
	public final EObject ruleDevice() throws RecognitionException {
		EObject current = null;


		Token lv_deviceName_0_0=null;
		Token otherlv_1=null;
		Token otherlv_2=null;
		Token otherlv_3=null;
		Token otherlv_5=null;
		Token otherlv_6=null;
		Token otherlv_8=null;
		Token otherlv_9=null;
		Token otherlv_10=null;
		Token otherlv_12=null;
		Token otherlv_13=null;
		Token otherlv_14=null;
		Token otherlv_16=null;
		Token otherlv_17=null;
		Token otherlv_19=null;
		Token otherlv_20=null;
		Token otherlv_21=null;
		Token otherlv_23=null;
		EObject lv_deviceLocation_4_0 =null;
		EObject lv_platformType_7_0 =null;
		EObject lv_deviceAbilities_11_0 =null;
		EObject lv_deviceProtocol_15_0 =null;
		EObject lv_databaseName_18_0 =null;
		EObject lv_deviceDescription_22_0 =null;

		 enterRule(); 
		    
		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:222:28: ( ( ( (lv_deviceName_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'location' otherlv_3= ':' ( (lv_deviceLocation_4_0= ruleDeviceLocation ) ) otherlv_5= 'platform' otherlv_6= ':' ( (lv_platformType_7_0= rulePlatformType ) ) otherlv_8= ';' otherlv_9= 'resources' otherlv_10= ':' ( (lv_deviceAbilities_11_0= ruleDeviceAbilities ) )? otherlv_12= ';' otherlv_13= 'protocol' otherlv_14= ':' ( (lv_deviceProtocol_15_0= ruleDeviceProtocol ) ) (otherlv_16= 'database' otherlv_17= ':' ( (lv_databaseName_18_0= ruleDatabaseName ) ) otherlv_19= ';' )* otherlv_20= 'description' otherlv_21= ':' ( (lv_deviceDescription_22_0= ruleDeviceDescription ) ) otherlv_23= ';' ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:223:2: ( ( (lv_deviceName_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'location' otherlv_3= ':' ( (lv_deviceLocation_4_0= ruleDeviceLocation ) ) otherlv_5= 'platform' otherlv_6= ':' ( (lv_platformType_7_0= rulePlatformType ) ) otherlv_8= ';' otherlv_9= 'resources' otherlv_10= ':' ( (lv_deviceAbilities_11_0= ruleDeviceAbilities ) )? otherlv_12= ';' otherlv_13= 'protocol' otherlv_14= ':' ( (lv_deviceProtocol_15_0= ruleDeviceProtocol ) ) (otherlv_16= 'database' otherlv_17= ':' ( (lv_databaseName_18_0= ruleDatabaseName ) ) otherlv_19= ';' )* otherlv_20= 'description' otherlv_21= ':' ( (lv_deviceDescription_22_0= ruleDeviceDescription ) ) otherlv_23= ';' )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:223:2: ( ( (lv_deviceName_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'location' otherlv_3= ':' ( (lv_deviceLocation_4_0= ruleDeviceLocation ) ) otherlv_5= 'platform' otherlv_6= ':' ( (lv_platformType_7_0= rulePlatformType ) ) otherlv_8= ';' otherlv_9= 'resources' otherlv_10= ':' ( (lv_deviceAbilities_11_0= ruleDeviceAbilities ) )? otherlv_12= ';' otherlv_13= 'protocol' otherlv_14= ':' ( (lv_deviceProtocol_15_0= ruleDeviceProtocol ) ) (otherlv_16= 'database' otherlv_17= ':' ( (lv_databaseName_18_0= ruleDatabaseName ) ) otherlv_19= ';' )* otherlv_20= 'description' otherlv_21= ':' ( (lv_deviceDescription_22_0= ruleDeviceDescription ) ) otherlv_23= ';' )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:223:2: ( (lv_deviceName_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'location' otherlv_3= ':' ( (lv_deviceLocation_4_0= ruleDeviceLocation ) ) otherlv_5= 'platform' otherlv_6= ':' ( (lv_platformType_7_0= rulePlatformType ) ) otherlv_8= ';' otherlv_9= 'resources' otherlv_10= ':' ( (lv_deviceAbilities_11_0= ruleDeviceAbilities ) )? otherlv_12= ';' otherlv_13= 'protocol' otherlv_14= ':' ( (lv_deviceProtocol_15_0= ruleDeviceProtocol ) ) (otherlv_16= 'database' otherlv_17= ':' ( (lv_databaseName_18_0= ruleDatabaseName ) ) otherlv_19= ';' )* otherlv_20= 'description' otherlv_21= ':' ( (lv_deviceDescription_22_0= ruleDeviceDescription ) ) otherlv_23= ';'
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:223:2: ( (lv_deviceName_0_0= RULE_ID ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:224:3: (lv_deviceName_0_0= RULE_ID )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:224:3: (lv_deviceName_0_0= RULE_ID )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:225:3: lv_deviceName_0_0= RULE_ID
			{
			lv_deviceName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDevice417); 

						newLeafNode(lv_deviceName_0_0, grammarAccess.getDeviceAccess().getDeviceNameIDTerminalRuleCall_0_0()); 
					

				        if (current==null) {
				            current = createModelElement(grammarAccess.getDeviceRule());
				        }
			       		setWithLastConsumed(
			       			current, 
			       			"deviceName",
			        		lv_deviceName_0_0, 
			        		"ID");
				    
			}

			}

			otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleDevice434); 

			    	newLeafNode(otherlv_1, grammarAccess.getDeviceAccess().getColonKeyword_1());
			    
			otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleDevice446); 

			    	newLeafNode(otherlv_2, grammarAccess.getDeviceAccess().getLocationKeyword_2());
			    
			otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleDevice458); 

			    	newLeafNode(otherlv_3, grammarAccess.getDeviceAccess().getColonKeyword_3());
			    
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:253:3: ( (lv_deviceLocation_4_0= ruleDeviceLocation ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:254:3: (lv_deviceLocation_4_0= ruleDeviceLocation )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:254:3: (lv_deviceLocation_4_0= ruleDeviceLocation )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:255:3: lv_deviceLocation_4_0= ruleDeviceLocation
			{
			 
				        newCompositeNode(grammarAccess.getDeviceAccess().getDeviceLocationDeviceLocationParserRuleCall_4_0()); 
				    
			pushFollow(FOLLOW_ruleDeviceLocation_in_ruleDevice479);
			lv_deviceLocation_4_0=ruleDeviceLocation();
			state._fsp--;


				        if (current==null) {
				            current = createModelElementForParent(grammarAccess.getDeviceRule());
				        }
			       		add(
			       			current, 
			       			"deviceLocation",
			        		lv_deviceLocation_4_0, 
			        		"DeviceLocation");
				        afterParserOrEnumRuleCall();
				    
			}

			}

			otherlv_5=(Token)match(input,49,FOLLOW_49_in_ruleDevice491); 

			    	newLeafNode(otherlv_5, grammarAccess.getDeviceAccess().getPlatformKeyword_5());
			    
			otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleDevice503); 

			    	newLeafNode(otherlv_6, grammarAccess.getDeviceAccess().getColonKeyword_6());
			    
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:279:3: ( (lv_platformType_7_0= rulePlatformType ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:280:3: (lv_platformType_7_0= rulePlatformType )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:280:3: (lv_platformType_7_0= rulePlatformType )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:281:3: lv_platformType_7_0= rulePlatformType
			{
			 
				        newCompositeNode(grammarAccess.getDeviceAccess().getPlatformTypePlatformTypeParserRuleCall_7_0()); 
				    
			pushFollow(FOLLOW_rulePlatformType_in_ruleDevice524);
			lv_platformType_7_0=rulePlatformType();
			state._fsp--;


				        if (current==null) {
				            current = createModelElementForParent(grammarAccess.getDeviceRule());
				        }
			       		add(
			       			current, 
			       			"platformType",
			        		lv_platformType_7_0, 
			        		"PlatformType");
				        afterParserOrEnumRuleCall();
				    
			}

			}

			otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleDevice536); 

			    	newLeafNode(otherlv_8, grammarAccess.getDeviceAccess().getSemicolonKeyword_8());
			    
			otherlv_9=(Token)match(input,52,FOLLOW_52_in_ruleDevice548); 

			    	newLeafNode(otherlv_9, grammarAccess.getDeviceAccess().getResourcesKeyword_9());
			    
			otherlv_10=(Token)match(input,14,FOLLOW_14_in_ruleDevice560); 

			    	newLeafNode(otherlv_10, grammarAccess.getDeviceAccess().getColonKeyword_10());
			    
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:309:3: ( (lv_deviceAbilities_11_0= ruleDeviceAbilities ) )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==RULE_ID) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:310:3: (lv_deviceAbilities_11_0= ruleDeviceAbilities )
					{
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:310:3: (lv_deviceAbilities_11_0= ruleDeviceAbilities )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:311:3: lv_deviceAbilities_11_0= ruleDeviceAbilities
					{
					 
						        newCompositeNode(grammarAccess.getDeviceAccess().getDeviceAbilitiesDeviceAbilitiesParserRuleCall_11_0()); 
						    
					pushFollow(FOLLOW_ruleDeviceAbilities_in_ruleDevice581);
					lv_deviceAbilities_11_0=ruleDeviceAbilities();
					state._fsp--;


						        if (current==null) {
						            current = createModelElementForParent(grammarAccess.getDeviceRule());
						        }
					       		add(
					       			current, 
					       			"deviceAbilities",
					        		lv_deviceAbilities_11_0, 
					        		"DeviceAbilities");
						        afterParserOrEnumRuleCall();
						    
					}

					}
					break;

			}

			otherlv_12=(Token)match(input,15,FOLLOW_15_in_ruleDevice594); 

			    	newLeafNode(otherlv_12, grammarAccess.getDeviceAccess().getSemicolonKeyword_12());
			    
			otherlv_13=(Token)match(input,50,FOLLOW_50_in_ruleDevice606); 

			    	newLeafNode(otherlv_13, grammarAccess.getDeviceAccess().getProtocolKeyword_13());
			    
			otherlv_14=(Token)match(input,14,FOLLOW_14_in_ruleDevice618); 

			    	newLeafNode(otherlv_14, grammarAccess.getDeviceAccess().getColonKeyword_14());
			    
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:339:3: ( (lv_deviceProtocol_15_0= ruleDeviceProtocol ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:340:3: (lv_deviceProtocol_15_0= ruleDeviceProtocol )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:340:3: (lv_deviceProtocol_15_0= ruleDeviceProtocol )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:341:3: lv_deviceProtocol_15_0= ruleDeviceProtocol
			{
			 
				        newCompositeNode(grammarAccess.getDeviceAccess().getDeviceProtocolDeviceProtocolParserRuleCall_15_0()); 
				    
			pushFollow(FOLLOW_ruleDeviceProtocol_in_ruleDevice639);
			lv_deviceProtocol_15_0=ruleDeviceProtocol();
			state._fsp--;


				        if (current==null) {
				            current = createModelElementForParent(grammarAccess.getDeviceRule());
				        }
			       		add(
			       			current, 
			       			"deviceProtocol",
			        		lv_deviceProtocol_15_0, 
			        		"DeviceProtocol");
				        afterParserOrEnumRuleCall();
				    
			}

			}

			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:357:2: (otherlv_16= 'database' otherlv_17= ':' ( (lv_databaseName_18_0= ruleDatabaseName ) ) otherlv_19= ';' )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==34) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:357:4: otherlv_16= 'database' otherlv_17= ':' ( (lv_databaseName_18_0= ruleDatabaseName ) ) otherlv_19= ';'
					{
					otherlv_16=(Token)match(input,34,FOLLOW_34_in_ruleDevice652); 

					    	newLeafNode(otherlv_16, grammarAccess.getDeviceAccess().getDatabaseKeyword_16_0());
					    
					otherlv_17=(Token)match(input,14,FOLLOW_14_in_ruleDevice664); 

					    	newLeafNode(otherlv_17, grammarAccess.getDeviceAccess().getColonKeyword_16_1());
					    
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:365:3: ( (lv_databaseName_18_0= ruleDatabaseName ) )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:366:3: (lv_databaseName_18_0= ruleDatabaseName )
					{
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:366:3: (lv_databaseName_18_0= ruleDatabaseName )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:367:3: lv_databaseName_18_0= ruleDatabaseName
					{
					 
						        newCompositeNode(grammarAccess.getDeviceAccess().getDatabaseNameDatabaseNameParserRuleCall_16_2_0()); 
						    
					pushFollow(FOLLOW_ruleDatabaseName_in_ruleDevice685);
					lv_databaseName_18_0=ruleDatabaseName();
					state._fsp--;


						        if (current==null) {
						            current = createModelElementForParent(grammarAccess.getDeviceRule());
						        }
					       		add(
					       			current, 
					       			"databaseName",
					        		lv_databaseName_18_0, 
					        		"DatabaseName");
						        afterParserOrEnumRuleCall();
						    
					}

					}

					otherlv_19=(Token)match(input,15,FOLLOW_15_in_ruleDevice697); 

					    	newLeafNode(otherlv_19, grammarAccess.getDeviceAccess().getSemicolonKeyword_16_3());
					    
					}
					break;

				default :
					break loop4;
				}
			}

			otherlv_20=(Token)match(input,35,FOLLOW_35_in_ruleDevice711); 

			    	newLeafNode(otherlv_20, grammarAccess.getDeviceAccess().getDescriptionKeyword_17());
			    
			otherlv_21=(Token)match(input,14,FOLLOW_14_in_ruleDevice723); 

			    	newLeafNode(otherlv_21, grammarAccess.getDeviceAccess().getColonKeyword_18());
			    
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:395:3: ( (lv_deviceDescription_22_0= ruleDeviceDescription ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:396:3: (lv_deviceDescription_22_0= ruleDeviceDescription )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:396:3: (lv_deviceDescription_22_0= ruleDeviceDescription )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:397:3: lv_deviceDescription_22_0= ruleDeviceDescription
			{
			 
				        newCompositeNode(grammarAccess.getDeviceAccess().getDeviceDescriptionDeviceDescriptionParserRuleCall_19_0()); 
				    
			pushFollow(FOLLOW_ruleDeviceDescription_in_ruleDevice744);
			lv_deviceDescription_22_0=ruleDeviceDescription();
			state._fsp--;


				        if (current==null) {
				            current = createModelElementForParent(grammarAccess.getDeviceRule());
				        }
			       		add(
			       			current, 
			       			"deviceDescription",
			        		lv_deviceDescription_22_0, 
			        		"DeviceDescription");
				        afterParserOrEnumRuleCall();
				    
			}

			}

			otherlv_23=(Token)match(input,15,FOLLOW_15_in_ruleDevice756); 

			    	newLeafNode(otherlv_23, grammarAccess.getDeviceAccess().getSemicolonKeyword_20());
			    
			}

			}

			 leaveRule(); 
		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleDevice"



	// $ANTLR start "entryRuleDeviceDescription"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:425:1: entryRuleDeviceDescription returns [EObject current=null] :iv_ruleDeviceDescription= ruleDeviceDescription EOF ;
	public final EObject entryRuleDeviceDescription() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleDeviceDescription =null;

		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:426:2: (iv_ruleDeviceDescription= ruleDeviceDescription EOF )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:427:2: iv_ruleDeviceDescription= ruleDeviceDescription EOF
			{
			 newCompositeNode(grammarAccess.getDeviceDescriptionRule()); 
			pushFollow(FOLLOW_ruleDeviceDescription_in_entryRuleDeviceDescription792);
			iv_ruleDeviceDescription=ruleDeviceDescription();
			state._fsp--;

			 current =iv_ruleDeviceDescription; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleDeviceDescription802); 
			}

		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleDeviceDescription"



	// $ANTLR start "ruleDeviceDescription"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:434:1: ruleDeviceDescription returns [EObject current=null] : ( (lv_devicedescriptionText_0_0= RULE_STRING ) ) ;
	public final EObject ruleDeviceDescription() throws RecognitionException {
		EObject current = null;


		Token lv_devicedescriptionText_0_0=null;

		 enterRule(); 
		    
		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:437:28: ( ( (lv_devicedescriptionText_0_0= RULE_STRING ) ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:438:3: ( (lv_devicedescriptionText_0_0= RULE_STRING ) )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:438:3: ( (lv_devicedescriptionText_0_0= RULE_STRING ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:439:3: (lv_devicedescriptionText_0_0= RULE_STRING )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:439:3: (lv_devicedescriptionText_0_0= RULE_STRING )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:440:3: lv_devicedescriptionText_0_0= RULE_STRING
			{
			lv_devicedescriptionText_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDeviceDescription843); 

						newLeafNode(lv_devicedescriptionText_0_0, grammarAccess.getDeviceDescriptionAccess().getDevicedescriptionTextSTRINGTerminalRuleCall_0()); 
					

				        if (current==null) {
				            current = createModelElement(grammarAccess.getDeviceDescriptionRule());
				        }
			       		setWithLastConsumed(
			       			current, 
			       			"devicedescriptionText",
			        		lv_devicedescriptionText_0_0, 
			        		"STRING");
				    
			}

			}

			}

			 leaveRule(); 
		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleDeviceDescription"



	// $ANTLR start "entryRuleDeviceLocation"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:464:1: entryRuleDeviceLocation returns [EObject current=null] :iv_ruleDeviceLocation= ruleDeviceLocation EOF ;
	public final EObject entryRuleDeviceLocation() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleDeviceLocation =null;

		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:465:2: (iv_ruleDeviceLocation= ruleDeviceLocation EOF )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:466:2: iv_ruleDeviceLocation= ruleDeviceLocation EOF
			{
			 newCompositeNode(grammarAccess.getDeviceLocationRule()); 
			pushFollow(FOLLOW_ruleDeviceLocation_in_entryRuleDeviceLocation883);
			iv_ruleDeviceLocation=ruleDeviceLocation();
			state._fsp--;

			 current =iv_ruleDeviceLocation; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleDeviceLocation893); 
			}

		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleDeviceLocation"



	// $ANTLR start "ruleDeviceLocation"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:473:1: ruleDeviceLocation returns [EObject current=null] : ( ( (lv_regionLabel_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_regionValue_2_0= RULE_INT ) ) otherlv_3= ';' ) ;
	public final EObject ruleDeviceLocation() throws RecognitionException {
		EObject current = null;


		Token lv_regionLabel_0_0=null;
		Token otherlv_1=null;
		Token lv_regionValue_2_0=null;
		Token otherlv_3=null;

		 enterRule(); 
		    
		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:476:28: ( ( ( (lv_regionLabel_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_regionValue_2_0= RULE_INT ) ) otherlv_3= ';' ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:477:2: ( ( (lv_regionLabel_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_regionValue_2_0= RULE_INT ) ) otherlv_3= ';' )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:477:2: ( ( (lv_regionLabel_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_regionValue_2_0= RULE_INT ) ) otherlv_3= ';' )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:477:2: ( (lv_regionLabel_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_regionValue_2_0= RULE_INT ) ) otherlv_3= ';'
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:477:2: ( (lv_regionLabel_0_0= RULE_ID ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:478:3: (lv_regionLabel_0_0= RULE_ID )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:478:3: (lv_regionLabel_0_0= RULE_ID )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:479:3: lv_regionLabel_0_0= RULE_ID
			{
			lv_regionLabel_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeviceLocation935); 

						newLeafNode(lv_regionLabel_0_0, grammarAccess.getDeviceLocationAccess().getRegionLabelIDTerminalRuleCall_0_0()); 
					

				        if (current==null) {
				            current = createModelElement(grammarAccess.getDeviceLocationRule());
				        }
			       		setWithLastConsumed(
			       			current, 
			       			"regionLabel",
			        		lv_regionLabel_0_0, 
			        		"ID");
				    
			}

			}

			otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleDeviceLocation952); 

			    	newLeafNode(otherlv_1, grammarAccess.getDeviceLocationAccess().getColonKeyword_1());
			    
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:499:3: ( (lv_regionValue_2_0= RULE_INT ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:500:3: (lv_regionValue_2_0= RULE_INT )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:500:3: (lv_regionValue_2_0= RULE_INT )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:501:3: lv_regionValue_2_0= RULE_INT
			{
			lv_regionValue_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDeviceLocation969); 

						newLeafNode(lv_regionValue_2_0, grammarAccess.getDeviceLocationAccess().getRegionValueINTTerminalRuleCall_2_0()); 
					

				        if (current==null) {
				            current = createModelElement(grammarAccess.getDeviceLocationRule());
				        }
			       		setWithLastConsumed(
			       			current, 
			       			"regionValue",
			        		lv_regionValue_2_0, 
			        		"INT");
				    
			}

			}

			otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleDeviceLocation986); 

			    	newLeafNode(otherlv_3, grammarAccess.getDeviceLocationAccess().getSemicolonKeyword_3());
			    
			}

			}

			 leaveRule(); 
		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleDeviceLocation"



	// $ANTLR start "entryRulePlatformType"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:529:1: entryRulePlatformType returns [EObject current=null] :iv_rulePlatformType= rulePlatformType EOF ;
	public final EObject entryRulePlatformType() throws RecognitionException {
		EObject current = null;


		EObject iv_rulePlatformType =null;

		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:530:2: (iv_rulePlatformType= rulePlatformType EOF )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:531:2: iv_rulePlatformType= rulePlatformType EOF
			{
			 newCompositeNode(grammarAccess.getPlatformTypeRule()); 
			pushFollow(FOLLOW_rulePlatformType_in_entryRulePlatformType1022);
			iv_rulePlatformType=rulePlatformType();
			state._fsp--;

			 current =iv_rulePlatformType; 
			match(input,EOF,FOLLOW_EOF_in_entryRulePlatformType1032); 
			}

		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRulePlatformType"



	// $ANTLR start "rulePlatformType"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:538:1: rulePlatformType returns [EObject current=null] : ( ( (lv_deviceType_0_0= 'JavaSE' ) ) | ( (lv_deviceType_1_0= 'Android' ) ) ) ;
	public final EObject rulePlatformType() throws RecognitionException {
		EObject current = null;


		Token lv_deviceType_0_0=null;
		Token lv_deviceType_1_0=null;

		 enterRule(); 
		    
		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:541:28: ( ( ( (lv_deviceType_0_0= 'JavaSE' ) ) | ( (lv_deviceType_1_0= 'Android' ) ) ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:542:2: ( ( (lv_deviceType_0_0= 'JavaSE' ) ) | ( (lv_deviceType_1_0= 'Android' ) ) )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:542:2: ( ( (lv_deviceType_0_0= 'JavaSE' ) ) | ( (lv_deviceType_1_0= 'Android' ) ) )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==22) ) {
				alt5=1;
			}
			else if ( (LA5_0==17) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:542:2: ( (lv_deviceType_0_0= 'JavaSE' ) )
					{
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:542:2: ( (lv_deviceType_0_0= 'JavaSE' ) )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:543:3: (lv_deviceType_0_0= 'JavaSE' )
					{
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:543:3: (lv_deviceType_0_0= 'JavaSE' )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:544:3: lv_deviceType_0_0= 'JavaSE'
					{
					lv_deviceType_0_0=(Token)match(input,22,FOLLOW_22_in_rulePlatformType1075); 

					        newLeafNode(lv_deviceType_0_0, grammarAccess.getPlatformTypeAccess().getDeviceTypeJavaSEKeyword_0_0());
					    

						        if (current==null) {
						            current = createModelElement(grammarAccess.getPlatformTypeRule());
						        }
					       		setWithLastConsumed(current, "deviceType", lv_deviceType_0_0, "JavaSE");
						    
					}

					}

					}
					break;
				case 2 :
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:558:6: ( (lv_deviceType_1_0= 'Android' ) )
					{
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:558:6: ( (lv_deviceType_1_0= 'Android' ) )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:559:3: (lv_deviceType_1_0= 'Android' )
					{
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:559:3: (lv_deviceType_1_0= 'Android' )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:560:3: lv_deviceType_1_0= 'Android'
					{
					lv_deviceType_1_0=(Token)match(input,17,FOLLOW_17_in_rulePlatformType1112); 

					        newLeafNode(lv_deviceType_1_0, grammarAccess.getPlatformTypeAccess().getDeviceTypeAndroidKeyword_1_0());
					    

						        if (current==null) {
						            current = createModelElement(grammarAccess.getPlatformTypeRule());
						        }
					       		setWithLastConsumed(current, "deviceType", lv_deviceType_1_0, "Android");
						    
					}

					}

					}
					break;

			}

			}

			 leaveRule(); 
		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "rulePlatformType"



	// $ANTLR start "entryRuleDatabaseName"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:581:1: entryRuleDatabaseName returns [EObject current=null] :iv_ruleDatabaseName= ruleDatabaseName EOF ;
	public final EObject entryRuleDatabaseName() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleDatabaseName =null;

		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:582:2: (iv_ruleDatabaseName= ruleDatabaseName EOF )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:583:2: iv_ruleDatabaseName= ruleDatabaseName EOF
			{
			 newCompositeNode(grammarAccess.getDatabaseNameRule()); 
			pushFollow(FOLLOW_ruleDatabaseName_in_entryRuleDatabaseName1161);
			iv_ruleDatabaseName=ruleDatabaseName();
			state._fsp--;

			 current =iv_ruleDatabaseName; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleDatabaseName1171); 
			}

		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleDatabaseName"



	// $ANTLR start "ruleDatabaseName"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:590:1: ruleDatabaseName returns [EObject current=null] : ( ( (lv_installedDatabase_0_0= 'MySQL' ) ) | ( (lv_installedDatabase_1_0= 'SQLAzure' ) ) | ( (lv_installedDatabase_2_0= 'MongoDB' ) ) ) ;
	public final EObject ruleDatabaseName() throws RecognitionException {
		EObject current = null;


		Token lv_installedDatabase_0_0=null;
		Token lv_installedDatabase_1_0=null;
		Token lv_installedDatabase_2_0=null;

		 enterRule(); 
		    
		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:593:28: ( ( ( (lv_installedDatabase_0_0= 'MySQL' ) ) | ( (lv_installedDatabase_1_0= 'SQLAzure' ) ) | ( (lv_installedDatabase_2_0= 'MongoDB' ) ) ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:594:2: ( ( (lv_installedDatabase_0_0= 'MySQL' ) ) | ( (lv_installedDatabase_1_0= 'SQLAzure' ) ) | ( (lv_installedDatabase_2_0= 'MongoDB' ) ) )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:594:2: ( ( (lv_installedDatabase_0_0= 'MySQL' ) ) | ( (lv_installedDatabase_1_0= 'SQLAzure' ) ) | ( (lv_installedDatabase_2_0= 'MongoDB' ) ) )
			int alt6=3;
			switch ( input.LA(1) ) {
			case 24:
				{
				alt6=1;
				}
				break;
			case 25:
				{
				alt6=2;
				}
				break;
			case 23:
				{
				alt6=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:594:2: ( (lv_installedDatabase_0_0= 'MySQL' ) )
					{
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:594:2: ( (lv_installedDatabase_0_0= 'MySQL' ) )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:595:3: (lv_installedDatabase_0_0= 'MySQL' )
					{
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:595:3: (lv_installedDatabase_0_0= 'MySQL' )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:596:3: lv_installedDatabase_0_0= 'MySQL'
					{
					lv_installedDatabase_0_0=(Token)match(input,24,FOLLOW_24_in_ruleDatabaseName1214); 

					        newLeafNode(lv_installedDatabase_0_0, grammarAccess.getDatabaseNameAccess().getInstalledDatabaseMySQLKeyword_0_0());
					    

						        if (current==null) {
						            current = createModelElement(grammarAccess.getDatabaseNameRule());
						        }
					       		setWithLastConsumed(current, "installedDatabase", lv_installedDatabase_0_0, "MySQL");
						    
					}

					}

					}
					break;
				case 2 :
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:610:6: ( (lv_installedDatabase_1_0= 'SQLAzure' ) )
					{
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:610:6: ( (lv_installedDatabase_1_0= 'SQLAzure' ) )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:611:3: (lv_installedDatabase_1_0= 'SQLAzure' )
					{
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:611:3: (lv_installedDatabase_1_0= 'SQLAzure' )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:612:3: lv_installedDatabase_1_0= 'SQLAzure'
					{
					lv_installedDatabase_1_0=(Token)match(input,25,FOLLOW_25_in_ruleDatabaseName1251); 

					        newLeafNode(lv_installedDatabase_1_0, grammarAccess.getDatabaseNameAccess().getInstalledDatabaseSQLAzureKeyword_1_0());
					    

						        if (current==null) {
						            current = createModelElement(grammarAccess.getDatabaseNameRule());
						        }
					       		setWithLastConsumed(current, "installedDatabase", lv_installedDatabase_1_0, "SQLAzure");
						    
					}

					}

					}
					break;
				case 3 :
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:626:6: ( (lv_installedDatabase_2_0= 'MongoDB' ) )
					{
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:626:6: ( (lv_installedDatabase_2_0= 'MongoDB' ) )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:627:3: (lv_installedDatabase_2_0= 'MongoDB' )
					{
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:627:3: (lv_installedDatabase_2_0= 'MongoDB' )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:628:3: lv_installedDatabase_2_0= 'MongoDB'
					{
					lv_installedDatabase_2_0=(Token)match(input,23,FOLLOW_23_in_ruleDatabaseName1288); 

					        newLeafNode(lv_installedDatabase_2_0, grammarAccess.getDatabaseNameAccess().getInstalledDatabaseMongoDBKeyword_2_0());
					    

						        if (current==null) {
						            current = createModelElement(grammarAccess.getDatabaseNameRule());
						        }
					       		setWithLastConsumed(current, "installedDatabase", lv_installedDatabase_2_0, "MongoDB");
						    
					}

					}

					}
					break;

			}

			}

			 leaveRule(); 
		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleDatabaseName"



	// $ANTLR start "entryRuleDeviceProtocol"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:649:1: entryRuleDeviceProtocol returns [EObject current=null] :iv_ruleDeviceProtocol= ruleDeviceProtocol EOF ;
	public final EObject entryRuleDeviceProtocol() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleDeviceProtocol =null;

		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:650:2: (iv_ruleDeviceProtocol= ruleDeviceProtocol EOF )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:651:2: iv_ruleDeviceProtocol= ruleDeviceProtocol EOF
			{
			 newCompositeNode(grammarAccess.getDeviceProtocolRule()); 
			pushFollow(FOLLOW_ruleDeviceProtocol_in_entryRuleDeviceProtocol1337);
			iv_ruleDeviceProtocol=ruleDeviceProtocol();
			state._fsp--;

			 current =iv_ruleDeviceProtocol; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleDeviceProtocol1347); 
			}

		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleDeviceProtocol"



	// $ANTLR start "ruleDeviceProtocol"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:658:1: ruleDeviceProtocol returns [EObject current=null] : ( ( (lv_protocolName_0_0= 'mqtt' ) ) otherlv_1= ';' ) ;
	public final EObject ruleDeviceProtocol() throws RecognitionException {
		EObject current = null;


		Token lv_protocolName_0_0=null;
		Token otherlv_1=null;

		 enterRule(); 
		    
		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:661:28: ( ( ( (lv_protocolName_0_0= 'mqtt' ) ) otherlv_1= ';' ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:662:2: ( ( (lv_protocolName_0_0= 'mqtt' ) ) otherlv_1= ';' )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:662:2: ( ( (lv_protocolName_0_0= 'mqtt' ) ) otherlv_1= ';' )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:662:2: ( (lv_protocolName_0_0= 'mqtt' ) ) otherlv_1= ';'
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:662:2: ( (lv_protocolName_0_0= 'mqtt' ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:663:3: (lv_protocolName_0_0= 'mqtt' )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:663:3: (lv_protocolName_0_0= 'mqtt' )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:664:3: lv_protocolName_0_0= 'mqtt'
			{
			lv_protocolName_0_0=(Token)match(input,44,FOLLOW_44_in_ruleDeviceProtocol1390); 

			        newLeafNode(lv_protocolName_0_0, grammarAccess.getDeviceProtocolAccess().getProtocolNameMqttKeyword_0_0());
			    

				        if (current==null) {
				            current = createModelElement(grammarAccess.getDeviceProtocolRule());
				        }
			       		setWithLastConsumed(current, "protocolName", lv_protocolName_0_0, "mqtt");
				    
			}

			}

			otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleDeviceProtocol1415); 

			    	newLeafNode(otherlv_1, grammarAccess.getDeviceProtocolAccess().getSemicolonKeyword_1());
			    
			}

			}

			 leaveRule(); 
		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleDeviceProtocol"



	// $ANTLR start "entryRuleDeviceAbilities"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:689:1: entryRuleDeviceAbilities returns [EObject current=null] :iv_ruleDeviceAbilities= ruleDeviceAbilities EOF ;
	public final EObject entryRuleDeviceAbilities() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleDeviceAbilities =null;

		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:690:2: (iv_ruleDeviceAbilities= ruleDeviceAbilities EOF )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:691:2: iv_ruleDeviceAbilities= ruleDeviceAbilities EOF
			{
			 newCompositeNode(grammarAccess.getDeviceAbilitiesRule()); 
			pushFollow(FOLLOW_ruleDeviceAbilities_in_entryRuleDeviceAbilities1451);
			iv_ruleDeviceAbilities=ruleDeviceAbilities();
			state._fsp--;

			 current =iv_ruleDeviceAbilities; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleDeviceAbilities1461); 
			}

		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleDeviceAbilities"



	// $ANTLR start "ruleDeviceAbilities"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:698:1: ruleDeviceAbilities returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_name_2_0= ruleDeviceAbilities ) ) )? ) ;
	public final EObject ruleDeviceAbilities() throws RecognitionException {
		EObject current = null;


		Token otherlv_0=null;
		Token otherlv_1=null;
		EObject lv_name_2_0 =null;

		 enterRule(); 
		    
		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:701:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_name_2_0= ruleDeviceAbilities ) ) )? ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:702:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_name_2_0= ruleDeviceAbilities ) ) )? )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:702:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_name_2_0= ruleDeviceAbilities ) ) )? )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:702:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_name_2_0= ruleDeviceAbilities ) ) )?
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:702:2: ( (otherlv_0= RULE_ID ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:703:3: (otherlv_0= RULE_ID )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:703:3: (otherlv_0= RULE_ID )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:704:3: otherlv_0= RULE_ID
			{

						if (current==null) {
				            current = createModelElement(grammarAccess.getDeviceAbilitiesRule());
				        }
			        
			otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeviceAbilities1506); 

					newLeafNode(otherlv_0, grammarAccess.getDeviceAbilitiesAccess().getDeviceEntityNameEntityNameCrossReference_0_0()); 
				
			}

			}

			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:715:2: (otherlv_1= ',' ( (lv_name_2_0= ruleDeviceAbilities ) ) )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==13) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:715:4: otherlv_1= ',' ( (lv_name_2_0= ruleDeviceAbilities ) )
					{
					otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleDeviceAbilities1519); 

					    	newLeafNode(otherlv_1, grammarAccess.getDeviceAbilitiesAccess().getCommaKeyword_1_0());
					    
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:719:3: ( (lv_name_2_0= ruleDeviceAbilities ) )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:720:3: (lv_name_2_0= ruleDeviceAbilities )
					{
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:720:3: (lv_name_2_0= ruleDeviceAbilities )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:721:3: lv_name_2_0= ruleDeviceAbilities
					{
					 
						        newCompositeNode(grammarAccess.getDeviceAbilitiesAccess().getNameDeviceAbilitiesParserRuleCall_1_1_0()); 
						    
					pushFollow(FOLLOW_ruleDeviceAbilities_in_ruleDeviceAbilities1540);
					lv_name_2_0=ruleDeviceAbilities();
					state._fsp--;


						        if (current==null) {
						            current = createModelElementForParent(grammarAccess.getDeviceAbilitiesRule());
						        }
					       		set(
					       			current, 
					       			"name",
					        		lv_name_2_0, 
					        		"DeviceAbilities");
						        afterParserOrEnumRuleCall();
						    
					}

					}

					}
					break;

			}

			}

			}

			 leaveRule(); 
		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleDeviceAbilities"



	// $ANTLR start "entryRuleInteractionSpec"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:745:1: entryRuleInteractionSpec returns [EObject current=null] :iv_ruleInteractionSpec= ruleInteractionSpec EOF ;
	public final EObject entryRuleInteractionSpec() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleInteractionSpec =null;

		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:746:2: (iv_ruleInteractionSpec= ruleInteractionSpec EOF )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:747:2: iv_ruleInteractionSpec= ruleInteractionSpec EOF
			{
			 newCompositeNode(grammarAccess.getInteractionSpecRule()); 
			pushFollow(FOLLOW_ruleInteractionSpec_in_entryRuleInteractionSpec1578);
			iv_ruleInteractionSpec=ruleInteractionSpec();
			state._fsp--;

			 current =iv_ruleInteractionSpec; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleInteractionSpec1588); 
			}

		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleInteractionSpec"



	// $ANTLR start "ruleInteractionSpec"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:754:1: ruleInteractionSpec returns [EObject current=null] : (otherlv_0= 'resources' otherlv_1= ':' otherlv_2= 'userInteractions' otherlv_3= ':' ( (lv_interactionName_4_0= ruleEntityName ) ) ( (lv_interactionCommand_5_0= ruleCommand ) )* ( (lv_interactionRequest_6_0= ruleRequest ) )* ( (lv_interactionNotify_7_0= ruleInteractionAction ) )* ) ;
	public final EObject ruleInteractionSpec() throws RecognitionException {
		EObject current = null;


		Token otherlv_0=null;
		Token otherlv_1=null;
		Token otherlv_2=null;
		Token otherlv_3=null;
		EObject lv_interactionName_4_0 =null;
		EObject lv_interactionCommand_5_0 =null;
		EObject lv_interactionRequest_6_0 =null;
		EObject lv_interactionNotify_7_0 =null;

		 enterRule(); 
		    
		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:757:28: ( (otherlv_0= 'resources' otherlv_1= ':' otherlv_2= 'userInteractions' otherlv_3= ':' ( (lv_interactionName_4_0= ruleEntityName ) ) ( (lv_interactionCommand_5_0= ruleCommand ) )* ( (lv_interactionRequest_6_0= ruleRequest ) )* ( (lv_interactionNotify_7_0= ruleInteractionAction ) )* ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:758:3: (otherlv_0= 'resources' otherlv_1= ':' otherlv_2= 'userInteractions' otherlv_3= ':' ( (lv_interactionName_4_0= ruleEntityName ) ) ( (lv_interactionCommand_5_0= ruleCommand ) )* ( (lv_interactionRequest_6_0= ruleRequest ) )* ( (lv_interactionNotify_7_0= ruleInteractionAction ) )* )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:758:3: (otherlv_0= 'resources' otherlv_1= ':' otherlv_2= 'userInteractions' otherlv_3= ':' ( (lv_interactionName_4_0= ruleEntityName ) ) ( (lv_interactionCommand_5_0= ruleCommand ) )* ( (lv_interactionRequest_6_0= ruleRequest ) )* ( (lv_interactionNotify_7_0= ruleInteractionAction ) )* )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:758:3: otherlv_0= 'resources' otherlv_1= ':' otherlv_2= 'userInteractions' otherlv_3= ':' ( (lv_interactionName_4_0= ruleEntityName ) ) ( (lv_interactionCommand_5_0= ruleCommand ) )* ( (lv_interactionRequest_6_0= ruleRequest ) )* ( (lv_interactionNotify_7_0= ruleInteractionAction ) )*
			{
			otherlv_0=(Token)match(input,52,FOLLOW_52_in_ruleInteractionSpec1625); 

			    	newLeafNode(otherlv_0, grammarAccess.getInteractionSpecAccess().getResourcesKeyword_0());
			    
			otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleInteractionSpec1637); 

			    	newLeafNode(otherlv_1, grammarAccess.getInteractionSpecAccess().getColonKeyword_1());
			    
			otherlv_2=(Token)match(input,59,FOLLOW_59_in_ruleInteractionSpec1649); 

			    	newLeafNode(otherlv_2, grammarAccess.getInteractionSpecAccess().getUserInteractionsKeyword_2());
			    
			otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleInteractionSpec1661); 

			    	newLeafNode(otherlv_3, grammarAccess.getInteractionSpecAccess().getColonKeyword_3());
			    
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:774:3: ( (lv_interactionName_4_0= ruleEntityName ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:775:3: (lv_interactionName_4_0= ruleEntityName )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:775:3: (lv_interactionName_4_0= ruleEntityName )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:776:3: lv_interactionName_4_0= ruleEntityName
			{
			 
				        newCompositeNode(grammarAccess.getInteractionSpecAccess().getInteractionNameEntityNameParserRuleCall_4_0()); 
				    
			pushFollow(FOLLOW_ruleEntityName_in_ruleInteractionSpec1682);
			lv_interactionName_4_0=ruleEntityName();
			state._fsp--;


				        if (current==null) {
				            current = createModelElementForParent(grammarAccess.getInteractionSpecRule());
				        }
			       		set(
			       			current, 
			       			"interactionName",
			        		lv_interactionName_4_0, 
			        		"EntityName");
				        afterParserOrEnumRuleCall();
				    
			}

			}

			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:792:2: ( (lv_interactionCommand_5_0= ruleCommand ) )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==31) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:793:3: (lv_interactionCommand_5_0= ruleCommand )
					{
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:793:3: (lv_interactionCommand_5_0= ruleCommand )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:794:3: lv_interactionCommand_5_0= ruleCommand
					{
					 
						        newCompositeNode(grammarAccess.getInteractionSpecAccess().getInteractionCommandCommandParserRuleCall_5_0()); 
						    
					pushFollow(FOLLOW_ruleCommand_in_ruleInteractionSpec1703);
					lv_interactionCommand_5_0=ruleCommand();
					state._fsp--;


						        if (current==null) {
						            current = createModelElementForParent(grammarAccess.getInteractionSpecRule());
						        }
					       		add(
					       			current, 
					       			"interactionCommand",
					        		lv_interactionCommand_5_0, 
					        		"Command");
						        afterParserOrEnumRuleCall();
						    
					}

					}
					break;

				default :
					break loop8;
				}
			}

			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:810:3: ( (lv_interactionRequest_6_0= ruleRequest ) )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==51) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:811:3: (lv_interactionRequest_6_0= ruleRequest )
					{
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:811:3: (lv_interactionRequest_6_0= ruleRequest )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:812:3: lv_interactionRequest_6_0= ruleRequest
					{
					 
						        newCompositeNode(grammarAccess.getInteractionSpecAccess().getInteractionRequestRequestParserRuleCall_6_0()); 
						    
					pushFollow(FOLLOW_ruleRequest_in_ruleInteractionSpec1725);
					lv_interactionRequest_6_0=ruleRequest();
					state._fsp--;


						        if (current==null) {
						            current = createModelElementForParent(grammarAccess.getInteractionSpecRule());
						        }
					       		add(
					       			current, 
					       			"interactionRequest",
					        		lv_interactionRequest_6_0, 
					        		"Request");
						        afterParserOrEnumRuleCall();
						    
					}

					}
					break;

				default :
					break loop9;
				}
			}

			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:828:3: ( (lv_interactionNotify_7_0= ruleInteractionAction ) )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==45) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:829:3: (lv_interactionNotify_7_0= ruleInteractionAction )
					{
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:829:3: (lv_interactionNotify_7_0= ruleInteractionAction )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:830:3: lv_interactionNotify_7_0= ruleInteractionAction
					{
					 
						        newCompositeNode(grammarAccess.getInteractionSpecAccess().getInteractionNotifyInteractionActionParserRuleCall_7_0()); 
						    
					pushFollow(FOLLOW_ruleInteractionAction_in_ruleInteractionSpec1747);
					lv_interactionNotify_7_0=ruleInteractionAction();
					state._fsp--;


						        if (current==null) {
						            current = createModelElementForParent(grammarAccess.getInteractionSpecRule());
						        }
					       		add(
					       			current, 
					       			"interactionNotify",
					        		lv_interactionNotify_7_0, 
					        		"InteractionAction");
						        afterParserOrEnumRuleCall();
						    
					}

					}
					break;

				default :
					break loop10;
				}
			}

			}

			}

			 leaveRule(); 
		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleInteractionSpec"



	// $ANTLR start "entryRuleInteractionAction"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:854:1: entryRuleInteractionAction returns [EObject current=null] :iv_ruleInteractionAction= ruleInteractionAction EOF ;
	public final EObject entryRuleInteractionAction() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleInteractionAction =null;

		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:855:2: (iv_ruleInteractionAction= ruleInteractionAction EOF )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:856:2: iv_ruleInteractionAction= ruleInteractionAction EOF
			{
			 newCompositeNode(grammarAccess.getInteractionActionRule()); 
			pushFollow(FOLLOW_ruleInteractionAction_in_entryRuleInteractionAction1784);
			iv_ruleInteractionAction=ruleInteractionAction();
			state._fsp--;

			 current =iv_ruleInteractionAction; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleInteractionAction1794); 
			}

		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleInteractionAction"



	// $ANTLR start "ruleInteractionAction"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:863:1: ruleInteractionAction returns [EObject current=null] : (otherlv_0= 'notify' ( (lv_actionName_1_0= ruleActionName ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameters ) )* otherlv_4= ')' otherlv_5= 'from' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) ;
	public final EObject ruleInteractionAction() throws RecognitionException {
		EObject current = null;


		Token otherlv_0=null;
		Token otherlv_2=null;
		Token otherlv_4=null;
		Token otherlv_5=null;
		Token otherlv_6=null;
		Token otherlv_7=null;
		EObject lv_actionName_1_0 =null;
		EObject lv_parameters_3_0 =null;

		 enterRule(); 
		    
		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:866:28: ( (otherlv_0= 'notify' ( (lv_actionName_1_0= ruleActionName ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameters ) )* otherlv_4= ')' otherlv_5= 'from' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:867:3: (otherlv_0= 'notify' ( (lv_actionName_1_0= ruleActionName ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameters ) )* otherlv_4= ')' otherlv_5= 'from' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:867:3: (otherlv_0= 'notify' ( (lv_actionName_1_0= ruleActionName ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameters ) )* otherlv_4= ')' otherlv_5= 'from' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:867:3: otherlv_0= 'notify' ( (lv_actionName_1_0= ruleActionName ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameters ) )* otherlv_4= ')' otherlv_5= 'from' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';'
			{
			otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleInteractionAction1831); 

			    	newLeafNode(otherlv_0, grammarAccess.getInteractionActionAccess().getNotifyKeyword_0());
			    
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:871:3: ( (lv_actionName_1_0= ruleActionName ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:872:3: (lv_actionName_1_0= ruleActionName )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:872:3: (lv_actionName_1_0= ruleActionName )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:873:3: lv_actionName_1_0= ruleActionName
			{
			 
				        newCompositeNode(grammarAccess.getInteractionActionAccess().getActionNameActionNameParserRuleCall_1_0()); 
				    
			pushFollow(FOLLOW_ruleActionName_in_ruleInteractionAction1852);
			lv_actionName_1_0=ruleActionName();
			state._fsp--;


				        if (current==null) {
				            current = createModelElementForParent(grammarAccess.getInteractionActionRule());
				        }
			       		set(
			       			current, 
			       			"actionName",
			        		lv_actionName_1_0, 
			        		"ActionName");
				        afterParserOrEnumRuleCall();
				    
			}

			}

			otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleInteractionAction1864); 

			    	newLeafNode(otherlv_2, grammarAccess.getInteractionActionAccess().getLeftParenthesisKeyword_2());
			    
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:893:3: ( (lv_parameters_3_0= ruleParameters ) )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==RULE_ID) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:894:3: (lv_parameters_3_0= ruleParameters )
					{
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:894:3: (lv_parameters_3_0= ruleParameters )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:895:3: lv_parameters_3_0= ruleParameters
					{
					 
						        newCompositeNode(grammarAccess.getInteractionActionAccess().getParametersParametersParserRuleCall_3_0()); 
						    
					pushFollow(FOLLOW_ruleParameters_in_ruleInteractionAction1885);
					lv_parameters_3_0=ruleParameters();
					state._fsp--;


						        if (current==null) {
						            current = createModelElementForParent(grammarAccess.getInteractionActionRule());
						        }
					       		add(
					       			current, 
					       			"parameters",
					        		lv_parameters_3_0, 
					        		"Parameters");
						        afterParserOrEnumRuleCall();
						    
					}

					}
					break;

				default :
					break loop11;
				}
			}

			otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleInteractionAction1898); 

			    	newLeafNode(otherlv_4, grammarAccess.getInteractionActionAccess().getRightParenthesisKeyword_4());
			    
			otherlv_5=(Token)match(input,40,FOLLOW_40_in_ruleInteractionAction1910); 

			    	newLeafNode(otherlv_5, grammarAccess.getInteractionActionAccess().getFromKeyword_5());
			    
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:919:3: ( (otherlv_6= RULE_ID ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:920:3: (otherlv_6= RULE_ID )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:920:3: (otherlv_6= RULE_ID )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:921:3: otherlv_6= RULE_ID
			{

						if (current==null) {
				            current = createModelElement(grammarAccess.getInteractionActionRule());
				        }
			        
			otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInteractionAction1930); 

					newLeafNode(otherlv_6, grammarAccess.getInteractionActionAccess().getInteractionEntityEntityNameCrossReference_6_0()); 
				
			}

			}

			otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleInteractionAction1942); 

			    	newLeafNode(otherlv_7, grammarAccess.getInteractionActionAccess().getSemicolonKeyword_7());
			    
			}

			}

			 leaveRule(); 
		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleInteractionAction"



	// $ANTLR start "entryRuleArchSpec"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:944:1: entryRuleArchSpec returns [EObject current=null] :iv_ruleArchSpec= ruleArchSpec EOF ;
	public final EObject entryRuleArchSpec() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleArchSpec =null;

		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:945:2: (iv_ruleArchSpec= ruleArchSpec EOF )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:946:2: iv_ruleArchSpec= ruleArchSpec EOF
			{
			 newCompositeNode(grammarAccess.getArchSpecRule()); 
			pushFollow(FOLLOW_ruleArchSpec_in_entryRuleArchSpec1978);
			iv_ruleArchSpec=ruleArchSpec();
			state._fsp--;

			 current =iv_ruleArchSpec; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleArchSpec1988); 
			}

		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleArchSpec"



	// $ANTLR start "ruleArchSpec"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:953:1: ruleArchSpec returns [EObject current=null] : ( (otherlv_0= 'structs' otherlv_1= ':' ( (lv_structs_2_0= ruleStruct ) )+ )* otherlv_3= 'softwareComponents' otherlv_4= ':' otherlv_5= 'computationalService' otherlv_6= ':' (otherlv_7= 'InBuilt' otherlv_8= ':' )* ( (lv_inbuiltComputationalService_9_0= ruleInBuiltComputationalService ) )* otherlv_10= 'Custom' otherlv_11= ':' ( (lv_customComputationalService_12_0= rulecustomComputationalService ) )+ ) ;
	public final EObject ruleArchSpec() throws RecognitionException {
		EObject current = null;


		Token otherlv_0=null;
		Token otherlv_1=null;
		Token otherlv_3=null;
		Token otherlv_4=null;
		Token otherlv_5=null;
		Token otherlv_6=null;
		Token otherlv_7=null;
		Token otherlv_8=null;
		Token otherlv_10=null;
		Token otherlv_11=null;
		EObject lv_structs_2_0 =null;
		EObject lv_inbuiltComputationalService_9_0 =null;
		EObject lv_customComputationalService_12_0 =null;

		 enterRule(); 
		    
		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:956:28: ( ( (otherlv_0= 'structs' otherlv_1= ':' ( (lv_structs_2_0= ruleStruct ) )+ )* otherlv_3= 'softwareComponents' otherlv_4= ':' otherlv_5= 'computationalService' otherlv_6= ':' (otherlv_7= 'InBuilt' otherlv_8= ':' )* ( (lv_inbuiltComputationalService_9_0= ruleInBuiltComputationalService ) )* otherlv_10= 'Custom' otherlv_11= ':' ( (lv_customComputationalService_12_0= rulecustomComputationalService ) )+ ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:957:2: ( (otherlv_0= 'structs' otherlv_1= ':' ( (lv_structs_2_0= ruleStruct ) )+ )* otherlv_3= 'softwareComponents' otherlv_4= ':' otherlv_5= 'computationalService' otherlv_6= ':' (otherlv_7= 'InBuilt' otherlv_8= ':' )* ( (lv_inbuiltComputationalService_9_0= ruleInBuiltComputationalService ) )* otherlv_10= 'Custom' otherlv_11= ':' ( (lv_customComputationalService_12_0= rulecustomComputationalService ) )+ )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:957:2: ( (otherlv_0= 'structs' otherlv_1= ':' ( (lv_structs_2_0= ruleStruct ) )+ )* otherlv_3= 'softwareComponents' otherlv_4= ':' otherlv_5= 'computationalService' otherlv_6= ':' (otherlv_7= 'InBuilt' otherlv_8= ':' )* ( (lv_inbuiltComputationalService_9_0= ruleInBuiltComputationalService ) )* otherlv_10= 'Custom' otherlv_11= ':' ( (lv_customComputationalService_12_0= rulecustomComputationalService ) )+ )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:957:2: (otherlv_0= 'structs' otherlv_1= ':' ( (lv_structs_2_0= ruleStruct ) )+ )* otherlv_3= 'softwareComponents' otherlv_4= ':' otherlv_5= 'computationalService' otherlv_6= ':' (otherlv_7= 'InBuilt' otherlv_8= ':' )* ( (lv_inbuiltComputationalService_9_0= ruleInBuiltComputationalService ) )* otherlv_10= 'Custom' otherlv_11= ':' ( (lv_customComputationalService_12_0= rulecustomComputationalService ) )+
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:957:2: (otherlv_0= 'structs' otherlv_1= ':' ( (lv_structs_2_0= ruleStruct ) )+ )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==57) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:957:4: otherlv_0= 'structs' otherlv_1= ':' ( (lv_structs_2_0= ruleStruct ) )+
					{
					otherlv_0=(Token)match(input,57,FOLLOW_57_in_ruleArchSpec2026); 

					    	newLeafNode(otherlv_0, grammarAccess.getArchSpecAccess().getStructsKeyword_0_0());
					    
					otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleArchSpec2038); 

					    	newLeafNode(otherlv_1, grammarAccess.getArchSpecAccess().getColonKeyword_0_1());
					    
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:965:3: ( (lv_structs_2_0= ruleStruct ) )+
					int cnt12=0;
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0==RULE_ID) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:966:3: (lv_structs_2_0= ruleStruct )
							{
							// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:966:3: (lv_structs_2_0= ruleStruct )
							// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:967:3: lv_structs_2_0= ruleStruct
							{
							 
								        newCompositeNode(grammarAccess.getArchSpecAccess().getStructsStructParserRuleCall_0_2_0()); 
								    
							pushFollow(FOLLOW_ruleStruct_in_ruleArchSpec2059);
							lv_structs_2_0=ruleStruct();
							state._fsp--;


								        if (current==null) {
								            current = createModelElementForParent(grammarAccess.getArchSpecRule());
								        }
							       		add(
							       			current, 
							       			"structs",
							        		lv_structs_2_0, 
							        		"Struct");
								        afterParserOrEnumRuleCall();
								    
							}

							}
							break;

						default :
							if ( cnt12 >= 1 ) break loop12;
							EarlyExitException eee = new EarlyExitException(12, input);
							throw eee;
						}
						cnt12++;
					}

					}
					break;

				default :
					break loop13;
				}
			}

			otherlv_3=(Token)match(input,55,FOLLOW_55_in_ruleArchSpec2074); 

			    	newLeafNode(otherlv_3, grammarAccess.getArchSpecAccess().getSoftwareComponentsKeyword_1());
			    
			otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleArchSpec2086); 

			    	newLeafNode(otherlv_4, grammarAccess.getArchSpecAccess().getColonKeyword_2());
			    
			otherlv_5=(Token)match(input,32,FOLLOW_32_in_ruleArchSpec2098); 

			    	newLeafNode(otherlv_5, grammarAccess.getArchSpecAccess().getComputationalServiceKeyword_3());
			    
			otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleArchSpec2110); 

			    	newLeafNode(otherlv_6, grammarAccess.getArchSpecAccess().getColonKeyword_4());
			    
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:999:3: (otherlv_7= 'InBuilt' otherlv_8= ':' )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==20) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:999:3: otherlv_7= 'InBuilt' otherlv_8= ':'
					{
					otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleArchSpec2123); 

					    	newLeafNode(otherlv_7, grammarAccess.getArchSpecAccess().getInBuiltKeyword_5_0());
					    
					otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleArchSpec2135); 

					    	newLeafNode(otherlv_8, grammarAccess.getArchSpecAccess().getColonKeyword_5_1());
					    
					}
					break;

				default :
					break loop14;
				}
			}

			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1007:3: ( (lv_inbuiltComputationalService_9_0= ruleInBuiltComputationalService ) )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==RULE_ID) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1008:3: (lv_inbuiltComputationalService_9_0= ruleInBuiltComputationalService )
					{
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1008:3: (lv_inbuiltComputationalService_9_0= ruleInBuiltComputationalService )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1009:3: lv_inbuiltComputationalService_9_0= ruleInBuiltComputationalService
					{
					 
						        newCompositeNode(grammarAccess.getArchSpecAccess().getInbuiltComputationalServiceInBuiltComputationalServiceParserRuleCall_6_0()); 
						    
					pushFollow(FOLLOW_ruleInBuiltComputationalService_in_ruleArchSpec2158);
					lv_inbuiltComputationalService_9_0=ruleInBuiltComputationalService();
					state._fsp--;


						        if (current==null) {
						            current = createModelElementForParent(grammarAccess.getArchSpecRule());
						        }
					       		add(
					       			current, 
					       			"inbuiltComputationalService",
					        		lv_inbuiltComputationalService_9_0, 
					        		"InBuiltComputationalService");
						        afterParserOrEnumRuleCall();
						    
					}

					}
					break;

				default :
					break loop15;
				}
			}

			otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleArchSpec2171); 

			    	newLeafNode(otherlv_10, grammarAccess.getArchSpecAccess().getCustomKeyword_7());
			    
			otherlv_11=(Token)match(input,14,FOLLOW_14_in_ruleArchSpec2183); 

			    	newLeafNode(otherlv_11, grammarAccess.getArchSpecAccess().getColonKeyword_8());
			    
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1033:3: ( (lv_customComputationalService_12_0= rulecustomComputationalService ) )+
			int cnt16=0;
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==RULE_ID) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1034:3: (lv_customComputationalService_12_0= rulecustomComputationalService )
					{
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1034:3: (lv_customComputationalService_12_0= rulecustomComputationalService )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1035:3: lv_customComputationalService_12_0= rulecustomComputationalService
					{
					 
						        newCompositeNode(grammarAccess.getArchSpecAccess().getCustomComputationalServiceCustomComputationalServiceParserRuleCall_9_0()); 
						    
					pushFollow(FOLLOW_rulecustomComputationalService_in_ruleArchSpec2204);
					lv_customComputationalService_12_0=rulecustomComputationalService();
					state._fsp--;


						        if (current==null) {
						            current = createModelElementForParent(grammarAccess.getArchSpecRule());
						        }
					       		add(
					       			current, 
					       			"customComputationalService",
					        		lv_customComputationalService_12_0, 
					        		"customComputationalService");
						        afterParserOrEnumRuleCall();
						    
					}

					}
					break;

				default :
					if ( cnt16 >= 1 ) break loop16;
					EarlyExitException eee = new EarlyExitException(16, input);
					throw eee;
				}
				cnt16++;
			}

			}

			}

			 leaveRule(); 
		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleArchSpec"



	// $ANTLR start "entryRuleInBuiltComputationalService"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1059:1: entryRuleInBuiltComputationalService returns [EObject current=null] :iv_ruleInBuiltComputationalService= ruleInBuiltComputationalService EOF ;
	public final EObject entryRuleInBuiltComputationalService() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleInBuiltComputationalService =null;

		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1060:2: (iv_ruleInBuiltComputationalService= ruleInBuiltComputationalService EOF )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1061:2: iv_ruleInBuiltComputationalService= ruleInBuiltComputationalService EOF
			{
			 newCompositeNode(grammarAccess.getInBuiltComputationalServiceRule()); 
			pushFollow(FOLLOW_ruleInBuiltComputationalService_in_entryRuleInBuiltComputationalService2241);
			iv_ruleInBuiltComputationalService=ruleInBuiltComputationalService();
			state._fsp--;

			 current =iv_ruleInBuiltComputationalService; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleInBuiltComputationalService2251); 
			}

		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleInBuiltComputationalService"



	// $ANTLR start "ruleInBuiltComputationalService"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1068:1: ruleInBuiltComputationalService returns [EObject current=null] : ( ( (lv_inBuiltComputationalServiceName_0_0= ruleEntityName ) ) ( (lv_consumes_1_0= ruleConsumeForInBuilt ) )+ otherlv_2= 'COMPUTE' otherlv_3= '(' ( (lv_operationName_4_0= ruleOperationName ) ) (otherlv_5= ',' ( (lv_operationParameter_6_0= RULE_INT ) ) )? otherlv_7= ')' otherlv_8= ';' ( (lv_generateInfo_9_0= ruleGenerate ) )+ ) ;
	public final EObject ruleInBuiltComputationalService() throws RecognitionException {
		EObject current = null;


		Token otherlv_2=null;
		Token otherlv_3=null;
		Token otherlv_5=null;
		Token lv_operationParameter_6_0=null;
		Token otherlv_7=null;
		Token otherlv_8=null;
		EObject lv_inBuiltComputationalServiceName_0_0 =null;
		EObject lv_consumes_1_0 =null;
		EObject lv_operationName_4_0 =null;
		EObject lv_generateInfo_9_0 =null;

		 enterRule(); 
		    
		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1071:28: ( ( ( (lv_inBuiltComputationalServiceName_0_0= ruleEntityName ) ) ( (lv_consumes_1_0= ruleConsumeForInBuilt ) )+ otherlv_2= 'COMPUTE' otherlv_3= '(' ( (lv_operationName_4_0= ruleOperationName ) ) (otherlv_5= ',' ( (lv_operationParameter_6_0= RULE_INT ) ) )? otherlv_7= ')' otherlv_8= ';' ( (lv_generateInfo_9_0= ruleGenerate ) )+ ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1072:2: ( ( (lv_inBuiltComputationalServiceName_0_0= ruleEntityName ) ) ( (lv_consumes_1_0= ruleConsumeForInBuilt ) )+ otherlv_2= 'COMPUTE' otherlv_3= '(' ( (lv_operationName_4_0= ruleOperationName ) ) (otherlv_5= ',' ( (lv_operationParameter_6_0= RULE_INT ) ) )? otherlv_7= ')' otherlv_8= ';' ( (lv_generateInfo_9_0= ruleGenerate ) )+ )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1072:2: ( ( (lv_inBuiltComputationalServiceName_0_0= ruleEntityName ) ) ( (lv_consumes_1_0= ruleConsumeForInBuilt ) )+ otherlv_2= 'COMPUTE' otherlv_3= '(' ( (lv_operationName_4_0= ruleOperationName ) ) (otherlv_5= ',' ( (lv_operationParameter_6_0= RULE_INT ) ) )? otherlv_7= ')' otherlv_8= ';' ( (lv_generateInfo_9_0= ruleGenerate ) )+ )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1072:2: ( (lv_inBuiltComputationalServiceName_0_0= ruleEntityName ) ) ( (lv_consumes_1_0= ruleConsumeForInBuilt ) )+ otherlv_2= 'COMPUTE' otherlv_3= '(' ( (lv_operationName_4_0= ruleOperationName ) ) (otherlv_5= ',' ( (lv_operationParameter_6_0= RULE_INT ) ) )? otherlv_7= ')' otherlv_8= ';' ( (lv_generateInfo_9_0= ruleGenerate ) )+
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1072:2: ( (lv_inBuiltComputationalServiceName_0_0= ruleEntityName ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1073:3: (lv_inBuiltComputationalServiceName_0_0= ruleEntityName )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1073:3: (lv_inBuiltComputationalServiceName_0_0= ruleEntityName )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1074:3: lv_inBuiltComputationalServiceName_0_0= ruleEntityName
			{
			 
				        newCompositeNode(grammarAccess.getInBuiltComputationalServiceAccess().getInBuiltComputationalServiceNameEntityNameParserRuleCall_0_0()); 
				    
			pushFollow(FOLLOW_ruleEntityName_in_ruleInBuiltComputationalService2297);
			lv_inBuiltComputationalServiceName_0_0=ruleEntityName();
			state._fsp--;


				        if (current==null) {
				            current = createModelElementForParent(grammarAccess.getInBuiltComputationalServiceRule());
				        }
			       		set(
			       			current, 
			       			"inBuiltComputationalServiceName",
			        		lv_inBuiltComputationalServiceName_0_0, 
			        		"EntityName");
				        afterParserOrEnumRuleCall();
				    
			}

			}

			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1090:2: ( (lv_consumes_1_0= ruleConsumeForInBuilt ) )+
			int cnt17=0;
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==33) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1091:3: (lv_consumes_1_0= ruleConsumeForInBuilt )
					{
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1091:3: (lv_consumes_1_0= ruleConsumeForInBuilt )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1092:3: lv_consumes_1_0= ruleConsumeForInBuilt
					{
					 
						        newCompositeNode(grammarAccess.getInBuiltComputationalServiceAccess().getConsumesConsumeForInBuiltParserRuleCall_1_0()); 
						    
					pushFollow(FOLLOW_ruleConsumeForInBuilt_in_ruleInBuiltComputationalService2318);
					lv_consumes_1_0=ruleConsumeForInBuilt();
					state._fsp--;


						        if (current==null) {
						            current = createModelElementForParent(grammarAccess.getInBuiltComputationalServiceRule());
						        }
					       		add(
					       			current, 
					       			"consumes",
					        		lv_consumes_1_0, 
					        		"ConsumeForInBuilt");
						        afterParserOrEnumRuleCall();
						    
					}

					}
					break;

				default :
					if ( cnt17 >= 1 ) break loop17;
					EarlyExitException eee = new EarlyExitException(17, input);
					throw eee;
				}
				cnt17++;
			}

			otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleInBuiltComputationalService2331); 

			    	newLeafNode(otherlv_2, grammarAccess.getInBuiltComputationalServiceAccess().getCOMPUTEKeyword_2());
			    
			otherlv_3=(Token)match(input,11,FOLLOW_11_in_ruleInBuiltComputationalService2343); 

			    	newLeafNode(otherlv_3, grammarAccess.getInBuiltComputationalServiceAccess().getLeftParenthesisKeyword_3());
			    
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1116:3: ( (lv_operationName_4_0= ruleOperationName ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1117:3: (lv_operationName_4_0= ruleOperationName )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1117:3: (lv_operationName_4_0= ruleOperationName )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1118:3: lv_operationName_4_0= ruleOperationName
			{
			 
				        newCompositeNode(grammarAccess.getInBuiltComputationalServiceAccess().getOperationNameOperationNameParserRuleCall_4_0()); 
				    
			pushFollow(FOLLOW_ruleOperationName_in_ruleInBuiltComputationalService2364);
			lv_operationName_4_0=ruleOperationName();
			state._fsp--;


				        if (current==null) {
				            current = createModelElementForParent(grammarAccess.getInBuiltComputationalServiceRule());
				        }
			       		set(
			       			current, 
			       			"operationName",
			        		lv_operationName_4_0, 
			        		"OperationName");
				        afterParserOrEnumRuleCall();
				    
			}

			}

			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1134:2: (otherlv_5= ',' ( (lv_operationParameter_6_0= RULE_INT ) ) )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==13) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1134:4: otherlv_5= ',' ( (lv_operationParameter_6_0= RULE_INT ) )
					{
					otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleInBuiltComputationalService2377); 

					    	newLeafNode(otherlv_5, grammarAccess.getInBuiltComputationalServiceAccess().getCommaKeyword_5_0());
					    
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1138:3: ( (lv_operationParameter_6_0= RULE_INT ) )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1139:3: (lv_operationParameter_6_0= RULE_INT )
					{
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1139:3: (lv_operationParameter_6_0= RULE_INT )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1140:3: lv_operationParameter_6_0= RULE_INT
					{
					lv_operationParameter_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleInBuiltComputationalService2394); 

								newLeafNode(lv_operationParameter_6_0, grammarAccess.getInBuiltComputationalServiceAccess().getOperationParameterINTTerminalRuleCall_5_1_0()); 
							

						        if (current==null) {
						            current = createModelElement(grammarAccess.getInBuiltComputationalServiceRule());
						        }
					       		setWithLastConsumed(
					       			current, 
					       			"operationParameter",
					        		lv_operationParameter_6_0, 
					        		"INT");
						    
					}

					}

					}
					break;

			}

			otherlv_7=(Token)match(input,12,FOLLOW_12_in_ruleInBuiltComputationalService2413); 

			    	newLeafNode(otherlv_7, grammarAccess.getInBuiltComputationalServiceAccess().getRightParenthesisKeyword_6());
			    
			otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleInBuiltComputationalService2425); 

			    	newLeafNode(otherlv_8, grammarAccess.getInBuiltComputationalServiceAccess().getSemicolonKeyword_7());
			    
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1164:3: ( (lv_generateInfo_9_0= ruleGenerate ) )+
			int cnt19=0;
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==41) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1165:3: (lv_generateInfo_9_0= ruleGenerate )
					{
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1165:3: (lv_generateInfo_9_0= ruleGenerate )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1166:3: lv_generateInfo_9_0= ruleGenerate
					{
					 
						        newCompositeNode(grammarAccess.getInBuiltComputationalServiceAccess().getGenerateInfoGenerateParserRuleCall_8_0()); 
						    
					pushFollow(FOLLOW_ruleGenerate_in_ruleInBuiltComputationalService2446);
					lv_generateInfo_9_0=ruleGenerate();
					state._fsp--;


						        if (current==null) {
						            current = createModelElementForParent(grammarAccess.getInBuiltComputationalServiceRule());
						        }
					       		add(
					       			current, 
					       			"generateInfo",
					        		lv_generateInfo_9_0, 
					        		"Generate");
						        afterParserOrEnumRuleCall();
						    
					}

					}
					break;

				default :
					if ( cnt19 >= 1 ) break loop19;
					EarlyExitException eee = new EarlyExitException(19, input);
					throw eee;
				}
				cnt19++;
			}

			}

			}

			 leaveRule(); 
		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleInBuiltComputationalService"



	// $ANTLR start "entryRulecustomComputationalService"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1190:1: entryRulecustomComputationalService returns [EObject current=null] :iv_rulecustomComputationalService= rulecustomComputationalService EOF ;
	public final EObject entryRulecustomComputationalService() throws RecognitionException {
		EObject current = null;


		EObject iv_rulecustomComputationalService =null;

		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1191:2: (iv_rulecustomComputationalService= rulecustomComputationalService EOF )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1192:2: iv_rulecustomComputationalService= rulecustomComputationalService EOF
			{
			 newCompositeNode(grammarAccess.getCustomComputationalServiceRule()); 
			pushFollow(FOLLOW_rulecustomComputationalService_in_entryRulecustomComputationalService2483);
			iv_rulecustomComputationalService=rulecustomComputationalService();
			state._fsp--;

			 current =iv_rulecustomComputationalService; 
			match(input,EOF,FOLLOW_EOF_in_entryRulecustomComputationalService2493); 
			}

		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRulecustomComputationalService"



	// $ANTLR start "rulecustomComputationalService"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1199:1: rulecustomComputationalService returns [EObject current=null] : ( ( (lv_customComputationalServiceName_0_0= ruleEntityName ) ) ( (lv_consumes_1_0= ruleConsume ) )+ ( (lv_requests_2_0= ruleRequest ) )* ( (lv_generateInfo_3_0= ruleGenerate ) )* ( (lv_commands_4_0= ruleCommand ) )* ) ;
	public final EObject rulecustomComputationalService() throws RecognitionException {
		EObject current = null;


		EObject lv_customComputationalServiceName_0_0 =null;
		EObject lv_consumes_1_0 =null;
		EObject lv_requests_2_0 =null;
		EObject lv_generateInfo_3_0 =null;
		EObject lv_commands_4_0 =null;

		 enterRule(); 
		    
		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1202:28: ( ( ( (lv_customComputationalServiceName_0_0= ruleEntityName ) ) ( (lv_consumes_1_0= ruleConsume ) )+ ( (lv_requests_2_0= ruleRequest ) )* ( (lv_generateInfo_3_0= ruleGenerate ) )* ( (lv_commands_4_0= ruleCommand ) )* ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1203:2: ( ( (lv_customComputationalServiceName_0_0= ruleEntityName ) ) ( (lv_consumes_1_0= ruleConsume ) )+ ( (lv_requests_2_0= ruleRequest ) )* ( (lv_generateInfo_3_0= ruleGenerate ) )* ( (lv_commands_4_0= ruleCommand ) )* )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1203:2: ( ( (lv_customComputationalServiceName_0_0= ruleEntityName ) ) ( (lv_consumes_1_0= ruleConsume ) )+ ( (lv_requests_2_0= ruleRequest ) )* ( (lv_generateInfo_3_0= ruleGenerate ) )* ( (lv_commands_4_0= ruleCommand ) )* )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1203:2: ( (lv_customComputationalServiceName_0_0= ruleEntityName ) ) ( (lv_consumes_1_0= ruleConsume ) )+ ( (lv_requests_2_0= ruleRequest ) )* ( (lv_generateInfo_3_0= ruleGenerate ) )* ( (lv_commands_4_0= ruleCommand ) )*
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1203:2: ( (lv_customComputationalServiceName_0_0= ruleEntityName ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1204:3: (lv_customComputationalServiceName_0_0= ruleEntityName )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1204:3: (lv_customComputationalServiceName_0_0= ruleEntityName )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1205:3: lv_customComputationalServiceName_0_0= ruleEntityName
			{
			 
				        newCompositeNode(grammarAccess.getCustomComputationalServiceAccess().getCustomComputationalServiceNameEntityNameParserRuleCall_0_0()); 
				    
			pushFollow(FOLLOW_ruleEntityName_in_rulecustomComputationalService2539);
			lv_customComputationalServiceName_0_0=ruleEntityName();
			state._fsp--;


				        if (current==null) {
				            current = createModelElementForParent(grammarAccess.getCustomComputationalServiceRule());
				        }
			       		set(
			       			current, 
			       			"customComputationalServiceName",
			        		lv_customComputationalServiceName_0_0, 
			        		"EntityName");
				        afterParserOrEnumRuleCall();
				    
			}

			}

			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1221:2: ( (lv_consumes_1_0= ruleConsume ) )+
			int cnt20=0;
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==33) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1222:3: (lv_consumes_1_0= ruleConsume )
					{
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1222:3: (lv_consumes_1_0= ruleConsume )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1223:3: lv_consumes_1_0= ruleConsume
					{
					 
						        newCompositeNode(grammarAccess.getCustomComputationalServiceAccess().getConsumesConsumeParserRuleCall_1_0()); 
						    
					pushFollow(FOLLOW_ruleConsume_in_rulecustomComputationalService2560);
					lv_consumes_1_0=ruleConsume();
					state._fsp--;


						        if (current==null) {
						            current = createModelElementForParent(grammarAccess.getCustomComputationalServiceRule());
						        }
					       		add(
					       			current, 
					       			"consumes",
					        		lv_consumes_1_0, 
					        		"Consume");
						        afterParserOrEnumRuleCall();
						    
					}

					}
					break;

				default :
					if ( cnt20 >= 1 ) break loop20;
					EarlyExitException eee = new EarlyExitException(20, input);
					throw eee;
				}
				cnt20++;
			}

			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1239:3: ( (lv_requests_2_0= ruleRequest ) )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==51) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1240:3: (lv_requests_2_0= ruleRequest )
					{
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1240:3: (lv_requests_2_0= ruleRequest )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1241:3: lv_requests_2_0= ruleRequest
					{
					 
						        newCompositeNode(grammarAccess.getCustomComputationalServiceAccess().getRequestsRequestParserRuleCall_2_0()); 
						    
					pushFollow(FOLLOW_ruleRequest_in_rulecustomComputationalService2582);
					lv_requests_2_0=ruleRequest();
					state._fsp--;


						        if (current==null) {
						            current = createModelElementForParent(grammarAccess.getCustomComputationalServiceRule());
						        }
					       		add(
					       			current, 
					       			"requests",
					        		lv_requests_2_0, 
					        		"Request");
						        afterParserOrEnumRuleCall();
						    
					}

					}
					break;

				default :
					break loop21;
				}
			}

			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1257:3: ( (lv_generateInfo_3_0= ruleGenerate ) )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==41) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1258:3: (lv_generateInfo_3_0= ruleGenerate )
					{
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1258:3: (lv_generateInfo_3_0= ruleGenerate )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1259:3: lv_generateInfo_3_0= ruleGenerate
					{
					 
						        newCompositeNode(grammarAccess.getCustomComputationalServiceAccess().getGenerateInfoGenerateParserRuleCall_3_0()); 
						    
					pushFollow(FOLLOW_ruleGenerate_in_rulecustomComputationalService2604);
					lv_generateInfo_3_0=ruleGenerate();
					state._fsp--;


						        if (current==null) {
						            current = createModelElementForParent(grammarAccess.getCustomComputationalServiceRule());
						        }
					       		add(
					       			current, 
					       			"generateInfo",
					        		lv_generateInfo_3_0, 
					        		"Generate");
						        afterParserOrEnumRuleCall();
						    
					}

					}
					break;

				default :
					break loop22;
				}
			}

			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1275:3: ( (lv_commands_4_0= ruleCommand ) )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==31) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1276:3: (lv_commands_4_0= ruleCommand )
					{
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1276:3: (lv_commands_4_0= ruleCommand )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1277:3: lv_commands_4_0= ruleCommand
					{
					 
						        newCompositeNode(grammarAccess.getCustomComputationalServiceAccess().getCommandsCommandParserRuleCall_4_0()); 
						    
					pushFollow(FOLLOW_ruleCommand_in_rulecustomComputationalService2626);
					lv_commands_4_0=ruleCommand();
					state._fsp--;


						        if (current==null) {
						            current = createModelElementForParent(grammarAccess.getCustomComputationalServiceRule());
						        }
					       		add(
					       			current, 
					       			"commands",
					        		lv_commands_4_0, 
					        		"Command");
						        afterParserOrEnumRuleCall();
						    
					}

					}
					break;

				default :
					break loop23;
				}
			}

			}

			}

			 leaveRule(); 
		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "rulecustomComputationalService"



	// $ANTLR start "entryRuleRequest"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1301:1: entryRuleRequest returns [EObject current=null] :iv_ruleRequest= ruleRequest EOF ;
	public final EObject entryRuleRequest() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleRequest =null;

		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1302:2: (iv_ruleRequest= ruleRequest EOF )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1303:2: iv_ruleRequest= ruleRequest EOF
			{
			 newCompositeNode(grammarAccess.getRequestRule()); 
			pushFollow(FOLLOW_ruleRequest_in_entryRuleRequest2663);
			iv_ruleRequest=ruleRequest();
			state._fsp--;

			 current =iv_ruleRequest; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleRequest2673); 
			}

		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleRequest"



	// $ANTLR start "ruleRequest"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1310:1: ruleRequest returns [EObject current=null] : (otherlv_0= 'request' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
	public final EObject ruleRequest() throws RecognitionException {
		EObject current = null;


		Token otherlv_0=null;
		Token otherlv_1=null;
		Token otherlv_2=null;
		Token otherlv_3=null;
		Token otherlv_4=null;

		 enterRule(); 
		    
		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1313:28: ( (otherlv_0= 'request' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1314:3: (otherlv_0= 'request' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1314:3: (otherlv_0= 'request' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1314:3: otherlv_0= 'request' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
			{
			otherlv_0=(Token)match(input,51,FOLLOW_51_in_ruleRequest2710); 

			    	newLeafNode(otherlv_0, grammarAccess.getRequestAccess().getRequestKeyword_0());
			    
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1318:3: ( (otherlv_1= RULE_ID ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1319:3: (otherlv_1= RULE_ID )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1319:3: (otherlv_1= RULE_ID )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1320:3: otherlv_1= RULE_ID
			{

						if (current==null) {
				            current = createModelElement(grammarAccess.getRequestRule());
				        }
			        
			otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequest2730); 

					newLeafNode(otherlv_1, grammarAccess.getRequestAccess().getRequestnameSourceNameCrossReference_1_0()); 
				
			}

			}

			otherlv_2=(Token)match(input,58,FOLLOW_58_in_ruleRequest2742); 

			    	newLeafNode(otherlv_2, grammarAccess.getRequestAccess().getToKeyword_2());
			    
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1335:3: ( (otherlv_3= RULE_ID ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1336:3: (otherlv_3= RULE_ID )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1336:3: (otherlv_3= RULE_ID )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1337:3: otherlv_3= RULE_ID
			{

						if (current==null) {
				            current = createModelElement(grammarAccess.getRequestRule());
				        }
			        
			otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequest2762); 

					newLeafNode(otherlv_3, grammarAccess.getRequestAccess().getStorageForRequestEntityNameCrossReference_3_0()); 
				
			}

			}

			otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleRequest2774); 

			    	newLeafNode(otherlv_4, grammarAccess.getRequestAccess().getSemicolonKeyword_4());
			    
			}

			}

			 leaveRule(); 
		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleRequest"



	// $ANTLR start "entryRuleConsumeForInBuilt"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1360:1: entryRuleConsumeForInBuilt returns [EObject current=null] :iv_ruleConsumeForInBuilt= ruleConsumeForInBuilt EOF ;
	public final EObject entryRuleConsumeForInBuilt() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleConsumeForInBuilt =null;

		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1361:2: (iv_ruleConsumeForInBuilt= ruleConsumeForInBuilt EOF )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1362:2: iv_ruleConsumeForInBuilt= ruleConsumeForInBuilt EOF
			{
			 newCompositeNode(grammarAccess.getConsumeForInBuiltRule()); 
			pushFollow(FOLLOW_ruleConsumeForInBuilt_in_entryRuleConsumeForInBuilt2810);
			iv_ruleConsumeForInBuilt=ruleConsumeForInBuilt();
			state._fsp--;

			 current =iv_ruleConsumeForInBuilt; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleConsumeForInBuilt2820); 
			}

		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleConsumeForInBuilt"



	// $ANTLR start "ruleConsumeForInBuilt"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1369:1: ruleConsumeForInBuilt returns [EObject current=null] : (otherlv_0= 'consume' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
	public final EObject ruleConsumeForInBuilt() throws RecognitionException {
		EObject current = null;


		Token otherlv_0=null;
		Token otherlv_1=null;
		Token otherlv_2=null;
		Token otherlv_3=null;
		Token otherlv_4=null;

		 enterRule(); 
		    
		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1372:28: ( (otherlv_0= 'consume' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1373:3: (otherlv_0= 'consume' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1373:3: (otherlv_0= 'consume' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1373:3: otherlv_0= 'consume' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
			{
			otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleConsumeForInBuilt2857); 

			    	newLeafNode(otherlv_0, grammarAccess.getConsumeForInBuiltAccess().getConsumeKeyword_0());
			    
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1377:3: ( (otherlv_1= RULE_ID ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1378:3: (otherlv_1= RULE_ID )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1378:3: (otherlv_1= RULE_ID )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1379:3: otherlv_1= RULE_ID
			{

						if (current==null) {
				            current = createModelElement(grammarAccess.getConsumeForInBuiltRule());
				        }
			        
			otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConsumeForInBuilt2877); 

					newLeafNode(otherlv_1, grammarAccess.getConsumeForInBuiltAccess().getNameSourceNameCrossReference_1_0()); 
				
			}

			}

			otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleConsumeForInBuilt2889); 

			    	newLeafNode(otherlv_2, grammarAccess.getConsumeForInBuiltAccess().getFromKeyword_2());
			    
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1394:3: ( (otherlv_3= RULE_ID ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1395:3: (otherlv_3= RULE_ID )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1395:3: (otherlv_3= RULE_ID )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1396:3: otherlv_3= RULE_ID
			{

						if (current==null) {
				            current = createModelElement(grammarAccess.getConsumeForInBuiltRule());
				        }
			        
			otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConsumeForInBuilt2909); 

					newLeafNode(otherlv_3, grammarAccess.getConsumeForInBuiltAccess().getSensorForConsumeEntityNameCrossReference_3_0()); 
				
			}

			}

			otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleConsumeForInBuilt2921); 

			    	newLeafNode(otherlv_4, grammarAccess.getConsumeForInBuiltAccess().getSemicolonKeyword_4());
			    
			}

			}

			 leaveRule(); 
		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleConsumeForInBuilt"



	// $ANTLR start "entryRuleConsume"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1419:1: entryRuleConsume returns [EObject current=null] :iv_ruleConsume= ruleConsume EOF ;
	public final EObject entryRuleConsume() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleConsume =null;

		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1420:2: (iv_ruleConsume= ruleConsume EOF )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1421:2: iv_ruleConsume= ruleConsume EOF
			{
			 newCompositeNode(grammarAccess.getConsumeRule()); 
			pushFollow(FOLLOW_ruleConsume_in_entryRuleConsume2957);
			iv_ruleConsume=ruleConsume();
			state._fsp--;

			 current =iv_ruleConsume; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleConsume2967); 
			}

		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleConsume"



	// $ANTLR start "ruleConsume"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1428:1: ruleConsume returns [EObject current=null] : (otherlv_0= 'consume' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
	public final EObject ruleConsume() throws RecognitionException {
		EObject current = null;


		Token otherlv_0=null;
		Token otherlv_1=null;
		Token otherlv_2=null;
		Token otherlv_3=null;
		Token otherlv_4=null;

		 enterRule(); 
		    
		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1431:28: ( (otherlv_0= 'consume' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1432:3: (otherlv_0= 'consume' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1432:3: (otherlv_0= 'consume' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1432:3: otherlv_0= 'consume' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
			{
			otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleConsume3004); 

			    	newLeafNode(otherlv_0, grammarAccess.getConsumeAccess().getConsumeKeyword_0());
			    
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1436:3: ( (otherlv_1= RULE_ID ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1437:3: (otherlv_1= RULE_ID )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1437:3: (otherlv_1= RULE_ID )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1438:3: otherlv_1= RULE_ID
			{

						if (current==null) {
				            current = createModelElement(grammarAccess.getConsumeRule());
				        }
			        
			otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConsume3024); 

					newLeafNode(otherlv_1, grammarAccess.getConsumeAccess().getNameSourceNameCrossReference_1_0()); 
				
			}

			}

			otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleConsume3036); 

			    	newLeafNode(otherlv_2, grammarAccess.getConsumeAccess().getFromKeyword_2());
			    
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1453:3: ( (otherlv_3= RULE_ID ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1454:3: (otherlv_3= RULE_ID )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1454:3: (otherlv_3= RULE_ID )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1455:3: otherlv_3= RULE_ID
			{

						if (current==null) {
				            current = createModelElement(grammarAccess.getConsumeRule());
				        }
			        
			otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConsume3056); 

					newLeafNode(otherlv_3, grammarAccess.getConsumeAccess().getFromNameEntityNameCrossReference_3_0()); 
				
			}

			}

			otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleConsume3068); 

			    	newLeafNode(otherlv_4, grammarAccess.getConsumeAccess().getSemicolonKeyword_4());
			    
			}

			}

			 leaveRule(); 
		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleConsume"



	// $ANTLR start "entryRuleCommand"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1478:1: entryRuleCommand returns [EObject current=null] :iv_ruleCommand= ruleCommand EOF ;
	public final EObject entryRuleCommand() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleCommand =null;

		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1479:2: (iv_ruleCommand= ruleCommand EOF )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1480:2: iv_ruleCommand= ruleCommand EOF
			{
			 newCompositeNode(grammarAccess.getCommandRule()); 
			pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand3104);
			iv_ruleCommand=ruleCommand();
			state._fsp--;

			 current =iv_ruleCommand; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleCommand3114); 
			}

		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleCommand"



	// $ANTLR start "ruleCommand"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1487:1: ruleCommand returns [EObject current=null] : (otherlv_0= 'command' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_commandparameter_3_0= ruleCommandParameter ) )? otherlv_4= ')' otherlv_5= 'to' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) ;
	public final EObject ruleCommand() throws RecognitionException {
		EObject current = null;


		Token otherlv_0=null;
		Token otherlv_1=null;
		Token otherlv_2=null;
		Token otherlv_4=null;
		Token otherlv_5=null;
		Token otherlv_6=null;
		Token otherlv_7=null;
		EObject lv_commandparameter_3_0 =null;

		 enterRule(); 
		    
		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1490:28: ( (otherlv_0= 'command' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_commandparameter_3_0= ruleCommandParameter ) )? otherlv_4= ')' otherlv_5= 'to' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1491:3: (otherlv_0= 'command' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_commandparameter_3_0= ruleCommandParameter ) )? otherlv_4= ')' otherlv_5= 'to' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1491:3: (otherlv_0= 'command' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_commandparameter_3_0= ruleCommandParameter ) )? otherlv_4= ')' otherlv_5= 'to' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1491:3: otherlv_0= 'command' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_commandparameter_3_0= ruleCommandParameter ) )? otherlv_4= ')' otherlv_5= 'to' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';'
			{
			otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleCommand3151); 

			    	newLeafNode(otherlv_0, grammarAccess.getCommandAccess().getCommandKeyword_0());
			    
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1495:3: ( (otherlv_1= RULE_ID ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1496:3: (otherlv_1= RULE_ID )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1496:3: (otherlv_1= RULE_ID )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1497:3: otherlv_1= RULE_ID
			{

						if (current==null) {
				            current = createModelElement(grammarAccess.getCommandRule());
				        }
			        
			otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommand3171); 

					newLeafNode(otherlv_1, grammarAccess.getCommandAccess().getCommandNameActionNameCrossReference_1_0()); 
				
			}

			}

			otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleCommand3183); 

			    	newLeafNode(otherlv_2, grammarAccess.getCommandAccess().getLeftParenthesisKeyword_2());
			    
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1512:3: ( (lv_commandparameter_3_0= ruleCommandParameter ) )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==RULE_ID) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1513:3: (lv_commandparameter_3_0= ruleCommandParameter )
					{
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1513:3: (lv_commandparameter_3_0= ruleCommandParameter )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1514:3: lv_commandparameter_3_0= ruleCommandParameter
					{
					 
						        newCompositeNode(grammarAccess.getCommandAccess().getCommandparameterCommandParameterParserRuleCall_3_0()); 
						    
					pushFollow(FOLLOW_ruleCommandParameter_in_ruleCommand3204);
					lv_commandparameter_3_0=ruleCommandParameter();
					state._fsp--;


						        if (current==null) {
						            current = createModelElementForParent(grammarAccess.getCommandRule());
						        }
					       		set(
					       			current, 
					       			"commandparameter",
					        		lv_commandparameter_3_0, 
					        		"CommandParameter");
						        afterParserOrEnumRuleCall();
						    
					}

					}
					break;

			}

			otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleCommand3217); 

			    	newLeafNode(otherlv_4, grammarAccess.getCommandAccess().getRightParenthesisKeyword_4());
			    
			otherlv_5=(Token)match(input,58,FOLLOW_58_in_ruleCommand3229); 

			    	newLeafNode(otherlv_5, grammarAccess.getCommandAccess().getToKeyword_5());
			    
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1538:3: ( (otherlv_6= RULE_ID ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1539:3: (otherlv_6= RULE_ID )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1539:3: (otherlv_6= RULE_ID )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1540:3: otherlv_6= RULE_ID
			{

						if (current==null) {
				            current = createModelElement(grammarAccess.getCommandRule());
				        }
			        
			otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommand3249); 

					newLeafNode(otherlv_6, grammarAccess.getCommandAccess().getActuatorForCommandEntityNameCrossReference_6_0()); 
				
			}

			}

			otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleCommand3261); 

			    	newLeafNode(otherlv_7, grammarAccess.getCommandAccess().getSemicolonKeyword_7());
			    
			}

			}

			 leaveRule(); 
		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleCommand"



	// $ANTLR start "entryRuleCommandParameter"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1563:1: entryRuleCommandParameter returns [EObject current=null] :iv_ruleCommandParameter= ruleCommandParameter EOF ;
	public final EObject entryRuleCommandParameter() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleCommandParameter =null;

		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1564:2: (iv_ruleCommandParameter= ruleCommandParameter EOF )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1565:2: iv_ruleCommandParameter= ruleCommandParameter EOF
			{
			 newCompositeNode(grammarAccess.getCommandParameterRule()); 
			pushFollow(FOLLOW_ruleCommandParameter_in_entryRuleCommandParameter3297);
			iv_ruleCommandParameter=ruleCommandParameter();
			state._fsp--;

			 current =iv_ruleCommandParameter; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleCommandParameter3307); 
			}

		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleCommandParameter"



	// $ANTLR start "ruleCommandParameter"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1572:1: ruleCommandParameter returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_parameter_2_0= ruleCommandParameter ) ) )? ) ;
	public final EObject ruleCommandParameter() throws RecognitionException {
		EObject current = null;


		Token otherlv_0=null;
		Token otherlv_1=null;
		EObject lv_parameter_2_0 =null;

		 enterRule(); 
		    
		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1575:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_parameter_2_0= ruleCommandParameter ) ) )? ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1576:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_parameter_2_0= ruleCommandParameter ) ) )? )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1576:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_parameter_2_0= ruleCommandParameter ) ) )? )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1576:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_parameter_2_0= ruleCommandParameter ) ) )?
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1576:2: ( (otherlv_0= RULE_ID ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1577:3: (otherlv_0= RULE_ID )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1577:3: (otherlv_0= RULE_ID )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1578:3: otherlv_0= RULE_ID
			{

						if (current==null) {
				            current = createModelElement(grammarAccess.getCommandParameterRule());
				        }
			        
			otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommandParameter3352); 

					newLeafNode(otherlv_0, grammarAccess.getCommandParameterAccess().getNameParameterNameCrossReference_0_0()); 
				
			}

			}

			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1589:2: (otherlv_1= ',' ( (lv_parameter_2_0= ruleCommandParameter ) ) )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==13) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1589:4: otherlv_1= ',' ( (lv_parameter_2_0= ruleCommandParameter ) )
					{
					otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleCommandParameter3365); 

					    	newLeafNode(otherlv_1, grammarAccess.getCommandParameterAccess().getCommaKeyword_1_0());
					    
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1593:3: ( (lv_parameter_2_0= ruleCommandParameter ) )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1594:3: (lv_parameter_2_0= ruleCommandParameter )
					{
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1594:3: (lv_parameter_2_0= ruleCommandParameter )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1595:3: lv_parameter_2_0= ruleCommandParameter
					{
					 
						        newCompositeNode(grammarAccess.getCommandParameterAccess().getParameterCommandParameterParserRuleCall_1_1_0()); 
						    
					pushFollow(FOLLOW_ruleCommandParameter_in_ruleCommandParameter3386);
					lv_parameter_2_0=ruleCommandParameter();
					state._fsp--;


						        if (current==null) {
						            current = createModelElementForParent(grammarAccess.getCommandParameterRule());
						        }
					       		set(
					       			current, 
					       			"parameter",
					        		lv_parameter_2_0, 
					        		"CommandParameter");
						        afterParserOrEnumRuleCall();
						    
					}

					}

					}
					break;

			}

			}

			}

			 leaveRule(); 
		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleCommandParameter"



	// $ANTLR start "entryRuleVocSpec"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1619:1: entryRuleVocSpec returns [EObject current=null] :iv_ruleVocSpec= ruleVocSpec EOF ;
	public final EObject entryRuleVocSpec() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleVocSpec =null;

		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1620:2: (iv_ruleVocSpec= ruleVocSpec EOF )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1621:2: iv_ruleVocSpec= ruleVocSpec EOF
			{
			 newCompositeNode(grammarAccess.getVocSpecRule()); 
			pushFollow(FOLLOW_ruleVocSpec_in_entryRuleVocSpec3424);
			iv_ruleVocSpec=ruleVocSpec();
			state._fsp--;

			 current =iv_ruleVocSpec; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleVocSpec3434); 
			}

		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleVocSpec"



	// $ANTLR start "ruleVocSpec"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1628:1: ruleVocSpec returns [EObject current=null] : (otherlv_0= 'structs' otherlv_1= ':' ( (lv_structs_2_0= ruleStruct ) )+ otherlv_3= 'resources' otherlv_4= ':' otherlv_5= 'sensors' otherlv_6= ':' otherlv_7= 'periodicSensors' otherlv_8= ':' ( (lv_periodicSensors_9_0= rulePeriodicSensors ) )* otherlv_10= 'eventDrivenSensors' otherlv_11= ':' ( (lv_eventSensors_12_0= ruleEventSensors ) )* otherlv_13= 'actuators' otherlv_14= ':' ( (lv_actuators_15_0= ruleActuator ) )* otherlv_16= 'storages' otherlv_17= ':' ( (lv_storageService_18_0= ruleStorageService ) )* ) ;
	public final EObject ruleVocSpec() throws RecognitionException {
		EObject current = null;


		Token otherlv_0=null;
		Token otherlv_1=null;
		Token otherlv_3=null;
		Token otherlv_4=null;
		Token otherlv_5=null;
		Token otherlv_6=null;
		Token otherlv_7=null;
		Token otherlv_8=null;
		Token otherlv_10=null;
		Token otherlv_11=null;
		Token otherlv_13=null;
		Token otherlv_14=null;
		Token otherlv_16=null;
		Token otherlv_17=null;
		EObject lv_structs_2_0 =null;
		EObject lv_periodicSensors_9_0 =null;
		EObject lv_eventSensors_12_0 =null;
		EObject lv_actuators_15_0 =null;
		EObject lv_storageService_18_0 =null;

		 enterRule(); 
		    
		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1631:28: ( (otherlv_0= 'structs' otherlv_1= ':' ( (lv_structs_2_0= ruleStruct ) )+ otherlv_3= 'resources' otherlv_4= ':' otherlv_5= 'sensors' otherlv_6= ':' otherlv_7= 'periodicSensors' otherlv_8= ':' ( (lv_periodicSensors_9_0= rulePeriodicSensors ) )* otherlv_10= 'eventDrivenSensors' otherlv_11= ':' ( (lv_eventSensors_12_0= ruleEventSensors ) )* otherlv_13= 'actuators' otherlv_14= ':' ( (lv_actuators_15_0= ruleActuator ) )* otherlv_16= 'storages' otherlv_17= ':' ( (lv_storageService_18_0= ruleStorageService ) )* ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1632:3: (otherlv_0= 'structs' otherlv_1= ':' ( (lv_structs_2_0= ruleStruct ) )+ otherlv_3= 'resources' otherlv_4= ':' otherlv_5= 'sensors' otherlv_6= ':' otherlv_7= 'periodicSensors' otherlv_8= ':' ( (lv_periodicSensors_9_0= rulePeriodicSensors ) )* otherlv_10= 'eventDrivenSensors' otherlv_11= ':' ( (lv_eventSensors_12_0= ruleEventSensors ) )* otherlv_13= 'actuators' otherlv_14= ':' ( (lv_actuators_15_0= ruleActuator ) )* otherlv_16= 'storages' otherlv_17= ':' ( (lv_storageService_18_0= ruleStorageService ) )* )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1632:3: (otherlv_0= 'structs' otherlv_1= ':' ( (lv_structs_2_0= ruleStruct ) )+ otherlv_3= 'resources' otherlv_4= ':' otherlv_5= 'sensors' otherlv_6= ':' otherlv_7= 'periodicSensors' otherlv_8= ':' ( (lv_periodicSensors_9_0= rulePeriodicSensors ) )* otherlv_10= 'eventDrivenSensors' otherlv_11= ':' ( (lv_eventSensors_12_0= ruleEventSensors ) )* otherlv_13= 'actuators' otherlv_14= ':' ( (lv_actuators_15_0= ruleActuator ) )* otherlv_16= 'storages' otherlv_17= ':' ( (lv_storageService_18_0= ruleStorageService ) )* )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1632:3: otherlv_0= 'structs' otherlv_1= ':' ( (lv_structs_2_0= ruleStruct ) )+ otherlv_3= 'resources' otherlv_4= ':' otherlv_5= 'sensors' otherlv_6= ':' otherlv_7= 'periodicSensors' otherlv_8= ':' ( (lv_periodicSensors_9_0= rulePeriodicSensors ) )* otherlv_10= 'eventDrivenSensors' otherlv_11= ':' ( (lv_eventSensors_12_0= ruleEventSensors ) )* otherlv_13= 'actuators' otherlv_14= ':' ( (lv_actuators_15_0= ruleActuator ) )* otherlv_16= 'storages' otherlv_17= ':' ( (lv_storageService_18_0= ruleStorageService ) )*
			{
			otherlv_0=(Token)match(input,57,FOLLOW_57_in_ruleVocSpec3471); 

			    	newLeafNode(otherlv_0, grammarAccess.getVocSpecAccess().getStructsKeyword_0());
			    
			otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleVocSpec3483); 

			    	newLeafNode(otherlv_1, grammarAccess.getVocSpecAccess().getColonKeyword_1());
			    
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1640:3: ( (lv_structs_2_0= ruleStruct ) )+
			int cnt26=0;
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==RULE_ID) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1641:3: (lv_structs_2_0= ruleStruct )
					{
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1641:3: (lv_structs_2_0= ruleStruct )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1642:3: lv_structs_2_0= ruleStruct
					{
					 
						        newCompositeNode(grammarAccess.getVocSpecAccess().getStructsStructParserRuleCall_2_0()); 
						    
					pushFollow(FOLLOW_ruleStruct_in_ruleVocSpec3504);
					lv_structs_2_0=ruleStruct();
					state._fsp--;


						        if (current==null) {
						            current = createModelElementForParent(grammarAccess.getVocSpecRule());
						        }
					       		add(
					       			current, 
					       			"structs",
					        		lv_structs_2_0, 
					        		"Struct");
						        afterParserOrEnumRuleCall();
						    
					}

					}
					break;

				default :
					if ( cnt26 >= 1 ) break loop26;
					EarlyExitException eee = new EarlyExitException(26, input);
					throw eee;
				}
				cnt26++;
			}

			otherlv_3=(Token)match(input,52,FOLLOW_52_in_ruleVocSpec3517); 

			    	newLeafNode(otherlv_3, grammarAccess.getVocSpecAccess().getResourcesKeyword_3());
			    
			otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleVocSpec3529); 

			    	newLeafNode(otherlv_4, grammarAccess.getVocSpecAccess().getColonKeyword_4());
			    
			otherlv_5=(Token)match(input,54,FOLLOW_54_in_ruleVocSpec3541); 

			    	newLeafNode(otherlv_5, grammarAccess.getVocSpecAccess().getSensorsKeyword_5());
			    
			otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleVocSpec3553); 

			    	newLeafNode(otherlv_6, grammarAccess.getVocSpecAccess().getColonKeyword_6());
			    
			otherlv_7=(Token)match(input,48,FOLLOW_48_in_ruleVocSpec3565); 

			    	newLeafNode(otherlv_7, grammarAccess.getVocSpecAccess().getPeriodicSensorsKeyword_7());
			    
			otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleVocSpec3577); 

			    	newLeafNode(otherlv_8, grammarAccess.getVocSpecAccess().getColonKeyword_8());
			    
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1682:3: ( (lv_periodicSensors_9_0= rulePeriodicSensors ) )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==RULE_ID) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1683:3: (lv_periodicSensors_9_0= rulePeriodicSensors )
					{
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1683:3: (lv_periodicSensors_9_0= rulePeriodicSensors )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1684:3: lv_periodicSensors_9_0= rulePeriodicSensors
					{
					 
						        newCompositeNode(grammarAccess.getVocSpecAccess().getPeriodicSensorsPeriodicSensorsParserRuleCall_9_0()); 
						    
					pushFollow(FOLLOW_rulePeriodicSensors_in_ruleVocSpec3598);
					lv_periodicSensors_9_0=rulePeriodicSensors();
					state._fsp--;


						        if (current==null) {
						            current = createModelElementForParent(grammarAccess.getVocSpecRule());
						        }
					       		add(
					       			current, 
					       			"periodicSensors",
					        		lv_periodicSensors_9_0, 
					        		"PeriodicSensors");
						        afterParserOrEnumRuleCall();
						    
					}

					}
					break;

				default :
					break loop27;
				}
			}

			otherlv_10=(Token)match(input,38,FOLLOW_38_in_ruleVocSpec3611); 

			    	newLeafNode(otherlv_10, grammarAccess.getVocSpecAccess().getEventDrivenSensorsKeyword_10());
			    
			otherlv_11=(Token)match(input,14,FOLLOW_14_in_ruleVocSpec3623); 

			    	newLeafNode(otherlv_11, grammarAccess.getVocSpecAccess().getColonKeyword_11());
			    
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1708:3: ( (lv_eventSensors_12_0= ruleEventSensors ) )*
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==RULE_ID) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1709:3: (lv_eventSensors_12_0= ruleEventSensors )
					{
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1709:3: (lv_eventSensors_12_0= ruleEventSensors )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1710:3: lv_eventSensors_12_0= ruleEventSensors
					{
					 
						        newCompositeNode(grammarAccess.getVocSpecAccess().getEventSensorsEventSensorsParserRuleCall_12_0()); 
						    
					pushFollow(FOLLOW_ruleEventSensors_in_ruleVocSpec3644);
					lv_eventSensors_12_0=ruleEventSensors();
					state._fsp--;


						        if (current==null) {
						            current = createModelElementForParent(grammarAccess.getVocSpecRule());
						        }
					       		add(
					       			current, 
					       			"eventSensors",
					        		lv_eventSensors_12_0, 
					        		"EventSensors");
						        afterParserOrEnumRuleCall();
						    
					}

					}
					break;

				default :
					break loop28;
				}
			}

			otherlv_13=(Token)match(input,29,FOLLOW_29_in_ruleVocSpec3657); 

			    	newLeafNode(otherlv_13, grammarAccess.getVocSpecAccess().getActuatorsKeyword_13());
			    
			otherlv_14=(Token)match(input,14,FOLLOW_14_in_ruleVocSpec3669); 

			    	newLeafNode(otherlv_14, grammarAccess.getVocSpecAccess().getColonKeyword_14());
			    
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1734:3: ( (lv_actuators_15_0= ruleActuator ) )*
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==RULE_ID) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1735:3: (lv_actuators_15_0= ruleActuator )
					{
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1735:3: (lv_actuators_15_0= ruleActuator )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1736:3: lv_actuators_15_0= ruleActuator
					{
					 
						        newCompositeNode(grammarAccess.getVocSpecAccess().getActuatorsActuatorParserRuleCall_15_0()); 
						    
					pushFollow(FOLLOW_ruleActuator_in_ruleVocSpec3690);
					lv_actuators_15_0=ruleActuator();
					state._fsp--;


						        if (current==null) {
						            current = createModelElementForParent(grammarAccess.getVocSpecRule());
						        }
					       		add(
					       			current, 
					       			"actuators",
					        		lv_actuators_15_0, 
					        		"Actuator");
						        afterParserOrEnumRuleCall();
						    
					}

					}
					break;

				default :
					break loop29;
				}
			}

			otherlv_16=(Token)match(input,56,FOLLOW_56_in_ruleVocSpec3703); 

			    	newLeafNode(otherlv_16, grammarAccess.getVocSpecAccess().getStoragesKeyword_16());
			    
			otherlv_17=(Token)match(input,14,FOLLOW_14_in_ruleVocSpec3715); 

			    	newLeafNode(otherlv_17, grammarAccess.getVocSpecAccess().getColonKeyword_17());
			    
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1760:3: ( (lv_storageService_18_0= ruleStorageService ) )*
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==RULE_ID) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1761:3: (lv_storageService_18_0= ruleStorageService )
					{
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1761:3: (lv_storageService_18_0= ruleStorageService )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1762:3: lv_storageService_18_0= ruleStorageService
					{
					 
						        newCompositeNode(grammarAccess.getVocSpecAccess().getStorageServiceStorageServiceParserRuleCall_18_0()); 
						    
					pushFollow(FOLLOW_ruleStorageService_in_ruleVocSpec3736);
					lv_storageService_18_0=ruleStorageService();
					state._fsp--;


						        if (current==null) {
						            current = createModelElementForParent(grammarAccess.getVocSpecRule());
						        }
					       		add(
					       			current, 
					       			"storageService",
					        		lv_storageService_18_0, 
					        		"StorageService");
						        afterParserOrEnumRuleCall();
						    
					}

					}
					break;

				default :
					break loop30;
				}
			}

			}

			}

			 leaveRule(); 
		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleVocSpec"



	// $ANTLR start "entryRuleRegionLabel"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1788:1: entryRuleRegionLabel returns [EObject current=null] :iv_ruleRegionLabel= ruleRegionLabel EOF ;
	public final EObject entryRuleRegionLabel() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleRegionLabel =null;

		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1789:2: (iv_ruleRegionLabel= ruleRegionLabel EOF )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1790:2: iv_ruleRegionLabel= ruleRegionLabel EOF
			{
			 newCompositeNode(grammarAccess.getRegionLabelRule()); 
			pushFollow(FOLLOW_ruleRegionLabel_in_entryRuleRegionLabel3775);
			iv_ruleRegionLabel=ruleRegionLabel();
			state._fsp--;

			 current =iv_ruleRegionLabel; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleRegionLabel3785); 
			}

		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleRegionLabel"



	// $ANTLR start "ruleRegionLabel"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1797:1: ruleRegionLabel returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
	public final EObject ruleRegionLabel() throws RecognitionException {
		EObject current = null;


		Token lv_name_0_0=null;

		 enterRule(); 
		    
		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1800:28: ( ( (lv_name_0_0= RULE_ID ) ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1801:3: ( (lv_name_0_0= RULE_ID ) )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1801:3: ( (lv_name_0_0= RULE_ID ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1802:3: (lv_name_0_0= RULE_ID )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1802:3: (lv_name_0_0= RULE_ID )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1803:3: lv_name_0_0= RULE_ID
			{
			lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRegionLabel3826); 

						newLeafNode(lv_name_0_0, grammarAccess.getRegionLabelAccess().getNameIDTerminalRuleCall_0()); 
					

				        if (current==null) {
				            current = createModelElement(grammarAccess.getRegionLabelRule());
				        }
			       		setWithLastConsumed(
			       			current, 
			       			"name",
			        		lv_name_0_0, 
			        		"ID");
				    
			}

			}

			}

			 leaveRule(); 
		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleRegionLabel"



	// $ANTLR start "entryRuleStruct"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1827:1: entryRuleStruct returns [EObject current=null] :iv_ruleStruct= ruleStruct EOF ;
	public final EObject entryRuleStruct() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleStruct =null;

		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1828:2: (iv_ruleStruct= ruleStruct EOF )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1829:2: iv_ruleStruct= ruleStruct EOF
			{
			 newCompositeNode(grammarAccess.getStructRule()); 
			pushFollow(FOLLOW_ruleStruct_in_entryRuleStruct3866);
			iv_ruleStruct=ruleStruct();
			state._fsp--;

			 current =iv_ruleStruct; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleStruct3876); 
			}

		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleStruct"



	// $ANTLR start "ruleStruct"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1836:1: ruleStruct returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_fields_1_0= ruleField ) )+ ) ;
	public final EObject ruleStruct() throws RecognitionException {
		EObject current = null;


		Token lv_name_0_0=null;
		EObject lv_fields_1_0 =null;

		 enterRule(); 
		    
		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1839:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_fields_1_0= ruleField ) )+ ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1840:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_fields_1_0= ruleField ) )+ )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1840:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_fields_1_0= ruleField ) )+ )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1840:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_fields_1_0= ruleField ) )+
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1840:2: ( (lv_name_0_0= RULE_ID ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1841:3: (lv_name_0_0= RULE_ID )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1841:3: (lv_name_0_0= RULE_ID )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1842:3: lv_name_0_0= RULE_ID
			{
			lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStruct3918); 

						newLeafNode(lv_name_0_0, grammarAccess.getStructAccess().getNameIDTerminalRuleCall_0_0()); 
					

				        if (current==null) {
				            current = createModelElement(grammarAccess.getStructRule());
				        }
			       		setWithLastConsumed(
			       			current, 
			       			"name",
			        		lv_name_0_0, 
			        		"ID");
				    
			}

			}

			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1858:2: ( (lv_fields_1_0= ruleField ) )+
			int cnt31=0;
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==RULE_ID) ) {
					int LA31_2 = input.LA(2);
					if ( (LA31_2==14) ) {
						alt31=1;
					}

				}

				switch (alt31) {
				case 1 :
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1859:3: (lv_fields_1_0= ruleField )
					{
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1859:3: (lv_fields_1_0= ruleField )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1860:3: lv_fields_1_0= ruleField
					{
					 
						        newCompositeNode(grammarAccess.getStructAccess().getFieldsFieldParserRuleCall_1_0()); 
						    
					pushFollow(FOLLOW_ruleField_in_ruleStruct3944);
					lv_fields_1_0=ruleField();
					state._fsp--;


						        if (current==null) {
						            current = createModelElementForParent(grammarAccess.getStructRule());
						        }
					       		add(
					       			current, 
					       			"fields",
					        		lv_fields_1_0, 
					        		"Field");
						        afterParserOrEnumRuleCall();
						    
					}

					}
					break;

				default :
					if ( cnt31 >= 1 ) break loop31;
					EarlyExitException eee = new EarlyExitException(31, input);
					throw eee;
				}
				cnt31++;
			}

			}

			}

			 leaveRule(); 
		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleStruct"



	// $ANTLR start "entryRuleField"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1884:1: entryRuleField returns [EObject current=null] :iv_ruleField= ruleField EOF ;
	public final EObject entryRuleField() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleField =null;

		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1885:2: (iv_ruleField= ruleField EOF )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1886:2: iv_ruleField= ruleField EOF
			{
			 newCompositeNode(grammarAccess.getFieldRule()); 
			pushFollow(FOLLOW_ruleField_in_entryRuleField3981);
			iv_ruleField=ruleField();
			state._fsp--;

			 current =iv_ruleField; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleField3991); 
			}

		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleField"



	// $ANTLR start "ruleField"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1893:1: ruleField returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) otherlv_3= ';' ) ;
	public final EObject ruleField() throws RecognitionException {
		EObject current = null;


		Token lv_name_0_0=null;
		Token otherlv_1=null;
		Token otherlv_3=null;
		EObject lv_type_2_0 =null;

		 enterRule(); 
		    
		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1896:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) otherlv_3= ';' ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1897:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) otherlv_3= ';' )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1897:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) otherlv_3= ';' )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1897:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) otherlv_3= ';'
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1897:2: ( (lv_name_0_0= RULE_ID ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1898:3: (lv_name_0_0= RULE_ID )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1898:3: (lv_name_0_0= RULE_ID )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1899:3: lv_name_0_0= RULE_ID
			{
			lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleField4033); 

						newLeafNode(lv_name_0_0, grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0_0()); 
					

				        if (current==null) {
				            current = createModelElement(grammarAccess.getFieldRule());
				        }
			       		setWithLastConsumed(
			       			current, 
			       			"name",
			        		lv_name_0_0, 
			        		"ID");
				    
			}

			}

			otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleField4050); 

			    	newLeafNode(otherlv_1, grammarAccess.getFieldAccess().getColonKeyword_1());
			    
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1919:3: ( (lv_type_2_0= ruleType ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1920:3: (lv_type_2_0= ruleType )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1920:3: (lv_type_2_0= ruleType )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1921:3: lv_type_2_0= ruleType
			{
			 
				        newCompositeNode(grammarAccess.getFieldAccess().getTypeTypeParserRuleCall_2_0()); 
				    
			pushFollow(FOLLOW_ruleType_in_ruleField4071);
			lv_type_2_0=ruleType();
			state._fsp--;


				        if (current==null) {
				            current = createModelElementForParent(grammarAccess.getFieldRule());
				        }
			       		add(
			       			current, 
			       			"type",
			        		lv_type_2_0, 
			        		"Type");
				        afterParserOrEnumRuleCall();
				    
			}

			}

			otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleField4083); 

			    	newLeafNode(otherlv_3, grammarAccess.getFieldAccess().getSemicolonKeyword_3());
			    
			}

			}

			 leaveRule(); 
		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleField"



	// $ANTLR start "entryRulePeriodicSensors"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1949:1: entryRulePeriodicSensors returns [EObject current=null] :iv_rulePeriodicSensors= rulePeriodicSensors EOF ;
	public final EObject entryRulePeriodicSensors() throws RecognitionException {
		EObject current = null;


		EObject iv_rulePeriodicSensors =null;

		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1950:2: (iv_rulePeriodicSensors= rulePeriodicSensors EOF )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1951:2: iv_rulePeriodicSensors= rulePeriodicSensors EOF
			{
			 newCompositeNode(grammarAccess.getPeriodicSensorsRule()); 
			pushFollow(FOLLOW_rulePeriodicSensors_in_entryRulePeriodicSensors4119);
			iv_rulePeriodicSensors=rulePeriodicSensors();
			state._fsp--;

			 current =iv_rulePeriodicSensors; 
			match(input,EOF,FOLLOW_EOF_in_entryRulePeriodicSensors4129); 
			}

		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRulePeriodicSensors"



	// $ANTLR start "rulePeriodicSensors"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1958:1: rulePeriodicSensors returns [EObject current=null] : ( ( (lv_sensorName_0_0= ruleEntityName ) ) ( (lv_generateInfo_1_0= ruleGenerate ) )+ otherlv_2= 'sample' otherlv_3= 'period' this_INT_4= RULE_INT otherlv_5= 'for' this_INT_6= RULE_INT otherlv_7= ';' ) ;
	public final EObject rulePeriodicSensors() throws RecognitionException {
		EObject current = null;


		Token otherlv_2=null;
		Token otherlv_3=null;
		Token this_INT_4=null;
		Token otherlv_5=null;
		Token this_INT_6=null;
		Token otherlv_7=null;
		EObject lv_sensorName_0_0 =null;
		EObject lv_generateInfo_1_0 =null;

		 enterRule(); 
		    
		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1961:28: ( ( ( (lv_sensorName_0_0= ruleEntityName ) ) ( (lv_generateInfo_1_0= ruleGenerate ) )+ otherlv_2= 'sample' otherlv_3= 'period' this_INT_4= RULE_INT otherlv_5= 'for' this_INT_6= RULE_INT otherlv_7= ';' ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1962:2: ( ( (lv_sensorName_0_0= ruleEntityName ) ) ( (lv_generateInfo_1_0= ruleGenerate ) )+ otherlv_2= 'sample' otherlv_3= 'period' this_INT_4= RULE_INT otherlv_5= 'for' this_INT_6= RULE_INT otherlv_7= ';' )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1962:2: ( ( (lv_sensorName_0_0= ruleEntityName ) ) ( (lv_generateInfo_1_0= ruleGenerate ) )+ otherlv_2= 'sample' otherlv_3= 'period' this_INT_4= RULE_INT otherlv_5= 'for' this_INT_6= RULE_INT otherlv_7= ';' )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1962:2: ( (lv_sensorName_0_0= ruleEntityName ) ) ( (lv_generateInfo_1_0= ruleGenerate ) )+ otherlv_2= 'sample' otherlv_3= 'period' this_INT_4= RULE_INT otherlv_5= 'for' this_INT_6= RULE_INT otherlv_7= ';'
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1962:2: ( (lv_sensorName_0_0= ruleEntityName ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1963:3: (lv_sensorName_0_0= ruleEntityName )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1963:3: (lv_sensorName_0_0= ruleEntityName )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1964:3: lv_sensorName_0_0= ruleEntityName
			{
			 
				        newCompositeNode(grammarAccess.getPeriodicSensorsAccess().getSensorNameEntityNameParserRuleCall_0_0()); 
				    
			pushFollow(FOLLOW_ruleEntityName_in_rulePeriodicSensors4175);
			lv_sensorName_0_0=ruleEntityName();
			state._fsp--;


				        if (current==null) {
				            current = createModelElementForParent(grammarAccess.getPeriodicSensorsRule());
				        }
			       		set(
			       			current, 
			       			"sensorName",
			        		lv_sensorName_0_0, 
			        		"EntityName");
				        afterParserOrEnumRuleCall();
				    
			}

			}

			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1980:2: ( (lv_generateInfo_1_0= ruleGenerate ) )+
			int cnt32=0;
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==41) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1981:3: (lv_generateInfo_1_0= ruleGenerate )
					{
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1981:3: (lv_generateInfo_1_0= ruleGenerate )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1982:3: lv_generateInfo_1_0= ruleGenerate
					{
					 
						        newCompositeNode(grammarAccess.getPeriodicSensorsAccess().getGenerateInfoGenerateParserRuleCall_1_0()); 
						    
					pushFollow(FOLLOW_ruleGenerate_in_rulePeriodicSensors4196);
					lv_generateInfo_1_0=ruleGenerate();
					state._fsp--;


						        if (current==null) {
						            current = createModelElementForParent(grammarAccess.getPeriodicSensorsRule());
						        }
					       		add(
					       			current, 
					       			"generateInfo",
					        		lv_generateInfo_1_0, 
					        		"Generate");
						        afterParserOrEnumRuleCall();
						    
					}

					}
					break;

				default :
					if ( cnt32 >= 1 ) break loop32;
					EarlyExitException eee = new EarlyExitException(32, input);
					throw eee;
				}
				cnt32++;
			}

			otherlv_2=(Token)match(input,53,FOLLOW_53_in_rulePeriodicSensors4209); 

			    	newLeafNode(otherlv_2, grammarAccess.getPeriodicSensorsAccess().getSampleKeyword_2());
			    
			otherlv_3=(Token)match(input,47,FOLLOW_47_in_rulePeriodicSensors4221); 

			    	newLeafNode(otherlv_3, grammarAccess.getPeriodicSensorsAccess().getPeriodKeyword_3());
			    
			this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePeriodicSensors4232); 
			 
			    newLeafNode(this_INT_4, grammarAccess.getPeriodicSensorsAccess().getINTTerminalRuleCall_4()); 
			    
			otherlv_5=(Token)match(input,39,FOLLOW_39_in_rulePeriodicSensors4243); 

			    	newLeafNode(otherlv_5, grammarAccess.getPeriodicSensorsAccess().getForKeyword_5());
			    
			this_INT_6=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePeriodicSensors4254); 
			 
			    newLeafNode(this_INT_6, grammarAccess.getPeriodicSensorsAccess().getINTTerminalRuleCall_6()); 
			    
			otherlv_7=(Token)match(input,15,FOLLOW_15_in_rulePeriodicSensors4265); 

			    	newLeafNode(otherlv_7, grammarAccess.getPeriodicSensorsAccess().getSemicolonKeyword_7());
			    
			}

			}

			 leaveRule(); 
		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "rulePeriodicSensors"



	// $ANTLR start "entryRuleEventSensors"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2030:1: entryRuleEventSensors returns [EObject current=null] :iv_ruleEventSensors= ruleEventSensors EOF ;
	public final EObject entryRuleEventSensors() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleEventSensors =null;

		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2031:2: (iv_ruleEventSensors= ruleEventSensors EOF )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2032:2: iv_ruleEventSensors= ruleEventSensors EOF
			{
			 newCompositeNode(grammarAccess.getEventSensorsRule()); 
			pushFollow(FOLLOW_ruleEventSensors_in_entryRuleEventSensors4301);
			iv_ruleEventSensors=ruleEventSensors();
			state._fsp--;

			 current =iv_ruleEventSensors; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleEventSensors4311); 
			}

		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleEventSensors"



	// $ANTLR start "ruleEventSensors"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2039:1: ruleEventSensors returns [EObject current=null] : ( ( (lv_sensorName_0_0= ruleEntityName ) ) ( (lv_generateInfo_1_0= ruleGenerate ) )+ otherlv_2= 'onCondition' ( (lv_eventConditions_3_0= ruleEventConditions ) ) otherlv_4= ';' ) ;
	public final EObject ruleEventSensors() throws RecognitionException {
		EObject current = null;


		Token otherlv_2=null;
		Token otherlv_4=null;
		EObject lv_sensorName_0_0 =null;
		EObject lv_generateInfo_1_0 =null;
		EObject lv_eventConditions_3_0 =null;

		 enterRule(); 
		    
		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2042:28: ( ( ( (lv_sensorName_0_0= ruleEntityName ) ) ( (lv_generateInfo_1_0= ruleGenerate ) )+ otherlv_2= 'onCondition' ( (lv_eventConditions_3_0= ruleEventConditions ) ) otherlv_4= ';' ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2043:2: ( ( (lv_sensorName_0_0= ruleEntityName ) ) ( (lv_generateInfo_1_0= ruleGenerate ) )+ otherlv_2= 'onCondition' ( (lv_eventConditions_3_0= ruleEventConditions ) ) otherlv_4= ';' )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2043:2: ( ( (lv_sensorName_0_0= ruleEntityName ) ) ( (lv_generateInfo_1_0= ruleGenerate ) )+ otherlv_2= 'onCondition' ( (lv_eventConditions_3_0= ruleEventConditions ) ) otherlv_4= ';' )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2043:2: ( (lv_sensorName_0_0= ruleEntityName ) ) ( (lv_generateInfo_1_0= ruleGenerate ) )+ otherlv_2= 'onCondition' ( (lv_eventConditions_3_0= ruleEventConditions ) ) otherlv_4= ';'
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2043:2: ( (lv_sensorName_0_0= ruleEntityName ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2044:3: (lv_sensorName_0_0= ruleEntityName )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2044:3: (lv_sensorName_0_0= ruleEntityName )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2045:3: lv_sensorName_0_0= ruleEntityName
			{
			 
				        newCompositeNode(grammarAccess.getEventSensorsAccess().getSensorNameEntityNameParserRuleCall_0_0()); 
				    
			pushFollow(FOLLOW_ruleEntityName_in_ruleEventSensors4357);
			lv_sensorName_0_0=ruleEntityName();
			state._fsp--;


				        if (current==null) {
				            current = createModelElementForParent(grammarAccess.getEventSensorsRule());
				        }
			       		set(
			       			current, 
			       			"sensorName",
			        		lv_sensorName_0_0, 
			        		"EntityName");
				        afterParserOrEnumRuleCall();
				    
			}

			}

			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2061:2: ( (lv_generateInfo_1_0= ruleGenerate ) )+
			int cnt33=0;
			loop33:
			while (true) {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==41) ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2062:3: (lv_generateInfo_1_0= ruleGenerate )
					{
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2062:3: (lv_generateInfo_1_0= ruleGenerate )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2063:3: lv_generateInfo_1_0= ruleGenerate
					{
					 
						        newCompositeNode(grammarAccess.getEventSensorsAccess().getGenerateInfoGenerateParserRuleCall_1_0()); 
						    
					pushFollow(FOLLOW_ruleGenerate_in_ruleEventSensors4378);
					lv_generateInfo_1_0=ruleGenerate();
					state._fsp--;


						        if (current==null) {
						            current = createModelElementForParent(grammarAccess.getEventSensorsRule());
						        }
					       		add(
					       			current, 
					       			"generateInfo",
					        		lv_generateInfo_1_0, 
					        		"Generate");
						        afterParserOrEnumRuleCall();
						    
					}

					}
					break;

				default :
					if ( cnt33 >= 1 ) break loop33;
					EarlyExitException eee = new EarlyExitException(33, input);
					throw eee;
				}
				cnt33++;
			}

			otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleEventSensors4391); 

			    	newLeafNode(otherlv_2, grammarAccess.getEventSensorsAccess().getOnConditionKeyword_2());
			    
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2083:3: ( (lv_eventConditions_3_0= ruleEventConditions ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2084:3: (lv_eventConditions_3_0= ruleEventConditions )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2084:3: (lv_eventConditions_3_0= ruleEventConditions )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2085:3: lv_eventConditions_3_0= ruleEventConditions
			{
			 
				        newCompositeNode(grammarAccess.getEventSensorsAccess().getEventConditionsEventConditionsParserRuleCall_3_0()); 
				    
			pushFollow(FOLLOW_ruleEventConditions_in_ruleEventSensors4412);
			lv_eventConditions_3_0=ruleEventConditions();
			state._fsp--;


				        if (current==null) {
				            current = createModelElementForParent(grammarAccess.getEventSensorsRule());
				        }
			       		add(
			       			current, 
			       			"eventConditions",
			        		lv_eventConditions_3_0, 
			        		"EventConditions");
				        afterParserOrEnumRuleCall();
				    
			}

			}

			otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleEventSensors4424); 

			    	newLeafNode(otherlv_4, grammarAccess.getEventSensorsAccess().getSemicolonKeyword_4());
			    
			}

			}

			 leaveRule(); 
		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleEventSensors"



	// $ANTLR start "entryRuleEventConditions"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2113:1: entryRuleEventConditions returns [EObject current=null] :iv_ruleEventConditions= ruleEventConditions EOF ;
	public final EObject entryRuleEventConditions() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleEventConditions =null;

		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2114:2: (iv_ruleEventConditions= ruleEventConditions EOF )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2115:2: iv_ruleEventConditions= ruleEventConditions EOF
			{
			 newCompositeNode(grammarAccess.getEventConditionsRule()); 
			pushFollow(FOLLOW_ruleEventConditions_in_entryRuleEventConditions4460);
			iv_ruleEventConditions=ruleEventConditions();
			state._fsp--;

			 current =iv_ruleEventConditions; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleEventConditions4470); 
			}

		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleEventConditions"



	// $ANTLR start "ruleEventConditions"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2122:1: ruleEventConditions returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_eventConditions_2_0= ruleEventConditions ) ) )? ) ;
	public final EObject ruleEventConditions() throws RecognitionException {
		EObject current = null;


		Token lv_name_0_0=null;
		Token otherlv_1=null;
		EObject lv_eventConditions_2_0 =null;

		 enterRule(); 
		    
		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2125:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_eventConditions_2_0= ruleEventConditions ) ) )? ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2126:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_eventConditions_2_0= ruleEventConditions ) ) )? )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2126:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_eventConditions_2_0= ruleEventConditions ) ) )? )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2126:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_eventConditions_2_0= ruleEventConditions ) ) )?
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2126:2: ( (lv_name_0_0= RULE_ID ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2127:3: (lv_name_0_0= RULE_ID )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2127:3: (lv_name_0_0= RULE_ID )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2128:3: lv_name_0_0= RULE_ID
			{
			lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEventConditions4512); 

						newLeafNode(lv_name_0_0, grammarAccess.getEventConditionsAccess().getNameIDTerminalRuleCall_0_0()); 
					

				        if (current==null) {
				            current = createModelElement(grammarAccess.getEventConditionsRule());
				        }
			       		setWithLastConsumed(
			       			current, 
			       			"name",
			        		lv_name_0_0, 
			        		"ID");
				    
			}

			}

			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2144:2: (otherlv_1= ',' ( (lv_eventConditions_2_0= ruleEventConditions ) ) )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==13) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2144:4: otherlv_1= ',' ( (lv_eventConditions_2_0= ruleEventConditions ) )
					{
					otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleEventConditions4530); 

					    	newLeafNode(otherlv_1, grammarAccess.getEventConditionsAccess().getCommaKeyword_1_0());
					    
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2148:3: ( (lv_eventConditions_2_0= ruleEventConditions ) )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2149:3: (lv_eventConditions_2_0= ruleEventConditions )
					{
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2149:3: (lv_eventConditions_2_0= ruleEventConditions )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2150:3: lv_eventConditions_2_0= ruleEventConditions
					{
					 
						        newCompositeNode(grammarAccess.getEventConditionsAccess().getEventConditionsEventConditionsParserRuleCall_1_1_0()); 
						    
					pushFollow(FOLLOW_ruleEventConditions_in_ruleEventConditions4551);
					lv_eventConditions_2_0=ruleEventConditions();
					state._fsp--;


						        if (current==null) {
						            current = createModelElementForParent(grammarAccess.getEventConditionsRule());
						        }
					       		add(
					       			current, 
					       			"eventConditions",
					        		lv_eventConditions_2_0, 
					        		"EventConditions");
						        afterParserOrEnumRuleCall();
						    
					}

					}

					}
					break;

			}

			}

			}

			 leaveRule(); 
		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleEventConditions"



	// $ANTLR start "entryRuleEntityName"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2176:1: entryRuleEntityName returns [EObject current=null] :iv_ruleEntityName= ruleEntityName EOF ;
	public final EObject entryRuleEntityName() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleEntityName =null;

		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2177:2: (iv_ruleEntityName= ruleEntityName EOF )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2178:2: iv_ruleEntityName= ruleEntityName EOF
			{
			 newCompositeNode(grammarAccess.getEntityNameRule()); 
			pushFollow(FOLLOW_ruleEntityName_in_entryRuleEntityName4591);
			iv_ruleEntityName=ruleEntityName();
			state._fsp--;

			 current =iv_ruleEntityName; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleEntityName4601); 
			}

		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleEntityName"



	// $ANTLR start "ruleEntityName"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2185:1: ruleEntityName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
	public final EObject ruleEntityName() throws RecognitionException {
		EObject current = null;


		Token lv_name_0_0=null;

		 enterRule(); 
		    
		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2188:28: ( ( (lv_name_0_0= RULE_ID ) ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2189:3: ( (lv_name_0_0= RULE_ID ) )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2189:3: ( (lv_name_0_0= RULE_ID ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2190:3: (lv_name_0_0= RULE_ID )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2190:3: (lv_name_0_0= RULE_ID )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2191:3: lv_name_0_0= RULE_ID
			{
			lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntityName4642); 

						newLeafNode(lv_name_0_0, grammarAccess.getEntityNameAccess().getNameIDTerminalRuleCall_0()); 
					

				        if (current==null) {
				            current = createModelElement(grammarAccess.getEntityNameRule());
				        }
			       		setWithLastConsumed(
			       			current, 
			       			"name",
			        		lv_name_0_0, 
			        		"ID");
				    
			}

			}

			}

			 leaveRule(); 
		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleEntityName"



	// $ANTLR start "entryRuleGenerate"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2215:1: entryRuleGenerate returns [EObject current=null] :iv_ruleGenerate= ruleGenerate EOF ;
	public final EObject entryRuleGenerate() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleGenerate =null;

		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2216:2: (iv_ruleGenerate= ruleGenerate EOF )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2217:2: iv_ruleGenerate= ruleGenerate EOF
			{
			 newCompositeNode(grammarAccess.getGenerateRule()); 
			pushFollow(FOLLOW_ruleGenerate_in_entryRuleGenerate4682);
			iv_ruleGenerate=ruleGenerate();
			state._fsp--;

			 current =iv_ruleGenerate; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleGenerate4692); 
			}

		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleGenerate"



	// $ANTLR start "ruleGenerate"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2224:1: ruleGenerate returns [EObject current=null] : (otherlv_0= 'generate' ( (lv_sourceName_1_0= ruleSourceName ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';' ) ;
	public final EObject ruleGenerate() throws RecognitionException {
		EObject current = null;


		Token otherlv_0=null;
		Token otherlv_2=null;
		Token otherlv_4=null;
		EObject lv_sourceName_1_0 =null;
		EObject lv_type_3_0 =null;

		 enterRule(); 
		    
		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2227:28: ( (otherlv_0= 'generate' ( (lv_sourceName_1_0= ruleSourceName ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';' ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2228:3: (otherlv_0= 'generate' ( (lv_sourceName_1_0= ruleSourceName ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';' )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2228:3: (otherlv_0= 'generate' ( (lv_sourceName_1_0= ruleSourceName ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';' )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2228:3: otherlv_0= 'generate' ( (lv_sourceName_1_0= ruleSourceName ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';'
			{
			otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleGenerate4729); 

			    	newLeafNode(otherlv_0, grammarAccess.getGenerateAccess().getGenerateKeyword_0());
			    
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2232:3: ( (lv_sourceName_1_0= ruleSourceName ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2233:3: (lv_sourceName_1_0= ruleSourceName )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2233:3: (lv_sourceName_1_0= ruleSourceName )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2234:3: lv_sourceName_1_0= ruleSourceName
			{
			 
				        newCompositeNode(grammarAccess.getGenerateAccess().getSourceNameSourceNameParserRuleCall_1_0()); 
				    
			pushFollow(FOLLOW_ruleSourceName_in_ruleGenerate4750);
			lv_sourceName_1_0=ruleSourceName();
			state._fsp--;


				        if (current==null) {
				            current = createModelElementForParent(grammarAccess.getGenerateRule());
				        }
			       		set(
			       			current, 
			       			"sourceName",
			        		lv_sourceName_1_0, 
			        		"SourceName");
				        afterParserOrEnumRuleCall();
				    
			}

			}

			otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleGenerate4762); 

			    	newLeafNode(otherlv_2, grammarAccess.getGenerateAccess().getColonKeyword_2());
			    
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2254:3: ( (lv_type_3_0= ruleType ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2255:3: (lv_type_3_0= ruleType )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2255:3: (lv_type_3_0= ruleType )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2256:3: lv_type_3_0= ruleType
			{
			 
				        newCompositeNode(grammarAccess.getGenerateAccess().getTypeTypeParserRuleCall_3_0()); 
				    
			pushFollow(FOLLOW_ruleType_in_ruleGenerate4783);
			lv_type_3_0=ruleType();
			state._fsp--;


				        if (current==null) {
				            current = createModelElementForParent(grammarAccess.getGenerateRule());
				        }
			       		set(
			       			current, 
			       			"type",
			        		lv_type_3_0, 
			        		"Type");
				        afterParserOrEnumRuleCall();
				    
			}

			}

			otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleGenerate4795); 

			    	newLeafNode(otherlv_4, grammarAccess.getGenerateAccess().getSemicolonKeyword_4());
			    
			}

			}

			 leaveRule(); 
		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleGenerate"



	// $ANTLR start "entryRuleSourceName"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2284:1: entryRuleSourceName returns [EObject current=null] :iv_ruleSourceName= ruleSourceName EOF ;
	public final EObject entryRuleSourceName() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleSourceName =null;

		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2285:2: (iv_ruleSourceName= ruleSourceName EOF )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2286:2: iv_ruleSourceName= ruleSourceName EOF
			{
			 newCompositeNode(grammarAccess.getSourceNameRule()); 
			pushFollow(FOLLOW_ruleSourceName_in_entryRuleSourceName4831);
			iv_ruleSourceName=ruleSourceName();
			state._fsp--;

			 current =iv_ruleSourceName; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleSourceName4841); 
			}

		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleSourceName"



	// $ANTLR start "ruleSourceName"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2293:1: ruleSourceName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
	public final EObject ruleSourceName() throws RecognitionException {
		EObject current = null;


		Token lv_name_0_0=null;

		 enterRule(); 
		    
		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2296:28: ( ( (lv_name_0_0= RULE_ID ) ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2297:3: ( (lv_name_0_0= RULE_ID ) )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2297:3: ( (lv_name_0_0= RULE_ID ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2298:3: (lv_name_0_0= RULE_ID )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2298:3: (lv_name_0_0= RULE_ID )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2299:3: lv_name_0_0= RULE_ID
			{
			lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSourceName4882); 

						newLeafNode(lv_name_0_0, grammarAccess.getSourceNameAccess().getNameIDTerminalRuleCall_0()); 
					

				        if (current==null) {
				            current = createModelElement(grammarAccess.getSourceNameRule());
				        }
			       		setWithLastConsumed(
			       			current, 
			       			"name",
			        		lv_name_0_0, 
			        		"ID");
				    
			}

			}

			}

			 leaveRule(); 
		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleSourceName"



	// $ANTLR start "entryRuleActuator"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2323:1: entryRuleActuator returns [EObject current=null] :iv_ruleActuator= ruleActuator EOF ;
	public final EObject entryRuleActuator() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleActuator =null;

		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2324:2: (iv_ruleActuator= ruleActuator EOF )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2325:2: iv_ruleActuator= ruleActuator EOF
			{
			 newCompositeNode(grammarAccess.getActuatorRule()); 
			pushFollow(FOLLOW_ruleActuator_in_entryRuleActuator4922);
			iv_ruleActuator=ruleActuator();
			state._fsp--;

			 current =iv_ruleActuator; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleActuator4932); 
			}

		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleActuator"



	// $ANTLR start "ruleActuator"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2332:1: ruleActuator returns [EObject current=null] : ( ( (lv_actuatorName_0_0= ruleEntityName ) ) ( (lv_actions_1_0= ruleAction ) )* ) ;
	public final EObject ruleActuator() throws RecognitionException {
		EObject current = null;


		EObject lv_actuatorName_0_0 =null;
		EObject lv_actions_1_0 =null;

		 enterRule(); 
		    
		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2335:28: ( ( ( (lv_actuatorName_0_0= ruleEntityName ) ) ( (lv_actions_1_0= ruleAction ) )* ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2336:2: ( ( (lv_actuatorName_0_0= ruleEntityName ) ) ( (lv_actions_1_0= ruleAction ) )* )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2336:2: ( ( (lv_actuatorName_0_0= ruleEntityName ) ) ( (lv_actions_1_0= ruleAction ) )* )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2336:2: ( (lv_actuatorName_0_0= ruleEntityName ) ) ( (lv_actions_1_0= ruleAction ) )*
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2336:2: ( (lv_actuatorName_0_0= ruleEntityName ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2337:3: (lv_actuatorName_0_0= ruleEntityName )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2337:3: (lv_actuatorName_0_0= ruleEntityName )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2338:3: lv_actuatorName_0_0= ruleEntityName
			{
			 
				        newCompositeNode(grammarAccess.getActuatorAccess().getActuatorNameEntityNameParserRuleCall_0_0()); 
				    
			pushFollow(FOLLOW_ruleEntityName_in_ruleActuator4978);
			lv_actuatorName_0_0=ruleEntityName();
			state._fsp--;


				        if (current==null) {
				            current = createModelElementForParent(grammarAccess.getActuatorRule());
				        }
			       		set(
			       			current, 
			       			"actuatorName",
			        		lv_actuatorName_0_0, 
			        		"EntityName");
				        afterParserOrEnumRuleCall();
				    
			}

			}

			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2354:2: ( (lv_actions_1_0= ruleAction ) )*
			loop35:
			while (true) {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==28) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2355:3: (lv_actions_1_0= ruleAction )
					{
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2355:3: (lv_actions_1_0= ruleAction )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2356:3: lv_actions_1_0= ruleAction
					{
					 
						        newCompositeNode(grammarAccess.getActuatorAccess().getActionsActionParserRuleCall_1_0()); 
						    
					pushFollow(FOLLOW_ruleAction_in_ruleActuator4999);
					lv_actions_1_0=ruleAction();
					state._fsp--;


						        if (current==null) {
						            current = createModelElementForParent(grammarAccess.getActuatorRule());
						        }
					       		add(
					       			current, 
					       			"actions",
					        		lv_actions_1_0, 
					        		"Action");
						        afterParserOrEnumRuleCall();
						    
					}

					}
					break;

				default :
					break loop35;
				}
			}

			}

			}

			 leaveRule(); 
		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleActuator"



	// $ANTLR start "entryRuleAction"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2380:1: entryRuleAction returns [EObject current=null] :iv_ruleAction= ruleAction EOF ;
	public final EObject entryRuleAction() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleAction =null;

		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2381:2: (iv_ruleAction= ruleAction EOF )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2382:2: iv_ruleAction= ruleAction EOF
			{
			 newCompositeNode(grammarAccess.getActionRule()); 
			pushFollow(FOLLOW_ruleAction_in_entryRuleAction5036);
			iv_ruleAction=ruleAction();
			state._fsp--;

			 current =iv_ruleAction; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleAction5046); 
			}

		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleAction"



	// $ANTLR start "ruleAction"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2389:1: ruleAction returns [EObject current=null] : (otherlv_0= 'action' ( (lv_actionName_1_0= ruleActionName ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameters ) )* otherlv_4= ')' otherlv_5= ';' ) ;
	public final EObject ruleAction() throws RecognitionException {
		EObject current = null;


		Token otherlv_0=null;
		Token otherlv_2=null;
		Token otherlv_4=null;
		Token otherlv_5=null;
		EObject lv_actionName_1_0 =null;
		EObject lv_parameters_3_0 =null;

		 enterRule(); 
		    
		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2392:28: ( (otherlv_0= 'action' ( (lv_actionName_1_0= ruleActionName ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameters ) )* otherlv_4= ')' otherlv_5= ';' ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2393:3: (otherlv_0= 'action' ( (lv_actionName_1_0= ruleActionName ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameters ) )* otherlv_4= ')' otherlv_5= ';' )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2393:3: (otherlv_0= 'action' ( (lv_actionName_1_0= ruleActionName ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameters ) )* otherlv_4= ')' otherlv_5= ';' )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2393:3: otherlv_0= 'action' ( (lv_actionName_1_0= ruleActionName ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameters ) )* otherlv_4= ')' otherlv_5= ';'
			{
			otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleAction5083); 

			    	newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActionKeyword_0());
			    
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2397:3: ( (lv_actionName_1_0= ruleActionName ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2398:3: (lv_actionName_1_0= ruleActionName )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2398:3: (lv_actionName_1_0= ruleActionName )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2399:3: lv_actionName_1_0= ruleActionName
			{
			 
				        newCompositeNode(grammarAccess.getActionAccess().getActionNameActionNameParserRuleCall_1_0()); 
				    
			pushFollow(FOLLOW_ruleActionName_in_ruleAction5104);
			lv_actionName_1_0=ruleActionName();
			state._fsp--;


				        if (current==null) {
				            current = createModelElementForParent(grammarAccess.getActionRule());
				        }
			       		set(
			       			current, 
			       			"actionName",
			        		lv_actionName_1_0, 
			        		"ActionName");
				        afterParserOrEnumRuleCall();
				    
			}

			}

			otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleAction5116); 

			    	newLeafNode(otherlv_2, grammarAccess.getActionAccess().getLeftParenthesisKeyword_2());
			    
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2419:3: ( (lv_parameters_3_0= ruleParameters ) )*
			loop36:
			while (true) {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( (LA36_0==RULE_ID) ) {
					alt36=1;
				}

				switch (alt36) {
				case 1 :
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2420:3: (lv_parameters_3_0= ruleParameters )
					{
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2420:3: (lv_parameters_3_0= ruleParameters )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2421:3: lv_parameters_3_0= ruleParameters
					{
					 
						        newCompositeNode(grammarAccess.getActionAccess().getParametersParametersParserRuleCall_3_0()); 
						    
					pushFollow(FOLLOW_ruleParameters_in_ruleAction5137);
					lv_parameters_3_0=ruleParameters();
					state._fsp--;


						        if (current==null) {
						            current = createModelElementForParent(grammarAccess.getActionRule());
						        }
					       		add(
					       			current, 
					       			"parameters",
					        		lv_parameters_3_0, 
					        		"Parameters");
						        afterParserOrEnumRuleCall();
						    
					}

					}
					break;

				default :
					break loop36;
				}
			}

			otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleAction5150); 

			    	newLeafNode(otherlv_4, grammarAccess.getActionAccess().getRightParenthesisKeyword_4());
			    
			otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleAction5162); 

			    	newLeafNode(otherlv_5, grammarAccess.getActionAccess().getSemicolonKeyword_5());
			    
			}

			}

			 leaveRule(); 
		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleAction"



	// $ANTLR start "entryRuleActionName"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2453:1: entryRuleActionName returns [EObject current=null] :iv_ruleActionName= ruleActionName EOF ;
	public final EObject entryRuleActionName() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleActionName =null;

		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2454:2: (iv_ruleActionName= ruleActionName EOF )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2455:2: iv_ruleActionName= ruleActionName EOF
			{
			 newCompositeNode(grammarAccess.getActionNameRule()); 
			pushFollow(FOLLOW_ruleActionName_in_entryRuleActionName5198);
			iv_ruleActionName=ruleActionName();
			state._fsp--;

			 current =iv_ruleActionName; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleActionName5208); 
			}

		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleActionName"



	// $ANTLR start "ruleActionName"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2462:1: ruleActionName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
	public final EObject ruleActionName() throws RecognitionException {
		EObject current = null;


		Token lv_name_0_0=null;

		 enterRule(); 
		    
		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2465:28: ( ( (lv_name_0_0= RULE_ID ) ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2466:3: ( (lv_name_0_0= RULE_ID ) )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2466:3: ( (lv_name_0_0= RULE_ID ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2467:3: (lv_name_0_0= RULE_ID )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2467:3: (lv_name_0_0= RULE_ID )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2468:3: lv_name_0_0= RULE_ID
			{
			lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActionName5249); 

						newLeafNode(lv_name_0_0, grammarAccess.getActionNameAccess().getNameIDTerminalRuleCall_0()); 
					

				        if (current==null) {
				            current = createModelElement(grammarAccess.getActionNameRule());
				        }
			       		setWithLastConsumed(
			       			current, 
			       			"name",
			        		lv_name_0_0, 
			        		"ID");
				    
			}

			}

			}

			 leaveRule(); 
		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleActionName"



	// $ANTLR start "entryRuleParameters"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2492:1: entryRuleParameters returns [EObject current=null] :iv_ruleParameters= ruleParameters EOF ;
	public final EObject entryRuleParameters() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleParameters =null;

		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2493:2: (iv_ruleParameters= ruleParameters EOF )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2494:2: iv_ruleParameters= ruleParameters EOF
			{
			 newCompositeNode(grammarAccess.getParametersRule()); 
			pushFollow(FOLLOW_ruleParameters_in_entryRuleParameters5289);
			iv_ruleParameters=ruleParameters();
			state._fsp--;

			 current =iv_ruleParameters; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleParameters5299); 
			}

		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleParameters"



	// $ANTLR start "ruleParameters"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2501:1: ruleParameters returns [EObject current=null] : ( ( (lv_parameterName_0_0= ruleParameterName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ) ;
	public final EObject ruleParameters() throws RecognitionException {
		EObject current = null;


		Token otherlv_1=null;
		EObject lv_parameterName_0_0 =null;
		EObject lv_type_2_0 =null;

		 enterRule(); 
		    
		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2504:28: ( ( ( (lv_parameterName_0_0= ruleParameterName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2505:2: ( ( (lv_parameterName_0_0= ruleParameterName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2505:2: ( ( (lv_parameterName_0_0= ruleParameterName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2505:2: ( (lv_parameterName_0_0= ruleParameterName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2505:2: ( (lv_parameterName_0_0= ruleParameterName ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2506:3: (lv_parameterName_0_0= ruleParameterName )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2506:3: (lv_parameterName_0_0= ruleParameterName )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2507:3: lv_parameterName_0_0= ruleParameterName
			{
			 
				        newCompositeNode(grammarAccess.getParametersAccess().getParameterNameParameterNameParserRuleCall_0_0()); 
				    
			pushFollow(FOLLOW_ruleParameterName_in_ruleParameters5345);
			lv_parameterName_0_0=ruleParameterName();
			state._fsp--;


				        if (current==null) {
				            current = createModelElementForParent(grammarAccess.getParametersRule());
				        }
			       		set(
			       			current, 
			       			"parameterName",
			        		lv_parameterName_0_0, 
			        		"ParameterName");
				        afterParserOrEnumRuleCall();
				    
			}

			}

			otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleParameters5357); 

			    	newLeafNode(otherlv_1, grammarAccess.getParametersAccess().getColonKeyword_1());
			    
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2527:3: ( (lv_type_2_0= ruleType ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2528:3: (lv_type_2_0= ruleType )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2528:3: (lv_type_2_0= ruleType )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2529:3: lv_type_2_0= ruleType
			{
			 
				        newCompositeNode(grammarAccess.getParametersAccess().getTypeTypeParserRuleCall_2_0()); 
				    
			pushFollow(FOLLOW_ruleType_in_ruleParameters5378);
			lv_type_2_0=ruleType();
			state._fsp--;


				        if (current==null) {
				            current = createModelElementForParent(grammarAccess.getParametersRule());
				        }
			       		set(
			       			current, 
			       			"type",
			        		lv_type_2_0, 
			        		"Type");
				        afterParserOrEnumRuleCall();
				    
			}

			}

			}

			}

			 leaveRule(); 
		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleParameters"



	// $ANTLR start "entryRuleParameterName"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2553:1: entryRuleParameterName returns [EObject current=null] :iv_ruleParameterName= ruleParameterName EOF ;
	public final EObject entryRuleParameterName() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleParameterName =null;

		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2554:2: (iv_ruleParameterName= ruleParameterName EOF )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2555:2: iv_ruleParameterName= ruleParameterName EOF
			{
			 newCompositeNode(grammarAccess.getParameterNameRule()); 
			pushFollow(FOLLOW_ruleParameterName_in_entryRuleParameterName5414);
			iv_ruleParameterName=ruleParameterName();
			state._fsp--;

			 current =iv_ruleParameterName; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleParameterName5424); 
			}

		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleParameterName"



	// $ANTLR start "ruleParameterName"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2562:1: ruleParameterName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
	public final EObject ruleParameterName() throws RecognitionException {
		EObject current = null;


		Token lv_name_0_0=null;

		 enterRule(); 
		    
		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2565:28: ( ( (lv_name_0_0= RULE_ID ) ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2566:3: ( (lv_name_0_0= RULE_ID ) )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2566:3: ( (lv_name_0_0= RULE_ID ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2567:3: (lv_name_0_0= RULE_ID )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2567:3: (lv_name_0_0= RULE_ID )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2568:3: lv_name_0_0= RULE_ID
			{
			lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterName5465); 

						newLeafNode(lv_name_0_0, grammarAccess.getParameterNameAccess().getNameIDTerminalRuleCall_0()); 
					

				        if (current==null) {
				            current = createModelElement(grammarAccess.getParameterNameRule());
				        }
			       		setWithLastConsumed(
			       			current, 
			       			"name",
			        		lv_name_0_0, 
			        		"ID");
				    
			}

			}

			}

			 leaveRule(); 
		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleParameterName"



	// $ANTLR start "entryRuleStorageService"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2592:1: entryRuleStorageService returns [EObject current=null] :iv_ruleStorageService= ruleStorageService EOF ;
	public final EObject entryRuleStorageService() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleStorageService =null;

		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2593:2: (iv_ruleStorageService= ruleStorageService EOF )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2594:2: iv_ruleStorageService= ruleStorageService EOF
			{
			 newCompositeNode(grammarAccess.getStorageServiceRule()); 
			pushFollow(FOLLOW_ruleStorageService_in_entryRuleStorageService5505);
			iv_ruleStorageService=ruleStorageService();
			state._fsp--;

			 current =iv_ruleStorageService; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleStorageService5515); 
			}

		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleStorageService"



	// $ANTLR start "ruleStorageService"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2601:1: ruleStorageService returns [EObject current=null] : ( ( (lv_storageServiceName_0_0= ruleEntityName ) ) ( (lv_dataAccesses_1_0= ruleDataAccess ) )* ) ;
	public final EObject ruleStorageService() throws RecognitionException {
		EObject current = null;


		EObject lv_storageServiceName_0_0 =null;
		EObject lv_dataAccesses_1_0 =null;

		 enterRule(); 
		    
		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2604:28: ( ( ( (lv_storageServiceName_0_0= ruleEntityName ) ) ( (lv_dataAccesses_1_0= ruleDataAccess ) )* ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2605:2: ( ( (lv_storageServiceName_0_0= ruleEntityName ) ) ( (lv_dataAccesses_1_0= ruleDataAccess ) )* )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2605:2: ( ( (lv_storageServiceName_0_0= ruleEntityName ) ) ( (lv_dataAccesses_1_0= ruleDataAccess ) )* )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2605:2: ( (lv_storageServiceName_0_0= ruleEntityName ) ) ( (lv_dataAccesses_1_0= ruleDataAccess ) )*
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2605:2: ( (lv_storageServiceName_0_0= ruleEntityName ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2606:3: (lv_storageServiceName_0_0= ruleEntityName )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2606:3: (lv_storageServiceName_0_0= ruleEntityName )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2607:3: lv_storageServiceName_0_0= ruleEntityName
			{
			 
				        newCompositeNode(grammarAccess.getStorageServiceAccess().getStorageServiceNameEntityNameParserRuleCall_0_0()); 
				    
			pushFollow(FOLLOW_ruleEntityName_in_ruleStorageService5561);
			lv_storageServiceName_0_0=ruleEntityName();
			state._fsp--;


				        if (current==null) {
				            current = createModelElementForParent(grammarAccess.getStorageServiceRule());
				        }
			       		set(
			       			current, 
			       			"storageServiceName",
			        		lv_storageServiceName_0_0, 
			        		"EntityName");
				        afterParserOrEnumRuleCall();
				    
			}

			}

			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2623:2: ( (lv_dataAccesses_1_0= ruleDataAccess ) )*
			loop37:
			while (true) {
				int alt37=2;
				int LA37_0 = input.LA(1);
				if ( (LA37_0==41) ) {
					alt37=1;
				}

				switch (alt37) {
				case 1 :
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2624:3: (lv_dataAccesses_1_0= ruleDataAccess )
					{
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2624:3: (lv_dataAccesses_1_0= ruleDataAccess )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2625:3: lv_dataAccesses_1_0= ruleDataAccess
					{
					 
						        newCompositeNode(grammarAccess.getStorageServiceAccess().getDataAccessesDataAccessParserRuleCall_1_0()); 
						    
					pushFollow(FOLLOW_ruleDataAccess_in_ruleStorageService5582);
					lv_dataAccesses_1_0=ruleDataAccess();
					state._fsp--;


						        if (current==null) {
						            current = createModelElementForParent(grammarAccess.getStorageServiceRule());
						        }
					       		add(
					       			current, 
					       			"dataAccesses",
					        		lv_dataAccesses_1_0, 
					        		"DataAccess");
						        afterParserOrEnumRuleCall();
						    
					}

					}
					break;

				default :
					break loop37;
				}
			}

			}

			}

			 leaveRule(); 
		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleStorageService"



	// $ANTLR start "entryRuleDataAccess"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2649:1: entryRuleDataAccess returns [EObject current=null] :iv_ruleDataAccess= ruleDataAccess EOF ;
	public final EObject entryRuleDataAccess() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleDataAccess =null;

		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2650:2: (iv_ruleDataAccess= ruleDataAccess EOF )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2651:2: iv_ruleDataAccess= ruleDataAccess EOF
			{
			 newCompositeNode(grammarAccess.getDataAccessRule()); 
			pushFollow(FOLLOW_ruleDataAccess_in_entryRuleDataAccess5619);
			iv_ruleDataAccess=ruleDataAccess();
			state._fsp--;

			 current =iv_ruleDataAccess; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleDataAccess5629); 
			}

		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleDataAccess"



	// $ANTLR start "ruleDataAccess"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2658:1: ruleDataAccess returns [EObject current=null] : (otherlv_0= 'generate' ( (lv_sourceName_1_0= ruleSourceName ) ) otherlv_2= ':' ( (lv_dataAccessType_3_0= ruleType ) ) otherlv_4= 'accessed-by' ( (lv_dataItem_5_0= RULE_ID ) ) otherlv_6= ':' ( (lv_type_7_0= ruleType ) ) otherlv_8= ';' ( (lv_actions_9_0= ruleAction ) )* ) ;
	public final EObject ruleDataAccess() throws RecognitionException {
		EObject current = null;


		Token otherlv_0=null;
		Token otherlv_2=null;
		Token otherlv_4=null;
		Token lv_dataItem_5_0=null;
		Token otherlv_6=null;
		Token otherlv_8=null;
		EObject lv_sourceName_1_0 =null;
		EObject lv_dataAccessType_3_0 =null;
		EObject lv_type_7_0 =null;
		EObject lv_actions_9_0 =null;

		 enterRule(); 
		    
		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2661:28: ( (otherlv_0= 'generate' ( (lv_sourceName_1_0= ruleSourceName ) ) otherlv_2= ':' ( (lv_dataAccessType_3_0= ruleType ) ) otherlv_4= 'accessed-by' ( (lv_dataItem_5_0= RULE_ID ) ) otherlv_6= ':' ( (lv_type_7_0= ruleType ) ) otherlv_8= ';' ( (lv_actions_9_0= ruleAction ) )* ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2662:3: (otherlv_0= 'generate' ( (lv_sourceName_1_0= ruleSourceName ) ) otherlv_2= ':' ( (lv_dataAccessType_3_0= ruleType ) ) otherlv_4= 'accessed-by' ( (lv_dataItem_5_0= RULE_ID ) ) otherlv_6= ':' ( (lv_type_7_0= ruleType ) ) otherlv_8= ';' ( (lv_actions_9_0= ruleAction ) )* )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2662:3: (otherlv_0= 'generate' ( (lv_sourceName_1_0= ruleSourceName ) ) otherlv_2= ':' ( (lv_dataAccessType_3_0= ruleType ) ) otherlv_4= 'accessed-by' ( (lv_dataItem_5_0= RULE_ID ) ) otherlv_6= ':' ( (lv_type_7_0= ruleType ) ) otherlv_8= ';' ( (lv_actions_9_0= ruleAction ) )* )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2662:3: otherlv_0= 'generate' ( (lv_sourceName_1_0= ruleSourceName ) ) otherlv_2= ':' ( (lv_dataAccessType_3_0= ruleType ) ) otherlv_4= 'accessed-by' ( (lv_dataItem_5_0= RULE_ID ) ) otherlv_6= ':' ( (lv_type_7_0= ruleType ) ) otherlv_8= ';' ( (lv_actions_9_0= ruleAction ) )*
			{
			otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleDataAccess5666); 

			    	newLeafNode(otherlv_0, grammarAccess.getDataAccessAccess().getGenerateKeyword_0());
			    
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2666:3: ( (lv_sourceName_1_0= ruleSourceName ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2667:3: (lv_sourceName_1_0= ruleSourceName )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2667:3: (lv_sourceName_1_0= ruleSourceName )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2668:3: lv_sourceName_1_0= ruleSourceName
			{
			 
				        newCompositeNode(grammarAccess.getDataAccessAccess().getSourceNameSourceNameParserRuleCall_1_0()); 
				    
			pushFollow(FOLLOW_ruleSourceName_in_ruleDataAccess5687);
			lv_sourceName_1_0=ruleSourceName();
			state._fsp--;


				        if (current==null) {
				            current = createModelElementForParent(grammarAccess.getDataAccessRule());
				        }
			       		set(
			       			current, 
			       			"sourceName",
			        		lv_sourceName_1_0, 
			        		"SourceName");
				        afterParserOrEnumRuleCall();
				    
			}

			}

			otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleDataAccess5699); 

			    	newLeafNode(otherlv_2, grammarAccess.getDataAccessAccess().getColonKeyword_2());
			    
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2688:3: ( (lv_dataAccessType_3_0= ruleType ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2689:3: (lv_dataAccessType_3_0= ruleType )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2689:3: (lv_dataAccessType_3_0= ruleType )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2690:3: lv_dataAccessType_3_0= ruleType
			{
			 
				        newCompositeNode(grammarAccess.getDataAccessAccess().getDataAccessTypeTypeParserRuleCall_3_0()); 
				    
			pushFollow(FOLLOW_ruleType_in_ruleDataAccess5720);
			lv_dataAccessType_3_0=ruleType();
			state._fsp--;


				        if (current==null) {
				            current = createModelElementForParent(grammarAccess.getDataAccessRule());
				        }
			       		set(
			       			current, 
			       			"dataAccessType",
			        		lv_dataAccessType_3_0, 
			        		"Type");
				        afterParserOrEnumRuleCall();
				    
			}

			}

			otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleDataAccess5732); 

			    	newLeafNode(otherlv_4, grammarAccess.getDataAccessAccess().getAccessedByKeyword_4());
			    
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2710:3: ( (lv_dataItem_5_0= RULE_ID ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2711:3: (lv_dataItem_5_0= RULE_ID )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2711:3: (lv_dataItem_5_0= RULE_ID )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2712:3: lv_dataItem_5_0= RULE_ID
			{
			lv_dataItem_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataAccess5749); 

						newLeafNode(lv_dataItem_5_0, grammarAccess.getDataAccessAccess().getDataItemIDTerminalRuleCall_5_0()); 
					

				        if (current==null) {
				            current = createModelElement(grammarAccess.getDataAccessRule());
				        }
			       		setWithLastConsumed(
			       			current, 
			       			"dataItem",
			        		lv_dataItem_5_0, 
			        		"ID");
				    
			}

			}

			otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleDataAccess5766); 

			    	newLeafNode(otherlv_6, grammarAccess.getDataAccessAccess().getColonKeyword_6());
			    
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2732:3: ( (lv_type_7_0= ruleType ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2733:3: (lv_type_7_0= ruleType )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2733:3: (lv_type_7_0= ruleType )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2734:3: lv_type_7_0= ruleType
			{
			 
				        newCompositeNode(grammarAccess.getDataAccessAccess().getTypeTypeParserRuleCall_7_0()); 
				    
			pushFollow(FOLLOW_ruleType_in_ruleDataAccess5787);
			lv_type_7_0=ruleType();
			state._fsp--;


				        if (current==null) {
				            current = createModelElementForParent(grammarAccess.getDataAccessRule());
				        }
			       		set(
			       			current, 
			       			"type",
			        		lv_type_7_0, 
			        		"Type");
				        afterParserOrEnumRuleCall();
				    
			}

			}

			otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleDataAccess5799); 

			    	newLeafNode(otherlv_8, grammarAccess.getDataAccessAccess().getSemicolonKeyword_8());
			    
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2754:3: ( (lv_actions_9_0= ruleAction ) )*
			loop38:
			while (true) {
				int alt38=2;
				int LA38_0 = input.LA(1);
				if ( (LA38_0==28) ) {
					alt38=1;
				}

				switch (alt38) {
				case 1 :
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2755:3: (lv_actions_9_0= ruleAction )
					{
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2755:3: (lv_actions_9_0= ruleAction )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2756:3: lv_actions_9_0= ruleAction
					{
					 
						        newCompositeNode(grammarAccess.getDataAccessAccess().getActionsActionParserRuleCall_9_0()); 
						    
					pushFollow(FOLLOW_ruleAction_in_ruleDataAccess5820);
					lv_actions_9_0=ruleAction();
					state._fsp--;


						        if (current==null) {
						            current = createModelElementForParent(grammarAccess.getDataAccessRule());
						        }
					       		add(
					       			current, 
					       			"actions",
					        		lv_actions_9_0, 
					        		"Action");
						        afterParserOrEnumRuleCall();
						    
					}

					}
					break;

				default :
					break loop38;
				}
			}

			}

			}

			 leaveRule(); 
		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleDataAccess"



	// $ANTLR start "entryRuleType"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2780:1: entryRuleType returns [EObject current=null] :iv_ruleType= ruleType EOF ;
	public final EObject entryRuleType() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleType =null;

		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2781:2: (iv_ruleType= ruleType EOF )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2782:2: iv_ruleType= ruleType EOF
			{
			 newCompositeNode(grammarAccess.getTypeRule()); 
			pushFollow(FOLLOW_ruleType_in_entryRuleType5857);
			iv_ruleType=ruleType();
			state._fsp--;

			 current =iv_ruleType; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleType5867); 
			}

		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleType"



	// $ANTLR start "ruleType"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2789:1: ruleType returns [EObject current=null] : ( (lv_primitiveDataType_0_0= rulePrimitiveDataType ) ) ;
	public final EObject ruleType() throws RecognitionException {
		EObject current = null;


		EObject lv_primitiveDataType_0_0 =null;

		 enterRule(); 
		    
		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2792:28: ( ( (lv_primitiveDataType_0_0= rulePrimitiveDataType ) ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2793:3: ( (lv_primitiveDataType_0_0= rulePrimitiveDataType ) )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2793:3: ( (lv_primitiveDataType_0_0= rulePrimitiveDataType ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2794:3: (lv_primitiveDataType_0_0= rulePrimitiveDataType )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2794:3: (lv_primitiveDataType_0_0= rulePrimitiveDataType )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2795:3: lv_primitiveDataType_0_0= rulePrimitiveDataType
			{
			 
				        newCompositeNode(grammarAccess.getTypeAccess().getPrimitiveDataTypePrimitiveDataTypeParserRuleCall_0()); 
				    
			pushFollow(FOLLOW_rulePrimitiveDataType_in_ruleType5912);
			lv_primitiveDataType_0_0=rulePrimitiveDataType();
			state._fsp--;


				        if (current==null) {
				            current = createModelElementForParent(grammarAccess.getTypeRule());
				        }
			       		set(
			       			current, 
			       			"primitiveDataType",
			        		lv_primitiveDataType_0_0, 
			        		"PrimitiveDataType");
				        afterParserOrEnumRuleCall();
				    
			}

			}

			}

			 leaveRule(); 
		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleType"



	// $ANTLR start "entryRuleOperationName"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2819:1: entryRuleOperationName returns [EObject current=null] :iv_ruleOperationName= ruleOperationName EOF ;
	public final EObject entryRuleOperationName() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleOperationName =null;

		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2820:2: (iv_ruleOperationName= ruleOperationName EOF )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2821:2: iv_ruleOperationName= ruleOperationName EOF
			{
			 newCompositeNode(grammarAccess.getOperationNameRule()); 
			pushFollow(FOLLOW_ruleOperationName_in_entryRuleOperationName5947);
			iv_ruleOperationName=ruleOperationName();
			state._fsp--;

			 current =iv_ruleOperationName; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleOperationName5957); 
			}

		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleOperationName"



	// $ANTLR start "ruleOperationName"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2828:1: ruleOperationName returns [EObject current=null] : ( (lv_OPERATION_NAME_0_0= 'AVG_BY_SAMPLE' ) ) ;
	public final EObject ruleOperationName() throws RecognitionException {
		EObject current = null;


		Token lv_OPERATION_NAME_0_0=null;

		 enterRule(); 
		    
		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2831:28: ( ( (lv_OPERATION_NAME_0_0= 'AVG_BY_SAMPLE' ) ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2832:3: ( (lv_OPERATION_NAME_0_0= 'AVG_BY_SAMPLE' ) )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2832:3: ( (lv_OPERATION_NAME_0_0= 'AVG_BY_SAMPLE' ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2833:3: (lv_OPERATION_NAME_0_0= 'AVG_BY_SAMPLE' )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2833:3: (lv_OPERATION_NAME_0_0= 'AVG_BY_SAMPLE' )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2834:3: lv_OPERATION_NAME_0_0= 'AVG_BY_SAMPLE'
			{
			lv_OPERATION_NAME_0_0=(Token)match(input,16,FOLLOW_16_in_ruleOperationName5999); 

			        newLeafNode(lv_OPERATION_NAME_0_0, grammarAccess.getOperationNameAccess().getOPERATION_NAMEAVG_BY_SAMPLEKeyword_0());
			    

				        if (current==null) {
				            current = createModelElement(grammarAccess.getOperationNameRule());
				        }
			       		setWithLastConsumed(current, "OPERATION_NAME", lv_OPERATION_NAME_0_0, "AVG_BY_SAMPLE");
				    
			}

			}

			}

			 leaveRule(); 
		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleOperationName"



	// $ANTLR start "entryRulePrimitiveDataType"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2855:1: entryRulePrimitiveDataType returns [EObject current=null] :iv_rulePrimitiveDataType= rulePrimitiveDataType EOF ;
	public final EObject entryRulePrimitiveDataType() throws RecognitionException {
		EObject current = null;


		EObject iv_rulePrimitiveDataType =null;

		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2856:2: (iv_rulePrimitiveDataType= rulePrimitiveDataType EOF )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2857:2: iv_rulePrimitiveDataType= rulePrimitiveDataType EOF
			{
			 newCompositeNode(grammarAccess.getPrimitiveDataTypeRule()); 
			pushFollow(FOLLOW_rulePrimitiveDataType_in_entryRulePrimitiveDataType6047);
			iv_rulePrimitiveDataType=rulePrimitiveDataType();
			state._fsp--;

			 current =iv_rulePrimitiveDataType; 
			match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveDataType6057); 
			}

		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRulePrimitiveDataType"



	// $ANTLR start "rulePrimitiveDataType"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2864:1: rulePrimitiveDataType returns [EObject current=null] : ( ( (lv_INTEGER_0_0= 'Integer' ) ) | ( (lv_BOOLEAN_1_0= 'boolean' ) ) | ( (lv_STRING_2_0= 'String' ) ) | ( (lv_LONG_3_0= 'long' ) ) | ( (lv_DOUBLE_4_0= 'double' ) ) | ( (otherlv_5= RULE_ID ) ) ) ;
	public final EObject rulePrimitiveDataType() throws RecognitionException {
		EObject current = null;


		Token lv_INTEGER_0_0=null;
		Token lv_BOOLEAN_1_0=null;
		Token lv_STRING_2_0=null;
		Token lv_LONG_3_0=null;
		Token lv_DOUBLE_4_0=null;
		Token otherlv_5=null;

		 enterRule(); 
		    
		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2867:28: ( ( ( (lv_INTEGER_0_0= 'Integer' ) ) | ( (lv_BOOLEAN_1_0= 'boolean' ) ) | ( (lv_STRING_2_0= 'String' ) ) | ( (lv_LONG_3_0= 'long' ) ) | ( (lv_DOUBLE_4_0= 'double' ) ) | ( (otherlv_5= RULE_ID ) ) ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2868:2: ( ( (lv_INTEGER_0_0= 'Integer' ) ) | ( (lv_BOOLEAN_1_0= 'boolean' ) ) | ( (lv_STRING_2_0= 'String' ) ) | ( (lv_LONG_3_0= 'long' ) ) | ( (lv_DOUBLE_4_0= 'double' ) ) | ( (otherlv_5= RULE_ID ) ) )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2868:2: ( ( (lv_INTEGER_0_0= 'Integer' ) ) | ( (lv_BOOLEAN_1_0= 'boolean' ) ) | ( (lv_STRING_2_0= 'String' ) ) | ( (lv_LONG_3_0= 'long' ) ) | ( (lv_DOUBLE_4_0= 'double' ) ) | ( (otherlv_5= RULE_ID ) ) )
			int alt39=6;
			switch ( input.LA(1) ) {
			case 21:
				{
				alt39=1;
				}
				break;
			case 30:
				{
				alt39=2;
				}
				break;
			case 26:
				{
				alt39=3;
				}
				break;
			case 43:
				{
				alt39=4;
				}
				break;
			case 37:
				{
				alt39=5;
				}
				break;
			case RULE_ID:
				{
				alt39=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 39, 0, input);
				throw nvae;
			}
			switch (alt39) {
				case 1 :
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2868:2: ( (lv_INTEGER_0_0= 'Integer' ) )
					{
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2868:2: ( (lv_INTEGER_0_0= 'Integer' ) )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2869:3: (lv_INTEGER_0_0= 'Integer' )
					{
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2869:3: (lv_INTEGER_0_0= 'Integer' )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2870:3: lv_INTEGER_0_0= 'Integer'
					{
					lv_INTEGER_0_0=(Token)match(input,21,FOLLOW_21_in_rulePrimitiveDataType6100); 

					        newLeafNode(lv_INTEGER_0_0, grammarAccess.getPrimitiveDataTypeAccess().getINTEGERIntegerKeyword_0_0());
					    

						        if (current==null) {
						            current = createModelElement(grammarAccess.getPrimitiveDataTypeRule());
						        }
					       		setWithLastConsumed(current, "INTEGER", lv_INTEGER_0_0, "Integer");
						    
					}

					}

					}
					break;
				case 2 :
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2884:6: ( (lv_BOOLEAN_1_0= 'boolean' ) )
					{
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2884:6: ( (lv_BOOLEAN_1_0= 'boolean' ) )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2885:3: (lv_BOOLEAN_1_0= 'boolean' )
					{
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2885:3: (lv_BOOLEAN_1_0= 'boolean' )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2886:3: lv_BOOLEAN_1_0= 'boolean'
					{
					lv_BOOLEAN_1_0=(Token)match(input,30,FOLLOW_30_in_rulePrimitiveDataType6137); 

					        newLeafNode(lv_BOOLEAN_1_0, grammarAccess.getPrimitiveDataTypeAccess().getBOOLEANBooleanKeyword_1_0());
					    

						        if (current==null) {
						            current = createModelElement(grammarAccess.getPrimitiveDataTypeRule());
						        }
					       		setWithLastConsumed(current, "BOOLEAN", lv_BOOLEAN_1_0, "boolean");
						    
					}

					}

					}
					break;
				case 3 :
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2900:6: ( (lv_STRING_2_0= 'String' ) )
					{
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2900:6: ( (lv_STRING_2_0= 'String' ) )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2901:3: (lv_STRING_2_0= 'String' )
					{
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2901:3: (lv_STRING_2_0= 'String' )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2902:3: lv_STRING_2_0= 'String'
					{
					lv_STRING_2_0=(Token)match(input,26,FOLLOW_26_in_rulePrimitiveDataType6174); 

					        newLeafNode(lv_STRING_2_0, grammarAccess.getPrimitiveDataTypeAccess().getSTRINGStringKeyword_2_0());
					    

						        if (current==null) {
						            current = createModelElement(grammarAccess.getPrimitiveDataTypeRule());
						        }
					       		setWithLastConsumed(current, "STRING", lv_STRING_2_0, "String");
						    
					}

					}

					}
					break;
				case 4 :
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2916:6: ( (lv_LONG_3_0= 'long' ) )
					{
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2916:6: ( (lv_LONG_3_0= 'long' ) )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2917:3: (lv_LONG_3_0= 'long' )
					{
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2917:3: (lv_LONG_3_0= 'long' )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2918:3: lv_LONG_3_0= 'long'
					{
					lv_LONG_3_0=(Token)match(input,43,FOLLOW_43_in_rulePrimitiveDataType6211); 

					        newLeafNode(lv_LONG_3_0, grammarAccess.getPrimitiveDataTypeAccess().getLONGLongKeyword_3_0());
					    

						        if (current==null) {
						            current = createModelElement(grammarAccess.getPrimitiveDataTypeRule());
						        }
					       		setWithLastConsumed(current, "LONG", lv_LONG_3_0, "long");
						    
					}

					}

					}
					break;
				case 5 :
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2932:6: ( (lv_DOUBLE_4_0= 'double' ) )
					{
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2932:6: ( (lv_DOUBLE_4_0= 'double' ) )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2933:3: (lv_DOUBLE_4_0= 'double' )
					{
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2933:3: (lv_DOUBLE_4_0= 'double' )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2934:3: lv_DOUBLE_4_0= 'double'
					{
					lv_DOUBLE_4_0=(Token)match(input,37,FOLLOW_37_in_rulePrimitiveDataType6248); 

					        newLeafNode(lv_DOUBLE_4_0, grammarAccess.getPrimitiveDataTypeAccess().getDOUBLEDoubleKeyword_4_0());
					    

						        if (current==null) {
						            current = createModelElement(grammarAccess.getPrimitiveDataTypeRule());
						        }
					       		setWithLastConsumed(current, "DOUBLE", lv_DOUBLE_4_0, "double");
						    
					}

					}

					}
					break;
				case 6 :
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2948:6: ( (otherlv_5= RULE_ID ) )
					{
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2948:6: ( (otherlv_5= RULE_ID ) )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2949:3: (otherlv_5= RULE_ID )
					{
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2949:3: (otherlv_5= RULE_ID )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2950:3: otherlv_5= RULE_ID
					{

								if (current==null) {
						            current = createModelElement(grammarAccess.getPrimitiveDataTypeRule());
						        }
					        
					otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimitiveDataType6287); 

							newLeafNode(otherlv_5, grammarAccess.getPrimitiveDataTypeAccess().getStructDefStructCrossReference_5_0()); 
						
					}

					}

					}
					break;

			}

			}

			 leaveRule(); 
		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "rulePrimitiveDataType"

	// Delegated rules


	protected DFA1 dfa1 = new DFA1(this);
	static final String DFA1_eotS =
		"\22\uffff";
	static final String DFA1_eofS =
		"\22\uffff";
	static final String DFA1_minS =
		"\1\44\1\16\3\uffff\2\5\1\16\1\5\6\17\1\5\1\uffff\1\5";
	static final String DFA1_maxS =
		"\1\71\1\16\3\uffff\2\5\1\16\1\53\6\17\1\71\1\uffff\1\16";
	static final String DFA1_acceptS =
		"\2\uffff\1\2\1\3\1\4\13\uffff\1\1\1\uffff";
	static final String DFA1_specialS =
		"\22\uffff}>";
	static final String[] DFA1_transitionS = {
			"\1\4\17\uffff\1\2\2\uffff\1\3\1\uffff\1\1",
			"\1\5",
			"",
			"",
			"",
			"\1\6",
			"\1\7",
			"\1\10",
			"\1\16\17\uffff\1\11\4\uffff\1\13\3\uffff\1\12\6\uffff\1\15\5\uffff\1"+
			"\14",
			"\1\17",
			"\1\17",
			"\1\17",
			"\1\17",
			"\1\17",
			"\1\17",
			"\1\21\56\uffff\1\20\2\uffff\1\3\1\uffff\1\3",
			"",
			"\1\7\10\uffff\1\10"
	};

	static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
	static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
	static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
	static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
	static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
	static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
	static final short[][] DFA1_transition;

	static {
		int numStates = DFA1_transitionS.length;
		DFA1_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
		}
	}

	protected class DFA1 extends DFA {

		public DFA1(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 1;
			this.eot = DFA1_eot;
			this.eof = DFA1_eof;
			this.min = DFA1_min;
			this.max = DFA1_max;
			this.accept = DFA1_accept;
			this.special = DFA1_special;
			this.transition = DFA1_transition;
		}
		@Override
		public String getDescription() {
			return "80:2: ( ( (lv_vocSpec_0_0= ruleVocSpec ) ) | ( (lv_interactionSpec_1_0= ruleInteractionSpec ) ) | ( (lv_archSpec_2_0= ruleArchSpec ) ) | ( (lv_networkSpec_3_0= ruleDeploymentSpec ) ) )";
		}
	}

	public static final BitSet FOLLOW_ruleSpec_in_entryRuleSpec75 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleSpec85 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleVocSpec_in_ruleSpec131 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleInteractionSpec_in_ruleSpec158 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleArchSpec_in_ruleSpec185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleDeploymentSpec_in_ruleSpec212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleDeploymentSpec_in_entryRuleDeploymentSpec248 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleDeploymentSpec258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_ruleDeploymentSpec295 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_ruleDeploymentSpec307 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ruleDevice_in_ruleDeploymentSpec328 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_ruleDevice_in_entryRuleDevice365 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleDevice375 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleDevice417 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_ruleDevice434 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_ruleDevice446 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_ruleDevice458 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ruleDeviceLocation_in_ruleDevice479 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_ruleDevice491 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_ruleDevice503 = new BitSet(new long[]{0x0000000000420000L});
	public static final BitSet FOLLOW_rulePlatformType_in_ruleDevice524 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_ruleDevice536 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_ruleDevice548 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_ruleDevice560 = new BitSet(new long[]{0x0000000000008020L});
	public static final BitSet FOLLOW_ruleDeviceAbilities_in_ruleDevice581 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_ruleDevice594 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_ruleDevice606 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_ruleDevice618 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_ruleDeviceProtocol_in_ruleDevice639 = new BitSet(new long[]{0x0000000C00000000L});
	public static final BitSet FOLLOW_34_in_ruleDevice652 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_ruleDevice664 = new BitSet(new long[]{0x0000000003800000L});
	public static final BitSet FOLLOW_ruleDatabaseName_in_ruleDevice685 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_ruleDevice697 = new BitSet(new long[]{0x0000000C00000000L});
	public static final BitSet FOLLOW_35_in_ruleDevice711 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_ruleDevice723 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ruleDeviceDescription_in_ruleDevice744 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_ruleDevice756 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleDeviceDescription_in_entryRuleDeviceDescription792 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleDeviceDescription802 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_STRING_in_ruleDeviceDescription843 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleDeviceLocation_in_entryRuleDeviceLocation883 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleDeviceLocation893 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleDeviceLocation935 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_ruleDeviceLocation952 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_RULE_INT_in_ruleDeviceLocation969 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_ruleDeviceLocation986 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rulePlatformType_in_entryRulePlatformType1022 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRulePlatformType1032 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_rulePlatformType1075 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_rulePlatformType1112 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleDatabaseName_in_entryRuleDatabaseName1161 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleDatabaseName1171 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_ruleDatabaseName1214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_ruleDatabaseName1251 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_ruleDatabaseName1288 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleDeviceProtocol_in_entryRuleDeviceProtocol1337 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleDeviceProtocol1347 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_ruleDeviceProtocol1390 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_ruleDeviceProtocol1415 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleDeviceAbilities_in_entryRuleDeviceAbilities1451 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleDeviceAbilities1461 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleDeviceAbilities1506 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_13_in_ruleDeviceAbilities1519 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ruleDeviceAbilities_in_ruleDeviceAbilities1540 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleInteractionSpec_in_entryRuleInteractionSpec1578 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleInteractionSpec1588 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_ruleInteractionSpec1625 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_ruleInteractionSpec1637 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_59_in_ruleInteractionSpec1649 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_ruleInteractionSpec1661 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ruleEntityName_in_ruleInteractionSpec1682 = new BitSet(new long[]{0x0008200080000002L});
	public static final BitSet FOLLOW_ruleCommand_in_ruleInteractionSpec1703 = new BitSet(new long[]{0x0008200080000002L});
	public static final BitSet FOLLOW_ruleRequest_in_ruleInteractionSpec1725 = new BitSet(new long[]{0x0008200000000002L});
	public static final BitSet FOLLOW_ruleInteractionAction_in_ruleInteractionSpec1747 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_ruleInteractionAction_in_entryRuleInteractionAction1784 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleInteractionAction1794 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_ruleInteractionAction1831 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ruleActionName_in_ruleInteractionAction1852 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_ruleInteractionAction1864 = new BitSet(new long[]{0x0000000000001020L});
	public static final BitSet FOLLOW_ruleParameters_in_ruleInteractionAction1885 = new BitSet(new long[]{0x0000000000001020L});
	public static final BitSet FOLLOW_12_in_ruleInteractionAction1898 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_ruleInteractionAction1910 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleInteractionAction1930 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_ruleInteractionAction1942 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleArchSpec_in_entryRuleArchSpec1978 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleArchSpec1988 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_ruleArchSpec2026 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_ruleArchSpec2038 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ruleStruct_in_ruleArchSpec2059 = new BitSet(new long[]{0x0280000000000020L});
	public static final BitSet FOLLOW_55_in_ruleArchSpec2074 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_ruleArchSpec2086 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_ruleArchSpec2098 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_ruleArchSpec2110 = new BitSet(new long[]{0x0000000000180020L});
	public static final BitSet FOLLOW_20_in_ruleArchSpec2123 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_ruleArchSpec2135 = new BitSet(new long[]{0x0000000000180020L});
	public static final BitSet FOLLOW_ruleInBuiltComputationalService_in_ruleArchSpec2158 = new BitSet(new long[]{0x0000000000080020L});
	public static final BitSet FOLLOW_19_in_ruleArchSpec2171 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_ruleArchSpec2183 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rulecustomComputationalService_in_ruleArchSpec2204 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_ruleInBuiltComputationalService_in_entryRuleInBuiltComputationalService2241 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleInBuiltComputationalService2251 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleEntityName_in_ruleInBuiltComputationalService2297 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_ruleConsumeForInBuilt_in_ruleInBuiltComputationalService2318 = new BitSet(new long[]{0x0000000200040000L});
	public static final BitSet FOLLOW_18_in_ruleInBuiltComputationalService2331 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_ruleInBuiltComputationalService2343 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_ruleOperationName_in_ruleInBuiltComputationalService2364 = new BitSet(new long[]{0x0000000000003000L});
	public static final BitSet FOLLOW_13_in_ruleInBuiltComputationalService2377 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_RULE_INT_in_ruleInBuiltComputationalService2394 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_ruleInBuiltComputationalService2413 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_ruleInBuiltComputationalService2425 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_ruleGenerate_in_ruleInBuiltComputationalService2446 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_rulecustomComputationalService_in_entryRulecustomComputationalService2483 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRulecustomComputationalService2493 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleEntityName_in_rulecustomComputationalService2539 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_ruleConsume_in_rulecustomComputationalService2560 = new BitSet(new long[]{0x0008020280000002L});
	public static final BitSet FOLLOW_ruleRequest_in_rulecustomComputationalService2582 = new BitSet(new long[]{0x0008020080000002L});
	public static final BitSet FOLLOW_ruleGenerate_in_rulecustomComputationalService2604 = new BitSet(new long[]{0x0000020080000002L});
	public static final BitSet FOLLOW_ruleCommand_in_rulecustomComputationalService2626 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_ruleRequest_in_entryRuleRequest2663 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleRequest2673 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_ruleRequest2710 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleRequest2730 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_ruleRequest2742 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleRequest2762 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_ruleRequest2774 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleConsumeForInBuilt_in_entryRuleConsumeForInBuilt2810 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleConsumeForInBuilt2820 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_ruleConsumeForInBuilt2857 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleConsumeForInBuilt2877 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_ruleConsumeForInBuilt2889 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleConsumeForInBuilt2909 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_ruleConsumeForInBuilt2921 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleConsume_in_entryRuleConsume2957 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleConsume2967 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_ruleConsume3004 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleConsume3024 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_ruleConsume3036 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleConsume3056 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_ruleConsume3068 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand3104 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleCommand3114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_ruleCommand3151 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleCommand3171 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_ruleCommand3183 = new BitSet(new long[]{0x0000000000001020L});
	public static final BitSet FOLLOW_ruleCommandParameter_in_ruleCommand3204 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_ruleCommand3217 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_ruleCommand3229 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleCommand3249 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_ruleCommand3261 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleCommandParameter_in_entryRuleCommandParameter3297 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleCommandParameter3307 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleCommandParameter3352 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_13_in_ruleCommandParameter3365 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ruleCommandParameter_in_ruleCommandParameter3386 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleVocSpec_in_entryRuleVocSpec3424 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleVocSpec3434 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_ruleVocSpec3471 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_ruleVocSpec3483 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ruleStruct_in_ruleVocSpec3504 = new BitSet(new long[]{0x0010000000000020L});
	public static final BitSet FOLLOW_52_in_ruleVocSpec3517 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_ruleVocSpec3529 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_ruleVocSpec3541 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_ruleVocSpec3553 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_ruleVocSpec3565 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_ruleVocSpec3577 = new BitSet(new long[]{0x0000004000000020L});
	public static final BitSet FOLLOW_rulePeriodicSensors_in_ruleVocSpec3598 = new BitSet(new long[]{0x0000004000000020L});
	public static final BitSet FOLLOW_38_in_ruleVocSpec3611 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_ruleVocSpec3623 = new BitSet(new long[]{0x0000000020000020L});
	public static final BitSet FOLLOW_ruleEventSensors_in_ruleVocSpec3644 = new BitSet(new long[]{0x0000000020000020L});
	public static final BitSet FOLLOW_29_in_ruleVocSpec3657 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_ruleVocSpec3669 = new BitSet(new long[]{0x0100000000000020L});
	public static final BitSet FOLLOW_ruleActuator_in_ruleVocSpec3690 = new BitSet(new long[]{0x0100000000000020L});
	public static final BitSet FOLLOW_56_in_ruleVocSpec3703 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_ruleVocSpec3715 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_ruleStorageService_in_ruleVocSpec3736 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_ruleRegionLabel_in_entryRuleRegionLabel3775 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleRegionLabel3785 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleRegionLabel3826 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleStruct_in_entryRuleStruct3866 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleStruct3876 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleStruct3918 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ruleField_in_ruleStruct3944 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_ruleField_in_entryRuleField3981 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleField3991 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleField4033 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_ruleField4050 = new BitSet(new long[]{0x0000082044200020L});
	public static final BitSet FOLLOW_ruleType_in_ruleField4071 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_ruleField4083 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rulePeriodicSensors_in_entryRulePeriodicSensors4119 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRulePeriodicSensors4129 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleEntityName_in_rulePeriodicSensors4175 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_ruleGenerate_in_rulePeriodicSensors4196 = new BitSet(new long[]{0x0020020000000000L});
	public static final BitSet FOLLOW_53_in_rulePeriodicSensors4209 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_rulePeriodicSensors4221 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_RULE_INT_in_rulePeriodicSensors4232 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_rulePeriodicSensors4243 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_RULE_INT_in_rulePeriodicSensors4254 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_rulePeriodicSensors4265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleEventSensors_in_entryRuleEventSensors4301 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleEventSensors4311 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleEntityName_in_ruleEventSensors4357 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_ruleGenerate_in_ruleEventSensors4378 = new BitSet(new long[]{0x0000420000000000L});
	public static final BitSet FOLLOW_46_in_ruleEventSensors4391 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ruleEventConditions_in_ruleEventSensors4412 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_ruleEventSensors4424 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleEventConditions_in_entryRuleEventConditions4460 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleEventConditions4470 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleEventConditions4512 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_13_in_ruleEventConditions4530 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ruleEventConditions_in_ruleEventConditions4551 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleEntityName_in_entryRuleEntityName4591 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleEntityName4601 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleEntityName4642 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleGenerate_in_entryRuleGenerate4682 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleGenerate4692 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_ruleGenerate4729 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ruleSourceName_in_ruleGenerate4750 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_ruleGenerate4762 = new BitSet(new long[]{0x0000082044200020L});
	public static final BitSet FOLLOW_ruleType_in_ruleGenerate4783 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_ruleGenerate4795 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleSourceName_in_entryRuleSourceName4831 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleSourceName4841 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleSourceName4882 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleActuator_in_entryRuleActuator4922 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleActuator4932 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleEntityName_in_ruleActuator4978 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_ruleAction_in_ruleActuator4999 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_ruleAction_in_entryRuleAction5036 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleAction5046 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_ruleAction5083 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ruleActionName_in_ruleAction5104 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_ruleAction5116 = new BitSet(new long[]{0x0000000000001020L});
	public static final BitSet FOLLOW_ruleParameters_in_ruleAction5137 = new BitSet(new long[]{0x0000000000001020L});
	public static final BitSet FOLLOW_12_in_ruleAction5150 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_ruleAction5162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleActionName_in_entryRuleActionName5198 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleActionName5208 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleActionName5249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleParameters_in_entryRuleParameters5289 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleParameters5299 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleParameterName_in_ruleParameters5345 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_ruleParameters5357 = new BitSet(new long[]{0x0000082044200020L});
	public static final BitSet FOLLOW_ruleType_in_ruleParameters5378 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleParameterName_in_entryRuleParameterName5414 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleParameterName5424 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleParameterName5465 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleStorageService_in_entryRuleStorageService5505 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleStorageService5515 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleEntityName_in_ruleStorageService5561 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_ruleDataAccess_in_ruleStorageService5582 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_ruleDataAccess_in_entryRuleDataAccess5619 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleDataAccess5629 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_ruleDataAccess5666 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ruleSourceName_in_ruleDataAccess5687 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_ruleDataAccess5699 = new BitSet(new long[]{0x0000082044200020L});
	public static final BitSet FOLLOW_ruleType_in_ruleDataAccess5720 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_ruleDataAccess5732 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleDataAccess5749 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_ruleDataAccess5766 = new BitSet(new long[]{0x0000082044200020L});
	public static final BitSet FOLLOW_ruleType_in_ruleDataAccess5787 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_ruleDataAccess5799 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_ruleAction_in_ruleDataAccess5820 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_ruleType_in_entryRuleType5857 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleType5867 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rulePrimitiveDataType_in_ruleType5912 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleOperationName_in_entryRuleOperationName5947 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleOperationName5957 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_ruleOperationName5999 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rulePrimitiveDataType_in_entryRulePrimitiveDataType6047 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveDataType6057 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_rulePrimitiveDataType6100 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_rulePrimitiveDataType6137 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_rulePrimitiveDataType6174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_rulePrimitiveDataType6211 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_rulePrimitiveDataType6248 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rulePrimitiveDataType6287 = new BitSet(new long[]{0x0000000000000002L});
}
