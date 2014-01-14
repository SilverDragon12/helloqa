

/* First created by JCasGen Thu Aug 15 13:53:20 EDT 2013 */
package org.oaqa.dso.model;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.cas.FSList;
import org.apache.uima.jcas.cas.DoubleArray;
import org.apache.uima.jcas.cas.StringArray;


/** An answer generated by the QA system.
 * Updated by JCasGen Mon Oct 21 21:41:35 EDT 2013
 * XML source: /home/ruil/workspace/git/helloqa/src/main/resources/edu/cmu/lti/oaqa/OAQATypes.xml
 * @generated */
public class Answer extends OAQATop {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Answer.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Answer() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Answer(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Answer(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: text

  /** getter for text - gets The actual answer string.
   * @generated */
  public String getText() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_text == null)
      jcasType.jcas.throwFeatMissing("text", "org.oaqa.dso.model.Answer");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Answer_Type)jcasType).casFeatCode_text);}
    
  /** setter for text - sets The actual answer string. 
   * @generated */
  public void setText(String v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_text == null)
      jcasType.jcas.throwFeatMissing("text", "org.oaqa.dso.model.Answer");
    jcasType.ll_cas.ll_setStringValue(addr, ((Answer_Type)jcasType).casFeatCode_text, v);}    
   
    
  //*--------------*
  //* Feature: searchResultList

  /** getter for searchResultList - gets List of search results that are associated with this answer candidate.
   * @generated */
  public FSArray getSearchResultList() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_searchResultList == null)
      jcasType.jcas.throwFeatMissing("searchResultList", "org.oaqa.dso.model.Answer");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_searchResultList)));}
    
  /** setter for searchResultList - sets List of search results that are associated with this answer candidate. 
   * @generated */
  public void setSearchResultList(FSArray v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_searchResultList == null)
      jcasType.jcas.throwFeatMissing("searchResultList", "org.oaqa.dso.model.Answer");
    jcasType.ll_cas.ll_setRefValue(addr, ((Answer_Type)jcasType).casFeatCode_searchResultList, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for searchResultList - gets an indexed value - List of search results that are associated with this answer candidate.
   * @generated */
  public SearchResult getSearchResultList(int i) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_searchResultList == null)
      jcasType.jcas.throwFeatMissing("searchResultList", "org.oaqa.dso.model.Answer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_searchResultList), i);
    return (SearchResult)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_searchResultList), i)));}

  /** indexed setter for searchResultList - sets an indexed value - List of search results that are associated with this answer candidate.
   * @generated */
  public void setSearchResultList(int i, SearchResult v) { 
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_searchResultList == null)
      jcasType.jcas.throwFeatMissing("searchResultList", "org.oaqa.dso.model.Answer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_searchResultList), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_searchResultList), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: score

  /** getter for score - gets The score associated with the answer.
   * @generated */
  public double getScore() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "org.oaqa.dso.model.Answer");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Answer_Type)jcasType).casFeatCode_score);}
    
  /** setter for score - sets The score associated with the answer. 
   * @generated */
  public void setScore(double v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "org.oaqa.dso.model.Answer");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Answer_Type)jcasType).casFeatCode_score, v);}    
   
    
  //*--------------*
  //* Feature: keytermDistances

  /** getter for keytermDistances - gets 
   * @generated */
  public StringArray getKeytermDistances() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_keytermDistances == null)
      jcasType.jcas.throwFeatMissing("keytermDistances", "org.oaqa.dso.model.Answer");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_keytermDistances)));}
    
  /** setter for keytermDistances - sets  
   * @generated */
  public void setKeytermDistances(StringArray v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_keytermDistances == null)
      jcasType.jcas.throwFeatMissing("keytermDistances", "org.oaqa.dso.model.Answer");
    jcasType.ll_cas.ll_setRefValue(addr, ((Answer_Type)jcasType).casFeatCode_keytermDistances, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for keytermDistances - gets an indexed value - 
   * @generated */
  public String getKeytermDistances(int i) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_keytermDistances == null)
      jcasType.jcas.throwFeatMissing("keytermDistances", "org.oaqa.dso.model.Answer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_keytermDistances), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_keytermDistances), i);}

  /** indexed setter for keytermDistances - sets an indexed value - 
   * @generated */
  public void setKeytermDistances(int i, String v) { 
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_keytermDistances == null)
      jcasType.jcas.throwFeatMissing("keytermDistances", "org.oaqa.dso.model.Answer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_keytermDistances), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_keytermDistances), i, v);}
   
    
  //*--------------*
  //* Feature: features

  /** getter for features - gets Features for this candidate answer, which are computed by merging features from the CandidateAnswerVariants.  Note that if the feature values are all numeric, it is more efficient to use the
"featureVector" double array.
   * @generated */
  public FSList getFeatures() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_features == null)
      jcasType.jcas.throwFeatMissing("features", "org.oaqa.dso.model.Answer");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_features)));}
    
  /** setter for features - sets Features for this candidate answer, which are computed by merging features from the CandidateAnswerVariants.  Note that if the feature values are all numeric, it is more efficient to use the
"featureVector" double array. 
   * @generated */
  public void setFeatures(FSList v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_features == null)
      jcasType.jcas.throwFeatMissing("features", "org.oaqa.dso.model.Answer");
    jcasType.ll_cas.ll_setRefValue(addr, ((Answer_Type)jcasType).casFeatCode_features, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: featureVector

  /** getter for featureVector - gets Feature values for this Answer.  The indexes into this array correspond to the indexes into the featureLabels array on the AnswerList.  This is more efficient representation than the list of (feature name, feature value) pairs, in the case where feature values are always numeric.
   * @generated */
  public DoubleArray getFeatureVector() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_featureVector == null)
      jcasType.jcas.throwFeatMissing("featureVector", "org.oaqa.dso.model.Answer");
    return (DoubleArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_featureVector)));}
    
  /** setter for featureVector - sets Feature values for this Answer.  The indexes into this array correspond to the indexes into the featureLabels array on the AnswerList.  This is more efficient representation than the list of (feature name, feature value) pairs, in the case where feature values are always numeric. 
   * @generated */
  public void setFeatureVector(DoubleArray v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_featureVector == null)
      jcasType.jcas.throwFeatMissing("featureVector", "org.oaqa.dso.model.Answer");
    jcasType.ll_cas.ll_setRefValue(addr, ((Answer_Type)jcasType).casFeatCode_featureVector, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for featureVector - gets an indexed value - Feature values for this Answer.  The indexes into this array correspond to the indexes into the featureLabels array on the AnswerList.  This is more efficient representation than the list of (feature name, feature value) pairs, in the case where feature values are always numeric.
   * @generated */
  public double getFeatureVector(int i) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_featureVector == null)
      jcasType.jcas.throwFeatMissing("featureVector", "org.oaqa.dso.model.Answer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_featureVector), i);
    return jcasType.ll_cas.ll_getDoubleArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_featureVector), i);}

  /** indexed setter for featureVector - sets an indexed value - Feature values for this Answer.  The indexes into this array correspond to the indexes into the featureLabels array on the AnswerList.  This is more efficient representation than the list of (feature name, feature value) pairs, in the case where feature values are always numeric.
   * @generated */
  public void setFeatureVector(int i, double v) { 
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_featureVector == null)
      jcasType.jcas.throwFeatMissing("featureVector", "org.oaqa.dso.model.Answer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_featureVector), i);
    jcasType.ll_cas.ll_setDoubleArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_featureVector), i, v);}
  }

    