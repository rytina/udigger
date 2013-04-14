/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.rytina.udigger.osm;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.rytina.udigger.osm.OsmNode#getTag <em>Tag</em>}</li>
 *   <li>{@link com.github.rytina.udigger.osm.OsmNode#getChangeset <em>Changeset</em>}</li>
 *   <li>{@link com.github.rytina.udigger.osm.OsmNode#getId <em>Id</em>}</li>
 *   <li>{@link com.github.rytina.udigger.osm.OsmNode#getLat <em>Lat</em>}</li>
 *   <li>{@link com.github.rytina.udigger.osm.OsmNode#getLon <em>Lon</em>}</li>
 *   <li>{@link com.github.rytina.udigger.osm.OsmNode#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link com.github.rytina.udigger.osm.OsmNode#getUid <em>Uid</em>}</li>
 *   <li>{@link com.github.rytina.udigger.osm.OsmNode#getUser <em>User</em>}</li>
 *   <li>{@link com.github.rytina.udigger.osm.OsmNode#getVersion <em>Version</em>}</li>
 *   <li>{@link com.github.rytina.udigger.osm.OsmNode#isVisible <em>Visible</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.rytina.udigger.osm.OsmPackage#getOsmNode()
 * @model extendedMetaData="name='osm_node' kind='elementOnly'"
 * @generated
 */
public interface OsmNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Tag</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.rytina.udigger.osm.OsmTag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' containment reference list.
	 * @see com.github.rytina.udigger.osm.OsmPackage#getOsmNode_Tag()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tag' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OsmTag> getTag();

	/**
	 * Returns the value of the '<em><b>Changeset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Changeset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Changeset</em>' attribute.
	 * @see #isSetChangeset()
	 * @see #unsetChangeset()
	 * @see #setChangeset(long)
	 * @see com.github.rytina.udigger.osm.OsmPackage#getOsmNode_Changeset()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
	 *        extendedMetaData="kind='attribute' name='changeset' namespace='##targetNamespace'"
	 * @generated
	 */
	long getChangeset();

	/**
	 * Sets the value of the '{@link com.github.rytina.udigger.osm.OsmNode#getChangeset <em>Changeset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Changeset</em>' attribute.
	 * @see #isSetChangeset()
	 * @see #unsetChangeset()
	 * @see #getChangeset()
	 * @generated
	 */
	void setChangeset(long value);

	/**
	 * Unsets the value of the '{@link com.github.rytina.udigger.osm.OsmNode#getChangeset <em>Changeset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetChangeset()
	 * @see #getChangeset()
	 * @see #setChangeset(long)
	 * @generated
	 */
	void unsetChangeset();

	/**
	 * Returns whether the value of the '{@link com.github.rytina.udigger.osm.OsmNode#getChangeset <em>Changeset</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Changeset</em>' attribute is set.
	 * @see #unsetChangeset()
	 * @see #getChangeset()
	 * @see #setChangeset(long)
	 * @generated
	 */
	boolean isSetChangeset();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #isSetId()
	 * @see #unsetId()
	 * @see #setId(long)
	 * @see com.github.rytina.udigger.osm.OsmPackage#getOsmNode_Id()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link com.github.rytina.udigger.osm.OsmNode#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #isSetId()
	 * @see #unsetId()
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

	/**
	 * Unsets the value of the '{@link com.github.rytina.udigger.osm.OsmNode#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetId()
	 * @see #getId()
	 * @see #setId(long)
	 * @generated
	 */
	void unsetId();

	/**
	 * Returns whether the value of the '{@link com.github.rytina.udigger.osm.OsmNode#getId <em>Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Id</em>' attribute is set.
	 * @see #unsetId()
	 * @see #getId()
	 * @see #setId(long)
	 * @generated
	 */
	boolean isSetId();

	/**
	 * Returns the value of the '<em><b>Lat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lat</em>' attribute.
	 * @see #isSetLat()
	 * @see #unsetLat()
	 * @see #setLat(double)
	 * @see com.github.rytina.udigger.osm.OsmPackage#getOsmNode_Lat()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='attribute' name='lat' namespace='##targetNamespace'"
	 * @generated
	 */
	double getLat();

	/**
	 * Sets the value of the '{@link com.github.rytina.udigger.osm.OsmNode#getLat <em>Lat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lat</em>' attribute.
	 * @see #isSetLat()
	 * @see #unsetLat()
	 * @see #getLat()
	 * @generated
	 */
	void setLat(double value);

	/**
	 * Unsets the value of the '{@link com.github.rytina.udigger.osm.OsmNode#getLat <em>Lat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLat()
	 * @see #getLat()
	 * @see #setLat(double)
	 * @generated
	 */
	void unsetLat();

	/**
	 * Returns whether the value of the '{@link com.github.rytina.udigger.osm.OsmNode#getLat <em>Lat</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lat</em>' attribute is set.
	 * @see #unsetLat()
	 * @see #getLat()
	 * @see #setLat(double)
	 * @generated
	 */
	boolean isSetLat();

	/**
	 * Returns the value of the '<em><b>Lon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lon</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lon</em>' attribute.
	 * @see #isSetLon()
	 * @see #unsetLon()
	 * @see #setLon(double)
	 * @see com.github.rytina.udigger.osm.OsmPackage#getOsmNode_Lon()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='attribute' name='lon' namespace='##targetNamespace'"
	 * @generated
	 */
	double getLon();

	/**
	 * Sets the value of the '{@link com.github.rytina.udigger.osm.OsmNode#getLon <em>Lon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lon</em>' attribute.
	 * @see #isSetLon()
	 * @see #unsetLon()
	 * @see #getLon()
	 * @generated
	 */
	void setLon(double value);

	/**
	 * Unsets the value of the '{@link com.github.rytina.udigger.osm.OsmNode#getLon <em>Lon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLon()
	 * @see #getLon()
	 * @see #setLon(double)
	 * @generated
	 */
	void unsetLon();

	/**
	 * Returns whether the value of the '{@link com.github.rytina.udigger.osm.OsmNode#getLon <em>Lon</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lon</em>' attribute is set.
	 * @see #unsetLon()
	 * @see #getLon()
	 * @see #setLon(double)
	 * @generated
	 */
	boolean isSetLon();

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timestamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(XMLGregorianCalendar)
	 * @see com.github.rytina.udigger.osm.OsmPackage#getOsmNode_Timestamp()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='attribute' name='timestamp' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getTimestamp();

	/**
	 * Sets the value of the '{@link com.github.rytina.udigger.osm.OsmNode#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uid</em>' attribute.
	 * @see #isSetUid()
	 * @see #unsetUid()
	 * @see #setUid(long)
	 * @see com.github.rytina.udigger.osm.OsmPackage#getOsmNode_Uid()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
	 *        extendedMetaData="kind='attribute' name='uid' namespace='##targetNamespace'"
	 * @generated
	 */
	long getUid();

	/**
	 * Sets the value of the '{@link com.github.rytina.udigger.osm.OsmNode#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #isSetUid()
	 * @see #unsetUid()
	 * @see #getUid()
	 * @generated
	 */
	void setUid(long value);

	/**
	 * Unsets the value of the '{@link com.github.rytina.udigger.osm.OsmNode#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUid()
	 * @see #getUid()
	 * @see #setUid(long)
	 * @generated
	 */
	void unsetUid();

	/**
	 * Returns whether the value of the '{@link com.github.rytina.udigger.osm.OsmNode#getUid <em>Uid</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Uid</em>' attribute is set.
	 * @see #unsetUid()
	 * @see #getUid()
	 * @see #setUid(long)
	 * @generated
	 */
	boolean isSetUid();

	/**
	 * Returns the value of the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' attribute.
	 * @see #setUser(String)
	 * @see com.github.rytina.udigger.osm.OsmPackage#getOsmNode_User()
	 * @model dataType="com.github.rytina.udigger.osm.OsmUser"
	 *        extendedMetaData="kind='attribute' name='user' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUser();

	/**
	 * Sets the value of the '{@link com.github.rytina.udigger.osm.OsmNode#getUser <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' attribute.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #setVersion(int)
	 * @see com.github.rytina.udigger.osm.OsmPackage#getOsmNode_Version()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	int getVersion();

	/**
	 * Sets the value of the '{@link com.github.rytina.udigger.osm.OsmNode#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(int value);

	/**
	 * Unsets the value of the '{@link com.github.rytina.udigger.osm.OsmNode#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVersion()
	 * @see #getVersion()
	 * @see #setVersion(int)
	 * @generated
	 */
	void unsetVersion();

	/**
	 * Returns whether the value of the '{@link com.github.rytina.udigger.osm.OsmNode#getVersion <em>Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Version</em>' attribute is set.
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @see #setVersion(int)
	 * @generated
	 */
	boolean isSetVersion();

	/**
	 * Returns the value of the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible</em>' attribute.
	 * @see #isSetVisible()
	 * @see #unsetVisible()
	 * @see #setVisible(boolean)
	 * @see com.github.rytina.udigger.osm.OsmPackage#getOsmNode_Visible()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='visible' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isVisible();

	/**
	 * Sets the value of the '{@link com.github.rytina.udigger.osm.OsmNode#isVisible <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible</em>' attribute.
	 * @see #isSetVisible()
	 * @see #unsetVisible()
	 * @see #isVisible()
	 * @generated
	 */
	void setVisible(boolean value);

	/**
	 * Unsets the value of the '{@link com.github.rytina.udigger.osm.OsmNode#isVisible <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVisible()
	 * @see #isVisible()
	 * @see #setVisible(boolean)
	 * @generated
	 */
	void unsetVisible();

	/**
	 * Returns whether the value of the '{@link com.github.rytina.udigger.osm.OsmNode#isVisible <em>Visible</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Visible</em>' attribute is set.
	 * @see #unsetVisible()
	 * @see #isVisible()
	 * @see #setVisible(boolean)
	 * @generated
	 */
	boolean isSetVisible();

} // OsmNode
