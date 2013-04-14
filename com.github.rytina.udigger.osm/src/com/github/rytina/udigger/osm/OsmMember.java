/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.rytina.udigger.osm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.rytina.udigger.osm.OsmMember#getRef <em>Ref</em>}</li>
 *   <li>{@link com.github.rytina.udigger.osm.OsmMember#getRole <em>Role</em>}</li>
 *   <li>{@link com.github.rytina.udigger.osm.OsmMember#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.rytina.udigger.osm.OsmPackage#getOsmMember()
 * @model extendedMetaData="name='osm_member' kind='empty'"
 * @generated
 */
public interface OsmMember extends EObject {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' attribute.
	 * @see #isSetRef()
	 * @see #unsetRef()
	 * @see #setRef(long)
	 * @see com.github.rytina.udigger.osm.OsmPackage#getOsmMember_Ref()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 *        extendedMetaData="kind='attribute' name='ref' namespace='##targetNamespace'"
	 * @generated
	 */
	long getRef();

	/**
	 * Sets the value of the '{@link com.github.rytina.udigger.osm.OsmMember#getRef <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' attribute.
	 * @see #isSetRef()
	 * @see #unsetRef()
	 * @see #getRef()
	 * @generated
	 */
	void setRef(long value);

	/**
	 * Unsets the value of the '{@link com.github.rytina.udigger.osm.OsmMember#getRef <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRef()
	 * @see #getRef()
	 * @see #setRef(long)
	 * @generated
	 */
	void unsetRef();

	/**
	 * Returns whether the value of the '{@link com.github.rytina.udigger.osm.OsmMember#getRef <em>Ref</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ref</em>' attribute is set.
	 * @see #unsetRef()
	 * @see #getRef()
	 * @see #setRef(long)
	 * @generated
	 */
	boolean isSetRef();

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @see com.github.rytina.udigger.osm.OsmPackage#getOsmMember_Role()
	 * @model dataType="com.github.rytina.udigger.osm.OsmRole"
	 *        extendedMetaData="kind='attribute' name='role' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRole();

	/**
	 * Sets the value of the '{@link com.github.rytina.udigger.osm.OsmMember#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.github.rytina.udigger.osm.OsmMembertype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see com.github.rytina.udigger.osm.OsmMembertype
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(OsmMembertype)
	 * @see com.github.rytina.udigger.osm.OsmPackage#getOsmMember_Type()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	OsmMembertype getType();

	/**
	 * Sets the value of the '{@link com.github.rytina.udigger.osm.OsmMember#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see com.github.rytina.udigger.osm.OsmMembertype
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(OsmMembertype value);

	/**
	 * Unsets the value of the '{@link com.github.rytina.udigger.osm.OsmMember#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(OsmMembertype)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link com.github.rytina.udigger.osm.OsmMember#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(OsmMembertype)
	 * @generated
	 */
	boolean isSetType();

} // OsmMember
