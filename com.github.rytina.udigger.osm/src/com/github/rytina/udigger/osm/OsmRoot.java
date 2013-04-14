/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.rytina.udigger.osm;

import java.math.BigDecimal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.rytina.udigger.osm.OsmRoot#getBound <em>Bound</em>}</li>
 *   <li>{@link com.github.rytina.udigger.osm.OsmRoot#getGroup <em>Group</em>}</li>
 *   <li>{@link com.github.rytina.udigger.osm.OsmRoot#getNode <em>Node</em>}</li>
 *   <li>{@link com.github.rytina.udigger.osm.OsmRoot#getRelation <em>Relation</em>}</li>
 *   <li>{@link com.github.rytina.udigger.osm.OsmRoot#getWay <em>Way</em>}</li>
 *   <li>{@link com.github.rytina.udigger.osm.OsmRoot#getGenerator <em>Generator</em>}</li>
 *   <li>{@link com.github.rytina.udigger.osm.OsmRoot#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.rytina.udigger.osm.OsmPackage#getOsmRoot()
 * @model extendedMetaData="name='osm_root' kind='elementOnly'"
 * @generated
 */
public interface OsmRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound</em>' containment reference.
	 * @see #setBound(OsmBound)
	 * @see com.github.rytina.udigger.osm.OsmPackage#getOsmRoot_Bound()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bound' namespace='##targetNamespace'"
	 * @generated
	 */
	OsmBound getBound();

	/**
	 * Sets the value of the '{@link com.github.rytina.udigger.osm.OsmRoot#getBound <em>Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound</em>' containment reference.
	 * @see #getBound()
	 * @generated
	 */
	void setBound(OsmBound value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see com.github.rytina.udigger.osm.OsmPackage#getOsmRoot_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:1'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Node</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.rytina.udigger.osm.OsmNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' containment reference list.
	 * @see com.github.rytina.udigger.osm.OsmPackage#getOsmRoot_Node()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='node' namespace='##targetNamespace' group='group:1'"
	 * @generated
	 */
	EList<OsmNode> getNode();

	/**
	 * Returns the value of the '<em><b>Relation</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.rytina.udigger.osm.OsmRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation</em>' containment reference list.
	 * @see com.github.rytina.udigger.osm.OsmPackage#getOsmRoot_Relation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='relation' namespace='##targetNamespace' group='group:1'"
	 * @generated
	 */
	EList<OsmRelation> getRelation();

	/**
	 * Returns the value of the '<em><b>Way</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.rytina.udigger.osm.OsmWay}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Way</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Way</em>' containment reference list.
	 * @see com.github.rytina.udigger.osm.OsmPackage#getOsmRoot_Way()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='way' namespace='##targetNamespace' group='group:1'"
	 * @generated
	 */
	EList<OsmWay> getWay();

	/**
	 * Returns the value of the '<em><b>Generator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generator</em>' attribute.
	 * @see #setGenerator(String)
	 * @see com.github.rytina.udigger.osm.OsmPackage#getOsmRoot_Generator()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='generator' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGenerator();

	/**
	 * Sets the value of the '{@link com.github.rytina.udigger.osm.OsmRoot#getGenerator <em>Generator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generator</em>' attribute.
	 * @see #getGenerator()
	 * @generated
	 */
	void setGenerator(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(BigDecimal)
	 * @see com.github.rytina.udigger.osm.OsmPackage#getOsmRoot_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal" required="true"
	 *        extendedMetaData="kind='attribute' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getVersion();

	/**
	 * Sets the value of the '{@link com.github.rytina.udigger.osm.OsmRoot#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(BigDecimal value);

} // OsmRoot
