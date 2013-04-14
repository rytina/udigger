/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.rytina.udigger.osm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.github.rytina.udigger.osm.OsmFactory
 * @model kind="package"
 *        extendedMetaData="qualified='false'"
 * @generated
 */
public interface OsmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "osm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "file:/C:/Users/rytina/Workspaces/WS_GREMLIN/gremlin/src/gremlin/osm.xsd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Osm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OsmPackage eINSTANCE = com.github.rytina.udigger.osm.impl.OsmPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.github.rytina.udigger.osm.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.rytina.udigger.osm.impl.DocumentRootImpl
	 * @see com.github.rytina.udigger.osm.impl.OsmPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Osm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OSM = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.github.rytina.udigger.osm.impl.OsmBoundImpl <em>Bound</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.rytina.udigger.osm.impl.OsmBoundImpl
	 * @see com.github.rytina.udigger.osm.impl.OsmPackageImpl#getOsmBound()
	 * @generated
	 */
	int OSM_BOUND = 1;

	/**
	 * The feature id for the '<em><b>Box</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_BOUND__BOX = 0;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_BOUND__ORIGIN = 1;

	/**
	 * The number of structural features of the '<em>Bound</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_BOUND_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.github.rytina.udigger.osm.impl.OsmMemberImpl <em>Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.rytina.udigger.osm.impl.OsmMemberImpl
	 * @see com.github.rytina.udigger.osm.impl.OsmPackageImpl#getOsmMember()
	 * @generated
	 */
	int OSM_MEMBER = 2;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_MEMBER__REF = 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_MEMBER__ROLE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_MEMBER__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_MEMBER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.github.rytina.udigger.osm.impl.OsmNdImpl <em>Nd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.rytina.udigger.osm.impl.OsmNdImpl
	 * @see com.github.rytina.udigger.osm.impl.OsmPackageImpl#getOsmNd()
	 * @generated
	 */
	int OSM_ND = 3;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_ND__REF = 0;

	/**
	 * The number of structural features of the '<em>Nd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_ND_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.github.rytina.udigger.osm.impl.OsmNodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.rytina.udigger.osm.impl.OsmNodeImpl
	 * @see com.github.rytina.udigger.osm.impl.OsmPackageImpl#getOsmNode()
	 * @generated
	 */
	int OSM_NODE = 4;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_NODE__TAG = 0;

	/**
	 * The feature id for the '<em><b>Changeset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_NODE__CHANGESET = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_NODE__ID = 2;

	/**
	 * The feature id for the '<em><b>Lat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_NODE__LAT = 3;

	/**
	 * The feature id for the '<em><b>Lon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_NODE__LON = 4;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_NODE__TIMESTAMP = 5;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_NODE__UID = 6;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_NODE__USER = 7;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_NODE__VERSION = 8;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_NODE__VISIBLE = 9;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_NODE_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link com.github.rytina.udigger.osm.impl.OsmRelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.rytina.udigger.osm.impl.OsmRelationImpl
	 * @see com.github.rytina.udigger.osm.impl.OsmPackageImpl#getOsmRelation()
	 * @generated
	 */
	int OSM_RELATION = 5;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_RELATION__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_RELATION__TAG = 1;

	/**
	 * The feature id for the '<em><b>Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_RELATION__MEMBER = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_RELATION__ID = 3;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_RELATION__TIMESTAMP = 4;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_RELATION__USER = 5;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_RELATION__VISIBLE = 6;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_RELATION_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link com.github.rytina.udigger.osm.impl.OsmRootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.rytina.udigger.osm.impl.OsmRootImpl
	 * @see com.github.rytina.udigger.osm.impl.OsmPackageImpl#getOsmRoot()
	 * @generated
	 */
	int OSM_ROOT = 6;

	/**
	 * The feature id for the '<em><b>Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_ROOT__BOUND = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_ROOT__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_ROOT__NODE = 2;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_ROOT__RELATION = 3;

	/**
	 * The feature id for the '<em><b>Way</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_ROOT__WAY = 4;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_ROOT__GENERATOR = 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_ROOT__VERSION = 6;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_ROOT_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link com.github.rytina.udigger.osm.impl.OsmTagImpl <em>Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.rytina.udigger.osm.impl.OsmTagImpl
	 * @see com.github.rytina.udigger.osm.impl.OsmPackageImpl#getOsmTag()
	 * @generated
	 */
	int OSM_TAG = 7;

	/**
	 * The feature id for the '<em><b>K</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_TAG__K = 0;

	/**
	 * The feature id for the '<em><b>V</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_TAG__V = 1;

	/**
	 * The number of structural features of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_TAG_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.github.rytina.udigger.osm.impl.OsmWayImpl <em>Way</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.rytina.udigger.osm.impl.OsmWayImpl
	 * @see com.github.rytina.udigger.osm.impl.OsmPackageImpl#getOsmWay()
	 * @generated
	 */
	int OSM_WAY = 8;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_WAY__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_WAY__TAG = 1;

	/**
	 * The feature id for the '<em><b>Nd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_WAY__ND = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_WAY__ID = 3;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_WAY__TIMESTAMP = 4;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_WAY__USER = 5;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_WAY__VISIBLE = 6;

	/**
	 * The number of structural features of the '<em>Way</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSM_WAY_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link com.github.rytina.udigger.osm.OsmMembertype <em>Membertype</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.rytina.udigger.osm.OsmMembertype
	 * @see com.github.rytina.udigger.osm.impl.OsmPackageImpl#getOsmMembertype()
	 * @generated
	 */
	int OSM_MEMBERTYPE = 9;

	/**
	 * The meta object id for the '<em>Membertype Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.rytina.udigger.osm.OsmMembertype
	 * @see com.github.rytina.udigger.osm.impl.OsmPackageImpl#getOsmMembertypeObject()
	 * @generated
	 */
	int OSM_MEMBERTYPE_OBJECT = 10;

	/**
	 * The meta object id for the '<em>Role</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.github.rytina.udigger.osm.impl.OsmPackageImpl#getOsmRole()
	 * @generated
	 */
	int OSM_ROLE = 11;

	/**
	 * The meta object id for the '<em>Tagkey</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.github.rytina.udigger.osm.impl.OsmPackageImpl#getOsmTagkey()
	 * @generated
	 */
	int OSM_TAGKEY = 12;

	/**
	 * The meta object id for the '<em>Tagvalue</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.github.rytina.udigger.osm.impl.OsmPackageImpl#getOsmTagvalue()
	 * @generated
	 */
	int OSM_TAGVALUE = 13;

	/**
	 * The meta object id for the '<em>User</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.github.rytina.udigger.osm.impl.OsmPackageImpl#getOsmUser()
	 * @generated
	 */
	int OSM_USER = 14;


	/**
	 * Returns the meta object for class '{@link com.github.rytina.udigger.osm.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see com.github.rytina.udigger.osm.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link com.github.rytina.udigger.osm.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see com.github.rytina.udigger.osm.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link com.github.rytina.udigger.osm.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see com.github.rytina.udigger.osm.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link com.github.rytina.udigger.osm.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see com.github.rytina.udigger.osm.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link com.github.rytina.udigger.osm.DocumentRoot#getOsm <em>Osm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Osm</em>'.
	 * @see com.github.rytina.udigger.osm.DocumentRoot#getOsm()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Osm();

	/**
	 * Returns the meta object for class '{@link com.github.rytina.udigger.osm.OsmBound <em>Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bound</em>'.
	 * @see com.github.rytina.udigger.osm.OsmBound
	 * @generated
	 */
	EClass getOsmBound();

	/**
	 * Returns the meta object for the attribute '{@link com.github.rytina.udigger.osm.OsmBound#getBox <em>Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Box</em>'.
	 * @see com.github.rytina.udigger.osm.OsmBound#getBox()
	 * @see #getOsmBound()
	 * @generated
	 */
	EAttribute getOsmBound_Box();

	/**
	 * Returns the meta object for the attribute '{@link com.github.rytina.udigger.osm.OsmBound#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origin</em>'.
	 * @see com.github.rytina.udigger.osm.OsmBound#getOrigin()
	 * @see #getOsmBound()
	 * @generated
	 */
	EAttribute getOsmBound_Origin();

	/**
	 * Returns the meta object for class '{@link com.github.rytina.udigger.osm.OsmMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Member</em>'.
	 * @see com.github.rytina.udigger.osm.OsmMember
	 * @generated
	 */
	EClass getOsmMember();

	/**
	 * Returns the meta object for the attribute '{@link com.github.rytina.udigger.osm.OsmMember#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see com.github.rytina.udigger.osm.OsmMember#getRef()
	 * @see #getOsmMember()
	 * @generated
	 */
	EAttribute getOsmMember_Ref();

	/**
	 * Returns the meta object for the attribute '{@link com.github.rytina.udigger.osm.OsmMember#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see com.github.rytina.udigger.osm.OsmMember#getRole()
	 * @see #getOsmMember()
	 * @generated
	 */
	EAttribute getOsmMember_Role();

	/**
	 * Returns the meta object for the attribute '{@link com.github.rytina.udigger.osm.OsmMember#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.github.rytina.udigger.osm.OsmMember#getType()
	 * @see #getOsmMember()
	 * @generated
	 */
	EAttribute getOsmMember_Type();

	/**
	 * Returns the meta object for class '{@link com.github.rytina.udigger.osm.OsmNd <em>Nd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nd</em>'.
	 * @see com.github.rytina.udigger.osm.OsmNd
	 * @generated
	 */
	EClass getOsmNd();

	/**
	 * Returns the meta object for the attribute '{@link com.github.rytina.udigger.osm.OsmNd#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see com.github.rytina.udigger.osm.OsmNd#getRef()
	 * @see #getOsmNd()
	 * @generated
	 */
	EAttribute getOsmNd_Ref();

	/**
	 * Returns the meta object for class '{@link com.github.rytina.udigger.osm.OsmNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see com.github.rytina.udigger.osm.OsmNode
	 * @generated
	 */
	EClass getOsmNode();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.rytina.udigger.osm.OsmNode#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tag</em>'.
	 * @see com.github.rytina.udigger.osm.OsmNode#getTag()
	 * @see #getOsmNode()
	 * @generated
	 */
	EReference getOsmNode_Tag();

	/**
	 * Returns the meta object for the attribute '{@link com.github.rytina.udigger.osm.OsmNode#getChangeset <em>Changeset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Changeset</em>'.
	 * @see com.github.rytina.udigger.osm.OsmNode#getChangeset()
	 * @see #getOsmNode()
	 * @generated
	 */
	EAttribute getOsmNode_Changeset();

	/**
	 * Returns the meta object for the attribute '{@link com.github.rytina.udigger.osm.OsmNode#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.github.rytina.udigger.osm.OsmNode#getId()
	 * @see #getOsmNode()
	 * @generated
	 */
	EAttribute getOsmNode_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.github.rytina.udigger.osm.OsmNode#getLat <em>Lat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lat</em>'.
	 * @see com.github.rytina.udigger.osm.OsmNode#getLat()
	 * @see #getOsmNode()
	 * @generated
	 */
	EAttribute getOsmNode_Lat();

	/**
	 * Returns the meta object for the attribute '{@link com.github.rytina.udigger.osm.OsmNode#getLon <em>Lon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lon</em>'.
	 * @see com.github.rytina.udigger.osm.OsmNode#getLon()
	 * @see #getOsmNode()
	 * @generated
	 */
	EAttribute getOsmNode_Lon();

	/**
	 * Returns the meta object for the attribute '{@link com.github.rytina.udigger.osm.OsmNode#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see com.github.rytina.udigger.osm.OsmNode#getTimestamp()
	 * @see #getOsmNode()
	 * @generated
	 */
	EAttribute getOsmNode_Timestamp();

	/**
	 * Returns the meta object for the attribute '{@link com.github.rytina.udigger.osm.OsmNode#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see com.github.rytina.udigger.osm.OsmNode#getUid()
	 * @see #getOsmNode()
	 * @generated
	 */
	EAttribute getOsmNode_Uid();

	/**
	 * Returns the meta object for the attribute '{@link com.github.rytina.udigger.osm.OsmNode#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see com.github.rytina.udigger.osm.OsmNode#getUser()
	 * @see #getOsmNode()
	 * @generated
	 */
	EAttribute getOsmNode_User();

	/**
	 * Returns the meta object for the attribute '{@link com.github.rytina.udigger.osm.OsmNode#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see com.github.rytina.udigger.osm.OsmNode#getVersion()
	 * @see #getOsmNode()
	 * @generated
	 */
	EAttribute getOsmNode_Version();

	/**
	 * Returns the meta object for the attribute '{@link com.github.rytina.udigger.osm.OsmNode#isVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see com.github.rytina.udigger.osm.OsmNode#isVisible()
	 * @see #getOsmNode()
	 * @generated
	 */
	EAttribute getOsmNode_Visible();

	/**
	 * Returns the meta object for class '{@link com.github.rytina.udigger.osm.OsmRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see com.github.rytina.udigger.osm.OsmRelation
	 * @generated
	 */
	EClass getOsmRelation();

	/**
	 * Returns the meta object for the attribute list '{@link com.github.rytina.udigger.osm.OsmRelation#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see com.github.rytina.udigger.osm.OsmRelation#getGroup()
	 * @see #getOsmRelation()
	 * @generated
	 */
	EAttribute getOsmRelation_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.rytina.udigger.osm.OsmRelation#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tag</em>'.
	 * @see com.github.rytina.udigger.osm.OsmRelation#getTag()
	 * @see #getOsmRelation()
	 * @generated
	 */
	EReference getOsmRelation_Tag();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.rytina.udigger.osm.OsmRelation#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Member</em>'.
	 * @see com.github.rytina.udigger.osm.OsmRelation#getMember()
	 * @see #getOsmRelation()
	 * @generated
	 */
	EReference getOsmRelation_Member();

	/**
	 * Returns the meta object for the attribute '{@link com.github.rytina.udigger.osm.OsmRelation#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.github.rytina.udigger.osm.OsmRelation#getId()
	 * @see #getOsmRelation()
	 * @generated
	 */
	EAttribute getOsmRelation_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.github.rytina.udigger.osm.OsmRelation#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see com.github.rytina.udigger.osm.OsmRelation#getTimestamp()
	 * @see #getOsmRelation()
	 * @generated
	 */
	EAttribute getOsmRelation_Timestamp();

	/**
	 * Returns the meta object for the attribute '{@link com.github.rytina.udigger.osm.OsmRelation#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see com.github.rytina.udigger.osm.OsmRelation#getUser()
	 * @see #getOsmRelation()
	 * @generated
	 */
	EAttribute getOsmRelation_User();

	/**
	 * Returns the meta object for the attribute '{@link com.github.rytina.udigger.osm.OsmRelation#isVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see com.github.rytina.udigger.osm.OsmRelation#isVisible()
	 * @see #getOsmRelation()
	 * @generated
	 */
	EAttribute getOsmRelation_Visible();

	/**
	 * Returns the meta object for class '{@link com.github.rytina.udigger.osm.OsmRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see com.github.rytina.udigger.osm.OsmRoot
	 * @generated
	 */
	EClass getOsmRoot();

	/**
	 * Returns the meta object for the containment reference '{@link com.github.rytina.udigger.osm.OsmRoot#getBound <em>Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bound</em>'.
	 * @see com.github.rytina.udigger.osm.OsmRoot#getBound()
	 * @see #getOsmRoot()
	 * @generated
	 */
	EReference getOsmRoot_Bound();

	/**
	 * Returns the meta object for the attribute list '{@link com.github.rytina.udigger.osm.OsmRoot#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see com.github.rytina.udigger.osm.OsmRoot#getGroup()
	 * @see #getOsmRoot()
	 * @generated
	 */
	EAttribute getOsmRoot_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.rytina.udigger.osm.OsmRoot#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node</em>'.
	 * @see com.github.rytina.udigger.osm.OsmRoot#getNode()
	 * @see #getOsmRoot()
	 * @generated
	 */
	EReference getOsmRoot_Node();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.rytina.udigger.osm.OsmRoot#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relation</em>'.
	 * @see com.github.rytina.udigger.osm.OsmRoot#getRelation()
	 * @see #getOsmRoot()
	 * @generated
	 */
	EReference getOsmRoot_Relation();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.rytina.udigger.osm.OsmRoot#getWay <em>Way</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Way</em>'.
	 * @see com.github.rytina.udigger.osm.OsmRoot#getWay()
	 * @see #getOsmRoot()
	 * @generated
	 */
	EReference getOsmRoot_Way();

	/**
	 * Returns the meta object for the attribute '{@link com.github.rytina.udigger.osm.OsmRoot#getGenerator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generator</em>'.
	 * @see com.github.rytina.udigger.osm.OsmRoot#getGenerator()
	 * @see #getOsmRoot()
	 * @generated
	 */
	EAttribute getOsmRoot_Generator();

	/**
	 * Returns the meta object for the attribute '{@link com.github.rytina.udigger.osm.OsmRoot#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see com.github.rytina.udigger.osm.OsmRoot#getVersion()
	 * @see #getOsmRoot()
	 * @generated
	 */
	EAttribute getOsmRoot_Version();

	/**
	 * Returns the meta object for class '{@link com.github.rytina.udigger.osm.OsmTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag</em>'.
	 * @see com.github.rytina.udigger.osm.OsmTag
	 * @generated
	 */
	EClass getOsmTag();

	/**
	 * Returns the meta object for the attribute '{@link com.github.rytina.udigger.osm.OsmTag#getK <em>K</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>K</em>'.
	 * @see com.github.rytina.udigger.osm.OsmTag#getK()
	 * @see #getOsmTag()
	 * @generated
	 */
	EAttribute getOsmTag_K();

	/**
	 * Returns the meta object for the attribute '{@link com.github.rytina.udigger.osm.OsmTag#getV <em>V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>V</em>'.
	 * @see com.github.rytina.udigger.osm.OsmTag#getV()
	 * @see #getOsmTag()
	 * @generated
	 */
	EAttribute getOsmTag_V();

	/**
	 * Returns the meta object for class '{@link com.github.rytina.udigger.osm.OsmWay <em>Way</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Way</em>'.
	 * @see com.github.rytina.udigger.osm.OsmWay
	 * @generated
	 */
	EClass getOsmWay();

	/**
	 * Returns the meta object for the attribute list '{@link com.github.rytina.udigger.osm.OsmWay#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see com.github.rytina.udigger.osm.OsmWay#getGroup()
	 * @see #getOsmWay()
	 * @generated
	 */
	EAttribute getOsmWay_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.rytina.udigger.osm.OsmWay#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tag</em>'.
	 * @see com.github.rytina.udigger.osm.OsmWay#getTag()
	 * @see #getOsmWay()
	 * @generated
	 */
	EReference getOsmWay_Tag();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.rytina.udigger.osm.OsmWay#getNd <em>Nd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nd</em>'.
	 * @see com.github.rytina.udigger.osm.OsmWay#getNd()
	 * @see #getOsmWay()
	 * @generated
	 */
	EReference getOsmWay_Nd();

	/**
	 * Returns the meta object for the attribute '{@link com.github.rytina.udigger.osm.OsmWay#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.github.rytina.udigger.osm.OsmWay#getId()
	 * @see #getOsmWay()
	 * @generated
	 */
	EAttribute getOsmWay_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.github.rytina.udigger.osm.OsmWay#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see com.github.rytina.udigger.osm.OsmWay#getTimestamp()
	 * @see #getOsmWay()
	 * @generated
	 */
	EAttribute getOsmWay_Timestamp();

	/**
	 * Returns the meta object for the attribute '{@link com.github.rytina.udigger.osm.OsmWay#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see com.github.rytina.udigger.osm.OsmWay#getUser()
	 * @see #getOsmWay()
	 * @generated
	 */
	EAttribute getOsmWay_User();

	/**
	 * Returns the meta object for the attribute '{@link com.github.rytina.udigger.osm.OsmWay#isVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see com.github.rytina.udigger.osm.OsmWay#isVisible()
	 * @see #getOsmWay()
	 * @generated
	 */
	EAttribute getOsmWay_Visible();

	/**
	 * Returns the meta object for enum '{@link com.github.rytina.udigger.osm.OsmMembertype <em>Membertype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Membertype</em>'.
	 * @see com.github.rytina.udigger.osm.OsmMembertype
	 * @generated
	 */
	EEnum getOsmMembertype();

	/**
	 * Returns the meta object for data type '{@link com.github.rytina.udigger.osm.OsmMembertype <em>Membertype Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Membertype Object</em>'.
	 * @see com.github.rytina.udigger.osm.OsmMembertype
	 * @model instanceClass="com.github.rytina.udigger.osm.OsmMembertype"
	 *        extendedMetaData="name='osm_membertype:Object' baseType='osm_membertype'"
	 * @generated
	 */
	EDataType getOsmMembertypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Role</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='osm_role' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='1' maxLength='250'"
	 * @generated
	 */
	EDataType getOsmRole();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Tagkey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Tagkey</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='osm_tagkey' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='1' maxLength='250'"
	 * @generated
	 */
	EDataType getOsmTagkey();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Tagvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Tagvalue</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='osm_tagvalue' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='0' maxLength='3000'"
	 * @generated
	 */
	EDataType getOsmTagvalue();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>User</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='osm_user' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='1' maxLength='100'"
	 * @generated
	 */
	EDataType getOsmUser();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OsmFactory getOsmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.github.rytina.udigger.osm.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.rytina.udigger.osm.impl.DocumentRootImpl
		 * @see com.github.rytina.udigger.osm.impl.OsmPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Osm</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__OSM = eINSTANCE.getDocumentRoot_Osm();

		/**
		 * The meta object literal for the '{@link com.github.rytina.udigger.osm.impl.OsmBoundImpl <em>Bound</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.rytina.udigger.osm.impl.OsmBoundImpl
		 * @see com.github.rytina.udigger.osm.impl.OsmPackageImpl#getOsmBound()
		 * @generated
		 */
		EClass OSM_BOUND = eINSTANCE.getOsmBound();

		/**
		 * The meta object literal for the '<em><b>Box</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSM_BOUND__BOX = eINSTANCE.getOsmBound_Box();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSM_BOUND__ORIGIN = eINSTANCE.getOsmBound_Origin();

		/**
		 * The meta object literal for the '{@link com.github.rytina.udigger.osm.impl.OsmMemberImpl <em>Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.rytina.udigger.osm.impl.OsmMemberImpl
		 * @see com.github.rytina.udigger.osm.impl.OsmPackageImpl#getOsmMember()
		 * @generated
		 */
		EClass OSM_MEMBER = eINSTANCE.getOsmMember();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSM_MEMBER__REF = eINSTANCE.getOsmMember_Ref();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSM_MEMBER__ROLE = eINSTANCE.getOsmMember_Role();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSM_MEMBER__TYPE = eINSTANCE.getOsmMember_Type();

		/**
		 * The meta object literal for the '{@link com.github.rytina.udigger.osm.impl.OsmNdImpl <em>Nd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.rytina.udigger.osm.impl.OsmNdImpl
		 * @see com.github.rytina.udigger.osm.impl.OsmPackageImpl#getOsmNd()
		 * @generated
		 */
		EClass OSM_ND = eINSTANCE.getOsmNd();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSM_ND__REF = eINSTANCE.getOsmNd_Ref();

		/**
		 * The meta object literal for the '{@link com.github.rytina.udigger.osm.impl.OsmNodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.rytina.udigger.osm.impl.OsmNodeImpl
		 * @see com.github.rytina.udigger.osm.impl.OsmPackageImpl#getOsmNode()
		 * @generated
		 */
		EClass OSM_NODE = eINSTANCE.getOsmNode();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OSM_NODE__TAG = eINSTANCE.getOsmNode_Tag();

		/**
		 * The meta object literal for the '<em><b>Changeset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSM_NODE__CHANGESET = eINSTANCE.getOsmNode_Changeset();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSM_NODE__ID = eINSTANCE.getOsmNode_Id();

		/**
		 * The meta object literal for the '<em><b>Lat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSM_NODE__LAT = eINSTANCE.getOsmNode_Lat();

		/**
		 * The meta object literal for the '<em><b>Lon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSM_NODE__LON = eINSTANCE.getOsmNode_Lon();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSM_NODE__TIMESTAMP = eINSTANCE.getOsmNode_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSM_NODE__UID = eINSTANCE.getOsmNode_Uid();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSM_NODE__USER = eINSTANCE.getOsmNode_User();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSM_NODE__VERSION = eINSTANCE.getOsmNode_Version();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSM_NODE__VISIBLE = eINSTANCE.getOsmNode_Visible();

		/**
		 * The meta object literal for the '{@link com.github.rytina.udigger.osm.impl.OsmRelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.rytina.udigger.osm.impl.OsmRelationImpl
		 * @see com.github.rytina.udigger.osm.impl.OsmPackageImpl#getOsmRelation()
		 * @generated
		 */
		EClass OSM_RELATION = eINSTANCE.getOsmRelation();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSM_RELATION__GROUP = eINSTANCE.getOsmRelation_Group();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OSM_RELATION__TAG = eINSTANCE.getOsmRelation_Tag();

		/**
		 * The meta object literal for the '<em><b>Member</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OSM_RELATION__MEMBER = eINSTANCE.getOsmRelation_Member();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSM_RELATION__ID = eINSTANCE.getOsmRelation_Id();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSM_RELATION__TIMESTAMP = eINSTANCE.getOsmRelation_Timestamp();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSM_RELATION__USER = eINSTANCE.getOsmRelation_User();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSM_RELATION__VISIBLE = eINSTANCE.getOsmRelation_Visible();

		/**
		 * The meta object literal for the '{@link com.github.rytina.udigger.osm.impl.OsmRootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.rytina.udigger.osm.impl.OsmRootImpl
		 * @see com.github.rytina.udigger.osm.impl.OsmPackageImpl#getOsmRoot()
		 * @generated
		 */
		EClass OSM_ROOT = eINSTANCE.getOsmRoot();

		/**
		 * The meta object literal for the '<em><b>Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OSM_ROOT__BOUND = eINSTANCE.getOsmRoot_Bound();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSM_ROOT__GROUP = eINSTANCE.getOsmRoot_Group();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OSM_ROOT__NODE = eINSTANCE.getOsmRoot_Node();

		/**
		 * The meta object literal for the '<em><b>Relation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OSM_ROOT__RELATION = eINSTANCE.getOsmRoot_Relation();

		/**
		 * The meta object literal for the '<em><b>Way</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OSM_ROOT__WAY = eINSTANCE.getOsmRoot_Way();

		/**
		 * The meta object literal for the '<em><b>Generator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSM_ROOT__GENERATOR = eINSTANCE.getOsmRoot_Generator();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSM_ROOT__VERSION = eINSTANCE.getOsmRoot_Version();

		/**
		 * The meta object literal for the '{@link com.github.rytina.udigger.osm.impl.OsmTagImpl <em>Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.rytina.udigger.osm.impl.OsmTagImpl
		 * @see com.github.rytina.udigger.osm.impl.OsmPackageImpl#getOsmTag()
		 * @generated
		 */
		EClass OSM_TAG = eINSTANCE.getOsmTag();

		/**
		 * The meta object literal for the '<em><b>K</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSM_TAG__K = eINSTANCE.getOsmTag_K();

		/**
		 * The meta object literal for the '<em><b>V</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSM_TAG__V = eINSTANCE.getOsmTag_V();

		/**
		 * The meta object literal for the '{@link com.github.rytina.udigger.osm.impl.OsmWayImpl <em>Way</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.rytina.udigger.osm.impl.OsmWayImpl
		 * @see com.github.rytina.udigger.osm.impl.OsmPackageImpl#getOsmWay()
		 * @generated
		 */
		EClass OSM_WAY = eINSTANCE.getOsmWay();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSM_WAY__GROUP = eINSTANCE.getOsmWay_Group();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OSM_WAY__TAG = eINSTANCE.getOsmWay_Tag();

		/**
		 * The meta object literal for the '<em><b>Nd</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OSM_WAY__ND = eINSTANCE.getOsmWay_Nd();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSM_WAY__ID = eINSTANCE.getOsmWay_Id();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSM_WAY__TIMESTAMP = eINSTANCE.getOsmWay_Timestamp();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSM_WAY__USER = eINSTANCE.getOsmWay_User();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSM_WAY__VISIBLE = eINSTANCE.getOsmWay_Visible();

		/**
		 * The meta object literal for the '{@link com.github.rytina.udigger.osm.OsmMembertype <em>Membertype</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.rytina.udigger.osm.OsmMembertype
		 * @see com.github.rytina.udigger.osm.impl.OsmPackageImpl#getOsmMembertype()
		 * @generated
		 */
		EEnum OSM_MEMBERTYPE = eINSTANCE.getOsmMembertype();

		/**
		 * The meta object literal for the '<em>Membertype Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.rytina.udigger.osm.OsmMembertype
		 * @see com.github.rytina.udigger.osm.impl.OsmPackageImpl#getOsmMembertypeObject()
		 * @generated
		 */
		EDataType OSM_MEMBERTYPE_OBJECT = eINSTANCE.getOsmMembertypeObject();

		/**
		 * The meta object literal for the '<em>Role</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.github.rytina.udigger.osm.impl.OsmPackageImpl#getOsmRole()
		 * @generated
		 */
		EDataType OSM_ROLE = eINSTANCE.getOsmRole();

		/**
		 * The meta object literal for the '<em>Tagkey</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.github.rytina.udigger.osm.impl.OsmPackageImpl#getOsmTagkey()
		 * @generated
		 */
		EDataType OSM_TAGKEY = eINSTANCE.getOsmTagkey();

		/**
		 * The meta object literal for the '<em>Tagvalue</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.github.rytina.udigger.osm.impl.OsmPackageImpl#getOsmTagvalue()
		 * @generated
		 */
		EDataType OSM_TAGVALUE = eINSTANCE.getOsmTagvalue();

		/**
		 * The meta object literal for the '<em>User</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.github.rytina.udigger.osm.impl.OsmPackageImpl#getOsmUser()
		 * @generated
		 */
		EDataType OSM_USER = eINSTANCE.getOsmUser();

	}

} //OsmPackage
