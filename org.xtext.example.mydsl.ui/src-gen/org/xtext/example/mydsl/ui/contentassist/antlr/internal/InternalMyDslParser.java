package org.xtext.example.mydsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


public class InternalMyDslParser extends AbstractInternalContentAssistParser {
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
	public AbstractInternalContentAssistParser[] getDelegates() {
		return new AbstractInternalContentAssistParser[] {};
	}

	// delegators


	public InternalMyDslParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
	@Override public String getGrammarFileName() { return "../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g"; }


	 
	 	private MyDslGrammarAccess grammarAccess;
	 	
	    public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
	    	this.grammarAccess = grammarAccess;
	    }
	    
	    @Override
	    protected Grammar getGrammar() {
	    	return grammarAccess.getGrammar();
	    }
	    
	    @Override
	    protected String getValueForTokenName(String tokenName) {
	    	return tokenName;
	    }




	// $ANTLR start "entryRuleSpec"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:60:1: entryRuleSpec : ruleSpec EOF ;
	public final void entryRuleSpec() throws RecognitionException {
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:61:1: ( ruleSpec EOF )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:62:1: ruleSpec EOF
			{
			 before(grammarAccess.getSpecRule()); 
			pushFollow(FOLLOW_ruleSpec_in_entryRuleSpec61);
			ruleSpec();
			state._fsp--;

			 after(grammarAccess.getSpecRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleSpec68); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleSpec"



	// $ANTLR start "ruleSpec"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:69:1: ruleSpec : ( ( rule__Spec__Alternatives ) ) ;
	public final void ruleSpec() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:73:2: ( ( ( rule__Spec__Alternatives ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__Spec__Alternatives ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__Spec__Alternatives ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:75:1: ( rule__Spec__Alternatives )
			{
			 before(grammarAccess.getSpecAccess().getAlternatives()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:76:2: ( rule__Spec__Alternatives )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:76:2: rule__Spec__Alternatives
			{
			pushFollow(FOLLOW_rule__Spec__Alternatives_in_ruleSpec94);
			rule__Spec__Alternatives();
			state._fsp--;

			}

			 after(grammarAccess.getSpecAccess().getAlternatives()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleSpec"



	// $ANTLR start "entryRuleDeploymentSpec"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:88:1: entryRuleDeploymentSpec : ruleDeploymentSpec EOF ;
	public final void entryRuleDeploymentSpec() throws RecognitionException {
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:89:1: ( ruleDeploymentSpec EOF )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:90:1: ruleDeploymentSpec EOF
			{
			 before(grammarAccess.getDeploymentSpecRule()); 
			pushFollow(FOLLOW_ruleDeploymentSpec_in_entryRuleDeploymentSpec121);
			ruleDeploymentSpec();
			state._fsp--;

			 after(grammarAccess.getDeploymentSpecRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleDeploymentSpec128); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleDeploymentSpec"



	// $ANTLR start "ruleDeploymentSpec"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:97:1: ruleDeploymentSpec : ( ( rule__DeploymentSpec__Group__0 ) ) ;
	public final void ruleDeploymentSpec() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:101:2: ( ( ( rule__DeploymentSpec__Group__0 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__DeploymentSpec__Group__0 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__DeploymentSpec__Group__0 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:103:1: ( rule__DeploymentSpec__Group__0 )
			{
			 before(grammarAccess.getDeploymentSpecAccess().getGroup()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:104:2: ( rule__DeploymentSpec__Group__0 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:104:2: rule__DeploymentSpec__Group__0
			{
			pushFollow(FOLLOW_rule__DeploymentSpec__Group__0_in_ruleDeploymentSpec154);
			rule__DeploymentSpec__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getDeploymentSpecAccess().getGroup()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleDeploymentSpec"



	// $ANTLR start "entryRuleDevice"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:116:1: entryRuleDevice : ruleDevice EOF ;
	public final void entryRuleDevice() throws RecognitionException {
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:117:1: ( ruleDevice EOF )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:118:1: ruleDevice EOF
			{
			 before(grammarAccess.getDeviceRule()); 
			pushFollow(FOLLOW_ruleDevice_in_entryRuleDevice181);
			ruleDevice();
			state._fsp--;

			 after(grammarAccess.getDeviceRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleDevice188); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleDevice"



	// $ANTLR start "ruleDevice"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:125:1: ruleDevice : ( ( rule__Device__Group__0 ) ) ;
	public final void ruleDevice() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:129:2: ( ( ( rule__Device__Group__0 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__Device__Group__0 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__Device__Group__0 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:131:1: ( rule__Device__Group__0 )
			{
			 before(grammarAccess.getDeviceAccess().getGroup()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:132:2: ( rule__Device__Group__0 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:132:2: rule__Device__Group__0
			{
			pushFollow(FOLLOW_rule__Device__Group__0_in_ruleDevice214);
			rule__Device__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getDeviceAccess().getGroup()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleDevice"



	// $ANTLR start "entryRuleDeviceDescription"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:144:1: entryRuleDeviceDescription : ruleDeviceDescription EOF ;
	public final void entryRuleDeviceDescription() throws RecognitionException {
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:145:1: ( ruleDeviceDescription EOF )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:146:1: ruleDeviceDescription EOF
			{
			 before(grammarAccess.getDeviceDescriptionRule()); 
			pushFollow(FOLLOW_ruleDeviceDescription_in_entryRuleDeviceDescription241);
			ruleDeviceDescription();
			state._fsp--;

			 after(grammarAccess.getDeviceDescriptionRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleDeviceDescription248); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleDeviceDescription"



	// $ANTLR start "ruleDeviceDescription"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:153:1: ruleDeviceDescription : ( ( rule__DeviceDescription__DevicedescriptionTextAssignment ) ) ;
	public final void ruleDeviceDescription() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:157:2: ( ( ( rule__DeviceDescription__DevicedescriptionTextAssignment ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ( rule__DeviceDescription__DevicedescriptionTextAssignment ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ( rule__DeviceDescription__DevicedescriptionTextAssignment ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:159:1: ( rule__DeviceDescription__DevicedescriptionTextAssignment )
			{
			 before(grammarAccess.getDeviceDescriptionAccess().getDevicedescriptionTextAssignment()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:160:2: ( rule__DeviceDescription__DevicedescriptionTextAssignment )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:160:2: rule__DeviceDescription__DevicedescriptionTextAssignment
			{
			pushFollow(FOLLOW_rule__DeviceDescription__DevicedescriptionTextAssignment_in_ruleDeviceDescription274);
			rule__DeviceDescription__DevicedescriptionTextAssignment();
			state._fsp--;

			}

			 after(grammarAccess.getDeviceDescriptionAccess().getDevicedescriptionTextAssignment()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleDeviceDescription"



	// $ANTLR start "entryRuleDeviceLocation"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:172:1: entryRuleDeviceLocation : ruleDeviceLocation EOF ;
	public final void entryRuleDeviceLocation() throws RecognitionException {
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:173:1: ( ruleDeviceLocation EOF )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:174:1: ruleDeviceLocation EOF
			{
			 before(grammarAccess.getDeviceLocationRule()); 
			pushFollow(FOLLOW_ruleDeviceLocation_in_entryRuleDeviceLocation301);
			ruleDeviceLocation();
			state._fsp--;

			 after(grammarAccess.getDeviceLocationRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleDeviceLocation308); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleDeviceLocation"



	// $ANTLR start "ruleDeviceLocation"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:181:1: ruleDeviceLocation : ( ( rule__DeviceLocation__Group__0 ) ) ;
	public final void ruleDeviceLocation() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:185:2: ( ( ( rule__DeviceLocation__Group__0 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( ( rule__DeviceLocation__Group__0 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( ( rule__DeviceLocation__Group__0 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:187:1: ( rule__DeviceLocation__Group__0 )
			{
			 before(grammarAccess.getDeviceLocationAccess().getGroup()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:188:2: ( rule__DeviceLocation__Group__0 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:188:2: rule__DeviceLocation__Group__0
			{
			pushFollow(FOLLOW_rule__DeviceLocation__Group__0_in_ruleDeviceLocation334);
			rule__DeviceLocation__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getDeviceLocationAccess().getGroup()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleDeviceLocation"



	// $ANTLR start "entryRulePlatformType"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:1: entryRulePlatformType : rulePlatformType EOF ;
	public final void entryRulePlatformType() throws RecognitionException {
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:201:1: ( rulePlatformType EOF )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:1: rulePlatformType EOF
			{
			 before(grammarAccess.getPlatformTypeRule()); 
			pushFollow(FOLLOW_rulePlatformType_in_entryRulePlatformType361);
			rulePlatformType();
			state._fsp--;

			 after(grammarAccess.getPlatformTypeRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRulePlatformType368); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRulePlatformType"



	// $ANTLR start "rulePlatformType"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:209:1: rulePlatformType : ( ( rule__PlatformType__Alternatives ) ) ;
	public final void rulePlatformType() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:213:2: ( ( ( rule__PlatformType__Alternatives ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:214:1: ( ( rule__PlatformType__Alternatives ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:214:1: ( ( rule__PlatformType__Alternatives ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:215:1: ( rule__PlatformType__Alternatives )
			{
			 before(grammarAccess.getPlatformTypeAccess().getAlternatives()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:216:2: ( rule__PlatformType__Alternatives )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:216:2: rule__PlatformType__Alternatives
			{
			pushFollow(FOLLOW_rule__PlatformType__Alternatives_in_rulePlatformType394);
			rule__PlatformType__Alternatives();
			state._fsp--;

			}

			 after(grammarAccess.getPlatformTypeAccess().getAlternatives()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rulePlatformType"



	// $ANTLR start "entryRuleDatabaseName"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:228:1: entryRuleDatabaseName : ruleDatabaseName EOF ;
	public final void entryRuleDatabaseName() throws RecognitionException {
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:229:1: ( ruleDatabaseName EOF )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:230:1: ruleDatabaseName EOF
			{
			 before(grammarAccess.getDatabaseNameRule()); 
			pushFollow(FOLLOW_ruleDatabaseName_in_entryRuleDatabaseName421);
			ruleDatabaseName();
			state._fsp--;

			 after(grammarAccess.getDatabaseNameRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleDatabaseName428); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleDatabaseName"



	// $ANTLR start "ruleDatabaseName"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:237:1: ruleDatabaseName : ( ( rule__DatabaseName__Alternatives ) ) ;
	public final void ruleDatabaseName() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:241:2: ( ( ( rule__DatabaseName__Alternatives ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:242:1: ( ( rule__DatabaseName__Alternatives ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:242:1: ( ( rule__DatabaseName__Alternatives ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:243:1: ( rule__DatabaseName__Alternatives )
			{
			 before(grammarAccess.getDatabaseNameAccess().getAlternatives()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:244:2: ( rule__DatabaseName__Alternatives )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:244:2: rule__DatabaseName__Alternatives
			{
			pushFollow(FOLLOW_rule__DatabaseName__Alternatives_in_ruleDatabaseName454);
			rule__DatabaseName__Alternatives();
			state._fsp--;

			}

			 after(grammarAccess.getDatabaseNameAccess().getAlternatives()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleDatabaseName"



	// $ANTLR start "entryRuleDeviceProtocol"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:256:1: entryRuleDeviceProtocol : ruleDeviceProtocol EOF ;
	public final void entryRuleDeviceProtocol() throws RecognitionException {
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:257:1: ( ruleDeviceProtocol EOF )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:258:1: ruleDeviceProtocol EOF
			{
			 before(grammarAccess.getDeviceProtocolRule()); 
			pushFollow(FOLLOW_ruleDeviceProtocol_in_entryRuleDeviceProtocol481);
			ruleDeviceProtocol();
			state._fsp--;

			 after(grammarAccess.getDeviceProtocolRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleDeviceProtocol488); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleDeviceProtocol"



	// $ANTLR start "ruleDeviceProtocol"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:265:1: ruleDeviceProtocol : ( ( rule__DeviceProtocol__Group__0 ) ) ;
	public final void ruleDeviceProtocol() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:269:2: ( ( ( rule__DeviceProtocol__Group__0 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:270:1: ( ( rule__DeviceProtocol__Group__0 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:270:1: ( ( rule__DeviceProtocol__Group__0 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:271:1: ( rule__DeviceProtocol__Group__0 )
			{
			 before(grammarAccess.getDeviceProtocolAccess().getGroup()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:272:2: ( rule__DeviceProtocol__Group__0 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:272:2: rule__DeviceProtocol__Group__0
			{
			pushFollow(FOLLOW_rule__DeviceProtocol__Group__0_in_ruleDeviceProtocol514);
			rule__DeviceProtocol__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getDeviceProtocolAccess().getGroup()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleDeviceProtocol"



	// $ANTLR start "entryRuleDeviceAbilities"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:284:1: entryRuleDeviceAbilities : ruleDeviceAbilities EOF ;
	public final void entryRuleDeviceAbilities() throws RecognitionException {
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:285:1: ( ruleDeviceAbilities EOF )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:286:1: ruleDeviceAbilities EOF
			{
			 before(grammarAccess.getDeviceAbilitiesRule()); 
			pushFollow(FOLLOW_ruleDeviceAbilities_in_entryRuleDeviceAbilities541);
			ruleDeviceAbilities();
			state._fsp--;

			 after(grammarAccess.getDeviceAbilitiesRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleDeviceAbilities548); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleDeviceAbilities"



	// $ANTLR start "ruleDeviceAbilities"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:293:1: ruleDeviceAbilities : ( ( rule__DeviceAbilities__Group__0 ) ) ;
	public final void ruleDeviceAbilities() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:297:2: ( ( ( rule__DeviceAbilities__Group__0 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:298:1: ( ( rule__DeviceAbilities__Group__0 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:298:1: ( ( rule__DeviceAbilities__Group__0 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:299:1: ( rule__DeviceAbilities__Group__0 )
			{
			 before(grammarAccess.getDeviceAbilitiesAccess().getGroup()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:300:2: ( rule__DeviceAbilities__Group__0 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:300:2: rule__DeviceAbilities__Group__0
			{
			pushFollow(FOLLOW_rule__DeviceAbilities__Group__0_in_ruleDeviceAbilities574);
			rule__DeviceAbilities__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getDeviceAbilitiesAccess().getGroup()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleDeviceAbilities"



	// $ANTLR start "entryRuleInteractionSpec"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:312:1: entryRuleInteractionSpec : ruleInteractionSpec EOF ;
	public final void entryRuleInteractionSpec() throws RecognitionException {
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:313:1: ( ruleInteractionSpec EOF )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:314:1: ruleInteractionSpec EOF
			{
			 before(grammarAccess.getInteractionSpecRule()); 
			pushFollow(FOLLOW_ruleInteractionSpec_in_entryRuleInteractionSpec601);
			ruleInteractionSpec();
			state._fsp--;

			 after(grammarAccess.getInteractionSpecRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleInteractionSpec608); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleInteractionSpec"



	// $ANTLR start "ruleInteractionSpec"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:321:1: ruleInteractionSpec : ( ( rule__InteractionSpec__Group__0 ) ) ;
	public final void ruleInteractionSpec() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:325:2: ( ( ( rule__InteractionSpec__Group__0 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:326:1: ( ( rule__InteractionSpec__Group__0 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:326:1: ( ( rule__InteractionSpec__Group__0 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:327:1: ( rule__InteractionSpec__Group__0 )
			{
			 before(grammarAccess.getInteractionSpecAccess().getGroup()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:328:2: ( rule__InteractionSpec__Group__0 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:328:2: rule__InteractionSpec__Group__0
			{
			pushFollow(FOLLOW_rule__InteractionSpec__Group__0_in_ruleInteractionSpec634);
			rule__InteractionSpec__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getInteractionSpecAccess().getGroup()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleInteractionSpec"



	// $ANTLR start "entryRuleInteractionAction"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:340:1: entryRuleInteractionAction : ruleInteractionAction EOF ;
	public final void entryRuleInteractionAction() throws RecognitionException {
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:341:1: ( ruleInteractionAction EOF )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:342:1: ruleInteractionAction EOF
			{
			 before(grammarAccess.getInteractionActionRule()); 
			pushFollow(FOLLOW_ruleInteractionAction_in_entryRuleInteractionAction661);
			ruleInteractionAction();
			state._fsp--;

			 after(grammarAccess.getInteractionActionRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleInteractionAction668); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleInteractionAction"



	// $ANTLR start "ruleInteractionAction"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:349:1: ruleInteractionAction : ( ( rule__InteractionAction__Group__0 ) ) ;
	public final void ruleInteractionAction() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:353:2: ( ( ( rule__InteractionAction__Group__0 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:354:1: ( ( rule__InteractionAction__Group__0 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:354:1: ( ( rule__InteractionAction__Group__0 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:355:1: ( rule__InteractionAction__Group__0 )
			{
			 before(grammarAccess.getInteractionActionAccess().getGroup()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:356:2: ( rule__InteractionAction__Group__0 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:356:2: rule__InteractionAction__Group__0
			{
			pushFollow(FOLLOW_rule__InteractionAction__Group__0_in_ruleInteractionAction694);
			rule__InteractionAction__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getInteractionActionAccess().getGroup()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleInteractionAction"



	// $ANTLR start "entryRuleArchSpec"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:368:1: entryRuleArchSpec : ruleArchSpec EOF ;
	public final void entryRuleArchSpec() throws RecognitionException {
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:369:1: ( ruleArchSpec EOF )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:370:1: ruleArchSpec EOF
			{
			 before(grammarAccess.getArchSpecRule()); 
			pushFollow(FOLLOW_ruleArchSpec_in_entryRuleArchSpec721);
			ruleArchSpec();
			state._fsp--;

			 after(grammarAccess.getArchSpecRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleArchSpec728); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleArchSpec"



	// $ANTLR start "ruleArchSpec"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:377:1: ruleArchSpec : ( ( rule__ArchSpec__Group__0 ) ) ;
	public final void ruleArchSpec() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:381:2: ( ( ( rule__ArchSpec__Group__0 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:382:1: ( ( rule__ArchSpec__Group__0 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:382:1: ( ( rule__ArchSpec__Group__0 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:383:1: ( rule__ArchSpec__Group__0 )
			{
			 before(grammarAccess.getArchSpecAccess().getGroup()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:384:2: ( rule__ArchSpec__Group__0 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:384:2: rule__ArchSpec__Group__0
			{
			pushFollow(FOLLOW_rule__ArchSpec__Group__0_in_ruleArchSpec754);
			rule__ArchSpec__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getArchSpecAccess().getGroup()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleArchSpec"



	// $ANTLR start "entryRuleInBuiltComputationalService"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:396:1: entryRuleInBuiltComputationalService : ruleInBuiltComputationalService EOF ;
	public final void entryRuleInBuiltComputationalService() throws RecognitionException {
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:397:1: ( ruleInBuiltComputationalService EOF )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:398:1: ruleInBuiltComputationalService EOF
			{
			 before(grammarAccess.getInBuiltComputationalServiceRule()); 
			pushFollow(FOLLOW_ruleInBuiltComputationalService_in_entryRuleInBuiltComputationalService781);
			ruleInBuiltComputationalService();
			state._fsp--;

			 after(grammarAccess.getInBuiltComputationalServiceRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleInBuiltComputationalService788); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleInBuiltComputationalService"



	// $ANTLR start "ruleInBuiltComputationalService"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:405:1: ruleInBuiltComputationalService : ( ( rule__InBuiltComputationalService__Group__0 ) ) ;
	public final void ruleInBuiltComputationalService() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:409:2: ( ( ( rule__InBuiltComputationalService__Group__0 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:410:1: ( ( rule__InBuiltComputationalService__Group__0 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:410:1: ( ( rule__InBuiltComputationalService__Group__0 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:411:1: ( rule__InBuiltComputationalService__Group__0 )
			{
			 before(grammarAccess.getInBuiltComputationalServiceAccess().getGroup()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:412:2: ( rule__InBuiltComputationalService__Group__0 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:412:2: rule__InBuiltComputationalService__Group__0
			{
			pushFollow(FOLLOW_rule__InBuiltComputationalService__Group__0_in_ruleInBuiltComputationalService814);
			rule__InBuiltComputationalService__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getInBuiltComputationalServiceAccess().getGroup()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleInBuiltComputationalService"



	// $ANTLR start "entryRulecustomComputationalService"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:424:1: entryRulecustomComputationalService : rulecustomComputationalService EOF ;
	public final void entryRulecustomComputationalService() throws RecognitionException {
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:425:1: ( rulecustomComputationalService EOF )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:426:1: rulecustomComputationalService EOF
			{
			 before(grammarAccess.getCustomComputationalServiceRule()); 
			pushFollow(FOLLOW_rulecustomComputationalService_in_entryRulecustomComputationalService841);
			rulecustomComputationalService();
			state._fsp--;

			 after(grammarAccess.getCustomComputationalServiceRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRulecustomComputationalService848); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRulecustomComputationalService"



	// $ANTLR start "rulecustomComputationalService"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:433:1: rulecustomComputationalService : ( ( rule__CustomComputationalService__Group__0 ) ) ;
	public final void rulecustomComputationalService() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:437:2: ( ( ( rule__CustomComputationalService__Group__0 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:438:1: ( ( rule__CustomComputationalService__Group__0 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:438:1: ( ( rule__CustomComputationalService__Group__0 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:439:1: ( rule__CustomComputationalService__Group__0 )
			{
			 before(grammarAccess.getCustomComputationalServiceAccess().getGroup()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:440:2: ( rule__CustomComputationalService__Group__0 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:440:2: rule__CustomComputationalService__Group__0
			{
			pushFollow(FOLLOW_rule__CustomComputationalService__Group__0_in_rulecustomComputationalService874);
			rule__CustomComputationalService__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getCustomComputationalServiceAccess().getGroup()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rulecustomComputationalService"



	// $ANTLR start "entryRuleRequest"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:452:1: entryRuleRequest : ruleRequest EOF ;
	public final void entryRuleRequest() throws RecognitionException {
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:453:1: ( ruleRequest EOF )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:454:1: ruleRequest EOF
			{
			 before(grammarAccess.getRequestRule()); 
			pushFollow(FOLLOW_ruleRequest_in_entryRuleRequest901);
			ruleRequest();
			state._fsp--;

			 after(grammarAccess.getRequestRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleRequest908); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleRequest"



	// $ANTLR start "ruleRequest"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:461:1: ruleRequest : ( ( rule__Request__Group__0 ) ) ;
	public final void ruleRequest() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:465:2: ( ( ( rule__Request__Group__0 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:466:1: ( ( rule__Request__Group__0 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:466:1: ( ( rule__Request__Group__0 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:467:1: ( rule__Request__Group__0 )
			{
			 before(grammarAccess.getRequestAccess().getGroup()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:468:2: ( rule__Request__Group__0 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:468:2: rule__Request__Group__0
			{
			pushFollow(FOLLOW_rule__Request__Group__0_in_ruleRequest934);
			rule__Request__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getRequestAccess().getGroup()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleRequest"



	// $ANTLR start "entryRuleConsumeForInBuilt"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:480:1: entryRuleConsumeForInBuilt : ruleConsumeForInBuilt EOF ;
	public final void entryRuleConsumeForInBuilt() throws RecognitionException {
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:481:1: ( ruleConsumeForInBuilt EOF )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:482:1: ruleConsumeForInBuilt EOF
			{
			 before(grammarAccess.getConsumeForInBuiltRule()); 
			pushFollow(FOLLOW_ruleConsumeForInBuilt_in_entryRuleConsumeForInBuilt961);
			ruleConsumeForInBuilt();
			state._fsp--;

			 after(grammarAccess.getConsumeForInBuiltRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleConsumeForInBuilt968); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleConsumeForInBuilt"



	// $ANTLR start "ruleConsumeForInBuilt"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:489:1: ruleConsumeForInBuilt : ( ( rule__ConsumeForInBuilt__Group__0 ) ) ;
	public final void ruleConsumeForInBuilt() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:493:2: ( ( ( rule__ConsumeForInBuilt__Group__0 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:494:1: ( ( rule__ConsumeForInBuilt__Group__0 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:494:1: ( ( rule__ConsumeForInBuilt__Group__0 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:495:1: ( rule__ConsumeForInBuilt__Group__0 )
			{
			 before(grammarAccess.getConsumeForInBuiltAccess().getGroup()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:496:2: ( rule__ConsumeForInBuilt__Group__0 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:496:2: rule__ConsumeForInBuilt__Group__0
			{
			pushFollow(FOLLOW_rule__ConsumeForInBuilt__Group__0_in_ruleConsumeForInBuilt994);
			rule__ConsumeForInBuilt__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getConsumeForInBuiltAccess().getGroup()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleConsumeForInBuilt"



	// $ANTLR start "entryRuleConsume"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:508:1: entryRuleConsume : ruleConsume EOF ;
	public final void entryRuleConsume() throws RecognitionException {
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:509:1: ( ruleConsume EOF )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:510:1: ruleConsume EOF
			{
			 before(grammarAccess.getConsumeRule()); 
			pushFollow(FOLLOW_ruleConsume_in_entryRuleConsume1021);
			ruleConsume();
			state._fsp--;

			 after(grammarAccess.getConsumeRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleConsume1028); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleConsume"



	// $ANTLR start "ruleConsume"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:517:1: ruleConsume : ( ( rule__Consume__Group__0 ) ) ;
	public final void ruleConsume() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:521:2: ( ( ( rule__Consume__Group__0 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:522:1: ( ( rule__Consume__Group__0 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:522:1: ( ( rule__Consume__Group__0 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:523:1: ( rule__Consume__Group__0 )
			{
			 before(grammarAccess.getConsumeAccess().getGroup()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:524:2: ( rule__Consume__Group__0 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:524:2: rule__Consume__Group__0
			{
			pushFollow(FOLLOW_rule__Consume__Group__0_in_ruleConsume1054);
			rule__Consume__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getConsumeAccess().getGroup()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleConsume"



	// $ANTLR start "entryRuleCommand"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:536:1: entryRuleCommand : ruleCommand EOF ;
	public final void entryRuleCommand() throws RecognitionException {
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:537:1: ( ruleCommand EOF )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:538:1: ruleCommand EOF
			{
			 before(grammarAccess.getCommandRule()); 
			pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand1081);
			ruleCommand();
			state._fsp--;

			 after(grammarAccess.getCommandRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleCommand1088); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleCommand"



	// $ANTLR start "ruleCommand"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:545:1: ruleCommand : ( ( rule__Command__Group__0 ) ) ;
	public final void ruleCommand() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:549:2: ( ( ( rule__Command__Group__0 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:550:1: ( ( rule__Command__Group__0 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:550:1: ( ( rule__Command__Group__0 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:551:1: ( rule__Command__Group__0 )
			{
			 before(grammarAccess.getCommandAccess().getGroup()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:552:2: ( rule__Command__Group__0 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:552:2: rule__Command__Group__0
			{
			pushFollow(FOLLOW_rule__Command__Group__0_in_ruleCommand1114);
			rule__Command__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getCommandAccess().getGroup()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleCommand"



	// $ANTLR start "entryRuleCommandParameter"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:564:1: entryRuleCommandParameter : ruleCommandParameter EOF ;
	public final void entryRuleCommandParameter() throws RecognitionException {
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:565:1: ( ruleCommandParameter EOF )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:566:1: ruleCommandParameter EOF
			{
			 before(grammarAccess.getCommandParameterRule()); 
			pushFollow(FOLLOW_ruleCommandParameter_in_entryRuleCommandParameter1141);
			ruleCommandParameter();
			state._fsp--;

			 after(grammarAccess.getCommandParameterRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleCommandParameter1148); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleCommandParameter"



	// $ANTLR start "ruleCommandParameter"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:573:1: ruleCommandParameter : ( ( rule__CommandParameter__Group__0 ) ) ;
	public final void ruleCommandParameter() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:577:2: ( ( ( rule__CommandParameter__Group__0 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:578:1: ( ( rule__CommandParameter__Group__0 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:578:1: ( ( rule__CommandParameter__Group__0 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:579:1: ( rule__CommandParameter__Group__0 )
			{
			 before(grammarAccess.getCommandParameterAccess().getGroup()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:580:2: ( rule__CommandParameter__Group__0 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:580:2: rule__CommandParameter__Group__0
			{
			pushFollow(FOLLOW_rule__CommandParameter__Group__0_in_ruleCommandParameter1174);
			rule__CommandParameter__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getCommandParameterAccess().getGroup()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleCommandParameter"



	// $ANTLR start "entryRuleVocSpec"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:592:1: entryRuleVocSpec : ruleVocSpec EOF ;
	public final void entryRuleVocSpec() throws RecognitionException {
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:593:1: ( ruleVocSpec EOF )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:594:1: ruleVocSpec EOF
			{
			 before(grammarAccess.getVocSpecRule()); 
			pushFollow(FOLLOW_ruleVocSpec_in_entryRuleVocSpec1201);
			ruleVocSpec();
			state._fsp--;

			 after(grammarAccess.getVocSpecRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleVocSpec1208); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleVocSpec"



	// $ANTLR start "ruleVocSpec"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:601:1: ruleVocSpec : ( ( rule__VocSpec__Group__0 ) ) ;
	public final void ruleVocSpec() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:605:2: ( ( ( rule__VocSpec__Group__0 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:606:1: ( ( rule__VocSpec__Group__0 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:606:1: ( ( rule__VocSpec__Group__0 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:607:1: ( rule__VocSpec__Group__0 )
			{
			 before(grammarAccess.getVocSpecAccess().getGroup()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:608:2: ( rule__VocSpec__Group__0 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:608:2: rule__VocSpec__Group__0
			{
			pushFollow(FOLLOW_rule__VocSpec__Group__0_in_ruleVocSpec1234);
			rule__VocSpec__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getVocSpecAccess().getGroup()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleVocSpec"



	// $ANTLR start "entryRuleRegionLabel"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:622:1: entryRuleRegionLabel : ruleRegionLabel EOF ;
	public final void entryRuleRegionLabel() throws RecognitionException {
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:623:1: ( ruleRegionLabel EOF )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:624:1: ruleRegionLabel EOF
			{
			 before(grammarAccess.getRegionLabelRule()); 
			pushFollow(FOLLOW_ruleRegionLabel_in_entryRuleRegionLabel1263);
			ruleRegionLabel();
			state._fsp--;

			 after(grammarAccess.getRegionLabelRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleRegionLabel1270); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleRegionLabel"



	// $ANTLR start "ruleRegionLabel"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:631:1: ruleRegionLabel : ( ( rule__RegionLabel__NameAssignment ) ) ;
	public final void ruleRegionLabel() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:635:2: ( ( ( rule__RegionLabel__NameAssignment ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:636:1: ( ( rule__RegionLabel__NameAssignment ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:636:1: ( ( rule__RegionLabel__NameAssignment ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:637:1: ( rule__RegionLabel__NameAssignment )
			{
			 before(grammarAccess.getRegionLabelAccess().getNameAssignment()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:638:2: ( rule__RegionLabel__NameAssignment )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:638:2: rule__RegionLabel__NameAssignment
			{
			pushFollow(FOLLOW_rule__RegionLabel__NameAssignment_in_ruleRegionLabel1296);
			rule__RegionLabel__NameAssignment();
			state._fsp--;

			}

			 after(grammarAccess.getRegionLabelAccess().getNameAssignment()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleRegionLabel"



	// $ANTLR start "entryRuleStruct"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:650:1: entryRuleStruct : ruleStruct EOF ;
	public final void entryRuleStruct() throws RecognitionException {
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:651:1: ( ruleStruct EOF )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:652:1: ruleStruct EOF
			{
			 before(grammarAccess.getStructRule()); 
			pushFollow(FOLLOW_ruleStruct_in_entryRuleStruct1323);
			ruleStruct();
			state._fsp--;

			 after(grammarAccess.getStructRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleStruct1330); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleStruct"



	// $ANTLR start "ruleStruct"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:659:1: ruleStruct : ( ( rule__Struct__Group__0 ) ) ;
	public final void ruleStruct() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:663:2: ( ( ( rule__Struct__Group__0 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:664:1: ( ( rule__Struct__Group__0 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:664:1: ( ( rule__Struct__Group__0 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:665:1: ( rule__Struct__Group__0 )
			{
			 before(grammarAccess.getStructAccess().getGroup()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:666:2: ( rule__Struct__Group__0 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:666:2: rule__Struct__Group__0
			{
			pushFollow(FOLLOW_rule__Struct__Group__0_in_ruleStruct1356);
			rule__Struct__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getStructAccess().getGroup()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleStruct"



	// $ANTLR start "entryRuleField"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:678:1: entryRuleField : ruleField EOF ;
	public final void entryRuleField() throws RecognitionException {
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:679:1: ( ruleField EOF )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:680:1: ruleField EOF
			{
			 before(grammarAccess.getFieldRule()); 
			pushFollow(FOLLOW_ruleField_in_entryRuleField1383);
			ruleField();
			state._fsp--;

			 after(grammarAccess.getFieldRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleField1390); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleField"



	// $ANTLR start "ruleField"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:687:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
	public final void ruleField() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:691:2: ( ( ( rule__Field__Group__0 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:692:1: ( ( rule__Field__Group__0 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:692:1: ( ( rule__Field__Group__0 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:693:1: ( rule__Field__Group__0 )
			{
			 before(grammarAccess.getFieldAccess().getGroup()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:694:2: ( rule__Field__Group__0 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:694:2: rule__Field__Group__0
			{
			pushFollow(FOLLOW_rule__Field__Group__0_in_ruleField1416);
			rule__Field__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getFieldAccess().getGroup()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleField"



	// $ANTLR start "entryRulePeriodicSensors"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:706:1: entryRulePeriodicSensors : rulePeriodicSensors EOF ;
	public final void entryRulePeriodicSensors() throws RecognitionException {
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:707:1: ( rulePeriodicSensors EOF )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:708:1: rulePeriodicSensors EOF
			{
			 before(grammarAccess.getPeriodicSensorsRule()); 
			pushFollow(FOLLOW_rulePeriodicSensors_in_entryRulePeriodicSensors1443);
			rulePeriodicSensors();
			state._fsp--;

			 after(grammarAccess.getPeriodicSensorsRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRulePeriodicSensors1450); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRulePeriodicSensors"



	// $ANTLR start "rulePeriodicSensors"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:715:1: rulePeriodicSensors : ( ( rule__PeriodicSensors__Group__0 ) ) ;
	public final void rulePeriodicSensors() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:719:2: ( ( ( rule__PeriodicSensors__Group__0 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:720:1: ( ( rule__PeriodicSensors__Group__0 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:720:1: ( ( rule__PeriodicSensors__Group__0 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:721:1: ( rule__PeriodicSensors__Group__0 )
			{
			 before(grammarAccess.getPeriodicSensorsAccess().getGroup()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:722:2: ( rule__PeriodicSensors__Group__0 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:722:2: rule__PeriodicSensors__Group__0
			{
			pushFollow(FOLLOW_rule__PeriodicSensors__Group__0_in_rulePeriodicSensors1476);
			rule__PeriodicSensors__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getPeriodicSensorsAccess().getGroup()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rulePeriodicSensors"



	// $ANTLR start "entryRuleEventSensors"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:734:1: entryRuleEventSensors : ruleEventSensors EOF ;
	public final void entryRuleEventSensors() throws RecognitionException {
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:735:1: ( ruleEventSensors EOF )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:736:1: ruleEventSensors EOF
			{
			 before(grammarAccess.getEventSensorsRule()); 
			pushFollow(FOLLOW_ruleEventSensors_in_entryRuleEventSensors1503);
			ruleEventSensors();
			state._fsp--;

			 after(grammarAccess.getEventSensorsRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleEventSensors1510); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleEventSensors"



	// $ANTLR start "ruleEventSensors"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:743:1: ruleEventSensors : ( ( rule__EventSensors__Group__0 ) ) ;
	public final void ruleEventSensors() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:747:2: ( ( ( rule__EventSensors__Group__0 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:748:1: ( ( rule__EventSensors__Group__0 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:748:1: ( ( rule__EventSensors__Group__0 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:749:1: ( rule__EventSensors__Group__0 )
			{
			 before(grammarAccess.getEventSensorsAccess().getGroup()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:750:2: ( rule__EventSensors__Group__0 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:750:2: rule__EventSensors__Group__0
			{
			pushFollow(FOLLOW_rule__EventSensors__Group__0_in_ruleEventSensors1536);
			rule__EventSensors__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getEventSensorsAccess().getGroup()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleEventSensors"



	// $ANTLR start "entryRuleEventConditions"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:762:1: entryRuleEventConditions : ruleEventConditions EOF ;
	public final void entryRuleEventConditions() throws RecognitionException {
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:763:1: ( ruleEventConditions EOF )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:764:1: ruleEventConditions EOF
			{
			 before(grammarAccess.getEventConditionsRule()); 
			pushFollow(FOLLOW_ruleEventConditions_in_entryRuleEventConditions1563);
			ruleEventConditions();
			state._fsp--;

			 after(grammarAccess.getEventConditionsRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleEventConditions1570); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleEventConditions"



	// $ANTLR start "ruleEventConditions"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:771:1: ruleEventConditions : ( ( rule__EventConditions__Group__0 ) ) ;
	public final void ruleEventConditions() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:775:2: ( ( ( rule__EventConditions__Group__0 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:776:1: ( ( rule__EventConditions__Group__0 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:776:1: ( ( rule__EventConditions__Group__0 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:777:1: ( rule__EventConditions__Group__0 )
			{
			 before(grammarAccess.getEventConditionsAccess().getGroup()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:778:2: ( rule__EventConditions__Group__0 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:778:2: rule__EventConditions__Group__0
			{
			pushFollow(FOLLOW_rule__EventConditions__Group__0_in_ruleEventConditions1596);
			rule__EventConditions__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getEventConditionsAccess().getGroup()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleEventConditions"



	// $ANTLR start "entryRuleEntityName"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:792:1: entryRuleEntityName : ruleEntityName EOF ;
	public final void entryRuleEntityName() throws RecognitionException {
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:793:1: ( ruleEntityName EOF )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:794:1: ruleEntityName EOF
			{
			 before(grammarAccess.getEntityNameRule()); 
			pushFollow(FOLLOW_ruleEntityName_in_entryRuleEntityName1625);
			ruleEntityName();
			state._fsp--;

			 after(grammarAccess.getEntityNameRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleEntityName1632); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleEntityName"



	// $ANTLR start "ruleEntityName"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:801:1: ruleEntityName : ( ( rule__EntityName__NameAssignment ) ) ;
	public final void ruleEntityName() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:805:2: ( ( ( rule__EntityName__NameAssignment ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:806:1: ( ( rule__EntityName__NameAssignment ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:806:1: ( ( rule__EntityName__NameAssignment ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:807:1: ( rule__EntityName__NameAssignment )
			{
			 before(grammarAccess.getEntityNameAccess().getNameAssignment()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:808:2: ( rule__EntityName__NameAssignment )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:808:2: rule__EntityName__NameAssignment
			{
			pushFollow(FOLLOW_rule__EntityName__NameAssignment_in_ruleEntityName1658);
			rule__EntityName__NameAssignment();
			state._fsp--;

			}

			 after(grammarAccess.getEntityNameAccess().getNameAssignment()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleEntityName"



	// $ANTLR start "entryRuleGenerate"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:820:1: entryRuleGenerate : ruleGenerate EOF ;
	public final void entryRuleGenerate() throws RecognitionException {
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:821:1: ( ruleGenerate EOF )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:822:1: ruleGenerate EOF
			{
			 before(grammarAccess.getGenerateRule()); 
			pushFollow(FOLLOW_ruleGenerate_in_entryRuleGenerate1685);
			ruleGenerate();
			state._fsp--;

			 after(grammarAccess.getGenerateRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleGenerate1692); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleGenerate"



	// $ANTLR start "ruleGenerate"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:829:1: ruleGenerate : ( ( rule__Generate__Group__0 ) ) ;
	public final void ruleGenerate() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:833:2: ( ( ( rule__Generate__Group__0 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:834:1: ( ( rule__Generate__Group__0 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:834:1: ( ( rule__Generate__Group__0 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:835:1: ( rule__Generate__Group__0 )
			{
			 before(grammarAccess.getGenerateAccess().getGroup()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:836:2: ( rule__Generate__Group__0 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:836:2: rule__Generate__Group__0
			{
			pushFollow(FOLLOW_rule__Generate__Group__0_in_ruleGenerate1718);
			rule__Generate__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getGenerateAccess().getGroup()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleGenerate"



	// $ANTLR start "entryRuleSourceName"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:848:1: entryRuleSourceName : ruleSourceName EOF ;
	public final void entryRuleSourceName() throws RecognitionException {
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:849:1: ( ruleSourceName EOF )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:850:1: ruleSourceName EOF
			{
			 before(grammarAccess.getSourceNameRule()); 
			pushFollow(FOLLOW_ruleSourceName_in_entryRuleSourceName1745);
			ruleSourceName();
			state._fsp--;

			 after(grammarAccess.getSourceNameRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleSourceName1752); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleSourceName"



	// $ANTLR start "ruleSourceName"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:857:1: ruleSourceName : ( ( rule__SourceName__NameAssignment ) ) ;
	public final void ruleSourceName() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:861:2: ( ( ( rule__SourceName__NameAssignment ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:862:1: ( ( rule__SourceName__NameAssignment ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:862:1: ( ( rule__SourceName__NameAssignment ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:863:1: ( rule__SourceName__NameAssignment )
			{
			 before(grammarAccess.getSourceNameAccess().getNameAssignment()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:864:2: ( rule__SourceName__NameAssignment )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:864:2: rule__SourceName__NameAssignment
			{
			pushFollow(FOLLOW_rule__SourceName__NameAssignment_in_ruleSourceName1778);
			rule__SourceName__NameAssignment();
			state._fsp--;

			}

			 after(grammarAccess.getSourceNameAccess().getNameAssignment()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleSourceName"



	// $ANTLR start "entryRuleActuator"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:876:1: entryRuleActuator : ruleActuator EOF ;
	public final void entryRuleActuator() throws RecognitionException {
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:877:1: ( ruleActuator EOF )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:878:1: ruleActuator EOF
			{
			 before(grammarAccess.getActuatorRule()); 
			pushFollow(FOLLOW_ruleActuator_in_entryRuleActuator1805);
			ruleActuator();
			state._fsp--;

			 after(grammarAccess.getActuatorRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleActuator1812); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleActuator"



	// $ANTLR start "ruleActuator"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:885:1: ruleActuator : ( ( rule__Actuator__Group__0 ) ) ;
	public final void ruleActuator() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:889:2: ( ( ( rule__Actuator__Group__0 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:890:1: ( ( rule__Actuator__Group__0 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:890:1: ( ( rule__Actuator__Group__0 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:891:1: ( rule__Actuator__Group__0 )
			{
			 before(grammarAccess.getActuatorAccess().getGroup()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:892:2: ( rule__Actuator__Group__0 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:892:2: rule__Actuator__Group__0
			{
			pushFollow(FOLLOW_rule__Actuator__Group__0_in_ruleActuator1838);
			rule__Actuator__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getActuatorAccess().getGroup()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleActuator"



	// $ANTLR start "entryRuleAction"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:904:1: entryRuleAction : ruleAction EOF ;
	public final void entryRuleAction() throws RecognitionException {
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:905:1: ( ruleAction EOF )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:906:1: ruleAction EOF
			{
			 before(grammarAccess.getActionRule()); 
			pushFollow(FOLLOW_ruleAction_in_entryRuleAction1865);
			ruleAction();
			state._fsp--;

			 after(grammarAccess.getActionRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleAction1872); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleAction"



	// $ANTLR start "ruleAction"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:913:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
	public final void ruleAction() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:917:2: ( ( ( rule__Action__Group__0 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:918:1: ( ( rule__Action__Group__0 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:918:1: ( ( rule__Action__Group__0 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:919:1: ( rule__Action__Group__0 )
			{
			 before(grammarAccess.getActionAccess().getGroup()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:920:2: ( rule__Action__Group__0 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:920:2: rule__Action__Group__0
			{
			pushFollow(FOLLOW_rule__Action__Group__0_in_ruleAction1898);
			rule__Action__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getActionAccess().getGroup()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleAction"



	// $ANTLR start "entryRuleActionName"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:932:1: entryRuleActionName : ruleActionName EOF ;
	public final void entryRuleActionName() throws RecognitionException {
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:933:1: ( ruleActionName EOF )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:934:1: ruleActionName EOF
			{
			 before(grammarAccess.getActionNameRule()); 
			pushFollow(FOLLOW_ruleActionName_in_entryRuleActionName1925);
			ruleActionName();
			state._fsp--;

			 after(grammarAccess.getActionNameRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleActionName1932); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleActionName"



	// $ANTLR start "ruleActionName"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:941:1: ruleActionName : ( ( rule__ActionName__NameAssignment ) ) ;
	public final void ruleActionName() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:945:2: ( ( ( rule__ActionName__NameAssignment ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:946:1: ( ( rule__ActionName__NameAssignment ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:946:1: ( ( rule__ActionName__NameAssignment ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:947:1: ( rule__ActionName__NameAssignment )
			{
			 before(grammarAccess.getActionNameAccess().getNameAssignment()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:948:2: ( rule__ActionName__NameAssignment )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:948:2: rule__ActionName__NameAssignment
			{
			pushFollow(FOLLOW_rule__ActionName__NameAssignment_in_ruleActionName1958);
			rule__ActionName__NameAssignment();
			state._fsp--;

			}

			 after(grammarAccess.getActionNameAccess().getNameAssignment()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleActionName"



	// $ANTLR start "entryRuleParameters"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:960:1: entryRuleParameters : ruleParameters EOF ;
	public final void entryRuleParameters() throws RecognitionException {
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:961:1: ( ruleParameters EOF )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:962:1: ruleParameters EOF
			{
			 before(grammarAccess.getParametersRule()); 
			pushFollow(FOLLOW_ruleParameters_in_entryRuleParameters1985);
			ruleParameters();
			state._fsp--;

			 after(grammarAccess.getParametersRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleParameters1992); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleParameters"



	// $ANTLR start "ruleParameters"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:969:1: ruleParameters : ( ( rule__Parameters__Group__0 ) ) ;
	public final void ruleParameters() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:973:2: ( ( ( rule__Parameters__Group__0 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:974:1: ( ( rule__Parameters__Group__0 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:974:1: ( ( rule__Parameters__Group__0 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:975:1: ( rule__Parameters__Group__0 )
			{
			 before(grammarAccess.getParametersAccess().getGroup()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:976:2: ( rule__Parameters__Group__0 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:976:2: rule__Parameters__Group__0
			{
			pushFollow(FOLLOW_rule__Parameters__Group__0_in_ruleParameters2018);
			rule__Parameters__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getParametersAccess().getGroup()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleParameters"



	// $ANTLR start "entryRuleParameterName"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:988:1: entryRuleParameterName : ruleParameterName EOF ;
	public final void entryRuleParameterName() throws RecognitionException {
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:989:1: ( ruleParameterName EOF )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:990:1: ruleParameterName EOF
			{
			 before(grammarAccess.getParameterNameRule()); 
			pushFollow(FOLLOW_ruleParameterName_in_entryRuleParameterName2045);
			ruleParameterName();
			state._fsp--;

			 after(grammarAccess.getParameterNameRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleParameterName2052); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleParameterName"



	// $ANTLR start "ruleParameterName"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:997:1: ruleParameterName : ( ( rule__ParameterName__NameAssignment ) ) ;
	public final void ruleParameterName() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1001:2: ( ( ( rule__ParameterName__NameAssignment ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1002:1: ( ( rule__ParameterName__NameAssignment ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1002:1: ( ( rule__ParameterName__NameAssignment ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1003:1: ( rule__ParameterName__NameAssignment )
			{
			 before(grammarAccess.getParameterNameAccess().getNameAssignment()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1004:2: ( rule__ParameterName__NameAssignment )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1004:2: rule__ParameterName__NameAssignment
			{
			pushFollow(FOLLOW_rule__ParameterName__NameAssignment_in_ruleParameterName2078);
			rule__ParameterName__NameAssignment();
			state._fsp--;

			}

			 after(grammarAccess.getParameterNameAccess().getNameAssignment()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleParameterName"



	// $ANTLR start "entryRuleStorageService"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1016:1: entryRuleStorageService : ruleStorageService EOF ;
	public final void entryRuleStorageService() throws RecognitionException {
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1017:1: ( ruleStorageService EOF )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1018:1: ruleStorageService EOF
			{
			 before(grammarAccess.getStorageServiceRule()); 
			pushFollow(FOLLOW_ruleStorageService_in_entryRuleStorageService2105);
			ruleStorageService();
			state._fsp--;

			 after(grammarAccess.getStorageServiceRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleStorageService2112); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleStorageService"



	// $ANTLR start "ruleStorageService"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1025:1: ruleStorageService : ( ( rule__StorageService__Group__0 ) ) ;
	public final void ruleStorageService() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1029:2: ( ( ( rule__StorageService__Group__0 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1030:1: ( ( rule__StorageService__Group__0 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1030:1: ( ( rule__StorageService__Group__0 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1031:1: ( rule__StorageService__Group__0 )
			{
			 before(grammarAccess.getStorageServiceAccess().getGroup()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1032:2: ( rule__StorageService__Group__0 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1032:2: rule__StorageService__Group__0
			{
			pushFollow(FOLLOW_rule__StorageService__Group__0_in_ruleStorageService2138);
			rule__StorageService__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getStorageServiceAccess().getGroup()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleStorageService"



	// $ANTLR start "entryRuleDataAccess"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1044:1: entryRuleDataAccess : ruleDataAccess EOF ;
	public final void entryRuleDataAccess() throws RecognitionException {
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1045:1: ( ruleDataAccess EOF )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1046:1: ruleDataAccess EOF
			{
			 before(grammarAccess.getDataAccessRule()); 
			pushFollow(FOLLOW_ruleDataAccess_in_entryRuleDataAccess2165);
			ruleDataAccess();
			state._fsp--;

			 after(grammarAccess.getDataAccessRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleDataAccess2172); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleDataAccess"



	// $ANTLR start "ruleDataAccess"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1053:1: ruleDataAccess : ( ( rule__DataAccess__Group__0 ) ) ;
	public final void ruleDataAccess() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1057:2: ( ( ( rule__DataAccess__Group__0 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1058:1: ( ( rule__DataAccess__Group__0 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1058:1: ( ( rule__DataAccess__Group__0 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1059:1: ( rule__DataAccess__Group__0 )
			{
			 before(grammarAccess.getDataAccessAccess().getGroup()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1060:2: ( rule__DataAccess__Group__0 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1060:2: rule__DataAccess__Group__0
			{
			pushFollow(FOLLOW_rule__DataAccess__Group__0_in_ruleDataAccess2198);
			rule__DataAccess__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getDataAccessAccess().getGroup()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleDataAccess"



	// $ANTLR start "entryRuleType"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1072:1: entryRuleType : ruleType EOF ;
	public final void entryRuleType() throws RecognitionException {
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1073:1: ( ruleType EOF )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1074:1: ruleType EOF
			{
			 before(grammarAccess.getTypeRule()); 
			pushFollow(FOLLOW_ruleType_in_entryRuleType2225);
			ruleType();
			state._fsp--;

			 after(grammarAccess.getTypeRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleType2232); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleType"



	// $ANTLR start "ruleType"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1081:1: ruleType : ( ( rule__Type__PrimitiveDataTypeAssignment ) ) ;
	public final void ruleType() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1085:2: ( ( ( rule__Type__PrimitiveDataTypeAssignment ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1086:1: ( ( rule__Type__PrimitiveDataTypeAssignment ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1086:1: ( ( rule__Type__PrimitiveDataTypeAssignment ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1087:1: ( rule__Type__PrimitiveDataTypeAssignment )
			{
			 before(grammarAccess.getTypeAccess().getPrimitiveDataTypeAssignment()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1088:2: ( rule__Type__PrimitiveDataTypeAssignment )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1088:2: rule__Type__PrimitiveDataTypeAssignment
			{
			pushFollow(FOLLOW_rule__Type__PrimitiveDataTypeAssignment_in_ruleType2258);
			rule__Type__PrimitiveDataTypeAssignment();
			state._fsp--;

			}

			 after(grammarAccess.getTypeAccess().getPrimitiveDataTypeAssignment()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleType"



	// $ANTLR start "entryRuleOperationName"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1100:1: entryRuleOperationName : ruleOperationName EOF ;
	public final void entryRuleOperationName() throws RecognitionException {
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1101:1: ( ruleOperationName EOF )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1102:1: ruleOperationName EOF
			{
			 before(grammarAccess.getOperationNameRule()); 
			pushFollow(FOLLOW_ruleOperationName_in_entryRuleOperationName2285);
			ruleOperationName();
			state._fsp--;

			 after(grammarAccess.getOperationNameRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleOperationName2292); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleOperationName"



	// $ANTLR start "ruleOperationName"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1109:1: ruleOperationName : ( ( rule__OperationName__OPERATION_NAMEAssignment ) ) ;
	public final void ruleOperationName() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1113:2: ( ( ( rule__OperationName__OPERATION_NAMEAssignment ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1114:1: ( ( rule__OperationName__OPERATION_NAMEAssignment ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1114:1: ( ( rule__OperationName__OPERATION_NAMEAssignment ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1115:1: ( rule__OperationName__OPERATION_NAMEAssignment )
			{
			 before(grammarAccess.getOperationNameAccess().getOPERATION_NAMEAssignment()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1116:2: ( rule__OperationName__OPERATION_NAMEAssignment )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1116:2: rule__OperationName__OPERATION_NAMEAssignment
			{
			pushFollow(FOLLOW_rule__OperationName__OPERATION_NAMEAssignment_in_ruleOperationName2318);
			rule__OperationName__OPERATION_NAMEAssignment();
			state._fsp--;

			}

			 after(grammarAccess.getOperationNameAccess().getOPERATION_NAMEAssignment()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleOperationName"



	// $ANTLR start "entryRulePrimitiveDataType"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1128:1: entryRulePrimitiveDataType : rulePrimitiveDataType EOF ;
	public final void entryRulePrimitiveDataType() throws RecognitionException {
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1129:1: ( rulePrimitiveDataType EOF )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1130:1: rulePrimitiveDataType EOF
			{
			 before(grammarAccess.getPrimitiveDataTypeRule()); 
			pushFollow(FOLLOW_rulePrimitiveDataType_in_entryRulePrimitiveDataType2345);
			rulePrimitiveDataType();
			state._fsp--;

			 after(grammarAccess.getPrimitiveDataTypeRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveDataType2352); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRulePrimitiveDataType"



	// $ANTLR start "rulePrimitiveDataType"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1137:1: rulePrimitiveDataType : ( ( rule__PrimitiveDataType__Alternatives ) ) ;
	public final void rulePrimitiveDataType() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1141:2: ( ( ( rule__PrimitiveDataType__Alternatives ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1142:1: ( ( rule__PrimitiveDataType__Alternatives ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1142:1: ( ( rule__PrimitiveDataType__Alternatives ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1143:1: ( rule__PrimitiveDataType__Alternatives )
			{
			 before(grammarAccess.getPrimitiveDataTypeAccess().getAlternatives()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1144:2: ( rule__PrimitiveDataType__Alternatives )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1144:2: rule__PrimitiveDataType__Alternatives
			{
			pushFollow(FOLLOW_rule__PrimitiveDataType__Alternatives_in_rulePrimitiveDataType2378);
			rule__PrimitiveDataType__Alternatives();
			state._fsp--;

			}

			 after(grammarAccess.getPrimitiveDataTypeAccess().getAlternatives()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rulePrimitiveDataType"



	// $ANTLR start "rule__Spec__Alternatives"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1156:1: rule__Spec__Alternatives : ( ( ( rule__Spec__VocSpecAssignment_0 ) ) | ( ( rule__Spec__InteractionSpecAssignment_1 ) ) | ( ( rule__Spec__ArchSpecAssignment_2 ) ) | ( ( rule__Spec__NetworkSpecAssignment_3 ) ) );
	public final void rule__Spec__Alternatives() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1160:1: ( ( ( rule__Spec__VocSpecAssignment_0 ) ) | ( ( rule__Spec__InteractionSpecAssignment_1 ) ) | ( ( rule__Spec__ArchSpecAssignment_2 ) ) | ( ( rule__Spec__NetworkSpecAssignment_3 ) ) )
			int alt1=4;
			alt1 = dfa1.predict(input);
			switch (alt1) {
				case 1 :
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1161:1: ( ( rule__Spec__VocSpecAssignment_0 ) )
					{
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1161:1: ( ( rule__Spec__VocSpecAssignment_0 ) )
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1162:1: ( rule__Spec__VocSpecAssignment_0 )
					{
					 before(grammarAccess.getSpecAccess().getVocSpecAssignment_0()); 
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1163:2: ( rule__Spec__VocSpecAssignment_0 )
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1163:2: rule__Spec__VocSpecAssignment_0
					{
					pushFollow(FOLLOW_rule__Spec__VocSpecAssignment_0_in_rule__Spec__Alternatives2414);
					rule__Spec__VocSpecAssignment_0();
					state._fsp--;

					}

					 after(grammarAccess.getSpecAccess().getVocSpecAssignment_0()); 
					}

					}
					break;
				case 2 :
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1167:6: ( ( rule__Spec__InteractionSpecAssignment_1 ) )
					{
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1167:6: ( ( rule__Spec__InteractionSpecAssignment_1 ) )
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1168:1: ( rule__Spec__InteractionSpecAssignment_1 )
					{
					 before(grammarAccess.getSpecAccess().getInteractionSpecAssignment_1()); 
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1169:2: ( rule__Spec__InteractionSpecAssignment_1 )
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1169:2: rule__Spec__InteractionSpecAssignment_1
					{
					pushFollow(FOLLOW_rule__Spec__InteractionSpecAssignment_1_in_rule__Spec__Alternatives2432);
					rule__Spec__InteractionSpecAssignment_1();
					state._fsp--;

					}

					 after(grammarAccess.getSpecAccess().getInteractionSpecAssignment_1()); 
					}

					}
					break;
				case 3 :
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1173:6: ( ( rule__Spec__ArchSpecAssignment_2 ) )
					{
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1173:6: ( ( rule__Spec__ArchSpecAssignment_2 ) )
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1174:1: ( rule__Spec__ArchSpecAssignment_2 )
					{
					 before(grammarAccess.getSpecAccess().getArchSpecAssignment_2()); 
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1175:2: ( rule__Spec__ArchSpecAssignment_2 )
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1175:2: rule__Spec__ArchSpecAssignment_2
					{
					pushFollow(FOLLOW_rule__Spec__ArchSpecAssignment_2_in_rule__Spec__Alternatives2450);
					rule__Spec__ArchSpecAssignment_2();
					state._fsp--;

					}

					 after(grammarAccess.getSpecAccess().getArchSpecAssignment_2()); 
					}

					}
					break;
				case 4 :
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1179:6: ( ( rule__Spec__NetworkSpecAssignment_3 ) )
					{
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1179:6: ( ( rule__Spec__NetworkSpecAssignment_3 ) )
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1180:1: ( rule__Spec__NetworkSpecAssignment_3 )
					{
					 before(grammarAccess.getSpecAccess().getNetworkSpecAssignment_3()); 
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1181:2: ( rule__Spec__NetworkSpecAssignment_3 )
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1181:2: rule__Spec__NetworkSpecAssignment_3
					{
					pushFollow(FOLLOW_rule__Spec__NetworkSpecAssignment_3_in_rule__Spec__Alternatives2468);
					rule__Spec__NetworkSpecAssignment_3();
					state._fsp--;

					}

					 after(grammarAccess.getSpecAccess().getNetworkSpecAssignment_3()); 
					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Spec__Alternatives"



	// $ANTLR start "rule__PlatformType__Alternatives"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1190:1: rule__PlatformType__Alternatives : ( ( ( rule__PlatformType__DeviceTypeAssignment_0 ) ) | ( ( rule__PlatformType__DeviceTypeAssignment_1 ) ) );
	public final void rule__PlatformType__Alternatives() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1194:1: ( ( ( rule__PlatformType__DeviceTypeAssignment_0 ) ) | ( ( rule__PlatformType__DeviceTypeAssignment_1 ) ) )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==22) ) {
				alt2=1;
			}
			else if ( (LA2_0==17) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1195:1: ( ( rule__PlatformType__DeviceTypeAssignment_0 ) )
					{
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1195:1: ( ( rule__PlatformType__DeviceTypeAssignment_0 ) )
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1196:1: ( rule__PlatformType__DeviceTypeAssignment_0 )
					{
					 before(grammarAccess.getPlatformTypeAccess().getDeviceTypeAssignment_0()); 
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1197:2: ( rule__PlatformType__DeviceTypeAssignment_0 )
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1197:2: rule__PlatformType__DeviceTypeAssignment_0
					{
					pushFollow(FOLLOW_rule__PlatformType__DeviceTypeAssignment_0_in_rule__PlatformType__Alternatives2501);
					rule__PlatformType__DeviceTypeAssignment_0();
					state._fsp--;

					}

					 after(grammarAccess.getPlatformTypeAccess().getDeviceTypeAssignment_0()); 
					}

					}
					break;
				case 2 :
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1201:6: ( ( rule__PlatformType__DeviceTypeAssignment_1 ) )
					{
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1201:6: ( ( rule__PlatformType__DeviceTypeAssignment_1 ) )
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1202:1: ( rule__PlatformType__DeviceTypeAssignment_1 )
					{
					 before(grammarAccess.getPlatformTypeAccess().getDeviceTypeAssignment_1()); 
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1203:2: ( rule__PlatformType__DeviceTypeAssignment_1 )
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1203:2: rule__PlatformType__DeviceTypeAssignment_1
					{
					pushFollow(FOLLOW_rule__PlatformType__DeviceTypeAssignment_1_in_rule__PlatformType__Alternatives2519);
					rule__PlatformType__DeviceTypeAssignment_1();
					state._fsp--;

					}

					 after(grammarAccess.getPlatformTypeAccess().getDeviceTypeAssignment_1()); 
					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__PlatformType__Alternatives"



	// $ANTLR start "rule__DatabaseName__Alternatives"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1212:1: rule__DatabaseName__Alternatives : ( ( ( rule__DatabaseName__InstalledDatabaseAssignment_0 ) ) | ( ( rule__DatabaseName__InstalledDatabaseAssignment_1 ) ) | ( ( rule__DatabaseName__InstalledDatabaseAssignment_2 ) ) );
	public final void rule__DatabaseName__Alternatives() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1216:1: ( ( ( rule__DatabaseName__InstalledDatabaseAssignment_0 ) ) | ( ( rule__DatabaseName__InstalledDatabaseAssignment_1 ) ) | ( ( rule__DatabaseName__InstalledDatabaseAssignment_2 ) ) )
			int alt3=3;
			switch ( input.LA(1) ) {
			case 24:
				{
				alt3=1;
				}
				break;
			case 25:
				{
				alt3=2;
				}
				break;
			case 23:
				{
				alt3=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1217:1: ( ( rule__DatabaseName__InstalledDatabaseAssignment_0 ) )
					{
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1217:1: ( ( rule__DatabaseName__InstalledDatabaseAssignment_0 ) )
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1218:1: ( rule__DatabaseName__InstalledDatabaseAssignment_0 )
					{
					 before(grammarAccess.getDatabaseNameAccess().getInstalledDatabaseAssignment_0()); 
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1219:2: ( rule__DatabaseName__InstalledDatabaseAssignment_0 )
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1219:2: rule__DatabaseName__InstalledDatabaseAssignment_0
					{
					pushFollow(FOLLOW_rule__DatabaseName__InstalledDatabaseAssignment_0_in_rule__DatabaseName__Alternatives2552);
					rule__DatabaseName__InstalledDatabaseAssignment_0();
					state._fsp--;

					}

					 after(grammarAccess.getDatabaseNameAccess().getInstalledDatabaseAssignment_0()); 
					}

					}
					break;
				case 2 :
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1223:6: ( ( rule__DatabaseName__InstalledDatabaseAssignment_1 ) )
					{
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1223:6: ( ( rule__DatabaseName__InstalledDatabaseAssignment_1 ) )
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1224:1: ( rule__DatabaseName__InstalledDatabaseAssignment_1 )
					{
					 before(grammarAccess.getDatabaseNameAccess().getInstalledDatabaseAssignment_1()); 
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1225:2: ( rule__DatabaseName__InstalledDatabaseAssignment_1 )
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1225:2: rule__DatabaseName__InstalledDatabaseAssignment_1
					{
					pushFollow(FOLLOW_rule__DatabaseName__InstalledDatabaseAssignment_1_in_rule__DatabaseName__Alternatives2570);
					rule__DatabaseName__InstalledDatabaseAssignment_1();
					state._fsp--;

					}

					 after(grammarAccess.getDatabaseNameAccess().getInstalledDatabaseAssignment_1()); 
					}

					}
					break;
				case 3 :
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1229:6: ( ( rule__DatabaseName__InstalledDatabaseAssignment_2 ) )
					{
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1229:6: ( ( rule__DatabaseName__InstalledDatabaseAssignment_2 ) )
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1230:1: ( rule__DatabaseName__InstalledDatabaseAssignment_2 )
					{
					 before(grammarAccess.getDatabaseNameAccess().getInstalledDatabaseAssignment_2()); 
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1231:2: ( rule__DatabaseName__InstalledDatabaseAssignment_2 )
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1231:2: rule__DatabaseName__InstalledDatabaseAssignment_2
					{
					pushFollow(FOLLOW_rule__DatabaseName__InstalledDatabaseAssignment_2_in_rule__DatabaseName__Alternatives2588);
					rule__DatabaseName__InstalledDatabaseAssignment_2();
					state._fsp--;

					}

					 after(grammarAccess.getDatabaseNameAccess().getInstalledDatabaseAssignment_2()); 
					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__DatabaseName__Alternatives"



	// $ANTLR start "rule__PrimitiveDataType__Alternatives"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1240:1: rule__PrimitiveDataType__Alternatives : ( ( ( rule__PrimitiveDataType__INTEGERAssignment_0 ) ) | ( ( rule__PrimitiveDataType__BOOLEANAssignment_1 ) ) | ( ( rule__PrimitiveDataType__STRINGAssignment_2 ) ) | ( ( rule__PrimitiveDataType__LONGAssignment_3 ) ) | ( ( rule__PrimitiveDataType__DOUBLEAssignment_4 ) ) | ( ( rule__PrimitiveDataType__StructDefAssignment_5 ) ) );
	public final void rule__PrimitiveDataType__Alternatives() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1244:1: ( ( ( rule__PrimitiveDataType__INTEGERAssignment_0 ) ) | ( ( rule__PrimitiveDataType__BOOLEANAssignment_1 ) ) | ( ( rule__PrimitiveDataType__STRINGAssignment_2 ) ) | ( ( rule__PrimitiveDataType__LONGAssignment_3 ) ) | ( ( rule__PrimitiveDataType__DOUBLEAssignment_4 ) ) | ( ( rule__PrimitiveDataType__StructDefAssignment_5 ) ) )
			int alt4=6;
			switch ( input.LA(1) ) {
			case 21:
				{
				alt4=1;
				}
				break;
			case 30:
				{
				alt4=2;
				}
				break;
			case 26:
				{
				alt4=3;
				}
				break;
			case 43:
				{
				alt4=4;
				}
				break;
			case 37:
				{
				alt4=5;
				}
				break;
			case RULE_ID:
				{
				alt4=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1245:1: ( ( rule__PrimitiveDataType__INTEGERAssignment_0 ) )
					{
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1245:1: ( ( rule__PrimitiveDataType__INTEGERAssignment_0 ) )
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1246:1: ( rule__PrimitiveDataType__INTEGERAssignment_0 )
					{
					 before(grammarAccess.getPrimitiveDataTypeAccess().getINTEGERAssignment_0()); 
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1247:2: ( rule__PrimitiveDataType__INTEGERAssignment_0 )
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1247:2: rule__PrimitiveDataType__INTEGERAssignment_0
					{
					pushFollow(FOLLOW_rule__PrimitiveDataType__INTEGERAssignment_0_in_rule__PrimitiveDataType__Alternatives2621);
					rule__PrimitiveDataType__INTEGERAssignment_0();
					state._fsp--;

					}

					 after(grammarAccess.getPrimitiveDataTypeAccess().getINTEGERAssignment_0()); 
					}

					}
					break;
				case 2 :
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1251:6: ( ( rule__PrimitiveDataType__BOOLEANAssignment_1 ) )
					{
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1251:6: ( ( rule__PrimitiveDataType__BOOLEANAssignment_1 ) )
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1252:1: ( rule__PrimitiveDataType__BOOLEANAssignment_1 )
					{
					 before(grammarAccess.getPrimitiveDataTypeAccess().getBOOLEANAssignment_1()); 
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1253:2: ( rule__PrimitiveDataType__BOOLEANAssignment_1 )
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1253:2: rule__PrimitiveDataType__BOOLEANAssignment_1
					{
					pushFollow(FOLLOW_rule__PrimitiveDataType__BOOLEANAssignment_1_in_rule__PrimitiveDataType__Alternatives2639);
					rule__PrimitiveDataType__BOOLEANAssignment_1();
					state._fsp--;

					}

					 after(grammarAccess.getPrimitiveDataTypeAccess().getBOOLEANAssignment_1()); 
					}

					}
					break;
				case 3 :
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1257:6: ( ( rule__PrimitiveDataType__STRINGAssignment_2 ) )
					{
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1257:6: ( ( rule__PrimitiveDataType__STRINGAssignment_2 ) )
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1258:1: ( rule__PrimitiveDataType__STRINGAssignment_2 )
					{
					 before(grammarAccess.getPrimitiveDataTypeAccess().getSTRINGAssignment_2()); 
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1259:2: ( rule__PrimitiveDataType__STRINGAssignment_2 )
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1259:2: rule__PrimitiveDataType__STRINGAssignment_2
					{
					pushFollow(FOLLOW_rule__PrimitiveDataType__STRINGAssignment_2_in_rule__PrimitiveDataType__Alternatives2657);
					rule__PrimitiveDataType__STRINGAssignment_2();
					state._fsp--;

					}

					 after(grammarAccess.getPrimitiveDataTypeAccess().getSTRINGAssignment_2()); 
					}

					}
					break;
				case 4 :
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1263:6: ( ( rule__PrimitiveDataType__LONGAssignment_3 ) )
					{
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1263:6: ( ( rule__PrimitiveDataType__LONGAssignment_3 ) )
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1264:1: ( rule__PrimitiveDataType__LONGAssignment_3 )
					{
					 before(grammarAccess.getPrimitiveDataTypeAccess().getLONGAssignment_3()); 
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1265:2: ( rule__PrimitiveDataType__LONGAssignment_3 )
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1265:2: rule__PrimitiveDataType__LONGAssignment_3
					{
					pushFollow(FOLLOW_rule__PrimitiveDataType__LONGAssignment_3_in_rule__PrimitiveDataType__Alternatives2675);
					rule__PrimitiveDataType__LONGAssignment_3();
					state._fsp--;

					}

					 after(grammarAccess.getPrimitiveDataTypeAccess().getLONGAssignment_3()); 
					}

					}
					break;
				case 5 :
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1269:6: ( ( rule__PrimitiveDataType__DOUBLEAssignment_4 ) )
					{
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1269:6: ( ( rule__PrimitiveDataType__DOUBLEAssignment_4 ) )
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1270:1: ( rule__PrimitiveDataType__DOUBLEAssignment_4 )
					{
					 before(grammarAccess.getPrimitiveDataTypeAccess().getDOUBLEAssignment_4()); 
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1271:2: ( rule__PrimitiveDataType__DOUBLEAssignment_4 )
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1271:2: rule__PrimitiveDataType__DOUBLEAssignment_4
					{
					pushFollow(FOLLOW_rule__PrimitiveDataType__DOUBLEAssignment_4_in_rule__PrimitiveDataType__Alternatives2693);
					rule__PrimitiveDataType__DOUBLEAssignment_4();
					state._fsp--;

					}

					 after(grammarAccess.getPrimitiveDataTypeAccess().getDOUBLEAssignment_4()); 
					}

					}
					break;
				case 6 :
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1275:6: ( ( rule__PrimitiveDataType__StructDefAssignment_5 ) )
					{
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1275:6: ( ( rule__PrimitiveDataType__StructDefAssignment_5 ) )
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1276:1: ( rule__PrimitiveDataType__StructDefAssignment_5 )
					{
					 before(grammarAccess.getPrimitiveDataTypeAccess().getStructDefAssignment_5()); 
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1277:2: ( rule__PrimitiveDataType__StructDefAssignment_5 )
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1277:2: rule__PrimitiveDataType__StructDefAssignment_5
					{
					pushFollow(FOLLOW_rule__PrimitiveDataType__StructDefAssignment_5_in_rule__PrimitiveDataType__Alternatives2711);
					rule__PrimitiveDataType__StructDefAssignment_5();
					state._fsp--;

					}

					 after(grammarAccess.getPrimitiveDataTypeAccess().getStructDefAssignment_5()); 
					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__PrimitiveDataType__Alternatives"



	// $ANTLR start "rule__DeploymentSpec__Group__0"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1288:1: rule__DeploymentSpec__Group__0 : rule__DeploymentSpec__Group__0__Impl rule__DeploymentSpec__Group__1 ;
	public final void rule__DeploymentSpec__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1292:2: ( rule__DeploymentSpec__Group__0__Impl rule__DeploymentSpec__Group__1 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1293:2: rule__DeploymentSpec__Group__0__Impl rule__DeploymentSpec__Group__1
			{
			pushFollow(FOLLOW_rule__DeploymentSpec__Group__0__Impl_in_rule__DeploymentSpec__Group__02742);
			rule__DeploymentSpec__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__DeploymentSpec__Group__1_in_rule__DeploymentSpec__Group__02745);
			rule__DeploymentSpec__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__DeploymentSpec__Group__0"



	// $ANTLR start "rule__DeploymentSpec__Group__0__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1300:1: rule__DeploymentSpec__Group__0__Impl : ( 'devices' ) ;
	public final void rule__DeploymentSpec__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1304:1: ( ( 'devices' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1305:1: ( 'devices' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1305:1: ( 'devices' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1306:1: 'devices'
			{
			 before(grammarAccess.getDeploymentSpecAccess().getDevicesKeyword_0()); 
			match(input,36,FOLLOW_36_in_rule__DeploymentSpec__Group__0__Impl2773); 
			 after(grammarAccess.getDeploymentSpecAccess().getDevicesKeyword_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__DeploymentSpec__Group__0__Impl"



	// $ANTLR start "rule__DeploymentSpec__Group__1"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1319:1: rule__DeploymentSpec__Group__1 : rule__DeploymentSpec__Group__1__Impl rule__DeploymentSpec__Group__2 ;
	public final void rule__DeploymentSpec__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1323:2: ( rule__DeploymentSpec__Group__1__Impl rule__DeploymentSpec__Group__2 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1324:2: rule__DeploymentSpec__Group__1__Impl rule__DeploymentSpec__Group__2
			{
			pushFollow(FOLLOW_rule__DeploymentSpec__Group__1__Impl_in_rule__DeploymentSpec__Group__12804);
			rule__DeploymentSpec__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__DeploymentSpec__Group__2_in_rule__DeploymentSpec__Group__12807);
			rule__DeploymentSpec__Group__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__DeploymentSpec__Group__1"



	// $ANTLR start "rule__DeploymentSpec__Group__1__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1331:1: rule__DeploymentSpec__Group__1__Impl : ( ':' ) ;
	public final void rule__DeploymentSpec__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1335:1: ( ( ':' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1336:1: ( ':' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1336:1: ( ':' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1337:1: ':'
			{
			 before(grammarAccess.getDeploymentSpecAccess().getColonKeyword_1()); 
			match(input,14,FOLLOW_14_in_rule__DeploymentSpec__Group__1__Impl2835); 
			 after(grammarAccess.getDeploymentSpecAccess().getColonKeyword_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__DeploymentSpec__Group__1__Impl"



	// $ANTLR start "rule__DeploymentSpec__Group__2"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1350:1: rule__DeploymentSpec__Group__2 : rule__DeploymentSpec__Group__2__Impl ;
	public final void rule__DeploymentSpec__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1354:2: ( rule__DeploymentSpec__Group__2__Impl )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1355:2: rule__DeploymentSpec__Group__2__Impl
			{
			pushFollow(FOLLOW_rule__DeploymentSpec__Group__2__Impl_in_rule__DeploymentSpec__Group__22866);
			rule__DeploymentSpec__Group__2__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__DeploymentSpec__Group__2"



	// $ANTLR start "rule__DeploymentSpec__Group__2__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1361:1: rule__DeploymentSpec__Group__2__Impl : ( ( ( rule__DeploymentSpec__DevicesAssignment_2 ) ) ( ( rule__DeploymentSpec__DevicesAssignment_2 )* ) ) ;
	public final void rule__DeploymentSpec__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1365:1: ( ( ( ( rule__DeploymentSpec__DevicesAssignment_2 ) ) ( ( rule__DeploymentSpec__DevicesAssignment_2 )* ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1366:1: ( ( ( rule__DeploymentSpec__DevicesAssignment_2 ) ) ( ( rule__DeploymentSpec__DevicesAssignment_2 )* ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1366:1: ( ( ( rule__DeploymentSpec__DevicesAssignment_2 ) ) ( ( rule__DeploymentSpec__DevicesAssignment_2 )* ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1367:1: ( ( rule__DeploymentSpec__DevicesAssignment_2 ) ) ( ( rule__DeploymentSpec__DevicesAssignment_2 )* )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1367:1: ( ( rule__DeploymentSpec__DevicesAssignment_2 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1368:1: ( rule__DeploymentSpec__DevicesAssignment_2 )
			{
			 before(grammarAccess.getDeploymentSpecAccess().getDevicesAssignment_2()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1369:2: ( rule__DeploymentSpec__DevicesAssignment_2 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1369:2: rule__DeploymentSpec__DevicesAssignment_2
			{
			pushFollow(FOLLOW_rule__DeploymentSpec__DevicesAssignment_2_in_rule__DeploymentSpec__Group__2__Impl2895);
			rule__DeploymentSpec__DevicesAssignment_2();
			state._fsp--;

			}

			 after(grammarAccess.getDeploymentSpecAccess().getDevicesAssignment_2()); 
			}

			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1372:1: ( ( rule__DeploymentSpec__DevicesAssignment_2 )* )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1373:1: ( rule__DeploymentSpec__DevicesAssignment_2 )*
			{
			 before(grammarAccess.getDeploymentSpecAccess().getDevicesAssignment_2()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1374:2: ( rule__DeploymentSpec__DevicesAssignment_2 )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==RULE_ID) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1374:2: rule__DeploymentSpec__DevicesAssignment_2
					{
					pushFollow(FOLLOW_rule__DeploymentSpec__DevicesAssignment_2_in_rule__DeploymentSpec__Group__2__Impl2907);
					rule__DeploymentSpec__DevicesAssignment_2();
					state._fsp--;

					}
					break;

				default :
					break loop5;
				}
			}

			 after(grammarAccess.getDeploymentSpecAccess().getDevicesAssignment_2()); 
			}

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__DeploymentSpec__Group__2__Impl"



	// $ANTLR start "rule__Device__Group__0"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1391:1: rule__Device__Group__0 : rule__Device__Group__0__Impl rule__Device__Group__1 ;
	public final void rule__Device__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1395:2: ( rule__Device__Group__0__Impl rule__Device__Group__1 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1396:2: rule__Device__Group__0__Impl rule__Device__Group__1
			{
			pushFollow(FOLLOW_rule__Device__Group__0__Impl_in_rule__Device__Group__02946);
			rule__Device__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Device__Group__1_in_rule__Device__Group__02949);
			rule__Device__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Device__Group__0"



	// $ANTLR start "rule__Device__Group__0__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1403:1: rule__Device__Group__0__Impl : ( ( rule__Device__DeviceNameAssignment_0 ) ) ;
	public final void rule__Device__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1407:1: ( ( ( rule__Device__DeviceNameAssignment_0 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1408:1: ( ( rule__Device__DeviceNameAssignment_0 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1408:1: ( ( rule__Device__DeviceNameAssignment_0 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1409:1: ( rule__Device__DeviceNameAssignment_0 )
			{
			 before(grammarAccess.getDeviceAccess().getDeviceNameAssignment_0()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1410:2: ( rule__Device__DeviceNameAssignment_0 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1410:2: rule__Device__DeviceNameAssignment_0
			{
			pushFollow(FOLLOW_rule__Device__DeviceNameAssignment_0_in_rule__Device__Group__0__Impl2976);
			rule__Device__DeviceNameAssignment_0();
			state._fsp--;

			}

			 after(grammarAccess.getDeviceAccess().getDeviceNameAssignment_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Device__Group__0__Impl"



	// $ANTLR start "rule__Device__Group__1"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1420:1: rule__Device__Group__1 : rule__Device__Group__1__Impl rule__Device__Group__2 ;
	public final void rule__Device__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1424:2: ( rule__Device__Group__1__Impl rule__Device__Group__2 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1425:2: rule__Device__Group__1__Impl rule__Device__Group__2
			{
			pushFollow(FOLLOW_rule__Device__Group__1__Impl_in_rule__Device__Group__13006);
			rule__Device__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Device__Group__2_in_rule__Device__Group__13009);
			rule__Device__Group__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Device__Group__1"



	// $ANTLR start "rule__Device__Group__1__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1432:1: rule__Device__Group__1__Impl : ( ':' ) ;
	public final void rule__Device__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1436:1: ( ( ':' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1437:1: ( ':' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1437:1: ( ':' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1438:1: ':'
			{
			 before(grammarAccess.getDeviceAccess().getColonKeyword_1()); 
			match(input,14,FOLLOW_14_in_rule__Device__Group__1__Impl3037); 
			 after(grammarAccess.getDeviceAccess().getColonKeyword_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Device__Group__1__Impl"



	// $ANTLR start "rule__Device__Group__2"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1451:1: rule__Device__Group__2 : rule__Device__Group__2__Impl rule__Device__Group__3 ;
	public final void rule__Device__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1455:2: ( rule__Device__Group__2__Impl rule__Device__Group__3 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1456:2: rule__Device__Group__2__Impl rule__Device__Group__3
			{
			pushFollow(FOLLOW_rule__Device__Group__2__Impl_in_rule__Device__Group__23068);
			rule__Device__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Device__Group__3_in_rule__Device__Group__23071);
			rule__Device__Group__3();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Device__Group__2"



	// $ANTLR start "rule__Device__Group__2__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1463:1: rule__Device__Group__2__Impl : ( 'location' ) ;
	public final void rule__Device__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1467:1: ( ( 'location' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1468:1: ( 'location' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1468:1: ( 'location' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1469:1: 'location'
			{
			 before(grammarAccess.getDeviceAccess().getLocationKeyword_2()); 
			match(input,42,FOLLOW_42_in_rule__Device__Group__2__Impl3099); 
			 after(grammarAccess.getDeviceAccess().getLocationKeyword_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Device__Group__2__Impl"



	// $ANTLR start "rule__Device__Group__3"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1482:1: rule__Device__Group__3 : rule__Device__Group__3__Impl rule__Device__Group__4 ;
	public final void rule__Device__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1486:2: ( rule__Device__Group__3__Impl rule__Device__Group__4 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1487:2: rule__Device__Group__3__Impl rule__Device__Group__4
			{
			pushFollow(FOLLOW_rule__Device__Group__3__Impl_in_rule__Device__Group__33130);
			rule__Device__Group__3__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Device__Group__4_in_rule__Device__Group__33133);
			rule__Device__Group__4();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Device__Group__3"



	// $ANTLR start "rule__Device__Group__3__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1494:1: rule__Device__Group__3__Impl : ( ':' ) ;
	public final void rule__Device__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1498:1: ( ( ':' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1499:1: ( ':' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1499:1: ( ':' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1500:1: ':'
			{
			 before(grammarAccess.getDeviceAccess().getColonKeyword_3()); 
			match(input,14,FOLLOW_14_in_rule__Device__Group__3__Impl3161); 
			 after(grammarAccess.getDeviceAccess().getColonKeyword_3()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Device__Group__3__Impl"



	// $ANTLR start "rule__Device__Group__4"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1513:1: rule__Device__Group__4 : rule__Device__Group__4__Impl rule__Device__Group__5 ;
	public final void rule__Device__Group__4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1517:2: ( rule__Device__Group__4__Impl rule__Device__Group__5 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1518:2: rule__Device__Group__4__Impl rule__Device__Group__5
			{
			pushFollow(FOLLOW_rule__Device__Group__4__Impl_in_rule__Device__Group__43192);
			rule__Device__Group__4__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Device__Group__5_in_rule__Device__Group__43195);
			rule__Device__Group__5();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Device__Group__4"



	// $ANTLR start "rule__Device__Group__4__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1525:1: rule__Device__Group__4__Impl : ( ( rule__Device__DeviceLocationAssignment_4 ) ) ;
	public final void rule__Device__Group__4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1529:1: ( ( ( rule__Device__DeviceLocationAssignment_4 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1530:1: ( ( rule__Device__DeviceLocationAssignment_4 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1530:1: ( ( rule__Device__DeviceLocationAssignment_4 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1531:1: ( rule__Device__DeviceLocationAssignment_4 )
			{
			 before(grammarAccess.getDeviceAccess().getDeviceLocationAssignment_4()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1532:2: ( rule__Device__DeviceLocationAssignment_4 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1532:2: rule__Device__DeviceLocationAssignment_4
			{
			pushFollow(FOLLOW_rule__Device__DeviceLocationAssignment_4_in_rule__Device__Group__4__Impl3222);
			rule__Device__DeviceLocationAssignment_4();
			state._fsp--;

			}

			 after(grammarAccess.getDeviceAccess().getDeviceLocationAssignment_4()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Device__Group__4__Impl"



	// $ANTLR start "rule__Device__Group__5"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1542:1: rule__Device__Group__5 : rule__Device__Group__5__Impl rule__Device__Group__6 ;
	public final void rule__Device__Group__5() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1546:2: ( rule__Device__Group__5__Impl rule__Device__Group__6 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1547:2: rule__Device__Group__5__Impl rule__Device__Group__6
			{
			pushFollow(FOLLOW_rule__Device__Group__5__Impl_in_rule__Device__Group__53252);
			rule__Device__Group__5__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Device__Group__6_in_rule__Device__Group__53255);
			rule__Device__Group__6();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Device__Group__5"



	// $ANTLR start "rule__Device__Group__5__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1554:1: rule__Device__Group__5__Impl : ( 'platform' ) ;
	public final void rule__Device__Group__5__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1558:1: ( ( 'platform' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1559:1: ( 'platform' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1559:1: ( 'platform' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1560:1: 'platform'
			{
			 before(grammarAccess.getDeviceAccess().getPlatformKeyword_5()); 
			match(input,49,FOLLOW_49_in_rule__Device__Group__5__Impl3283); 
			 after(grammarAccess.getDeviceAccess().getPlatformKeyword_5()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Device__Group__5__Impl"



	// $ANTLR start "rule__Device__Group__6"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1573:1: rule__Device__Group__6 : rule__Device__Group__6__Impl rule__Device__Group__7 ;
	public final void rule__Device__Group__6() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1577:2: ( rule__Device__Group__6__Impl rule__Device__Group__7 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1578:2: rule__Device__Group__6__Impl rule__Device__Group__7
			{
			pushFollow(FOLLOW_rule__Device__Group__6__Impl_in_rule__Device__Group__63314);
			rule__Device__Group__6__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Device__Group__7_in_rule__Device__Group__63317);
			rule__Device__Group__7();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Device__Group__6"



	// $ANTLR start "rule__Device__Group__6__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1585:1: rule__Device__Group__6__Impl : ( ':' ) ;
	public final void rule__Device__Group__6__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1589:1: ( ( ':' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1590:1: ( ':' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1590:1: ( ':' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1591:1: ':'
			{
			 before(grammarAccess.getDeviceAccess().getColonKeyword_6()); 
			match(input,14,FOLLOW_14_in_rule__Device__Group__6__Impl3345); 
			 after(grammarAccess.getDeviceAccess().getColonKeyword_6()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Device__Group__6__Impl"



	// $ANTLR start "rule__Device__Group__7"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1604:1: rule__Device__Group__7 : rule__Device__Group__7__Impl rule__Device__Group__8 ;
	public final void rule__Device__Group__7() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1608:2: ( rule__Device__Group__7__Impl rule__Device__Group__8 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1609:2: rule__Device__Group__7__Impl rule__Device__Group__8
			{
			pushFollow(FOLLOW_rule__Device__Group__7__Impl_in_rule__Device__Group__73376);
			rule__Device__Group__7__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Device__Group__8_in_rule__Device__Group__73379);
			rule__Device__Group__8();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Device__Group__7"



	// $ANTLR start "rule__Device__Group__7__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1616:1: rule__Device__Group__7__Impl : ( ( rule__Device__PlatformTypeAssignment_7 ) ) ;
	public final void rule__Device__Group__7__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1620:1: ( ( ( rule__Device__PlatformTypeAssignment_7 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1621:1: ( ( rule__Device__PlatformTypeAssignment_7 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1621:1: ( ( rule__Device__PlatformTypeAssignment_7 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1622:1: ( rule__Device__PlatformTypeAssignment_7 )
			{
			 before(grammarAccess.getDeviceAccess().getPlatformTypeAssignment_7()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1623:2: ( rule__Device__PlatformTypeAssignment_7 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1623:2: rule__Device__PlatformTypeAssignment_7
			{
			pushFollow(FOLLOW_rule__Device__PlatformTypeAssignment_7_in_rule__Device__Group__7__Impl3406);
			rule__Device__PlatformTypeAssignment_7();
			state._fsp--;

			}

			 after(grammarAccess.getDeviceAccess().getPlatformTypeAssignment_7()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Device__Group__7__Impl"



	// $ANTLR start "rule__Device__Group__8"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1633:1: rule__Device__Group__8 : rule__Device__Group__8__Impl rule__Device__Group__9 ;
	public final void rule__Device__Group__8() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1637:2: ( rule__Device__Group__8__Impl rule__Device__Group__9 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1638:2: rule__Device__Group__8__Impl rule__Device__Group__9
			{
			pushFollow(FOLLOW_rule__Device__Group__8__Impl_in_rule__Device__Group__83436);
			rule__Device__Group__8__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Device__Group__9_in_rule__Device__Group__83439);
			rule__Device__Group__9();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Device__Group__8"



	// $ANTLR start "rule__Device__Group__8__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1645:1: rule__Device__Group__8__Impl : ( ';' ) ;
	public final void rule__Device__Group__8__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1649:1: ( ( ';' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1650:1: ( ';' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1650:1: ( ';' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1651:1: ';'
			{
			 before(grammarAccess.getDeviceAccess().getSemicolonKeyword_8()); 
			match(input,15,FOLLOW_15_in_rule__Device__Group__8__Impl3467); 
			 after(grammarAccess.getDeviceAccess().getSemicolonKeyword_8()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Device__Group__8__Impl"



	// $ANTLR start "rule__Device__Group__9"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1664:1: rule__Device__Group__9 : rule__Device__Group__9__Impl rule__Device__Group__10 ;
	public final void rule__Device__Group__9() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1668:2: ( rule__Device__Group__9__Impl rule__Device__Group__10 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1669:2: rule__Device__Group__9__Impl rule__Device__Group__10
			{
			pushFollow(FOLLOW_rule__Device__Group__9__Impl_in_rule__Device__Group__93498);
			rule__Device__Group__9__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Device__Group__10_in_rule__Device__Group__93501);
			rule__Device__Group__10();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Device__Group__9"



	// $ANTLR start "rule__Device__Group__9__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1676:1: rule__Device__Group__9__Impl : ( 'resources' ) ;
	public final void rule__Device__Group__9__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1680:1: ( ( 'resources' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1681:1: ( 'resources' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1681:1: ( 'resources' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1682:1: 'resources'
			{
			 before(grammarAccess.getDeviceAccess().getResourcesKeyword_9()); 
			match(input,52,FOLLOW_52_in_rule__Device__Group__9__Impl3529); 
			 after(grammarAccess.getDeviceAccess().getResourcesKeyword_9()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Device__Group__9__Impl"



	// $ANTLR start "rule__Device__Group__10"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1695:1: rule__Device__Group__10 : rule__Device__Group__10__Impl rule__Device__Group__11 ;
	public final void rule__Device__Group__10() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1699:2: ( rule__Device__Group__10__Impl rule__Device__Group__11 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1700:2: rule__Device__Group__10__Impl rule__Device__Group__11
			{
			pushFollow(FOLLOW_rule__Device__Group__10__Impl_in_rule__Device__Group__103560);
			rule__Device__Group__10__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Device__Group__11_in_rule__Device__Group__103563);
			rule__Device__Group__11();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Device__Group__10"



	// $ANTLR start "rule__Device__Group__10__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1707:1: rule__Device__Group__10__Impl : ( ':' ) ;
	public final void rule__Device__Group__10__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1711:1: ( ( ':' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1712:1: ( ':' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1712:1: ( ':' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1713:1: ':'
			{
			 before(grammarAccess.getDeviceAccess().getColonKeyword_10()); 
			match(input,14,FOLLOW_14_in_rule__Device__Group__10__Impl3591); 
			 after(grammarAccess.getDeviceAccess().getColonKeyword_10()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Device__Group__10__Impl"



	// $ANTLR start "rule__Device__Group__11"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1726:1: rule__Device__Group__11 : rule__Device__Group__11__Impl rule__Device__Group__12 ;
	public final void rule__Device__Group__11() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1730:2: ( rule__Device__Group__11__Impl rule__Device__Group__12 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1731:2: rule__Device__Group__11__Impl rule__Device__Group__12
			{
			pushFollow(FOLLOW_rule__Device__Group__11__Impl_in_rule__Device__Group__113622);
			rule__Device__Group__11__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Device__Group__12_in_rule__Device__Group__113625);
			rule__Device__Group__12();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Device__Group__11"



	// $ANTLR start "rule__Device__Group__11__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1738:1: rule__Device__Group__11__Impl : ( ( rule__Device__DeviceAbilitiesAssignment_11 )? ) ;
	public final void rule__Device__Group__11__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1742:1: ( ( ( rule__Device__DeviceAbilitiesAssignment_11 )? ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1743:1: ( ( rule__Device__DeviceAbilitiesAssignment_11 )? )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1743:1: ( ( rule__Device__DeviceAbilitiesAssignment_11 )? )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1744:1: ( rule__Device__DeviceAbilitiesAssignment_11 )?
			{
			 before(grammarAccess.getDeviceAccess().getDeviceAbilitiesAssignment_11()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1745:2: ( rule__Device__DeviceAbilitiesAssignment_11 )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==RULE_ID) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1745:2: rule__Device__DeviceAbilitiesAssignment_11
					{
					pushFollow(FOLLOW_rule__Device__DeviceAbilitiesAssignment_11_in_rule__Device__Group__11__Impl3652);
					rule__Device__DeviceAbilitiesAssignment_11();
					state._fsp--;

					}
					break;

			}

			 after(grammarAccess.getDeviceAccess().getDeviceAbilitiesAssignment_11()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Device__Group__11__Impl"



	// $ANTLR start "rule__Device__Group__12"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1755:1: rule__Device__Group__12 : rule__Device__Group__12__Impl rule__Device__Group__13 ;
	public final void rule__Device__Group__12() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1759:2: ( rule__Device__Group__12__Impl rule__Device__Group__13 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1760:2: rule__Device__Group__12__Impl rule__Device__Group__13
			{
			pushFollow(FOLLOW_rule__Device__Group__12__Impl_in_rule__Device__Group__123683);
			rule__Device__Group__12__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Device__Group__13_in_rule__Device__Group__123686);
			rule__Device__Group__13();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Device__Group__12"



	// $ANTLR start "rule__Device__Group__12__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1767:1: rule__Device__Group__12__Impl : ( ';' ) ;
	public final void rule__Device__Group__12__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1771:1: ( ( ';' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1772:1: ( ';' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1772:1: ( ';' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1773:1: ';'
			{
			 before(grammarAccess.getDeviceAccess().getSemicolonKeyword_12()); 
			match(input,15,FOLLOW_15_in_rule__Device__Group__12__Impl3714); 
			 after(grammarAccess.getDeviceAccess().getSemicolonKeyword_12()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Device__Group__12__Impl"



	// $ANTLR start "rule__Device__Group__13"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1786:1: rule__Device__Group__13 : rule__Device__Group__13__Impl rule__Device__Group__14 ;
	public final void rule__Device__Group__13() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1790:2: ( rule__Device__Group__13__Impl rule__Device__Group__14 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1791:2: rule__Device__Group__13__Impl rule__Device__Group__14
			{
			pushFollow(FOLLOW_rule__Device__Group__13__Impl_in_rule__Device__Group__133745);
			rule__Device__Group__13__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Device__Group__14_in_rule__Device__Group__133748);
			rule__Device__Group__14();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Device__Group__13"



	// $ANTLR start "rule__Device__Group__13__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1798:1: rule__Device__Group__13__Impl : ( 'protocol' ) ;
	public final void rule__Device__Group__13__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1802:1: ( ( 'protocol' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1803:1: ( 'protocol' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1803:1: ( 'protocol' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1804:1: 'protocol'
			{
			 before(grammarAccess.getDeviceAccess().getProtocolKeyword_13()); 
			match(input,50,FOLLOW_50_in_rule__Device__Group__13__Impl3776); 
			 after(grammarAccess.getDeviceAccess().getProtocolKeyword_13()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Device__Group__13__Impl"



	// $ANTLR start "rule__Device__Group__14"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1817:1: rule__Device__Group__14 : rule__Device__Group__14__Impl rule__Device__Group__15 ;
	public final void rule__Device__Group__14() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1821:2: ( rule__Device__Group__14__Impl rule__Device__Group__15 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1822:2: rule__Device__Group__14__Impl rule__Device__Group__15
			{
			pushFollow(FOLLOW_rule__Device__Group__14__Impl_in_rule__Device__Group__143807);
			rule__Device__Group__14__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Device__Group__15_in_rule__Device__Group__143810);
			rule__Device__Group__15();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Device__Group__14"



	// $ANTLR start "rule__Device__Group__14__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1829:1: rule__Device__Group__14__Impl : ( ':' ) ;
	public final void rule__Device__Group__14__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1833:1: ( ( ':' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1834:1: ( ':' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1834:1: ( ':' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1835:1: ':'
			{
			 before(grammarAccess.getDeviceAccess().getColonKeyword_14()); 
			match(input,14,FOLLOW_14_in_rule__Device__Group__14__Impl3838); 
			 after(grammarAccess.getDeviceAccess().getColonKeyword_14()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Device__Group__14__Impl"



	// $ANTLR start "rule__Device__Group__15"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1848:1: rule__Device__Group__15 : rule__Device__Group__15__Impl rule__Device__Group__16 ;
	public final void rule__Device__Group__15() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1852:2: ( rule__Device__Group__15__Impl rule__Device__Group__16 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1853:2: rule__Device__Group__15__Impl rule__Device__Group__16
			{
			pushFollow(FOLLOW_rule__Device__Group__15__Impl_in_rule__Device__Group__153869);
			rule__Device__Group__15__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Device__Group__16_in_rule__Device__Group__153872);
			rule__Device__Group__16();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Device__Group__15"



	// $ANTLR start "rule__Device__Group__15__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1860:1: rule__Device__Group__15__Impl : ( ( rule__Device__DeviceProtocolAssignment_15 ) ) ;
	public final void rule__Device__Group__15__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1864:1: ( ( ( rule__Device__DeviceProtocolAssignment_15 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1865:1: ( ( rule__Device__DeviceProtocolAssignment_15 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1865:1: ( ( rule__Device__DeviceProtocolAssignment_15 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1866:1: ( rule__Device__DeviceProtocolAssignment_15 )
			{
			 before(grammarAccess.getDeviceAccess().getDeviceProtocolAssignment_15()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1867:2: ( rule__Device__DeviceProtocolAssignment_15 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1867:2: rule__Device__DeviceProtocolAssignment_15
			{
			pushFollow(FOLLOW_rule__Device__DeviceProtocolAssignment_15_in_rule__Device__Group__15__Impl3899);
			rule__Device__DeviceProtocolAssignment_15();
			state._fsp--;

			}

			 after(grammarAccess.getDeviceAccess().getDeviceProtocolAssignment_15()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Device__Group__15__Impl"



	// $ANTLR start "rule__Device__Group__16"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1877:1: rule__Device__Group__16 : rule__Device__Group__16__Impl rule__Device__Group__17 ;
	public final void rule__Device__Group__16() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1881:2: ( rule__Device__Group__16__Impl rule__Device__Group__17 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1882:2: rule__Device__Group__16__Impl rule__Device__Group__17
			{
			pushFollow(FOLLOW_rule__Device__Group__16__Impl_in_rule__Device__Group__163929);
			rule__Device__Group__16__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Device__Group__17_in_rule__Device__Group__163932);
			rule__Device__Group__17();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Device__Group__16"



	// $ANTLR start "rule__Device__Group__16__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1889:1: rule__Device__Group__16__Impl : ( ( rule__Device__Group_16__0 )* ) ;
	public final void rule__Device__Group__16__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1893:1: ( ( ( rule__Device__Group_16__0 )* ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1894:1: ( ( rule__Device__Group_16__0 )* )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1894:1: ( ( rule__Device__Group_16__0 )* )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1895:1: ( rule__Device__Group_16__0 )*
			{
			 before(grammarAccess.getDeviceAccess().getGroup_16()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1896:2: ( rule__Device__Group_16__0 )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==34) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1896:2: rule__Device__Group_16__0
					{
					pushFollow(FOLLOW_rule__Device__Group_16__0_in_rule__Device__Group__16__Impl3959);
					rule__Device__Group_16__0();
					state._fsp--;

					}
					break;

				default :
					break loop7;
				}
			}

			 after(grammarAccess.getDeviceAccess().getGroup_16()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Device__Group__16__Impl"



	// $ANTLR start "rule__Device__Group__17"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1906:1: rule__Device__Group__17 : rule__Device__Group__17__Impl rule__Device__Group__18 ;
	public final void rule__Device__Group__17() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1910:2: ( rule__Device__Group__17__Impl rule__Device__Group__18 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1911:2: rule__Device__Group__17__Impl rule__Device__Group__18
			{
			pushFollow(FOLLOW_rule__Device__Group__17__Impl_in_rule__Device__Group__173990);
			rule__Device__Group__17__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Device__Group__18_in_rule__Device__Group__173993);
			rule__Device__Group__18();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Device__Group__17"



	// $ANTLR start "rule__Device__Group__17__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1918:1: rule__Device__Group__17__Impl : ( 'description' ) ;
	public final void rule__Device__Group__17__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1922:1: ( ( 'description' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1923:1: ( 'description' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1923:1: ( 'description' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1924:1: 'description'
			{
			 before(grammarAccess.getDeviceAccess().getDescriptionKeyword_17()); 
			match(input,35,FOLLOW_35_in_rule__Device__Group__17__Impl4021); 
			 after(grammarAccess.getDeviceAccess().getDescriptionKeyword_17()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Device__Group__17__Impl"



	// $ANTLR start "rule__Device__Group__18"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1937:1: rule__Device__Group__18 : rule__Device__Group__18__Impl rule__Device__Group__19 ;
	public final void rule__Device__Group__18() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1941:2: ( rule__Device__Group__18__Impl rule__Device__Group__19 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1942:2: rule__Device__Group__18__Impl rule__Device__Group__19
			{
			pushFollow(FOLLOW_rule__Device__Group__18__Impl_in_rule__Device__Group__184052);
			rule__Device__Group__18__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Device__Group__19_in_rule__Device__Group__184055);
			rule__Device__Group__19();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Device__Group__18"



	// $ANTLR start "rule__Device__Group__18__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1949:1: rule__Device__Group__18__Impl : ( ':' ) ;
	public final void rule__Device__Group__18__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1953:1: ( ( ':' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1954:1: ( ':' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1954:1: ( ':' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1955:1: ':'
			{
			 before(grammarAccess.getDeviceAccess().getColonKeyword_18()); 
			match(input,14,FOLLOW_14_in_rule__Device__Group__18__Impl4083); 
			 after(grammarAccess.getDeviceAccess().getColonKeyword_18()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Device__Group__18__Impl"



	// $ANTLR start "rule__Device__Group__19"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1968:1: rule__Device__Group__19 : rule__Device__Group__19__Impl rule__Device__Group__20 ;
	public final void rule__Device__Group__19() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1972:2: ( rule__Device__Group__19__Impl rule__Device__Group__20 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1973:2: rule__Device__Group__19__Impl rule__Device__Group__20
			{
			pushFollow(FOLLOW_rule__Device__Group__19__Impl_in_rule__Device__Group__194114);
			rule__Device__Group__19__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Device__Group__20_in_rule__Device__Group__194117);
			rule__Device__Group__20();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Device__Group__19"



	// $ANTLR start "rule__Device__Group__19__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1980:1: rule__Device__Group__19__Impl : ( ( rule__Device__DeviceDescriptionAssignment_19 ) ) ;
	public final void rule__Device__Group__19__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1984:1: ( ( ( rule__Device__DeviceDescriptionAssignment_19 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1985:1: ( ( rule__Device__DeviceDescriptionAssignment_19 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1985:1: ( ( rule__Device__DeviceDescriptionAssignment_19 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1986:1: ( rule__Device__DeviceDescriptionAssignment_19 )
			{
			 before(grammarAccess.getDeviceAccess().getDeviceDescriptionAssignment_19()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1987:2: ( rule__Device__DeviceDescriptionAssignment_19 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1987:2: rule__Device__DeviceDescriptionAssignment_19
			{
			pushFollow(FOLLOW_rule__Device__DeviceDescriptionAssignment_19_in_rule__Device__Group__19__Impl4144);
			rule__Device__DeviceDescriptionAssignment_19();
			state._fsp--;

			}

			 after(grammarAccess.getDeviceAccess().getDeviceDescriptionAssignment_19()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Device__Group__19__Impl"



	// $ANTLR start "rule__Device__Group__20"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1997:1: rule__Device__Group__20 : rule__Device__Group__20__Impl ;
	public final void rule__Device__Group__20() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2001:2: ( rule__Device__Group__20__Impl )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2002:2: rule__Device__Group__20__Impl
			{
			pushFollow(FOLLOW_rule__Device__Group__20__Impl_in_rule__Device__Group__204174);
			rule__Device__Group__20__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Device__Group__20"



	// $ANTLR start "rule__Device__Group__20__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2008:1: rule__Device__Group__20__Impl : ( ';' ) ;
	public final void rule__Device__Group__20__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2012:1: ( ( ';' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2013:1: ( ';' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2013:1: ( ';' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2014:1: ';'
			{
			 before(grammarAccess.getDeviceAccess().getSemicolonKeyword_20()); 
			match(input,15,FOLLOW_15_in_rule__Device__Group__20__Impl4202); 
			 after(grammarAccess.getDeviceAccess().getSemicolonKeyword_20()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Device__Group__20__Impl"



	// $ANTLR start "rule__Device__Group_16__0"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2069:1: rule__Device__Group_16__0 : rule__Device__Group_16__0__Impl rule__Device__Group_16__1 ;
	public final void rule__Device__Group_16__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2073:2: ( rule__Device__Group_16__0__Impl rule__Device__Group_16__1 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2074:2: rule__Device__Group_16__0__Impl rule__Device__Group_16__1
			{
			pushFollow(FOLLOW_rule__Device__Group_16__0__Impl_in_rule__Device__Group_16__04275);
			rule__Device__Group_16__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Device__Group_16__1_in_rule__Device__Group_16__04278);
			rule__Device__Group_16__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Device__Group_16__0"



	// $ANTLR start "rule__Device__Group_16__0__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2081:1: rule__Device__Group_16__0__Impl : ( 'database' ) ;
	public final void rule__Device__Group_16__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2085:1: ( ( 'database' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2086:1: ( 'database' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2086:1: ( 'database' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2087:1: 'database'
			{
			 before(grammarAccess.getDeviceAccess().getDatabaseKeyword_16_0()); 
			match(input,34,FOLLOW_34_in_rule__Device__Group_16__0__Impl4306); 
			 after(grammarAccess.getDeviceAccess().getDatabaseKeyword_16_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Device__Group_16__0__Impl"



	// $ANTLR start "rule__Device__Group_16__1"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2100:1: rule__Device__Group_16__1 : rule__Device__Group_16__1__Impl rule__Device__Group_16__2 ;
	public final void rule__Device__Group_16__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2104:2: ( rule__Device__Group_16__1__Impl rule__Device__Group_16__2 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2105:2: rule__Device__Group_16__1__Impl rule__Device__Group_16__2
			{
			pushFollow(FOLLOW_rule__Device__Group_16__1__Impl_in_rule__Device__Group_16__14337);
			rule__Device__Group_16__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Device__Group_16__2_in_rule__Device__Group_16__14340);
			rule__Device__Group_16__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Device__Group_16__1"



	// $ANTLR start "rule__Device__Group_16__1__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2112:1: rule__Device__Group_16__1__Impl : ( ':' ) ;
	public final void rule__Device__Group_16__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2116:1: ( ( ':' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2117:1: ( ':' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2117:1: ( ':' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2118:1: ':'
			{
			 before(grammarAccess.getDeviceAccess().getColonKeyword_16_1()); 
			match(input,14,FOLLOW_14_in_rule__Device__Group_16__1__Impl4368); 
			 after(grammarAccess.getDeviceAccess().getColonKeyword_16_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Device__Group_16__1__Impl"



	// $ANTLR start "rule__Device__Group_16__2"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2131:1: rule__Device__Group_16__2 : rule__Device__Group_16__2__Impl rule__Device__Group_16__3 ;
	public final void rule__Device__Group_16__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2135:2: ( rule__Device__Group_16__2__Impl rule__Device__Group_16__3 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2136:2: rule__Device__Group_16__2__Impl rule__Device__Group_16__3
			{
			pushFollow(FOLLOW_rule__Device__Group_16__2__Impl_in_rule__Device__Group_16__24399);
			rule__Device__Group_16__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Device__Group_16__3_in_rule__Device__Group_16__24402);
			rule__Device__Group_16__3();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Device__Group_16__2"



	// $ANTLR start "rule__Device__Group_16__2__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2143:1: rule__Device__Group_16__2__Impl : ( ( rule__Device__DatabaseNameAssignment_16_2 ) ) ;
	public final void rule__Device__Group_16__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2147:1: ( ( ( rule__Device__DatabaseNameAssignment_16_2 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2148:1: ( ( rule__Device__DatabaseNameAssignment_16_2 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2148:1: ( ( rule__Device__DatabaseNameAssignment_16_2 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2149:1: ( rule__Device__DatabaseNameAssignment_16_2 )
			{
			 before(grammarAccess.getDeviceAccess().getDatabaseNameAssignment_16_2()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2150:2: ( rule__Device__DatabaseNameAssignment_16_2 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2150:2: rule__Device__DatabaseNameAssignment_16_2
			{
			pushFollow(FOLLOW_rule__Device__DatabaseNameAssignment_16_2_in_rule__Device__Group_16__2__Impl4429);
			rule__Device__DatabaseNameAssignment_16_2();
			state._fsp--;

			}

			 after(grammarAccess.getDeviceAccess().getDatabaseNameAssignment_16_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Device__Group_16__2__Impl"



	// $ANTLR start "rule__Device__Group_16__3"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2160:1: rule__Device__Group_16__3 : rule__Device__Group_16__3__Impl ;
	public final void rule__Device__Group_16__3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2164:2: ( rule__Device__Group_16__3__Impl )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2165:2: rule__Device__Group_16__3__Impl
			{
			pushFollow(FOLLOW_rule__Device__Group_16__3__Impl_in_rule__Device__Group_16__34459);
			rule__Device__Group_16__3__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Device__Group_16__3"



	// $ANTLR start "rule__Device__Group_16__3__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2171:1: rule__Device__Group_16__3__Impl : ( ';' ) ;
	public final void rule__Device__Group_16__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2175:1: ( ( ';' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2176:1: ( ';' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2176:1: ( ';' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2177:1: ';'
			{
			 before(grammarAccess.getDeviceAccess().getSemicolonKeyword_16_3()); 
			match(input,15,FOLLOW_15_in_rule__Device__Group_16__3__Impl4487); 
			 after(grammarAccess.getDeviceAccess().getSemicolonKeyword_16_3()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Device__Group_16__3__Impl"



	// $ANTLR start "rule__DeviceLocation__Group__0"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2198:1: rule__DeviceLocation__Group__0 : rule__DeviceLocation__Group__0__Impl rule__DeviceLocation__Group__1 ;
	public final void rule__DeviceLocation__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2202:2: ( rule__DeviceLocation__Group__0__Impl rule__DeviceLocation__Group__1 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2203:2: rule__DeviceLocation__Group__0__Impl rule__DeviceLocation__Group__1
			{
			pushFollow(FOLLOW_rule__DeviceLocation__Group__0__Impl_in_rule__DeviceLocation__Group__04526);
			rule__DeviceLocation__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__DeviceLocation__Group__1_in_rule__DeviceLocation__Group__04529);
			rule__DeviceLocation__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__DeviceLocation__Group__0"



	// $ANTLR start "rule__DeviceLocation__Group__0__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2210:1: rule__DeviceLocation__Group__0__Impl : ( ( rule__DeviceLocation__RegionLabelAssignment_0 ) ) ;
	public final void rule__DeviceLocation__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2214:1: ( ( ( rule__DeviceLocation__RegionLabelAssignment_0 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2215:1: ( ( rule__DeviceLocation__RegionLabelAssignment_0 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2215:1: ( ( rule__DeviceLocation__RegionLabelAssignment_0 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2216:1: ( rule__DeviceLocation__RegionLabelAssignment_0 )
			{
			 before(grammarAccess.getDeviceLocationAccess().getRegionLabelAssignment_0()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2217:2: ( rule__DeviceLocation__RegionLabelAssignment_0 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2217:2: rule__DeviceLocation__RegionLabelAssignment_0
			{
			pushFollow(FOLLOW_rule__DeviceLocation__RegionLabelAssignment_0_in_rule__DeviceLocation__Group__0__Impl4556);
			rule__DeviceLocation__RegionLabelAssignment_0();
			state._fsp--;

			}

			 after(grammarAccess.getDeviceLocationAccess().getRegionLabelAssignment_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__DeviceLocation__Group__0__Impl"



	// $ANTLR start "rule__DeviceLocation__Group__1"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2227:1: rule__DeviceLocation__Group__1 : rule__DeviceLocation__Group__1__Impl rule__DeviceLocation__Group__2 ;
	public final void rule__DeviceLocation__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2231:2: ( rule__DeviceLocation__Group__1__Impl rule__DeviceLocation__Group__2 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2232:2: rule__DeviceLocation__Group__1__Impl rule__DeviceLocation__Group__2
			{
			pushFollow(FOLLOW_rule__DeviceLocation__Group__1__Impl_in_rule__DeviceLocation__Group__14586);
			rule__DeviceLocation__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__DeviceLocation__Group__2_in_rule__DeviceLocation__Group__14589);
			rule__DeviceLocation__Group__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__DeviceLocation__Group__1"



	// $ANTLR start "rule__DeviceLocation__Group__1__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2239:1: rule__DeviceLocation__Group__1__Impl : ( ':' ) ;
	public final void rule__DeviceLocation__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2243:1: ( ( ':' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2244:1: ( ':' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2244:1: ( ':' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2245:1: ':'
			{
			 before(grammarAccess.getDeviceLocationAccess().getColonKeyword_1()); 
			match(input,14,FOLLOW_14_in_rule__DeviceLocation__Group__1__Impl4617); 
			 after(grammarAccess.getDeviceLocationAccess().getColonKeyword_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__DeviceLocation__Group__1__Impl"



	// $ANTLR start "rule__DeviceLocation__Group__2"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2258:1: rule__DeviceLocation__Group__2 : rule__DeviceLocation__Group__2__Impl rule__DeviceLocation__Group__3 ;
	public final void rule__DeviceLocation__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2262:2: ( rule__DeviceLocation__Group__2__Impl rule__DeviceLocation__Group__3 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2263:2: rule__DeviceLocation__Group__2__Impl rule__DeviceLocation__Group__3
			{
			pushFollow(FOLLOW_rule__DeviceLocation__Group__2__Impl_in_rule__DeviceLocation__Group__24648);
			rule__DeviceLocation__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__DeviceLocation__Group__3_in_rule__DeviceLocation__Group__24651);
			rule__DeviceLocation__Group__3();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__DeviceLocation__Group__2"



	// $ANTLR start "rule__DeviceLocation__Group__2__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2270:1: rule__DeviceLocation__Group__2__Impl : ( ( rule__DeviceLocation__RegionValueAssignment_2 ) ) ;
	public final void rule__DeviceLocation__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2274:1: ( ( ( rule__DeviceLocation__RegionValueAssignment_2 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2275:1: ( ( rule__DeviceLocation__RegionValueAssignment_2 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2275:1: ( ( rule__DeviceLocation__RegionValueAssignment_2 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2276:1: ( rule__DeviceLocation__RegionValueAssignment_2 )
			{
			 before(grammarAccess.getDeviceLocationAccess().getRegionValueAssignment_2()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2277:2: ( rule__DeviceLocation__RegionValueAssignment_2 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2277:2: rule__DeviceLocation__RegionValueAssignment_2
			{
			pushFollow(FOLLOW_rule__DeviceLocation__RegionValueAssignment_2_in_rule__DeviceLocation__Group__2__Impl4678);
			rule__DeviceLocation__RegionValueAssignment_2();
			state._fsp--;

			}

			 after(grammarAccess.getDeviceLocationAccess().getRegionValueAssignment_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__DeviceLocation__Group__2__Impl"



	// $ANTLR start "rule__DeviceLocation__Group__3"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2287:1: rule__DeviceLocation__Group__3 : rule__DeviceLocation__Group__3__Impl ;
	public final void rule__DeviceLocation__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2291:2: ( rule__DeviceLocation__Group__3__Impl )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2292:2: rule__DeviceLocation__Group__3__Impl
			{
			pushFollow(FOLLOW_rule__DeviceLocation__Group__3__Impl_in_rule__DeviceLocation__Group__34708);
			rule__DeviceLocation__Group__3__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__DeviceLocation__Group__3"



	// $ANTLR start "rule__DeviceLocation__Group__3__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2298:1: rule__DeviceLocation__Group__3__Impl : ( ';' ) ;
	public final void rule__DeviceLocation__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2302:1: ( ( ';' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2303:1: ( ';' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2303:1: ( ';' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2304:1: ';'
			{
			 before(grammarAccess.getDeviceLocationAccess().getSemicolonKeyword_3()); 
			match(input,15,FOLLOW_15_in_rule__DeviceLocation__Group__3__Impl4736); 
			 after(grammarAccess.getDeviceLocationAccess().getSemicolonKeyword_3()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__DeviceLocation__Group__3__Impl"



	// $ANTLR start "rule__DeviceProtocol__Group__0"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2325:1: rule__DeviceProtocol__Group__0 : rule__DeviceProtocol__Group__0__Impl rule__DeviceProtocol__Group__1 ;
	public final void rule__DeviceProtocol__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2329:2: ( rule__DeviceProtocol__Group__0__Impl rule__DeviceProtocol__Group__1 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2330:2: rule__DeviceProtocol__Group__0__Impl rule__DeviceProtocol__Group__1
			{
			pushFollow(FOLLOW_rule__DeviceProtocol__Group__0__Impl_in_rule__DeviceProtocol__Group__04775);
			rule__DeviceProtocol__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__DeviceProtocol__Group__1_in_rule__DeviceProtocol__Group__04778);
			rule__DeviceProtocol__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__DeviceProtocol__Group__0"



	// $ANTLR start "rule__DeviceProtocol__Group__0__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2337:1: rule__DeviceProtocol__Group__0__Impl : ( ( rule__DeviceProtocol__ProtocolNameAssignment_0 ) ) ;
	public final void rule__DeviceProtocol__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2341:1: ( ( ( rule__DeviceProtocol__ProtocolNameAssignment_0 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2342:1: ( ( rule__DeviceProtocol__ProtocolNameAssignment_0 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2342:1: ( ( rule__DeviceProtocol__ProtocolNameAssignment_0 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2343:1: ( rule__DeviceProtocol__ProtocolNameAssignment_0 )
			{
			 before(grammarAccess.getDeviceProtocolAccess().getProtocolNameAssignment_0()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2344:2: ( rule__DeviceProtocol__ProtocolNameAssignment_0 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2344:2: rule__DeviceProtocol__ProtocolNameAssignment_0
			{
			pushFollow(FOLLOW_rule__DeviceProtocol__ProtocolNameAssignment_0_in_rule__DeviceProtocol__Group__0__Impl4805);
			rule__DeviceProtocol__ProtocolNameAssignment_0();
			state._fsp--;

			}

			 after(grammarAccess.getDeviceProtocolAccess().getProtocolNameAssignment_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__DeviceProtocol__Group__0__Impl"



	// $ANTLR start "rule__DeviceProtocol__Group__1"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2354:1: rule__DeviceProtocol__Group__1 : rule__DeviceProtocol__Group__1__Impl ;
	public final void rule__DeviceProtocol__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2358:2: ( rule__DeviceProtocol__Group__1__Impl )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2359:2: rule__DeviceProtocol__Group__1__Impl
			{
			pushFollow(FOLLOW_rule__DeviceProtocol__Group__1__Impl_in_rule__DeviceProtocol__Group__14835);
			rule__DeviceProtocol__Group__1__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__DeviceProtocol__Group__1"



	// $ANTLR start "rule__DeviceProtocol__Group__1__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2365:1: rule__DeviceProtocol__Group__1__Impl : ( ';' ) ;
	public final void rule__DeviceProtocol__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2369:1: ( ( ';' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2370:1: ( ';' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2370:1: ( ';' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2371:1: ';'
			{
			 before(grammarAccess.getDeviceProtocolAccess().getSemicolonKeyword_1()); 
			match(input,15,FOLLOW_15_in_rule__DeviceProtocol__Group__1__Impl4863); 
			 after(grammarAccess.getDeviceProtocolAccess().getSemicolonKeyword_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__DeviceProtocol__Group__1__Impl"



	// $ANTLR start "rule__DeviceAbilities__Group__0"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2388:1: rule__DeviceAbilities__Group__0 : rule__DeviceAbilities__Group__0__Impl rule__DeviceAbilities__Group__1 ;
	public final void rule__DeviceAbilities__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2392:2: ( rule__DeviceAbilities__Group__0__Impl rule__DeviceAbilities__Group__1 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2393:2: rule__DeviceAbilities__Group__0__Impl rule__DeviceAbilities__Group__1
			{
			pushFollow(FOLLOW_rule__DeviceAbilities__Group__0__Impl_in_rule__DeviceAbilities__Group__04898);
			rule__DeviceAbilities__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__DeviceAbilities__Group__1_in_rule__DeviceAbilities__Group__04901);
			rule__DeviceAbilities__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__DeviceAbilities__Group__0"



	// $ANTLR start "rule__DeviceAbilities__Group__0__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2400:1: rule__DeviceAbilities__Group__0__Impl : ( ( rule__DeviceAbilities__DeviceEntityNameAssignment_0 ) ) ;
	public final void rule__DeviceAbilities__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2404:1: ( ( ( rule__DeviceAbilities__DeviceEntityNameAssignment_0 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2405:1: ( ( rule__DeviceAbilities__DeviceEntityNameAssignment_0 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2405:1: ( ( rule__DeviceAbilities__DeviceEntityNameAssignment_0 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2406:1: ( rule__DeviceAbilities__DeviceEntityNameAssignment_0 )
			{
			 before(grammarAccess.getDeviceAbilitiesAccess().getDeviceEntityNameAssignment_0()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2407:2: ( rule__DeviceAbilities__DeviceEntityNameAssignment_0 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2407:2: rule__DeviceAbilities__DeviceEntityNameAssignment_0
			{
			pushFollow(FOLLOW_rule__DeviceAbilities__DeviceEntityNameAssignment_0_in_rule__DeviceAbilities__Group__0__Impl4928);
			rule__DeviceAbilities__DeviceEntityNameAssignment_0();
			state._fsp--;

			}

			 after(grammarAccess.getDeviceAbilitiesAccess().getDeviceEntityNameAssignment_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__DeviceAbilities__Group__0__Impl"



	// $ANTLR start "rule__DeviceAbilities__Group__1"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2417:1: rule__DeviceAbilities__Group__1 : rule__DeviceAbilities__Group__1__Impl ;
	public final void rule__DeviceAbilities__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2421:2: ( rule__DeviceAbilities__Group__1__Impl )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2422:2: rule__DeviceAbilities__Group__1__Impl
			{
			pushFollow(FOLLOW_rule__DeviceAbilities__Group__1__Impl_in_rule__DeviceAbilities__Group__14958);
			rule__DeviceAbilities__Group__1__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__DeviceAbilities__Group__1"



	// $ANTLR start "rule__DeviceAbilities__Group__1__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2428:1: rule__DeviceAbilities__Group__1__Impl : ( ( rule__DeviceAbilities__Group_1__0 )? ) ;
	public final void rule__DeviceAbilities__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2432:1: ( ( ( rule__DeviceAbilities__Group_1__0 )? ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2433:1: ( ( rule__DeviceAbilities__Group_1__0 )? )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2433:1: ( ( rule__DeviceAbilities__Group_1__0 )? )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2434:1: ( rule__DeviceAbilities__Group_1__0 )?
			{
			 before(grammarAccess.getDeviceAbilitiesAccess().getGroup_1()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2435:2: ( rule__DeviceAbilities__Group_1__0 )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==13) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2435:2: rule__DeviceAbilities__Group_1__0
					{
					pushFollow(FOLLOW_rule__DeviceAbilities__Group_1__0_in_rule__DeviceAbilities__Group__1__Impl4985);
					rule__DeviceAbilities__Group_1__0();
					state._fsp--;

					}
					break;

			}

			 after(grammarAccess.getDeviceAbilitiesAccess().getGroup_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__DeviceAbilities__Group__1__Impl"



	// $ANTLR start "rule__DeviceAbilities__Group_1__0"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2449:1: rule__DeviceAbilities__Group_1__0 : rule__DeviceAbilities__Group_1__0__Impl rule__DeviceAbilities__Group_1__1 ;
	public final void rule__DeviceAbilities__Group_1__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2453:2: ( rule__DeviceAbilities__Group_1__0__Impl rule__DeviceAbilities__Group_1__1 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2454:2: rule__DeviceAbilities__Group_1__0__Impl rule__DeviceAbilities__Group_1__1
			{
			pushFollow(FOLLOW_rule__DeviceAbilities__Group_1__0__Impl_in_rule__DeviceAbilities__Group_1__05020);
			rule__DeviceAbilities__Group_1__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__DeviceAbilities__Group_1__1_in_rule__DeviceAbilities__Group_1__05023);
			rule__DeviceAbilities__Group_1__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__DeviceAbilities__Group_1__0"



	// $ANTLR start "rule__DeviceAbilities__Group_1__0__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2461:1: rule__DeviceAbilities__Group_1__0__Impl : ( ',' ) ;
	public final void rule__DeviceAbilities__Group_1__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2465:1: ( ( ',' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2466:1: ( ',' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2466:1: ( ',' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2467:1: ','
			{
			 before(grammarAccess.getDeviceAbilitiesAccess().getCommaKeyword_1_0()); 
			match(input,13,FOLLOW_13_in_rule__DeviceAbilities__Group_1__0__Impl5051); 
			 after(grammarAccess.getDeviceAbilitiesAccess().getCommaKeyword_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__DeviceAbilities__Group_1__0__Impl"



	// $ANTLR start "rule__DeviceAbilities__Group_1__1"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2480:1: rule__DeviceAbilities__Group_1__1 : rule__DeviceAbilities__Group_1__1__Impl ;
	public final void rule__DeviceAbilities__Group_1__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2484:2: ( rule__DeviceAbilities__Group_1__1__Impl )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:2: rule__DeviceAbilities__Group_1__1__Impl
			{
			pushFollow(FOLLOW_rule__DeviceAbilities__Group_1__1__Impl_in_rule__DeviceAbilities__Group_1__15082);
			rule__DeviceAbilities__Group_1__1__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__DeviceAbilities__Group_1__1"



	// $ANTLR start "rule__DeviceAbilities__Group_1__1__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2491:1: rule__DeviceAbilities__Group_1__1__Impl : ( ( rule__DeviceAbilities__NameAssignment_1_1 ) ) ;
	public final void rule__DeviceAbilities__Group_1__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:1: ( ( ( rule__DeviceAbilities__NameAssignment_1_1 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2496:1: ( ( rule__DeviceAbilities__NameAssignment_1_1 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2496:1: ( ( rule__DeviceAbilities__NameAssignment_1_1 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:1: ( rule__DeviceAbilities__NameAssignment_1_1 )
			{
			 before(grammarAccess.getDeviceAbilitiesAccess().getNameAssignment_1_1()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2498:2: ( rule__DeviceAbilities__NameAssignment_1_1 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2498:2: rule__DeviceAbilities__NameAssignment_1_1
			{
			pushFollow(FOLLOW_rule__DeviceAbilities__NameAssignment_1_1_in_rule__DeviceAbilities__Group_1__1__Impl5109);
			rule__DeviceAbilities__NameAssignment_1_1();
			state._fsp--;

			}

			 after(grammarAccess.getDeviceAbilitiesAccess().getNameAssignment_1_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__DeviceAbilities__Group_1__1__Impl"



	// $ANTLR start "rule__InteractionSpec__Group__0"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2512:1: rule__InteractionSpec__Group__0 : rule__InteractionSpec__Group__0__Impl rule__InteractionSpec__Group__1 ;
	public final void rule__InteractionSpec__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2516:2: ( rule__InteractionSpec__Group__0__Impl rule__InteractionSpec__Group__1 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2517:2: rule__InteractionSpec__Group__0__Impl rule__InteractionSpec__Group__1
			{
			pushFollow(FOLLOW_rule__InteractionSpec__Group__0__Impl_in_rule__InteractionSpec__Group__05143);
			rule__InteractionSpec__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__InteractionSpec__Group__1_in_rule__InteractionSpec__Group__05146);
			rule__InteractionSpec__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InteractionSpec__Group__0"



	// $ANTLR start "rule__InteractionSpec__Group__0__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2524:1: rule__InteractionSpec__Group__0__Impl : ( 'resources' ) ;
	public final void rule__InteractionSpec__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2528:1: ( ( 'resources' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2529:1: ( 'resources' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2529:1: ( 'resources' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2530:1: 'resources'
			{
			 before(grammarAccess.getInteractionSpecAccess().getResourcesKeyword_0()); 
			match(input,52,FOLLOW_52_in_rule__InteractionSpec__Group__0__Impl5174); 
			 after(grammarAccess.getInteractionSpecAccess().getResourcesKeyword_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InteractionSpec__Group__0__Impl"



	// $ANTLR start "rule__InteractionSpec__Group__1"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2543:1: rule__InteractionSpec__Group__1 : rule__InteractionSpec__Group__1__Impl rule__InteractionSpec__Group__2 ;
	public final void rule__InteractionSpec__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2547:2: ( rule__InteractionSpec__Group__1__Impl rule__InteractionSpec__Group__2 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2548:2: rule__InteractionSpec__Group__1__Impl rule__InteractionSpec__Group__2
			{
			pushFollow(FOLLOW_rule__InteractionSpec__Group__1__Impl_in_rule__InteractionSpec__Group__15205);
			rule__InteractionSpec__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__InteractionSpec__Group__2_in_rule__InteractionSpec__Group__15208);
			rule__InteractionSpec__Group__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InteractionSpec__Group__1"



	// $ANTLR start "rule__InteractionSpec__Group__1__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2555:1: rule__InteractionSpec__Group__1__Impl : ( ':' ) ;
	public final void rule__InteractionSpec__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2559:1: ( ( ':' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2560:1: ( ':' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2560:1: ( ':' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2561:1: ':'
			{
			 before(grammarAccess.getInteractionSpecAccess().getColonKeyword_1()); 
			match(input,14,FOLLOW_14_in_rule__InteractionSpec__Group__1__Impl5236); 
			 after(grammarAccess.getInteractionSpecAccess().getColonKeyword_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InteractionSpec__Group__1__Impl"



	// $ANTLR start "rule__InteractionSpec__Group__2"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2574:1: rule__InteractionSpec__Group__2 : rule__InteractionSpec__Group__2__Impl rule__InteractionSpec__Group__3 ;
	public final void rule__InteractionSpec__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2578:2: ( rule__InteractionSpec__Group__2__Impl rule__InteractionSpec__Group__3 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2579:2: rule__InteractionSpec__Group__2__Impl rule__InteractionSpec__Group__3
			{
			pushFollow(FOLLOW_rule__InteractionSpec__Group__2__Impl_in_rule__InteractionSpec__Group__25267);
			rule__InteractionSpec__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__InteractionSpec__Group__3_in_rule__InteractionSpec__Group__25270);
			rule__InteractionSpec__Group__3();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InteractionSpec__Group__2"



	// $ANTLR start "rule__InteractionSpec__Group__2__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2586:1: rule__InteractionSpec__Group__2__Impl : ( 'userInteractions' ) ;
	public final void rule__InteractionSpec__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2590:1: ( ( 'userInteractions' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2591:1: ( 'userInteractions' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2591:1: ( 'userInteractions' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2592:1: 'userInteractions'
			{
			 before(grammarAccess.getInteractionSpecAccess().getUserInteractionsKeyword_2()); 
			match(input,59,FOLLOW_59_in_rule__InteractionSpec__Group__2__Impl5298); 
			 after(grammarAccess.getInteractionSpecAccess().getUserInteractionsKeyword_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InteractionSpec__Group__2__Impl"



	// $ANTLR start "rule__InteractionSpec__Group__3"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2605:1: rule__InteractionSpec__Group__3 : rule__InteractionSpec__Group__3__Impl rule__InteractionSpec__Group__4 ;
	public final void rule__InteractionSpec__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2609:2: ( rule__InteractionSpec__Group__3__Impl rule__InteractionSpec__Group__4 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2610:2: rule__InteractionSpec__Group__3__Impl rule__InteractionSpec__Group__4
			{
			pushFollow(FOLLOW_rule__InteractionSpec__Group__3__Impl_in_rule__InteractionSpec__Group__35329);
			rule__InteractionSpec__Group__3__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__InteractionSpec__Group__4_in_rule__InteractionSpec__Group__35332);
			rule__InteractionSpec__Group__4();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InteractionSpec__Group__3"



	// $ANTLR start "rule__InteractionSpec__Group__3__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2617:1: rule__InteractionSpec__Group__3__Impl : ( ':' ) ;
	public final void rule__InteractionSpec__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2621:1: ( ( ':' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2622:1: ( ':' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2622:1: ( ':' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2623:1: ':'
			{
			 before(grammarAccess.getInteractionSpecAccess().getColonKeyword_3()); 
			match(input,14,FOLLOW_14_in_rule__InteractionSpec__Group__3__Impl5360); 
			 after(grammarAccess.getInteractionSpecAccess().getColonKeyword_3()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InteractionSpec__Group__3__Impl"



	// $ANTLR start "rule__InteractionSpec__Group__4"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2636:1: rule__InteractionSpec__Group__4 : rule__InteractionSpec__Group__4__Impl rule__InteractionSpec__Group__5 ;
	public final void rule__InteractionSpec__Group__4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2640:2: ( rule__InteractionSpec__Group__4__Impl rule__InteractionSpec__Group__5 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2641:2: rule__InteractionSpec__Group__4__Impl rule__InteractionSpec__Group__5
			{
			pushFollow(FOLLOW_rule__InteractionSpec__Group__4__Impl_in_rule__InteractionSpec__Group__45391);
			rule__InteractionSpec__Group__4__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__InteractionSpec__Group__5_in_rule__InteractionSpec__Group__45394);
			rule__InteractionSpec__Group__5();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InteractionSpec__Group__4"



	// $ANTLR start "rule__InteractionSpec__Group__4__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2648:1: rule__InteractionSpec__Group__4__Impl : ( ( rule__InteractionSpec__InteractionNameAssignment_4 ) ) ;
	public final void rule__InteractionSpec__Group__4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2652:1: ( ( ( rule__InteractionSpec__InteractionNameAssignment_4 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2653:1: ( ( rule__InteractionSpec__InteractionNameAssignment_4 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2653:1: ( ( rule__InteractionSpec__InteractionNameAssignment_4 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2654:1: ( rule__InteractionSpec__InteractionNameAssignment_4 )
			{
			 before(grammarAccess.getInteractionSpecAccess().getInteractionNameAssignment_4()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2655:2: ( rule__InteractionSpec__InteractionNameAssignment_4 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2655:2: rule__InteractionSpec__InteractionNameAssignment_4
			{
			pushFollow(FOLLOW_rule__InteractionSpec__InteractionNameAssignment_4_in_rule__InteractionSpec__Group__4__Impl5421);
			rule__InteractionSpec__InteractionNameAssignment_4();
			state._fsp--;

			}

			 after(grammarAccess.getInteractionSpecAccess().getInteractionNameAssignment_4()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InteractionSpec__Group__4__Impl"



	// $ANTLR start "rule__InteractionSpec__Group__5"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2665:1: rule__InteractionSpec__Group__5 : rule__InteractionSpec__Group__5__Impl rule__InteractionSpec__Group__6 ;
	public final void rule__InteractionSpec__Group__5() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2669:2: ( rule__InteractionSpec__Group__5__Impl rule__InteractionSpec__Group__6 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2670:2: rule__InteractionSpec__Group__5__Impl rule__InteractionSpec__Group__6
			{
			pushFollow(FOLLOW_rule__InteractionSpec__Group__5__Impl_in_rule__InteractionSpec__Group__55451);
			rule__InteractionSpec__Group__5__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__InteractionSpec__Group__6_in_rule__InteractionSpec__Group__55454);
			rule__InteractionSpec__Group__6();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InteractionSpec__Group__5"



	// $ANTLR start "rule__InteractionSpec__Group__5__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2677:1: rule__InteractionSpec__Group__5__Impl : ( ( rule__InteractionSpec__InteractionCommandAssignment_5 )* ) ;
	public final void rule__InteractionSpec__Group__5__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2681:1: ( ( ( rule__InteractionSpec__InteractionCommandAssignment_5 )* ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2682:1: ( ( rule__InteractionSpec__InteractionCommandAssignment_5 )* )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2682:1: ( ( rule__InteractionSpec__InteractionCommandAssignment_5 )* )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2683:1: ( rule__InteractionSpec__InteractionCommandAssignment_5 )*
			{
			 before(grammarAccess.getInteractionSpecAccess().getInteractionCommandAssignment_5()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2684:2: ( rule__InteractionSpec__InteractionCommandAssignment_5 )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==31) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2684:2: rule__InteractionSpec__InteractionCommandAssignment_5
					{
					pushFollow(FOLLOW_rule__InteractionSpec__InteractionCommandAssignment_5_in_rule__InteractionSpec__Group__5__Impl5481);
					rule__InteractionSpec__InteractionCommandAssignment_5();
					state._fsp--;

					}
					break;

				default :
					break loop9;
				}
			}

			 after(grammarAccess.getInteractionSpecAccess().getInteractionCommandAssignment_5()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InteractionSpec__Group__5__Impl"



	// $ANTLR start "rule__InteractionSpec__Group__6"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2694:1: rule__InteractionSpec__Group__6 : rule__InteractionSpec__Group__6__Impl rule__InteractionSpec__Group__7 ;
	public final void rule__InteractionSpec__Group__6() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2698:2: ( rule__InteractionSpec__Group__6__Impl rule__InteractionSpec__Group__7 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2699:2: rule__InteractionSpec__Group__6__Impl rule__InteractionSpec__Group__7
			{
			pushFollow(FOLLOW_rule__InteractionSpec__Group__6__Impl_in_rule__InteractionSpec__Group__65512);
			rule__InteractionSpec__Group__6__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__InteractionSpec__Group__7_in_rule__InteractionSpec__Group__65515);
			rule__InteractionSpec__Group__7();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InteractionSpec__Group__6"



	// $ANTLR start "rule__InteractionSpec__Group__6__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2706:1: rule__InteractionSpec__Group__6__Impl : ( ( rule__InteractionSpec__InteractionRequestAssignment_6 )* ) ;
	public final void rule__InteractionSpec__Group__6__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2710:1: ( ( ( rule__InteractionSpec__InteractionRequestAssignment_6 )* ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2711:1: ( ( rule__InteractionSpec__InteractionRequestAssignment_6 )* )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2711:1: ( ( rule__InteractionSpec__InteractionRequestAssignment_6 )* )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2712:1: ( rule__InteractionSpec__InteractionRequestAssignment_6 )*
			{
			 before(grammarAccess.getInteractionSpecAccess().getInteractionRequestAssignment_6()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2713:2: ( rule__InteractionSpec__InteractionRequestAssignment_6 )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==51) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2713:2: rule__InteractionSpec__InteractionRequestAssignment_6
					{
					pushFollow(FOLLOW_rule__InteractionSpec__InteractionRequestAssignment_6_in_rule__InteractionSpec__Group__6__Impl5542);
					rule__InteractionSpec__InteractionRequestAssignment_6();
					state._fsp--;

					}
					break;

				default :
					break loop10;
				}
			}

			 after(grammarAccess.getInteractionSpecAccess().getInteractionRequestAssignment_6()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InteractionSpec__Group__6__Impl"



	// $ANTLR start "rule__InteractionSpec__Group__7"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2723:1: rule__InteractionSpec__Group__7 : rule__InteractionSpec__Group__7__Impl ;
	public final void rule__InteractionSpec__Group__7() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2727:2: ( rule__InteractionSpec__Group__7__Impl )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2728:2: rule__InteractionSpec__Group__7__Impl
			{
			pushFollow(FOLLOW_rule__InteractionSpec__Group__7__Impl_in_rule__InteractionSpec__Group__75573);
			rule__InteractionSpec__Group__7__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InteractionSpec__Group__7"



	// $ANTLR start "rule__InteractionSpec__Group__7__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2734:1: rule__InteractionSpec__Group__7__Impl : ( ( rule__InteractionSpec__InteractionNotifyAssignment_7 )* ) ;
	public final void rule__InteractionSpec__Group__7__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2738:1: ( ( ( rule__InteractionSpec__InteractionNotifyAssignment_7 )* ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2739:1: ( ( rule__InteractionSpec__InteractionNotifyAssignment_7 )* )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2739:1: ( ( rule__InteractionSpec__InteractionNotifyAssignment_7 )* )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2740:1: ( rule__InteractionSpec__InteractionNotifyAssignment_7 )*
			{
			 before(grammarAccess.getInteractionSpecAccess().getInteractionNotifyAssignment_7()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2741:2: ( rule__InteractionSpec__InteractionNotifyAssignment_7 )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==45) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2741:2: rule__InteractionSpec__InteractionNotifyAssignment_7
					{
					pushFollow(FOLLOW_rule__InteractionSpec__InteractionNotifyAssignment_7_in_rule__InteractionSpec__Group__7__Impl5600);
					rule__InteractionSpec__InteractionNotifyAssignment_7();
					state._fsp--;

					}
					break;

				default :
					break loop11;
				}
			}

			 after(grammarAccess.getInteractionSpecAccess().getInteractionNotifyAssignment_7()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InteractionSpec__Group__7__Impl"



	// $ANTLR start "rule__InteractionAction__Group__0"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2767:1: rule__InteractionAction__Group__0 : rule__InteractionAction__Group__0__Impl rule__InteractionAction__Group__1 ;
	public final void rule__InteractionAction__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2771:2: ( rule__InteractionAction__Group__0__Impl rule__InteractionAction__Group__1 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2772:2: rule__InteractionAction__Group__0__Impl rule__InteractionAction__Group__1
			{
			pushFollow(FOLLOW_rule__InteractionAction__Group__0__Impl_in_rule__InteractionAction__Group__05647);
			rule__InteractionAction__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__InteractionAction__Group__1_in_rule__InteractionAction__Group__05650);
			rule__InteractionAction__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InteractionAction__Group__0"



	// $ANTLR start "rule__InteractionAction__Group__0__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2779:1: rule__InteractionAction__Group__0__Impl : ( 'notify' ) ;
	public final void rule__InteractionAction__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2783:1: ( ( 'notify' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2784:1: ( 'notify' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2784:1: ( 'notify' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2785:1: 'notify'
			{
			 before(grammarAccess.getInteractionActionAccess().getNotifyKeyword_0()); 
			match(input,45,FOLLOW_45_in_rule__InteractionAction__Group__0__Impl5678); 
			 after(grammarAccess.getInteractionActionAccess().getNotifyKeyword_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InteractionAction__Group__0__Impl"



	// $ANTLR start "rule__InteractionAction__Group__1"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2798:1: rule__InteractionAction__Group__1 : rule__InteractionAction__Group__1__Impl rule__InteractionAction__Group__2 ;
	public final void rule__InteractionAction__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2802:2: ( rule__InteractionAction__Group__1__Impl rule__InteractionAction__Group__2 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2803:2: rule__InteractionAction__Group__1__Impl rule__InteractionAction__Group__2
			{
			pushFollow(FOLLOW_rule__InteractionAction__Group__1__Impl_in_rule__InteractionAction__Group__15709);
			rule__InteractionAction__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__InteractionAction__Group__2_in_rule__InteractionAction__Group__15712);
			rule__InteractionAction__Group__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InteractionAction__Group__1"



	// $ANTLR start "rule__InteractionAction__Group__1__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2810:1: rule__InteractionAction__Group__1__Impl : ( ( rule__InteractionAction__ActionNameAssignment_1 ) ) ;
	public final void rule__InteractionAction__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2814:1: ( ( ( rule__InteractionAction__ActionNameAssignment_1 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2815:1: ( ( rule__InteractionAction__ActionNameAssignment_1 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2815:1: ( ( rule__InteractionAction__ActionNameAssignment_1 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2816:1: ( rule__InteractionAction__ActionNameAssignment_1 )
			{
			 before(grammarAccess.getInteractionActionAccess().getActionNameAssignment_1()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2817:2: ( rule__InteractionAction__ActionNameAssignment_1 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2817:2: rule__InteractionAction__ActionNameAssignment_1
			{
			pushFollow(FOLLOW_rule__InteractionAction__ActionNameAssignment_1_in_rule__InteractionAction__Group__1__Impl5739);
			rule__InteractionAction__ActionNameAssignment_1();
			state._fsp--;

			}

			 after(grammarAccess.getInteractionActionAccess().getActionNameAssignment_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InteractionAction__Group__1__Impl"



	// $ANTLR start "rule__InteractionAction__Group__2"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2827:1: rule__InteractionAction__Group__2 : rule__InteractionAction__Group__2__Impl rule__InteractionAction__Group__3 ;
	public final void rule__InteractionAction__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2831:2: ( rule__InteractionAction__Group__2__Impl rule__InteractionAction__Group__3 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2832:2: rule__InteractionAction__Group__2__Impl rule__InteractionAction__Group__3
			{
			pushFollow(FOLLOW_rule__InteractionAction__Group__2__Impl_in_rule__InteractionAction__Group__25769);
			rule__InteractionAction__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__InteractionAction__Group__3_in_rule__InteractionAction__Group__25772);
			rule__InteractionAction__Group__3();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InteractionAction__Group__2"



	// $ANTLR start "rule__InteractionAction__Group__2__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2839:1: rule__InteractionAction__Group__2__Impl : ( '(' ) ;
	public final void rule__InteractionAction__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2843:1: ( ( '(' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2844:1: ( '(' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2844:1: ( '(' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2845:1: '('
			{
			 before(grammarAccess.getInteractionActionAccess().getLeftParenthesisKeyword_2()); 
			match(input,11,FOLLOW_11_in_rule__InteractionAction__Group__2__Impl5800); 
			 after(grammarAccess.getInteractionActionAccess().getLeftParenthesisKeyword_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InteractionAction__Group__2__Impl"



	// $ANTLR start "rule__InteractionAction__Group__3"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2858:1: rule__InteractionAction__Group__3 : rule__InteractionAction__Group__3__Impl rule__InteractionAction__Group__4 ;
	public final void rule__InteractionAction__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2862:2: ( rule__InteractionAction__Group__3__Impl rule__InteractionAction__Group__4 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2863:2: rule__InteractionAction__Group__3__Impl rule__InteractionAction__Group__4
			{
			pushFollow(FOLLOW_rule__InteractionAction__Group__3__Impl_in_rule__InteractionAction__Group__35831);
			rule__InteractionAction__Group__3__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__InteractionAction__Group__4_in_rule__InteractionAction__Group__35834);
			rule__InteractionAction__Group__4();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InteractionAction__Group__3"



	// $ANTLR start "rule__InteractionAction__Group__3__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2870:1: rule__InteractionAction__Group__3__Impl : ( ( rule__InteractionAction__ParametersAssignment_3 )* ) ;
	public final void rule__InteractionAction__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2874:1: ( ( ( rule__InteractionAction__ParametersAssignment_3 )* ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2875:1: ( ( rule__InteractionAction__ParametersAssignment_3 )* )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2875:1: ( ( rule__InteractionAction__ParametersAssignment_3 )* )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2876:1: ( rule__InteractionAction__ParametersAssignment_3 )*
			{
			 before(grammarAccess.getInteractionActionAccess().getParametersAssignment_3()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2877:2: ( rule__InteractionAction__ParametersAssignment_3 )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==RULE_ID) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2877:2: rule__InteractionAction__ParametersAssignment_3
					{
					pushFollow(FOLLOW_rule__InteractionAction__ParametersAssignment_3_in_rule__InteractionAction__Group__3__Impl5861);
					rule__InteractionAction__ParametersAssignment_3();
					state._fsp--;

					}
					break;

				default :
					break loop12;
				}
			}

			 after(grammarAccess.getInteractionActionAccess().getParametersAssignment_3()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InteractionAction__Group__3__Impl"



	// $ANTLR start "rule__InteractionAction__Group__4"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2887:1: rule__InteractionAction__Group__4 : rule__InteractionAction__Group__4__Impl rule__InteractionAction__Group__5 ;
	public final void rule__InteractionAction__Group__4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2891:2: ( rule__InteractionAction__Group__4__Impl rule__InteractionAction__Group__5 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2892:2: rule__InteractionAction__Group__4__Impl rule__InteractionAction__Group__5
			{
			pushFollow(FOLLOW_rule__InteractionAction__Group__4__Impl_in_rule__InteractionAction__Group__45892);
			rule__InteractionAction__Group__4__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__InteractionAction__Group__5_in_rule__InteractionAction__Group__45895);
			rule__InteractionAction__Group__5();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InteractionAction__Group__4"



	// $ANTLR start "rule__InteractionAction__Group__4__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2899:1: rule__InteractionAction__Group__4__Impl : ( ')' ) ;
	public final void rule__InteractionAction__Group__4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2903:1: ( ( ')' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2904:1: ( ')' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2904:1: ( ')' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2905:1: ')'
			{
			 before(grammarAccess.getInteractionActionAccess().getRightParenthesisKeyword_4()); 
			match(input,12,FOLLOW_12_in_rule__InteractionAction__Group__4__Impl5923); 
			 after(grammarAccess.getInteractionActionAccess().getRightParenthesisKeyword_4()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InteractionAction__Group__4__Impl"



	// $ANTLR start "rule__InteractionAction__Group__5"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2918:1: rule__InteractionAction__Group__5 : rule__InteractionAction__Group__5__Impl rule__InteractionAction__Group__6 ;
	public final void rule__InteractionAction__Group__5() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2922:2: ( rule__InteractionAction__Group__5__Impl rule__InteractionAction__Group__6 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2923:2: rule__InteractionAction__Group__5__Impl rule__InteractionAction__Group__6
			{
			pushFollow(FOLLOW_rule__InteractionAction__Group__5__Impl_in_rule__InteractionAction__Group__55954);
			rule__InteractionAction__Group__5__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__InteractionAction__Group__6_in_rule__InteractionAction__Group__55957);
			rule__InteractionAction__Group__6();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InteractionAction__Group__5"



	// $ANTLR start "rule__InteractionAction__Group__5__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2930:1: rule__InteractionAction__Group__5__Impl : ( 'from' ) ;
	public final void rule__InteractionAction__Group__5__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2934:1: ( ( 'from' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2935:1: ( 'from' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2935:1: ( 'from' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2936:1: 'from'
			{
			 before(grammarAccess.getInteractionActionAccess().getFromKeyword_5()); 
			match(input,40,FOLLOW_40_in_rule__InteractionAction__Group__5__Impl5985); 
			 after(grammarAccess.getInteractionActionAccess().getFromKeyword_5()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InteractionAction__Group__5__Impl"



	// $ANTLR start "rule__InteractionAction__Group__6"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2949:1: rule__InteractionAction__Group__6 : rule__InteractionAction__Group__6__Impl rule__InteractionAction__Group__7 ;
	public final void rule__InteractionAction__Group__6() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2953:2: ( rule__InteractionAction__Group__6__Impl rule__InteractionAction__Group__7 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2954:2: rule__InteractionAction__Group__6__Impl rule__InteractionAction__Group__7
			{
			pushFollow(FOLLOW_rule__InteractionAction__Group__6__Impl_in_rule__InteractionAction__Group__66016);
			rule__InteractionAction__Group__6__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__InteractionAction__Group__7_in_rule__InteractionAction__Group__66019);
			rule__InteractionAction__Group__7();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InteractionAction__Group__6"



	// $ANTLR start "rule__InteractionAction__Group__6__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2961:1: rule__InteractionAction__Group__6__Impl : ( ( rule__InteractionAction__InteractionEntityAssignment_6 ) ) ;
	public final void rule__InteractionAction__Group__6__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2965:1: ( ( ( rule__InteractionAction__InteractionEntityAssignment_6 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2966:1: ( ( rule__InteractionAction__InteractionEntityAssignment_6 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2966:1: ( ( rule__InteractionAction__InteractionEntityAssignment_6 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2967:1: ( rule__InteractionAction__InteractionEntityAssignment_6 )
			{
			 before(grammarAccess.getInteractionActionAccess().getInteractionEntityAssignment_6()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2968:2: ( rule__InteractionAction__InteractionEntityAssignment_6 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2968:2: rule__InteractionAction__InteractionEntityAssignment_6
			{
			pushFollow(FOLLOW_rule__InteractionAction__InteractionEntityAssignment_6_in_rule__InteractionAction__Group__6__Impl6046);
			rule__InteractionAction__InteractionEntityAssignment_6();
			state._fsp--;

			}

			 after(grammarAccess.getInteractionActionAccess().getInteractionEntityAssignment_6()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InteractionAction__Group__6__Impl"



	// $ANTLR start "rule__InteractionAction__Group__7"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2978:1: rule__InteractionAction__Group__7 : rule__InteractionAction__Group__7__Impl ;
	public final void rule__InteractionAction__Group__7() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2982:2: ( rule__InteractionAction__Group__7__Impl )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2983:2: rule__InteractionAction__Group__7__Impl
			{
			pushFollow(FOLLOW_rule__InteractionAction__Group__7__Impl_in_rule__InteractionAction__Group__76076);
			rule__InteractionAction__Group__7__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InteractionAction__Group__7"



	// $ANTLR start "rule__InteractionAction__Group__7__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2989:1: rule__InteractionAction__Group__7__Impl : ( ';' ) ;
	public final void rule__InteractionAction__Group__7__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2993:1: ( ( ';' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2994:1: ( ';' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2994:1: ( ';' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2995:1: ';'
			{
			 before(grammarAccess.getInteractionActionAccess().getSemicolonKeyword_7()); 
			match(input,15,FOLLOW_15_in_rule__InteractionAction__Group__7__Impl6104); 
			 after(grammarAccess.getInteractionActionAccess().getSemicolonKeyword_7()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InteractionAction__Group__7__Impl"



	// $ANTLR start "rule__ArchSpec__Group__0"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3024:1: rule__ArchSpec__Group__0 : rule__ArchSpec__Group__0__Impl rule__ArchSpec__Group__1 ;
	public final void rule__ArchSpec__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3028:2: ( rule__ArchSpec__Group__0__Impl rule__ArchSpec__Group__1 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3029:2: rule__ArchSpec__Group__0__Impl rule__ArchSpec__Group__1
			{
			pushFollow(FOLLOW_rule__ArchSpec__Group__0__Impl_in_rule__ArchSpec__Group__06151);
			rule__ArchSpec__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ArchSpec__Group__1_in_rule__ArchSpec__Group__06154);
			rule__ArchSpec__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ArchSpec__Group__0"



	// $ANTLR start "rule__ArchSpec__Group__0__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3036:1: rule__ArchSpec__Group__0__Impl : ( ( rule__ArchSpec__Group_0__0 )* ) ;
	public final void rule__ArchSpec__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3040:1: ( ( ( rule__ArchSpec__Group_0__0 )* ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3041:1: ( ( rule__ArchSpec__Group_0__0 )* )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3041:1: ( ( rule__ArchSpec__Group_0__0 )* )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3042:1: ( rule__ArchSpec__Group_0__0 )*
			{
			 before(grammarAccess.getArchSpecAccess().getGroup_0()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3043:2: ( rule__ArchSpec__Group_0__0 )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==57) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3043:2: rule__ArchSpec__Group_0__0
					{
					pushFollow(FOLLOW_rule__ArchSpec__Group_0__0_in_rule__ArchSpec__Group__0__Impl6181);
					rule__ArchSpec__Group_0__0();
					state._fsp--;

					}
					break;

				default :
					break loop13;
				}
			}

			 after(grammarAccess.getArchSpecAccess().getGroup_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ArchSpec__Group__0__Impl"



	// $ANTLR start "rule__ArchSpec__Group__1"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3053:1: rule__ArchSpec__Group__1 : rule__ArchSpec__Group__1__Impl rule__ArchSpec__Group__2 ;
	public final void rule__ArchSpec__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3057:2: ( rule__ArchSpec__Group__1__Impl rule__ArchSpec__Group__2 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3058:2: rule__ArchSpec__Group__1__Impl rule__ArchSpec__Group__2
			{
			pushFollow(FOLLOW_rule__ArchSpec__Group__1__Impl_in_rule__ArchSpec__Group__16212);
			rule__ArchSpec__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ArchSpec__Group__2_in_rule__ArchSpec__Group__16215);
			rule__ArchSpec__Group__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ArchSpec__Group__1"



	// $ANTLR start "rule__ArchSpec__Group__1__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3065:1: rule__ArchSpec__Group__1__Impl : ( 'softwareComponents' ) ;
	public final void rule__ArchSpec__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3069:1: ( ( 'softwareComponents' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3070:1: ( 'softwareComponents' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3070:1: ( 'softwareComponents' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3071:1: 'softwareComponents'
			{
			 before(grammarAccess.getArchSpecAccess().getSoftwareComponentsKeyword_1()); 
			match(input,55,FOLLOW_55_in_rule__ArchSpec__Group__1__Impl6243); 
			 after(grammarAccess.getArchSpecAccess().getSoftwareComponentsKeyword_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ArchSpec__Group__1__Impl"



	// $ANTLR start "rule__ArchSpec__Group__2"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3084:1: rule__ArchSpec__Group__2 : rule__ArchSpec__Group__2__Impl rule__ArchSpec__Group__3 ;
	public final void rule__ArchSpec__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3088:2: ( rule__ArchSpec__Group__2__Impl rule__ArchSpec__Group__3 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3089:2: rule__ArchSpec__Group__2__Impl rule__ArchSpec__Group__3
			{
			pushFollow(FOLLOW_rule__ArchSpec__Group__2__Impl_in_rule__ArchSpec__Group__26274);
			rule__ArchSpec__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ArchSpec__Group__3_in_rule__ArchSpec__Group__26277);
			rule__ArchSpec__Group__3();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ArchSpec__Group__2"



	// $ANTLR start "rule__ArchSpec__Group__2__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3096:1: rule__ArchSpec__Group__2__Impl : ( ':' ) ;
	public final void rule__ArchSpec__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3100:1: ( ( ':' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3101:1: ( ':' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3101:1: ( ':' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3102:1: ':'
			{
			 before(grammarAccess.getArchSpecAccess().getColonKeyword_2()); 
			match(input,14,FOLLOW_14_in_rule__ArchSpec__Group__2__Impl6305); 
			 after(grammarAccess.getArchSpecAccess().getColonKeyword_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ArchSpec__Group__2__Impl"



	// $ANTLR start "rule__ArchSpec__Group__3"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3115:1: rule__ArchSpec__Group__3 : rule__ArchSpec__Group__3__Impl rule__ArchSpec__Group__4 ;
	public final void rule__ArchSpec__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3119:2: ( rule__ArchSpec__Group__3__Impl rule__ArchSpec__Group__4 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3120:2: rule__ArchSpec__Group__3__Impl rule__ArchSpec__Group__4
			{
			pushFollow(FOLLOW_rule__ArchSpec__Group__3__Impl_in_rule__ArchSpec__Group__36336);
			rule__ArchSpec__Group__3__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ArchSpec__Group__4_in_rule__ArchSpec__Group__36339);
			rule__ArchSpec__Group__4();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ArchSpec__Group__3"



	// $ANTLR start "rule__ArchSpec__Group__3__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3127:1: rule__ArchSpec__Group__3__Impl : ( 'computationalService' ) ;
	public final void rule__ArchSpec__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3131:1: ( ( 'computationalService' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3132:1: ( 'computationalService' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3132:1: ( 'computationalService' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3133:1: 'computationalService'
			{
			 before(grammarAccess.getArchSpecAccess().getComputationalServiceKeyword_3()); 
			match(input,32,FOLLOW_32_in_rule__ArchSpec__Group__3__Impl6367); 
			 after(grammarAccess.getArchSpecAccess().getComputationalServiceKeyword_3()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ArchSpec__Group__3__Impl"



	// $ANTLR start "rule__ArchSpec__Group__4"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3146:1: rule__ArchSpec__Group__4 : rule__ArchSpec__Group__4__Impl rule__ArchSpec__Group__5 ;
	public final void rule__ArchSpec__Group__4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3150:2: ( rule__ArchSpec__Group__4__Impl rule__ArchSpec__Group__5 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3151:2: rule__ArchSpec__Group__4__Impl rule__ArchSpec__Group__5
			{
			pushFollow(FOLLOW_rule__ArchSpec__Group__4__Impl_in_rule__ArchSpec__Group__46398);
			rule__ArchSpec__Group__4__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ArchSpec__Group__5_in_rule__ArchSpec__Group__46401);
			rule__ArchSpec__Group__5();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ArchSpec__Group__4"



	// $ANTLR start "rule__ArchSpec__Group__4__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3158:1: rule__ArchSpec__Group__4__Impl : ( ':' ) ;
	public final void rule__ArchSpec__Group__4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3162:1: ( ( ':' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3163:1: ( ':' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3163:1: ( ':' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3164:1: ':'
			{
			 before(grammarAccess.getArchSpecAccess().getColonKeyword_4()); 
			match(input,14,FOLLOW_14_in_rule__ArchSpec__Group__4__Impl6429); 
			 after(grammarAccess.getArchSpecAccess().getColonKeyword_4()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ArchSpec__Group__4__Impl"



	// $ANTLR start "rule__ArchSpec__Group__5"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3177:1: rule__ArchSpec__Group__5 : rule__ArchSpec__Group__5__Impl rule__ArchSpec__Group__6 ;
	public final void rule__ArchSpec__Group__5() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3181:2: ( rule__ArchSpec__Group__5__Impl rule__ArchSpec__Group__6 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3182:2: rule__ArchSpec__Group__5__Impl rule__ArchSpec__Group__6
			{
			pushFollow(FOLLOW_rule__ArchSpec__Group__5__Impl_in_rule__ArchSpec__Group__56460);
			rule__ArchSpec__Group__5__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ArchSpec__Group__6_in_rule__ArchSpec__Group__56463);
			rule__ArchSpec__Group__6();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ArchSpec__Group__5"



	// $ANTLR start "rule__ArchSpec__Group__5__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3189:1: rule__ArchSpec__Group__5__Impl : ( ( rule__ArchSpec__Group_5__0 )* ) ;
	public final void rule__ArchSpec__Group__5__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3193:1: ( ( ( rule__ArchSpec__Group_5__0 )* ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3194:1: ( ( rule__ArchSpec__Group_5__0 )* )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3194:1: ( ( rule__ArchSpec__Group_5__0 )* )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3195:1: ( rule__ArchSpec__Group_5__0 )*
			{
			 before(grammarAccess.getArchSpecAccess().getGroup_5()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3196:2: ( rule__ArchSpec__Group_5__0 )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==20) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3196:2: rule__ArchSpec__Group_5__0
					{
					pushFollow(FOLLOW_rule__ArchSpec__Group_5__0_in_rule__ArchSpec__Group__5__Impl6490);
					rule__ArchSpec__Group_5__0();
					state._fsp--;

					}
					break;

				default :
					break loop14;
				}
			}

			 after(grammarAccess.getArchSpecAccess().getGroup_5()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ArchSpec__Group__5__Impl"



	// $ANTLR start "rule__ArchSpec__Group__6"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3206:1: rule__ArchSpec__Group__6 : rule__ArchSpec__Group__6__Impl rule__ArchSpec__Group__7 ;
	public final void rule__ArchSpec__Group__6() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3210:2: ( rule__ArchSpec__Group__6__Impl rule__ArchSpec__Group__7 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3211:2: rule__ArchSpec__Group__6__Impl rule__ArchSpec__Group__7
			{
			pushFollow(FOLLOW_rule__ArchSpec__Group__6__Impl_in_rule__ArchSpec__Group__66521);
			rule__ArchSpec__Group__6__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ArchSpec__Group__7_in_rule__ArchSpec__Group__66524);
			rule__ArchSpec__Group__7();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ArchSpec__Group__6"



	// $ANTLR start "rule__ArchSpec__Group__6__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3218:1: rule__ArchSpec__Group__6__Impl : ( ( rule__ArchSpec__InbuiltComputationalServiceAssignment_6 )* ) ;
	public final void rule__ArchSpec__Group__6__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3222:1: ( ( ( rule__ArchSpec__InbuiltComputationalServiceAssignment_6 )* ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3223:1: ( ( rule__ArchSpec__InbuiltComputationalServiceAssignment_6 )* )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3223:1: ( ( rule__ArchSpec__InbuiltComputationalServiceAssignment_6 )* )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3224:1: ( rule__ArchSpec__InbuiltComputationalServiceAssignment_6 )*
			{
			 before(grammarAccess.getArchSpecAccess().getInbuiltComputationalServiceAssignment_6()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3225:2: ( rule__ArchSpec__InbuiltComputationalServiceAssignment_6 )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==RULE_ID) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3225:2: rule__ArchSpec__InbuiltComputationalServiceAssignment_6
					{
					pushFollow(FOLLOW_rule__ArchSpec__InbuiltComputationalServiceAssignment_6_in_rule__ArchSpec__Group__6__Impl6551);
					rule__ArchSpec__InbuiltComputationalServiceAssignment_6();
					state._fsp--;

					}
					break;

				default :
					break loop15;
				}
			}

			 after(grammarAccess.getArchSpecAccess().getInbuiltComputationalServiceAssignment_6()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ArchSpec__Group__6__Impl"



	// $ANTLR start "rule__ArchSpec__Group__7"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3235:1: rule__ArchSpec__Group__7 : rule__ArchSpec__Group__7__Impl rule__ArchSpec__Group__8 ;
	public final void rule__ArchSpec__Group__7() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3239:2: ( rule__ArchSpec__Group__7__Impl rule__ArchSpec__Group__8 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3240:2: rule__ArchSpec__Group__7__Impl rule__ArchSpec__Group__8
			{
			pushFollow(FOLLOW_rule__ArchSpec__Group__7__Impl_in_rule__ArchSpec__Group__76582);
			rule__ArchSpec__Group__7__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ArchSpec__Group__8_in_rule__ArchSpec__Group__76585);
			rule__ArchSpec__Group__8();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ArchSpec__Group__7"



	// $ANTLR start "rule__ArchSpec__Group__7__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3247:1: rule__ArchSpec__Group__7__Impl : ( 'Custom' ) ;
	public final void rule__ArchSpec__Group__7__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3251:1: ( ( 'Custom' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3252:1: ( 'Custom' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3252:1: ( 'Custom' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3253:1: 'Custom'
			{
			 before(grammarAccess.getArchSpecAccess().getCustomKeyword_7()); 
			match(input,19,FOLLOW_19_in_rule__ArchSpec__Group__7__Impl6613); 
			 after(grammarAccess.getArchSpecAccess().getCustomKeyword_7()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ArchSpec__Group__7__Impl"



	// $ANTLR start "rule__ArchSpec__Group__8"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3266:1: rule__ArchSpec__Group__8 : rule__ArchSpec__Group__8__Impl rule__ArchSpec__Group__9 ;
	public final void rule__ArchSpec__Group__8() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3270:2: ( rule__ArchSpec__Group__8__Impl rule__ArchSpec__Group__9 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3271:2: rule__ArchSpec__Group__8__Impl rule__ArchSpec__Group__9
			{
			pushFollow(FOLLOW_rule__ArchSpec__Group__8__Impl_in_rule__ArchSpec__Group__86644);
			rule__ArchSpec__Group__8__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ArchSpec__Group__9_in_rule__ArchSpec__Group__86647);
			rule__ArchSpec__Group__9();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ArchSpec__Group__8"



	// $ANTLR start "rule__ArchSpec__Group__8__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3278:1: rule__ArchSpec__Group__8__Impl : ( ':' ) ;
	public final void rule__ArchSpec__Group__8__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3282:1: ( ( ':' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3283:1: ( ':' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3283:1: ( ':' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3284:1: ':'
			{
			 before(grammarAccess.getArchSpecAccess().getColonKeyword_8()); 
			match(input,14,FOLLOW_14_in_rule__ArchSpec__Group__8__Impl6675); 
			 after(grammarAccess.getArchSpecAccess().getColonKeyword_8()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ArchSpec__Group__8__Impl"



	// $ANTLR start "rule__ArchSpec__Group__9"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3297:1: rule__ArchSpec__Group__9 : rule__ArchSpec__Group__9__Impl ;
	public final void rule__ArchSpec__Group__9() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3301:2: ( rule__ArchSpec__Group__9__Impl )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3302:2: rule__ArchSpec__Group__9__Impl
			{
			pushFollow(FOLLOW_rule__ArchSpec__Group__9__Impl_in_rule__ArchSpec__Group__96706);
			rule__ArchSpec__Group__9__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ArchSpec__Group__9"



	// $ANTLR start "rule__ArchSpec__Group__9__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3308:1: rule__ArchSpec__Group__9__Impl : ( ( ( rule__ArchSpec__CustomComputationalServiceAssignment_9 ) ) ( ( rule__ArchSpec__CustomComputationalServiceAssignment_9 )* ) ) ;
	public final void rule__ArchSpec__Group__9__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3312:1: ( ( ( ( rule__ArchSpec__CustomComputationalServiceAssignment_9 ) ) ( ( rule__ArchSpec__CustomComputationalServiceAssignment_9 )* ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3313:1: ( ( ( rule__ArchSpec__CustomComputationalServiceAssignment_9 ) ) ( ( rule__ArchSpec__CustomComputationalServiceAssignment_9 )* ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3313:1: ( ( ( rule__ArchSpec__CustomComputationalServiceAssignment_9 ) ) ( ( rule__ArchSpec__CustomComputationalServiceAssignment_9 )* ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3314:1: ( ( rule__ArchSpec__CustomComputationalServiceAssignment_9 ) ) ( ( rule__ArchSpec__CustomComputationalServiceAssignment_9 )* )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3314:1: ( ( rule__ArchSpec__CustomComputationalServiceAssignment_9 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3315:1: ( rule__ArchSpec__CustomComputationalServiceAssignment_9 )
			{
			 before(grammarAccess.getArchSpecAccess().getCustomComputationalServiceAssignment_9()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3316:2: ( rule__ArchSpec__CustomComputationalServiceAssignment_9 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3316:2: rule__ArchSpec__CustomComputationalServiceAssignment_9
			{
			pushFollow(FOLLOW_rule__ArchSpec__CustomComputationalServiceAssignment_9_in_rule__ArchSpec__Group__9__Impl6735);
			rule__ArchSpec__CustomComputationalServiceAssignment_9();
			state._fsp--;

			}

			 after(grammarAccess.getArchSpecAccess().getCustomComputationalServiceAssignment_9()); 
			}

			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3319:1: ( ( rule__ArchSpec__CustomComputationalServiceAssignment_9 )* )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3320:1: ( rule__ArchSpec__CustomComputationalServiceAssignment_9 )*
			{
			 before(grammarAccess.getArchSpecAccess().getCustomComputationalServiceAssignment_9()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3321:2: ( rule__ArchSpec__CustomComputationalServiceAssignment_9 )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==RULE_ID) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3321:2: rule__ArchSpec__CustomComputationalServiceAssignment_9
					{
					pushFollow(FOLLOW_rule__ArchSpec__CustomComputationalServiceAssignment_9_in_rule__ArchSpec__Group__9__Impl6747);
					rule__ArchSpec__CustomComputationalServiceAssignment_9();
					state._fsp--;

					}
					break;

				default :
					break loop16;
				}
			}

			 after(grammarAccess.getArchSpecAccess().getCustomComputationalServiceAssignment_9()); 
			}

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ArchSpec__Group__9__Impl"



	// $ANTLR start "rule__ArchSpec__Group_0__0"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3352:1: rule__ArchSpec__Group_0__0 : rule__ArchSpec__Group_0__0__Impl rule__ArchSpec__Group_0__1 ;
	public final void rule__ArchSpec__Group_0__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3356:2: ( rule__ArchSpec__Group_0__0__Impl rule__ArchSpec__Group_0__1 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3357:2: rule__ArchSpec__Group_0__0__Impl rule__ArchSpec__Group_0__1
			{
			pushFollow(FOLLOW_rule__ArchSpec__Group_0__0__Impl_in_rule__ArchSpec__Group_0__06800);
			rule__ArchSpec__Group_0__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ArchSpec__Group_0__1_in_rule__ArchSpec__Group_0__06803);
			rule__ArchSpec__Group_0__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ArchSpec__Group_0__0"



	// $ANTLR start "rule__ArchSpec__Group_0__0__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3364:1: rule__ArchSpec__Group_0__0__Impl : ( 'structs' ) ;
	public final void rule__ArchSpec__Group_0__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3368:1: ( ( 'structs' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3369:1: ( 'structs' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3369:1: ( 'structs' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3370:1: 'structs'
			{
			 before(grammarAccess.getArchSpecAccess().getStructsKeyword_0_0()); 
			match(input,57,FOLLOW_57_in_rule__ArchSpec__Group_0__0__Impl6831); 
			 after(grammarAccess.getArchSpecAccess().getStructsKeyword_0_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ArchSpec__Group_0__0__Impl"



	// $ANTLR start "rule__ArchSpec__Group_0__1"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3383:1: rule__ArchSpec__Group_0__1 : rule__ArchSpec__Group_0__1__Impl rule__ArchSpec__Group_0__2 ;
	public final void rule__ArchSpec__Group_0__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3387:2: ( rule__ArchSpec__Group_0__1__Impl rule__ArchSpec__Group_0__2 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3388:2: rule__ArchSpec__Group_0__1__Impl rule__ArchSpec__Group_0__2
			{
			pushFollow(FOLLOW_rule__ArchSpec__Group_0__1__Impl_in_rule__ArchSpec__Group_0__16862);
			rule__ArchSpec__Group_0__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ArchSpec__Group_0__2_in_rule__ArchSpec__Group_0__16865);
			rule__ArchSpec__Group_0__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ArchSpec__Group_0__1"



	// $ANTLR start "rule__ArchSpec__Group_0__1__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3395:1: rule__ArchSpec__Group_0__1__Impl : ( ':' ) ;
	public final void rule__ArchSpec__Group_0__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3399:1: ( ( ':' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3400:1: ( ':' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3400:1: ( ':' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3401:1: ':'
			{
			 before(grammarAccess.getArchSpecAccess().getColonKeyword_0_1()); 
			match(input,14,FOLLOW_14_in_rule__ArchSpec__Group_0__1__Impl6893); 
			 after(grammarAccess.getArchSpecAccess().getColonKeyword_0_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ArchSpec__Group_0__1__Impl"



	// $ANTLR start "rule__ArchSpec__Group_0__2"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3414:1: rule__ArchSpec__Group_0__2 : rule__ArchSpec__Group_0__2__Impl ;
	public final void rule__ArchSpec__Group_0__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3418:2: ( rule__ArchSpec__Group_0__2__Impl )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3419:2: rule__ArchSpec__Group_0__2__Impl
			{
			pushFollow(FOLLOW_rule__ArchSpec__Group_0__2__Impl_in_rule__ArchSpec__Group_0__26924);
			rule__ArchSpec__Group_0__2__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ArchSpec__Group_0__2"



	// $ANTLR start "rule__ArchSpec__Group_0__2__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3425:1: rule__ArchSpec__Group_0__2__Impl : ( ( ( rule__ArchSpec__StructsAssignment_0_2 ) ) ( ( rule__ArchSpec__StructsAssignment_0_2 )* ) ) ;
	public final void rule__ArchSpec__Group_0__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3429:1: ( ( ( ( rule__ArchSpec__StructsAssignment_0_2 ) ) ( ( rule__ArchSpec__StructsAssignment_0_2 )* ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3430:1: ( ( ( rule__ArchSpec__StructsAssignment_0_2 ) ) ( ( rule__ArchSpec__StructsAssignment_0_2 )* ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3430:1: ( ( ( rule__ArchSpec__StructsAssignment_0_2 ) ) ( ( rule__ArchSpec__StructsAssignment_0_2 )* ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3431:1: ( ( rule__ArchSpec__StructsAssignment_0_2 ) ) ( ( rule__ArchSpec__StructsAssignment_0_2 )* )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3431:1: ( ( rule__ArchSpec__StructsAssignment_0_2 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3432:1: ( rule__ArchSpec__StructsAssignment_0_2 )
			{
			 before(grammarAccess.getArchSpecAccess().getStructsAssignment_0_2()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3433:2: ( rule__ArchSpec__StructsAssignment_0_2 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3433:2: rule__ArchSpec__StructsAssignment_0_2
			{
			pushFollow(FOLLOW_rule__ArchSpec__StructsAssignment_0_2_in_rule__ArchSpec__Group_0__2__Impl6953);
			rule__ArchSpec__StructsAssignment_0_2();
			state._fsp--;

			}

			 after(grammarAccess.getArchSpecAccess().getStructsAssignment_0_2()); 
			}

			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3436:1: ( ( rule__ArchSpec__StructsAssignment_0_2 )* )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3437:1: ( rule__ArchSpec__StructsAssignment_0_2 )*
			{
			 before(grammarAccess.getArchSpecAccess().getStructsAssignment_0_2()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3438:2: ( rule__ArchSpec__StructsAssignment_0_2 )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==RULE_ID) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3438:2: rule__ArchSpec__StructsAssignment_0_2
					{
					pushFollow(FOLLOW_rule__ArchSpec__StructsAssignment_0_2_in_rule__ArchSpec__Group_0__2__Impl6965);
					rule__ArchSpec__StructsAssignment_0_2();
					state._fsp--;

					}
					break;

				default :
					break loop17;
				}
			}

			 after(grammarAccess.getArchSpecAccess().getStructsAssignment_0_2()); 
			}

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ArchSpec__Group_0__2__Impl"



	// $ANTLR start "rule__ArchSpec__Group_5__0"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3455:1: rule__ArchSpec__Group_5__0 : rule__ArchSpec__Group_5__0__Impl rule__ArchSpec__Group_5__1 ;
	public final void rule__ArchSpec__Group_5__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3459:2: ( rule__ArchSpec__Group_5__0__Impl rule__ArchSpec__Group_5__1 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3460:2: rule__ArchSpec__Group_5__0__Impl rule__ArchSpec__Group_5__1
			{
			pushFollow(FOLLOW_rule__ArchSpec__Group_5__0__Impl_in_rule__ArchSpec__Group_5__07004);
			rule__ArchSpec__Group_5__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ArchSpec__Group_5__1_in_rule__ArchSpec__Group_5__07007);
			rule__ArchSpec__Group_5__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ArchSpec__Group_5__0"



	// $ANTLR start "rule__ArchSpec__Group_5__0__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3467:1: rule__ArchSpec__Group_5__0__Impl : ( 'InBuilt' ) ;
	public final void rule__ArchSpec__Group_5__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3471:1: ( ( 'InBuilt' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3472:1: ( 'InBuilt' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3472:1: ( 'InBuilt' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3473:1: 'InBuilt'
			{
			 before(grammarAccess.getArchSpecAccess().getInBuiltKeyword_5_0()); 
			match(input,20,FOLLOW_20_in_rule__ArchSpec__Group_5__0__Impl7035); 
			 after(grammarAccess.getArchSpecAccess().getInBuiltKeyword_5_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ArchSpec__Group_5__0__Impl"



	// $ANTLR start "rule__ArchSpec__Group_5__1"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3486:1: rule__ArchSpec__Group_5__1 : rule__ArchSpec__Group_5__1__Impl ;
	public final void rule__ArchSpec__Group_5__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3490:2: ( rule__ArchSpec__Group_5__1__Impl )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3491:2: rule__ArchSpec__Group_5__1__Impl
			{
			pushFollow(FOLLOW_rule__ArchSpec__Group_5__1__Impl_in_rule__ArchSpec__Group_5__17066);
			rule__ArchSpec__Group_5__1__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ArchSpec__Group_5__1"



	// $ANTLR start "rule__ArchSpec__Group_5__1__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3497:1: rule__ArchSpec__Group_5__1__Impl : ( ':' ) ;
	public final void rule__ArchSpec__Group_5__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3501:1: ( ( ':' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3502:1: ( ':' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3502:1: ( ':' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3503:1: ':'
			{
			 before(grammarAccess.getArchSpecAccess().getColonKeyword_5_1()); 
			match(input,14,FOLLOW_14_in_rule__ArchSpec__Group_5__1__Impl7094); 
			 after(grammarAccess.getArchSpecAccess().getColonKeyword_5_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ArchSpec__Group_5__1__Impl"



	// $ANTLR start "rule__InBuiltComputationalService__Group__0"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3520:1: rule__InBuiltComputationalService__Group__0 : rule__InBuiltComputationalService__Group__0__Impl rule__InBuiltComputationalService__Group__1 ;
	public final void rule__InBuiltComputationalService__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3524:2: ( rule__InBuiltComputationalService__Group__0__Impl rule__InBuiltComputationalService__Group__1 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3525:2: rule__InBuiltComputationalService__Group__0__Impl rule__InBuiltComputationalService__Group__1
			{
			pushFollow(FOLLOW_rule__InBuiltComputationalService__Group__0__Impl_in_rule__InBuiltComputationalService__Group__07129);
			rule__InBuiltComputationalService__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__InBuiltComputationalService__Group__1_in_rule__InBuiltComputationalService__Group__07132);
			rule__InBuiltComputationalService__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InBuiltComputationalService__Group__0"



	// $ANTLR start "rule__InBuiltComputationalService__Group__0__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3532:1: rule__InBuiltComputationalService__Group__0__Impl : ( ( rule__InBuiltComputationalService__InBuiltComputationalServiceNameAssignment_0 ) ) ;
	public final void rule__InBuiltComputationalService__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3536:1: ( ( ( rule__InBuiltComputationalService__InBuiltComputationalServiceNameAssignment_0 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3537:1: ( ( rule__InBuiltComputationalService__InBuiltComputationalServiceNameAssignment_0 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3537:1: ( ( rule__InBuiltComputationalService__InBuiltComputationalServiceNameAssignment_0 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3538:1: ( rule__InBuiltComputationalService__InBuiltComputationalServiceNameAssignment_0 )
			{
			 before(grammarAccess.getInBuiltComputationalServiceAccess().getInBuiltComputationalServiceNameAssignment_0()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3539:2: ( rule__InBuiltComputationalService__InBuiltComputationalServiceNameAssignment_0 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3539:2: rule__InBuiltComputationalService__InBuiltComputationalServiceNameAssignment_0
			{
			pushFollow(FOLLOW_rule__InBuiltComputationalService__InBuiltComputationalServiceNameAssignment_0_in_rule__InBuiltComputationalService__Group__0__Impl7159);
			rule__InBuiltComputationalService__InBuiltComputationalServiceNameAssignment_0();
			state._fsp--;

			}

			 after(grammarAccess.getInBuiltComputationalServiceAccess().getInBuiltComputationalServiceNameAssignment_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InBuiltComputationalService__Group__0__Impl"



	// $ANTLR start "rule__InBuiltComputationalService__Group__1"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3549:1: rule__InBuiltComputationalService__Group__1 : rule__InBuiltComputationalService__Group__1__Impl rule__InBuiltComputationalService__Group__2 ;
	public final void rule__InBuiltComputationalService__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3553:2: ( rule__InBuiltComputationalService__Group__1__Impl rule__InBuiltComputationalService__Group__2 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3554:2: rule__InBuiltComputationalService__Group__1__Impl rule__InBuiltComputationalService__Group__2
			{
			pushFollow(FOLLOW_rule__InBuiltComputationalService__Group__1__Impl_in_rule__InBuiltComputationalService__Group__17189);
			rule__InBuiltComputationalService__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__InBuiltComputationalService__Group__2_in_rule__InBuiltComputationalService__Group__17192);
			rule__InBuiltComputationalService__Group__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InBuiltComputationalService__Group__1"



	// $ANTLR start "rule__InBuiltComputationalService__Group__1__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3561:1: rule__InBuiltComputationalService__Group__1__Impl : ( ( ( rule__InBuiltComputationalService__ConsumesAssignment_1 ) ) ( ( rule__InBuiltComputationalService__ConsumesAssignment_1 )* ) ) ;
	public final void rule__InBuiltComputationalService__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3565:1: ( ( ( ( rule__InBuiltComputationalService__ConsumesAssignment_1 ) ) ( ( rule__InBuiltComputationalService__ConsumesAssignment_1 )* ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3566:1: ( ( ( rule__InBuiltComputationalService__ConsumesAssignment_1 ) ) ( ( rule__InBuiltComputationalService__ConsumesAssignment_1 )* ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3566:1: ( ( ( rule__InBuiltComputationalService__ConsumesAssignment_1 ) ) ( ( rule__InBuiltComputationalService__ConsumesAssignment_1 )* ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3567:1: ( ( rule__InBuiltComputationalService__ConsumesAssignment_1 ) ) ( ( rule__InBuiltComputationalService__ConsumesAssignment_1 )* )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3567:1: ( ( rule__InBuiltComputationalService__ConsumesAssignment_1 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3568:1: ( rule__InBuiltComputationalService__ConsumesAssignment_1 )
			{
			 before(grammarAccess.getInBuiltComputationalServiceAccess().getConsumesAssignment_1()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3569:2: ( rule__InBuiltComputationalService__ConsumesAssignment_1 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3569:2: rule__InBuiltComputationalService__ConsumesAssignment_1
			{
			pushFollow(FOLLOW_rule__InBuiltComputationalService__ConsumesAssignment_1_in_rule__InBuiltComputationalService__Group__1__Impl7221);
			rule__InBuiltComputationalService__ConsumesAssignment_1();
			state._fsp--;

			}

			 after(grammarAccess.getInBuiltComputationalServiceAccess().getConsumesAssignment_1()); 
			}

			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3572:1: ( ( rule__InBuiltComputationalService__ConsumesAssignment_1 )* )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3573:1: ( rule__InBuiltComputationalService__ConsumesAssignment_1 )*
			{
			 before(grammarAccess.getInBuiltComputationalServiceAccess().getConsumesAssignment_1()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3574:2: ( rule__InBuiltComputationalService__ConsumesAssignment_1 )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==33) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3574:2: rule__InBuiltComputationalService__ConsumesAssignment_1
					{
					pushFollow(FOLLOW_rule__InBuiltComputationalService__ConsumesAssignment_1_in_rule__InBuiltComputationalService__Group__1__Impl7233);
					rule__InBuiltComputationalService__ConsumesAssignment_1();
					state._fsp--;

					}
					break;

				default :
					break loop18;
				}
			}

			 after(grammarAccess.getInBuiltComputationalServiceAccess().getConsumesAssignment_1()); 
			}

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InBuiltComputationalService__Group__1__Impl"



	// $ANTLR start "rule__InBuiltComputationalService__Group__2"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3585:1: rule__InBuiltComputationalService__Group__2 : rule__InBuiltComputationalService__Group__2__Impl rule__InBuiltComputationalService__Group__3 ;
	public final void rule__InBuiltComputationalService__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3589:2: ( rule__InBuiltComputationalService__Group__2__Impl rule__InBuiltComputationalService__Group__3 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3590:2: rule__InBuiltComputationalService__Group__2__Impl rule__InBuiltComputationalService__Group__3
			{
			pushFollow(FOLLOW_rule__InBuiltComputationalService__Group__2__Impl_in_rule__InBuiltComputationalService__Group__27266);
			rule__InBuiltComputationalService__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__InBuiltComputationalService__Group__3_in_rule__InBuiltComputationalService__Group__27269);
			rule__InBuiltComputationalService__Group__3();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InBuiltComputationalService__Group__2"



	// $ANTLR start "rule__InBuiltComputationalService__Group__2__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3597:1: rule__InBuiltComputationalService__Group__2__Impl : ( 'COMPUTE' ) ;
	public final void rule__InBuiltComputationalService__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3601:1: ( ( 'COMPUTE' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3602:1: ( 'COMPUTE' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3602:1: ( 'COMPUTE' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3603:1: 'COMPUTE'
			{
			 before(grammarAccess.getInBuiltComputationalServiceAccess().getCOMPUTEKeyword_2()); 
			match(input,18,FOLLOW_18_in_rule__InBuiltComputationalService__Group__2__Impl7297); 
			 after(grammarAccess.getInBuiltComputationalServiceAccess().getCOMPUTEKeyword_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InBuiltComputationalService__Group__2__Impl"



	// $ANTLR start "rule__InBuiltComputationalService__Group__3"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3616:1: rule__InBuiltComputationalService__Group__3 : rule__InBuiltComputationalService__Group__3__Impl rule__InBuiltComputationalService__Group__4 ;
	public final void rule__InBuiltComputationalService__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3620:2: ( rule__InBuiltComputationalService__Group__3__Impl rule__InBuiltComputationalService__Group__4 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3621:2: rule__InBuiltComputationalService__Group__3__Impl rule__InBuiltComputationalService__Group__4
			{
			pushFollow(FOLLOW_rule__InBuiltComputationalService__Group__3__Impl_in_rule__InBuiltComputationalService__Group__37328);
			rule__InBuiltComputationalService__Group__3__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__InBuiltComputationalService__Group__4_in_rule__InBuiltComputationalService__Group__37331);
			rule__InBuiltComputationalService__Group__4();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InBuiltComputationalService__Group__3"



	// $ANTLR start "rule__InBuiltComputationalService__Group__3__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3628:1: rule__InBuiltComputationalService__Group__3__Impl : ( '(' ) ;
	public final void rule__InBuiltComputationalService__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3632:1: ( ( '(' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3633:1: ( '(' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3633:1: ( '(' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3634:1: '('
			{
			 before(grammarAccess.getInBuiltComputationalServiceAccess().getLeftParenthesisKeyword_3()); 
			match(input,11,FOLLOW_11_in_rule__InBuiltComputationalService__Group__3__Impl7359); 
			 after(grammarAccess.getInBuiltComputationalServiceAccess().getLeftParenthesisKeyword_3()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InBuiltComputationalService__Group__3__Impl"



	// $ANTLR start "rule__InBuiltComputationalService__Group__4"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3647:1: rule__InBuiltComputationalService__Group__4 : rule__InBuiltComputationalService__Group__4__Impl rule__InBuiltComputationalService__Group__5 ;
	public final void rule__InBuiltComputationalService__Group__4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3651:2: ( rule__InBuiltComputationalService__Group__4__Impl rule__InBuiltComputationalService__Group__5 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3652:2: rule__InBuiltComputationalService__Group__4__Impl rule__InBuiltComputationalService__Group__5
			{
			pushFollow(FOLLOW_rule__InBuiltComputationalService__Group__4__Impl_in_rule__InBuiltComputationalService__Group__47390);
			rule__InBuiltComputationalService__Group__4__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__InBuiltComputationalService__Group__5_in_rule__InBuiltComputationalService__Group__47393);
			rule__InBuiltComputationalService__Group__5();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InBuiltComputationalService__Group__4"



	// $ANTLR start "rule__InBuiltComputationalService__Group__4__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3659:1: rule__InBuiltComputationalService__Group__4__Impl : ( ( rule__InBuiltComputationalService__OperationNameAssignment_4 ) ) ;
	public final void rule__InBuiltComputationalService__Group__4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3663:1: ( ( ( rule__InBuiltComputationalService__OperationNameAssignment_4 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3664:1: ( ( rule__InBuiltComputationalService__OperationNameAssignment_4 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3664:1: ( ( rule__InBuiltComputationalService__OperationNameAssignment_4 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3665:1: ( rule__InBuiltComputationalService__OperationNameAssignment_4 )
			{
			 before(grammarAccess.getInBuiltComputationalServiceAccess().getOperationNameAssignment_4()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3666:2: ( rule__InBuiltComputationalService__OperationNameAssignment_4 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3666:2: rule__InBuiltComputationalService__OperationNameAssignment_4
			{
			pushFollow(FOLLOW_rule__InBuiltComputationalService__OperationNameAssignment_4_in_rule__InBuiltComputationalService__Group__4__Impl7420);
			rule__InBuiltComputationalService__OperationNameAssignment_4();
			state._fsp--;

			}

			 after(grammarAccess.getInBuiltComputationalServiceAccess().getOperationNameAssignment_4()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InBuiltComputationalService__Group__4__Impl"



	// $ANTLR start "rule__InBuiltComputationalService__Group__5"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3676:1: rule__InBuiltComputationalService__Group__5 : rule__InBuiltComputationalService__Group__5__Impl rule__InBuiltComputationalService__Group__6 ;
	public final void rule__InBuiltComputationalService__Group__5() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3680:2: ( rule__InBuiltComputationalService__Group__5__Impl rule__InBuiltComputationalService__Group__6 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3681:2: rule__InBuiltComputationalService__Group__5__Impl rule__InBuiltComputationalService__Group__6
			{
			pushFollow(FOLLOW_rule__InBuiltComputationalService__Group__5__Impl_in_rule__InBuiltComputationalService__Group__57450);
			rule__InBuiltComputationalService__Group__5__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__InBuiltComputationalService__Group__6_in_rule__InBuiltComputationalService__Group__57453);
			rule__InBuiltComputationalService__Group__6();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InBuiltComputationalService__Group__5"



	// $ANTLR start "rule__InBuiltComputationalService__Group__5__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3688:1: rule__InBuiltComputationalService__Group__5__Impl : ( ( rule__InBuiltComputationalService__Group_5__0 )? ) ;
	public final void rule__InBuiltComputationalService__Group__5__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3692:1: ( ( ( rule__InBuiltComputationalService__Group_5__0 )? ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3693:1: ( ( rule__InBuiltComputationalService__Group_5__0 )? )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3693:1: ( ( rule__InBuiltComputationalService__Group_5__0 )? )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3694:1: ( rule__InBuiltComputationalService__Group_5__0 )?
			{
			 before(grammarAccess.getInBuiltComputationalServiceAccess().getGroup_5()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3695:2: ( rule__InBuiltComputationalService__Group_5__0 )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==13) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3695:2: rule__InBuiltComputationalService__Group_5__0
					{
					pushFollow(FOLLOW_rule__InBuiltComputationalService__Group_5__0_in_rule__InBuiltComputationalService__Group__5__Impl7480);
					rule__InBuiltComputationalService__Group_5__0();
					state._fsp--;

					}
					break;

			}

			 after(grammarAccess.getInBuiltComputationalServiceAccess().getGroup_5()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InBuiltComputationalService__Group__5__Impl"



	// $ANTLR start "rule__InBuiltComputationalService__Group__6"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3705:1: rule__InBuiltComputationalService__Group__6 : rule__InBuiltComputationalService__Group__6__Impl rule__InBuiltComputationalService__Group__7 ;
	public final void rule__InBuiltComputationalService__Group__6() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3709:2: ( rule__InBuiltComputationalService__Group__6__Impl rule__InBuiltComputationalService__Group__7 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3710:2: rule__InBuiltComputationalService__Group__6__Impl rule__InBuiltComputationalService__Group__7
			{
			pushFollow(FOLLOW_rule__InBuiltComputationalService__Group__6__Impl_in_rule__InBuiltComputationalService__Group__67511);
			rule__InBuiltComputationalService__Group__6__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__InBuiltComputationalService__Group__7_in_rule__InBuiltComputationalService__Group__67514);
			rule__InBuiltComputationalService__Group__7();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InBuiltComputationalService__Group__6"



	// $ANTLR start "rule__InBuiltComputationalService__Group__6__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3717:1: rule__InBuiltComputationalService__Group__6__Impl : ( ')' ) ;
	public final void rule__InBuiltComputationalService__Group__6__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3721:1: ( ( ')' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3722:1: ( ')' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3722:1: ( ')' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3723:1: ')'
			{
			 before(grammarAccess.getInBuiltComputationalServiceAccess().getRightParenthesisKeyword_6()); 
			match(input,12,FOLLOW_12_in_rule__InBuiltComputationalService__Group__6__Impl7542); 
			 after(grammarAccess.getInBuiltComputationalServiceAccess().getRightParenthesisKeyword_6()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InBuiltComputationalService__Group__6__Impl"



	// $ANTLR start "rule__InBuiltComputationalService__Group__7"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3736:1: rule__InBuiltComputationalService__Group__7 : rule__InBuiltComputationalService__Group__7__Impl rule__InBuiltComputationalService__Group__8 ;
	public final void rule__InBuiltComputationalService__Group__7() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3740:2: ( rule__InBuiltComputationalService__Group__7__Impl rule__InBuiltComputationalService__Group__8 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3741:2: rule__InBuiltComputationalService__Group__7__Impl rule__InBuiltComputationalService__Group__8
			{
			pushFollow(FOLLOW_rule__InBuiltComputationalService__Group__7__Impl_in_rule__InBuiltComputationalService__Group__77573);
			rule__InBuiltComputationalService__Group__7__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__InBuiltComputationalService__Group__8_in_rule__InBuiltComputationalService__Group__77576);
			rule__InBuiltComputationalService__Group__8();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InBuiltComputationalService__Group__7"



	// $ANTLR start "rule__InBuiltComputationalService__Group__7__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3748:1: rule__InBuiltComputationalService__Group__7__Impl : ( ';' ) ;
	public final void rule__InBuiltComputationalService__Group__7__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3752:1: ( ( ';' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3753:1: ( ';' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3753:1: ( ';' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3754:1: ';'
			{
			 before(grammarAccess.getInBuiltComputationalServiceAccess().getSemicolonKeyword_7()); 
			match(input,15,FOLLOW_15_in_rule__InBuiltComputationalService__Group__7__Impl7604); 
			 after(grammarAccess.getInBuiltComputationalServiceAccess().getSemicolonKeyword_7()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InBuiltComputationalService__Group__7__Impl"



	// $ANTLR start "rule__InBuiltComputationalService__Group__8"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3767:1: rule__InBuiltComputationalService__Group__8 : rule__InBuiltComputationalService__Group__8__Impl ;
	public final void rule__InBuiltComputationalService__Group__8() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3771:2: ( rule__InBuiltComputationalService__Group__8__Impl )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3772:2: rule__InBuiltComputationalService__Group__8__Impl
			{
			pushFollow(FOLLOW_rule__InBuiltComputationalService__Group__8__Impl_in_rule__InBuiltComputationalService__Group__87635);
			rule__InBuiltComputationalService__Group__8__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InBuiltComputationalService__Group__8"



	// $ANTLR start "rule__InBuiltComputationalService__Group__8__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3778:1: rule__InBuiltComputationalService__Group__8__Impl : ( ( ( rule__InBuiltComputationalService__GenerateInfoAssignment_8 ) ) ( ( rule__InBuiltComputationalService__GenerateInfoAssignment_8 )* ) ) ;
	public final void rule__InBuiltComputationalService__Group__8__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3782:1: ( ( ( ( rule__InBuiltComputationalService__GenerateInfoAssignment_8 ) ) ( ( rule__InBuiltComputationalService__GenerateInfoAssignment_8 )* ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3783:1: ( ( ( rule__InBuiltComputationalService__GenerateInfoAssignment_8 ) ) ( ( rule__InBuiltComputationalService__GenerateInfoAssignment_8 )* ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3783:1: ( ( ( rule__InBuiltComputationalService__GenerateInfoAssignment_8 ) ) ( ( rule__InBuiltComputationalService__GenerateInfoAssignment_8 )* ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3784:1: ( ( rule__InBuiltComputationalService__GenerateInfoAssignment_8 ) ) ( ( rule__InBuiltComputationalService__GenerateInfoAssignment_8 )* )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3784:1: ( ( rule__InBuiltComputationalService__GenerateInfoAssignment_8 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3785:1: ( rule__InBuiltComputationalService__GenerateInfoAssignment_8 )
			{
			 before(grammarAccess.getInBuiltComputationalServiceAccess().getGenerateInfoAssignment_8()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3786:2: ( rule__InBuiltComputationalService__GenerateInfoAssignment_8 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3786:2: rule__InBuiltComputationalService__GenerateInfoAssignment_8
			{
			pushFollow(FOLLOW_rule__InBuiltComputationalService__GenerateInfoAssignment_8_in_rule__InBuiltComputationalService__Group__8__Impl7664);
			rule__InBuiltComputationalService__GenerateInfoAssignment_8();
			state._fsp--;

			}

			 after(grammarAccess.getInBuiltComputationalServiceAccess().getGenerateInfoAssignment_8()); 
			}

			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3789:1: ( ( rule__InBuiltComputationalService__GenerateInfoAssignment_8 )* )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3790:1: ( rule__InBuiltComputationalService__GenerateInfoAssignment_8 )*
			{
			 before(grammarAccess.getInBuiltComputationalServiceAccess().getGenerateInfoAssignment_8()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3791:2: ( rule__InBuiltComputationalService__GenerateInfoAssignment_8 )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==41) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3791:2: rule__InBuiltComputationalService__GenerateInfoAssignment_8
					{
					pushFollow(FOLLOW_rule__InBuiltComputationalService__GenerateInfoAssignment_8_in_rule__InBuiltComputationalService__Group__8__Impl7676);
					rule__InBuiltComputationalService__GenerateInfoAssignment_8();
					state._fsp--;

					}
					break;

				default :
					break loop20;
				}
			}

			 after(grammarAccess.getInBuiltComputationalServiceAccess().getGenerateInfoAssignment_8()); 
			}

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InBuiltComputationalService__Group__8__Impl"



	// $ANTLR start "rule__InBuiltComputationalService__Group_5__0"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3820:1: rule__InBuiltComputationalService__Group_5__0 : rule__InBuiltComputationalService__Group_5__0__Impl rule__InBuiltComputationalService__Group_5__1 ;
	public final void rule__InBuiltComputationalService__Group_5__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3824:2: ( rule__InBuiltComputationalService__Group_5__0__Impl rule__InBuiltComputationalService__Group_5__1 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3825:2: rule__InBuiltComputationalService__Group_5__0__Impl rule__InBuiltComputationalService__Group_5__1
			{
			pushFollow(FOLLOW_rule__InBuiltComputationalService__Group_5__0__Impl_in_rule__InBuiltComputationalService__Group_5__07727);
			rule__InBuiltComputationalService__Group_5__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__InBuiltComputationalService__Group_5__1_in_rule__InBuiltComputationalService__Group_5__07730);
			rule__InBuiltComputationalService__Group_5__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InBuiltComputationalService__Group_5__0"



	// $ANTLR start "rule__InBuiltComputationalService__Group_5__0__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3832:1: rule__InBuiltComputationalService__Group_5__0__Impl : ( ',' ) ;
	public final void rule__InBuiltComputationalService__Group_5__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3836:1: ( ( ',' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3837:1: ( ',' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3837:1: ( ',' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3838:1: ','
			{
			 before(grammarAccess.getInBuiltComputationalServiceAccess().getCommaKeyword_5_0()); 
			match(input,13,FOLLOW_13_in_rule__InBuiltComputationalService__Group_5__0__Impl7758); 
			 after(grammarAccess.getInBuiltComputationalServiceAccess().getCommaKeyword_5_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InBuiltComputationalService__Group_5__0__Impl"



	// $ANTLR start "rule__InBuiltComputationalService__Group_5__1"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3851:1: rule__InBuiltComputationalService__Group_5__1 : rule__InBuiltComputationalService__Group_5__1__Impl ;
	public final void rule__InBuiltComputationalService__Group_5__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3855:2: ( rule__InBuiltComputationalService__Group_5__1__Impl )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3856:2: rule__InBuiltComputationalService__Group_5__1__Impl
			{
			pushFollow(FOLLOW_rule__InBuiltComputationalService__Group_5__1__Impl_in_rule__InBuiltComputationalService__Group_5__17789);
			rule__InBuiltComputationalService__Group_5__1__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InBuiltComputationalService__Group_5__1"



	// $ANTLR start "rule__InBuiltComputationalService__Group_5__1__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3862:1: rule__InBuiltComputationalService__Group_5__1__Impl : ( ( rule__InBuiltComputationalService__OperationParameterAssignment_5_1 ) ) ;
	public final void rule__InBuiltComputationalService__Group_5__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3866:1: ( ( ( rule__InBuiltComputationalService__OperationParameterAssignment_5_1 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3867:1: ( ( rule__InBuiltComputationalService__OperationParameterAssignment_5_1 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3867:1: ( ( rule__InBuiltComputationalService__OperationParameterAssignment_5_1 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3868:1: ( rule__InBuiltComputationalService__OperationParameterAssignment_5_1 )
			{
			 before(grammarAccess.getInBuiltComputationalServiceAccess().getOperationParameterAssignment_5_1()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3869:2: ( rule__InBuiltComputationalService__OperationParameterAssignment_5_1 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3869:2: rule__InBuiltComputationalService__OperationParameterAssignment_5_1
			{
			pushFollow(FOLLOW_rule__InBuiltComputationalService__OperationParameterAssignment_5_1_in_rule__InBuiltComputationalService__Group_5__1__Impl7816);
			rule__InBuiltComputationalService__OperationParameterAssignment_5_1();
			state._fsp--;

			}

			 after(grammarAccess.getInBuiltComputationalServiceAccess().getOperationParameterAssignment_5_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InBuiltComputationalService__Group_5__1__Impl"



	// $ANTLR start "rule__CustomComputationalService__Group__0"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3883:1: rule__CustomComputationalService__Group__0 : rule__CustomComputationalService__Group__0__Impl rule__CustomComputationalService__Group__1 ;
	public final void rule__CustomComputationalService__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3887:2: ( rule__CustomComputationalService__Group__0__Impl rule__CustomComputationalService__Group__1 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3888:2: rule__CustomComputationalService__Group__0__Impl rule__CustomComputationalService__Group__1
			{
			pushFollow(FOLLOW_rule__CustomComputationalService__Group__0__Impl_in_rule__CustomComputationalService__Group__07850);
			rule__CustomComputationalService__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__CustomComputationalService__Group__1_in_rule__CustomComputationalService__Group__07853);
			rule__CustomComputationalService__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__CustomComputationalService__Group__0"



	// $ANTLR start "rule__CustomComputationalService__Group__0__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3895:1: rule__CustomComputationalService__Group__0__Impl : ( ( rule__CustomComputationalService__CustomComputationalServiceNameAssignment_0 ) ) ;
	public final void rule__CustomComputationalService__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3899:1: ( ( ( rule__CustomComputationalService__CustomComputationalServiceNameAssignment_0 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3900:1: ( ( rule__CustomComputationalService__CustomComputationalServiceNameAssignment_0 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3900:1: ( ( rule__CustomComputationalService__CustomComputationalServiceNameAssignment_0 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3901:1: ( rule__CustomComputationalService__CustomComputationalServiceNameAssignment_0 )
			{
			 before(grammarAccess.getCustomComputationalServiceAccess().getCustomComputationalServiceNameAssignment_0()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3902:2: ( rule__CustomComputationalService__CustomComputationalServiceNameAssignment_0 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3902:2: rule__CustomComputationalService__CustomComputationalServiceNameAssignment_0
			{
			pushFollow(FOLLOW_rule__CustomComputationalService__CustomComputationalServiceNameAssignment_0_in_rule__CustomComputationalService__Group__0__Impl7880);
			rule__CustomComputationalService__CustomComputationalServiceNameAssignment_0();
			state._fsp--;

			}

			 after(grammarAccess.getCustomComputationalServiceAccess().getCustomComputationalServiceNameAssignment_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__CustomComputationalService__Group__0__Impl"



	// $ANTLR start "rule__CustomComputationalService__Group__1"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3912:1: rule__CustomComputationalService__Group__1 : rule__CustomComputationalService__Group__1__Impl rule__CustomComputationalService__Group__2 ;
	public final void rule__CustomComputationalService__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3916:2: ( rule__CustomComputationalService__Group__1__Impl rule__CustomComputationalService__Group__2 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3917:2: rule__CustomComputationalService__Group__1__Impl rule__CustomComputationalService__Group__2
			{
			pushFollow(FOLLOW_rule__CustomComputationalService__Group__1__Impl_in_rule__CustomComputationalService__Group__17910);
			rule__CustomComputationalService__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__CustomComputationalService__Group__2_in_rule__CustomComputationalService__Group__17913);
			rule__CustomComputationalService__Group__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__CustomComputationalService__Group__1"



	// $ANTLR start "rule__CustomComputationalService__Group__1__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3924:1: rule__CustomComputationalService__Group__1__Impl : ( ( ( rule__CustomComputationalService__ConsumesAssignment_1 ) ) ( ( rule__CustomComputationalService__ConsumesAssignment_1 )* ) ) ;
	public final void rule__CustomComputationalService__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3928:1: ( ( ( ( rule__CustomComputationalService__ConsumesAssignment_1 ) ) ( ( rule__CustomComputationalService__ConsumesAssignment_1 )* ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3929:1: ( ( ( rule__CustomComputationalService__ConsumesAssignment_1 ) ) ( ( rule__CustomComputationalService__ConsumesAssignment_1 )* ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3929:1: ( ( ( rule__CustomComputationalService__ConsumesAssignment_1 ) ) ( ( rule__CustomComputationalService__ConsumesAssignment_1 )* ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3930:1: ( ( rule__CustomComputationalService__ConsumesAssignment_1 ) ) ( ( rule__CustomComputationalService__ConsumesAssignment_1 )* )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3930:1: ( ( rule__CustomComputationalService__ConsumesAssignment_1 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3931:1: ( rule__CustomComputationalService__ConsumesAssignment_1 )
			{
			 before(grammarAccess.getCustomComputationalServiceAccess().getConsumesAssignment_1()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3932:2: ( rule__CustomComputationalService__ConsumesAssignment_1 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3932:2: rule__CustomComputationalService__ConsumesAssignment_1
			{
			pushFollow(FOLLOW_rule__CustomComputationalService__ConsumesAssignment_1_in_rule__CustomComputationalService__Group__1__Impl7942);
			rule__CustomComputationalService__ConsumesAssignment_1();
			state._fsp--;

			}

			 after(grammarAccess.getCustomComputationalServiceAccess().getConsumesAssignment_1()); 
			}

			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3935:1: ( ( rule__CustomComputationalService__ConsumesAssignment_1 )* )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3936:1: ( rule__CustomComputationalService__ConsumesAssignment_1 )*
			{
			 before(grammarAccess.getCustomComputationalServiceAccess().getConsumesAssignment_1()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3937:2: ( rule__CustomComputationalService__ConsumesAssignment_1 )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==33) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3937:2: rule__CustomComputationalService__ConsumesAssignment_1
					{
					pushFollow(FOLLOW_rule__CustomComputationalService__ConsumesAssignment_1_in_rule__CustomComputationalService__Group__1__Impl7954);
					rule__CustomComputationalService__ConsumesAssignment_1();
					state._fsp--;

					}
					break;

				default :
					break loop21;
				}
			}

			 after(grammarAccess.getCustomComputationalServiceAccess().getConsumesAssignment_1()); 
			}

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__CustomComputationalService__Group__1__Impl"



	// $ANTLR start "rule__CustomComputationalService__Group__2"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3948:1: rule__CustomComputationalService__Group__2 : rule__CustomComputationalService__Group__2__Impl rule__CustomComputationalService__Group__3 ;
	public final void rule__CustomComputationalService__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3952:2: ( rule__CustomComputationalService__Group__2__Impl rule__CustomComputationalService__Group__3 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3953:2: rule__CustomComputationalService__Group__2__Impl rule__CustomComputationalService__Group__3
			{
			pushFollow(FOLLOW_rule__CustomComputationalService__Group__2__Impl_in_rule__CustomComputationalService__Group__27987);
			rule__CustomComputationalService__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__CustomComputationalService__Group__3_in_rule__CustomComputationalService__Group__27990);
			rule__CustomComputationalService__Group__3();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__CustomComputationalService__Group__2"



	// $ANTLR start "rule__CustomComputationalService__Group__2__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3960:1: rule__CustomComputationalService__Group__2__Impl : ( ( rule__CustomComputationalService__RequestsAssignment_2 )* ) ;
	public final void rule__CustomComputationalService__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3964:1: ( ( ( rule__CustomComputationalService__RequestsAssignment_2 )* ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3965:1: ( ( rule__CustomComputationalService__RequestsAssignment_2 )* )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3965:1: ( ( rule__CustomComputationalService__RequestsAssignment_2 )* )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3966:1: ( rule__CustomComputationalService__RequestsAssignment_2 )*
			{
			 before(grammarAccess.getCustomComputationalServiceAccess().getRequestsAssignment_2()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3967:2: ( rule__CustomComputationalService__RequestsAssignment_2 )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==51) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3967:2: rule__CustomComputationalService__RequestsAssignment_2
					{
					pushFollow(FOLLOW_rule__CustomComputationalService__RequestsAssignment_2_in_rule__CustomComputationalService__Group__2__Impl8017);
					rule__CustomComputationalService__RequestsAssignment_2();
					state._fsp--;

					}
					break;

				default :
					break loop22;
				}
			}

			 after(grammarAccess.getCustomComputationalServiceAccess().getRequestsAssignment_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__CustomComputationalService__Group__2__Impl"



	// $ANTLR start "rule__CustomComputationalService__Group__3"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3977:1: rule__CustomComputationalService__Group__3 : rule__CustomComputationalService__Group__3__Impl rule__CustomComputationalService__Group__4 ;
	public final void rule__CustomComputationalService__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3981:2: ( rule__CustomComputationalService__Group__3__Impl rule__CustomComputationalService__Group__4 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3982:2: rule__CustomComputationalService__Group__3__Impl rule__CustomComputationalService__Group__4
			{
			pushFollow(FOLLOW_rule__CustomComputationalService__Group__3__Impl_in_rule__CustomComputationalService__Group__38048);
			rule__CustomComputationalService__Group__3__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__CustomComputationalService__Group__4_in_rule__CustomComputationalService__Group__38051);
			rule__CustomComputationalService__Group__4();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__CustomComputationalService__Group__3"



	// $ANTLR start "rule__CustomComputationalService__Group__3__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3989:1: rule__CustomComputationalService__Group__3__Impl : ( ( rule__CustomComputationalService__GenerateInfoAssignment_3 )* ) ;
	public final void rule__CustomComputationalService__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3993:1: ( ( ( rule__CustomComputationalService__GenerateInfoAssignment_3 )* ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3994:1: ( ( rule__CustomComputationalService__GenerateInfoAssignment_3 )* )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3994:1: ( ( rule__CustomComputationalService__GenerateInfoAssignment_3 )* )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3995:1: ( rule__CustomComputationalService__GenerateInfoAssignment_3 )*
			{
			 before(grammarAccess.getCustomComputationalServiceAccess().getGenerateInfoAssignment_3()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3996:2: ( rule__CustomComputationalService__GenerateInfoAssignment_3 )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==41) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3996:2: rule__CustomComputationalService__GenerateInfoAssignment_3
					{
					pushFollow(FOLLOW_rule__CustomComputationalService__GenerateInfoAssignment_3_in_rule__CustomComputationalService__Group__3__Impl8078);
					rule__CustomComputationalService__GenerateInfoAssignment_3();
					state._fsp--;

					}
					break;

				default :
					break loop23;
				}
			}

			 after(grammarAccess.getCustomComputationalServiceAccess().getGenerateInfoAssignment_3()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__CustomComputationalService__Group__3__Impl"



	// $ANTLR start "rule__CustomComputationalService__Group__4"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4006:1: rule__CustomComputationalService__Group__4 : rule__CustomComputationalService__Group__4__Impl ;
	public final void rule__CustomComputationalService__Group__4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4010:2: ( rule__CustomComputationalService__Group__4__Impl )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4011:2: rule__CustomComputationalService__Group__4__Impl
			{
			pushFollow(FOLLOW_rule__CustomComputationalService__Group__4__Impl_in_rule__CustomComputationalService__Group__48109);
			rule__CustomComputationalService__Group__4__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__CustomComputationalService__Group__4"



	// $ANTLR start "rule__CustomComputationalService__Group__4__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4017:1: rule__CustomComputationalService__Group__4__Impl : ( ( rule__CustomComputationalService__CommandsAssignment_4 )* ) ;
	public final void rule__CustomComputationalService__Group__4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4021:1: ( ( ( rule__CustomComputationalService__CommandsAssignment_4 )* ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4022:1: ( ( rule__CustomComputationalService__CommandsAssignment_4 )* )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4022:1: ( ( rule__CustomComputationalService__CommandsAssignment_4 )* )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4023:1: ( rule__CustomComputationalService__CommandsAssignment_4 )*
			{
			 before(grammarAccess.getCustomComputationalServiceAccess().getCommandsAssignment_4()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4024:2: ( rule__CustomComputationalService__CommandsAssignment_4 )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==31) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4024:2: rule__CustomComputationalService__CommandsAssignment_4
					{
					pushFollow(FOLLOW_rule__CustomComputationalService__CommandsAssignment_4_in_rule__CustomComputationalService__Group__4__Impl8136);
					rule__CustomComputationalService__CommandsAssignment_4();
					state._fsp--;

					}
					break;

				default :
					break loop24;
				}
			}

			 after(grammarAccess.getCustomComputationalServiceAccess().getCommandsAssignment_4()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__CustomComputationalService__Group__4__Impl"



	// $ANTLR start "rule__Request__Group__0"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4044:1: rule__Request__Group__0 : rule__Request__Group__0__Impl rule__Request__Group__1 ;
	public final void rule__Request__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4048:2: ( rule__Request__Group__0__Impl rule__Request__Group__1 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4049:2: rule__Request__Group__0__Impl rule__Request__Group__1
			{
			pushFollow(FOLLOW_rule__Request__Group__0__Impl_in_rule__Request__Group__08177);
			rule__Request__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Request__Group__1_in_rule__Request__Group__08180);
			rule__Request__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Request__Group__0"



	// $ANTLR start "rule__Request__Group__0__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4056:1: rule__Request__Group__0__Impl : ( 'request' ) ;
	public final void rule__Request__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4060:1: ( ( 'request' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4061:1: ( 'request' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4061:1: ( 'request' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4062:1: 'request'
			{
			 before(grammarAccess.getRequestAccess().getRequestKeyword_0()); 
			match(input,51,FOLLOW_51_in_rule__Request__Group__0__Impl8208); 
			 after(grammarAccess.getRequestAccess().getRequestKeyword_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Request__Group__0__Impl"



	// $ANTLR start "rule__Request__Group__1"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4075:1: rule__Request__Group__1 : rule__Request__Group__1__Impl rule__Request__Group__2 ;
	public final void rule__Request__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4079:2: ( rule__Request__Group__1__Impl rule__Request__Group__2 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4080:2: rule__Request__Group__1__Impl rule__Request__Group__2
			{
			pushFollow(FOLLOW_rule__Request__Group__1__Impl_in_rule__Request__Group__18239);
			rule__Request__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Request__Group__2_in_rule__Request__Group__18242);
			rule__Request__Group__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Request__Group__1"



	// $ANTLR start "rule__Request__Group__1__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4087:1: rule__Request__Group__1__Impl : ( ( rule__Request__RequestnameAssignment_1 ) ) ;
	public final void rule__Request__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4091:1: ( ( ( rule__Request__RequestnameAssignment_1 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4092:1: ( ( rule__Request__RequestnameAssignment_1 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4092:1: ( ( rule__Request__RequestnameAssignment_1 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4093:1: ( rule__Request__RequestnameAssignment_1 )
			{
			 before(grammarAccess.getRequestAccess().getRequestnameAssignment_1()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4094:2: ( rule__Request__RequestnameAssignment_1 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4094:2: rule__Request__RequestnameAssignment_1
			{
			pushFollow(FOLLOW_rule__Request__RequestnameAssignment_1_in_rule__Request__Group__1__Impl8269);
			rule__Request__RequestnameAssignment_1();
			state._fsp--;

			}

			 after(grammarAccess.getRequestAccess().getRequestnameAssignment_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Request__Group__1__Impl"



	// $ANTLR start "rule__Request__Group__2"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4104:1: rule__Request__Group__2 : rule__Request__Group__2__Impl rule__Request__Group__3 ;
	public final void rule__Request__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4108:2: ( rule__Request__Group__2__Impl rule__Request__Group__3 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4109:2: rule__Request__Group__2__Impl rule__Request__Group__3
			{
			pushFollow(FOLLOW_rule__Request__Group__2__Impl_in_rule__Request__Group__28299);
			rule__Request__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Request__Group__3_in_rule__Request__Group__28302);
			rule__Request__Group__3();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Request__Group__2"



	// $ANTLR start "rule__Request__Group__2__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4116:1: rule__Request__Group__2__Impl : ( 'to' ) ;
	public final void rule__Request__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4120:1: ( ( 'to' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4121:1: ( 'to' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4121:1: ( 'to' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4122:1: 'to'
			{
			 before(grammarAccess.getRequestAccess().getToKeyword_2()); 
			match(input,58,FOLLOW_58_in_rule__Request__Group__2__Impl8330); 
			 after(grammarAccess.getRequestAccess().getToKeyword_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Request__Group__2__Impl"



	// $ANTLR start "rule__Request__Group__3"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4135:1: rule__Request__Group__3 : rule__Request__Group__3__Impl rule__Request__Group__4 ;
	public final void rule__Request__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4139:2: ( rule__Request__Group__3__Impl rule__Request__Group__4 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4140:2: rule__Request__Group__3__Impl rule__Request__Group__4
			{
			pushFollow(FOLLOW_rule__Request__Group__3__Impl_in_rule__Request__Group__38361);
			rule__Request__Group__3__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Request__Group__4_in_rule__Request__Group__38364);
			rule__Request__Group__4();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Request__Group__3"



	// $ANTLR start "rule__Request__Group__3__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4147:1: rule__Request__Group__3__Impl : ( ( rule__Request__StorageForRequestAssignment_3 ) ) ;
	public final void rule__Request__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4151:1: ( ( ( rule__Request__StorageForRequestAssignment_3 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4152:1: ( ( rule__Request__StorageForRequestAssignment_3 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4152:1: ( ( rule__Request__StorageForRequestAssignment_3 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4153:1: ( rule__Request__StorageForRequestAssignment_3 )
			{
			 before(grammarAccess.getRequestAccess().getStorageForRequestAssignment_3()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4154:2: ( rule__Request__StorageForRequestAssignment_3 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4154:2: rule__Request__StorageForRequestAssignment_3
			{
			pushFollow(FOLLOW_rule__Request__StorageForRequestAssignment_3_in_rule__Request__Group__3__Impl8391);
			rule__Request__StorageForRequestAssignment_3();
			state._fsp--;

			}

			 after(grammarAccess.getRequestAccess().getStorageForRequestAssignment_3()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Request__Group__3__Impl"



	// $ANTLR start "rule__Request__Group__4"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4164:1: rule__Request__Group__4 : rule__Request__Group__4__Impl ;
	public final void rule__Request__Group__4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4168:2: ( rule__Request__Group__4__Impl )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4169:2: rule__Request__Group__4__Impl
			{
			pushFollow(FOLLOW_rule__Request__Group__4__Impl_in_rule__Request__Group__48421);
			rule__Request__Group__4__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Request__Group__4"



	// $ANTLR start "rule__Request__Group__4__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4175:1: rule__Request__Group__4__Impl : ( ';' ) ;
	public final void rule__Request__Group__4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4179:1: ( ( ';' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4180:1: ( ';' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4180:1: ( ';' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4181:1: ';'
			{
			 before(grammarAccess.getRequestAccess().getSemicolonKeyword_4()); 
			match(input,15,FOLLOW_15_in_rule__Request__Group__4__Impl8449); 
			 after(grammarAccess.getRequestAccess().getSemicolonKeyword_4()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Request__Group__4__Impl"



	// $ANTLR start "rule__ConsumeForInBuilt__Group__0"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4204:1: rule__ConsumeForInBuilt__Group__0 : rule__ConsumeForInBuilt__Group__0__Impl rule__ConsumeForInBuilt__Group__1 ;
	public final void rule__ConsumeForInBuilt__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4208:2: ( rule__ConsumeForInBuilt__Group__0__Impl rule__ConsumeForInBuilt__Group__1 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4209:2: rule__ConsumeForInBuilt__Group__0__Impl rule__ConsumeForInBuilt__Group__1
			{
			pushFollow(FOLLOW_rule__ConsumeForInBuilt__Group__0__Impl_in_rule__ConsumeForInBuilt__Group__08490);
			rule__ConsumeForInBuilt__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ConsumeForInBuilt__Group__1_in_rule__ConsumeForInBuilt__Group__08493);
			rule__ConsumeForInBuilt__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ConsumeForInBuilt__Group__0"



	// $ANTLR start "rule__ConsumeForInBuilt__Group__0__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4216:1: rule__ConsumeForInBuilt__Group__0__Impl : ( 'consume' ) ;
	public final void rule__ConsumeForInBuilt__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4220:1: ( ( 'consume' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4221:1: ( 'consume' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4221:1: ( 'consume' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4222:1: 'consume'
			{
			 before(grammarAccess.getConsumeForInBuiltAccess().getConsumeKeyword_0()); 
			match(input,33,FOLLOW_33_in_rule__ConsumeForInBuilt__Group__0__Impl8521); 
			 after(grammarAccess.getConsumeForInBuiltAccess().getConsumeKeyword_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ConsumeForInBuilt__Group__0__Impl"



	// $ANTLR start "rule__ConsumeForInBuilt__Group__1"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4235:1: rule__ConsumeForInBuilt__Group__1 : rule__ConsumeForInBuilt__Group__1__Impl rule__ConsumeForInBuilt__Group__2 ;
	public final void rule__ConsumeForInBuilt__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4239:2: ( rule__ConsumeForInBuilt__Group__1__Impl rule__ConsumeForInBuilt__Group__2 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4240:2: rule__ConsumeForInBuilt__Group__1__Impl rule__ConsumeForInBuilt__Group__2
			{
			pushFollow(FOLLOW_rule__ConsumeForInBuilt__Group__1__Impl_in_rule__ConsumeForInBuilt__Group__18552);
			rule__ConsumeForInBuilt__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ConsumeForInBuilt__Group__2_in_rule__ConsumeForInBuilt__Group__18555);
			rule__ConsumeForInBuilt__Group__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ConsumeForInBuilt__Group__1"



	// $ANTLR start "rule__ConsumeForInBuilt__Group__1__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4247:1: rule__ConsumeForInBuilt__Group__1__Impl : ( ( rule__ConsumeForInBuilt__NameAssignment_1 ) ) ;
	public final void rule__ConsumeForInBuilt__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4251:1: ( ( ( rule__ConsumeForInBuilt__NameAssignment_1 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4252:1: ( ( rule__ConsumeForInBuilt__NameAssignment_1 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4252:1: ( ( rule__ConsumeForInBuilt__NameAssignment_1 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4253:1: ( rule__ConsumeForInBuilt__NameAssignment_1 )
			{
			 before(grammarAccess.getConsumeForInBuiltAccess().getNameAssignment_1()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4254:2: ( rule__ConsumeForInBuilt__NameAssignment_1 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4254:2: rule__ConsumeForInBuilt__NameAssignment_1
			{
			pushFollow(FOLLOW_rule__ConsumeForInBuilt__NameAssignment_1_in_rule__ConsumeForInBuilt__Group__1__Impl8582);
			rule__ConsumeForInBuilt__NameAssignment_1();
			state._fsp--;

			}

			 after(grammarAccess.getConsumeForInBuiltAccess().getNameAssignment_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ConsumeForInBuilt__Group__1__Impl"



	// $ANTLR start "rule__ConsumeForInBuilt__Group__2"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4264:1: rule__ConsumeForInBuilt__Group__2 : rule__ConsumeForInBuilt__Group__2__Impl rule__ConsumeForInBuilt__Group__3 ;
	public final void rule__ConsumeForInBuilt__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4268:2: ( rule__ConsumeForInBuilt__Group__2__Impl rule__ConsumeForInBuilt__Group__3 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4269:2: rule__ConsumeForInBuilt__Group__2__Impl rule__ConsumeForInBuilt__Group__3
			{
			pushFollow(FOLLOW_rule__ConsumeForInBuilt__Group__2__Impl_in_rule__ConsumeForInBuilt__Group__28612);
			rule__ConsumeForInBuilt__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ConsumeForInBuilt__Group__3_in_rule__ConsumeForInBuilt__Group__28615);
			rule__ConsumeForInBuilt__Group__3();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ConsumeForInBuilt__Group__2"



	// $ANTLR start "rule__ConsumeForInBuilt__Group__2__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4276:1: rule__ConsumeForInBuilt__Group__2__Impl : ( 'from' ) ;
	public final void rule__ConsumeForInBuilt__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4280:1: ( ( 'from' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4281:1: ( 'from' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4281:1: ( 'from' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4282:1: 'from'
			{
			 before(grammarAccess.getConsumeForInBuiltAccess().getFromKeyword_2()); 
			match(input,40,FOLLOW_40_in_rule__ConsumeForInBuilt__Group__2__Impl8643); 
			 after(grammarAccess.getConsumeForInBuiltAccess().getFromKeyword_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ConsumeForInBuilt__Group__2__Impl"



	// $ANTLR start "rule__ConsumeForInBuilt__Group__3"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4295:1: rule__ConsumeForInBuilt__Group__3 : rule__ConsumeForInBuilt__Group__3__Impl rule__ConsumeForInBuilt__Group__4 ;
	public final void rule__ConsumeForInBuilt__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4299:2: ( rule__ConsumeForInBuilt__Group__3__Impl rule__ConsumeForInBuilt__Group__4 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4300:2: rule__ConsumeForInBuilt__Group__3__Impl rule__ConsumeForInBuilt__Group__4
			{
			pushFollow(FOLLOW_rule__ConsumeForInBuilt__Group__3__Impl_in_rule__ConsumeForInBuilt__Group__38674);
			rule__ConsumeForInBuilt__Group__3__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ConsumeForInBuilt__Group__4_in_rule__ConsumeForInBuilt__Group__38677);
			rule__ConsumeForInBuilt__Group__4();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ConsumeForInBuilt__Group__3"



	// $ANTLR start "rule__ConsumeForInBuilt__Group__3__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4307:1: rule__ConsumeForInBuilt__Group__3__Impl : ( ( rule__ConsumeForInBuilt__SensorForConsumeAssignment_3 ) ) ;
	public final void rule__ConsumeForInBuilt__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4311:1: ( ( ( rule__ConsumeForInBuilt__SensorForConsumeAssignment_3 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4312:1: ( ( rule__ConsumeForInBuilt__SensorForConsumeAssignment_3 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4312:1: ( ( rule__ConsumeForInBuilt__SensorForConsumeAssignment_3 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4313:1: ( rule__ConsumeForInBuilt__SensorForConsumeAssignment_3 )
			{
			 before(grammarAccess.getConsumeForInBuiltAccess().getSensorForConsumeAssignment_3()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4314:2: ( rule__ConsumeForInBuilt__SensorForConsumeAssignment_3 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4314:2: rule__ConsumeForInBuilt__SensorForConsumeAssignment_3
			{
			pushFollow(FOLLOW_rule__ConsumeForInBuilt__SensorForConsumeAssignment_3_in_rule__ConsumeForInBuilt__Group__3__Impl8704);
			rule__ConsumeForInBuilt__SensorForConsumeAssignment_3();
			state._fsp--;

			}

			 after(grammarAccess.getConsumeForInBuiltAccess().getSensorForConsumeAssignment_3()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ConsumeForInBuilt__Group__3__Impl"



	// $ANTLR start "rule__ConsumeForInBuilt__Group__4"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4324:1: rule__ConsumeForInBuilt__Group__4 : rule__ConsumeForInBuilt__Group__4__Impl ;
	public final void rule__ConsumeForInBuilt__Group__4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4328:2: ( rule__ConsumeForInBuilt__Group__4__Impl )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4329:2: rule__ConsumeForInBuilt__Group__4__Impl
			{
			pushFollow(FOLLOW_rule__ConsumeForInBuilt__Group__4__Impl_in_rule__ConsumeForInBuilt__Group__48734);
			rule__ConsumeForInBuilt__Group__4__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ConsumeForInBuilt__Group__4"



	// $ANTLR start "rule__ConsumeForInBuilt__Group__4__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4335:1: rule__ConsumeForInBuilt__Group__4__Impl : ( ';' ) ;
	public final void rule__ConsumeForInBuilt__Group__4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4339:1: ( ( ';' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4340:1: ( ';' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4340:1: ( ';' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4341:1: ';'
			{
			 before(grammarAccess.getConsumeForInBuiltAccess().getSemicolonKeyword_4()); 
			match(input,15,FOLLOW_15_in_rule__ConsumeForInBuilt__Group__4__Impl8762); 
			 after(grammarAccess.getConsumeForInBuiltAccess().getSemicolonKeyword_4()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ConsumeForInBuilt__Group__4__Impl"



	// $ANTLR start "rule__Consume__Group__0"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4364:1: rule__Consume__Group__0 : rule__Consume__Group__0__Impl rule__Consume__Group__1 ;
	public final void rule__Consume__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4368:2: ( rule__Consume__Group__0__Impl rule__Consume__Group__1 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4369:2: rule__Consume__Group__0__Impl rule__Consume__Group__1
			{
			pushFollow(FOLLOW_rule__Consume__Group__0__Impl_in_rule__Consume__Group__08803);
			rule__Consume__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Consume__Group__1_in_rule__Consume__Group__08806);
			rule__Consume__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Consume__Group__0"



	// $ANTLR start "rule__Consume__Group__0__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4376:1: rule__Consume__Group__0__Impl : ( 'consume' ) ;
	public final void rule__Consume__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4380:1: ( ( 'consume' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4381:1: ( 'consume' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4381:1: ( 'consume' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4382:1: 'consume'
			{
			 before(grammarAccess.getConsumeAccess().getConsumeKeyword_0()); 
			match(input,33,FOLLOW_33_in_rule__Consume__Group__0__Impl8834); 
			 after(grammarAccess.getConsumeAccess().getConsumeKeyword_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Consume__Group__0__Impl"



	// $ANTLR start "rule__Consume__Group__1"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4395:1: rule__Consume__Group__1 : rule__Consume__Group__1__Impl rule__Consume__Group__2 ;
	public final void rule__Consume__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4399:2: ( rule__Consume__Group__1__Impl rule__Consume__Group__2 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4400:2: rule__Consume__Group__1__Impl rule__Consume__Group__2
			{
			pushFollow(FOLLOW_rule__Consume__Group__1__Impl_in_rule__Consume__Group__18865);
			rule__Consume__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Consume__Group__2_in_rule__Consume__Group__18868);
			rule__Consume__Group__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Consume__Group__1"



	// $ANTLR start "rule__Consume__Group__1__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4407:1: rule__Consume__Group__1__Impl : ( ( rule__Consume__NameAssignment_1 ) ) ;
	public final void rule__Consume__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4411:1: ( ( ( rule__Consume__NameAssignment_1 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4412:1: ( ( rule__Consume__NameAssignment_1 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4412:1: ( ( rule__Consume__NameAssignment_1 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4413:1: ( rule__Consume__NameAssignment_1 )
			{
			 before(grammarAccess.getConsumeAccess().getNameAssignment_1()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4414:2: ( rule__Consume__NameAssignment_1 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4414:2: rule__Consume__NameAssignment_1
			{
			pushFollow(FOLLOW_rule__Consume__NameAssignment_1_in_rule__Consume__Group__1__Impl8895);
			rule__Consume__NameAssignment_1();
			state._fsp--;

			}

			 after(grammarAccess.getConsumeAccess().getNameAssignment_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Consume__Group__1__Impl"



	// $ANTLR start "rule__Consume__Group__2"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4424:1: rule__Consume__Group__2 : rule__Consume__Group__2__Impl rule__Consume__Group__3 ;
	public final void rule__Consume__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4428:2: ( rule__Consume__Group__2__Impl rule__Consume__Group__3 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4429:2: rule__Consume__Group__2__Impl rule__Consume__Group__3
			{
			pushFollow(FOLLOW_rule__Consume__Group__2__Impl_in_rule__Consume__Group__28925);
			rule__Consume__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Consume__Group__3_in_rule__Consume__Group__28928);
			rule__Consume__Group__3();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Consume__Group__2"



	// $ANTLR start "rule__Consume__Group__2__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4436:1: rule__Consume__Group__2__Impl : ( 'from' ) ;
	public final void rule__Consume__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4440:1: ( ( 'from' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4441:1: ( 'from' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4441:1: ( 'from' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4442:1: 'from'
			{
			 before(grammarAccess.getConsumeAccess().getFromKeyword_2()); 
			match(input,40,FOLLOW_40_in_rule__Consume__Group__2__Impl8956); 
			 after(grammarAccess.getConsumeAccess().getFromKeyword_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Consume__Group__2__Impl"



	// $ANTLR start "rule__Consume__Group__3"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4455:1: rule__Consume__Group__3 : rule__Consume__Group__3__Impl rule__Consume__Group__4 ;
	public final void rule__Consume__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4459:2: ( rule__Consume__Group__3__Impl rule__Consume__Group__4 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4460:2: rule__Consume__Group__3__Impl rule__Consume__Group__4
			{
			pushFollow(FOLLOW_rule__Consume__Group__3__Impl_in_rule__Consume__Group__38987);
			rule__Consume__Group__3__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Consume__Group__4_in_rule__Consume__Group__38990);
			rule__Consume__Group__4();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Consume__Group__3"



	// $ANTLR start "rule__Consume__Group__3__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4467:1: rule__Consume__Group__3__Impl : ( ( rule__Consume__FromNameAssignment_3 ) ) ;
	public final void rule__Consume__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4471:1: ( ( ( rule__Consume__FromNameAssignment_3 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4472:1: ( ( rule__Consume__FromNameAssignment_3 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4472:1: ( ( rule__Consume__FromNameAssignment_3 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4473:1: ( rule__Consume__FromNameAssignment_3 )
			{
			 before(grammarAccess.getConsumeAccess().getFromNameAssignment_3()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4474:2: ( rule__Consume__FromNameAssignment_3 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4474:2: rule__Consume__FromNameAssignment_3
			{
			pushFollow(FOLLOW_rule__Consume__FromNameAssignment_3_in_rule__Consume__Group__3__Impl9017);
			rule__Consume__FromNameAssignment_3();
			state._fsp--;

			}

			 after(grammarAccess.getConsumeAccess().getFromNameAssignment_3()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Consume__Group__3__Impl"



	// $ANTLR start "rule__Consume__Group__4"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4484:1: rule__Consume__Group__4 : rule__Consume__Group__4__Impl ;
	public final void rule__Consume__Group__4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4488:2: ( rule__Consume__Group__4__Impl )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4489:2: rule__Consume__Group__4__Impl
			{
			pushFollow(FOLLOW_rule__Consume__Group__4__Impl_in_rule__Consume__Group__49047);
			rule__Consume__Group__4__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Consume__Group__4"



	// $ANTLR start "rule__Consume__Group__4__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4495:1: rule__Consume__Group__4__Impl : ( ';' ) ;
	public final void rule__Consume__Group__4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4499:1: ( ( ';' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4500:1: ( ';' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4500:1: ( ';' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4501:1: ';'
			{
			 before(grammarAccess.getConsumeAccess().getSemicolonKeyword_4()); 
			match(input,15,FOLLOW_15_in_rule__Consume__Group__4__Impl9075); 
			 after(grammarAccess.getConsumeAccess().getSemicolonKeyword_4()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Consume__Group__4__Impl"



	// $ANTLR start "rule__Command__Group__0"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4524:1: rule__Command__Group__0 : rule__Command__Group__0__Impl rule__Command__Group__1 ;
	public final void rule__Command__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4528:2: ( rule__Command__Group__0__Impl rule__Command__Group__1 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4529:2: rule__Command__Group__0__Impl rule__Command__Group__1
			{
			pushFollow(FOLLOW_rule__Command__Group__0__Impl_in_rule__Command__Group__09116);
			rule__Command__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Command__Group__1_in_rule__Command__Group__09119);
			rule__Command__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Command__Group__0"



	// $ANTLR start "rule__Command__Group__0__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4536:1: rule__Command__Group__0__Impl : ( 'command' ) ;
	public final void rule__Command__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4540:1: ( ( 'command' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4541:1: ( 'command' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4541:1: ( 'command' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4542:1: 'command'
			{
			 before(grammarAccess.getCommandAccess().getCommandKeyword_0()); 
			match(input,31,FOLLOW_31_in_rule__Command__Group__0__Impl9147); 
			 after(grammarAccess.getCommandAccess().getCommandKeyword_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Command__Group__0__Impl"



	// $ANTLR start "rule__Command__Group__1"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4555:1: rule__Command__Group__1 : rule__Command__Group__1__Impl rule__Command__Group__2 ;
	public final void rule__Command__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4559:2: ( rule__Command__Group__1__Impl rule__Command__Group__2 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4560:2: rule__Command__Group__1__Impl rule__Command__Group__2
			{
			pushFollow(FOLLOW_rule__Command__Group__1__Impl_in_rule__Command__Group__19178);
			rule__Command__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Command__Group__2_in_rule__Command__Group__19181);
			rule__Command__Group__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Command__Group__1"



	// $ANTLR start "rule__Command__Group__1__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4567:1: rule__Command__Group__1__Impl : ( ( rule__Command__CommandNameAssignment_1 ) ) ;
	public final void rule__Command__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4571:1: ( ( ( rule__Command__CommandNameAssignment_1 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4572:1: ( ( rule__Command__CommandNameAssignment_1 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4572:1: ( ( rule__Command__CommandNameAssignment_1 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4573:1: ( rule__Command__CommandNameAssignment_1 )
			{
			 before(grammarAccess.getCommandAccess().getCommandNameAssignment_1()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4574:2: ( rule__Command__CommandNameAssignment_1 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4574:2: rule__Command__CommandNameAssignment_1
			{
			pushFollow(FOLLOW_rule__Command__CommandNameAssignment_1_in_rule__Command__Group__1__Impl9208);
			rule__Command__CommandNameAssignment_1();
			state._fsp--;

			}

			 after(grammarAccess.getCommandAccess().getCommandNameAssignment_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Command__Group__1__Impl"



	// $ANTLR start "rule__Command__Group__2"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4584:1: rule__Command__Group__2 : rule__Command__Group__2__Impl rule__Command__Group__3 ;
	public final void rule__Command__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4588:2: ( rule__Command__Group__2__Impl rule__Command__Group__3 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4589:2: rule__Command__Group__2__Impl rule__Command__Group__3
			{
			pushFollow(FOLLOW_rule__Command__Group__2__Impl_in_rule__Command__Group__29238);
			rule__Command__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Command__Group__3_in_rule__Command__Group__29241);
			rule__Command__Group__3();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Command__Group__2"



	// $ANTLR start "rule__Command__Group__2__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4596:1: rule__Command__Group__2__Impl : ( '(' ) ;
	public final void rule__Command__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4600:1: ( ( '(' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4601:1: ( '(' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4601:1: ( '(' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4602:1: '('
			{
			 before(grammarAccess.getCommandAccess().getLeftParenthesisKeyword_2()); 
			match(input,11,FOLLOW_11_in_rule__Command__Group__2__Impl9269); 
			 after(grammarAccess.getCommandAccess().getLeftParenthesisKeyword_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Command__Group__2__Impl"



	// $ANTLR start "rule__Command__Group__3"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4615:1: rule__Command__Group__3 : rule__Command__Group__3__Impl rule__Command__Group__4 ;
	public final void rule__Command__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4619:2: ( rule__Command__Group__3__Impl rule__Command__Group__4 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4620:2: rule__Command__Group__3__Impl rule__Command__Group__4
			{
			pushFollow(FOLLOW_rule__Command__Group__3__Impl_in_rule__Command__Group__39300);
			rule__Command__Group__3__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Command__Group__4_in_rule__Command__Group__39303);
			rule__Command__Group__4();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Command__Group__3"



	// $ANTLR start "rule__Command__Group__3__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4627:1: rule__Command__Group__3__Impl : ( ( rule__Command__CommandparameterAssignment_3 )? ) ;
	public final void rule__Command__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4631:1: ( ( ( rule__Command__CommandparameterAssignment_3 )? ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4632:1: ( ( rule__Command__CommandparameterAssignment_3 )? )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4632:1: ( ( rule__Command__CommandparameterAssignment_3 )? )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4633:1: ( rule__Command__CommandparameterAssignment_3 )?
			{
			 before(grammarAccess.getCommandAccess().getCommandparameterAssignment_3()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4634:2: ( rule__Command__CommandparameterAssignment_3 )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==RULE_ID) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4634:2: rule__Command__CommandparameterAssignment_3
					{
					pushFollow(FOLLOW_rule__Command__CommandparameterAssignment_3_in_rule__Command__Group__3__Impl9330);
					rule__Command__CommandparameterAssignment_3();
					state._fsp--;

					}
					break;

			}

			 after(grammarAccess.getCommandAccess().getCommandparameterAssignment_3()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Command__Group__3__Impl"



	// $ANTLR start "rule__Command__Group__4"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4644:1: rule__Command__Group__4 : rule__Command__Group__4__Impl rule__Command__Group__5 ;
	public final void rule__Command__Group__4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4648:2: ( rule__Command__Group__4__Impl rule__Command__Group__5 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4649:2: rule__Command__Group__4__Impl rule__Command__Group__5
			{
			pushFollow(FOLLOW_rule__Command__Group__4__Impl_in_rule__Command__Group__49361);
			rule__Command__Group__4__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Command__Group__5_in_rule__Command__Group__49364);
			rule__Command__Group__5();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Command__Group__4"



	// $ANTLR start "rule__Command__Group__4__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4656:1: rule__Command__Group__4__Impl : ( ')' ) ;
	public final void rule__Command__Group__4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4660:1: ( ( ')' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4661:1: ( ')' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4661:1: ( ')' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4662:1: ')'
			{
			 before(grammarAccess.getCommandAccess().getRightParenthesisKeyword_4()); 
			match(input,12,FOLLOW_12_in_rule__Command__Group__4__Impl9392); 
			 after(grammarAccess.getCommandAccess().getRightParenthesisKeyword_4()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Command__Group__4__Impl"



	// $ANTLR start "rule__Command__Group__5"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4675:1: rule__Command__Group__5 : rule__Command__Group__5__Impl rule__Command__Group__6 ;
	public final void rule__Command__Group__5() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4679:2: ( rule__Command__Group__5__Impl rule__Command__Group__6 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4680:2: rule__Command__Group__5__Impl rule__Command__Group__6
			{
			pushFollow(FOLLOW_rule__Command__Group__5__Impl_in_rule__Command__Group__59423);
			rule__Command__Group__5__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Command__Group__6_in_rule__Command__Group__59426);
			rule__Command__Group__6();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Command__Group__5"



	// $ANTLR start "rule__Command__Group__5__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4687:1: rule__Command__Group__5__Impl : ( 'to' ) ;
	public final void rule__Command__Group__5__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4691:1: ( ( 'to' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4692:1: ( 'to' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4692:1: ( 'to' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4693:1: 'to'
			{
			 before(grammarAccess.getCommandAccess().getToKeyword_5()); 
			match(input,58,FOLLOW_58_in_rule__Command__Group__5__Impl9454); 
			 after(grammarAccess.getCommandAccess().getToKeyword_5()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Command__Group__5__Impl"



	// $ANTLR start "rule__Command__Group__6"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4706:1: rule__Command__Group__6 : rule__Command__Group__6__Impl rule__Command__Group__7 ;
	public final void rule__Command__Group__6() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4710:2: ( rule__Command__Group__6__Impl rule__Command__Group__7 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4711:2: rule__Command__Group__6__Impl rule__Command__Group__7
			{
			pushFollow(FOLLOW_rule__Command__Group__6__Impl_in_rule__Command__Group__69485);
			rule__Command__Group__6__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Command__Group__7_in_rule__Command__Group__69488);
			rule__Command__Group__7();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Command__Group__6"



	// $ANTLR start "rule__Command__Group__6__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4718:1: rule__Command__Group__6__Impl : ( ( rule__Command__ActuatorForCommandAssignment_6 ) ) ;
	public final void rule__Command__Group__6__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4722:1: ( ( ( rule__Command__ActuatorForCommandAssignment_6 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4723:1: ( ( rule__Command__ActuatorForCommandAssignment_6 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4723:1: ( ( rule__Command__ActuatorForCommandAssignment_6 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4724:1: ( rule__Command__ActuatorForCommandAssignment_6 )
			{
			 before(grammarAccess.getCommandAccess().getActuatorForCommandAssignment_6()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4725:2: ( rule__Command__ActuatorForCommandAssignment_6 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4725:2: rule__Command__ActuatorForCommandAssignment_6
			{
			pushFollow(FOLLOW_rule__Command__ActuatorForCommandAssignment_6_in_rule__Command__Group__6__Impl9515);
			rule__Command__ActuatorForCommandAssignment_6();
			state._fsp--;

			}

			 after(grammarAccess.getCommandAccess().getActuatorForCommandAssignment_6()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Command__Group__6__Impl"



	// $ANTLR start "rule__Command__Group__7"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4735:1: rule__Command__Group__7 : rule__Command__Group__7__Impl ;
	public final void rule__Command__Group__7() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4739:2: ( rule__Command__Group__7__Impl )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4740:2: rule__Command__Group__7__Impl
			{
			pushFollow(FOLLOW_rule__Command__Group__7__Impl_in_rule__Command__Group__79545);
			rule__Command__Group__7__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Command__Group__7"



	// $ANTLR start "rule__Command__Group__7__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4746:1: rule__Command__Group__7__Impl : ( ';' ) ;
	public final void rule__Command__Group__7__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4750:1: ( ( ';' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4751:1: ( ';' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4751:1: ( ';' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4752:1: ';'
			{
			 before(grammarAccess.getCommandAccess().getSemicolonKeyword_7()); 
			match(input,15,FOLLOW_15_in_rule__Command__Group__7__Impl9573); 
			 after(grammarAccess.getCommandAccess().getSemicolonKeyword_7()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Command__Group__7__Impl"



	// $ANTLR start "rule__CommandParameter__Group__0"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4781:1: rule__CommandParameter__Group__0 : rule__CommandParameter__Group__0__Impl rule__CommandParameter__Group__1 ;
	public final void rule__CommandParameter__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4785:2: ( rule__CommandParameter__Group__0__Impl rule__CommandParameter__Group__1 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4786:2: rule__CommandParameter__Group__0__Impl rule__CommandParameter__Group__1
			{
			pushFollow(FOLLOW_rule__CommandParameter__Group__0__Impl_in_rule__CommandParameter__Group__09620);
			rule__CommandParameter__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__CommandParameter__Group__1_in_rule__CommandParameter__Group__09623);
			rule__CommandParameter__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__CommandParameter__Group__0"



	// $ANTLR start "rule__CommandParameter__Group__0__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4793:1: rule__CommandParameter__Group__0__Impl : ( ( rule__CommandParameter__NameAssignment_0 ) ) ;
	public final void rule__CommandParameter__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4797:1: ( ( ( rule__CommandParameter__NameAssignment_0 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4798:1: ( ( rule__CommandParameter__NameAssignment_0 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4798:1: ( ( rule__CommandParameter__NameAssignment_0 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4799:1: ( rule__CommandParameter__NameAssignment_0 )
			{
			 before(grammarAccess.getCommandParameterAccess().getNameAssignment_0()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4800:2: ( rule__CommandParameter__NameAssignment_0 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4800:2: rule__CommandParameter__NameAssignment_0
			{
			pushFollow(FOLLOW_rule__CommandParameter__NameAssignment_0_in_rule__CommandParameter__Group__0__Impl9650);
			rule__CommandParameter__NameAssignment_0();
			state._fsp--;

			}

			 after(grammarAccess.getCommandParameterAccess().getNameAssignment_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__CommandParameter__Group__0__Impl"



	// $ANTLR start "rule__CommandParameter__Group__1"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4810:1: rule__CommandParameter__Group__1 : rule__CommandParameter__Group__1__Impl ;
	public final void rule__CommandParameter__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4814:2: ( rule__CommandParameter__Group__1__Impl )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4815:2: rule__CommandParameter__Group__1__Impl
			{
			pushFollow(FOLLOW_rule__CommandParameter__Group__1__Impl_in_rule__CommandParameter__Group__19680);
			rule__CommandParameter__Group__1__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__CommandParameter__Group__1"



	// $ANTLR start "rule__CommandParameter__Group__1__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4821:1: rule__CommandParameter__Group__1__Impl : ( ( rule__CommandParameter__Group_1__0 )? ) ;
	public final void rule__CommandParameter__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4825:1: ( ( ( rule__CommandParameter__Group_1__0 )? ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4826:1: ( ( rule__CommandParameter__Group_1__0 )? )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4826:1: ( ( rule__CommandParameter__Group_1__0 )? )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4827:1: ( rule__CommandParameter__Group_1__0 )?
			{
			 before(grammarAccess.getCommandParameterAccess().getGroup_1()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4828:2: ( rule__CommandParameter__Group_1__0 )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==13) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4828:2: rule__CommandParameter__Group_1__0
					{
					pushFollow(FOLLOW_rule__CommandParameter__Group_1__0_in_rule__CommandParameter__Group__1__Impl9707);
					rule__CommandParameter__Group_1__0();
					state._fsp--;

					}
					break;

			}

			 after(grammarAccess.getCommandParameterAccess().getGroup_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__CommandParameter__Group__1__Impl"



	// $ANTLR start "rule__CommandParameter__Group_1__0"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4842:1: rule__CommandParameter__Group_1__0 : rule__CommandParameter__Group_1__0__Impl rule__CommandParameter__Group_1__1 ;
	public final void rule__CommandParameter__Group_1__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4846:2: ( rule__CommandParameter__Group_1__0__Impl rule__CommandParameter__Group_1__1 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4847:2: rule__CommandParameter__Group_1__0__Impl rule__CommandParameter__Group_1__1
			{
			pushFollow(FOLLOW_rule__CommandParameter__Group_1__0__Impl_in_rule__CommandParameter__Group_1__09742);
			rule__CommandParameter__Group_1__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__CommandParameter__Group_1__1_in_rule__CommandParameter__Group_1__09745);
			rule__CommandParameter__Group_1__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__CommandParameter__Group_1__0"



	// $ANTLR start "rule__CommandParameter__Group_1__0__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4854:1: rule__CommandParameter__Group_1__0__Impl : ( ',' ) ;
	public final void rule__CommandParameter__Group_1__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4858:1: ( ( ',' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4859:1: ( ',' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4859:1: ( ',' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4860:1: ','
			{
			 before(grammarAccess.getCommandParameterAccess().getCommaKeyword_1_0()); 
			match(input,13,FOLLOW_13_in_rule__CommandParameter__Group_1__0__Impl9773); 
			 after(grammarAccess.getCommandParameterAccess().getCommaKeyword_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__CommandParameter__Group_1__0__Impl"



	// $ANTLR start "rule__CommandParameter__Group_1__1"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4873:1: rule__CommandParameter__Group_1__1 : rule__CommandParameter__Group_1__1__Impl ;
	public final void rule__CommandParameter__Group_1__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4877:2: ( rule__CommandParameter__Group_1__1__Impl )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4878:2: rule__CommandParameter__Group_1__1__Impl
			{
			pushFollow(FOLLOW_rule__CommandParameter__Group_1__1__Impl_in_rule__CommandParameter__Group_1__19804);
			rule__CommandParameter__Group_1__1__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__CommandParameter__Group_1__1"



	// $ANTLR start "rule__CommandParameter__Group_1__1__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4884:1: rule__CommandParameter__Group_1__1__Impl : ( ( rule__CommandParameter__ParameterAssignment_1_1 ) ) ;
	public final void rule__CommandParameter__Group_1__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4888:1: ( ( ( rule__CommandParameter__ParameterAssignment_1_1 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4889:1: ( ( rule__CommandParameter__ParameterAssignment_1_1 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4889:1: ( ( rule__CommandParameter__ParameterAssignment_1_1 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4890:1: ( rule__CommandParameter__ParameterAssignment_1_1 )
			{
			 before(grammarAccess.getCommandParameterAccess().getParameterAssignment_1_1()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4891:2: ( rule__CommandParameter__ParameterAssignment_1_1 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4891:2: rule__CommandParameter__ParameterAssignment_1_1
			{
			pushFollow(FOLLOW_rule__CommandParameter__ParameterAssignment_1_1_in_rule__CommandParameter__Group_1__1__Impl9831);
			rule__CommandParameter__ParameterAssignment_1_1();
			state._fsp--;

			}

			 after(grammarAccess.getCommandParameterAccess().getParameterAssignment_1_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__CommandParameter__Group_1__1__Impl"



	// $ANTLR start "rule__VocSpec__Group__0"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4905:1: rule__VocSpec__Group__0 : rule__VocSpec__Group__0__Impl rule__VocSpec__Group__1 ;
	public final void rule__VocSpec__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4909:2: ( rule__VocSpec__Group__0__Impl rule__VocSpec__Group__1 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4910:2: rule__VocSpec__Group__0__Impl rule__VocSpec__Group__1
			{
			pushFollow(FOLLOW_rule__VocSpec__Group__0__Impl_in_rule__VocSpec__Group__09865);
			rule__VocSpec__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__VocSpec__Group__1_in_rule__VocSpec__Group__09868);
			rule__VocSpec__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__VocSpec__Group__0"



	// $ANTLR start "rule__VocSpec__Group__0__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4917:1: rule__VocSpec__Group__0__Impl : ( 'structs' ) ;
	public final void rule__VocSpec__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4921:1: ( ( 'structs' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4922:1: ( 'structs' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4922:1: ( 'structs' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4923:1: 'structs'
			{
			 before(grammarAccess.getVocSpecAccess().getStructsKeyword_0()); 
			match(input,57,FOLLOW_57_in_rule__VocSpec__Group__0__Impl9896); 
			 after(grammarAccess.getVocSpecAccess().getStructsKeyword_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__VocSpec__Group__0__Impl"



	// $ANTLR start "rule__VocSpec__Group__1"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4936:1: rule__VocSpec__Group__1 : rule__VocSpec__Group__1__Impl rule__VocSpec__Group__2 ;
	public final void rule__VocSpec__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4940:2: ( rule__VocSpec__Group__1__Impl rule__VocSpec__Group__2 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4941:2: rule__VocSpec__Group__1__Impl rule__VocSpec__Group__2
			{
			pushFollow(FOLLOW_rule__VocSpec__Group__1__Impl_in_rule__VocSpec__Group__19927);
			rule__VocSpec__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__VocSpec__Group__2_in_rule__VocSpec__Group__19930);
			rule__VocSpec__Group__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__VocSpec__Group__1"



	// $ANTLR start "rule__VocSpec__Group__1__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4948:1: rule__VocSpec__Group__1__Impl : ( ':' ) ;
	public final void rule__VocSpec__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4952:1: ( ( ':' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4953:1: ( ':' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4953:1: ( ':' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4954:1: ':'
			{
			 before(grammarAccess.getVocSpecAccess().getColonKeyword_1()); 
			match(input,14,FOLLOW_14_in_rule__VocSpec__Group__1__Impl9958); 
			 after(grammarAccess.getVocSpecAccess().getColonKeyword_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__VocSpec__Group__1__Impl"



	// $ANTLR start "rule__VocSpec__Group__2"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4967:1: rule__VocSpec__Group__2 : rule__VocSpec__Group__2__Impl rule__VocSpec__Group__3 ;
	public final void rule__VocSpec__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4971:2: ( rule__VocSpec__Group__2__Impl rule__VocSpec__Group__3 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4972:2: rule__VocSpec__Group__2__Impl rule__VocSpec__Group__3
			{
			pushFollow(FOLLOW_rule__VocSpec__Group__2__Impl_in_rule__VocSpec__Group__29989);
			rule__VocSpec__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__VocSpec__Group__3_in_rule__VocSpec__Group__29992);
			rule__VocSpec__Group__3();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__VocSpec__Group__2"



	// $ANTLR start "rule__VocSpec__Group__2__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4979:1: rule__VocSpec__Group__2__Impl : ( ( ( rule__VocSpec__StructsAssignment_2 ) ) ( ( rule__VocSpec__StructsAssignment_2 )* ) ) ;
	public final void rule__VocSpec__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4983:1: ( ( ( ( rule__VocSpec__StructsAssignment_2 ) ) ( ( rule__VocSpec__StructsAssignment_2 )* ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4984:1: ( ( ( rule__VocSpec__StructsAssignment_2 ) ) ( ( rule__VocSpec__StructsAssignment_2 )* ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4984:1: ( ( ( rule__VocSpec__StructsAssignment_2 ) ) ( ( rule__VocSpec__StructsAssignment_2 )* ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4985:1: ( ( rule__VocSpec__StructsAssignment_2 ) ) ( ( rule__VocSpec__StructsAssignment_2 )* )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4985:1: ( ( rule__VocSpec__StructsAssignment_2 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4986:1: ( rule__VocSpec__StructsAssignment_2 )
			{
			 before(grammarAccess.getVocSpecAccess().getStructsAssignment_2()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4987:2: ( rule__VocSpec__StructsAssignment_2 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4987:2: rule__VocSpec__StructsAssignment_2
			{
			pushFollow(FOLLOW_rule__VocSpec__StructsAssignment_2_in_rule__VocSpec__Group__2__Impl10021);
			rule__VocSpec__StructsAssignment_2();
			state._fsp--;

			}

			 after(grammarAccess.getVocSpecAccess().getStructsAssignment_2()); 
			}

			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4990:1: ( ( rule__VocSpec__StructsAssignment_2 )* )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4991:1: ( rule__VocSpec__StructsAssignment_2 )*
			{
			 before(grammarAccess.getVocSpecAccess().getStructsAssignment_2()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4992:2: ( rule__VocSpec__StructsAssignment_2 )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==RULE_ID) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4992:2: rule__VocSpec__StructsAssignment_2
					{
					pushFollow(FOLLOW_rule__VocSpec__StructsAssignment_2_in_rule__VocSpec__Group__2__Impl10033);
					rule__VocSpec__StructsAssignment_2();
					state._fsp--;

					}
					break;

				default :
					break loop27;
				}
			}

			 after(grammarAccess.getVocSpecAccess().getStructsAssignment_2()); 
			}

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__VocSpec__Group__2__Impl"



	// $ANTLR start "rule__VocSpec__Group__3"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5003:1: rule__VocSpec__Group__3 : rule__VocSpec__Group__3__Impl rule__VocSpec__Group__4 ;
	public final void rule__VocSpec__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5007:2: ( rule__VocSpec__Group__3__Impl rule__VocSpec__Group__4 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5008:2: rule__VocSpec__Group__3__Impl rule__VocSpec__Group__4
			{
			pushFollow(FOLLOW_rule__VocSpec__Group__3__Impl_in_rule__VocSpec__Group__310066);
			rule__VocSpec__Group__3__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__VocSpec__Group__4_in_rule__VocSpec__Group__310069);
			rule__VocSpec__Group__4();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__VocSpec__Group__3"



	// $ANTLR start "rule__VocSpec__Group__3__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5015:1: rule__VocSpec__Group__3__Impl : ( 'resources' ) ;
	public final void rule__VocSpec__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5019:1: ( ( 'resources' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5020:1: ( 'resources' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5020:1: ( 'resources' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5021:1: 'resources'
			{
			 before(grammarAccess.getVocSpecAccess().getResourcesKeyword_3()); 
			match(input,52,FOLLOW_52_in_rule__VocSpec__Group__3__Impl10097); 
			 after(grammarAccess.getVocSpecAccess().getResourcesKeyword_3()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__VocSpec__Group__3__Impl"



	// $ANTLR start "rule__VocSpec__Group__4"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5034:1: rule__VocSpec__Group__4 : rule__VocSpec__Group__4__Impl rule__VocSpec__Group__5 ;
	public final void rule__VocSpec__Group__4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5038:2: ( rule__VocSpec__Group__4__Impl rule__VocSpec__Group__5 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5039:2: rule__VocSpec__Group__4__Impl rule__VocSpec__Group__5
			{
			pushFollow(FOLLOW_rule__VocSpec__Group__4__Impl_in_rule__VocSpec__Group__410128);
			rule__VocSpec__Group__4__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__VocSpec__Group__5_in_rule__VocSpec__Group__410131);
			rule__VocSpec__Group__5();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__VocSpec__Group__4"



	// $ANTLR start "rule__VocSpec__Group__4__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5046:1: rule__VocSpec__Group__4__Impl : ( ':' ) ;
	public final void rule__VocSpec__Group__4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5050:1: ( ( ':' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5051:1: ( ':' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5051:1: ( ':' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5052:1: ':'
			{
			 before(grammarAccess.getVocSpecAccess().getColonKeyword_4()); 
			match(input,14,FOLLOW_14_in_rule__VocSpec__Group__4__Impl10159); 
			 after(grammarAccess.getVocSpecAccess().getColonKeyword_4()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__VocSpec__Group__4__Impl"



	// $ANTLR start "rule__VocSpec__Group__5"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5065:1: rule__VocSpec__Group__5 : rule__VocSpec__Group__5__Impl rule__VocSpec__Group__6 ;
	public final void rule__VocSpec__Group__5() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5069:2: ( rule__VocSpec__Group__5__Impl rule__VocSpec__Group__6 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5070:2: rule__VocSpec__Group__5__Impl rule__VocSpec__Group__6
			{
			pushFollow(FOLLOW_rule__VocSpec__Group__5__Impl_in_rule__VocSpec__Group__510190);
			rule__VocSpec__Group__5__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__VocSpec__Group__6_in_rule__VocSpec__Group__510193);
			rule__VocSpec__Group__6();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__VocSpec__Group__5"



	// $ANTLR start "rule__VocSpec__Group__5__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5077:1: rule__VocSpec__Group__5__Impl : ( 'sensors' ) ;
	public final void rule__VocSpec__Group__5__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5081:1: ( ( 'sensors' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5082:1: ( 'sensors' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5082:1: ( 'sensors' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5083:1: 'sensors'
			{
			 before(grammarAccess.getVocSpecAccess().getSensorsKeyword_5()); 
			match(input,54,FOLLOW_54_in_rule__VocSpec__Group__5__Impl10221); 
			 after(grammarAccess.getVocSpecAccess().getSensorsKeyword_5()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__VocSpec__Group__5__Impl"



	// $ANTLR start "rule__VocSpec__Group__6"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5096:1: rule__VocSpec__Group__6 : rule__VocSpec__Group__6__Impl rule__VocSpec__Group__7 ;
	public final void rule__VocSpec__Group__6() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5100:2: ( rule__VocSpec__Group__6__Impl rule__VocSpec__Group__7 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5101:2: rule__VocSpec__Group__6__Impl rule__VocSpec__Group__7
			{
			pushFollow(FOLLOW_rule__VocSpec__Group__6__Impl_in_rule__VocSpec__Group__610252);
			rule__VocSpec__Group__6__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__VocSpec__Group__7_in_rule__VocSpec__Group__610255);
			rule__VocSpec__Group__7();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__VocSpec__Group__6"



	// $ANTLR start "rule__VocSpec__Group__6__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5108:1: rule__VocSpec__Group__6__Impl : ( ':' ) ;
	public final void rule__VocSpec__Group__6__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5112:1: ( ( ':' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5113:1: ( ':' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5113:1: ( ':' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5114:1: ':'
			{
			 before(grammarAccess.getVocSpecAccess().getColonKeyword_6()); 
			match(input,14,FOLLOW_14_in_rule__VocSpec__Group__6__Impl10283); 
			 after(grammarAccess.getVocSpecAccess().getColonKeyword_6()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__VocSpec__Group__6__Impl"



	// $ANTLR start "rule__VocSpec__Group__7"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5127:1: rule__VocSpec__Group__7 : rule__VocSpec__Group__7__Impl rule__VocSpec__Group__8 ;
	public final void rule__VocSpec__Group__7() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5131:2: ( rule__VocSpec__Group__7__Impl rule__VocSpec__Group__8 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5132:2: rule__VocSpec__Group__7__Impl rule__VocSpec__Group__8
			{
			pushFollow(FOLLOW_rule__VocSpec__Group__7__Impl_in_rule__VocSpec__Group__710314);
			rule__VocSpec__Group__7__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__VocSpec__Group__8_in_rule__VocSpec__Group__710317);
			rule__VocSpec__Group__8();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__VocSpec__Group__7"



	// $ANTLR start "rule__VocSpec__Group__7__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5139:1: rule__VocSpec__Group__7__Impl : ( 'periodicSensors' ) ;
	public final void rule__VocSpec__Group__7__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5143:1: ( ( 'periodicSensors' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5144:1: ( 'periodicSensors' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5144:1: ( 'periodicSensors' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5145:1: 'periodicSensors'
			{
			 before(grammarAccess.getVocSpecAccess().getPeriodicSensorsKeyword_7()); 
			match(input,48,FOLLOW_48_in_rule__VocSpec__Group__7__Impl10345); 
			 after(grammarAccess.getVocSpecAccess().getPeriodicSensorsKeyword_7()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__VocSpec__Group__7__Impl"



	// $ANTLR start "rule__VocSpec__Group__8"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5158:1: rule__VocSpec__Group__8 : rule__VocSpec__Group__8__Impl rule__VocSpec__Group__9 ;
	public final void rule__VocSpec__Group__8() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5162:2: ( rule__VocSpec__Group__8__Impl rule__VocSpec__Group__9 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5163:2: rule__VocSpec__Group__8__Impl rule__VocSpec__Group__9
			{
			pushFollow(FOLLOW_rule__VocSpec__Group__8__Impl_in_rule__VocSpec__Group__810376);
			rule__VocSpec__Group__8__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__VocSpec__Group__9_in_rule__VocSpec__Group__810379);
			rule__VocSpec__Group__9();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__VocSpec__Group__8"



	// $ANTLR start "rule__VocSpec__Group__8__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5170:1: rule__VocSpec__Group__8__Impl : ( ':' ) ;
	public final void rule__VocSpec__Group__8__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5174:1: ( ( ':' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5175:1: ( ':' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5175:1: ( ':' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5176:1: ':'
			{
			 before(grammarAccess.getVocSpecAccess().getColonKeyword_8()); 
			match(input,14,FOLLOW_14_in_rule__VocSpec__Group__8__Impl10407); 
			 after(grammarAccess.getVocSpecAccess().getColonKeyword_8()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__VocSpec__Group__8__Impl"



	// $ANTLR start "rule__VocSpec__Group__9"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5189:1: rule__VocSpec__Group__9 : rule__VocSpec__Group__9__Impl rule__VocSpec__Group__10 ;
	public final void rule__VocSpec__Group__9() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5193:2: ( rule__VocSpec__Group__9__Impl rule__VocSpec__Group__10 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5194:2: rule__VocSpec__Group__9__Impl rule__VocSpec__Group__10
			{
			pushFollow(FOLLOW_rule__VocSpec__Group__9__Impl_in_rule__VocSpec__Group__910438);
			rule__VocSpec__Group__9__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__VocSpec__Group__10_in_rule__VocSpec__Group__910441);
			rule__VocSpec__Group__10();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__VocSpec__Group__9"



	// $ANTLR start "rule__VocSpec__Group__9__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5201:1: rule__VocSpec__Group__9__Impl : ( ( rule__VocSpec__PeriodicSensorsAssignment_9 )* ) ;
	public final void rule__VocSpec__Group__9__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5205:1: ( ( ( rule__VocSpec__PeriodicSensorsAssignment_9 )* ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5206:1: ( ( rule__VocSpec__PeriodicSensorsAssignment_9 )* )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5206:1: ( ( rule__VocSpec__PeriodicSensorsAssignment_9 )* )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5207:1: ( rule__VocSpec__PeriodicSensorsAssignment_9 )*
			{
			 before(grammarAccess.getVocSpecAccess().getPeriodicSensorsAssignment_9()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5208:2: ( rule__VocSpec__PeriodicSensorsAssignment_9 )*
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==RULE_ID) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5208:2: rule__VocSpec__PeriodicSensorsAssignment_9
					{
					pushFollow(FOLLOW_rule__VocSpec__PeriodicSensorsAssignment_9_in_rule__VocSpec__Group__9__Impl10468);
					rule__VocSpec__PeriodicSensorsAssignment_9();
					state._fsp--;

					}
					break;

				default :
					break loop28;
				}
			}

			 after(grammarAccess.getVocSpecAccess().getPeriodicSensorsAssignment_9()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__VocSpec__Group__9__Impl"



	// $ANTLR start "rule__VocSpec__Group__10"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5218:1: rule__VocSpec__Group__10 : rule__VocSpec__Group__10__Impl rule__VocSpec__Group__11 ;
	public final void rule__VocSpec__Group__10() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5222:2: ( rule__VocSpec__Group__10__Impl rule__VocSpec__Group__11 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5223:2: rule__VocSpec__Group__10__Impl rule__VocSpec__Group__11
			{
			pushFollow(FOLLOW_rule__VocSpec__Group__10__Impl_in_rule__VocSpec__Group__1010499);
			rule__VocSpec__Group__10__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__VocSpec__Group__11_in_rule__VocSpec__Group__1010502);
			rule__VocSpec__Group__11();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__VocSpec__Group__10"



	// $ANTLR start "rule__VocSpec__Group__10__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5230:1: rule__VocSpec__Group__10__Impl : ( 'eventDrivenSensors' ) ;
	public final void rule__VocSpec__Group__10__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5234:1: ( ( 'eventDrivenSensors' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5235:1: ( 'eventDrivenSensors' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5235:1: ( 'eventDrivenSensors' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5236:1: 'eventDrivenSensors'
			{
			 before(grammarAccess.getVocSpecAccess().getEventDrivenSensorsKeyword_10()); 
			match(input,38,FOLLOW_38_in_rule__VocSpec__Group__10__Impl10530); 
			 after(grammarAccess.getVocSpecAccess().getEventDrivenSensorsKeyword_10()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__VocSpec__Group__10__Impl"



	// $ANTLR start "rule__VocSpec__Group__11"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5249:1: rule__VocSpec__Group__11 : rule__VocSpec__Group__11__Impl rule__VocSpec__Group__12 ;
	public final void rule__VocSpec__Group__11() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5253:2: ( rule__VocSpec__Group__11__Impl rule__VocSpec__Group__12 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5254:2: rule__VocSpec__Group__11__Impl rule__VocSpec__Group__12
			{
			pushFollow(FOLLOW_rule__VocSpec__Group__11__Impl_in_rule__VocSpec__Group__1110561);
			rule__VocSpec__Group__11__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__VocSpec__Group__12_in_rule__VocSpec__Group__1110564);
			rule__VocSpec__Group__12();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__VocSpec__Group__11"



	// $ANTLR start "rule__VocSpec__Group__11__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5261:1: rule__VocSpec__Group__11__Impl : ( ':' ) ;
	public final void rule__VocSpec__Group__11__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5265:1: ( ( ':' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5266:1: ( ':' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5266:1: ( ':' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5267:1: ':'
			{
			 before(grammarAccess.getVocSpecAccess().getColonKeyword_11()); 
			match(input,14,FOLLOW_14_in_rule__VocSpec__Group__11__Impl10592); 
			 after(grammarAccess.getVocSpecAccess().getColonKeyword_11()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__VocSpec__Group__11__Impl"



	// $ANTLR start "rule__VocSpec__Group__12"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5280:1: rule__VocSpec__Group__12 : rule__VocSpec__Group__12__Impl rule__VocSpec__Group__13 ;
	public final void rule__VocSpec__Group__12() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5284:2: ( rule__VocSpec__Group__12__Impl rule__VocSpec__Group__13 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5285:2: rule__VocSpec__Group__12__Impl rule__VocSpec__Group__13
			{
			pushFollow(FOLLOW_rule__VocSpec__Group__12__Impl_in_rule__VocSpec__Group__1210623);
			rule__VocSpec__Group__12__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__VocSpec__Group__13_in_rule__VocSpec__Group__1210626);
			rule__VocSpec__Group__13();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__VocSpec__Group__12"



	// $ANTLR start "rule__VocSpec__Group__12__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5292:1: rule__VocSpec__Group__12__Impl : ( ( rule__VocSpec__EventSensorsAssignment_12 )* ) ;
	public final void rule__VocSpec__Group__12__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5296:1: ( ( ( rule__VocSpec__EventSensorsAssignment_12 )* ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5297:1: ( ( rule__VocSpec__EventSensorsAssignment_12 )* )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5297:1: ( ( rule__VocSpec__EventSensorsAssignment_12 )* )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5298:1: ( rule__VocSpec__EventSensorsAssignment_12 )*
			{
			 before(grammarAccess.getVocSpecAccess().getEventSensorsAssignment_12()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5299:2: ( rule__VocSpec__EventSensorsAssignment_12 )*
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==RULE_ID) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5299:2: rule__VocSpec__EventSensorsAssignment_12
					{
					pushFollow(FOLLOW_rule__VocSpec__EventSensorsAssignment_12_in_rule__VocSpec__Group__12__Impl10653);
					rule__VocSpec__EventSensorsAssignment_12();
					state._fsp--;

					}
					break;

				default :
					break loop29;
				}
			}

			 after(grammarAccess.getVocSpecAccess().getEventSensorsAssignment_12()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__VocSpec__Group__12__Impl"



	// $ANTLR start "rule__VocSpec__Group__13"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5309:1: rule__VocSpec__Group__13 : rule__VocSpec__Group__13__Impl rule__VocSpec__Group__14 ;
	public final void rule__VocSpec__Group__13() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5313:2: ( rule__VocSpec__Group__13__Impl rule__VocSpec__Group__14 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5314:2: rule__VocSpec__Group__13__Impl rule__VocSpec__Group__14
			{
			pushFollow(FOLLOW_rule__VocSpec__Group__13__Impl_in_rule__VocSpec__Group__1310684);
			rule__VocSpec__Group__13__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__VocSpec__Group__14_in_rule__VocSpec__Group__1310687);
			rule__VocSpec__Group__14();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__VocSpec__Group__13"



	// $ANTLR start "rule__VocSpec__Group__13__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5321:1: rule__VocSpec__Group__13__Impl : ( 'actuators' ) ;
	public final void rule__VocSpec__Group__13__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5325:1: ( ( 'actuators' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5326:1: ( 'actuators' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5326:1: ( 'actuators' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5327:1: 'actuators'
			{
			 before(grammarAccess.getVocSpecAccess().getActuatorsKeyword_13()); 
			match(input,29,FOLLOW_29_in_rule__VocSpec__Group__13__Impl10715); 
			 after(grammarAccess.getVocSpecAccess().getActuatorsKeyword_13()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__VocSpec__Group__13__Impl"



	// $ANTLR start "rule__VocSpec__Group__14"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5340:1: rule__VocSpec__Group__14 : rule__VocSpec__Group__14__Impl rule__VocSpec__Group__15 ;
	public final void rule__VocSpec__Group__14() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5344:2: ( rule__VocSpec__Group__14__Impl rule__VocSpec__Group__15 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5345:2: rule__VocSpec__Group__14__Impl rule__VocSpec__Group__15
			{
			pushFollow(FOLLOW_rule__VocSpec__Group__14__Impl_in_rule__VocSpec__Group__1410746);
			rule__VocSpec__Group__14__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__VocSpec__Group__15_in_rule__VocSpec__Group__1410749);
			rule__VocSpec__Group__15();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__VocSpec__Group__14"



	// $ANTLR start "rule__VocSpec__Group__14__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5352:1: rule__VocSpec__Group__14__Impl : ( ':' ) ;
	public final void rule__VocSpec__Group__14__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5356:1: ( ( ':' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5357:1: ( ':' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5357:1: ( ':' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5358:1: ':'
			{
			 before(grammarAccess.getVocSpecAccess().getColonKeyword_14()); 
			match(input,14,FOLLOW_14_in_rule__VocSpec__Group__14__Impl10777); 
			 after(grammarAccess.getVocSpecAccess().getColonKeyword_14()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__VocSpec__Group__14__Impl"



	// $ANTLR start "rule__VocSpec__Group__15"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5371:1: rule__VocSpec__Group__15 : rule__VocSpec__Group__15__Impl rule__VocSpec__Group__16 ;
	public final void rule__VocSpec__Group__15() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5375:2: ( rule__VocSpec__Group__15__Impl rule__VocSpec__Group__16 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5376:2: rule__VocSpec__Group__15__Impl rule__VocSpec__Group__16
			{
			pushFollow(FOLLOW_rule__VocSpec__Group__15__Impl_in_rule__VocSpec__Group__1510808);
			rule__VocSpec__Group__15__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__VocSpec__Group__16_in_rule__VocSpec__Group__1510811);
			rule__VocSpec__Group__16();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__VocSpec__Group__15"



	// $ANTLR start "rule__VocSpec__Group__15__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5383:1: rule__VocSpec__Group__15__Impl : ( ( rule__VocSpec__ActuatorsAssignment_15 )* ) ;
	public final void rule__VocSpec__Group__15__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5387:1: ( ( ( rule__VocSpec__ActuatorsAssignment_15 )* ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5388:1: ( ( rule__VocSpec__ActuatorsAssignment_15 )* )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5388:1: ( ( rule__VocSpec__ActuatorsAssignment_15 )* )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5389:1: ( rule__VocSpec__ActuatorsAssignment_15 )*
			{
			 before(grammarAccess.getVocSpecAccess().getActuatorsAssignment_15()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5390:2: ( rule__VocSpec__ActuatorsAssignment_15 )*
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==RULE_ID) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5390:2: rule__VocSpec__ActuatorsAssignment_15
					{
					pushFollow(FOLLOW_rule__VocSpec__ActuatorsAssignment_15_in_rule__VocSpec__Group__15__Impl10838);
					rule__VocSpec__ActuatorsAssignment_15();
					state._fsp--;

					}
					break;

				default :
					break loop30;
				}
			}

			 after(grammarAccess.getVocSpecAccess().getActuatorsAssignment_15()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__VocSpec__Group__15__Impl"



	// $ANTLR start "rule__VocSpec__Group__16"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5400:1: rule__VocSpec__Group__16 : rule__VocSpec__Group__16__Impl rule__VocSpec__Group__17 ;
	public final void rule__VocSpec__Group__16() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5404:2: ( rule__VocSpec__Group__16__Impl rule__VocSpec__Group__17 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5405:2: rule__VocSpec__Group__16__Impl rule__VocSpec__Group__17
			{
			pushFollow(FOLLOW_rule__VocSpec__Group__16__Impl_in_rule__VocSpec__Group__1610869);
			rule__VocSpec__Group__16__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__VocSpec__Group__17_in_rule__VocSpec__Group__1610872);
			rule__VocSpec__Group__17();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__VocSpec__Group__16"



	// $ANTLR start "rule__VocSpec__Group__16__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5412:1: rule__VocSpec__Group__16__Impl : ( 'storages' ) ;
	public final void rule__VocSpec__Group__16__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5416:1: ( ( 'storages' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5417:1: ( 'storages' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5417:1: ( 'storages' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5418:1: 'storages'
			{
			 before(grammarAccess.getVocSpecAccess().getStoragesKeyword_16()); 
			match(input,56,FOLLOW_56_in_rule__VocSpec__Group__16__Impl10900); 
			 after(grammarAccess.getVocSpecAccess().getStoragesKeyword_16()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__VocSpec__Group__16__Impl"



	// $ANTLR start "rule__VocSpec__Group__17"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5431:1: rule__VocSpec__Group__17 : rule__VocSpec__Group__17__Impl rule__VocSpec__Group__18 ;
	public final void rule__VocSpec__Group__17() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5435:2: ( rule__VocSpec__Group__17__Impl rule__VocSpec__Group__18 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5436:2: rule__VocSpec__Group__17__Impl rule__VocSpec__Group__18
			{
			pushFollow(FOLLOW_rule__VocSpec__Group__17__Impl_in_rule__VocSpec__Group__1710931);
			rule__VocSpec__Group__17__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__VocSpec__Group__18_in_rule__VocSpec__Group__1710934);
			rule__VocSpec__Group__18();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__VocSpec__Group__17"



	// $ANTLR start "rule__VocSpec__Group__17__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5443:1: rule__VocSpec__Group__17__Impl : ( ':' ) ;
	public final void rule__VocSpec__Group__17__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5447:1: ( ( ':' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5448:1: ( ':' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5448:1: ( ':' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5449:1: ':'
			{
			 before(grammarAccess.getVocSpecAccess().getColonKeyword_17()); 
			match(input,14,FOLLOW_14_in_rule__VocSpec__Group__17__Impl10962); 
			 after(grammarAccess.getVocSpecAccess().getColonKeyword_17()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__VocSpec__Group__17__Impl"



	// $ANTLR start "rule__VocSpec__Group__18"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5462:1: rule__VocSpec__Group__18 : rule__VocSpec__Group__18__Impl ;
	public final void rule__VocSpec__Group__18() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5466:2: ( rule__VocSpec__Group__18__Impl )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5467:2: rule__VocSpec__Group__18__Impl
			{
			pushFollow(FOLLOW_rule__VocSpec__Group__18__Impl_in_rule__VocSpec__Group__1810993);
			rule__VocSpec__Group__18__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__VocSpec__Group__18"



	// $ANTLR start "rule__VocSpec__Group__18__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5473:1: rule__VocSpec__Group__18__Impl : ( ( rule__VocSpec__StorageServiceAssignment_18 )* ) ;
	public final void rule__VocSpec__Group__18__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5477:1: ( ( ( rule__VocSpec__StorageServiceAssignment_18 )* ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5478:1: ( ( rule__VocSpec__StorageServiceAssignment_18 )* )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5478:1: ( ( rule__VocSpec__StorageServiceAssignment_18 )* )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5479:1: ( rule__VocSpec__StorageServiceAssignment_18 )*
			{
			 before(grammarAccess.getVocSpecAccess().getStorageServiceAssignment_18()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5480:2: ( rule__VocSpec__StorageServiceAssignment_18 )*
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==RULE_ID) ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5480:2: rule__VocSpec__StorageServiceAssignment_18
					{
					pushFollow(FOLLOW_rule__VocSpec__StorageServiceAssignment_18_in_rule__VocSpec__Group__18__Impl11020);
					rule__VocSpec__StorageServiceAssignment_18();
					state._fsp--;

					}
					break;

				default :
					break loop31;
				}
			}

			 after(grammarAccess.getVocSpecAccess().getStorageServiceAssignment_18()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__VocSpec__Group__18__Impl"



	// $ANTLR start "rule__Struct__Group__0"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5529:1: rule__Struct__Group__0 : rule__Struct__Group__0__Impl rule__Struct__Group__1 ;
	public final void rule__Struct__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5533:2: ( rule__Struct__Group__0__Impl rule__Struct__Group__1 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5534:2: rule__Struct__Group__0__Impl rule__Struct__Group__1
			{
			pushFollow(FOLLOW_rule__Struct__Group__0__Impl_in_rule__Struct__Group__011090);
			rule__Struct__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Struct__Group__1_in_rule__Struct__Group__011093);
			rule__Struct__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Struct__Group__0"



	// $ANTLR start "rule__Struct__Group__0__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5541:1: rule__Struct__Group__0__Impl : ( ( rule__Struct__NameAssignment_0 ) ) ;
	public final void rule__Struct__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5545:1: ( ( ( rule__Struct__NameAssignment_0 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5546:1: ( ( rule__Struct__NameAssignment_0 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5546:1: ( ( rule__Struct__NameAssignment_0 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5547:1: ( rule__Struct__NameAssignment_0 )
			{
			 before(grammarAccess.getStructAccess().getNameAssignment_0()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5548:2: ( rule__Struct__NameAssignment_0 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5548:2: rule__Struct__NameAssignment_0
			{
			pushFollow(FOLLOW_rule__Struct__NameAssignment_0_in_rule__Struct__Group__0__Impl11120);
			rule__Struct__NameAssignment_0();
			state._fsp--;

			}

			 after(grammarAccess.getStructAccess().getNameAssignment_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Struct__Group__0__Impl"



	// $ANTLR start "rule__Struct__Group__1"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5558:1: rule__Struct__Group__1 : rule__Struct__Group__1__Impl ;
	public final void rule__Struct__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5562:2: ( rule__Struct__Group__1__Impl )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5563:2: rule__Struct__Group__1__Impl
			{
			pushFollow(FOLLOW_rule__Struct__Group__1__Impl_in_rule__Struct__Group__111150);
			rule__Struct__Group__1__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Struct__Group__1"



	// $ANTLR start "rule__Struct__Group__1__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5569:1: rule__Struct__Group__1__Impl : ( ( ( rule__Struct__FieldsAssignment_1 ) ) ( ( rule__Struct__FieldsAssignment_1 )* ) ) ;
	public final void rule__Struct__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5573:1: ( ( ( ( rule__Struct__FieldsAssignment_1 ) ) ( ( rule__Struct__FieldsAssignment_1 )* ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5574:1: ( ( ( rule__Struct__FieldsAssignment_1 ) ) ( ( rule__Struct__FieldsAssignment_1 )* ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5574:1: ( ( ( rule__Struct__FieldsAssignment_1 ) ) ( ( rule__Struct__FieldsAssignment_1 )* ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5575:1: ( ( rule__Struct__FieldsAssignment_1 ) ) ( ( rule__Struct__FieldsAssignment_1 )* )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5575:1: ( ( rule__Struct__FieldsAssignment_1 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5576:1: ( rule__Struct__FieldsAssignment_1 )
			{
			 before(grammarAccess.getStructAccess().getFieldsAssignment_1()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5577:2: ( rule__Struct__FieldsAssignment_1 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5577:2: rule__Struct__FieldsAssignment_1
			{
			pushFollow(FOLLOW_rule__Struct__FieldsAssignment_1_in_rule__Struct__Group__1__Impl11179);
			rule__Struct__FieldsAssignment_1();
			state._fsp--;

			}

			 after(grammarAccess.getStructAccess().getFieldsAssignment_1()); 
			}

			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5580:1: ( ( rule__Struct__FieldsAssignment_1 )* )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5581:1: ( rule__Struct__FieldsAssignment_1 )*
			{
			 before(grammarAccess.getStructAccess().getFieldsAssignment_1()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5582:2: ( rule__Struct__FieldsAssignment_1 )*
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==RULE_ID) ) {
					int LA32_2 = input.LA(2);
					if ( (LA32_2==14) ) {
						alt32=1;
					}

				}

				switch (alt32) {
				case 1 :
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5582:2: rule__Struct__FieldsAssignment_1
					{
					pushFollow(FOLLOW_rule__Struct__FieldsAssignment_1_in_rule__Struct__Group__1__Impl11191);
					rule__Struct__FieldsAssignment_1();
					state._fsp--;

					}
					break;

				default :
					break loop32;
				}
			}

			 after(grammarAccess.getStructAccess().getFieldsAssignment_1()); 
			}

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Struct__Group__1__Impl"



	// $ANTLR start "rule__Field__Group__0"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5597:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
	public final void rule__Field__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5601:2: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5602:2: rule__Field__Group__0__Impl rule__Field__Group__1
			{
			pushFollow(FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__011228);
			rule__Field__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Field__Group__1_in_rule__Field__Group__011231);
			rule__Field__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Field__Group__0"



	// $ANTLR start "rule__Field__Group__0__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5609:1: rule__Field__Group__0__Impl : ( ( rule__Field__NameAssignment_0 ) ) ;
	public final void rule__Field__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5613:1: ( ( ( rule__Field__NameAssignment_0 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5614:1: ( ( rule__Field__NameAssignment_0 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5614:1: ( ( rule__Field__NameAssignment_0 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5615:1: ( rule__Field__NameAssignment_0 )
			{
			 before(grammarAccess.getFieldAccess().getNameAssignment_0()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5616:2: ( rule__Field__NameAssignment_0 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5616:2: rule__Field__NameAssignment_0
			{
			pushFollow(FOLLOW_rule__Field__NameAssignment_0_in_rule__Field__Group__0__Impl11258);
			rule__Field__NameAssignment_0();
			state._fsp--;

			}

			 after(grammarAccess.getFieldAccess().getNameAssignment_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Field__Group__0__Impl"



	// $ANTLR start "rule__Field__Group__1"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5626:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
	public final void rule__Field__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5630:2: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5631:2: rule__Field__Group__1__Impl rule__Field__Group__2
			{
			pushFollow(FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__111288);
			rule__Field__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Field__Group__2_in_rule__Field__Group__111291);
			rule__Field__Group__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Field__Group__1"



	// $ANTLR start "rule__Field__Group__1__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5638:1: rule__Field__Group__1__Impl : ( ':' ) ;
	public final void rule__Field__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5642:1: ( ( ':' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5643:1: ( ':' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5643:1: ( ':' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5644:1: ':'
			{
			 before(grammarAccess.getFieldAccess().getColonKeyword_1()); 
			match(input,14,FOLLOW_14_in_rule__Field__Group__1__Impl11319); 
			 after(grammarAccess.getFieldAccess().getColonKeyword_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Field__Group__1__Impl"



	// $ANTLR start "rule__Field__Group__2"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5657:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
	public final void rule__Field__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5661:2: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5662:2: rule__Field__Group__2__Impl rule__Field__Group__3
			{
			pushFollow(FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__211350);
			rule__Field__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Field__Group__3_in_rule__Field__Group__211353);
			rule__Field__Group__3();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Field__Group__2"



	// $ANTLR start "rule__Field__Group__2__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5669:1: rule__Field__Group__2__Impl : ( ( rule__Field__TypeAssignment_2 ) ) ;
	public final void rule__Field__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5673:1: ( ( ( rule__Field__TypeAssignment_2 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5674:1: ( ( rule__Field__TypeAssignment_2 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5674:1: ( ( rule__Field__TypeAssignment_2 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5675:1: ( rule__Field__TypeAssignment_2 )
			{
			 before(grammarAccess.getFieldAccess().getTypeAssignment_2()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5676:2: ( rule__Field__TypeAssignment_2 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5676:2: rule__Field__TypeAssignment_2
			{
			pushFollow(FOLLOW_rule__Field__TypeAssignment_2_in_rule__Field__Group__2__Impl11380);
			rule__Field__TypeAssignment_2();
			state._fsp--;

			}

			 after(grammarAccess.getFieldAccess().getTypeAssignment_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Field__Group__2__Impl"



	// $ANTLR start "rule__Field__Group__3"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5686:1: rule__Field__Group__3 : rule__Field__Group__3__Impl ;
	public final void rule__Field__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5690:2: ( rule__Field__Group__3__Impl )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5691:2: rule__Field__Group__3__Impl
			{
			pushFollow(FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__311410);
			rule__Field__Group__3__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Field__Group__3"



	// $ANTLR start "rule__Field__Group__3__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5697:1: rule__Field__Group__3__Impl : ( ';' ) ;
	public final void rule__Field__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5701:1: ( ( ';' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5702:1: ( ';' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5702:1: ( ';' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5703:1: ';'
			{
			 before(grammarAccess.getFieldAccess().getSemicolonKeyword_3()); 
			match(input,15,FOLLOW_15_in_rule__Field__Group__3__Impl11438); 
			 after(grammarAccess.getFieldAccess().getSemicolonKeyword_3()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Field__Group__3__Impl"



	// $ANTLR start "rule__PeriodicSensors__Group__0"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5724:1: rule__PeriodicSensors__Group__0 : rule__PeriodicSensors__Group__0__Impl rule__PeriodicSensors__Group__1 ;
	public final void rule__PeriodicSensors__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5728:2: ( rule__PeriodicSensors__Group__0__Impl rule__PeriodicSensors__Group__1 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5729:2: rule__PeriodicSensors__Group__0__Impl rule__PeriodicSensors__Group__1
			{
			pushFollow(FOLLOW_rule__PeriodicSensors__Group__0__Impl_in_rule__PeriodicSensors__Group__011477);
			rule__PeriodicSensors__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__PeriodicSensors__Group__1_in_rule__PeriodicSensors__Group__011480);
			rule__PeriodicSensors__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__PeriodicSensors__Group__0"



	// $ANTLR start "rule__PeriodicSensors__Group__0__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5736:1: rule__PeriodicSensors__Group__0__Impl : ( ( rule__PeriodicSensors__SensorNameAssignment_0 ) ) ;
	public final void rule__PeriodicSensors__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5740:1: ( ( ( rule__PeriodicSensors__SensorNameAssignment_0 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5741:1: ( ( rule__PeriodicSensors__SensorNameAssignment_0 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5741:1: ( ( rule__PeriodicSensors__SensorNameAssignment_0 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5742:1: ( rule__PeriodicSensors__SensorNameAssignment_0 )
			{
			 before(grammarAccess.getPeriodicSensorsAccess().getSensorNameAssignment_0()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5743:2: ( rule__PeriodicSensors__SensorNameAssignment_0 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5743:2: rule__PeriodicSensors__SensorNameAssignment_0
			{
			pushFollow(FOLLOW_rule__PeriodicSensors__SensorNameAssignment_0_in_rule__PeriodicSensors__Group__0__Impl11507);
			rule__PeriodicSensors__SensorNameAssignment_0();
			state._fsp--;

			}

			 after(grammarAccess.getPeriodicSensorsAccess().getSensorNameAssignment_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__PeriodicSensors__Group__0__Impl"



	// $ANTLR start "rule__PeriodicSensors__Group__1"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5753:1: rule__PeriodicSensors__Group__1 : rule__PeriodicSensors__Group__1__Impl rule__PeriodicSensors__Group__2 ;
	public final void rule__PeriodicSensors__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5757:2: ( rule__PeriodicSensors__Group__1__Impl rule__PeriodicSensors__Group__2 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5758:2: rule__PeriodicSensors__Group__1__Impl rule__PeriodicSensors__Group__2
			{
			pushFollow(FOLLOW_rule__PeriodicSensors__Group__1__Impl_in_rule__PeriodicSensors__Group__111537);
			rule__PeriodicSensors__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__PeriodicSensors__Group__2_in_rule__PeriodicSensors__Group__111540);
			rule__PeriodicSensors__Group__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__PeriodicSensors__Group__1"



	// $ANTLR start "rule__PeriodicSensors__Group__1__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5765:1: rule__PeriodicSensors__Group__1__Impl : ( ( ( rule__PeriodicSensors__GenerateInfoAssignment_1 ) ) ( ( rule__PeriodicSensors__GenerateInfoAssignment_1 )* ) ) ;
	public final void rule__PeriodicSensors__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5769:1: ( ( ( ( rule__PeriodicSensors__GenerateInfoAssignment_1 ) ) ( ( rule__PeriodicSensors__GenerateInfoAssignment_1 )* ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5770:1: ( ( ( rule__PeriodicSensors__GenerateInfoAssignment_1 ) ) ( ( rule__PeriodicSensors__GenerateInfoAssignment_1 )* ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5770:1: ( ( ( rule__PeriodicSensors__GenerateInfoAssignment_1 ) ) ( ( rule__PeriodicSensors__GenerateInfoAssignment_1 )* ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5771:1: ( ( rule__PeriodicSensors__GenerateInfoAssignment_1 ) ) ( ( rule__PeriodicSensors__GenerateInfoAssignment_1 )* )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5771:1: ( ( rule__PeriodicSensors__GenerateInfoAssignment_1 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5772:1: ( rule__PeriodicSensors__GenerateInfoAssignment_1 )
			{
			 before(grammarAccess.getPeriodicSensorsAccess().getGenerateInfoAssignment_1()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5773:2: ( rule__PeriodicSensors__GenerateInfoAssignment_1 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5773:2: rule__PeriodicSensors__GenerateInfoAssignment_1
			{
			pushFollow(FOLLOW_rule__PeriodicSensors__GenerateInfoAssignment_1_in_rule__PeriodicSensors__Group__1__Impl11569);
			rule__PeriodicSensors__GenerateInfoAssignment_1();
			state._fsp--;

			}

			 after(grammarAccess.getPeriodicSensorsAccess().getGenerateInfoAssignment_1()); 
			}

			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5776:1: ( ( rule__PeriodicSensors__GenerateInfoAssignment_1 )* )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5777:1: ( rule__PeriodicSensors__GenerateInfoAssignment_1 )*
			{
			 before(grammarAccess.getPeriodicSensorsAccess().getGenerateInfoAssignment_1()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5778:2: ( rule__PeriodicSensors__GenerateInfoAssignment_1 )*
			loop33:
			while (true) {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==41) ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5778:2: rule__PeriodicSensors__GenerateInfoAssignment_1
					{
					pushFollow(FOLLOW_rule__PeriodicSensors__GenerateInfoAssignment_1_in_rule__PeriodicSensors__Group__1__Impl11581);
					rule__PeriodicSensors__GenerateInfoAssignment_1();
					state._fsp--;

					}
					break;

				default :
					break loop33;
				}
			}

			 after(grammarAccess.getPeriodicSensorsAccess().getGenerateInfoAssignment_1()); 
			}

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__PeriodicSensors__Group__1__Impl"



	// $ANTLR start "rule__PeriodicSensors__Group__2"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5789:1: rule__PeriodicSensors__Group__2 : rule__PeriodicSensors__Group__2__Impl rule__PeriodicSensors__Group__3 ;
	public final void rule__PeriodicSensors__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5793:2: ( rule__PeriodicSensors__Group__2__Impl rule__PeriodicSensors__Group__3 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5794:2: rule__PeriodicSensors__Group__2__Impl rule__PeriodicSensors__Group__3
			{
			pushFollow(FOLLOW_rule__PeriodicSensors__Group__2__Impl_in_rule__PeriodicSensors__Group__211614);
			rule__PeriodicSensors__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__PeriodicSensors__Group__3_in_rule__PeriodicSensors__Group__211617);
			rule__PeriodicSensors__Group__3();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__PeriodicSensors__Group__2"



	// $ANTLR start "rule__PeriodicSensors__Group__2__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5801:1: rule__PeriodicSensors__Group__2__Impl : ( 'sample' ) ;
	public final void rule__PeriodicSensors__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5805:1: ( ( 'sample' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5806:1: ( 'sample' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5806:1: ( 'sample' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5807:1: 'sample'
			{
			 before(grammarAccess.getPeriodicSensorsAccess().getSampleKeyword_2()); 
			match(input,53,FOLLOW_53_in_rule__PeriodicSensors__Group__2__Impl11645); 
			 after(grammarAccess.getPeriodicSensorsAccess().getSampleKeyword_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__PeriodicSensors__Group__2__Impl"



	// $ANTLR start "rule__PeriodicSensors__Group__3"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5820:1: rule__PeriodicSensors__Group__3 : rule__PeriodicSensors__Group__3__Impl rule__PeriodicSensors__Group__4 ;
	public final void rule__PeriodicSensors__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5824:2: ( rule__PeriodicSensors__Group__3__Impl rule__PeriodicSensors__Group__4 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5825:2: rule__PeriodicSensors__Group__3__Impl rule__PeriodicSensors__Group__4
			{
			pushFollow(FOLLOW_rule__PeriodicSensors__Group__3__Impl_in_rule__PeriodicSensors__Group__311676);
			rule__PeriodicSensors__Group__3__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__PeriodicSensors__Group__4_in_rule__PeriodicSensors__Group__311679);
			rule__PeriodicSensors__Group__4();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__PeriodicSensors__Group__3"



	// $ANTLR start "rule__PeriodicSensors__Group__3__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5832:1: rule__PeriodicSensors__Group__3__Impl : ( 'period' ) ;
	public final void rule__PeriodicSensors__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5836:1: ( ( 'period' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5837:1: ( 'period' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5837:1: ( 'period' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5838:1: 'period'
			{
			 before(grammarAccess.getPeriodicSensorsAccess().getPeriodKeyword_3()); 
			match(input,47,FOLLOW_47_in_rule__PeriodicSensors__Group__3__Impl11707); 
			 after(grammarAccess.getPeriodicSensorsAccess().getPeriodKeyword_3()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__PeriodicSensors__Group__3__Impl"



	// $ANTLR start "rule__PeriodicSensors__Group__4"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5851:1: rule__PeriodicSensors__Group__4 : rule__PeriodicSensors__Group__4__Impl rule__PeriodicSensors__Group__5 ;
	public final void rule__PeriodicSensors__Group__4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5855:2: ( rule__PeriodicSensors__Group__4__Impl rule__PeriodicSensors__Group__5 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5856:2: rule__PeriodicSensors__Group__4__Impl rule__PeriodicSensors__Group__5
			{
			pushFollow(FOLLOW_rule__PeriodicSensors__Group__4__Impl_in_rule__PeriodicSensors__Group__411738);
			rule__PeriodicSensors__Group__4__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__PeriodicSensors__Group__5_in_rule__PeriodicSensors__Group__411741);
			rule__PeriodicSensors__Group__5();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__PeriodicSensors__Group__4"



	// $ANTLR start "rule__PeriodicSensors__Group__4__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5863:1: rule__PeriodicSensors__Group__4__Impl : ( RULE_INT ) ;
	public final void rule__PeriodicSensors__Group__4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5867:1: ( ( RULE_INT ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5868:1: ( RULE_INT )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5868:1: ( RULE_INT )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5869:1: RULE_INT
			{
			 before(grammarAccess.getPeriodicSensorsAccess().getINTTerminalRuleCall_4()); 
			match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__PeriodicSensors__Group__4__Impl11768); 
			 after(grammarAccess.getPeriodicSensorsAccess().getINTTerminalRuleCall_4()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__PeriodicSensors__Group__4__Impl"



	// $ANTLR start "rule__PeriodicSensors__Group__5"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5880:1: rule__PeriodicSensors__Group__5 : rule__PeriodicSensors__Group__5__Impl rule__PeriodicSensors__Group__6 ;
	public final void rule__PeriodicSensors__Group__5() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5884:2: ( rule__PeriodicSensors__Group__5__Impl rule__PeriodicSensors__Group__6 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5885:2: rule__PeriodicSensors__Group__5__Impl rule__PeriodicSensors__Group__6
			{
			pushFollow(FOLLOW_rule__PeriodicSensors__Group__5__Impl_in_rule__PeriodicSensors__Group__511797);
			rule__PeriodicSensors__Group__5__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__PeriodicSensors__Group__6_in_rule__PeriodicSensors__Group__511800);
			rule__PeriodicSensors__Group__6();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__PeriodicSensors__Group__5"



	// $ANTLR start "rule__PeriodicSensors__Group__5__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5892:1: rule__PeriodicSensors__Group__5__Impl : ( 'for' ) ;
	public final void rule__PeriodicSensors__Group__5__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5896:1: ( ( 'for' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5897:1: ( 'for' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5897:1: ( 'for' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5898:1: 'for'
			{
			 before(grammarAccess.getPeriodicSensorsAccess().getForKeyword_5()); 
			match(input,39,FOLLOW_39_in_rule__PeriodicSensors__Group__5__Impl11828); 
			 after(grammarAccess.getPeriodicSensorsAccess().getForKeyword_5()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__PeriodicSensors__Group__5__Impl"



	// $ANTLR start "rule__PeriodicSensors__Group__6"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5911:1: rule__PeriodicSensors__Group__6 : rule__PeriodicSensors__Group__6__Impl rule__PeriodicSensors__Group__7 ;
	public final void rule__PeriodicSensors__Group__6() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5915:2: ( rule__PeriodicSensors__Group__6__Impl rule__PeriodicSensors__Group__7 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5916:2: rule__PeriodicSensors__Group__6__Impl rule__PeriodicSensors__Group__7
			{
			pushFollow(FOLLOW_rule__PeriodicSensors__Group__6__Impl_in_rule__PeriodicSensors__Group__611859);
			rule__PeriodicSensors__Group__6__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__PeriodicSensors__Group__7_in_rule__PeriodicSensors__Group__611862);
			rule__PeriodicSensors__Group__7();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__PeriodicSensors__Group__6"



	// $ANTLR start "rule__PeriodicSensors__Group__6__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5923:1: rule__PeriodicSensors__Group__6__Impl : ( RULE_INT ) ;
	public final void rule__PeriodicSensors__Group__6__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5927:1: ( ( RULE_INT ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5928:1: ( RULE_INT )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5928:1: ( RULE_INT )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5929:1: RULE_INT
			{
			 before(grammarAccess.getPeriodicSensorsAccess().getINTTerminalRuleCall_6()); 
			match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__PeriodicSensors__Group__6__Impl11889); 
			 after(grammarAccess.getPeriodicSensorsAccess().getINTTerminalRuleCall_6()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__PeriodicSensors__Group__6__Impl"



	// $ANTLR start "rule__PeriodicSensors__Group__7"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5940:1: rule__PeriodicSensors__Group__7 : rule__PeriodicSensors__Group__7__Impl ;
	public final void rule__PeriodicSensors__Group__7() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5944:2: ( rule__PeriodicSensors__Group__7__Impl )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5945:2: rule__PeriodicSensors__Group__7__Impl
			{
			pushFollow(FOLLOW_rule__PeriodicSensors__Group__7__Impl_in_rule__PeriodicSensors__Group__711918);
			rule__PeriodicSensors__Group__7__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__PeriodicSensors__Group__7"



	// $ANTLR start "rule__PeriodicSensors__Group__7__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5951:1: rule__PeriodicSensors__Group__7__Impl : ( ';' ) ;
	public final void rule__PeriodicSensors__Group__7__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5955:1: ( ( ';' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5956:1: ( ';' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5956:1: ( ';' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5957:1: ';'
			{
			 before(grammarAccess.getPeriodicSensorsAccess().getSemicolonKeyword_7()); 
			match(input,15,FOLLOW_15_in_rule__PeriodicSensors__Group__7__Impl11946); 
			 after(grammarAccess.getPeriodicSensorsAccess().getSemicolonKeyword_7()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__PeriodicSensors__Group__7__Impl"



	// $ANTLR start "rule__EventSensors__Group__0"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5986:1: rule__EventSensors__Group__0 : rule__EventSensors__Group__0__Impl rule__EventSensors__Group__1 ;
	public final void rule__EventSensors__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5990:2: ( rule__EventSensors__Group__0__Impl rule__EventSensors__Group__1 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5991:2: rule__EventSensors__Group__0__Impl rule__EventSensors__Group__1
			{
			pushFollow(FOLLOW_rule__EventSensors__Group__0__Impl_in_rule__EventSensors__Group__011993);
			rule__EventSensors__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__EventSensors__Group__1_in_rule__EventSensors__Group__011996);
			rule__EventSensors__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EventSensors__Group__0"



	// $ANTLR start "rule__EventSensors__Group__0__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5998:1: rule__EventSensors__Group__0__Impl : ( ( rule__EventSensors__SensorNameAssignment_0 ) ) ;
	public final void rule__EventSensors__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6002:1: ( ( ( rule__EventSensors__SensorNameAssignment_0 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6003:1: ( ( rule__EventSensors__SensorNameAssignment_0 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6003:1: ( ( rule__EventSensors__SensorNameAssignment_0 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6004:1: ( rule__EventSensors__SensorNameAssignment_0 )
			{
			 before(grammarAccess.getEventSensorsAccess().getSensorNameAssignment_0()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6005:2: ( rule__EventSensors__SensorNameAssignment_0 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6005:2: rule__EventSensors__SensorNameAssignment_0
			{
			pushFollow(FOLLOW_rule__EventSensors__SensorNameAssignment_0_in_rule__EventSensors__Group__0__Impl12023);
			rule__EventSensors__SensorNameAssignment_0();
			state._fsp--;

			}

			 after(grammarAccess.getEventSensorsAccess().getSensorNameAssignment_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EventSensors__Group__0__Impl"



	// $ANTLR start "rule__EventSensors__Group__1"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6015:1: rule__EventSensors__Group__1 : rule__EventSensors__Group__1__Impl rule__EventSensors__Group__2 ;
	public final void rule__EventSensors__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6019:2: ( rule__EventSensors__Group__1__Impl rule__EventSensors__Group__2 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6020:2: rule__EventSensors__Group__1__Impl rule__EventSensors__Group__2
			{
			pushFollow(FOLLOW_rule__EventSensors__Group__1__Impl_in_rule__EventSensors__Group__112053);
			rule__EventSensors__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__EventSensors__Group__2_in_rule__EventSensors__Group__112056);
			rule__EventSensors__Group__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EventSensors__Group__1"



	// $ANTLR start "rule__EventSensors__Group__1__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6027:1: rule__EventSensors__Group__1__Impl : ( ( ( rule__EventSensors__GenerateInfoAssignment_1 ) ) ( ( rule__EventSensors__GenerateInfoAssignment_1 )* ) ) ;
	public final void rule__EventSensors__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6031:1: ( ( ( ( rule__EventSensors__GenerateInfoAssignment_1 ) ) ( ( rule__EventSensors__GenerateInfoAssignment_1 )* ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6032:1: ( ( ( rule__EventSensors__GenerateInfoAssignment_1 ) ) ( ( rule__EventSensors__GenerateInfoAssignment_1 )* ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6032:1: ( ( ( rule__EventSensors__GenerateInfoAssignment_1 ) ) ( ( rule__EventSensors__GenerateInfoAssignment_1 )* ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6033:1: ( ( rule__EventSensors__GenerateInfoAssignment_1 ) ) ( ( rule__EventSensors__GenerateInfoAssignment_1 )* )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6033:1: ( ( rule__EventSensors__GenerateInfoAssignment_1 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6034:1: ( rule__EventSensors__GenerateInfoAssignment_1 )
			{
			 before(grammarAccess.getEventSensorsAccess().getGenerateInfoAssignment_1()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6035:2: ( rule__EventSensors__GenerateInfoAssignment_1 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6035:2: rule__EventSensors__GenerateInfoAssignment_1
			{
			pushFollow(FOLLOW_rule__EventSensors__GenerateInfoAssignment_1_in_rule__EventSensors__Group__1__Impl12085);
			rule__EventSensors__GenerateInfoAssignment_1();
			state._fsp--;

			}

			 after(grammarAccess.getEventSensorsAccess().getGenerateInfoAssignment_1()); 
			}

			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6038:1: ( ( rule__EventSensors__GenerateInfoAssignment_1 )* )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6039:1: ( rule__EventSensors__GenerateInfoAssignment_1 )*
			{
			 before(grammarAccess.getEventSensorsAccess().getGenerateInfoAssignment_1()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6040:2: ( rule__EventSensors__GenerateInfoAssignment_1 )*
			loop34:
			while (true) {
				int alt34=2;
				int LA34_0 = input.LA(1);
				if ( (LA34_0==41) ) {
					alt34=1;
				}

				switch (alt34) {
				case 1 :
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6040:2: rule__EventSensors__GenerateInfoAssignment_1
					{
					pushFollow(FOLLOW_rule__EventSensors__GenerateInfoAssignment_1_in_rule__EventSensors__Group__1__Impl12097);
					rule__EventSensors__GenerateInfoAssignment_1();
					state._fsp--;

					}
					break;

				default :
					break loop34;
				}
			}

			 after(grammarAccess.getEventSensorsAccess().getGenerateInfoAssignment_1()); 
			}

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EventSensors__Group__1__Impl"



	// $ANTLR start "rule__EventSensors__Group__2"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6051:1: rule__EventSensors__Group__2 : rule__EventSensors__Group__2__Impl rule__EventSensors__Group__3 ;
	public final void rule__EventSensors__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6055:2: ( rule__EventSensors__Group__2__Impl rule__EventSensors__Group__3 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6056:2: rule__EventSensors__Group__2__Impl rule__EventSensors__Group__3
			{
			pushFollow(FOLLOW_rule__EventSensors__Group__2__Impl_in_rule__EventSensors__Group__212130);
			rule__EventSensors__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__EventSensors__Group__3_in_rule__EventSensors__Group__212133);
			rule__EventSensors__Group__3();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EventSensors__Group__2"



	// $ANTLR start "rule__EventSensors__Group__2__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6063:1: rule__EventSensors__Group__2__Impl : ( 'onCondition' ) ;
	public final void rule__EventSensors__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6067:1: ( ( 'onCondition' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6068:1: ( 'onCondition' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6068:1: ( 'onCondition' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6069:1: 'onCondition'
			{
			 before(grammarAccess.getEventSensorsAccess().getOnConditionKeyword_2()); 
			match(input,46,FOLLOW_46_in_rule__EventSensors__Group__2__Impl12161); 
			 after(grammarAccess.getEventSensorsAccess().getOnConditionKeyword_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EventSensors__Group__2__Impl"



	// $ANTLR start "rule__EventSensors__Group__3"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6082:1: rule__EventSensors__Group__3 : rule__EventSensors__Group__3__Impl rule__EventSensors__Group__4 ;
	public final void rule__EventSensors__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6086:2: ( rule__EventSensors__Group__3__Impl rule__EventSensors__Group__4 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6087:2: rule__EventSensors__Group__3__Impl rule__EventSensors__Group__4
			{
			pushFollow(FOLLOW_rule__EventSensors__Group__3__Impl_in_rule__EventSensors__Group__312192);
			rule__EventSensors__Group__3__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__EventSensors__Group__4_in_rule__EventSensors__Group__312195);
			rule__EventSensors__Group__4();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EventSensors__Group__3"



	// $ANTLR start "rule__EventSensors__Group__3__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6094:1: rule__EventSensors__Group__3__Impl : ( ( rule__EventSensors__EventConditionsAssignment_3 ) ) ;
	public final void rule__EventSensors__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6098:1: ( ( ( rule__EventSensors__EventConditionsAssignment_3 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6099:1: ( ( rule__EventSensors__EventConditionsAssignment_3 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6099:1: ( ( rule__EventSensors__EventConditionsAssignment_3 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6100:1: ( rule__EventSensors__EventConditionsAssignment_3 )
			{
			 before(grammarAccess.getEventSensorsAccess().getEventConditionsAssignment_3()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6101:2: ( rule__EventSensors__EventConditionsAssignment_3 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6101:2: rule__EventSensors__EventConditionsAssignment_3
			{
			pushFollow(FOLLOW_rule__EventSensors__EventConditionsAssignment_3_in_rule__EventSensors__Group__3__Impl12222);
			rule__EventSensors__EventConditionsAssignment_3();
			state._fsp--;

			}

			 after(grammarAccess.getEventSensorsAccess().getEventConditionsAssignment_3()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EventSensors__Group__3__Impl"



	// $ANTLR start "rule__EventSensors__Group__4"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6111:1: rule__EventSensors__Group__4 : rule__EventSensors__Group__4__Impl ;
	public final void rule__EventSensors__Group__4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6115:2: ( rule__EventSensors__Group__4__Impl )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6116:2: rule__EventSensors__Group__4__Impl
			{
			pushFollow(FOLLOW_rule__EventSensors__Group__4__Impl_in_rule__EventSensors__Group__412252);
			rule__EventSensors__Group__4__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EventSensors__Group__4"



	// $ANTLR start "rule__EventSensors__Group__4__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6122:1: rule__EventSensors__Group__4__Impl : ( ';' ) ;
	public final void rule__EventSensors__Group__4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6126:1: ( ( ';' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6127:1: ( ';' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6127:1: ( ';' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6128:1: ';'
			{
			 before(grammarAccess.getEventSensorsAccess().getSemicolonKeyword_4()); 
			match(input,15,FOLLOW_15_in_rule__EventSensors__Group__4__Impl12280); 
			 after(grammarAccess.getEventSensorsAccess().getSemicolonKeyword_4()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EventSensors__Group__4__Impl"



	// $ANTLR start "rule__EventConditions__Group__0"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6151:1: rule__EventConditions__Group__0 : rule__EventConditions__Group__0__Impl rule__EventConditions__Group__1 ;
	public final void rule__EventConditions__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6155:2: ( rule__EventConditions__Group__0__Impl rule__EventConditions__Group__1 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6156:2: rule__EventConditions__Group__0__Impl rule__EventConditions__Group__1
			{
			pushFollow(FOLLOW_rule__EventConditions__Group__0__Impl_in_rule__EventConditions__Group__012321);
			rule__EventConditions__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__EventConditions__Group__1_in_rule__EventConditions__Group__012324);
			rule__EventConditions__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EventConditions__Group__0"



	// $ANTLR start "rule__EventConditions__Group__0__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6163:1: rule__EventConditions__Group__0__Impl : ( ( rule__EventConditions__NameAssignment_0 ) ) ;
	public final void rule__EventConditions__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6167:1: ( ( ( rule__EventConditions__NameAssignment_0 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6168:1: ( ( rule__EventConditions__NameAssignment_0 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6168:1: ( ( rule__EventConditions__NameAssignment_0 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6169:1: ( rule__EventConditions__NameAssignment_0 )
			{
			 before(grammarAccess.getEventConditionsAccess().getNameAssignment_0()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6170:2: ( rule__EventConditions__NameAssignment_0 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6170:2: rule__EventConditions__NameAssignment_0
			{
			pushFollow(FOLLOW_rule__EventConditions__NameAssignment_0_in_rule__EventConditions__Group__0__Impl12351);
			rule__EventConditions__NameAssignment_0();
			state._fsp--;

			}

			 after(grammarAccess.getEventConditionsAccess().getNameAssignment_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EventConditions__Group__0__Impl"



	// $ANTLR start "rule__EventConditions__Group__1"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6180:1: rule__EventConditions__Group__1 : rule__EventConditions__Group__1__Impl ;
	public final void rule__EventConditions__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6184:2: ( rule__EventConditions__Group__1__Impl )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6185:2: rule__EventConditions__Group__1__Impl
			{
			pushFollow(FOLLOW_rule__EventConditions__Group__1__Impl_in_rule__EventConditions__Group__112381);
			rule__EventConditions__Group__1__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EventConditions__Group__1"



	// $ANTLR start "rule__EventConditions__Group__1__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6191:1: rule__EventConditions__Group__1__Impl : ( ( rule__EventConditions__Group_1__0 )? ) ;
	public final void rule__EventConditions__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6195:1: ( ( ( rule__EventConditions__Group_1__0 )? ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6196:1: ( ( rule__EventConditions__Group_1__0 )? )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6196:1: ( ( rule__EventConditions__Group_1__0 )? )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6197:1: ( rule__EventConditions__Group_1__0 )?
			{
			 before(grammarAccess.getEventConditionsAccess().getGroup_1()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6198:2: ( rule__EventConditions__Group_1__0 )?
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==13) ) {
				alt35=1;
			}
			switch (alt35) {
				case 1 :
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6198:2: rule__EventConditions__Group_1__0
					{
					pushFollow(FOLLOW_rule__EventConditions__Group_1__0_in_rule__EventConditions__Group__1__Impl12408);
					rule__EventConditions__Group_1__0();
					state._fsp--;

					}
					break;

			}

			 after(grammarAccess.getEventConditionsAccess().getGroup_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EventConditions__Group__1__Impl"



	// $ANTLR start "rule__EventConditions__Group_1__0"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6212:1: rule__EventConditions__Group_1__0 : rule__EventConditions__Group_1__0__Impl rule__EventConditions__Group_1__1 ;
	public final void rule__EventConditions__Group_1__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6216:2: ( rule__EventConditions__Group_1__0__Impl rule__EventConditions__Group_1__1 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6217:2: rule__EventConditions__Group_1__0__Impl rule__EventConditions__Group_1__1
			{
			pushFollow(FOLLOW_rule__EventConditions__Group_1__0__Impl_in_rule__EventConditions__Group_1__012443);
			rule__EventConditions__Group_1__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__EventConditions__Group_1__1_in_rule__EventConditions__Group_1__012446);
			rule__EventConditions__Group_1__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EventConditions__Group_1__0"



	// $ANTLR start "rule__EventConditions__Group_1__0__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6224:1: rule__EventConditions__Group_1__0__Impl : ( ',' ) ;
	public final void rule__EventConditions__Group_1__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6228:1: ( ( ',' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6229:1: ( ',' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6229:1: ( ',' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6230:1: ','
			{
			 before(grammarAccess.getEventConditionsAccess().getCommaKeyword_1_0()); 
			match(input,13,FOLLOW_13_in_rule__EventConditions__Group_1__0__Impl12474); 
			 after(grammarAccess.getEventConditionsAccess().getCommaKeyword_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EventConditions__Group_1__0__Impl"



	// $ANTLR start "rule__EventConditions__Group_1__1"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6243:1: rule__EventConditions__Group_1__1 : rule__EventConditions__Group_1__1__Impl ;
	public final void rule__EventConditions__Group_1__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6247:2: ( rule__EventConditions__Group_1__1__Impl )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6248:2: rule__EventConditions__Group_1__1__Impl
			{
			pushFollow(FOLLOW_rule__EventConditions__Group_1__1__Impl_in_rule__EventConditions__Group_1__112505);
			rule__EventConditions__Group_1__1__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EventConditions__Group_1__1"



	// $ANTLR start "rule__EventConditions__Group_1__1__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6254:1: rule__EventConditions__Group_1__1__Impl : ( ( rule__EventConditions__EventConditionsAssignment_1_1 ) ) ;
	public final void rule__EventConditions__Group_1__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6258:1: ( ( ( rule__EventConditions__EventConditionsAssignment_1_1 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6259:1: ( ( rule__EventConditions__EventConditionsAssignment_1_1 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6259:1: ( ( rule__EventConditions__EventConditionsAssignment_1_1 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6260:1: ( rule__EventConditions__EventConditionsAssignment_1_1 )
			{
			 before(grammarAccess.getEventConditionsAccess().getEventConditionsAssignment_1_1()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6261:2: ( rule__EventConditions__EventConditionsAssignment_1_1 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6261:2: rule__EventConditions__EventConditionsAssignment_1_1
			{
			pushFollow(FOLLOW_rule__EventConditions__EventConditionsAssignment_1_1_in_rule__EventConditions__Group_1__1__Impl12532);
			rule__EventConditions__EventConditionsAssignment_1_1();
			state._fsp--;

			}

			 after(grammarAccess.getEventConditionsAccess().getEventConditionsAssignment_1_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EventConditions__Group_1__1__Impl"



	// $ANTLR start "rule__Generate__Group__0"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6275:1: rule__Generate__Group__0 : rule__Generate__Group__0__Impl rule__Generate__Group__1 ;
	public final void rule__Generate__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6279:2: ( rule__Generate__Group__0__Impl rule__Generate__Group__1 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6280:2: rule__Generate__Group__0__Impl rule__Generate__Group__1
			{
			pushFollow(FOLLOW_rule__Generate__Group__0__Impl_in_rule__Generate__Group__012566);
			rule__Generate__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Generate__Group__1_in_rule__Generate__Group__012569);
			rule__Generate__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Generate__Group__0"



	// $ANTLR start "rule__Generate__Group__0__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6287:1: rule__Generate__Group__0__Impl : ( 'generate' ) ;
	public final void rule__Generate__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6291:1: ( ( 'generate' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6292:1: ( 'generate' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6292:1: ( 'generate' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6293:1: 'generate'
			{
			 before(grammarAccess.getGenerateAccess().getGenerateKeyword_0()); 
			match(input,41,FOLLOW_41_in_rule__Generate__Group__0__Impl12597); 
			 after(grammarAccess.getGenerateAccess().getGenerateKeyword_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Generate__Group__0__Impl"



	// $ANTLR start "rule__Generate__Group__1"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6306:1: rule__Generate__Group__1 : rule__Generate__Group__1__Impl rule__Generate__Group__2 ;
	public final void rule__Generate__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6310:2: ( rule__Generate__Group__1__Impl rule__Generate__Group__2 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6311:2: rule__Generate__Group__1__Impl rule__Generate__Group__2
			{
			pushFollow(FOLLOW_rule__Generate__Group__1__Impl_in_rule__Generate__Group__112628);
			rule__Generate__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Generate__Group__2_in_rule__Generate__Group__112631);
			rule__Generate__Group__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Generate__Group__1"



	// $ANTLR start "rule__Generate__Group__1__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6318:1: rule__Generate__Group__1__Impl : ( ( rule__Generate__SourceNameAssignment_1 ) ) ;
	public final void rule__Generate__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6322:1: ( ( ( rule__Generate__SourceNameAssignment_1 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6323:1: ( ( rule__Generate__SourceNameAssignment_1 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6323:1: ( ( rule__Generate__SourceNameAssignment_1 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6324:1: ( rule__Generate__SourceNameAssignment_1 )
			{
			 before(grammarAccess.getGenerateAccess().getSourceNameAssignment_1()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6325:2: ( rule__Generate__SourceNameAssignment_1 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6325:2: rule__Generate__SourceNameAssignment_1
			{
			pushFollow(FOLLOW_rule__Generate__SourceNameAssignment_1_in_rule__Generate__Group__1__Impl12658);
			rule__Generate__SourceNameAssignment_1();
			state._fsp--;

			}

			 after(grammarAccess.getGenerateAccess().getSourceNameAssignment_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Generate__Group__1__Impl"



	// $ANTLR start "rule__Generate__Group__2"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6335:1: rule__Generate__Group__2 : rule__Generate__Group__2__Impl rule__Generate__Group__3 ;
	public final void rule__Generate__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6339:2: ( rule__Generate__Group__2__Impl rule__Generate__Group__3 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6340:2: rule__Generate__Group__2__Impl rule__Generate__Group__3
			{
			pushFollow(FOLLOW_rule__Generate__Group__2__Impl_in_rule__Generate__Group__212688);
			rule__Generate__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Generate__Group__3_in_rule__Generate__Group__212691);
			rule__Generate__Group__3();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Generate__Group__2"



	// $ANTLR start "rule__Generate__Group__2__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6347:1: rule__Generate__Group__2__Impl : ( ':' ) ;
	public final void rule__Generate__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6351:1: ( ( ':' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6352:1: ( ':' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6352:1: ( ':' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6353:1: ':'
			{
			 before(grammarAccess.getGenerateAccess().getColonKeyword_2()); 
			match(input,14,FOLLOW_14_in_rule__Generate__Group__2__Impl12719); 
			 after(grammarAccess.getGenerateAccess().getColonKeyword_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Generate__Group__2__Impl"



	// $ANTLR start "rule__Generate__Group__3"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6366:1: rule__Generate__Group__3 : rule__Generate__Group__3__Impl rule__Generate__Group__4 ;
	public final void rule__Generate__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6370:2: ( rule__Generate__Group__3__Impl rule__Generate__Group__4 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6371:2: rule__Generate__Group__3__Impl rule__Generate__Group__4
			{
			pushFollow(FOLLOW_rule__Generate__Group__3__Impl_in_rule__Generate__Group__312750);
			rule__Generate__Group__3__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Generate__Group__4_in_rule__Generate__Group__312753);
			rule__Generate__Group__4();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Generate__Group__3"



	// $ANTLR start "rule__Generate__Group__3__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6378:1: rule__Generate__Group__3__Impl : ( ( rule__Generate__TypeAssignment_3 ) ) ;
	public final void rule__Generate__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6382:1: ( ( ( rule__Generate__TypeAssignment_3 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6383:1: ( ( rule__Generate__TypeAssignment_3 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6383:1: ( ( rule__Generate__TypeAssignment_3 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6384:1: ( rule__Generate__TypeAssignment_3 )
			{
			 before(grammarAccess.getGenerateAccess().getTypeAssignment_3()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6385:2: ( rule__Generate__TypeAssignment_3 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6385:2: rule__Generate__TypeAssignment_3
			{
			pushFollow(FOLLOW_rule__Generate__TypeAssignment_3_in_rule__Generate__Group__3__Impl12780);
			rule__Generate__TypeAssignment_3();
			state._fsp--;

			}

			 after(grammarAccess.getGenerateAccess().getTypeAssignment_3()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Generate__Group__3__Impl"



	// $ANTLR start "rule__Generate__Group__4"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6395:1: rule__Generate__Group__4 : rule__Generate__Group__4__Impl ;
	public final void rule__Generate__Group__4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6399:2: ( rule__Generate__Group__4__Impl )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6400:2: rule__Generate__Group__4__Impl
			{
			pushFollow(FOLLOW_rule__Generate__Group__4__Impl_in_rule__Generate__Group__412810);
			rule__Generate__Group__4__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Generate__Group__4"



	// $ANTLR start "rule__Generate__Group__4__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6406:1: rule__Generate__Group__4__Impl : ( ';' ) ;
	public final void rule__Generate__Group__4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6410:1: ( ( ';' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6411:1: ( ';' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6411:1: ( ';' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6412:1: ';'
			{
			 before(grammarAccess.getGenerateAccess().getSemicolonKeyword_4()); 
			match(input,15,FOLLOW_15_in_rule__Generate__Group__4__Impl12838); 
			 after(grammarAccess.getGenerateAccess().getSemicolonKeyword_4()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Generate__Group__4__Impl"



	// $ANTLR start "rule__Actuator__Group__0"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6435:1: rule__Actuator__Group__0 : rule__Actuator__Group__0__Impl rule__Actuator__Group__1 ;
	public final void rule__Actuator__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6439:2: ( rule__Actuator__Group__0__Impl rule__Actuator__Group__1 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6440:2: rule__Actuator__Group__0__Impl rule__Actuator__Group__1
			{
			pushFollow(FOLLOW_rule__Actuator__Group__0__Impl_in_rule__Actuator__Group__012879);
			rule__Actuator__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Actuator__Group__1_in_rule__Actuator__Group__012882);
			rule__Actuator__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Actuator__Group__0"



	// $ANTLR start "rule__Actuator__Group__0__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6447:1: rule__Actuator__Group__0__Impl : ( ( rule__Actuator__ActuatorNameAssignment_0 ) ) ;
	public final void rule__Actuator__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6451:1: ( ( ( rule__Actuator__ActuatorNameAssignment_0 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6452:1: ( ( rule__Actuator__ActuatorNameAssignment_0 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6452:1: ( ( rule__Actuator__ActuatorNameAssignment_0 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6453:1: ( rule__Actuator__ActuatorNameAssignment_0 )
			{
			 before(grammarAccess.getActuatorAccess().getActuatorNameAssignment_0()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6454:2: ( rule__Actuator__ActuatorNameAssignment_0 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6454:2: rule__Actuator__ActuatorNameAssignment_0
			{
			pushFollow(FOLLOW_rule__Actuator__ActuatorNameAssignment_0_in_rule__Actuator__Group__0__Impl12909);
			rule__Actuator__ActuatorNameAssignment_0();
			state._fsp--;

			}

			 after(grammarAccess.getActuatorAccess().getActuatorNameAssignment_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Actuator__Group__0__Impl"



	// $ANTLR start "rule__Actuator__Group__1"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6464:1: rule__Actuator__Group__1 : rule__Actuator__Group__1__Impl ;
	public final void rule__Actuator__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6468:2: ( rule__Actuator__Group__1__Impl )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6469:2: rule__Actuator__Group__1__Impl
			{
			pushFollow(FOLLOW_rule__Actuator__Group__1__Impl_in_rule__Actuator__Group__112939);
			rule__Actuator__Group__1__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Actuator__Group__1"



	// $ANTLR start "rule__Actuator__Group__1__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6475:1: rule__Actuator__Group__1__Impl : ( ( rule__Actuator__ActionsAssignment_1 )* ) ;
	public final void rule__Actuator__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6479:1: ( ( ( rule__Actuator__ActionsAssignment_1 )* ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6480:1: ( ( rule__Actuator__ActionsAssignment_1 )* )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6480:1: ( ( rule__Actuator__ActionsAssignment_1 )* )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6481:1: ( rule__Actuator__ActionsAssignment_1 )*
			{
			 before(grammarAccess.getActuatorAccess().getActionsAssignment_1()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6482:2: ( rule__Actuator__ActionsAssignment_1 )*
			loop36:
			while (true) {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( (LA36_0==28) ) {
					alt36=1;
				}

				switch (alt36) {
				case 1 :
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6482:2: rule__Actuator__ActionsAssignment_1
					{
					pushFollow(FOLLOW_rule__Actuator__ActionsAssignment_1_in_rule__Actuator__Group__1__Impl12966);
					rule__Actuator__ActionsAssignment_1();
					state._fsp--;

					}
					break;

				default :
					break loop36;
				}
			}

			 after(grammarAccess.getActuatorAccess().getActionsAssignment_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Actuator__Group__1__Impl"



	// $ANTLR start "rule__Action__Group__0"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6496:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
	public final void rule__Action__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6500:2: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6501:2: rule__Action__Group__0__Impl rule__Action__Group__1
			{
			pushFollow(FOLLOW_rule__Action__Group__0__Impl_in_rule__Action__Group__013001);
			rule__Action__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Action__Group__1_in_rule__Action__Group__013004);
			rule__Action__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Action__Group__0"



	// $ANTLR start "rule__Action__Group__0__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6508:1: rule__Action__Group__0__Impl : ( 'action' ) ;
	public final void rule__Action__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6512:1: ( ( 'action' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6513:1: ( 'action' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6513:1: ( 'action' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6514:1: 'action'
			{
			 before(grammarAccess.getActionAccess().getActionKeyword_0()); 
			match(input,28,FOLLOW_28_in_rule__Action__Group__0__Impl13032); 
			 after(grammarAccess.getActionAccess().getActionKeyword_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Action__Group__0__Impl"



	// $ANTLR start "rule__Action__Group__1"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6527:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
	public final void rule__Action__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6531:2: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6532:2: rule__Action__Group__1__Impl rule__Action__Group__2
			{
			pushFollow(FOLLOW_rule__Action__Group__1__Impl_in_rule__Action__Group__113063);
			rule__Action__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Action__Group__2_in_rule__Action__Group__113066);
			rule__Action__Group__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Action__Group__1"



	// $ANTLR start "rule__Action__Group__1__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6539:1: rule__Action__Group__1__Impl : ( ( rule__Action__ActionNameAssignment_1 ) ) ;
	public final void rule__Action__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6543:1: ( ( ( rule__Action__ActionNameAssignment_1 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6544:1: ( ( rule__Action__ActionNameAssignment_1 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6544:1: ( ( rule__Action__ActionNameAssignment_1 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6545:1: ( rule__Action__ActionNameAssignment_1 )
			{
			 before(grammarAccess.getActionAccess().getActionNameAssignment_1()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6546:2: ( rule__Action__ActionNameAssignment_1 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6546:2: rule__Action__ActionNameAssignment_1
			{
			pushFollow(FOLLOW_rule__Action__ActionNameAssignment_1_in_rule__Action__Group__1__Impl13093);
			rule__Action__ActionNameAssignment_1();
			state._fsp--;

			}

			 after(grammarAccess.getActionAccess().getActionNameAssignment_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Action__Group__1__Impl"



	// $ANTLR start "rule__Action__Group__2"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6556:1: rule__Action__Group__2 : rule__Action__Group__2__Impl rule__Action__Group__3 ;
	public final void rule__Action__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6560:2: ( rule__Action__Group__2__Impl rule__Action__Group__3 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6561:2: rule__Action__Group__2__Impl rule__Action__Group__3
			{
			pushFollow(FOLLOW_rule__Action__Group__2__Impl_in_rule__Action__Group__213123);
			rule__Action__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Action__Group__3_in_rule__Action__Group__213126);
			rule__Action__Group__3();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Action__Group__2"



	// $ANTLR start "rule__Action__Group__2__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6568:1: rule__Action__Group__2__Impl : ( '(' ) ;
	public final void rule__Action__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6572:1: ( ( '(' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6573:1: ( '(' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6573:1: ( '(' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6574:1: '('
			{
			 before(grammarAccess.getActionAccess().getLeftParenthesisKeyword_2()); 
			match(input,11,FOLLOW_11_in_rule__Action__Group__2__Impl13154); 
			 after(grammarAccess.getActionAccess().getLeftParenthesisKeyword_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Action__Group__2__Impl"



	// $ANTLR start "rule__Action__Group__3"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6587:1: rule__Action__Group__3 : rule__Action__Group__3__Impl rule__Action__Group__4 ;
	public final void rule__Action__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6591:2: ( rule__Action__Group__3__Impl rule__Action__Group__4 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6592:2: rule__Action__Group__3__Impl rule__Action__Group__4
			{
			pushFollow(FOLLOW_rule__Action__Group__3__Impl_in_rule__Action__Group__313185);
			rule__Action__Group__3__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Action__Group__4_in_rule__Action__Group__313188);
			rule__Action__Group__4();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Action__Group__3"



	// $ANTLR start "rule__Action__Group__3__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6599:1: rule__Action__Group__3__Impl : ( ( rule__Action__ParametersAssignment_3 )* ) ;
	public final void rule__Action__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6603:1: ( ( ( rule__Action__ParametersAssignment_3 )* ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6604:1: ( ( rule__Action__ParametersAssignment_3 )* )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6604:1: ( ( rule__Action__ParametersAssignment_3 )* )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6605:1: ( rule__Action__ParametersAssignment_3 )*
			{
			 before(grammarAccess.getActionAccess().getParametersAssignment_3()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6606:2: ( rule__Action__ParametersAssignment_3 )*
			loop37:
			while (true) {
				int alt37=2;
				int LA37_0 = input.LA(1);
				if ( (LA37_0==RULE_ID) ) {
					alt37=1;
				}

				switch (alt37) {
				case 1 :
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6606:2: rule__Action__ParametersAssignment_3
					{
					pushFollow(FOLLOW_rule__Action__ParametersAssignment_3_in_rule__Action__Group__3__Impl13215);
					rule__Action__ParametersAssignment_3();
					state._fsp--;

					}
					break;

				default :
					break loop37;
				}
			}

			 after(grammarAccess.getActionAccess().getParametersAssignment_3()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Action__Group__3__Impl"



	// $ANTLR start "rule__Action__Group__4"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6616:1: rule__Action__Group__4 : rule__Action__Group__4__Impl rule__Action__Group__5 ;
	public final void rule__Action__Group__4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6620:2: ( rule__Action__Group__4__Impl rule__Action__Group__5 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6621:2: rule__Action__Group__4__Impl rule__Action__Group__5
			{
			pushFollow(FOLLOW_rule__Action__Group__4__Impl_in_rule__Action__Group__413246);
			rule__Action__Group__4__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Action__Group__5_in_rule__Action__Group__413249);
			rule__Action__Group__5();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Action__Group__4"



	// $ANTLR start "rule__Action__Group__4__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6628:1: rule__Action__Group__4__Impl : ( ')' ) ;
	public final void rule__Action__Group__4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6632:1: ( ( ')' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6633:1: ( ')' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6633:1: ( ')' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6634:1: ')'
			{
			 before(grammarAccess.getActionAccess().getRightParenthesisKeyword_4()); 
			match(input,12,FOLLOW_12_in_rule__Action__Group__4__Impl13277); 
			 after(grammarAccess.getActionAccess().getRightParenthesisKeyword_4()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Action__Group__4__Impl"



	// $ANTLR start "rule__Action__Group__5"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6647:1: rule__Action__Group__5 : rule__Action__Group__5__Impl ;
	public final void rule__Action__Group__5() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6651:2: ( rule__Action__Group__5__Impl )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6652:2: rule__Action__Group__5__Impl
			{
			pushFollow(FOLLOW_rule__Action__Group__5__Impl_in_rule__Action__Group__513308);
			rule__Action__Group__5__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Action__Group__5"



	// $ANTLR start "rule__Action__Group__5__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6658:1: rule__Action__Group__5__Impl : ( ';' ) ;
	public final void rule__Action__Group__5__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6662:1: ( ( ';' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6663:1: ( ';' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6663:1: ( ';' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6664:1: ';'
			{
			 before(grammarAccess.getActionAccess().getSemicolonKeyword_5()); 
			match(input,15,FOLLOW_15_in_rule__Action__Group__5__Impl13336); 
			 after(grammarAccess.getActionAccess().getSemicolonKeyword_5()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Action__Group__5__Impl"



	// $ANTLR start "rule__Parameters__Group__0"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6689:1: rule__Parameters__Group__0 : rule__Parameters__Group__0__Impl rule__Parameters__Group__1 ;
	public final void rule__Parameters__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6693:2: ( rule__Parameters__Group__0__Impl rule__Parameters__Group__1 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6694:2: rule__Parameters__Group__0__Impl rule__Parameters__Group__1
			{
			pushFollow(FOLLOW_rule__Parameters__Group__0__Impl_in_rule__Parameters__Group__013379);
			rule__Parameters__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Parameters__Group__1_in_rule__Parameters__Group__013382);
			rule__Parameters__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Parameters__Group__0"



	// $ANTLR start "rule__Parameters__Group__0__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6701:1: rule__Parameters__Group__0__Impl : ( ( rule__Parameters__ParameterNameAssignment_0 ) ) ;
	public final void rule__Parameters__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6705:1: ( ( ( rule__Parameters__ParameterNameAssignment_0 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6706:1: ( ( rule__Parameters__ParameterNameAssignment_0 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6706:1: ( ( rule__Parameters__ParameterNameAssignment_0 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6707:1: ( rule__Parameters__ParameterNameAssignment_0 )
			{
			 before(grammarAccess.getParametersAccess().getParameterNameAssignment_0()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6708:2: ( rule__Parameters__ParameterNameAssignment_0 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6708:2: rule__Parameters__ParameterNameAssignment_0
			{
			pushFollow(FOLLOW_rule__Parameters__ParameterNameAssignment_0_in_rule__Parameters__Group__0__Impl13409);
			rule__Parameters__ParameterNameAssignment_0();
			state._fsp--;

			}

			 after(grammarAccess.getParametersAccess().getParameterNameAssignment_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Parameters__Group__0__Impl"



	// $ANTLR start "rule__Parameters__Group__1"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6718:1: rule__Parameters__Group__1 : rule__Parameters__Group__1__Impl rule__Parameters__Group__2 ;
	public final void rule__Parameters__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6722:2: ( rule__Parameters__Group__1__Impl rule__Parameters__Group__2 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6723:2: rule__Parameters__Group__1__Impl rule__Parameters__Group__2
			{
			pushFollow(FOLLOW_rule__Parameters__Group__1__Impl_in_rule__Parameters__Group__113439);
			rule__Parameters__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Parameters__Group__2_in_rule__Parameters__Group__113442);
			rule__Parameters__Group__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Parameters__Group__1"



	// $ANTLR start "rule__Parameters__Group__1__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6730:1: rule__Parameters__Group__1__Impl : ( ':' ) ;
	public final void rule__Parameters__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6734:1: ( ( ':' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6735:1: ( ':' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6735:1: ( ':' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6736:1: ':'
			{
			 before(grammarAccess.getParametersAccess().getColonKeyword_1()); 
			match(input,14,FOLLOW_14_in_rule__Parameters__Group__1__Impl13470); 
			 after(grammarAccess.getParametersAccess().getColonKeyword_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Parameters__Group__1__Impl"



	// $ANTLR start "rule__Parameters__Group__2"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6749:1: rule__Parameters__Group__2 : rule__Parameters__Group__2__Impl ;
	public final void rule__Parameters__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6753:2: ( rule__Parameters__Group__2__Impl )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6754:2: rule__Parameters__Group__2__Impl
			{
			pushFollow(FOLLOW_rule__Parameters__Group__2__Impl_in_rule__Parameters__Group__213501);
			rule__Parameters__Group__2__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Parameters__Group__2"



	// $ANTLR start "rule__Parameters__Group__2__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6760:1: rule__Parameters__Group__2__Impl : ( ( rule__Parameters__TypeAssignment_2 ) ) ;
	public final void rule__Parameters__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6764:1: ( ( ( rule__Parameters__TypeAssignment_2 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6765:1: ( ( rule__Parameters__TypeAssignment_2 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6765:1: ( ( rule__Parameters__TypeAssignment_2 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6766:1: ( rule__Parameters__TypeAssignment_2 )
			{
			 before(grammarAccess.getParametersAccess().getTypeAssignment_2()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6767:2: ( rule__Parameters__TypeAssignment_2 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6767:2: rule__Parameters__TypeAssignment_2
			{
			pushFollow(FOLLOW_rule__Parameters__TypeAssignment_2_in_rule__Parameters__Group__2__Impl13528);
			rule__Parameters__TypeAssignment_2();
			state._fsp--;

			}

			 after(grammarAccess.getParametersAccess().getTypeAssignment_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Parameters__Group__2__Impl"



	// $ANTLR start "rule__StorageService__Group__0"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6783:1: rule__StorageService__Group__0 : rule__StorageService__Group__0__Impl rule__StorageService__Group__1 ;
	public final void rule__StorageService__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6787:2: ( rule__StorageService__Group__0__Impl rule__StorageService__Group__1 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6788:2: rule__StorageService__Group__0__Impl rule__StorageService__Group__1
			{
			pushFollow(FOLLOW_rule__StorageService__Group__0__Impl_in_rule__StorageService__Group__013564);
			rule__StorageService__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__StorageService__Group__1_in_rule__StorageService__Group__013567);
			rule__StorageService__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__StorageService__Group__0"



	// $ANTLR start "rule__StorageService__Group__0__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6795:1: rule__StorageService__Group__0__Impl : ( ( rule__StorageService__StorageServiceNameAssignment_0 ) ) ;
	public final void rule__StorageService__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6799:1: ( ( ( rule__StorageService__StorageServiceNameAssignment_0 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6800:1: ( ( rule__StorageService__StorageServiceNameAssignment_0 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6800:1: ( ( rule__StorageService__StorageServiceNameAssignment_0 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6801:1: ( rule__StorageService__StorageServiceNameAssignment_0 )
			{
			 before(grammarAccess.getStorageServiceAccess().getStorageServiceNameAssignment_0()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6802:2: ( rule__StorageService__StorageServiceNameAssignment_0 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6802:2: rule__StorageService__StorageServiceNameAssignment_0
			{
			pushFollow(FOLLOW_rule__StorageService__StorageServiceNameAssignment_0_in_rule__StorageService__Group__0__Impl13594);
			rule__StorageService__StorageServiceNameAssignment_0();
			state._fsp--;

			}

			 after(grammarAccess.getStorageServiceAccess().getStorageServiceNameAssignment_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__StorageService__Group__0__Impl"



	// $ANTLR start "rule__StorageService__Group__1"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6812:1: rule__StorageService__Group__1 : rule__StorageService__Group__1__Impl ;
	public final void rule__StorageService__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6816:2: ( rule__StorageService__Group__1__Impl )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6817:2: rule__StorageService__Group__1__Impl
			{
			pushFollow(FOLLOW_rule__StorageService__Group__1__Impl_in_rule__StorageService__Group__113624);
			rule__StorageService__Group__1__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__StorageService__Group__1"



	// $ANTLR start "rule__StorageService__Group__1__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6823:1: rule__StorageService__Group__1__Impl : ( ( rule__StorageService__DataAccessesAssignment_1 )* ) ;
	public final void rule__StorageService__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6827:1: ( ( ( rule__StorageService__DataAccessesAssignment_1 )* ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6828:1: ( ( rule__StorageService__DataAccessesAssignment_1 )* )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6828:1: ( ( rule__StorageService__DataAccessesAssignment_1 )* )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6829:1: ( rule__StorageService__DataAccessesAssignment_1 )*
			{
			 before(grammarAccess.getStorageServiceAccess().getDataAccessesAssignment_1()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6830:2: ( rule__StorageService__DataAccessesAssignment_1 )*
			loop38:
			while (true) {
				int alt38=2;
				int LA38_0 = input.LA(1);
				if ( (LA38_0==41) ) {
					alt38=1;
				}

				switch (alt38) {
				case 1 :
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6830:2: rule__StorageService__DataAccessesAssignment_1
					{
					pushFollow(FOLLOW_rule__StorageService__DataAccessesAssignment_1_in_rule__StorageService__Group__1__Impl13651);
					rule__StorageService__DataAccessesAssignment_1();
					state._fsp--;

					}
					break;

				default :
					break loop38;
				}
			}

			 after(grammarAccess.getStorageServiceAccess().getDataAccessesAssignment_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__StorageService__Group__1__Impl"



	// $ANTLR start "rule__DataAccess__Group__0"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6844:1: rule__DataAccess__Group__0 : rule__DataAccess__Group__0__Impl rule__DataAccess__Group__1 ;
	public final void rule__DataAccess__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6848:2: ( rule__DataAccess__Group__0__Impl rule__DataAccess__Group__1 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6849:2: rule__DataAccess__Group__0__Impl rule__DataAccess__Group__1
			{
			pushFollow(FOLLOW_rule__DataAccess__Group__0__Impl_in_rule__DataAccess__Group__013686);
			rule__DataAccess__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__DataAccess__Group__1_in_rule__DataAccess__Group__013689);
			rule__DataAccess__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__DataAccess__Group__0"



	// $ANTLR start "rule__DataAccess__Group__0__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6856:1: rule__DataAccess__Group__0__Impl : ( 'generate' ) ;
	public final void rule__DataAccess__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6860:1: ( ( 'generate' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6861:1: ( 'generate' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6861:1: ( 'generate' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6862:1: 'generate'
			{
			 before(grammarAccess.getDataAccessAccess().getGenerateKeyword_0()); 
			match(input,41,FOLLOW_41_in_rule__DataAccess__Group__0__Impl13717); 
			 after(grammarAccess.getDataAccessAccess().getGenerateKeyword_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__DataAccess__Group__0__Impl"



	// $ANTLR start "rule__DataAccess__Group__1"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6875:1: rule__DataAccess__Group__1 : rule__DataAccess__Group__1__Impl rule__DataAccess__Group__2 ;
	public final void rule__DataAccess__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6879:2: ( rule__DataAccess__Group__1__Impl rule__DataAccess__Group__2 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6880:2: rule__DataAccess__Group__1__Impl rule__DataAccess__Group__2
			{
			pushFollow(FOLLOW_rule__DataAccess__Group__1__Impl_in_rule__DataAccess__Group__113748);
			rule__DataAccess__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__DataAccess__Group__2_in_rule__DataAccess__Group__113751);
			rule__DataAccess__Group__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__DataAccess__Group__1"



	// $ANTLR start "rule__DataAccess__Group__1__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6887:1: rule__DataAccess__Group__1__Impl : ( ( rule__DataAccess__SourceNameAssignment_1 ) ) ;
	public final void rule__DataAccess__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6891:1: ( ( ( rule__DataAccess__SourceNameAssignment_1 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6892:1: ( ( rule__DataAccess__SourceNameAssignment_1 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6892:1: ( ( rule__DataAccess__SourceNameAssignment_1 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6893:1: ( rule__DataAccess__SourceNameAssignment_1 )
			{
			 before(grammarAccess.getDataAccessAccess().getSourceNameAssignment_1()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6894:2: ( rule__DataAccess__SourceNameAssignment_1 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6894:2: rule__DataAccess__SourceNameAssignment_1
			{
			pushFollow(FOLLOW_rule__DataAccess__SourceNameAssignment_1_in_rule__DataAccess__Group__1__Impl13778);
			rule__DataAccess__SourceNameAssignment_1();
			state._fsp--;

			}

			 after(grammarAccess.getDataAccessAccess().getSourceNameAssignment_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__DataAccess__Group__1__Impl"



	// $ANTLR start "rule__DataAccess__Group__2"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6904:1: rule__DataAccess__Group__2 : rule__DataAccess__Group__2__Impl rule__DataAccess__Group__3 ;
	public final void rule__DataAccess__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6908:2: ( rule__DataAccess__Group__2__Impl rule__DataAccess__Group__3 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6909:2: rule__DataAccess__Group__2__Impl rule__DataAccess__Group__3
			{
			pushFollow(FOLLOW_rule__DataAccess__Group__2__Impl_in_rule__DataAccess__Group__213808);
			rule__DataAccess__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__DataAccess__Group__3_in_rule__DataAccess__Group__213811);
			rule__DataAccess__Group__3();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__DataAccess__Group__2"



	// $ANTLR start "rule__DataAccess__Group__2__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6916:1: rule__DataAccess__Group__2__Impl : ( ':' ) ;
	public final void rule__DataAccess__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6920:1: ( ( ':' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6921:1: ( ':' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6921:1: ( ':' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6922:1: ':'
			{
			 before(grammarAccess.getDataAccessAccess().getColonKeyword_2()); 
			match(input,14,FOLLOW_14_in_rule__DataAccess__Group__2__Impl13839); 
			 after(grammarAccess.getDataAccessAccess().getColonKeyword_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__DataAccess__Group__2__Impl"



	// $ANTLR start "rule__DataAccess__Group__3"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6935:1: rule__DataAccess__Group__3 : rule__DataAccess__Group__3__Impl rule__DataAccess__Group__4 ;
	public final void rule__DataAccess__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6939:2: ( rule__DataAccess__Group__3__Impl rule__DataAccess__Group__4 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6940:2: rule__DataAccess__Group__3__Impl rule__DataAccess__Group__4
			{
			pushFollow(FOLLOW_rule__DataAccess__Group__3__Impl_in_rule__DataAccess__Group__313870);
			rule__DataAccess__Group__3__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__DataAccess__Group__4_in_rule__DataAccess__Group__313873);
			rule__DataAccess__Group__4();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__DataAccess__Group__3"



	// $ANTLR start "rule__DataAccess__Group__3__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6947:1: rule__DataAccess__Group__3__Impl : ( ( rule__DataAccess__DataAccessTypeAssignment_3 ) ) ;
	public final void rule__DataAccess__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6951:1: ( ( ( rule__DataAccess__DataAccessTypeAssignment_3 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6952:1: ( ( rule__DataAccess__DataAccessTypeAssignment_3 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6952:1: ( ( rule__DataAccess__DataAccessTypeAssignment_3 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6953:1: ( rule__DataAccess__DataAccessTypeAssignment_3 )
			{
			 before(grammarAccess.getDataAccessAccess().getDataAccessTypeAssignment_3()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6954:2: ( rule__DataAccess__DataAccessTypeAssignment_3 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6954:2: rule__DataAccess__DataAccessTypeAssignment_3
			{
			pushFollow(FOLLOW_rule__DataAccess__DataAccessTypeAssignment_3_in_rule__DataAccess__Group__3__Impl13900);
			rule__DataAccess__DataAccessTypeAssignment_3();
			state._fsp--;

			}

			 after(grammarAccess.getDataAccessAccess().getDataAccessTypeAssignment_3()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__DataAccess__Group__3__Impl"



	// $ANTLR start "rule__DataAccess__Group__4"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6964:1: rule__DataAccess__Group__4 : rule__DataAccess__Group__4__Impl rule__DataAccess__Group__5 ;
	public final void rule__DataAccess__Group__4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6968:2: ( rule__DataAccess__Group__4__Impl rule__DataAccess__Group__5 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6969:2: rule__DataAccess__Group__4__Impl rule__DataAccess__Group__5
			{
			pushFollow(FOLLOW_rule__DataAccess__Group__4__Impl_in_rule__DataAccess__Group__413930);
			rule__DataAccess__Group__4__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__DataAccess__Group__5_in_rule__DataAccess__Group__413933);
			rule__DataAccess__Group__5();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__DataAccess__Group__4"



	// $ANTLR start "rule__DataAccess__Group__4__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6976:1: rule__DataAccess__Group__4__Impl : ( 'accessed-by' ) ;
	public final void rule__DataAccess__Group__4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6980:1: ( ( 'accessed-by' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6981:1: ( 'accessed-by' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6981:1: ( 'accessed-by' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6982:1: 'accessed-by'
			{
			 before(grammarAccess.getDataAccessAccess().getAccessedByKeyword_4()); 
			match(input,27,FOLLOW_27_in_rule__DataAccess__Group__4__Impl13961); 
			 after(grammarAccess.getDataAccessAccess().getAccessedByKeyword_4()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__DataAccess__Group__4__Impl"



	// $ANTLR start "rule__DataAccess__Group__5"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6995:1: rule__DataAccess__Group__5 : rule__DataAccess__Group__5__Impl rule__DataAccess__Group__6 ;
	public final void rule__DataAccess__Group__5() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6999:2: ( rule__DataAccess__Group__5__Impl rule__DataAccess__Group__6 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7000:2: rule__DataAccess__Group__5__Impl rule__DataAccess__Group__6
			{
			pushFollow(FOLLOW_rule__DataAccess__Group__5__Impl_in_rule__DataAccess__Group__513992);
			rule__DataAccess__Group__5__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__DataAccess__Group__6_in_rule__DataAccess__Group__513995);
			rule__DataAccess__Group__6();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__DataAccess__Group__5"



	// $ANTLR start "rule__DataAccess__Group__5__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7007:1: rule__DataAccess__Group__5__Impl : ( ( rule__DataAccess__DataItemAssignment_5 ) ) ;
	public final void rule__DataAccess__Group__5__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7011:1: ( ( ( rule__DataAccess__DataItemAssignment_5 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7012:1: ( ( rule__DataAccess__DataItemAssignment_5 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7012:1: ( ( rule__DataAccess__DataItemAssignment_5 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7013:1: ( rule__DataAccess__DataItemAssignment_5 )
			{
			 before(grammarAccess.getDataAccessAccess().getDataItemAssignment_5()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7014:2: ( rule__DataAccess__DataItemAssignment_5 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7014:2: rule__DataAccess__DataItemAssignment_5
			{
			pushFollow(FOLLOW_rule__DataAccess__DataItemAssignment_5_in_rule__DataAccess__Group__5__Impl14022);
			rule__DataAccess__DataItemAssignment_5();
			state._fsp--;

			}

			 after(grammarAccess.getDataAccessAccess().getDataItemAssignment_5()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__DataAccess__Group__5__Impl"



	// $ANTLR start "rule__DataAccess__Group__6"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7024:1: rule__DataAccess__Group__6 : rule__DataAccess__Group__6__Impl rule__DataAccess__Group__7 ;
	public final void rule__DataAccess__Group__6() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7028:2: ( rule__DataAccess__Group__6__Impl rule__DataAccess__Group__7 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7029:2: rule__DataAccess__Group__6__Impl rule__DataAccess__Group__7
			{
			pushFollow(FOLLOW_rule__DataAccess__Group__6__Impl_in_rule__DataAccess__Group__614052);
			rule__DataAccess__Group__6__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__DataAccess__Group__7_in_rule__DataAccess__Group__614055);
			rule__DataAccess__Group__7();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__DataAccess__Group__6"



	// $ANTLR start "rule__DataAccess__Group__6__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7036:1: rule__DataAccess__Group__6__Impl : ( ':' ) ;
	public final void rule__DataAccess__Group__6__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7040:1: ( ( ':' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7041:1: ( ':' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7041:1: ( ':' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7042:1: ':'
			{
			 before(grammarAccess.getDataAccessAccess().getColonKeyword_6()); 
			match(input,14,FOLLOW_14_in_rule__DataAccess__Group__6__Impl14083); 
			 after(grammarAccess.getDataAccessAccess().getColonKeyword_6()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__DataAccess__Group__6__Impl"



	// $ANTLR start "rule__DataAccess__Group__7"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7055:1: rule__DataAccess__Group__7 : rule__DataAccess__Group__7__Impl rule__DataAccess__Group__8 ;
	public final void rule__DataAccess__Group__7() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7059:2: ( rule__DataAccess__Group__7__Impl rule__DataAccess__Group__8 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7060:2: rule__DataAccess__Group__7__Impl rule__DataAccess__Group__8
			{
			pushFollow(FOLLOW_rule__DataAccess__Group__7__Impl_in_rule__DataAccess__Group__714114);
			rule__DataAccess__Group__7__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__DataAccess__Group__8_in_rule__DataAccess__Group__714117);
			rule__DataAccess__Group__8();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__DataAccess__Group__7"



	// $ANTLR start "rule__DataAccess__Group__7__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7067:1: rule__DataAccess__Group__7__Impl : ( ( rule__DataAccess__TypeAssignment_7 ) ) ;
	public final void rule__DataAccess__Group__7__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7071:1: ( ( ( rule__DataAccess__TypeAssignment_7 ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7072:1: ( ( rule__DataAccess__TypeAssignment_7 ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7072:1: ( ( rule__DataAccess__TypeAssignment_7 ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7073:1: ( rule__DataAccess__TypeAssignment_7 )
			{
			 before(grammarAccess.getDataAccessAccess().getTypeAssignment_7()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7074:2: ( rule__DataAccess__TypeAssignment_7 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7074:2: rule__DataAccess__TypeAssignment_7
			{
			pushFollow(FOLLOW_rule__DataAccess__TypeAssignment_7_in_rule__DataAccess__Group__7__Impl14144);
			rule__DataAccess__TypeAssignment_7();
			state._fsp--;

			}

			 after(grammarAccess.getDataAccessAccess().getTypeAssignment_7()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__DataAccess__Group__7__Impl"



	// $ANTLR start "rule__DataAccess__Group__8"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7084:1: rule__DataAccess__Group__8 : rule__DataAccess__Group__8__Impl rule__DataAccess__Group__9 ;
	public final void rule__DataAccess__Group__8() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7088:2: ( rule__DataAccess__Group__8__Impl rule__DataAccess__Group__9 )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7089:2: rule__DataAccess__Group__8__Impl rule__DataAccess__Group__9
			{
			pushFollow(FOLLOW_rule__DataAccess__Group__8__Impl_in_rule__DataAccess__Group__814174);
			rule__DataAccess__Group__8__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__DataAccess__Group__9_in_rule__DataAccess__Group__814177);
			rule__DataAccess__Group__9();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__DataAccess__Group__8"



	// $ANTLR start "rule__DataAccess__Group__8__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7096:1: rule__DataAccess__Group__8__Impl : ( ';' ) ;
	public final void rule__DataAccess__Group__8__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7100:1: ( ( ';' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7101:1: ( ';' )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7101:1: ( ';' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7102:1: ';'
			{
			 before(grammarAccess.getDataAccessAccess().getSemicolonKeyword_8()); 
			match(input,15,FOLLOW_15_in_rule__DataAccess__Group__8__Impl14205); 
			 after(grammarAccess.getDataAccessAccess().getSemicolonKeyword_8()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__DataAccess__Group__8__Impl"



	// $ANTLR start "rule__DataAccess__Group__9"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7115:1: rule__DataAccess__Group__9 : rule__DataAccess__Group__9__Impl ;
	public final void rule__DataAccess__Group__9() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7119:2: ( rule__DataAccess__Group__9__Impl )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7120:2: rule__DataAccess__Group__9__Impl
			{
			pushFollow(FOLLOW_rule__DataAccess__Group__9__Impl_in_rule__DataAccess__Group__914236);
			rule__DataAccess__Group__9__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__DataAccess__Group__9"



	// $ANTLR start "rule__DataAccess__Group__9__Impl"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7126:1: rule__DataAccess__Group__9__Impl : ( ( rule__DataAccess__ActionsAssignment_9 )* ) ;
	public final void rule__DataAccess__Group__9__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7130:1: ( ( ( rule__DataAccess__ActionsAssignment_9 )* ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7131:1: ( ( rule__DataAccess__ActionsAssignment_9 )* )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7131:1: ( ( rule__DataAccess__ActionsAssignment_9 )* )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7132:1: ( rule__DataAccess__ActionsAssignment_9 )*
			{
			 before(grammarAccess.getDataAccessAccess().getActionsAssignment_9()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7133:2: ( rule__DataAccess__ActionsAssignment_9 )*
			loop39:
			while (true) {
				int alt39=2;
				int LA39_0 = input.LA(1);
				if ( (LA39_0==28) ) {
					alt39=1;
				}

				switch (alt39) {
				case 1 :
					// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7133:2: rule__DataAccess__ActionsAssignment_9
					{
					pushFollow(FOLLOW_rule__DataAccess__ActionsAssignment_9_in_rule__DataAccess__Group__9__Impl14263);
					rule__DataAccess__ActionsAssignment_9();
					state._fsp--;

					}
					break;

				default :
					break loop39;
				}
			}

			 after(grammarAccess.getDataAccessAccess().getActionsAssignment_9()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__DataAccess__Group__9__Impl"



	// $ANTLR start "rule__Spec__VocSpecAssignment_0"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7164:1: rule__Spec__VocSpecAssignment_0 : ( ruleVocSpec ) ;
	public final void rule__Spec__VocSpecAssignment_0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7168:1: ( ( ruleVocSpec ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7169:1: ( ruleVocSpec )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7169:1: ( ruleVocSpec )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7170:1: ruleVocSpec
			{
			 before(grammarAccess.getSpecAccess().getVocSpecVocSpecParserRuleCall_0_0()); 
			pushFollow(FOLLOW_ruleVocSpec_in_rule__Spec__VocSpecAssignment_014319);
			ruleVocSpec();
			state._fsp--;

			 after(grammarAccess.getSpecAccess().getVocSpecVocSpecParserRuleCall_0_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Spec__VocSpecAssignment_0"



	// $ANTLR start "rule__Spec__InteractionSpecAssignment_1"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7179:1: rule__Spec__InteractionSpecAssignment_1 : ( ruleInteractionSpec ) ;
	public final void rule__Spec__InteractionSpecAssignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7183:1: ( ( ruleInteractionSpec ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7184:1: ( ruleInteractionSpec )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7184:1: ( ruleInteractionSpec )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7185:1: ruleInteractionSpec
			{
			 before(grammarAccess.getSpecAccess().getInteractionSpecInteractionSpecParserRuleCall_1_0()); 
			pushFollow(FOLLOW_ruleInteractionSpec_in_rule__Spec__InteractionSpecAssignment_114350);
			ruleInteractionSpec();
			state._fsp--;

			 after(grammarAccess.getSpecAccess().getInteractionSpecInteractionSpecParserRuleCall_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Spec__InteractionSpecAssignment_1"



	// $ANTLR start "rule__Spec__ArchSpecAssignment_2"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7194:1: rule__Spec__ArchSpecAssignment_2 : ( ruleArchSpec ) ;
	public final void rule__Spec__ArchSpecAssignment_2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7198:1: ( ( ruleArchSpec ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7199:1: ( ruleArchSpec )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7199:1: ( ruleArchSpec )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7200:1: ruleArchSpec
			{
			 before(grammarAccess.getSpecAccess().getArchSpecArchSpecParserRuleCall_2_0()); 
			pushFollow(FOLLOW_ruleArchSpec_in_rule__Spec__ArchSpecAssignment_214381);
			ruleArchSpec();
			state._fsp--;

			 after(grammarAccess.getSpecAccess().getArchSpecArchSpecParserRuleCall_2_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Spec__ArchSpecAssignment_2"



	// $ANTLR start "rule__Spec__NetworkSpecAssignment_3"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7209:1: rule__Spec__NetworkSpecAssignment_3 : ( ruleDeploymentSpec ) ;
	public final void rule__Spec__NetworkSpecAssignment_3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7213:1: ( ( ruleDeploymentSpec ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7214:1: ( ruleDeploymentSpec )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7214:1: ( ruleDeploymentSpec )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7215:1: ruleDeploymentSpec
			{
			 before(grammarAccess.getSpecAccess().getNetworkSpecDeploymentSpecParserRuleCall_3_0()); 
			pushFollow(FOLLOW_ruleDeploymentSpec_in_rule__Spec__NetworkSpecAssignment_314412);
			ruleDeploymentSpec();
			state._fsp--;

			 after(grammarAccess.getSpecAccess().getNetworkSpecDeploymentSpecParserRuleCall_3_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Spec__NetworkSpecAssignment_3"



	// $ANTLR start "rule__DeploymentSpec__DevicesAssignment_2"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7224:1: rule__DeploymentSpec__DevicesAssignment_2 : ( ruleDevice ) ;
	public final void rule__DeploymentSpec__DevicesAssignment_2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7228:1: ( ( ruleDevice ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7229:1: ( ruleDevice )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7229:1: ( ruleDevice )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7230:1: ruleDevice
			{
			 before(grammarAccess.getDeploymentSpecAccess().getDevicesDeviceParserRuleCall_2_0()); 
			pushFollow(FOLLOW_ruleDevice_in_rule__DeploymentSpec__DevicesAssignment_214443);
			ruleDevice();
			state._fsp--;

			 after(grammarAccess.getDeploymentSpecAccess().getDevicesDeviceParserRuleCall_2_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__DeploymentSpec__DevicesAssignment_2"



	// $ANTLR start "rule__Device__DeviceNameAssignment_0"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7239:1: rule__Device__DeviceNameAssignment_0 : ( RULE_ID ) ;
	public final void rule__Device__DeviceNameAssignment_0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7243:1: ( ( RULE_ID ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7244:1: ( RULE_ID )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7244:1: ( RULE_ID )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7245:1: RULE_ID
			{
			 before(grammarAccess.getDeviceAccess().getDeviceNameIDTerminalRuleCall_0_0()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Device__DeviceNameAssignment_014474); 
			 after(grammarAccess.getDeviceAccess().getDeviceNameIDTerminalRuleCall_0_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Device__DeviceNameAssignment_0"



	// $ANTLR start "rule__Device__DeviceLocationAssignment_4"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7254:1: rule__Device__DeviceLocationAssignment_4 : ( ruleDeviceLocation ) ;
	public final void rule__Device__DeviceLocationAssignment_4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7258:1: ( ( ruleDeviceLocation ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7259:1: ( ruleDeviceLocation )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7259:1: ( ruleDeviceLocation )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7260:1: ruleDeviceLocation
			{
			 before(grammarAccess.getDeviceAccess().getDeviceLocationDeviceLocationParserRuleCall_4_0()); 
			pushFollow(FOLLOW_ruleDeviceLocation_in_rule__Device__DeviceLocationAssignment_414505);
			ruleDeviceLocation();
			state._fsp--;

			 after(grammarAccess.getDeviceAccess().getDeviceLocationDeviceLocationParserRuleCall_4_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Device__DeviceLocationAssignment_4"



	// $ANTLR start "rule__Device__PlatformTypeAssignment_7"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7269:1: rule__Device__PlatformTypeAssignment_7 : ( rulePlatformType ) ;
	public final void rule__Device__PlatformTypeAssignment_7() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7273:1: ( ( rulePlatformType ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7274:1: ( rulePlatformType )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7274:1: ( rulePlatformType )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7275:1: rulePlatformType
			{
			 before(grammarAccess.getDeviceAccess().getPlatformTypePlatformTypeParserRuleCall_7_0()); 
			pushFollow(FOLLOW_rulePlatformType_in_rule__Device__PlatformTypeAssignment_714536);
			rulePlatformType();
			state._fsp--;

			 after(grammarAccess.getDeviceAccess().getPlatformTypePlatformTypeParserRuleCall_7_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Device__PlatformTypeAssignment_7"



	// $ANTLR start "rule__Device__DeviceAbilitiesAssignment_11"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7284:1: rule__Device__DeviceAbilitiesAssignment_11 : ( ruleDeviceAbilities ) ;
	public final void rule__Device__DeviceAbilitiesAssignment_11() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7288:1: ( ( ruleDeviceAbilities ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7289:1: ( ruleDeviceAbilities )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7289:1: ( ruleDeviceAbilities )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7290:1: ruleDeviceAbilities
			{
			 before(grammarAccess.getDeviceAccess().getDeviceAbilitiesDeviceAbilitiesParserRuleCall_11_0()); 
			pushFollow(FOLLOW_ruleDeviceAbilities_in_rule__Device__DeviceAbilitiesAssignment_1114567);
			ruleDeviceAbilities();
			state._fsp--;

			 after(grammarAccess.getDeviceAccess().getDeviceAbilitiesDeviceAbilitiesParserRuleCall_11_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Device__DeviceAbilitiesAssignment_11"



	// $ANTLR start "rule__Device__DeviceProtocolAssignment_15"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7299:1: rule__Device__DeviceProtocolAssignment_15 : ( ruleDeviceProtocol ) ;
	public final void rule__Device__DeviceProtocolAssignment_15() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7303:1: ( ( ruleDeviceProtocol ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7304:1: ( ruleDeviceProtocol )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7304:1: ( ruleDeviceProtocol )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7305:1: ruleDeviceProtocol
			{
			 before(grammarAccess.getDeviceAccess().getDeviceProtocolDeviceProtocolParserRuleCall_15_0()); 
			pushFollow(FOLLOW_ruleDeviceProtocol_in_rule__Device__DeviceProtocolAssignment_1514598);
			ruleDeviceProtocol();
			state._fsp--;

			 after(grammarAccess.getDeviceAccess().getDeviceProtocolDeviceProtocolParserRuleCall_15_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Device__DeviceProtocolAssignment_15"



	// $ANTLR start "rule__Device__DatabaseNameAssignment_16_2"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7314:1: rule__Device__DatabaseNameAssignment_16_2 : ( ruleDatabaseName ) ;
	public final void rule__Device__DatabaseNameAssignment_16_2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7318:1: ( ( ruleDatabaseName ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7319:1: ( ruleDatabaseName )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7319:1: ( ruleDatabaseName )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7320:1: ruleDatabaseName
			{
			 before(grammarAccess.getDeviceAccess().getDatabaseNameDatabaseNameParserRuleCall_16_2_0()); 
			pushFollow(FOLLOW_ruleDatabaseName_in_rule__Device__DatabaseNameAssignment_16_214629);
			ruleDatabaseName();
			state._fsp--;

			 after(grammarAccess.getDeviceAccess().getDatabaseNameDatabaseNameParserRuleCall_16_2_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Device__DatabaseNameAssignment_16_2"



	// $ANTLR start "rule__Device__DeviceDescriptionAssignment_19"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7329:1: rule__Device__DeviceDescriptionAssignment_19 : ( ruleDeviceDescription ) ;
	public final void rule__Device__DeviceDescriptionAssignment_19() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7333:1: ( ( ruleDeviceDescription ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7334:1: ( ruleDeviceDescription )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7334:1: ( ruleDeviceDescription )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7335:1: ruleDeviceDescription
			{
			 before(grammarAccess.getDeviceAccess().getDeviceDescriptionDeviceDescriptionParserRuleCall_19_0()); 
			pushFollow(FOLLOW_ruleDeviceDescription_in_rule__Device__DeviceDescriptionAssignment_1914660);
			ruleDeviceDescription();
			state._fsp--;

			 after(grammarAccess.getDeviceAccess().getDeviceDescriptionDeviceDescriptionParserRuleCall_19_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Device__DeviceDescriptionAssignment_19"



	// $ANTLR start "rule__DeviceDescription__DevicedescriptionTextAssignment"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7344:1: rule__DeviceDescription__DevicedescriptionTextAssignment : ( RULE_STRING ) ;
	public final void rule__DeviceDescription__DevicedescriptionTextAssignment() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7348:1: ( ( RULE_STRING ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7349:1: ( RULE_STRING )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7349:1: ( RULE_STRING )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7350:1: RULE_STRING
			{
			 before(grammarAccess.getDeviceDescriptionAccess().getDevicedescriptionTextSTRINGTerminalRuleCall_0()); 
			match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DeviceDescription__DevicedescriptionTextAssignment14691); 
			 after(grammarAccess.getDeviceDescriptionAccess().getDevicedescriptionTextSTRINGTerminalRuleCall_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__DeviceDescription__DevicedescriptionTextAssignment"



	// $ANTLR start "rule__DeviceLocation__RegionLabelAssignment_0"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7359:1: rule__DeviceLocation__RegionLabelAssignment_0 : ( RULE_ID ) ;
	public final void rule__DeviceLocation__RegionLabelAssignment_0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7363:1: ( ( RULE_ID ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7364:1: ( RULE_ID )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7364:1: ( RULE_ID )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7365:1: RULE_ID
			{
			 before(grammarAccess.getDeviceLocationAccess().getRegionLabelIDTerminalRuleCall_0_0()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DeviceLocation__RegionLabelAssignment_014722); 
			 after(grammarAccess.getDeviceLocationAccess().getRegionLabelIDTerminalRuleCall_0_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__DeviceLocation__RegionLabelAssignment_0"



	// $ANTLR start "rule__DeviceLocation__RegionValueAssignment_2"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7374:1: rule__DeviceLocation__RegionValueAssignment_2 : ( RULE_INT ) ;
	public final void rule__DeviceLocation__RegionValueAssignment_2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7378:1: ( ( RULE_INT ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7379:1: ( RULE_INT )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7379:1: ( RULE_INT )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7380:1: RULE_INT
			{
			 before(grammarAccess.getDeviceLocationAccess().getRegionValueINTTerminalRuleCall_2_0()); 
			match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__DeviceLocation__RegionValueAssignment_214753); 
			 after(grammarAccess.getDeviceLocationAccess().getRegionValueINTTerminalRuleCall_2_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__DeviceLocation__RegionValueAssignment_2"



	// $ANTLR start "rule__PlatformType__DeviceTypeAssignment_0"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7389:1: rule__PlatformType__DeviceTypeAssignment_0 : ( ( 'JavaSE' ) ) ;
	public final void rule__PlatformType__DeviceTypeAssignment_0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7393:1: ( ( ( 'JavaSE' ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7394:1: ( ( 'JavaSE' ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7394:1: ( ( 'JavaSE' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7395:1: ( 'JavaSE' )
			{
			 before(grammarAccess.getPlatformTypeAccess().getDeviceTypeJavaSEKeyword_0_0()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7396:1: ( 'JavaSE' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7397:1: 'JavaSE'
			{
			 before(grammarAccess.getPlatformTypeAccess().getDeviceTypeJavaSEKeyword_0_0()); 
			match(input,22,FOLLOW_22_in_rule__PlatformType__DeviceTypeAssignment_014789); 
			 after(grammarAccess.getPlatformTypeAccess().getDeviceTypeJavaSEKeyword_0_0()); 
			}

			 after(grammarAccess.getPlatformTypeAccess().getDeviceTypeJavaSEKeyword_0_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__PlatformType__DeviceTypeAssignment_0"



	// $ANTLR start "rule__PlatformType__DeviceTypeAssignment_1"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7412:1: rule__PlatformType__DeviceTypeAssignment_1 : ( ( 'Android' ) ) ;
	public final void rule__PlatformType__DeviceTypeAssignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7416:1: ( ( ( 'Android' ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7417:1: ( ( 'Android' ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7417:1: ( ( 'Android' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7418:1: ( 'Android' )
			{
			 before(grammarAccess.getPlatformTypeAccess().getDeviceTypeAndroidKeyword_1_0()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7419:1: ( 'Android' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7420:1: 'Android'
			{
			 before(grammarAccess.getPlatformTypeAccess().getDeviceTypeAndroidKeyword_1_0()); 
			match(input,17,FOLLOW_17_in_rule__PlatformType__DeviceTypeAssignment_114833); 
			 after(grammarAccess.getPlatformTypeAccess().getDeviceTypeAndroidKeyword_1_0()); 
			}

			 after(grammarAccess.getPlatformTypeAccess().getDeviceTypeAndroidKeyword_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__PlatformType__DeviceTypeAssignment_1"



	// $ANTLR start "rule__DatabaseName__InstalledDatabaseAssignment_0"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7435:1: rule__DatabaseName__InstalledDatabaseAssignment_0 : ( ( 'MySQL' ) ) ;
	public final void rule__DatabaseName__InstalledDatabaseAssignment_0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7439:1: ( ( ( 'MySQL' ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7440:1: ( ( 'MySQL' ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7440:1: ( ( 'MySQL' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7441:1: ( 'MySQL' )
			{
			 before(grammarAccess.getDatabaseNameAccess().getInstalledDatabaseMySQLKeyword_0_0()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7442:1: ( 'MySQL' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7443:1: 'MySQL'
			{
			 before(grammarAccess.getDatabaseNameAccess().getInstalledDatabaseMySQLKeyword_0_0()); 
			match(input,24,FOLLOW_24_in_rule__DatabaseName__InstalledDatabaseAssignment_014877); 
			 after(grammarAccess.getDatabaseNameAccess().getInstalledDatabaseMySQLKeyword_0_0()); 
			}

			 after(grammarAccess.getDatabaseNameAccess().getInstalledDatabaseMySQLKeyword_0_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__DatabaseName__InstalledDatabaseAssignment_0"



	// $ANTLR start "rule__DatabaseName__InstalledDatabaseAssignment_1"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7458:1: rule__DatabaseName__InstalledDatabaseAssignment_1 : ( ( 'SQLAzure' ) ) ;
	public final void rule__DatabaseName__InstalledDatabaseAssignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7462:1: ( ( ( 'SQLAzure' ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7463:1: ( ( 'SQLAzure' ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7463:1: ( ( 'SQLAzure' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7464:1: ( 'SQLAzure' )
			{
			 before(grammarAccess.getDatabaseNameAccess().getInstalledDatabaseSQLAzureKeyword_1_0()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7465:1: ( 'SQLAzure' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7466:1: 'SQLAzure'
			{
			 before(grammarAccess.getDatabaseNameAccess().getInstalledDatabaseSQLAzureKeyword_1_0()); 
			match(input,25,FOLLOW_25_in_rule__DatabaseName__InstalledDatabaseAssignment_114921); 
			 after(grammarAccess.getDatabaseNameAccess().getInstalledDatabaseSQLAzureKeyword_1_0()); 
			}

			 after(grammarAccess.getDatabaseNameAccess().getInstalledDatabaseSQLAzureKeyword_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__DatabaseName__InstalledDatabaseAssignment_1"



	// $ANTLR start "rule__DatabaseName__InstalledDatabaseAssignment_2"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7481:1: rule__DatabaseName__InstalledDatabaseAssignment_2 : ( ( 'MongoDB' ) ) ;
	public final void rule__DatabaseName__InstalledDatabaseAssignment_2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7485:1: ( ( ( 'MongoDB' ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7486:1: ( ( 'MongoDB' ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7486:1: ( ( 'MongoDB' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7487:1: ( 'MongoDB' )
			{
			 before(grammarAccess.getDatabaseNameAccess().getInstalledDatabaseMongoDBKeyword_2_0()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7488:1: ( 'MongoDB' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7489:1: 'MongoDB'
			{
			 before(grammarAccess.getDatabaseNameAccess().getInstalledDatabaseMongoDBKeyword_2_0()); 
			match(input,23,FOLLOW_23_in_rule__DatabaseName__InstalledDatabaseAssignment_214965); 
			 after(grammarAccess.getDatabaseNameAccess().getInstalledDatabaseMongoDBKeyword_2_0()); 
			}

			 after(grammarAccess.getDatabaseNameAccess().getInstalledDatabaseMongoDBKeyword_2_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__DatabaseName__InstalledDatabaseAssignment_2"



	// $ANTLR start "rule__DeviceProtocol__ProtocolNameAssignment_0"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7504:1: rule__DeviceProtocol__ProtocolNameAssignment_0 : ( ( 'mqtt' ) ) ;
	public final void rule__DeviceProtocol__ProtocolNameAssignment_0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7508:1: ( ( ( 'mqtt' ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7509:1: ( ( 'mqtt' ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7509:1: ( ( 'mqtt' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7510:1: ( 'mqtt' )
			{
			 before(grammarAccess.getDeviceProtocolAccess().getProtocolNameMqttKeyword_0_0()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7511:1: ( 'mqtt' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7512:1: 'mqtt'
			{
			 before(grammarAccess.getDeviceProtocolAccess().getProtocolNameMqttKeyword_0_0()); 
			match(input,44,FOLLOW_44_in_rule__DeviceProtocol__ProtocolNameAssignment_015009); 
			 after(grammarAccess.getDeviceProtocolAccess().getProtocolNameMqttKeyword_0_0()); 
			}

			 after(grammarAccess.getDeviceProtocolAccess().getProtocolNameMqttKeyword_0_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__DeviceProtocol__ProtocolNameAssignment_0"



	// $ANTLR start "rule__DeviceAbilities__DeviceEntityNameAssignment_0"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7527:1: rule__DeviceAbilities__DeviceEntityNameAssignment_0 : ( ( RULE_ID ) ) ;
	public final void rule__DeviceAbilities__DeviceEntityNameAssignment_0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7531:1: ( ( ( RULE_ID ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7532:1: ( ( RULE_ID ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7532:1: ( ( RULE_ID ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7533:1: ( RULE_ID )
			{
			 before(grammarAccess.getDeviceAbilitiesAccess().getDeviceEntityNameEntityNameCrossReference_0_0()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7534:1: ( RULE_ID )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7535:1: RULE_ID
			{
			 before(grammarAccess.getDeviceAbilitiesAccess().getDeviceEntityNameEntityNameIDTerminalRuleCall_0_0_1()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DeviceAbilities__DeviceEntityNameAssignment_015052); 
			 after(grammarAccess.getDeviceAbilitiesAccess().getDeviceEntityNameEntityNameIDTerminalRuleCall_0_0_1()); 
			}

			 after(grammarAccess.getDeviceAbilitiesAccess().getDeviceEntityNameEntityNameCrossReference_0_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__DeviceAbilities__DeviceEntityNameAssignment_0"



	// $ANTLR start "rule__DeviceAbilities__NameAssignment_1_1"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7546:1: rule__DeviceAbilities__NameAssignment_1_1 : ( ruleDeviceAbilities ) ;
	public final void rule__DeviceAbilities__NameAssignment_1_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7550:1: ( ( ruleDeviceAbilities ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7551:1: ( ruleDeviceAbilities )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7551:1: ( ruleDeviceAbilities )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7552:1: ruleDeviceAbilities
			{
			 before(grammarAccess.getDeviceAbilitiesAccess().getNameDeviceAbilitiesParserRuleCall_1_1_0()); 
			pushFollow(FOLLOW_ruleDeviceAbilities_in_rule__DeviceAbilities__NameAssignment_1_115087);
			ruleDeviceAbilities();
			state._fsp--;

			 after(grammarAccess.getDeviceAbilitiesAccess().getNameDeviceAbilitiesParserRuleCall_1_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__DeviceAbilities__NameAssignment_1_1"



	// $ANTLR start "rule__InteractionSpec__InteractionNameAssignment_4"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7561:1: rule__InteractionSpec__InteractionNameAssignment_4 : ( ruleEntityName ) ;
	public final void rule__InteractionSpec__InteractionNameAssignment_4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7565:1: ( ( ruleEntityName ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7566:1: ( ruleEntityName )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7566:1: ( ruleEntityName )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7567:1: ruleEntityName
			{
			 before(grammarAccess.getInteractionSpecAccess().getInteractionNameEntityNameParserRuleCall_4_0()); 
			pushFollow(FOLLOW_ruleEntityName_in_rule__InteractionSpec__InteractionNameAssignment_415118);
			ruleEntityName();
			state._fsp--;

			 after(grammarAccess.getInteractionSpecAccess().getInteractionNameEntityNameParserRuleCall_4_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InteractionSpec__InteractionNameAssignment_4"



	// $ANTLR start "rule__InteractionSpec__InteractionCommandAssignment_5"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7576:1: rule__InteractionSpec__InteractionCommandAssignment_5 : ( ruleCommand ) ;
	public final void rule__InteractionSpec__InteractionCommandAssignment_5() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7580:1: ( ( ruleCommand ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7581:1: ( ruleCommand )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7581:1: ( ruleCommand )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7582:1: ruleCommand
			{
			 before(grammarAccess.getInteractionSpecAccess().getInteractionCommandCommandParserRuleCall_5_0()); 
			pushFollow(FOLLOW_ruleCommand_in_rule__InteractionSpec__InteractionCommandAssignment_515149);
			ruleCommand();
			state._fsp--;

			 after(grammarAccess.getInteractionSpecAccess().getInteractionCommandCommandParserRuleCall_5_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InteractionSpec__InteractionCommandAssignment_5"



	// $ANTLR start "rule__InteractionSpec__InteractionRequestAssignment_6"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7591:1: rule__InteractionSpec__InteractionRequestAssignment_6 : ( ruleRequest ) ;
	public final void rule__InteractionSpec__InteractionRequestAssignment_6() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7595:1: ( ( ruleRequest ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7596:1: ( ruleRequest )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7596:1: ( ruleRequest )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7597:1: ruleRequest
			{
			 before(grammarAccess.getInteractionSpecAccess().getInteractionRequestRequestParserRuleCall_6_0()); 
			pushFollow(FOLLOW_ruleRequest_in_rule__InteractionSpec__InteractionRequestAssignment_615180);
			ruleRequest();
			state._fsp--;

			 after(grammarAccess.getInteractionSpecAccess().getInteractionRequestRequestParserRuleCall_6_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InteractionSpec__InteractionRequestAssignment_6"



	// $ANTLR start "rule__InteractionSpec__InteractionNotifyAssignment_7"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7606:1: rule__InteractionSpec__InteractionNotifyAssignment_7 : ( ruleInteractionAction ) ;
	public final void rule__InteractionSpec__InteractionNotifyAssignment_7() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7610:1: ( ( ruleInteractionAction ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7611:1: ( ruleInteractionAction )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7611:1: ( ruleInteractionAction )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7612:1: ruleInteractionAction
			{
			 before(grammarAccess.getInteractionSpecAccess().getInteractionNotifyInteractionActionParserRuleCall_7_0()); 
			pushFollow(FOLLOW_ruleInteractionAction_in_rule__InteractionSpec__InteractionNotifyAssignment_715211);
			ruleInteractionAction();
			state._fsp--;

			 after(grammarAccess.getInteractionSpecAccess().getInteractionNotifyInteractionActionParserRuleCall_7_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InteractionSpec__InteractionNotifyAssignment_7"



	// $ANTLR start "rule__InteractionAction__ActionNameAssignment_1"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7621:1: rule__InteractionAction__ActionNameAssignment_1 : ( ruleActionName ) ;
	public final void rule__InteractionAction__ActionNameAssignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7625:1: ( ( ruleActionName ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7626:1: ( ruleActionName )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7626:1: ( ruleActionName )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7627:1: ruleActionName
			{
			 before(grammarAccess.getInteractionActionAccess().getActionNameActionNameParserRuleCall_1_0()); 
			pushFollow(FOLLOW_ruleActionName_in_rule__InteractionAction__ActionNameAssignment_115242);
			ruleActionName();
			state._fsp--;

			 after(grammarAccess.getInteractionActionAccess().getActionNameActionNameParserRuleCall_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InteractionAction__ActionNameAssignment_1"



	// $ANTLR start "rule__InteractionAction__ParametersAssignment_3"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7636:1: rule__InteractionAction__ParametersAssignment_3 : ( ruleParameters ) ;
	public final void rule__InteractionAction__ParametersAssignment_3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7640:1: ( ( ruleParameters ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7641:1: ( ruleParameters )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7641:1: ( ruleParameters )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7642:1: ruleParameters
			{
			 before(grammarAccess.getInteractionActionAccess().getParametersParametersParserRuleCall_3_0()); 
			pushFollow(FOLLOW_ruleParameters_in_rule__InteractionAction__ParametersAssignment_315273);
			ruleParameters();
			state._fsp--;

			 after(grammarAccess.getInteractionActionAccess().getParametersParametersParserRuleCall_3_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InteractionAction__ParametersAssignment_3"



	// $ANTLR start "rule__InteractionAction__InteractionEntityAssignment_6"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7651:1: rule__InteractionAction__InteractionEntityAssignment_6 : ( ( RULE_ID ) ) ;
	public final void rule__InteractionAction__InteractionEntityAssignment_6() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7655:1: ( ( ( RULE_ID ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7656:1: ( ( RULE_ID ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7656:1: ( ( RULE_ID ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7657:1: ( RULE_ID )
			{
			 before(grammarAccess.getInteractionActionAccess().getInteractionEntityEntityNameCrossReference_6_0()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7658:1: ( RULE_ID )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7659:1: RULE_ID
			{
			 before(grammarAccess.getInteractionActionAccess().getInteractionEntityEntityNameIDTerminalRuleCall_6_0_1()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__InteractionAction__InteractionEntityAssignment_615308); 
			 after(grammarAccess.getInteractionActionAccess().getInteractionEntityEntityNameIDTerminalRuleCall_6_0_1()); 
			}

			 after(grammarAccess.getInteractionActionAccess().getInteractionEntityEntityNameCrossReference_6_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InteractionAction__InteractionEntityAssignment_6"



	// $ANTLR start "rule__ArchSpec__StructsAssignment_0_2"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7670:1: rule__ArchSpec__StructsAssignment_0_2 : ( ruleStruct ) ;
	public final void rule__ArchSpec__StructsAssignment_0_2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7674:1: ( ( ruleStruct ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7675:1: ( ruleStruct )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7675:1: ( ruleStruct )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7676:1: ruleStruct
			{
			 before(grammarAccess.getArchSpecAccess().getStructsStructParserRuleCall_0_2_0()); 
			pushFollow(FOLLOW_ruleStruct_in_rule__ArchSpec__StructsAssignment_0_215343);
			ruleStruct();
			state._fsp--;

			 after(grammarAccess.getArchSpecAccess().getStructsStructParserRuleCall_0_2_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ArchSpec__StructsAssignment_0_2"



	// $ANTLR start "rule__ArchSpec__InbuiltComputationalServiceAssignment_6"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7685:1: rule__ArchSpec__InbuiltComputationalServiceAssignment_6 : ( ruleInBuiltComputationalService ) ;
	public final void rule__ArchSpec__InbuiltComputationalServiceAssignment_6() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7689:1: ( ( ruleInBuiltComputationalService ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7690:1: ( ruleInBuiltComputationalService )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7690:1: ( ruleInBuiltComputationalService )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7691:1: ruleInBuiltComputationalService
			{
			 before(grammarAccess.getArchSpecAccess().getInbuiltComputationalServiceInBuiltComputationalServiceParserRuleCall_6_0()); 
			pushFollow(FOLLOW_ruleInBuiltComputationalService_in_rule__ArchSpec__InbuiltComputationalServiceAssignment_615374);
			ruleInBuiltComputationalService();
			state._fsp--;

			 after(grammarAccess.getArchSpecAccess().getInbuiltComputationalServiceInBuiltComputationalServiceParserRuleCall_6_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ArchSpec__InbuiltComputationalServiceAssignment_6"



	// $ANTLR start "rule__ArchSpec__CustomComputationalServiceAssignment_9"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7700:1: rule__ArchSpec__CustomComputationalServiceAssignment_9 : ( rulecustomComputationalService ) ;
	public final void rule__ArchSpec__CustomComputationalServiceAssignment_9() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7704:1: ( ( rulecustomComputationalService ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7705:1: ( rulecustomComputationalService )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7705:1: ( rulecustomComputationalService )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7706:1: rulecustomComputationalService
			{
			 before(grammarAccess.getArchSpecAccess().getCustomComputationalServiceCustomComputationalServiceParserRuleCall_9_0()); 
			pushFollow(FOLLOW_rulecustomComputationalService_in_rule__ArchSpec__CustomComputationalServiceAssignment_915405);
			rulecustomComputationalService();
			state._fsp--;

			 after(grammarAccess.getArchSpecAccess().getCustomComputationalServiceCustomComputationalServiceParserRuleCall_9_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ArchSpec__CustomComputationalServiceAssignment_9"



	// $ANTLR start "rule__InBuiltComputationalService__InBuiltComputationalServiceNameAssignment_0"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7715:1: rule__InBuiltComputationalService__InBuiltComputationalServiceNameAssignment_0 : ( ruleEntityName ) ;
	public final void rule__InBuiltComputationalService__InBuiltComputationalServiceNameAssignment_0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7719:1: ( ( ruleEntityName ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7720:1: ( ruleEntityName )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7720:1: ( ruleEntityName )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7721:1: ruleEntityName
			{
			 before(grammarAccess.getInBuiltComputationalServiceAccess().getInBuiltComputationalServiceNameEntityNameParserRuleCall_0_0()); 
			pushFollow(FOLLOW_ruleEntityName_in_rule__InBuiltComputationalService__InBuiltComputationalServiceNameAssignment_015436);
			ruleEntityName();
			state._fsp--;

			 after(grammarAccess.getInBuiltComputationalServiceAccess().getInBuiltComputationalServiceNameEntityNameParserRuleCall_0_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InBuiltComputationalService__InBuiltComputationalServiceNameAssignment_0"



	// $ANTLR start "rule__InBuiltComputationalService__ConsumesAssignment_1"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7730:1: rule__InBuiltComputationalService__ConsumesAssignment_1 : ( ruleConsumeForInBuilt ) ;
	public final void rule__InBuiltComputationalService__ConsumesAssignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7734:1: ( ( ruleConsumeForInBuilt ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7735:1: ( ruleConsumeForInBuilt )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7735:1: ( ruleConsumeForInBuilt )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7736:1: ruleConsumeForInBuilt
			{
			 before(grammarAccess.getInBuiltComputationalServiceAccess().getConsumesConsumeForInBuiltParserRuleCall_1_0()); 
			pushFollow(FOLLOW_ruleConsumeForInBuilt_in_rule__InBuiltComputationalService__ConsumesAssignment_115467);
			ruleConsumeForInBuilt();
			state._fsp--;

			 after(grammarAccess.getInBuiltComputationalServiceAccess().getConsumesConsumeForInBuiltParserRuleCall_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InBuiltComputationalService__ConsumesAssignment_1"



	// $ANTLR start "rule__InBuiltComputationalService__OperationNameAssignment_4"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7745:1: rule__InBuiltComputationalService__OperationNameAssignment_4 : ( ruleOperationName ) ;
	public final void rule__InBuiltComputationalService__OperationNameAssignment_4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7749:1: ( ( ruleOperationName ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7750:1: ( ruleOperationName )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7750:1: ( ruleOperationName )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7751:1: ruleOperationName
			{
			 before(grammarAccess.getInBuiltComputationalServiceAccess().getOperationNameOperationNameParserRuleCall_4_0()); 
			pushFollow(FOLLOW_ruleOperationName_in_rule__InBuiltComputationalService__OperationNameAssignment_415498);
			ruleOperationName();
			state._fsp--;

			 after(grammarAccess.getInBuiltComputationalServiceAccess().getOperationNameOperationNameParserRuleCall_4_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InBuiltComputationalService__OperationNameAssignment_4"



	// $ANTLR start "rule__InBuiltComputationalService__OperationParameterAssignment_5_1"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7760:1: rule__InBuiltComputationalService__OperationParameterAssignment_5_1 : ( RULE_INT ) ;
	public final void rule__InBuiltComputationalService__OperationParameterAssignment_5_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7764:1: ( ( RULE_INT ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7765:1: ( RULE_INT )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7765:1: ( RULE_INT )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7766:1: RULE_INT
			{
			 before(grammarAccess.getInBuiltComputationalServiceAccess().getOperationParameterINTTerminalRuleCall_5_1_0()); 
			match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__InBuiltComputationalService__OperationParameterAssignment_5_115529); 
			 after(grammarAccess.getInBuiltComputationalServiceAccess().getOperationParameterINTTerminalRuleCall_5_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InBuiltComputationalService__OperationParameterAssignment_5_1"



	// $ANTLR start "rule__InBuiltComputationalService__GenerateInfoAssignment_8"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7775:1: rule__InBuiltComputationalService__GenerateInfoAssignment_8 : ( ruleGenerate ) ;
	public final void rule__InBuiltComputationalService__GenerateInfoAssignment_8() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7779:1: ( ( ruleGenerate ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7780:1: ( ruleGenerate )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7780:1: ( ruleGenerate )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7781:1: ruleGenerate
			{
			 before(grammarAccess.getInBuiltComputationalServiceAccess().getGenerateInfoGenerateParserRuleCall_8_0()); 
			pushFollow(FOLLOW_ruleGenerate_in_rule__InBuiltComputationalService__GenerateInfoAssignment_815560);
			ruleGenerate();
			state._fsp--;

			 after(grammarAccess.getInBuiltComputationalServiceAccess().getGenerateInfoGenerateParserRuleCall_8_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__InBuiltComputationalService__GenerateInfoAssignment_8"



	// $ANTLR start "rule__CustomComputationalService__CustomComputationalServiceNameAssignment_0"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7790:1: rule__CustomComputationalService__CustomComputationalServiceNameAssignment_0 : ( ruleEntityName ) ;
	public final void rule__CustomComputationalService__CustomComputationalServiceNameAssignment_0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7794:1: ( ( ruleEntityName ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7795:1: ( ruleEntityName )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7795:1: ( ruleEntityName )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7796:1: ruleEntityName
			{
			 before(grammarAccess.getCustomComputationalServiceAccess().getCustomComputationalServiceNameEntityNameParserRuleCall_0_0()); 
			pushFollow(FOLLOW_ruleEntityName_in_rule__CustomComputationalService__CustomComputationalServiceNameAssignment_015591);
			ruleEntityName();
			state._fsp--;

			 after(grammarAccess.getCustomComputationalServiceAccess().getCustomComputationalServiceNameEntityNameParserRuleCall_0_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__CustomComputationalService__CustomComputationalServiceNameAssignment_0"



	// $ANTLR start "rule__CustomComputationalService__ConsumesAssignment_1"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7805:1: rule__CustomComputationalService__ConsumesAssignment_1 : ( ruleConsume ) ;
	public final void rule__CustomComputationalService__ConsumesAssignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7809:1: ( ( ruleConsume ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7810:1: ( ruleConsume )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7810:1: ( ruleConsume )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7811:1: ruleConsume
			{
			 before(grammarAccess.getCustomComputationalServiceAccess().getConsumesConsumeParserRuleCall_1_0()); 
			pushFollow(FOLLOW_ruleConsume_in_rule__CustomComputationalService__ConsumesAssignment_115622);
			ruleConsume();
			state._fsp--;

			 after(grammarAccess.getCustomComputationalServiceAccess().getConsumesConsumeParserRuleCall_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__CustomComputationalService__ConsumesAssignment_1"



	// $ANTLR start "rule__CustomComputationalService__RequestsAssignment_2"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7820:1: rule__CustomComputationalService__RequestsAssignment_2 : ( ruleRequest ) ;
	public final void rule__CustomComputationalService__RequestsAssignment_2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7824:1: ( ( ruleRequest ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7825:1: ( ruleRequest )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7825:1: ( ruleRequest )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7826:1: ruleRequest
			{
			 before(grammarAccess.getCustomComputationalServiceAccess().getRequestsRequestParserRuleCall_2_0()); 
			pushFollow(FOLLOW_ruleRequest_in_rule__CustomComputationalService__RequestsAssignment_215653);
			ruleRequest();
			state._fsp--;

			 after(grammarAccess.getCustomComputationalServiceAccess().getRequestsRequestParserRuleCall_2_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__CustomComputationalService__RequestsAssignment_2"



	// $ANTLR start "rule__CustomComputationalService__GenerateInfoAssignment_3"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7835:1: rule__CustomComputationalService__GenerateInfoAssignment_3 : ( ruleGenerate ) ;
	public final void rule__CustomComputationalService__GenerateInfoAssignment_3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7839:1: ( ( ruleGenerate ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7840:1: ( ruleGenerate )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7840:1: ( ruleGenerate )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7841:1: ruleGenerate
			{
			 before(grammarAccess.getCustomComputationalServiceAccess().getGenerateInfoGenerateParserRuleCall_3_0()); 
			pushFollow(FOLLOW_ruleGenerate_in_rule__CustomComputationalService__GenerateInfoAssignment_315684);
			ruleGenerate();
			state._fsp--;

			 after(grammarAccess.getCustomComputationalServiceAccess().getGenerateInfoGenerateParserRuleCall_3_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__CustomComputationalService__GenerateInfoAssignment_3"



	// $ANTLR start "rule__CustomComputationalService__CommandsAssignment_4"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7850:1: rule__CustomComputationalService__CommandsAssignment_4 : ( ruleCommand ) ;
	public final void rule__CustomComputationalService__CommandsAssignment_4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7854:1: ( ( ruleCommand ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7855:1: ( ruleCommand )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7855:1: ( ruleCommand )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7856:1: ruleCommand
			{
			 before(grammarAccess.getCustomComputationalServiceAccess().getCommandsCommandParserRuleCall_4_0()); 
			pushFollow(FOLLOW_ruleCommand_in_rule__CustomComputationalService__CommandsAssignment_415715);
			ruleCommand();
			state._fsp--;

			 after(grammarAccess.getCustomComputationalServiceAccess().getCommandsCommandParserRuleCall_4_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__CustomComputationalService__CommandsAssignment_4"



	// $ANTLR start "rule__Request__RequestnameAssignment_1"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7865:1: rule__Request__RequestnameAssignment_1 : ( ( RULE_ID ) ) ;
	public final void rule__Request__RequestnameAssignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7869:1: ( ( ( RULE_ID ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7870:1: ( ( RULE_ID ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7870:1: ( ( RULE_ID ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7871:1: ( RULE_ID )
			{
			 before(grammarAccess.getRequestAccess().getRequestnameSourceNameCrossReference_1_0()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7872:1: ( RULE_ID )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7873:1: RULE_ID
			{
			 before(grammarAccess.getRequestAccess().getRequestnameSourceNameIDTerminalRuleCall_1_0_1()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Request__RequestnameAssignment_115750); 
			 after(grammarAccess.getRequestAccess().getRequestnameSourceNameIDTerminalRuleCall_1_0_1()); 
			}

			 after(grammarAccess.getRequestAccess().getRequestnameSourceNameCrossReference_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Request__RequestnameAssignment_1"



	// $ANTLR start "rule__Request__StorageForRequestAssignment_3"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7884:1: rule__Request__StorageForRequestAssignment_3 : ( ( RULE_ID ) ) ;
	public final void rule__Request__StorageForRequestAssignment_3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7888:1: ( ( ( RULE_ID ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7889:1: ( ( RULE_ID ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7889:1: ( ( RULE_ID ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7890:1: ( RULE_ID )
			{
			 before(grammarAccess.getRequestAccess().getStorageForRequestEntityNameCrossReference_3_0()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7891:1: ( RULE_ID )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7892:1: RULE_ID
			{
			 before(grammarAccess.getRequestAccess().getStorageForRequestEntityNameIDTerminalRuleCall_3_0_1()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Request__StorageForRequestAssignment_315789); 
			 after(grammarAccess.getRequestAccess().getStorageForRequestEntityNameIDTerminalRuleCall_3_0_1()); 
			}

			 after(grammarAccess.getRequestAccess().getStorageForRequestEntityNameCrossReference_3_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Request__StorageForRequestAssignment_3"



	// $ANTLR start "rule__ConsumeForInBuilt__NameAssignment_1"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7903:1: rule__ConsumeForInBuilt__NameAssignment_1 : ( ( RULE_ID ) ) ;
	public final void rule__ConsumeForInBuilt__NameAssignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7907:1: ( ( ( RULE_ID ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7908:1: ( ( RULE_ID ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7908:1: ( ( RULE_ID ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7909:1: ( RULE_ID )
			{
			 before(grammarAccess.getConsumeForInBuiltAccess().getNameSourceNameCrossReference_1_0()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7910:1: ( RULE_ID )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7911:1: RULE_ID
			{
			 before(grammarAccess.getConsumeForInBuiltAccess().getNameSourceNameIDTerminalRuleCall_1_0_1()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ConsumeForInBuilt__NameAssignment_115828); 
			 after(grammarAccess.getConsumeForInBuiltAccess().getNameSourceNameIDTerminalRuleCall_1_0_1()); 
			}

			 after(grammarAccess.getConsumeForInBuiltAccess().getNameSourceNameCrossReference_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ConsumeForInBuilt__NameAssignment_1"



	// $ANTLR start "rule__ConsumeForInBuilt__SensorForConsumeAssignment_3"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7922:1: rule__ConsumeForInBuilt__SensorForConsumeAssignment_3 : ( ( RULE_ID ) ) ;
	public final void rule__ConsumeForInBuilt__SensorForConsumeAssignment_3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7926:1: ( ( ( RULE_ID ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7927:1: ( ( RULE_ID ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7927:1: ( ( RULE_ID ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7928:1: ( RULE_ID )
			{
			 before(grammarAccess.getConsumeForInBuiltAccess().getSensorForConsumeEntityNameCrossReference_3_0()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7929:1: ( RULE_ID )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7930:1: RULE_ID
			{
			 before(grammarAccess.getConsumeForInBuiltAccess().getSensorForConsumeEntityNameIDTerminalRuleCall_3_0_1()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ConsumeForInBuilt__SensorForConsumeAssignment_315867); 
			 after(grammarAccess.getConsumeForInBuiltAccess().getSensorForConsumeEntityNameIDTerminalRuleCall_3_0_1()); 
			}

			 after(grammarAccess.getConsumeForInBuiltAccess().getSensorForConsumeEntityNameCrossReference_3_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ConsumeForInBuilt__SensorForConsumeAssignment_3"



	// $ANTLR start "rule__Consume__NameAssignment_1"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7941:1: rule__Consume__NameAssignment_1 : ( ( RULE_ID ) ) ;
	public final void rule__Consume__NameAssignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7945:1: ( ( ( RULE_ID ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7946:1: ( ( RULE_ID ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7946:1: ( ( RULE_ID ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7947:1: ( RULE_ID )
			{
			 before(grammarAccess.getConsumeAccess().getNameSourceNameCrossReference_1_0()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7948:1: ( RULE_ID )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7949:1: RULE_ID
			{
			 before(grammarAccess.getConsumeAccess().getNameSourceNameIDTerminalRuleCall_1_0_1()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Consume__NameAssignment_115906); 
			 after(grammarAccess.getConsumeAccess().getNameSourceNameIDTerminalRuleCall_1_0_1()); 
			}

			 after(grammarAccess.getConsumeAccess().getNameSourceNameCrossReference_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Consume__NameAssignment_1"



	// $ANTLR start "rule__Consume__FromNameAssignment_3"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7960:1: rule__Consume__FromNameAssignment_3 : ( ( RULE_ID ) ) ;
	public final void rule__Consume__FromNameAssignment_3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7964:1: ( ( ( RULE_ID ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7965:1: ( ( RULE_ID ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7965:1: ( ( RULE_ID ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7966:1: ( RULE_ID )
			{
			 before(grammarAccess.getConsumeAccess().getFromNameEntityNameCrossReference_3_0()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7967:1: ( RULE_ID )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7968:1: RULE_ID
			{
			 before(grammarAccess.getConsumeAccess().getFromNameEntityNameIDTerminalRuleCall_3_0_1()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Consume__FromNameAssignment_315945); 
			 after(grammarAccess.getConsumeAccess().getFromNameEntityNameIDTerminalRuleCall_3_0_1()); 
			}

			 after(grammarAccess.getConsumeAccess().getFromNameEntityNameCrossReference_3_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Consume__FromNameAssignment_3"



	// $ANTLR start "rule__Command__CommandNameAssignment_1"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7979:1: rule__Command__CommandNameAssignment_1 : ( ( RULE_ID ) ) ;
	public final void rule__Command__CommandNameAssignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7983:1: ( ( ( RULE_ID ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7984:1: ( ( RULE_ID ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7984:1: ( ( RULE_ID ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7985:1: ( RULE_ID )
			{
			 before(grammarAccess.getCommandAccess().getCommandNameActionNameCrossReference_1_0()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7986:1: ( RULE_ID )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7987:1: RULE_ID
			{
			 before(grammarAccess.getCommandAccess().getCommandNameActionNameIDTerminalRuleCall_1_0_1()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Command__CommandNameAssignment_115984); 
			 after(grammarAccess.getCommandAccess().getCommandNameActionNameIDTerminalRuleCall_1_0_1()); 
			}

			 after(grammarAccess.getCommandAccess().getCommandNameActionNameCrossReference_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Command__CommandNameAssignment_1"



	// $ANTLR start "rule__Command__CommandparameterAssignment_3"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7998:1: rule__Command__CommandparameterAssignment_3 : ( ruleCommandParameter ) ;
	public final void rule__Command__CommandparameterAssignment_3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8002:1: ( ( ruleCommandParameter ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8003:1: ( ruleCommandParameter )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8003:1: ( ruleCommandParameter )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8004:1: ruleCommandParameter
			{
			 before(grammarAccess.getCommandAccess().getCommandparameterCommandParameterParserRuleCall_3_0()); 
			pushFollow(FOLLOW_ruleCommandParameter_in_rule__Command__CommandparameterAssignment_316019);
			ruleCommandParameter();
			state._fsp--;

			 after(grammarAccess.getCommandAccess().getCommandparameterCommandParameterParserRuleCall_3_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Command__CommandparameterAssignment_3"



	// $ANTLR start "rule__Command__ActuatorForCommandAssignment_6"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8013:1: rule__Command__ActuatorForCommandAssignment_6 : ( ( RULE_ID ) ) ;
	public final void rule__Command__ActuatorForCommandAssignment_6() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8017:1: ( ( ( RULE_ID ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8018:1: ( ( RULE_ID ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8018:1: ( ( RULE_ID ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8019:1: ( RULE_ID )
			{
			 before(grammarAccess.getCommandAccess().getActuatorForCommandEntityNameCrossReference_6_0()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8020:1: ( RULE_ID )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8021:1: RULE_ID
			{
			 before(grammarAccess.getCommandAccess().getActuatorForCommandEntityNameIDTerminalRuleCall_6_0_1()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Command__ActuatorForCommandAssignment_616054); 
			 after(grammarAccess.getCommandAccess().getActuatorForCommandEntityNameIDTerminalRuleCall_6_0_1()); 
			}

			 after(grammarAccess.getCommandAccess().getActuatorForCommandEntityNameCrossReference_6_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Command__ActuatorForCommandAssignment_6"



	// $ANTLR start "rule__CommandParameter__NameAssignment_0"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8032:1: rule__CommandParameter__NameAssignment_0 : ( ( RULE_ID ) ) ;
	public final void rule__CommandParameter__NameAssignment_0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8036:1: ( ( ( RULE_ID ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8037:1: ( ( RULE_ID ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8037:1: ( ( RULE_ID ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8038:1: ( RULE_ID )
			{
			 before(grammarAccess.getCommandParameterAccess().getNameParameterNameCrossReference_0_0()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8039:1: ( RULE_ID )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8040:1: RULE_ID
			{
			 before(grammarAccess.getCommandParameterAccess().getNameParameterNameIDTerminalRuleCall_0_0_1()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CommandParameter__NameAssignment_016093); 
			 after(grammarAccess.getCommandParameterAccess().getNameParameterNameIDTerminalRuleCall_0_0_1()); 
			}

			 after(grammarAccess.getCommandParameterAccess().getNameParameterNameCrossReference_0_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__CommandParameter__NameAssignment_0"



	// $ANTLR start "rule__CommandParameter__ParameterAssignment_1_1"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8051:1: rule__CommandParameter__ParameterAssignment_1_1 : ( ruleCommandParameter ) ;
	public final void rule__CommandParameter__ParameterAssignment_1_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8055:1: ( ( ruleCommandParameter ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8056:1: ( ruleCommandParameter )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8056:1: ( ruleCommandParameter )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8057:1: ruleCommandParameter
			{
			 before(grammarAccess.getCommandParameterAccess().getParameterCommandParameterParserRuleCall_1_1_0()); 
			pushFollow(FOLLOW_ruleCommandParameter_in_rule__CommandParameter__ParameterAssignment_1_116128);
			ruleCommandParameter();
			state._fsp--;

			 after(grammarAccess.getCommandParameterAccess().getParameterCommandParameterParserRuleCall_1_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__CommandParameter__ParameterAssignment_1_1"



	// $ANTLR start "rule__VocSpec__StructsAssignment_2"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8066:1: rule__VocSpec__StructsAssignment_2 : ( ruleStruct ) ;
	public final void rule__VocSpec__StructsAssignment_2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8070:1: ( ( ruleStruct ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8071:1: ( ruleStruct )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8071:1: ( ruleStruct )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8072:1: ruleStruct
			{
			 before(grammarAccess.getVocSpecAccess().getStructsStructParserRuleCall_2_0()); 
			pushFollow(FOLLOW_ruleStruct_in_rule__VocSpec__StructsAssignment_216159);
			ruleStruct();
			state._fsp--;

			 after(grammarAccess.getVocSpecAccess().getStructsStructParserRuleCall_2_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__VocSpec__StructsAssignment_2"



	// $ANTLR start "rule__VocSpec__PeriodicSensorsAssignment_9"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8081:1: rule__VocSpec__PeriodicSensorsAssignment_9 : ( rulePeriodicSensors ) ;
	public final void rule__VocSpec__PeriodicSensorsAssignment_9() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8085:1: ( ( rulePeriodicSensors ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8086:1: ( rulePeriodicSensors )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8086:1: ( rulePeriodicSensors )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8087:1: rulePeriodicSensors
			{
			 before(grammarAccess.getVocSpecAccess().getPeriodicSensorsPeriodicSensorsParserRuleCall_9_0()); 
			pushFollow(FOLLOW_rulePeriodicSensors_in_rule__VocSpec__PeriodicSensorsAssignment_916190);
			rulePeriodicSensors();
			state._fsp--;

			 after(grammarAccess.getVocSpecAccess().getPeriodicSensorsPeriodicSensorsParserRuleCall_9_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__VocSpec__PeriodicSensorsAssignment_9"



	// $ANTLR start "rule__VocSpec__EventSensorsAssignment_12"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8096:1: rule__VocSpec__EventSensorsAssignment_12 : ( ruleEventSensors ) ;
	public final void rule__VocSpec__EventSensorsAssignment_12() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8100:1: ( ( ruleEventSensors ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8101:1: ( ruleEventSensors )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8101:1: ( ruleEventSensors )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8102:1: ruleEventSensors
			{
			 before(grammarAccess.getVocSpecAccess().getEventSensorsEventSensorsParserRuleCall_12_0()); 
			pushFollow(FOLLOW_ruleEventSensors_in_rule__VocSpec__EventSensorsAssignment_1216221);
			ruleEventSensors();
			state._fsp--;

			 after(grammarAccess.getVocSpecAccess().getEventSensorsEventSensorsParserRuleCall_12_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__VocSpec__EventSensorsAssignment_12"



	// $ANTLR start "rule__VocSpec__ActuatorsAssignment_15"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8111:1: rule__VocSpec__ActuatorsAssignment_15 : ( ruleActuator ) ;
	public final void rule__VocSpec__ActuatorsAssignment_15() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8115:1: ( ( ruleActuator ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8116:1: ( ruleActuator )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8116:1: ( ruleActuator )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8117:1: ruleActuator
			{
			 before(grammarAccess.getVocSpecAccess().getActuatorsActuatorParserRuleCall_15_0()); 
			pushFollow(FOLLOW_ruleActuator_in_rule__VocSpec__ActuatorsAssignment_1516252);
			ruleActuator();
			state._fsp--;

			 after(grammarAccess.getVocSpecAccess().getActuatorsActuatorParserRuleCall_15_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__VocSpec__ActuatorsAssignment_15"



	// $ANTLR start "rule__VocSpec__StorageServiceAssignment_18"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8126:1: rule__VocSpec__StorageServiceAssignment_18 : ( ruleStorageService ) ;
	public final void rule__VocSpec__StorageServiceAssignment_18() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8130:1: ( ( ruleStorageService ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8131:1: ( ruleStorageService )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8131:1: ( ruleStorageService )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8132:1: ruleStorageService
			{
			 before(grammarAccess.getVocSpecAccess().getStorageServiceStorageServiceParserRuleCall_18_0()); 
			pushFollow(FOLLOW_ruleStorageService_in_rule__VocSpec__StorageServiceAssignment_1816283);
			ruleStorageService();
			state._fsp--;

			 after(grammarAccess.getVocSpecAccess().getStorageServiceStorageServiceParserRuleCall_18_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__VocSpec__StorageServiceAssignment_18"



	// $ANTLR start "rule__RegionLabel__NameAssignment"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8143:1: rule__RegionLabel__NameAssignment : ( RULE_ID ) ;
	public final void rule__RegionLabel__NameAssignment() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8147:1: ( ( RULE_ID ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8148:1: ( RULE_ID )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8148:1: ( RULE_ID )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8149:1: RULE_ID
			{
			 before(grammarAccess.getRegionLabelAccess().getNameIDTerminalRuleCall_0()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RegionLabel__NameAssignment16316); 
			 after(grammarAccess.getRegionLabelAccess().getNameIDTerminalRuleCall_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__RegionLabel__NameAssignment"



	// $ANTLR start "rule__Struct__NameAssignment_0"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8158:1: rule__Struct__NameAssignment_0 : ( RULE_ID ) ;
	public final void rule__Struct__NameAssignment_0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8162:1: ( ( RULE_ID ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8163:1: ( RULE_ID )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8163:1: ( RULE_ID )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8164:1: RULE_ID
			{
			 before(grammarAccess.getStructAccess().getNameIDTerminalRuleCall_0_0()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Struct__NameAssignment_016347); 
			 after(grammarAccess.getStructAccess().getNameIDTerminalRuleCall_0_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Struct__NameAssignment_0"



	// $ANTLR start "rule__Struct__FieldsAssignment_1"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8173:1: rule__Struct__FieldsAssignment_1 : ( ruleField ) ;
	public final void rule__Struct__FieldsAssignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8177:1: ( ( ruleField ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8178:1: ( ruleField )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8178:1: ( ruleField )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8179:1: ruleField
			{
			 before(grammarAccess.getStructAccess().getFieldsFieldParserRuleCall_1_0()); 
			pushFollow(FOLLOW_ruleField_in_rule__Struct__FieldsAssignment_116378);
			ruleField();
			state._fsp--;

			 after(grammarAccess.getStructAccess().getFieldsFieldParserRuleCall_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Struct__FieldsAssignment_1"



	// $ANTLR start "rule__Field__NameAssignment_0"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8188:1: rule__Field__NameAssignment_0 : ( RULE_ID ) ;
	public final void rule__Field__NameAssignment_0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8192:1: ( ( RULE_ID ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8193:1: ( RULE_ID )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8193:1: ( RULE_ID )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8194:1: RULE_ID
			{
			 before(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0_0()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Field__NameAssignment_016409); 
			 after(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Field__NameAssignment_0"



	// $ANTLR start "rule__Field__TypeAssignment_2"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8203:1: rule__Field__TypeAssignment_2 : ( ruleType ) ;
	public final void rule__Field__TypeAssignment_2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8207:1: ( ( ruleType ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8208:1: ( ruleType )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8208:1: ( ruleType )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8209:1: ruleType
			{
			 before(grammarAccess.getFieldAccess().getTypeTypeParserRuleCall_2_0()); 
			pushFollow(FOLLOW_ruleType_in_rule__Field__TypeAssignment_216440);
			ruleType();
			state._fsp--;

			 after(grammarAccess.getFieldAccess().getTypeTypeParserRuleCall_2_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Field__TypeAssignment_2"



	// $ANTLR start "rule__PeriodicSensors__SensorNameAssignment_0"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8218:1: rule__PeriodicSensors__SensorNameAssignment_0 : ( ruleEntityName ) ;
	public final void rule__PeriodicSensors__SensorNameAssignment_0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8222:1: ( ( ruleEntityName ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8223:1: ( ruleEntityName )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8223:1: ( ruleEntityName )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8224:1: ruleEntityName
			{
			 before(grammarAccess.getPeriodicSensorsAccess().getSensorNameEntityNameParserRuleCall_0_0()); 
			pushFollow(FOLLOW_ruleEntityName_in_rule__PeriodicSensors__SensorNameAssignment_016471);
			ruleEntityName();
			state._fsp--;

			 after(grammarAccess.getPeriodicSensorsAccess().getSensorNameEntityNameParserRuleCall_0_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__PeriodicSensors__SensorNameAssignment_0"



	// $ANTLR start "rule__PeriodicSensors__GenerateInfoAssignment_1"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8233:1: rule__PeriodicSensors__GenerateInfoAssignment_1 : ( ruleGenerate ) ;
	public final void rule__PeriodicSensors__GenerateInfoAssignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8237:1: ( ( ruleGenerate ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8238:1: ( ruleGenerate )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8238:1: ( ruleGenerate )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8239:1: ruleGenerate
			{
			 before(grammarAccess.getPeriodicSensorsAccess().getGenerateInfoGenerateParserRuleCall_1_0()); 
			pushFollow(FOLLOW_ruleGenerate_in_rule__PeriodicSensors__GenerateInfoAssignment_116502);
			ruleGenerate();
			state._fsp--;

			 after(grammarAccess.getPeriodicSensorsAccess().getGenerateInfoGenerateParserRuleCall_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__PeriodicSensors__GenerateInfoAssignment_1"



	// $ANTLR start "rule__EventSensors__SensorNameAssignment_0"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8248:1: rule__EventSensors__SensorNameAssignment_0 : ( ruleEntityName ) ;
	public final void rule__EventSensors__SensorNameAssignment_0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8252:1: ( ( ruleEntityName ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8253:1: ( ruleEntityName )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8253:1: ( ruleEntityName )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8254:1: ruleEntityName
			{
			 before(grammarAccess.getEventSensorsAccess().getSensorNameEntityNameParserRuleCall_0_0()); 
			pushFollow(FOLLOW_ruleEntityName_in_rule__EventSensors__SensorNameAssignment_016533);
			ruleEntityName();
			state._fsp--;

			 after(grammarAccess.getEventSensorsAccess().getSensorNameEntityNameParserRuleCall_0_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EventSensors__SensorNameAssignment_0"



	// $ANTLR start "rule__EventSensors__GenerateInfoAssignment_1"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8263:1: rule__EventSensors__GenerateInfoAssignment_1 : ( ruleGenerate ) ;
	public final void rule__EventSensors__GenerateInfoAssignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8267:1: ( ( ruleGenerate ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8268:1: ( ruleGenerate )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8268:1: ( ruleGenerate )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8269:1: ruleGenerate
			{
			 before(grammarAccess.getEventSensorsAccess().getGenerateInfoGenerateParserRuleCall_1_0()); 
			pushFollow(FOLLOW_ruleGenerate_in_rule__EventSensors__GenerateInfoAssignment_116564);
			ruleGenerate();
			state._fsp--;

			 after(grammarAccess.getEventSensorsAccess().getGenerateInfoGenerateParserRuleCall_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EventSensors__GenerateInfoAssignment_1"



	// $ANTLR start "rule__EventSensors__EventConditionsAssignment_3"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8278:1: rule__EventSensors__EventConditionsAssignment_3 : ( ruleEventConditions ) ;
	public final void rule__EventSensors__EventConditionsAssignment_3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8282:1: ( ( ruleEventConditions ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8283:1: ( ruleEventConditions )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8283:1: ( ruleEventConditions )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8284:1: ruleEventConditions
			{
			 before(grammarAccess.getEventSensorsAccess().getEventConditionsEventConditionsParserRuleCall_3_0()); 
			pushFollow(FOLLOW_ruleEventConditions_in_rule__EventSensors__EventConditionsAssignment_316595);
			ruleEventConditions();
			state._fsp--;

			 after(grammarAccess.getEventSensorsAccess().getEventConditionsEventConditionsParserRuleCall_3_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EventSensors__EventConditionsAssignment_3"



	// $ANTLR start "rule__EventConditions__NameAssignment_0"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8293:1: rule__EventConditions__NameAssignment_0 : ( RULE_ID ) ;
	public final void rule__EventConditions__NameAssignment_0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8297:1: ( ( RULE_ID ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8298:1: ( RULE_ID )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8298:1: ( RULE_ID )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8299:1: RULE_ID
			{
			 before(grammarAccess.getEventConditionsAccess().getNameIDTerminalRuleCall_0_0()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EventConditions__NameAssignment_016626); 
			 after(grammarAccess.getEventConditionsAccess().getNameIDTerminalRuleCall_0_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EventConditions__NameAssignment_0"



	// $ANTLR start "rule__EventConditions__EventConditionsAssignment_1_1"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8308:1: rule__EventConditions__EventConditionsAssignment_1_1 : ( ruleEventConditions ) ;
	public final void rule__EventConditions__EventConditionsAssignment_1_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8312:1: ( ( ruleEventConditions ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8313:1: ( ruleEventConditions )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8313:1: ( ruleEventConditions )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8314:1: ruleEventConditions
			{
			 before(grammarAccess.getEventConditionsAccess().getEventConditionsEventConditionsParserRuleCall_1_1_0()); 
			pushFollow(FOLLOW_ruleEventConditions_in_rule__EventConditions__EventConditionsAssignment_1_116657);
			ruleEventConditions();
			state._fsp--;

			 after(grammarAccess.getEventConditionsAccess().getEventConditionsEventConditionsParserRuleCall_1_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EventConditions__EventConditionsAssignment_1_1"



	// $ANTLR start "rule__EntityName__NameAssignment"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8324:1: rule__EntityName__NameAssignment : ( RULE_ID ) ;
	public final void rule__EntityName__NameAssignment() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8328:1: ( ( RULE_ID ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8329:1: ( RULE_ID )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8329:1: ( RULE_ID )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8330:1: RULE_ID
			{
			 before(grammarAccess.getEntityNameAccess().getNameIDTerminalRuleCall_0()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EntityName__NameAssignment16689); 
			 after(grammarAccess.getEntityNameAccess().getNameIDTerminalRuleCall_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EntityName__NameAssignment"



	// $ANTLR start "rule__Generate__SourceNameAssignment_1"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8339:1: rule__Generate__SourceNameAssignment_1 : ( ruleSourceName ) ;
	public final void rule__Generate__SourceNameAssignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8343:1: ( ( ruleSourceName ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8344:1: ( ruleSourceName )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8344:1: ( ruleSourceName )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8345:1: ruleSourceName
			{
			 before(grammarAccess.getGenerateAccess().getSourceNameSourceNameParserRuleCall_1_0()); 
			pushFollow(FOLLOW_ruleSourceName_in_rule__Generate__SourceNameAssignment_116720);
			ruleSourceName();
			state._fsp--;

			 after(grammarAccess.getGenerateAccess().getSourceNameSourceNameParserRuleCall_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Generate__SourceNameAssignment_1"



	// $ANTLR start "rule__Generate__TypeAssignment_3"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8354:1: rule__Generate__TypeAssignment_3 : ( ruleType ) ;
	public final void rule__Generate__TypeAssignment_3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8358:1: ( ( ruleType ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8359:1: ( ruleType )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8359:1: ( ruleType )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8360:1: ruleType
			{
			 before(grammarAccess.getGenerateAccess().getTypeTypeParserRuleCall_3_0()); 
			pushFollow(FOLLOW_ruleType_in_rule__Generate__TypeAssignment_316751);
			ruleType();
			state._fsp--;

			 after(grammarAccess.getGenerateAccess().getTypeTypeParserRuleCall_3_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Generate__TypeAssignment_3"



	// $ANTLR start "rule__SourceName__NameAssignment"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8369:1: rule__SourceName__NameAssignment : ( RULE_ID ) ;
	public final void rule__SourceName__NameAssignment() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8373:1: ( ( RULE_ID ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8374:1: ( RULE_ID )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8374:1: ( RULE_ID )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8375:1: RULE_ID
			{
			 before(grammarAccess.getSourceNameAccess().getNameIDTerminalRuleCall_0()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SourceName__NameAssignment16782); 
			 after(grammarAccess.getSourceNameAccess().getNameIDTerminalRuleCall_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__SourceName__NameAssignment"



	// $ANTLR start "rule__Actuator__ActuatorNameAssignment_0"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8384:1: rule__Actuator__ActuatorNameAssignment_0 : ( ruleEntityName ) ;
	public final void rule__Actuator__ActuatorNameAssignment_0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8388:1: ( ( ruleEntityName ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8389:1: ( ruleEntityName )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8389:1: ( ruleEntityName )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8390:1: ruleEntityName
			{
			 before(grammarAccess.getActuatorAccess().getActuatorNameEntityNameParserRuleCall_0_0()); 
			pushFollow(FOLLOW_ruleEntityName_in_rule__Actuator__ActuatorNameAssignment_016813);
			ruleEntityName();
			state._fsp--;

			 after(grammarAccess.getActuatorAccess().getActuatorNameEntityNameParserRuleCall_0_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Actuator__ActuatorNameAssignment_0"



	// $ANTLR start "rule__Actuator__ActionsAssignment_1"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8399:1: rule__Actuator__ActionsAssignment_1 : ( ruleAction ) ;
	public final void rule__Actuator__ActionsAssignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8403:1: ( ( ruleAction ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8404:1: ( ruleAction )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8404:1: ( ruleAction )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8405:1: ruleAction
			{
			 before(grammarAccess.getActuatorAccess().getActionsActionParserRuleCall_1_0()); 
			pushFollow(FOLLOW_ruleAction_in_rule__Actuator__ActionsAssignment_116844);
			ruleAction();
			state._fsp--;

			 after(grammarAccess.getActuatorAccess().getActionsActionParserRuleCall_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Actuator__ActionsAssignment_1"



	// $ANTLR start "rule__Action__ActionNameAssignment_1"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8414:1: rule__Action__ActionNameAssignment_1 : ( ruleActionName ) ;
	public final void rule__Action__ActionNameAssignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8418:1: ( ( ruleActionName ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8419:1: ( ruleActionName )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8419:1: ( ruleActionName )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8420:1: ruleActionName
			{
			 before(grammarAccess.getActionAccess().getActionNameActionNameParserRuleCall_1_0()); 
			pushFollow(FOLLOW_ruleActionName_in_rule__Action__ActionNameAssignment_116875);
			ruleActionName();
			state._fsp--;

			 after(grammarAccess.getActionAccess().getActionNameActionNameParserRuleCall_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Action__ActionNameAssignment_1"



	// $ANTLR start "rule__Action__ParametersAssignment_3"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8429:1: rule__Action__ParametersAssignment_3 : ( ruleParameters ) ;
	public final void rule__Action__ParametersAssignment_3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8433:1: ( ( ruleParameters ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8434:1: ( ruleParameters )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8434:1: ( ruleParameters )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8435:1: ruleParameters
			{
			 before(grammarAccess.getActionAccess().getParametersParametersParserRuleCall_3_0()); 
			pushFollow(FOLLOW_ruleParameters_in_rule__Action__ParametersAssignment_316906);
			ruleParameters();
			state._fsp--;

			 after(grammarAccess.getActionAccess().getParametersParametersParserRuleCall_3_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Action__ParametersAssignment_3"



	// $ANTLR start "rule__ActionName__NameAssignment"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8444:1: rule__ActionName__NameAssignment : ( RULE_ID ) ;
	public final void rule__ActionName__NameAssignment() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8448:1: ( ( RULE_ID ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8449:1: ( RULE_ID )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8449:1: ( RULE_ID )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8450:1: RULE_ID
			{
			 before(grammarAccess.getActionNameAccess().getNameIDTerminalRuleCall_0()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ActionName__NameAssignment16937); 
			 after(grammarAccess.getActionNameAccess().getNameIDTerminalRuleCall_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ActionName__NameAssignment"



	// $ANTLR start "rule__Parameters__ParameterNameAssignment_0"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8459:1: rule__Parameters__ParameterNameAssignment_0 : ( ruleParameterName ) ;
	public final void rule__Parameters__ParameterNameAssignment_0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8463:1: ( ( ruleParameterName ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8464:1: ( ruleParameterName )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8464:1: ( ruleParameterName )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8465:1: ruleParameterName
			{
			 before(grammarAccess.getParametersAccess().getParameterNameParameterNameParserRuleCall_0_0()); 
			pushFollow(FOLLOW_ruleParameterName_in_rule__Parameters__ParameterNameAssignment_016968);
			ruleParameterName();
			state._fsp--;

			 after(grammarAccess.getParametersAccess().getParameterNameParameterNameParserRuleCall_0_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Parameters__ParameterNameAssignment_0"



	// $ANTLR start "rule__Parameters__TypeAssignment_2"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8474:1: rule__Parameters__TypeAssignment_2 : ( ruleType ) ;
	public final void rule__Parameters__TypeAssignment_2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8478:1: ( ( ruleType ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8479:1: ( ruleType )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8479:1: ( ruleType )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8480:1: ruleType
			{
			 before(grammarAccess.getParametersAccess().getTypeTypeParserRuleCall_2_0()); 
			pushFollow(FOLLOW_ruleType_in_rule__Parameters__TypeAssignment_216999);
			ruleType();
			state._fsp--;

			 after(grammarAccess.getParametersAccess().getTypeTypeParserRuleCall_2_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Parameters__TypeAssignment_2"



	// $ANTLR start "rule__ParameterName__NameAssignment"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8489:1: rule__ParameterName__NameAssignment : ( RULE_ID ) ;
	public final void rule__ParameterName__NameAssignment() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8493:1: ( ( RULE_ID ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8494:1: ( RULE_ID )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8494:1: ( RULE_ID )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8495:1: RULE_ID
			{
			 before(grammarAccess.getParameterNameAccess().getNameIDTerminalRuleCall_0()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParameterName__NameAssignment17030); 
			 after(grammarAccess.getParameterNameAccess().getNameIDTerminalRuleCall_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ParameterName__NameAssignment"



	// $ANTLR start "rule__StorageService__StorageServiceNameAssignment_0"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8504:1: rule__StorageService__StorageServiceNameAssignment_0 : ( ruleEntityName ) ;
	public final void rule__StorageService__StorageServiceNameAssignment_0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8508:1: ( ( ruleEntityName ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8509:1: ( ruleEntityName )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8509:1: ( ruleEntityName )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8510:1: ruleEntityName
			{
			 before(grammarAccess.getStorageServiceAccess().getStorageServiceNameEntityNameParserRuleCall_0_0()); 
			pushFollow(FOLLOW_ruleEntityName_in_rule__StorageService__StorageServiceNameAssignment_017061);
			ruleEntityName();
			state._fsp--;

			 after(grammarAccess.getStorageServiceAccess().getStorageServiceNameEntityNameParserRuleCall_0_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__StorageService__StorageServiceNameAssignment_0"



	// $ANTLR start "rule__StorageService__DataAccessesAssignment_1"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8519:1: rule__StorageService__DataAccessesAssignment_1 : ( ruleDataAccess ) ;
	public final void rule__StorageService__DataAccessesAssignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8523:1: ( ( ruleDataAccess ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8524:1: ( ruleDataAccess )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8524:1: ( ruleDataAccess )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8525:1: ruleDataAccess
			{
			 before(grammarAccess.getStorageServiceAccess().getDataAccessesDataAccessParserRuleCall_1_0()); 
			pushFollow(FOLLOW_ruleDataAccess_in_rule__StorageService__DataAccessesAssignment_117092);
			ruleDataAccess();
			state._fsp--;

			 after(grammarAccess.getStorageServiceAccess().getDataAccessesDataAccessParserRuleCall_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__StorageService__DataAccessesAssignment_1"



	// $ANTLR start "rule__DataAccess__SourceNameAssignment_1"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8534:1: rule__DataAccess__SourceNameAssignment_1 : ( ruleSourceName ) ;
	public final void rule__DataAccess__SourceNameAssignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8538:1: ( ( ruleSourceName ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8539:1: ( ruleSourceName )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8539:1: ( ruleSourceName )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8540:1: ruleSourceName
			{
			 before(grammarAccess.getDataAccessAccess().getSourceNameSourceNameParserRuleCall_1_0()); 
			pushFollow(FOLLOW_ruleSourceName_in_rule__DataAccess__SourceNameAssignment_117123);
			ruleSourceName();
			state._fsp--;

			 after(grammarAccess.getDataAccessAccess().getSourceNameSourceNameParserRuleCall_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__DataAccess__SourceNameAssignment_1"



	// $ANTLR start "rule__DataAccess__DataAccessTypeAssignment_3"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8549:1: rule__DataAccess__DataAccessTypeAssignment_3 : ( ruleType ) ;
	public final void rule__DataAccess__DataAccessTypeAssignment_3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8553:1: ( ( ruleType ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8554:1: ( ruleType )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8554:1: ( ruleType )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8555:1: ruleType
			{
			 before(grammarAccess.getDataAccessAccess().getDataAccessTypeTypeParserRuleCall_3_0()); 
			pushFollow(FOLLOW_ruleType_in_rule__DataAccess__DataAccessTypeAssignment_317154);
			ruleType();
			state._fsp--;

			 after(grammarAccess.getDataAccessAccess().getDataAccessTypeTypeParserRuleCall_3_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__DataAccess__DataAccessTypeAssignment_3"



	// $ANTLR start "rule__DataAccess__DataItemAssignment_5"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8564:1: rule__DataAccess__DataItemAssignment_5 : ( RULE_ID ) ;
	public final void rule__DataAccess__DataItemAssignment_5() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8568:1: ( ( RULE_ID ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8569:1: ( RULE_ID )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8569:1: ( RULE_ID )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8570:1: RULE_ID
			{
			 before(grammarAccess.getDataAccessAccess().getDataItemIDTerminalRuleCall_5_0()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataAccess__DataItemAssignment_517185); 
			 after(grammarAccess.getDataAccessAccess().getDataItemIDTerminalRuleCall_5_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__DataAccess__DataItemAssignment_5"



	// $ANTLR start "rule__DataAccess__TypeAssignment_7"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8579:1: rule__DataAccess__TypeAssignment_7 : ( ruleType ) ;
	public final void rule__DataAccess__TypeAssignment_7() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8583:1: ( ( ruleType ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8584:1: ( ruleType )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8584:1: ( ruleType )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8585:1: ruleType
			{
			 before(grammarAccess.getDataAccessAccess().getTypeTypeParserRuleCall_7_0()); 
			pushFollow(FOLLOW_ruleType_in_rule__DataAccess__TypeAssignment_717216);
			ruleType();
			state._fsp--;

			 after(grammarAccess.getDataAccessAccess().getTypeTypeParserRuleCall_7_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__DataAccess__TypeAssignment_7"



	// $ANTLR start "rule__DataAccess__ActionsAssignment_9"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8594:1: rule__DataAccess__ActionsAssignment_9 : ( ruleAction ) ;
	public final void rule__DataAccess__ActionsAssignment_9() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8598:1: ( ( ruleAction ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8599:1: ( ruleAction )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8599:1: ( ruleAction )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8600:1: ruleAction
			{
			 before(grammarAccess.getDataAccessAccess().getActionsActionParserRuleCall_9_0()); 
			pushFollow(FOLLOW_ruleAction_in_rule__DataAccess__ActionsAssignment_917247);
			ruleAction();
			state._fsp--;

			 after(grammarAccess.getDataAccessAccess().getActionsActionParserRuleCall_9_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__DataAccess__ActionsAssignment_9"



	// $ANTLR start "rule__Type__PrimitiveDataTypeAssignment"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8609:1: rule__Type__PrimitiveDataTypeAssignment : ( rulePrimitiveDataType ) ;
	public final void rule__Type__PrimitiveDataTypeAssignment() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8613:1: ( ( rulePrimitiveDataType ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8614:1: ( rulePrimitiveDataType )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8614:1: ( rulePrimitiveDataType )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8615:1: rulePrimitiveDataType
			{
			 before(grammarAccess.getTypeAccess().getPrimitiveDataTypePrimitiveDataTypeParserRuleCall_0()); 
			pushFollow(FOLLOW_rulePrimitiveDataType_in_rule__Type__PrimitiveDataTypeAssignment17278);
			rulePrimitiveDataType();
			state._fsp--;

			 after(grammarAccess.getTypeAccess().getPrimitiveDataTypePrimitiveDataTypeParserRuleCall_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Type__PrimitiveDataTypeAssignment"



	// $ANTLR start "rule__OperationName__OPERATION_NAMEAssignment"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8624:1: rule__OperationName__OPERATION_NAMEAssignment : ( ( 'AVG_BY_SAMPLE' ) ) ;
	public final void rule__OperationName__OPERATION_NAMEAssignment() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8628:1: ( ( ( 'AVG_BY_SAMPLE' ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8629:1: ( ( 'AVG_BY_SAMPLE' ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8629:1: ( ( 'AVG_BY_SAMPLE' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8630:1: ( 'AVG_BY_SAMPLE' )
			{
			 before(grammarAccess.getOperationNameAccess().getOPERATION_NAMEAVG_BY_SAMPLEKeyword_0()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8631:1: ( 'AVG_BY_SAMPLE' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8632:1: 'AVG_BY_SAMPLE'
			{
			 before(grammarAccess.getOperationNameAccess().getOPERATION_NAMEAVG_BY_SAMPLEKeyword_0()); 
			match(input,16,FOLLOW_16_in_rule__OperationName__OPERATION_NAMEAssignment17314); 
			 after(grammarAccess.getOperationNameAccess().getOPERATION_NAMEAVG_BY_SAMPLEKeyword_0()); 
			}

			 after(grammarAccess.getOperationNameAccess().getOPERATION_NAMEAVG_BY_SAMPLEKeyword_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__OperationName__OPERATION_NAMEAssignment"



	// $ANTLR start "rule__PrimitiveDataType__INTEGERAssignment_0"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8647:1: rule__PrimitiveDataType__INTEGERAssignment_0 : ( ( 'Integer' ) ) ;
	public final void rule__PrimitiveDataType__INTEGERAssignment_0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8651:1: ( ( ( 'Integer' ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8652:1: ( ( 'Integer' ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8652:1: ( ( 'Integer' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8653:1: ( 'Integer' )
			{
			 before(grammarAccess.getPrimitiveDataTypeAccess().getINTEGERIntegerKeyword_0_0()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8654:1: ( 'Integer' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8655:1: 'Integer'
			{
			 before(grammarAccess.getPrimitiveDataTypeAccess().getINTEGERIntegerKeyword_0_0()); 
			match(input,21,FOLLOW_21_in_rule__PrimitiveDataType__INTEGERAssignment_017358); 
			 after(grammarAccess.getPrimitiveDataTypeAccess().getINTEGERIntegerKeyword_0_0()); 
			}

			 after(grammarAccess.getPrimitiveDataTypeAccess().getINTEGERIntegerKeyword_0_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__PrimitiveDataType__INTEGERAssignment_0"



	// $ANTLR start "rule__PrimitiveDataType__BOOLEANAssignment_1"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8670:1: rule__PrimitiveDataType__BOOLEANAssignment_1 : ( ( 'boolean' ) ) ;
	public final void rule__PrimitiveDataType__BOOLEANAssignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8674:1: ( ( ( 'boolean' ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8675:1: ( ( 'boolean' ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8675:1: ( ( 'boolean' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8676:1: ( 'boolean' )
			{
			 before(grammarAccess.getPrimitiveDataTypeAccess().getBOOLEANBooleanKeyword_1_0()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8677:1: ( 'boolean' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8678:1: 'boolean'
			{
			 before(grammarAccess.getPrimitiveDataTypeAccess().getBOOLEANBooleanKeyword_1_0()); 
			match(input,30,FOLLOW_30_in_rule__PrimitiveDataType__BOOLEANAssignment_117402); 
			 after(grammarAccess.getPrimitiveDataTypeAccess().getBOOLEANBooleanKeyword_1_0()); 
			}

			 after(grammarAccess.getPrimitiveDataTypeAccess().getBOOLEANBooleanKeyword_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__PrimitiveDataType__BOOLEANAssignment_1"



	// $ANTLR start "rule__PrimitiveDataType__STRINGAssignment_2"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8693:1: rule__PrimitiveDataType__STRINGAssignment_2 : ( ( 'String' ) ) ;
	public final void rule__PrimitiveDataType__STRINGAssignment_2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8697:1: ( ( ( 'String' ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8698:1: ( ( 'String' ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8698:1: ( ( 'String' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8699:1: ( 'String' )
			{
			 before(grammarAccess.getPrimitiveDataTypeAccess().getSTRINGStringKeyword_2_0()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8700:1: ( 'String' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8701:1: 'String'
			{
			 before(grammarAccess.getPrimitiveDataTypeAccess().getSTRINGStringKeyword_2_0()); 
			match(input,26,FOLLOW_26_in_rule__PrimitiveDataType__STRINGAssignment_217446); 
			 after(grammarAccess.getPrimitiveDataTypeAccess().getSTRINGStringKeyword_2_0()); 
			}

			 after(grammarAccess.getPrimitiveDataTypeAccess().getSTRINGStringKeyword_2_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__PrimitiveDataType__STRINGAssignment_2"



	// $ANTLR start "rule__PrimitiveDataType__LONGAssignment_3"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8716:1: rule__PrimitiveDataType__LONGAssignment_3 : ( ( 'long' ) ) ;
	public final void rule__PrimitiveDataType__LONGAssignment_3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8720:1: ( ( ( 'long' ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8721:1: ( ( 'long' ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8721:1: ( ( 'long' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8722:1: ( 'long' )
			{
			 before(grammarAccess.getPrimitiveDataTypeAccess().getLONGLongKeyword_3_0()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8723:1: ( 'long' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8724:1: 'long'
			{
			 before(grammarAccess.getPrimitiveDataTypeAccess().getLONGLongKeyword_3_0()); 
			match(input,43,FOLLOW_43_in_rule__PrimitiveDataType__LONGAssignment_317490); 
			 after(grammarAccess.getPrimitiveDataTypeAccess().getLONGLongKeyword_3_0()); 
			}

			 after(grammarAccess.getPrimitiveDataTypeAccess().getLONGLongKeyword_3_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__PrimitiveDataType__LONGAssignment_3"



	// $ANTLR start "rule__PrimitiveDataType__DOUBLEAssignment_4"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8739:1: rule__PrimitiveDataType__DOUBLEAssignment_4 : ( ( 'double' ) ) ;
	public final void rule__PrimitiveDataType__DOUBLEAssignment_4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8743:1: ( ( ( 'double' ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8744:1: ( ( 'double' ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8744:1: ( ( 'double' ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8745:1: ( 'double' )
			{
			 before(grammarAccess.getPrimitiveDataTypeAccess().getDOUBLEDoubleKeyword_4_0()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8746:1: ( 'double' )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8747:1: 'double'
			{
			 before(grammarAccess.getPrimitiveDataTypeAccess().getDOUBLEDoubleKeyword_4_0()); 
			match(input,37,FOLLOW_37_in_rule__PrimitiveDataType__DOUBLEAssignment_417534); 
			 after(grammarAccess.getPrimitiveDataTypeAccess().getDOUBLEDoubleKeyword_4_0()); 
			}

			 after(grammarAccess.getPrimitiveDataTypeAccess().getDOUBLEDoubleKeyword_4_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__PrimitiveDataType__DOUBLEAssignment_4"



	// $ANTLR start "rule__PrimitiveDataType__StructDefAssignment_5"
	// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8762:1: rule__PrimitiveDataType__StructDefAssignment_5 : ( ( RULE_ID ) ) ;
	public final void rule__PrimitiveDataType__StructDefAssignment_5() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8766:1: ( ( ( RULE_ID ) ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8767:1: ( ( RULE_ID ) )
			{
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8767:1: ( ( RULE_ID ) )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8768:1: ( RULE_ID )
			{
			 before(grammarAccess.getPrimitiveDataTypeAccess().getStructDefStructCrossReference_5_0()); 
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8769:1: ( RULE_ID )
			// ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:8770:1: RULE_ID
			{
			 before(grammarAccess.getPrimitiveDataTypeAccess().getStructDefStructIDTerminalRuleCall_5_0_1()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PrimitiveDataType__StructDefAssignment_517577); 
			 after(grammarAccess.getPrimitiveDataTypeAccess().getStructDefStructIDTerminalRuleCall_5_0_1()); 
			}

			 after(grammarAccess.getPrimitiveDataTypeAccess().getStructDefStructCrossReference_5_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__PrimitiveDataType__StructDefAssignment_5"

	// Delegated rules


	protected DFA1 dfa1 = new DFA1(this);
	static final String DFA1_eotS =
		"\54\uffff";
	static final String DFA1_eofS =
		"\54\uffff";
	static final String DFA1_minS =
		"\1\44\1\16\3\uffff\2\5\1\16\1\5\6\17\2\5\1\uffff\1\5\1\16\6\17\2\5\6\17"+
		"\3\5\6\17\1\5";
	static final String DFA1_maxS =
		"\1\71\1\16\3\uffff\2\5\1\16\1\53\6\17\1\71\1\16\1\uffff\1\53\1\16\6\17"+
		"\1\53\1\71\6\17\1\71\1\16\1\53\6\17\1\71";
	static final String DFA1_acceptS =
		"\2\uffff\1\2\1\3\1\4\14\uffff\1\1\32\uffff";
	static final String DFA1_specialS =
		"\54\uffff}>";
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
			"\1\20\56\uffff\1\21\2\uffff\1\3\1\uffff\1\3",
			"\1\23\10\uffff\1\22",
			"",
			"\1\31\17\uffff\1\24\4\uffff\1\26\3\uffff\1\25\6\uffff\1\30\5\uffff\1"+
			"\27",
			"\1\32",
			"\1\33",
			"\1\33",
			"\1\33",
			"\1\33",
			"\1\33",
			"\1\33",
			"\1\41\17\uffff\1\34\4\uffff\1\36\3\uffff\1\35\6\uffff\1\40\5\uffff\1"+
			"\37",
			"\1\20\56\uffff\1\21\2\uffff\1\3\1\uffff\1\3",
			"\1\42",
			"\1\42",
			"\1\42",
			"\1\42",
			"\1\42",
			"\1\42",
			"\1\43\56\uffff\1\21\2\uffff\1\3\1\uffff\1\3",
			"\1\23\10\uffff\1\44",
			"\1\52\17\uffff\1\45\4\uffff\1\47\3\uffff\1\46\6\uffff\1\51\5\uffff\1"+
			"\50",
			"\1\53",
			"\1\53",
			"\1\53",
			"\1\53",
			"\1\53",
			"\1\53",
			"\1\43\56\uffff\1\21\2\uffff\1\3\1\uffff\1\3"
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
			return "1156:1: rule__Spec__Alternatives : ( ( ( rule__Spec__VocSpecAssignment_0 ) ) | ( ( rule__Spec__InteractionSpecAssignment_1 ) ) | ( ( rule__Spec__ArchSpecAssignment_2 ) ) | ( ( rule__Spec__NetworkSpecAssignment_3 ) ) );";
		}
	}

	public static final BitSet FOLLOW_ruleSpec_in_entryRuleSpec61 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleSpec68 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Spec__Alternatives_in_ruleSpec94 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleDeploymentSpec_in_entryRuleDeploymentSpec121 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleDeploymentSpec128 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__DeploymentSpec__Group__0_in_ruleDeploymentSpec154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleDevice_in_entryRuleDevice181 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleDevice188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Device__Group__0_in_ruleDevice214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleDeviceDescription_in_entryRuleDeviceDescription241 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleDeviceDescription248 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__DeviceDescription__DevicedescriptionTextAssignment_in_ruleDeviceDescription274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleDeviceLocation_in_entryRuleDeviceLocation301 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleDeviceLocation308 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__DeviceLocation__Group__0_in_ruleDeviceLocation334 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rulePlatformType_in_entryRulePlatformType361 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRulePlatformType368 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__PlatformType__Alternatives_in_rulePlatformType394 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleDatabaseName_in_entryRuleDatabaseName421 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleDatabaseName428 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__DatabaseName__Alternatives_in_ruleDatabaseName454 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleDeviceProtocol_in_entryRuleDeviceProtocol481 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleDeviceProtocol488 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__DeviceProtocol__Group__0_in_ruleDeviceProtocol514 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleDeviceAbilities_in_entryRuleDeviceAbilities541 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleDeviceAbilities548 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__DeviceAbilities__Group__0_in_ruleDeviceAbilities574 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleInteractionSpec_in_entryRuleInteractionSpec601 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleInteractionSpec608 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__InteractionSpec__Group__0_in_ruleInteractionSpec634 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleInteractionAction_in_entryRuleInteractionAction661 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleInteractionAction668 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__InteractionAction__Group__0_in_ruleInteractionAction694 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleArchSpec_in_entryRuleArchSpec721 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleArchSpec728 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ArchSpec__Group__0_in_ruleArchSpec754 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleInBuiltComputationalService_in_entryRuleInBuiltComputationalService781 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleInBuiltComputationalService788 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__InBuiltComputationalService__Group__0_in_ruleInBuiltComputationalService814 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rulecustomComputationalService_in_entryRulecustomComputationalService841 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRulecustomComputationalService848 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__CustomComputationalService__Group__0_in_rulecustomComputationalService874 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleRequest_in_entryRuleRequest901 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleRequest908 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Request__Group__0_in_ruleRequest934 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleConsumeForInBuilt_in_entryRuleConsumeForInBuilt961 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleConsumeForInBuilt968 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ConsumeForInBuilt__Group__0_in_ruleConsumeForInBuilt994 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleConsume_in_entryRuleConsume1021 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleConsume1028 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Consume__Group__0_in_ruleConsume1054 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand1081 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleCommand1088 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Command__Group__0_in_ruleCommand1114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleCommandParameter_in_entryRuleCommandParameter1141 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleCommandParameter1148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__CommandParameter__Group__0_in_ruleCommandParameter1174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleVocSpec_in_entryRuleVocSpec1201 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleVocSpec1208 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__VocSpec__Group__0_in_ruleVocSpec1234 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleRegionLabel_in_entryRuleRegionLabel1263 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleRegionLabel1270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__RegionLabel__NameAssignment_in_ruleRegionLabel1296 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleStruct_in_entryRuleStruct1323 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleStruct1330 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Struct__Group__0_in_ruleStruct1356 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleField_in_entryRuleField1383 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleField1390 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Field__Group__0_in_ruleField1416 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rulePeriodicSensors_in_entryRulePeriodicSensors1443 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRulePeriodicSensors1450 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__PeriodicSensors__Group__0_in_rulePeriodicSensors1476 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleEventSensors_in_entryRuleEventSensors1503 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleEventSensors1510 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__EventSensors__Group__0_in_ruleEventSensors1536 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleEventConditions_in_entryRuleEventConditions1563 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleEventConditions1570 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__EventConditions__Group__0_in_ruleEventConditions1596 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleEntityName_in_entryRuleEntityName1625 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleEntityName1632 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__EntityName__NameAssignment_in_ruleEntityName1658 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleGenerate_in_entryRuleGenerate1685 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleGenerate1692 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Generate__Group__0_in_ruleGenerate1718 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleSourceName_in_entryRuleSourceName1745 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleSourceName1752 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__SourceName__NameAssignment_in_ruleSourceName1778 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleActuator_in_entryRuleActuator1805 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleActuator1812 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Actuator__Group__0_in_ruleActuator1838 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleAction_in_entryRuleAction1865 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleAction1872 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Action__Group__0_in_ruleAction1898 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleActionName_in_entryRuleActionName1925 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleActionName1932 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ActionName__NameAssignment_in_ruleActionName1958 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleParameters_in_entryRuleParameters1985 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleParameters1992 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Parameters__Group__0_in_ruleParameters2018 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleParameterName_in_entryRuleParameterName2045 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleParameterName2052 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParameterName__NameAssignment_in_ruleParameterName2078 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleStorageService_in_entryRuleStorageService2105 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleStorageService2112 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__StorageService__Group__0_in_ruleStorageService2138 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleDataAccess_in_entryRuleDataAccess2165 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleDataAccess2172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__DataAccess__Group__0_in_ruleDataAccess2198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleType_in_entryRuleType2225 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleType2232 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Type__PrimitiveDataTypeAssignment_in_ruleType2258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleOperationName_in_entryRuleOperationName2285 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleOperationName2292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__OperationName__OPERATION_NAMEAssignment_in_ruleOperationName2318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rulePrimitiveDataType_in_entryRulePrimitiveDataType2345 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveDataType2352 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__PrimitiveDataType__Alternatives_in_rulePrimitiveDataType2378 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Spec__VocSpecAssignment_0_in_rule__Spec__Alternatives2414 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Spec__InteractionSpecAssignment_1_in_rule__Spec__Alternatives2432 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Spec__ArchSpecAssignment_2_in_rule__Spec__Alternatives2450 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Spec__NetworkSpecAssignment_3_in_rule__Spec__Alternatives2468 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__PlatformType__DeviceTypeAssignment_0_in_rule__PlatformType__Alternatives2501 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__PlatformType__DeviceTypeAssignment_1_in_rule__PlatformType__Alternatives2519 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__DatabaseName__InstalledDatabaseAssignment_0_in_rule__DatabaseName__Alternatives2552 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__DatabaseName__InstalledDatabaseAssignment_1_in_rule__DatabaseName__Alternatives2570 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__DatabaseName__InstalledDatabaseAssignment_2_in_rule__DatabaseName__Alternatives2588 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__PrimitiveDataType__INTEGERAssignment_0_in_rule__PrimitiveDataType__Alternatives2621 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__PrimitiveDataType__BOOLEANAssignment_1_in_rule__PrimitiveDataType__Alternatives2639 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__PrimitiveDataType__STRINGAssignment_2_in_rule__PrimitiveDataType__Alternatives2657 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__PrimitiveDataType__LONGAssignment_3_in_rule__PrimitiveDataType__Alternatives2675 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__PrimitiveDataType__DOUBLEAssignment_4_in_rule__PrimitiveDataType__Alternatives2693 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__PrimitiveDataType__StructDefAssignment_5_in_rule__PrimitiveDataType__Alternatives2711 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__DeploymentSpec__Group__0__Impl_in_rule__DeploymentSpec__Group__02742 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_rule__DeploymentSpec__Group__1_in_rule__DeploymentSpec__Group__02745 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_rule__DeploymentSpec__Group__0__Impl2773 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__DeploymentSpec__Group__1__Impl_in_rule__DeploymentSpec__Group__12804 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__DeploymentSpec__Group__2_in_rule__DeploymentSpec__Group__12807 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_rule__DeploymentSpec__Group__1__Impl2835 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__DeploymentSpec__Group__2__Impl_in_rule__DeploymentSpec__Group__22866 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__DeploymentSpec__DevicesAssignment_2_in_rule__DeploymentSpec__Group__2__Impl2895 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_rule__DeploymentSpec__DevicesAssignment_2_in_rule__DeploymentSpec__Group__2__Impl2907 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_rule__Device__Group__0__Impl_in_rule__Device__Group__02946 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_rule__Device__Group__1_in_rule__Device__Group__02949 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Device__DeviceNameAssignment_0_in_rule__Device__Group__0__Impl2976 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Device__Group__1__Impl_in_rule__Device__Group__13006 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_rule__Device__Group__2_in_rule__Device__Group__13009 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_rule__Device__Group__1__Impl3037 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Device__Group__2__Impl_in_rule__Device__Group__23068 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_rule__Device__Group__3_in_rule__Device__Group__23071 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_rule__Device__Group__2__Impl3099 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Device__Group__3__Impl_in_rule__Device__Group__33130 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__Device__Group__4_in_rule__Device__Group__33133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_rule__Device__Group__3__Impl3161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Device__Group__4__Impl_in_rule__Device__Group__43192 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_rule__Device__Group__5_in_rule__Device__Group__43195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Device__DeviceLocationAssignment_4_in_rule__Device__Group__4__Impl3222 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Device__Group__5__Impl_in_rule__Device__Group__53252 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_rule__Device__Group__6_in_rule__Device__Group__53255 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_rule__Device__Group__5__Impl3283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Device__Group__6__Impl_in_rule__Device__Group__63314 = new BitSet(new long[]{0x0000000000420000L});
	public static final BitSet FOLLOW_rule__Device__Group__7_in_rule__Device__Group__63317 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_rule__Device__Group__6__Impl3345 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Device__Group__7__Impl_in_rule__Device__Group__73376 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_rule__Device__Group__8_in_rule__Device__Group__73379 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Device__PlatformTypeAssignment_7_in_rule__Device__Group__7__Impl3406 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Device__Group__8__Impl_in_rule__Device__Group__83436 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_rule__Device__Group__9_in_rule__Device__Group__83439 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_rule__Device__Group__8__Impl3467 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Device__Group__9__Impl_in_rule__Device__Group__93498 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_rule__Device__Group__10_in_rule__Device__Group__93501 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_rule__Device__Group__9__Impl3529 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Device__Group__10__Impl_in_rule__Device__Group__103560 = new BitSet(new long[]{0x0000000000008020L});
	public static final BitSet FOLLOW_rule__Device__Group__11_in_rule__Device__Group__103563 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_rule__Device__Group__10__Impl3591 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Device__Group__11__Impl_in_rule__Device__Group__113622 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_rule__Device__Group__12_in_rule__Device__Group__113625 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Device__DeviceAbilitiesAssignment_11_in_rule__Device__Group__11__Impl3652 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Device__Group__12__Impl_in_rule__Device__Group__123683 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_rule__Device__Group__13_in_rule__Device__Group__123686 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_rule__Device__Group__12__Impl3714 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Device__Group__13__Impl_in_rule__Device__Group__133745 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_rule__Device__Group__14_in_rule__Device__Group__133748 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_rule__Device__Group__13__Impl3776 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Device__Group__14__Impl_in_rule__Device__Group__143807 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_rule__Device__Group__15_in_rule__Device__Group__143810 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_rule__Device__Group__14__Impl3838 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Device__Group__15__Impl_in_rule__Device__Group__153869 = new BitSet(new long[]{0x0000000C00000000L});
	public static final BitSet FOLLOW_rule__Device__Group__16_in_rule__Device__Group__153872 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Device__DeviceProtocolAssignment_15_in_rule__Device__Group__15__Impl3899 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Device__Group__16__Impl_in_rule__Device__Group__163929 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_rule__Device__Group__17_in_rule__Device__Group__163932 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Device__Group_16__0_in_rule__Device__Group__16__Impl3959 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_rule__Device__Group__17__Impl_in_rule__Device__Group__173990 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_rule__Device__Group__18_in_rule__Device__Group__173993 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_rule__Device__Group__17__Impl4021 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Device__Group__18__Impl_in_rule__Device__Group__184052 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_rule__Device__Group__19_in_rule__Device__Group__184055 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_rule__Device__Group__18__Impl4083 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Device__Group__19__Impl_in_rule__Device__Group__194114 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_rule__Device__Group__20_in_rule__Device__Group__194117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Device__DeviceDescriptionAssignment_19_in_rule__Device__Group__19__Impl4144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Device__Group__20__Impl_in_rule__Device__Group__204174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_rule__Device__Group__20__Impl4202 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Device__Group_16__0__Impl_in_rule__Device__Group_16__04275 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_rule__Device__Group_16__1_in_rule__Device__Group_16__04278 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_rule__Device__Group_16__0__Impl4306 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Device__Group_16__1__Impl_in_rule__Device__Group_16__14337 = new BitSet(new long[]{0x0000000003800000L});
	public static final BitSet FOLLOW_rule__Device__Group_16__2_in_rule__Device__Group_16__14340 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_rule__Device__Group_16__1__Impl4368 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Device__Group_16__2__Impl_in_rule__Device__Group_16__24399 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_rule__Device__Group_16__3_in_rule__Device__Group_16__24402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Device__DatabaseNameAssignment_16_2_in_rule__Device__Group_16__2__Impl4429 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Device__Group_16__3__Impl_in_rule__Device__Group_16__34459 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_rule__Device__Group_16__3__Impl4487 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__DeviceLocation__Group__0__Impl_in_rule__DeviceLocation__Group__04526 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_rule__DeviceLocation__Group__1_in_rule__DeviceLocation__Group__04529 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__DeviceLocation__RegionLabelAssignment_0_in_rule__DeviceLocation__Group__0__Impl4556 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__DeviceLocation__Group__1__Impl_in_rule__DeviceLocation__Group__14586 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_rule__DeviceLocation__Group__2_in_rule__DeviceLocation__Group__14589 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_rule__DeviceLocation__Group__1__Impl4617 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__DeviceLocation__Group__2__Impl_in_rule__DeviceLocation__Group__24648 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_rule__DeviceLocation__Group__3_in_rule__DeviceLocation__Group__24651 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__DeviceLocation__RegionValueAssignment_2_in_rule__DeviceLocation__Group__2__Impl4678 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__DeviceLocation__Group__3__Impl_in_rule__DeviceLocation__Group__34708 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_rule__DeviceLocation__Group__3__Impl4736 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__DeviceProtocol__Group__0__Impl_in_rule__DeviceProtocol__Group__04775 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_rule__DeviceProtocol__Group__1_in_rule__DeviceProtocol__Group__04778 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__DeviceProtocol__ProtocolNameAssignment_0_in_rule__DeviceProtocol__Group__0__Impl4805 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__DeviceProtocol__Group__1__Impl_in_rule__DeviceProtocol__Group__14835 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_rule__DeviceProtocol__Group__1__Impl4863 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__DeviceAbilities__Group__0__Impl_in_rule__DeviceAbilities__Group__04898 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_rule__DeviceAbilities__Group__1_in_rule__DeviceAbilities__Group__04901 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__DeviceAbilities__DeviceEntityNameAssignment_0_in_rule__DeviceAbilities__Group__0__Impl4928 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__DeviceAbilities__Group__1__Impl_in_rule__DeviceAbilities__Group__14958 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__DeviceAbilities__Group_1__0_in_rule__DeviceAbilities__Group__1__Impl4985 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__DeviceAbilities__Group_1__0__Impl_in_rule__DeviceAbilities__Group_1__05020 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__DeviceAbilities__Group_1__1_in_rule__DeviceAbilities__Group_1__05023 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_rule__DeviceAbilities__Group_1__0__Impl5051 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__DeviceAbilities__Group_1__1__Impl_in_rule__DeviceAbilities__Group_1__15082 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__DeviceAbilities__NameAssignment_1_1_in_rule__DeviceAbilities__Group_1__1__Impl5109 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__InteractionSpec__Group__0__Impl_in_rule__InteractionSpec__Group__05143 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_rule__InteractionSpec__Group__1_in_rule__InteractionSpec__Group__05146 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_rule__InteractionSpec__Group__0__Impl5174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__InteractionSpec__Group__1__Impl_in_rule__InteractionSpec__Group__15205 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_rule__InteractionSpec__Group__2_in_rule__InteractionSpec__Group__15208 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_rule__InteractionSpec__Group__1__Impl5236 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__InteractionSpec__Group__2__Impl_in_rule__InteractionSpec__Group__25267 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_rule__InteractionSpec__Group__3_in_rule__InteractionSpec__Group__25270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_59_in_rule__InteractionSpec__Group__2__Impl5298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__InteractionSpec__Group__3__Impl_in_rule__InteractionSpec__Group__35329 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__InteractionSpec__Group__4_in_rule__InteractionSpec__Group__35332 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_rule__InteractionSpec__Group__3__Impl5360 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__InteractionSpec__Group__4__Impl_in_rule__InteractionSpec__Group__45391 = new BitSet(new long[]{0x0008200080000000L});
	public static final BitSet FOLLOW_rule__InteractionSpec__Group__5_in_rule__InteractionSpec__Group__45394 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__InteractionSpec__InteractionNameAssignment_4_in_rule__InteractionSpec__Group__4__Impl5421 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__InteractionSpec__Group__5__Impl_in_rule__InteractionSpec__Group__55451 = new BitSet(new long[]{0x0008200000000000L});
	public static final BitSet FOLLOW_rule__InteractionSpec__Group__6_in_rule__InteractionSpec__Group__55454 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__InteractionSpec__InteractionCommandAssignment_5_in_rule__InteractionSpec__Group__5__Impl5481 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_rule__InteractionSpec__Group__6__Impl_in_rule__InteractionSpec__Group__65512 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_rule__InteractionSpec__Group__7_in_rule__InteractionSpec__Group__65515 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__InteractionSpec__InteractionRequestAssignment_6_in_rule__InteractionSpec__Group__6__Impl5542 = new BitSet(new long[]{0x0008000000000002L});
	public static final BitSet FOLLOW_rule__InteractionSpec__Group__7__Impl_in_rule__InteractionSpec__Group__75573 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__InteractionSpec__InteractionNotifyAssignment_7_in_rule__InteractionSpec__Group__7__Impl5600 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_rule__InteractionAction__Group__0__Impl_in_rule__InteractionAction__Group__05647 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__InteractionAction__Group__1_in_rule__InteractionAction__Group__05650 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_rule__InteractionAction__Group__0__Impl5678 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__InteractionAction__Group__1__Impl_in_rule__InteractionAction__Group__15709 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_rule__InteractionAction__Group__2_in_rule__InteractionAction__Group__15712 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__InteractionAction__ActionNameAssignment_1_in_rule__InteractionAction__Group__1__Impl5739 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__InteractionAction__Group__2__Impl_in_rule__InteractionAction__Group__25769 = new BitSet(new long[]{0x0000000000001020L});
	public static final BitSet FOLLOW_rule__InteractionAction__Group__3_in_rule__InteractionAction__Group__25772 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_11_in_rule__InteractionAction__Group__2__Impl5800 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__InteractionAction__Group__3__Impl_in_rule__InteractionAction__Group__35831 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_rule__InteractionAction__Group__4_in_rule__InteractionAction__Group__35834 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__InteractionAction__ParametersAssignment_3_in_rule__InteractionAction__Group__3__Impl5861 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_rule__InteractionAction__Group__4__Impl_in_rule__InteractionAction__Group__45892 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_rule__InteractionAction__Group__5_in_rule__InteractionAction__Group__45895 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_rule__InteractionAction__Group__4__Impl5923 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__InteractionAction__Group__5__Impl_in_rule__InteractionAction__Group__55954 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__InteractionAction__Group__6_in_rule__InteractionAction__Group__55957 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_rule__InteractionAction__Group__5__Impl5985 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__InteractionAction__Group__6__Impl_in_rule__InteractionAction__Group__66016 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_rule__InteractionAction__Group__7_in_rule__InteractionAction__Group__66019 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__InteractionAction__InteractionEntityAssignment_6_in_rule__InteractionAction__Group__6__Impl6046 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__InteractionAction__Group__7__Impl_in_rule__InteractionAction__Group__76076 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_rule__InteractionAction__Group__7__Impl6104 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ArchSpec__Group__0__Impl_in_rule__ArchSpec__Group__06151 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_rule__ArchSpec__Group__1_in_rule__ArchSpec__Group__06154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ArchSpec__Group_0__0_in_rule__ArchSpec__Group__0__Impl6181 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_rule__ArchSpec__Group__1__Impl_in_rule__ArchSpec__Group__16212 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_rule__ArchSpec__Group__2_in_rule__ArchSpec__Group__16215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_rule__ArchSpec__Group__1__Impl6243 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ArchSpec__Group__2__Impl_in_rule__ArchSpec__Group__26274 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_rule__ArchSpec__Group__3_in_rule__ArchSpec__Group__26277 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_rule__ArchSpec__Group__2__Impl6305 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ArchSpec__Group__3__Impl_in_rule__ArchSpec__Group__36336 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_rule__ArchSpec__Group__4_in_rule__ArchSpec__Group__36339 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_rule__ArchSpec__Group__3__Impl6367 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ArchSpec__Group__4__Impl_in_rule__ArchSpec__Group__46398 = new BitSet(new long[]{0x0000000000180020L});
	public static final BitSet FOLLOW_rule__ArchSpec__Group__5_in_rule__ArchSpec__Group__46401 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_rule__ArchSpec__Group__4__Impl6429 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ArchSpec__Group__5__Impl_in_rule__ArchSpec__Group__56460 = new BitSet(new long[]{0x0000000000080020L});
	public static final BitSet FOLLOW_rule__ArchSpec__Group__6_in_rule__ArchSpec__Group__56463 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ArchSpec__Group_5__0_in_rule__ArchSpec__Group__5__Impl6490 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_rule__ArchSpec__Group__6__Impl_in_rule__ArchSpec__Group__66521 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_rule__ArchSpec__Group__7_in_rule__ArchSpec__Group__66524 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ArchSpec__InbuiltComputationalServiceAssignment_6_in_rule__ArchSpec__Group__6__Impl6551 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_rule__ArchSpec__Group__7__Impl_in_rule__ArchSpec__Group__76582 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_rule__ArchSpec__Group__8_in_rule__ArchSpec__Group__76585 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_rule__ArchSpec__Group__7__Impl6613 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ArchSpec__Group__8__Impl_in_rule__ArchSpec__Group__86644 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__ArchSpec__Group__9_in_rule__ArchSpec__Group__86647 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_rule__ArchSpec__Group__8__Impl6675 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ArchSpec__Group__9__Impl_in_rule__ArchSpec__Group__96706 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ArchSpec__CustomComputationalServiceAssignment_9_in_rule__ArchSpec__Group__9__Impl6735 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_rule__ArchSpec__CustomComputationalServiceAssignment_9_in_rule__ArchSpec__Group__9__Impl6747 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_rule__ArchSpec__Group_0__0__Impl_in_rule__ArchSpec__Group_0__06800 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_rule__ArchSpec__Group_0__1_in_rule__ArchSpec__Group_0__06803 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_rule__ArchSpec__Group_0__0__Impl6831 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ArchSpec__Group_0__1__Impl_in_rule__ArchSpec__Group_0__16862 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__ArchSpec__Group_0__2_in_rule__ArchSpec__Group_0__16865 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_rule__ArchSpec__Group_0__1__Impl6893 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ArchSpec__Group_0__2__Impl_in_rule__ArchSpec__Group_0__26924 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ArchSpec__StructsAssignment_0_2_in_rule__ArchSpec__Group_0__2__Impl6953 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_rule__ArchSpec__StructsAssignment_0_2_in_rule__ArchSpec__Group_0__2__Impl6965 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_rule__ArchSpec__Group_5__0__Impl_in_rule__ArchSpec__Group_5__07004 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_rule__ArchSpec__Group_5__1_in_rule__ArchSpec__Group_5__07007 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_rule__ArchSpec__Group_5__0__Impl7035 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ArchSpec__Group_5__1__Impl_in_rule__ArchSpec__Group_5__17066 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_rule__ArchSpec__Group_5__1__Impl7094 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__InBuiltComputationalService__Group__0__Impl_in_rule__InBuiltComputationalService__Group__07129 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_rule__InBuiltComputationalService__Group__1_in_rule__InBuiltComputationalService__Group__07132 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__InBuiltComputationalService__InBuiltComputationalServiceNameAssignment_0_in_rule__InBuiltComputationalService__Group__0__Impl7159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__InBuiltComputationalService__Group__1__Impl_in_rule__InBuiltComputationalService__Group__17189 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_rule__InBuiltComputationalService__Group__2_in_rule__InBuiltComputationalService__Group__17192 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__InBuiltComputationalService__ConsumesAssignment_1_in_rule__InBuiltComputationalService__Group__1__Impl7221 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_rule__InBuiltComputationalService__ConsumesAssignment_1_in_rule__InBuiltComputationalService__Group__1__Impl7233 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_rule__InBuiltComputationalService__Group__2__Impl_in_rule__InBuiltComputationalService__Group__27266 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_rule__InBuiltComputationalService__Group__3_in_rule__InBuiltComputationalService__Group__27269 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_rule__InBuiltComputationalService__Group__2__Impl7297 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__InBuiltComputationalService__Group__3__Impl_in_rule__InBuiltComputationalService__Group__37328 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_rule__InBuiltComputationalService__Group__4_in_rule__InBuiltComputationalService__Group__37331 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_11_in_rule__InBuiltComputationalService__Group__3__Impl7359 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__InBuiltComputationalService__Group__4__Impl_in_rule__InBuiltComputationalService__Group__47390 = new BitSet(new long[]{0x0000000000003000L});
	public static final BitSet FOLLOW_rule__InBuiltComputationalService__Group__5_in_rule__InBuiltComputationalService__Group__47393 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__InBuiltComputationalService__OperationNameAssignment_4_in_rule__InBuiltComputationalService__Group__4__Impl7420 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__InBuiltComputationalService__Group__5__Impl_in_rule__InBuiltComputationalService__Group__57450 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_rule__InBuiltComputationalService__Group__6_in_rule__InBuiltComputationalService__Group__57453 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__InBuiltComputationalService__Group_5__0_in_rule__InBuiltComputationalService__Group__5__Impl7480 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__InBuiltComputationalService__Group__6__Impl_in_rule__InBuiltComputationalService__Group__67511 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_rule__InBuiltComputationalService__Group__7_in_rule__InBuiltComputationalService__Group__67514 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_rule__InBuiltComputationalService__Group__6__Impl7542 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__InBuiltComputationalService__Group__7__Impl_in_rule__InBuiltComputationalService__Group__77573 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_rule__InBuiltComputationalService__Group__8_in_rule__InBuiltComputationalService__Group__77576 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_rule__InBuiltComputationalService__Group__7__Impl7604 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__InBuiltComputationalService__Group__8__Impl_in_rule__InBuiltComputationalService__Group__87635 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__InBuiltComputationalService__GenerateInfoAssignment_8_in_rule__InBuiltComputationalService__Group__8__Impl7664 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_rule__InBuiltComputationalService__GenerateInfoAssignment_8_in_rule__InBuiltComputationalService__Group__8__Impl7676 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_rule__InBuiltComputationalService__Group_5__0__Impl_in_rule__InBuiltComputationalService__Group_5__07727 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_rule__InBuiltComputationalService__Group_5__1_in_rule__InBuiltComputationalService__Group_5__07730 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_rule__InBuiltComputationalService__Group_5__0__Impl7758 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__InBuiltComputationalService__Group_5__1__Impl_in_rule__InBuiltComputationalService__Group_5__17789 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__InBuiltComputationalService__OperationParameterAssignment_5_1_in_rule__InBuiltComputationalService__Group_5__1__Impl7816 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__CustomComputationalService__Group__0__Impl_in_rule__CustomComputationalService__Group__07850 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_rule__CustomComputationalService__Group__1_in_rule__CustomComputationalService__Group__07853 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__CustomComputationalService__CustomComputationalServiceNameAssignment_0_in_rule__CustomComputationalService__Group__0__Impl7880 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__CustomComputationalService__Group__1__Impl_in_rule__CustomComputationalService__Group__17910 = new BitSet(new long[]{0x0008020080000000L});
	public static final BitSet FOLLOW_rule__CustomComputationalService__Group__2_in_rule__CustomComputationalService__Group__17913 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__CustomComputationalService__ConsumesAssignment_1_in_rule__CustomComputationalService__Group__1__Impl7942 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_rule__CustomComputationalService__ConsumesAssignment_1_in_rule__CustomComputationalService__Group__1__Impl7954 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_rule__CustomComputationalService__Group__2__Impl_in_rule__CustomComputationalService__Group__27987 = new BitSet(new long[]{0x0000020080000000L});
	public static final BitSet FOLLOW_rule__CustomComputationalService__Group__3_in_rule__CustomComputationalService__Group__27990 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__CustomComputationalService__RequestsAssignment_2_in_rule__CustomComputationalService__Group__2__Impl8017 = new BitSet(new long[]{0x0008000000000002L});
	public static final BitSet FOLLOW_rule__CustomComputationalService__Group__3__Impl_in_rule__CustomComputationalService__Group__38048 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_rule__CustomComputationalService__Group__4_in_rule__CustomComputationalService__Group__38051 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__CustomComputationalService__GenerateInfoAssignment_3_in_rule__CustomComputationalService__Group__3__Impl8078 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_rule__CustomComputationalService__Group__4__Impl_in_rule__CustomComputationalService__Group__48109 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__CustomComputationalService__CommandsAssignment_4_in_rule__CustomComputationalService__Group__4__Impl8136 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_rule__Request__Group__0__Impl_in_rule__Request__Group__08177 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__Request__Group__1_in_rule__Request__Group__08180 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_rule__Request__Group__0__Impl8208 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Request__Group__1__Impl_in_rule__Request__Group__18239 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_rule__Request__Group__2_in_rule__Request__Group__18242 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Request__RequestnameAssignment_1_in_rule__Request__Group__1__Impl8269 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Request__Group__2__Impl_in_rule__Request__Group__28299 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__Request__Group__3_in_rule__Request__Group__28302 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_rule__Request__Group__2__Impl8330 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Request__Group__3__Impl_in_rule__Request__Group__38361 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_rule__Request__Group__4_in_rule__Request__Group__38364 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Request__StorageForRequestAssignment_3_in_rule__Request__Group__3__Impl8391 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Request__Group__4__Impl_in_rule__Request__Group__48421 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_rule__Request__Group__4__Impl8449 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ConsumeForInBuilt__Group__0__Impl_in_rule__ConsumeForInBuilt__Group__08490 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__ConsumeForInBuilt__Group__1_in_rule__ConsumeForInBuilt__Group__08493 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_rule__ConsumeForInBuilt__Group__0__Impl8521 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ConsumeForInBuilt__Group__1__Impl_in_rule__ConsumeForInBuilt__Group__18552 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_rule__ConsumeForInBuilt__Group__2_in_rule__ConsumeForInBuilt__Group__18555 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ConsumeForInBuilt__NameAssignment_1_in_rule__ConsumeForInBuilt__Group__1__Impl8582 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ConsumeForInBuilt__Group__2__Impl_in_rule__ConsumeForInBuilt__Group__28612 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__ConsumeForInBuilt__Group__3_in_rule__ConsumeForInBuilt__Group__28615 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_rule__ConsumeForInBuilt__Group__2__Impl8643 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ConsumeForInBuilt__Group__3__Impl_in_rule__ConsumeForInBuilt__Group__38674 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_rule__ConsumeForInBuilt__Group__4_in_rule__ConsumeForInBuilt__Group__38677 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ConsumeForInBuilt__SensorForConsumeAssignment_3_in_rule__ConsumeForInBuilt__Group__3__Impl8704 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ConsumeForInBuilt__Group__4__Impl_in_rule__ConsumeForInBuilt__Group__48734 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_rule__ConsumeForInBuilt__Group__4__Impl8762 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Consume__Group__0__Impl_in_rule__Consume__Group__08803 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__Consume__Group__1_in_rule__Consume__Group__08806 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_rule__Consume__Group__0__Impl8834 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Consume__Group__1__Impl_in_rule__Consume__Group__18865 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_rule__Consume__Group__2_in_rule__Consume__Group__18868 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Consume__NameAssignment_1_in_rule__Consume__Group__1__Impl8895 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Consume__Group__2__Impl_in_rule__Consume__Group__28925 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__Consume__Group__3_in_rule__Consume__Group__28928 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_rule__Consume__Group__2__Impl8956 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Consume__Group__3__Impl_in_rule__Consume__Group__38987 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_rule__Consume__Group__4_in_rule__Consume__Group__38990 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Consume__FromNameAssignment_3_in_rule__Consume__Group__3__Impl9017 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Consume__Group__4__Impl_in_rule__Consume__Group__49047 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_rule__Consume__Group__4__Impl9075 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Command__Group__0__Impl_in_rule__Command__Group__09116 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__Command__Group__1_in_rule__Command__Group__09119 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_rule__Command__Group__0__Impl9147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Command__Group__1__Impl_in_rule__Command__Group__19178 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_rule__Command__Group__2_in_rule__Command__Group__19181 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Command__CommandNameAssignment_1_in_rule__Command__Group__1__Impl9208 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Command__Group__2__Impl_in_rule__Command__Group__29238 = new BitSet(new long[]{0x0000000000001020L});
	public static final BitSet FOLLOW_rule__Command__Group__3_in_rule__Command__Group__29241 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_11_in_rule__Command__Group__2__Impl9269 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Command__Group__3__Impl_in_rule__Command__Group__39300 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_rule__Command__Group__4_in_rule__Command__Group__39303 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Command__CommandparameterAssignment_3_in_rule__Command__Group__3__Impl9330 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Command__Group__4__Impl_in_rule__Command__Group__49361 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_rule__Command__Group__5_in_rule__Command__Group__49364 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_rule__Command__Group__4__Impl9392 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Command__Group__5__Impl_in_rule__Command__Group__59423 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__Command__Group__6_in_rule__Command__Group__59426 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_rule__Command__Group__5__Impl9454 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Command__Group__6__Impl_in_rule__Command__Group__69485 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_rule__Command__Group__7_in_rule__Command__Group__69488 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Command__ActuatorForCommandAssignment_6_in_rule__Command__Group__6__Impl9515 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Command__Group__7__Impl_in_rule__Command__Group__79545 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_rule__Command__Group__7__Impl9573 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__CommandParameter__Group__0__Impl_in_rule__CommandParameter__Group__09620 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_rule__CommandParameter__Group__1_in_rule__CommandParameter__Group__09623 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__CommandParameter__NameAssignment_0_in_rule__CommandParameter__Group__0__Impl9650 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__CommandParameter__Group__1__Impl_in_rule__CommandParameter__Group__19680 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__CommandParameter__Group_1__0_in_rule__CommandParameter__Group__1__Impl9707 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__CommandParameter__Group_1__0__Impl_in_rule__CommandParameter__Group_1__09742 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__CommandParameter__Group_1__1_in_rule__CommandParameter__Group_1__09745 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_rule__CommandParameter__Group_1__0__Impl9773 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__CommandParameter__Group_1__1__Impl_in_rule__CommandParameter__Group_1__19804 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__CommandParameter__ParameterAssignment_1_1_in_rule__CommandParameter__Group_1__1__Impl9831 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__VocSpec__Group__0__Impl_in_rule__VocSpec__Group__09865 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_rule__VocSpec__Group__1_in_rule__VocSpec__Group__09868 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_rule__VocSpec__Group__0__Impl9896 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__VocSpec__Group__1__Impl_in_rule__VocSpec__Group__19927 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__VocSpec__Group__2_in_rule__VocSpec__Group__19930 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_rule__VocSpec__Group__1__Impl9958 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__VocSpec__Group__2__Impl_in_rule__VocSpec__Group__29989 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_rule__VocSpec__Group__3_in_rule__VocSpec__Group__29992 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__VocSpec__StructsAssignment_2_in_rule__VocSpec__Group__2__Impl10021 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_rule__VocSpec__StructsAssignment_2_in_rule__VocSpec__Group__2__Impl10033 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_rule__VocSpec__Group__3__Impl_in_rule__VocSpec__Group__310066 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_rule__VocSpec__Group__4_in_rule__VocSpec__Group__310069 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_rule__VocSpec__Group__3__Impl10097 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__VocSpec__Group__4__Impl_in_rule__VocSpec__Group__410128 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_rule__VocSpec__Group__5_in_rule__VocSpec__Group__410131 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_rule__VocSpec__Group__4__Impl10159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__VocSpec__Group__5__Impl_in_rule__VocSpec__Group__510190 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_rule__VocSpec__Group__6_in_rule__VocSpec__Group__510193 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_rule__VocSpec__Group__5__Impl10221 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__VocSpec__Group__6__Impl_in_rule__VocSpec__Group__610252 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_rule__VocSpec__Group__7_in_rule__VocSpec__Group__610255 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_rule__VocSpec__Group__6__Impl10283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__VocSpec__Group__7__Impl_in_rule__VocSpec__Group__710314 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_rule__VocSpec__Group__8_in_rule__VocSpec__Group__710317 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_rule__VocSpec__Group__7__Impl10345 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__VocSpec__Group__8__Impl_in_rule__VocSpec__Group__810376 = new BitSet(new long[]{0x0000004000000020L});
	public static final BitSet FOLLOW_rule__VocSpec__Group__9_in_rule__VocSpec__Group__810379 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_rule__VocSpec__Group__8__Impl10407 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__VocSpec__Group__9__Impl_in_rule__VocSpec__Group__910438 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_rule__VocSpec__Group__10_in_rule__VocSpec__Group__910441 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__VocSpec__PeriodicSensorsAssignment_9_in_rule__VocSpec__Group__9__Impl10468 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_rule__VocSpec__Group__10__Impl_in_rule__VocSpec__Group__1010499 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_rule__VocSpec__Group__11_in_rule__VocSpec__Group__1010502 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_rule__VocSpec__Group__10__Impl10530 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__VocSpec__Group__11__Impl_in_rule__VocSpec__Group__1110561 = new BitSet(new long[]{0x0000000020000020L});
	public static final BitSet FOLLOW_rule__VocSpec__Group__12_in_rule__VocSpec__Group__1110564 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_rule__VocSpec__Group__11__Impl10592 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__VocSpec__Group__12__Impl_in_rule__VocSpec__Group__1210623 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_rule__VocSpec__Group__13_in_rule__VocSpec__Group__1210626 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__VocSpec__EventSensorsAssignment_12_in_rule__VocSpec__Group__12__Impl10653 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_rule__VocSpec__Group__13__Impl_in_rule__VocSpec__Group__1310684 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_rule__VocSpec__Group__14_in_rule__VocSpec__Group__1310687 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_rule__VocSpec__Group__13__Impl10715 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__VocSpec__Group__14__Impl_in_rule__VocSpec__Group__1410746 = new BitSet(new long[]{0x0100000000000020L});
	public static final BitSet FOLLOW_rule__VocSpec__Group__15_in_rule__VocSpec__Group__1410749 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_rule__VocSpec__Group__14__Impl10777 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__VocSpec__Group__15__Impl_in_rule__VocSpec__Group__1510808 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_rule__VocSpec__Group__16_in_rule__VocSpec__Group__1510811 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__VocSpec__ActuatorsAssignment_15_in_rule__VocSpec__Group__15__Impl10838 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_rule__VocSpec__Group__16__Impl_in_rule__VocSpec__Group__1610869 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_rule__VocSpec__Group__17_in_rule__VocSpec__Group__1610872 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_rule__VocSpec__Group__16__Impl10900 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__VocSpec__Group__17__Impl_in_rule__VocSpec__Group__1710931 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__VocSpec__Group__18_in_rule__VocSpec__Group__1710934 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_rule__VocSpec__Group__17__Impl10962 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__VocSpec__Group__18__Impl_in_rule__VocSpec__Group__1810993 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__VocSpec__StorageServiceAssignment_18_in_rule__VocSpec__Group__18__Impl11020 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_rule__Struct__Group__0__Impl_in_rule__Struct__Group__011090 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__Struct__Group__1_in_rule__Struct__Group__011093 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Struct__NameAssignment_0_in_rule__Struct__Group__0__Impl11120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Struct__Group__1__Impl_in_rule__Struct__Group__111150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Struct__FieldsAssignment_1_in_rule__Struct__Group__1__Impl11179 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_rule__Struct__FieldsAssignment_1_in_rule__Struct__Group__1__Impl11191 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__011228 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_rule__Field__Group__1_in_rule__Field__Group__011231 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Field__NameAssignment_0_in_rule__Field__Group__0__Impl11258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__111288 = new BitSet(new long[]{0x0000082044200020L});
	public static final BitSet FOLLOW_rule__Field__Group__2_in_rule__Field__Group__111291 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_rule__Field__Group__1__Impl11319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__211350 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_rule__Field__Group__3_in_rule__Field__Group__211353 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Field__TypeAssignment_2_in_rule__Field__Group__2__Impl11380 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__311410 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_rule__Field__Group__3__Impl11438 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__PeriodicSensors__Group__0__Impl_in_rule__PeriodicSensors__Group__011477 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_rule__PeriodicSensors__Group__1_in_rule__PeriodicSensors__Group__011480 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__PeriodicSensors__SensorNameAssignment_0_in_rule__PeriodicSensors__Group__0__Impl11507 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__PeriodicSensors__Group__1__Impl_in_rule__PeriodicSensors__Group__111537 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_rule__PeriodicSensors__Group__2_in_rule__PeriodicSensors__Group__111540 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__PeriodicSensors__GenerateInfoAssignment_1_in_rule__PeriodicSensors__Group__1__Impl11569 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_rule__PeriodicSensors__GenerateInfoAssignment_1_in_rule__PeriodicSensors__Group__1__Impl11581 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_rule__PeriodicSensors__Group__2__Impl_in_rule__PeriodicSensors__Group__211614 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_rule__PeriodicSensors__Group__3_in_rule__PeriodicSensors__Group__211617 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_rule__PeriodicSensors__Group__2__Impl11645 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__PeriodicSensors__Group__3__Impl_in_rule__PeriodicSensors__Group__311676 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_rule__PeriodicSensors__Group__4_in_rule__PeriodicSensors__Group__311679 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_rule__PeriodicSensors__Group__3__Impl11707 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__PeriodicSensors__Group__4__Impl_in_rule__PeriodicSensors__Group__411738 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_rule__PeriodicSensors__Group__5_in_rule__PeriodicSensors__Group__411741 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_INT_in_rule__PeriodicSensors__Group__4__Impl11768 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__PeriodicSensors__Group__5__Impl_in_rule__PeriodicSensors__Group__511797 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_rule__PeriodicSensors__Group__6_in_rule__PeriodicSensors__Group__511800 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_rule__PeriodicSensors__Group__5__Impl11828 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__PeriodicSensors__Group__6__Impl_in_rule__PeriodicSensors__Group__611859 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_rule__PeriodicSensors__Group__7_in_rule__PeriodicSensors__Group__611862 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_INT_in_rule__PeriodicSensors__Group__6__Impl11889 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__PeriodicSensors__Group__7__Impl_in_rule__PeriodicSensors__Group__711918 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_rule__PeriodicSensors__Group__7__Impl11946 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__EventSensors__Group__0__Impl_in_rule__EventSensors__Group__011993 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_rule__EventSensors__Group__1_in_rule__EventSensors__Group__011996 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__EventSensors__SensorNameAssignment_0_in_rule__EventSensors__Group__0__Impl12023 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__EventSensors__Group__1__Impl_in_rule__EventSensors__Group__112053 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_rule__EventSensors__Group__2_in_rule__EventSensors__Group__112056 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__EventSensors__GenerateInfoAssignment_1_in_rule__EventSensors__Group__1__Impl12085 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_rule__EventSensors__GenerateInfoAssignment_1_in_rule__EventSensors__Group__1__Impl12097 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_rule__EventSensors__Group__2__Impl_in_rule__EventSensors__Group__212130 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__EventSensors__Group__3_in_rule__EventSensors__Group__212133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_rule__EventSensors__Group__2__Impl12161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__EventSensors__Group__3__Impl_in_rule__EventSensors__Group__312192 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_rule__EventSensors__Group__4_in_rule__EventSensors__Group__312195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__EventSensors__EventConditionsAssignment_3_in_rule__EventSensors__Group__3__Impl12222 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__EventSensors__Group__4__Impl_in_rule__EventSensors__Group__412252 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_rule__EventSensors__Group__4__Impl12280 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__EventConditions__Group__0__Impl_in_rule__EventConditions__Group__012321 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_rule__EventConditions__Group__1_in_rule__EventConditions__Group__012324 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__EventConditions__NameAssignment_0_in_rule__EventConditions__Group__0__Impl12351 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__EventConditions__Group__1__Impl_in_rule__EventConditions__Group__112381 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__EventConditions__Group_1__0_in_rule__EventConditions__Group__1__Impl12408 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__EventConditions__Group_1__0__Impl_in_rule__EventConditions__Group_1__012443 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__EventConditions__Group_1__1_in_rule__EventConditions__Group_1__012446 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_rule__EventConditions__Group_1__0__Impl12474 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__EventConditions__Group_1__1__Impl_in_rule__EventConditions__Group_1__112505 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__EventConditions__EventConditionsAssignment_1_1_in_rule__EventConditions__Group_1__1__Impl12532 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Generate__Group__0__Impl_in_rule__Generate__Group__012566 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__Generate__Group__1_in_rule__Generate__Group__012569 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_rule__Generate__Group__0__Impl12597 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Generate__Group__1__Impl_in_rule__Generate__Group__112628 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_rule__Generate__Group__2_in_rule__Generate__Group__112631 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Generate__SourceNameAssignment_1_in_rule__Generate__Group__1__Impl12658 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Generate__Group__2__Impl_in_rule__Generate__Group__212688 = new BitSet(new long[]{0x0000082044200020L});
	public static final BitSet FOLLOW_rule__Generate__Group__3_in_rule__Generate__Group__212691 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_rule__Generate__Group__2__Impl12719 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Generate__Group__3__Impl_in_rule__Generate__Group__312750 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_rule__Generate__Group__4_in_rule__Generate__Group__312753 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Generate__TypeAssignment_3_in_rule__Generate__Group__3__Impl12780 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Generate__Group__4__Impl_in_rule__Generate__Group__412810 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_rule__Generate__Group__4__Impl12838 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Actuator__Group__0__Impl_in_rule__Actuator__Group__012879 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_rule__Actuator__Group__1_in_rule__Actuator__Group__012882 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Actuator__ActuatorNameAssignment_0_in_rule__Actuator__Group__0__Impl12909 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Actuator__Group__1__Impl_in_rule__Actuator__Group__112939 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Actuator__ActionsAssignment_1_in_rule__Actuator__Group__1__Impl12966 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_rule__Action__Group__0__Impl_in_rule__Action__Group__013001 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__Action__Group__1_in_rule__Action__Group__013004 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_rule__Action__Group__0__Impl13032 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Action__Group__1__Impl_in_rule__Action__Group__113063 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_rule__Action__Group__2_in_rule__Action__Group__113066 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Action__ActionNameAssignment_1_in_rule__Action__Group__1__Impl13093 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Action__Group__2__Impl_in_rule__Action__Group__213123 = new BitSet(new long[]{0x0000000000001020L});
	public static final BitSet FOLLOW_rule__Action__Group__3_in_rule__Action__Group__213126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_11_in_rule__Action__Group__2__Impl13154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Action__Group__3__Impl_in_rule__Action__Group__313185 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_rule__Action__Group__4_in_rule__Action__Group__313188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Action__ParametersAssignment_3_in_rule__Action__Group__3__Impl13215 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_rule__Action__Group__4__Impl_in_rule__Action__Group__413246 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_rule__Action__Group__5_in_rule__Action__Group__413249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_rule__Action__Group__4__Impl13277 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Action__Group__5__Impl_in_rule__Action__Group__513308 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_rule__Action__Group__5__Impl13336 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Parameters__Group__0__Impl_in_rule__Parameters__Group__013379 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_rule__Parameters__Group__1_in_rule__Parameters__Group__013382 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Parameters__ParameterNameAssignment_0_in_rule__Parameters__Group__0__Impl13409 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Parameters__Group__1__Impl_in_rule__Parameters__Group__113439 = new BitSet(new long[]{0x0000082044200020L});
	public static final BitSet FOLLOW_rule__Parameters__Group__2_in_rule__Parameters__Group__113442 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_rule__Parameters__Group__1__Impl13470 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Parameters__Group__2__Impl_in_rule__Parameters__Group__213501 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Parameters__TypeAssignment_2_in_rule__Parameters__Group__2__Impl13528 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__StorageService__Group__0__Impl_in_rule__StorageService__Group__013564 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_rule__StorageService__Group__1_in_rule__StorageService__Group__013567 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__StorageService__StorageServiceNameAssignment_0_in_rule__StorageService__Group__0__Impl13594 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__StorageService__Group__1__Impl_in_rule__StorageService__Group__113624 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__StorageService__DataAccessesAssignment_1_in_rule__StorageService__Group__1__Impl13651 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_rule__DataAccess__Group__0__Impl_in_rule__DataAccess__Group__013686 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__DataAccess__Group__1_in_rule__DataAccess__Group__013689 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_rule__DataAccess__Group__0__Impl13717 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__DataAccess__Group__1__Impl_in_rule__DataAccess__Group__113748 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_rule__DataAccess__Group__2_in_rule__DataAccess__Group__113751 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__DataAccess__SourceNameAssignment_1_in_rule__DataAccess__Group__1__Impl13778 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__DataAccess__Group__2__Impl_in_rule__DataAccess__Group__213808 = new BitSet(new long[]{0x0000082044200020L});
	public static final BitSet FOLLOW_rule__DataAccess__Group__3_in_rule__DataAccess__Group__213811 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_rule__DataAccess__Group__2__Impl13839 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__DataAccess__Group__3__Impl_in_rule__DataAccess__Group__313870 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_rule__DataAccess__Group__4_in_rule__DataAccess__Group__313873 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__DataAccess__DataAccessTypeAssignment_3_in_rule__DataAccess__Group__3__Impl13900 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__DataAccess__Group__4__Impl_in_rule__DataAccess__Group__413930 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__DataAccess__Group__5_in_rule__DataAccess__Group__413933 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_rule__DataAccess__Group__4__Impl13961 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__DataAccess__Group__5__Impl_in_rule__DataAccess__Group__513992 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_rule__DataAccess__Group__6_in_rule__DataAccess__Group__513995 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__DataAccess__DataItemAssignment_5_in_rule__DataAccess__Group__5__Impl14022 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__DataAccess__Group__6__Impl_in_rule__DataAccess__Group__614052 = new BitSet(new long[]{0x0000082044200020L});
	public static final BitSet FOLLOW_rule__DataAccess__Group__7_in_rule__DataAccess__Group__614055 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_rule__DataAccess__Group__6__Impl14083 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__DataAccess__Group__7__Impl_in_rule__DataAccess__Group__714114 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_rule__DataAccess__Group__8_in_rule__DataAccess__Group__714117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__DataAccess__TypeAssignment_7_in_rule__DataAccess__Group__7__Impl14144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__DataAccess__Group__8__Impl_in_rule__DataAccess__Group__814174 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_rule__DataAccess__Group__9_in_rule__DataAccess__Group__814177 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_rule__DataAccess__Group__8__Impl14205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__DataAccess__Group__9__Impl_in_rule__DataAccess__Group__914236 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__DataAccess__ActionsAssignment_9_in_rule__DataAccess__Group__9__Impl14263 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_ruleVocSpec_in_rule__Spec__VocSpecAssignment_014319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleInteractionSpec_in_rule__Spec__InteractionSpecAssignment_114350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleArchSpec_in_rule__Spec__ArchSpecAssignment_214381 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleDeploymentSpec_in_rule__Spec__NetworkSpecAssignment_314412 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleDevice_in_rule__DeploymentSpec__DevicesAssignment_214443 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__Device__DeviceNameAssignment_014474 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleDeviceLocation_in_rule__Device__DeviceLocationAssignment_414505 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rulePlatformType_in_rule__Device__PlatformTypeAssignment_714536 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleDeviceAbilities_in_rule__Device__DeviceAbilitiesAssignment_1114567 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleDeviceProtocol_in_rule__Device__DeviceProtocolAssignment_1514598 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleDatabaseName_in_rule__Device__DatabaseNameAssignment_16_214629 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleDeviceDescription_in_rule__Device__DeviceDescriptionAssignment_1914660 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_STRING_in_rule__DeviceDescription__DevicedescriptionTextAssignment14691 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__DeviceLocation__RegionLabelAssignment_014722 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_INT_in_rule__DeviceLocation__RegionValueAssignment_214753 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_rule__PlatformType__DeviceTypeAssignment_014789 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_rule__PlatformType__DeviceTypeAssignment_114833 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_rule__DatabaseName__InstalledDatabaseAssignment_014877 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_rule__DatabaseName__InstalledDatabaseAssignment_114921 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_rule__DatabaseName__InstalledDatabaseAssignment_214965 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_rule__DeviceProtocol__ProtocolNameAssignment_015009 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__DeviceAbilities__DeviceEntityNameAssignment_015052 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleDeviceAbilities_in_rule__DeviceAbilities__NameAssignment_1_115087 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleEntityName_in_rule__InteractionSpec__InteractionNameAssignment_415118 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleCommand_in_rule__InteractionSpec__InteractionCommandAssignment_515149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleRequest_in_rule__InteractionSpec__InteractionRequestAssignment_615180 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleInteractionAction_in_rule__InteractionSpec__InteractionNotifyAssignment_715211 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleActionName_in_rule__InteractionAction__ActionNameAssignment_115242 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleParameters_in_rule__InteractionAction__ParametersAssignment_315273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__InteractionAction__InteractionEntityAssignment_615308 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleStruct_in_rule__ArchSpec__StructsAssignment_0_215343 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleInBuiltComputationalService_in_rule__ArchSpec__InbuiltComputationalServiceAssignment_615374 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rulecustomComputationalService_in_rule__ArchSpec__CustomComputationalServiceAssignment_915405 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleEntityName_in_rule__InBuiltComputationalService__InBuiltComputationalServiceNameAssignment_015436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleConsumeForInBuilt_in_rule__InBuiltComputationalService__ConsumesAssignment_115467 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleOperationName_in_rule__InBuiltComputationalService__OperationNameAssignment_415498 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_INT_in_rule__InBuiltComputationalService__OperationParameterAssignment_5_115529 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleGenerate_in_rule__InBuiltComputationalService__GenerateInfoAssignment_815560 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleEntityName_in_rule__CustomComputationalService__CustomComputationalServiceNameAssignment_015591 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleConsume_in_rule__CustomComputationalService__ConsumesAssignment_115622 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleRequest_in_rule__CustomComputationalService__RequestsAssignment_215653 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleGenerate_in_rule__CustomComputationalService__GenerateInfoAssignment_315684 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleCommand_in_rule__CustomComputationalService__CommandsAssignment_415715 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__Request__RequestnameAssignment_115750 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__Request__StorageForRequestAssignment_315789 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__ConsumeForInBuilt__NameAssignment_115828 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__ConsumeForInBuilt__SensorForConsumeAssignment_315867 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__Consume__NameAssignment_115906 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__Consume__FromNameAssignment_315945 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__Command__CommandNameAssignment_115984 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleCommandParameter_in_rule__Command__CommandparameterAssignment_316019 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__Command__ActuatorForCommandAssignment_616054 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__CommandParameter__NameAssignment_016093 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleCommandParameter_in_rule__CommandParameter__ParameterAssignment_1_116128 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleStruct_in_rule__VocSpec__StructsAssignment_216159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rulePeriodicSensors_in_rule__VocSpec__PeriodicSensorsAssignment_916190 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleEventSensors_in_rule__VocSpec__EventSensorsAssignment_1216221 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleActuator_in_rule__VocSpec__ActuatorsAssignment_1516252 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleStorageService_in_rule__VocSpec__StorageServiceAssignment_1816283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__RegionLabel__NameAssignment16316 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__Struct__NameAssignment_016347 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleField_in_rule__Struct__FieldsAssignment_116378 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__Field__NameAssignment_016409 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleType_in_rule__Field__TypeAssignment_216440 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleEntityName_in_rule__PeriodicSensors__SensorNameAssignment_016471 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleGenerate_in_rule__PeriodicSensors__GenerateInfoAssignment_116502 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleEntityName_in_rule__EventSensors__SensorNameAssignment_016533 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleGenerate_in_rule__EventSensors__GenerateInfoAssignment_116564 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleEventConditions_in_rule__EventSensors__EventConditionsAssignment_316595 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__EventConditions__NameAssignment_016626 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleEventConditions_in_rule__EventConditions__EventConditionsAssignment_1_116657 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__EntityName__NameAssignment16689 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleSourceName_in_rule__Generate__SourceNameAssignment_116720 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleType_in_rule__Generate__TypeAssignment_316751 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__SourceName__NameAssignment16782 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleEntityName_in_rule__Actuator__ActuatorNameAssignment_016813 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleAction_in_rule__Actuator__ActionsAssignment_116844 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleActionName_in_rule__Action__ActionNameAssignment_116875 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleParameters_in_rule__Action__ParametersAssignment_316906 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__ActionName__NameAssignment16937 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleParameterName_in_rule__Parameters__ParameterNameAssignment_016968 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleType_in_rule__Parameters__TypeAssignment_216999 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__ParameterName__NameAssignment17030 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleEntityName_in_rule__StorageService__StorageServiceNameAssignment_017061 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleDataAccess_in_rule__StorageService__DataAccessesAssignment_117092 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleSourceName_in_rule__DataAccess__SourceNameAssignment_117123 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleType_in_rule__DataAccess__DataAccessTypeAssignment_317154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__DataAccess__DataItemAssignment_517185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleType_in_rule__DataAccess__TypeAssignment_717216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleAction_in_rule__DataAccess__ActionsAssignment_917247 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rulePrimitiveDataType_in_rule__Type__PrimitiveDataTypeAssignment17278 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_rule__OperationName__OPERATION_NAMEAssignment17314 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_rule__PrimitiveDataType__INTEGERAssignment_017358 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_rule__PrimitiveDataType__BOOLEANAssignment_117402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_rule__PrimitiveDataType__STRINGAssignment_217446 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_rule__PrimitiveDataType__LONGAssignment_317490 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_rule__PrimitiveDataType__DOUBLEAssignment_417534 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__PrimitiveDataType__StructDefAssignment_517577 = new BitSet(new long[]{0x0000000000000002L});
}
