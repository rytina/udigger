/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.rytina.udigger.osm.impl;

import com.github.rytina.udigger.osm.DocumentRoot;
import com.github.rytina.udigger.osm.OsmBound;
import com.github.rytina.udigger.osm.OsmFactory;
import com.github.rytina.udigger.osm.OsmMember;
import com.github.rytina.udigger.osm.OsmMembertype;
import com.github.rytina.udigger.osm.OsmNd;
import com.github.rytina.udigger.osm.OsmNode;
import com.github.rytina.udigger.osm.OsmPackage;
import com.github.rytina.udigger.osm.OsmRelation;
import com.github.rytina.udigger.osm.OsmRoot;
import com.github.rytina.udigger.osm.OsmTag;
import com.github.rytina.udigger.osm.OsmWay;

import com.github.rytina.udigger.osm.util.OsmValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OsmPackageImpl extends EPackageImpl implements OsmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osmBoundEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osmMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osmNdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osmNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osmRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osmRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osmTagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osmWayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum osmMembertypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType osmMembertypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType osmRoleEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType osmTagkeyEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType osmTagvalueEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType osmUserEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.github.rytina.udigger.osm.OsmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OsmPackageImpl() {
		super(eNS_URI, OsmFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link OsmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OsmPackage init() {
		if (isInited) return (OsmPackage)EPackage.Registry.INSTANCE.getEPackage(OsmPackage.eNS_URI);

		// Obtain or create and register package
		OsmPackageImpl theOsmPackage = (OsmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OsmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OsmPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theOsmPackage.createPackageContents();

		// Initialize created meta-data
		theOsmPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theOsmPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return OsmValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theOsmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OsmPackage.eNS_URI, theOsmPackage);
		return theOsmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Osm() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOsmBound() {
		return osmBoundEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsmBound_Box() {
		return (EAttribute)osmBoundEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsmBound_Origin() {
		return (EAttribute)osmBoundEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOsmMember() {
		return osmMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsmMember_Ref() {
		return (EAttribute)osmMemberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsmMember_Role() {
		return (EAttribute)osmMemberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsmMember_Type() {
		return (EAttribute)osmMemberEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOsmNd() {
		return osmNdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsmNd_Ref() {
		return (EAttribute)osmNdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOsmNode() {
		return osmNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsmNode_Tag() {
		return (EReference)osmNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsmNode_Changeset() {
		return (EAttribute)osmNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsmNode_Id() {
		return (EAttribute)osmNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsmNode_Lat() {
		return (EAttribute)osmNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsmNode_Lon() {
		return (EAttribute)osmNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsmNode_Timestamp() {
		return (EAttribute)osmNodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsmNode_Uid() {
		return (EAttribute)osmNodeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsmNode_User() {
		return (EAttribute)osmNodeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsmNode_Version() {
		return (EAttribute)osmNodeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsmNode_Visible() {
		return (EAttribute)osmNodeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOsmRelation() {
		return osmRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsmRelation_Group() {
		return (EAttribute)osmRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsmRelation_Tag() {
		return (EReference)osmRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsmRelation_Member() {
		return (EReference)osmRelationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsmRelation_Id() {
		return (EAttribute)osmRelationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsmRelation_Timestamp() {
		return (EAttribute)osmRelationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsmRelation_User() {
		return (EAttribute)osmRelationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsmRelation_Visible() {
		return (EAttribute)osmRelationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOsmRoot() {
		return osmRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsmRoot_Bound() {
		return (EReference)osmRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsmRoot_Group() {
		return (EAttribute)osmRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsmRoot_Node() {
		return (EReference)osmRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsmRoot_Relation() {
		return (EReference)osmRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsmRoot_Way() {
		return (EReference)osmRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsmRoot_Generator() {
		return (EAttribute)osmRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsmRoot_Version() {
		return (EAttribute)osmRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOsmTag() {
		return osmTagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsmTag_K() {
		return (EAttribute)osmTagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsmTag_V() {
		return (EAttribute)osmTagEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOsmWay() {
		return osmWayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsmWay_Group() {
		return (EAttribute)osmWayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsmWay_Tag() {
		return (EReference)osmWayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsmWay_Nd() {
		return (EReference)osmWayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsmWay_Id() {
		return (EAttribute)osmWayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsmWay_Timestamp() {
		return (EAttribute)osmWayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsmWay_User() {
		return (EAttribute)osmWayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsmWay_Visible() {
		return (EAttribute)osmWayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOsmMembertype() {
		return osmMembertypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOsmMembertypeObject() {
		return osmMembertypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOsmRole() {
		return osmRoleEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOsmTagkey() {
		return osmTagkeyEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOsmTagvalue() {
		return osmTagvalueEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOsmUser() {
		return osmUserEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsmFactory getOsmFactory() {
		return (OsmFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__OSM);

		osmBoundEClass = createEClass(OSM_BOUND);
		createEAttribute(osmBoundEClass, OSM_BOUND__BOX);
		createEAttribute(osmBoundEClass, OSM_BOUND__ORIGIN);

		osmMemberEClass = createEClass(OSM_MEMBER);
		createEAttribute(osmMemberEClass, OSM_MEMBER__REF);
		createEAttribute(osmMemberEClass, OSM_MEMBER__ROLE);
		createEAttribute(osmMemberEClass, OSM_MEMBER__TYPE);

		osmNdEClass = createEClass(OSM_ND);
		createEAttribute(osmNdEClass, OSM_ND__REF);

		osmNodeEClass = createEClass(OSM_NODE);
		createEReference(osmNodeEClass, OSM_NODE__TAG);
		createEAttribute(osmNodeEClass, OSM_NODE__CHANGESET);
		createEAttribute(osmNodeEClass, OSM_NODE__ID);
		createEAttribute(osmNodeEClass, OSM_NODE__LAT);
		createEAttribute(osmNodeEClass, OSM_NODE__LON);
		createEAttribute(osmNodeEClass, OSM_NODE__TIMESTAMP);
		createEAttribute(osmNodeEClass, OSM_NODE__UID);
		createEAttribute(osmNodeEClass, OSM_NODE__USER);
		createEAttribute(osmNodeEClass, OSM_NODE__VERSION);
		createEAttribute(osmNodeEClass, OSM_NODE__VISIBLE);

		osmRelationEClass = createEClass(OSM_RELATION);
		createEAttribute(osmRelationEClass, OSM_RELATION__GROUP);
		createEReference(osmRelationEClass, OSM_RELATION__TAG);
		createEReference(osmRelationEClass, OSM_RELATION__MEMBER);
		createEAttribute(osmRelationEClass, OSM_RELATION__ID);
		createEAttribute(osmRelationEClass, OSM_RELATION__TIMESTAMP);
		createEAttribute(osmRelationEClass, OSM_RELATION__USER);
		createEAttribute(osmRelationEClass, OSM_RELATION__VISIBLE);

		osmRootEClass = createEClass(OSM_ROOT);
		createEReference(osmRootEClass, OSM_ROOT__BOUND);
		createEAttribute(osmRootEClass, OSM_ROOT__GROUP);
		createEReference(osmRootEClass, OSM_ROOT__NODE);
		createEReference(osmRootEClass, OSM_ROOT__RELATION);
		createEReference(osmRootEClass, OSM_ROOT__WAY);
		createEAttribute(osmRootEClass, OSM_ROOT__GENERATOR);
		createEAttribute(osmRootEClass, OSM_ROOT__VERSION);

		osmTagEClass = createEClass(OSM_TAG);
		createEAttribute(osmTagEClass, OSM_TAG__K);
		createEAttribute(osmTagEClass, OSM_TAG__V);

		osmWayEClass = createEClass(OSM_WAY);
		createEAttribute(osmWayEClass, OSM_WAY__GROUP);
		createEReference(osmWayEClass, OSM_WAY__TAG);
		createEReference(osmWayEClass, OSM_WAY__ND);
		createEAttribute(osmWayEClass, OSM_WAY__ID);
		createEAttribute(osmWayEClass, OSM_WAY__TIMESTAMP);
		createEAttribute(osmWayEClass, OSM_WAY__USER);
		createEAttribute(osmWayEClass, OSM_WAY__VISIBLE);

		// Create enums
		osmMembertypeEEnum = createEEnum(OSM_MEMBERTYPE);

		// Create data types
		osmMembertypeObjectEDataType = createEDataType(OSM_MEMBERTYPE_OBJECT);
		osmRoleEDataType = createEDataType(OSM_ROLE);
		osmTagkeyEDataType = createEDataType(OSM_TAGKEY);
		osmTagvalueEDataType = createEDataType(OSM_TAGVALUE);
		osmUserEDataType = createEDataType(OSM_USER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Osm(), this.getOsmRoot(), null, "osm", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(osmBoundEClass, OsmBound.class, "OsmBound", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOsmBound_Box(), theXMLTypePackage.getString(), "box", null, 1, 1, OsmBound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOsmBound_Origin(), theXMLTypePackage.getString(), "origin", null, 1, 1, OsmBound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(osmMemberEClass, OsmMember.class, "OsmMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOsmMember_Ref(), theXMLTypePackage.getLong(), "ref", null, 1, 1, OsmMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOsmMember_Role(), this.getOsmRole(), "role", null, 0, 1, OsmMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOsmMember_Type(), this.getOsmMembertype(), "type", null, 1, 1, OsmMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(osmNdEClass, OsmNd.class, "OsmNd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOsmNd_Ref(), theXMLTypePackage.getLong(), "ref", null, 1, 1, OsmNd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(osmNodeEClass, OsmNode.class, "OsmNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOsmNode_Tag(), this.getOsmTag(), null, "tag", null, 0, -1, OsmNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOsmNode_Changeset(), theXMLTypePackage.getLong(), "changeset", null, 0, 1, OsmNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOsmNode_Id(), theXMLTypePackage.getLong(), "id", null, 1, 1, OsmNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOsmNode_Lat(), theXMLTypePackage.getDouble(), "lat", null, 1, 1, OsmNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOsmNode_Lon(), theXMLTypePackage.getDouble(), "lon", null, 1, 1, OsmNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOsmNode_Timestamp(), theXMLTypePackage.getDateTime(), "timestamp", null, 0, 1, OsmNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOsmNode_Uid(), theXMLTypePackage.getLong(), "uid", null, 0, 1, OsmNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOsmNode_User(), this.getOsmUser(), "user", null, 0, 1, OsmNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOsmNode_Version(), theXMLTypePackage.getInt(), "version", null, 0, 1, OsmNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOsmNode_Visible(), theXMLTypePackage.getBoolean(), "visible", null, 0, 1, OsmNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(osmRelationEClass, OsmRelation.class, "OsmRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOsmRelation_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, OsmRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsmRelation_Tag(), this.getOsmTag(), null, "tag", null, 0, -1, OsmRelation.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOsmRelation_Member(), this.getOsmMember(), null, "member", null, 0, -1, OsmRelation.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getOsmRelation_Id(), theXMLTypePackage.getLong(), "id", null, 1, 1, OsmRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOsmRelation_Timestamp(), theXMLTypePackage.getDateTime(), "timestamp", null, 0, 1, OsmRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOsmRelation_User(), this.getOsmUser(), "user", null, 0, 1, OsmRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOsmRelation_Visible(), theXMLTypePackage.getBoolean(), "visible", null, 0, 1, OsmRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(osmRootEClass, OsmRoot.class, "OsmRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOsmRoot_Bound(), this.getOsmBound(), null, "bound", null, 0, 1, OsmRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOsmRoot_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, OsmRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsmRoot_Node(), this.getOsmNode(), null, "node", null, 0, -1, OsmRoot.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOsmRoot_Relation(), this.getOsmRelation(), null, "relation", null, 0, -1, OsmRoot.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOsmRoot_Way(), this.getOsmWay(), null, "way", null, 0, -1, OsmRoot.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getOsmRoot_Generator(), theXMLTypePackage.getString(), "generator", null, 1, 1, OsmRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOsmRoot_Version(), theXMLTypePackage.getDecimal(), "version", null, 1, 1, OsmRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(osmTagEClass, OsmTag.class, "OsmTag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOsmTag_K(), this.getOsmTagkey(), "k", null, 1, 1, OsmTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOsmTag_V(), this.getOsmTagvalue(), "v", null, 1, 1, OsmTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(osmWayEClass, OsmWay.class, "OsmWay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOsmWay_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, OsmWay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsmWay_Tag(), this.getOsmTag(), null, "tag", null, 0, -1, OsmWay.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOsmWay_Nd(), this.getOsmNd(), null, "nd", null, 0, -1, OsmWay.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getOsmWay_Id(), theXMLTypePackage.getLong(), "id", null, 1, 1, OsmWay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOsmWay_Timestamp(), theXMLTypePackage.getDateTime(), "timestamp", null, 0, 1, OsmWay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOsmWay_User(), this.getOsmUser(), "user", null, 0, 1, OsmWay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOsmWay_Visible(), theXMLTypePackage.getBoolean(), "visible", null, 0, 1, OsmWay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(osmMembertypeEEnum, OsmMembertype.class, "OsmMembertype");
		addEEnumLiteral(osmMembertypeEEnum, OsmMembertype.WAY);
		addEEnumLiteral(osmMembertypeEEnum, OsmMembertype.NODE);
		addEEnumLiteral(osmMembertypeEEnum, OsmMembertype.RELATION);

		// Initialize data types
		initEDataType(osmMembertypeObjectEDataType, OsmMembertype.class, "OsmMembertypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(osmRoleEDataType, String.class, "OsmRole", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(osmTagkeyEDataType, String.class, "OsmTagkey", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(osmTagvalueEDataType, String.class, "OsmTagvalue", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(osmUserEDataType, String.class, "OsmUser", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "qualified", "false"
		   });		
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });		
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });		
		addAnnotation
		  (getDocumentRoot_Osm(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "osm",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (osmBoundEClass, 
		   source, 
		   new String[] {
			 "name", "osm_bound",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getOsmBound_Box(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "box",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getOsmBound_Origin(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "origin",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (osmMemberEClass, 
		   source, 
		   new String[] {
			 "name", "osm_member",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getOsmMember_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getOsmMember_Role(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "role",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getOsmMember_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (osmMembertypeEEnum, 
		   source, 
		   new String[] {
			 "name", "osm_membertype"
		   });		
		addAnnotation
		  (osmMembertypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "osm_membertype:Object",
			 "baseType", "osm_membertype"
		   });		
		addAnnotation
		  (osmNdEClass, 
		   source, 
		   new String[] {
			 "name", "osm_nd",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getOsmNd_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (osmNodeEClass, 
		   source, 
		   new String[] {
			 "name", "osm_node",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getOsmNode_Tag(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tag",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getOsmNode_Changeset(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "changeset",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getOsmNode_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getOsmNode_Lat(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "lat",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getOsmNode_Lon(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "lon",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getOsmNode_Timestamp(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "timestamp",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getOsmNode_Uid(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "uid",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getOsmNode_User(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "user",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getOsmNode_Version(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getOsmNode_Visible(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "visible",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (osmRelationEClass, 
		   source, 
		   new String[] {
			 "name", "osm_relation",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getOsmRelation_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getOsmRelation_Tag(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tag",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getOsmRelation_Member(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "member",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getOsmRelation_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getOsmRelation_Timestamp(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "timestamp",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getOsmRelation_User(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "user",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getOsmRelation_Visible(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "visible",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (osmRoleEDataType, 
		   source, 
		   new String[] {
			 "name", "osm_role",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "minLength", "1",
			 "maxLength", "250"
		   });		
		addAnnotation
		  (osmRootEClass, 
		   source, 
		   new String[] {
			 "name", "osm_root",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getOsmRoot_Bound(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "bound",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getOsmRoot_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:1"
		   });		
		addAnnotation
		  (getOsmRoot_Node(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "node",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
		   });		
		addAnnotation
		  (getOsmRoot_Relation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "relation",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
		   });		
		addAnnotation
		  (getOsmRoot_Way(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "way",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
		   });		
		addAnnotation
		  (getOsmRoot_Generator(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "generator",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getOsmRoot_Version(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (osmTagEClass, 
		   source, 
		   new String[] {
			 "name", "osm_tag",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getOsmTag_K(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "k",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getOsmTag_V(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "v",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (osmTagkeyEDataType, 
		   source, 
		   new String[] {
			 "name", "osm_tagkey",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "minLength", "1",
			 "maxLength", "250"
		   });		
		addAnnotation
		  (osmTagvalueEDataType, 
		   source, 
		   new String[] {
			 "name", "osm_tagvalue",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "minLength", "0",
			 "maxLength", "3000"
		   });		
		addAnnotation
		  (osmUserEDataType, 
		   source, 
		   new String[] {
			 "name", "osm_user",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "minLength", "1",
			 "maxLength", "100"
		   });		
		addAnnotation
		  (osmWayEClass, 
		   source, 
		   new String[] {
			 "name", "osm_way",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getOsmWay_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getOsmWay_Tag(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tag",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getOsmWay_Nd(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "nd",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getOsmWay_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getOsmWay_Timestamp(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "timestamp",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getOsmWay_User(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "user",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getOsmWay_Visible(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "visible",
			 "namespace", "##targetNamespace"
		   });
	}

} //OsmPackageImpl
