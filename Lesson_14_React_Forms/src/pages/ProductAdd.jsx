import React from "react";
import { Formik, Form } from "formik";
import { Button} from "semantic-ui-react";
import * as Yup from "yup";
import KodlamaIoTextInput from "../utilities/customFormControls/KodlamaIoTextInput";

export default function ProductAdd() {
  const initialValues = { productName: "", unitPrice: 10 }; //formun baslangic deyerleri
  const schema = Yup.object({
    productName: Yup.string().required("Required Product"),
    unitPrice: Yup.number().required("Required Unit Price"),
  });

  return (
    <Formik
      initialValues={initialValues}
      validationSchema={schema}
      onSubmit={(values) => console.log(values)}
    >
      <Form className="ui form">

        <KodlamaIoTextInput name="productName" placeholder="Product Name"/>
        <KodlamaIoTextInput name="unitPrice" placeholder="Unit Price"/>

        <Button color="green" type="submit">
          Add Product
        </Button>
      </Form>
    </Formik>
  );
}
